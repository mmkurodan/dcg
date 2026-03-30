// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class OnBackInvokedDispatcher {
    private final android.window.OnBackInvokedDispatcher real;

    public OnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher wrap(android.window.OnBackInvokedDispatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.OnBackInvokedDispatcher(real);
    }

    public android.window.OnBackInvokedDispatcher unwrap() {
        return real;
    }

    public void registerOnBackInvokedCallback(int arg0, com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback arg1) {
        real.registerOnBackInvokedCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterOnBackInvokedCallback(com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback arg0) {
        real.unregisterOnBackInvokedCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final int PRIORITY_DEFAULT = android.window.OnBackInvokedDispatcher.PRIORITY_DEFAULT;
    public static final int PRIORITY_OVERLAY = android.window.OnBackInvokedDispatcher.PRIORITY_OVERLAY;

}
