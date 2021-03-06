package com.github.kornilova_l.flamegraph.plugin.ui.config_dialog;

import com.github.kornilova_l.flamegraph.configuration.Configuration;
import com.github.kornilova_l.flamegraph.configuration.MethodConfig;
import com.github.kornilova_l.flamegraph.plugin.configuration.ConfigStorage;
import com.github.kornilova_l.flamegraph.plugin.ui.config_dialog.decorator_actions.AddNodeActionButton;
import com.github.kornilova_l.flamegraph.plugin.ui.config_dialog.decorator_actions.CopyAction;
import com.github.kornilova_l.flamegraph.plugin.ui.config_dialog.decorator_actions.RemoveNodeActionButton;
import com.github.kornilova_l.flamegraph.plugin.ui.config_dialog.export_import.ExportAction;
import com.github.kornilova_l.flamegraph.plugin.ui.config_dialog.export_import.ImportAction;
import com.github.kornilova_l.flamegraph.plugin.ui.line_markers.LineMarkersHolder;
import com.intellij.openapi.actionSystem.ActionToolbarPosition;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.ui.AnActionButton;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.uiDesigner.core.GridConstraints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ChangeConfigurationDialog extends DialogWrapper {
    @NotNull
    private final Project project;
    private Configuration trueConfiguration;
    private Configuration tempConfiguration;
    private ConfigCheckboxTree includedTree;
    private ConfigCheckboxTree excludedTree;

    public ChangeConfigurationDialog(@NotNull Project project) {
        super(project);
        this.project = project;

        setTitle("Profiler Configuration");
        setModal(false);
        init();
        setOKButtonText("Done");
    }

    @NotNull
    @Override
    protected Action[] createActions() {
        List<Action> actionList = new ArrayList<>();
        actionList.add(new ExportAction(tempConfiguration, project));
        actionList.add(new ImportAction(tempConfiguration, this));
        Collections.addAll(actionList, super.createActions());
        Action[] actions = new Action[actionList.size()];
        for (int i = 0; i < actionList.size(); i++) {
            actions[i] = actionList.get(i);
        }
        return actions;
    }

    public ConfigCheckboxTree getIncludedTree() {
        return includedTree;
    }

    public ConfigCheckboxTree getExcludedTree() {
        return excludedTree;
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        trueConfiguration = project.getComponent(ConfigStorage.class).getState();
        assert trueConfiguration != null;
        tempConfiguration = new Configuration(trueConfiguration);

        ConfigurationForm configurationForm = new ConfigurationForm();
        includedTree = new ConfigCheckboxTree(
                configurationForm.cardPanelIncluded,
                configurationForm.methodFormIncluded.excludedMethodForm,
                configurationForm.methodFormIncluded.saveReturnValueCheckBox,
                tempConfiguration.getIncludingMethodConfigs(),
                ConfigCheckboxTree.TreeType.INCLUDING
        );
        configurationForm.includingPanel.add(
                createCheckboxTreeView(includedTree,
                        tempConfiguration.getIncludingMethodConfigs()),
                new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false)
        );

        excludedTree = new ConfigCheckboxTree(
                configurationForm.cardPanelExcluded,
                configurationForm.methodFormExcluded,
                null,
                tempConfiguration.getExcludingMethodConfigs(),
                ConfigCheckboxTree.TreeType.EXCLUDING
        );
        configurationForm.excludingPanel.add(
                createCheckboxTreeView(excludedTree,
                        tempConfiguration.getExcludingMethodConfigs()),
                new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false)
        );

        return configurationForm.$$$getRootComponent$$$();
    }

    @Override
    protected void doOKAction() {
        trueConfiguration.assign(tempConfiguration);
        project.getComponent(LineMarkersHolder.class).updateOpenedDocuments();
        super.doOKAction();
    }

    private JComponent createCheckboxTreeView(ConfigCheckboxTree tree,
                                              List<MethodConfig> configs) {
        ToolbarDecorator decorator = ToolbarDecorator.createDecorator(tree);
        decorator.setToolbarPosition(ActionToolbarPosition.RIGHT);
        decorator.setAddAction(new AddNodeActionButton(tree, tempConfiguration, project));
        decorator.setRemoveAction(new RemoveNodeActionButton(tree));
        decorator.addExtraAction(AnActionButton.fromAction(new CopyAction(tree)));
        JPanel panel = decorator.createPanel();
        tree.initTree(configs);
        initValidation();
        return panel;
    }

    @NotNull
    @Override
    protected List<ValidationInfo> doValidateAll() {
        List<ValidationInfo> validationInfos = new LinkedList<>();
        if (includedTree != null && excludedTree != null) {
            List<ValidationInfo> list = includedTree.validateInfo();
            if (list.size() != 0) {
                includedTree.nodeWithBadValidation = includedTree.getSelectedNode();
            } else {
                includedTree.nodeWithBadValidation = null;
            }
            validationInfos.addAll(list);
            list = excludedTree.validateInfo();
            if (list.size() != 0) {
                excludedTree.nodeWithBadValidation = excludedTree.getSelectedNode();
            } else {
                excludedTree.nodeWithBadValidation = null;
            }
            validationInfos.addAll(list);
        }
        return validationInfos;
    }

    /**
     * For test
     */
    Configuration getTempConfiguration() {
        return tempConfiguration;
    }

    /**
     * For test
     */
    Configuration getTrueConfiguration() {
        return trueConfiguration;
    }
}
