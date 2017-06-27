package com.github.kornilova_l.server.trees.accumulative_trees.incoming_calls;

import com.github.kornilova_l.protos.TreeProtos;

import java.util.ArrayList;
import java.util.List;

import static com.github.kornilova_l.server.trees.accumulative_trees.AccumulativeTreesHelper.setNodesOffsetRecursively;
import static com.github.kornilova_l.server.trees.accumulative_trees.AccumulativeTreesHelper.setTreeWidth;
import static com.github.kornilova_l.server.trees.accumulative_trees.AccumulativeTreesHelper.updateNodeList;

public class IncomingCallsBuilder {
    private static TreeProtos.Tree.Builder treeBuilder;
    private static int maxDepth = 0;

    public static TreeProtos.Tree buildCallers(TreeProtos.Tree outgoingCalls) {
        initTreeBuilder();
        for (TreeProtos.Tree.Node node : outgoingCalls.getBaseNode().getNodesList()) {
            traverseTree(node, 0);
        }
        setNodesOffsetRecursively(treeBuilder.getBaseNodeBuilder(), 0);
        setTreeWidth(treeBuilder);
        treeBuilder.setDepth(maxDepth);
        return treeBuilder.build();
    }

    private static void initTreeBuilder() {
        treeBuilder = TreeProtos.Tree.newBuilder()
                .setBaseNode(TreeProtos.Tree.Node.newBuilder());
    }

    private static List<TreeProtos.Tree.Node.Builder> traverseTree(TreeProtos.Tree.Node node, int depth) {
        depth++;
        if (depth > maxDepth) {
            maxDepth = depth;
        }
        ArrayList<TreeProtos.Tree.Node.Builder> arrayList = new ArrayList<>();
        if (node.getNodesCount() == 0) { // leaf
            arrayList.add(updateNodeList(treeBuilder.getBaseNodeBuilder(), node));
            return arrayList;
        } else {
            for (TreeProtos.Tree.Node childNode : node.getNodesList()) {
                for (TreeProtos.Tree.Node.Builder returnedNodeBuilder : traverseTree(childNode, depth)) {
                    long time = returnedNodeBuilder.getWidth();
                    arrayList.add(
                            updateNodeList(returnedNodeBuilder, node, time));
                }
            }
        }
        return arrayList;
    }

    public static TreeProtos.Tree buildCallers(TreeProtos.Tree outgoingCalls,
                                               String className,
                                               String methodName,
                                               String desc,
                                               boolean isStatic) {
        return null;
    }
}
