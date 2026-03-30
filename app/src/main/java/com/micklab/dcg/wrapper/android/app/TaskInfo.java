// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class TaskInfo {
    private final android.app.TaskInfo real;

    public TaskInfo(android.app.TaskInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.TaskInfo wrap(android.app.TaskInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.TaskInfo(real);
    }

    public android.app.TaskInfo unwrap() {
        return real;
    }

    public boolean isVisible() {
        return real.isVisible();
    }

    public java.lang.String toString() {
        return real.toString();
    }


}
