// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inspector;

public final class WindowInspector {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowInspector(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inspector.WindowInspector wrap(android.view.inspector.WindowInspector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inspector.WindowInspector(real, (__DcgwBridgeToken) null);
    }

    public android.view.inspector.WindowInspector getReal() {
        return (android.view.inspector.WindowInspector) real;
    }

    public android.view.inspector.WindowInspector unwrap() {
        return getReal();
    }

}
