// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TaskInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TaskInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TaskInfo wrap(android.app.TaskInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TaskInfo(real, (__DcgwBridgeToken) null);
    }

    public android.app.TaskInfo getReal() {
        return (android.app.TaskInfo) real;
    }

    public android.app.TaskInfo unwrap() {
        return getReal();
    }

    public boolean isVisible() {
        return ((android.app.TaskInfo) real).isVisible();
    }

    public java.lang.String toString() {
        return ((android.app.TaskInfo) real).toString();
    }


}
