// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SystemOnBackInvokedCallbacks {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SystemOnBackInvokedCallbacks(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SystemOnBackInvokedCallbacks wrap(android.window.SystemOnBackInvokedCallbacks real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SystemOnBackInvokedCallbacks(real, (__DcgwBridgeToken) null);
    }

    public android.window.SystemOnBackInvokedCallbacks getReal() {
        return (android.window.SystemOnBackInvokedCallbacks) real;
    }

    public android.window.SystemOnBackInvokedCallbacks unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback finishAndRemoveTaskCallback(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback.wrap(android.window.SystemOnBackInvokedCallbacks.finishAndRemoveTaskCallback(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback moveTaskToBackCallback(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback.wrap(android.window.SystemOnBackInvokedCallbacks.moveTaskToBackCallback(arg0 == null ? null : arg0.getReal()));
    }

}
