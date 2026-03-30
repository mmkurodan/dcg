// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class TracingController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TracingController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.TracingController wrap(android.webkit.TracingController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.TracingController(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.TracingController getReal() {
        return (android.webkit.TracingController) real;
    }

    public android.webkit.TracingController unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.webkit.TracingController getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.TracingController.wrap(android.webkit.TracingController.getInstance());
    }

    public boolean isTracing() {
        return ((android.webkit.TracingController) real).isTracing();
    }

    public void start(com.micklab.dcg.wrapper.android.webkit.TracingConfig arg0) {
        ((android.webkit.TracingController) real).start(arg0 == null ? null : arg0.getReal());
    }

    public boolean stop(java.io.OutputStream arg0, java.util.concurrent.Executor arg1) {
        return ((android.webkit.TracingController) real).stop(arg0, arg1);
    }

}
