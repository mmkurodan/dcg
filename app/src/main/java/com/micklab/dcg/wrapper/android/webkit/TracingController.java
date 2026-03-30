// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class TracingController {
    private final android.webkit.TracingController real;

    public TracingController(android.webkit.TracingController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.TracingController wrap(android.webkit.TracingController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.TracingController(real);
    }

    public android.webkit.TracingController unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.TracingController getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.TracingController.wrap(android.webkit.TracingController.getInstance());
    }

    public boolean isTracing() {
        return real.isTracing();
    }

    public void start(com.micklab.dcg.wrapper.android.webkit.TracingConfig arg0) {
        real.start(arg0 == null ? null : arg0.unwrap());
    }

    public boolean stop(java.io.OutputStream arg0, java.util.concurrent.Executor arg1) {
        return real.stop(arg0, arg1);
    }

}
