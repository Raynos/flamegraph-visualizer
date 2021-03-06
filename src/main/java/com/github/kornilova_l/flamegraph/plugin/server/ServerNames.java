package com.github.kornilova_l.flamegraph.plugin.server;

import java.util.regex.Pattern;

public class ServerNames {
    private static final String NAME = "flamegraph-profiler";
    static final String MAIN_NAME = "/" + NAME;
    static final String FILE_LIST = MAIN_NAME + "/file-list";
    static final String CALL_TREE = MAIN_NAME + "/call-tree";
    static final String LIST_PROJECTS = MAIN_NAME + "/list-projects";
    public static final String CALL_TREE_JS_REQUEST = MAIN_NAME + "/trees/call-tree";
    static final String CALL_TREE_COUNT = CALL_TREE_JS_REQUEST + "/count";
    public static final String CALL_TREE_PREVIEW_JS_REQUEST = CALL_TREE_JS_REQUEST + "/preview";
    static final String OUTGOING_CALLS = MAIN_NAME + "/outgoing-calls";
    static final String OUTGOING_CALLS_JS_REQUEST = MAIN_NAME + "/trees/outgoing-calls";
    static final String OUTGOING_CALLS_COUNT = OUTGOING_CALLS_JS_REQUEST + "/count";
    static final String INCOMING_CALLS = MAIN_NAME + "/incoming-calls";
    static final String INCOMING_CALLS_JS_REQUEST = MAIN_NAME + "/trees/incoming-calls";
    static final String INCOMING_CALLS_COUNT = INCOMING_CALLS_JS_REQUEST + "/count";
    static final String CONNECTION_ALIVE = MAIN_NAME + "/trees/alive";
    static final String HOT_SPOTS = MAIN_NAME + "/hot-spots";
    static final String HOT_SPOTS_JS_REQUEST = MAIN_NAME + "/hot-spots-json";
    static final String UPLOAD_FILE = MAIN_NAME + "/upload-file";
    static final String DOES_FILE_EXIST = MAIN_NAME + "/does-file-exist";
    static final String DELETE_FILE = MAIN_NAME + "/delete-file";
    static final String UNDO_DELETE_FILE = MAIN_NAME + "/undo-delete-file";
    static final Pattern CSS_PATTERN = Pattern.compile(MAIN_NAME + "/css.+css$");
    static final Pattern JS_PATTERN = Pattern.compile(MAIN_NAME + "/js.+js$");
    static final Pattern FONT_PATTERN = Pattern.compile(MAIN_NAME + "/.+ttf$");
    static final Pattern PNG_PATTERN = Pattern.compile(MAIN_NAME + "/.+png$");
}
