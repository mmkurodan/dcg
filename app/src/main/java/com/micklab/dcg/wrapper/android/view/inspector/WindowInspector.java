// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class WindowInspector {
    private final android.view.inspector.WindowInspector real;

    public WindowInspector(android.view.inspector.WindowInspector real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.WindowInspector wrap(android.view.inspector.WindowInspector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.WindowInspector(real);
    }

    public android.view.inspector.WindowInspector unwrap() {
        return real;
    }

}
