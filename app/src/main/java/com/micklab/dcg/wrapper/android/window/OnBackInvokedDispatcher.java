// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class OnBackInvokedDispatcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnBackInvokedDispatcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher wrap(android.window.OnBackInvokedDispatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher(real, (__DcgwBridgeToken) null);
    }

    public android.window.OnBackInvokedDispatcher getReal() {
        return (android.window.OnBackInvokedDispatcher) real;
    }

    public android.window.OnBackInvokedDispatcher unwrap() {
        return getReal();
    }

    public void registerOnBackInvokedCallback(int arg0, com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback arg1) {
        ((android.window.OnBackInvokedDispatcher) real).registerOnBackInvokedCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterOnBackInvokedCallback(com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback arg0) {
        ((android.window.OnBackInvokedDispatcher) real).unregisterOnBackInvokedCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int PRIORITY_DEFAULT = android.window.OnBackInvokedDispatcher.PRIORITY_DEFAULT;
    public static final int PRIORITY_OVERLAY = android.window.OnBackInvokedDispatcher.PRIORITY_OVERLAY;
    public static final int PRIORITY_SYSTEM_NAVIGATION_OBSERVER = android.window.OnBackInvokedDispatcher.PRIORITY_SYSTEM_NAVIGATION_OBSERVER;

}
