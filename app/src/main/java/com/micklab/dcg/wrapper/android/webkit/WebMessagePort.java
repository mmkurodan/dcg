// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebMessagePort {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebMessagePort(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebMessagePort wrap(android.webkit.WebMessagePort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebMessagePort(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebMessagePort getReal() {
        return (android.webkit.WebMessagePort) real;
    }

    public android.webkit.WebMessagePort unwrap() {
        return getReal();
    }

    public void close() {
        ((android.webkit.WebMessagePort) real).close();
    }

    public void postMessage(com.micklab.dcg.wrapper.android.webkit.WebMessage arg0) {
        ((android.webkit.WebMessagePort) real).postMessage(arg0 == null ? null : arg0.getReal());
    }

    public void setWebMessageCallback(com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback arg0) {
        ((android.webkit.WebMessagePort) real).setWebMessageCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setWebMessageCallback(com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.webkit.WebMessagePort) real).setWebMessageCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class WebMessageCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WebMessageCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback wrap(android.webkit.WebMessagePort.WebMessageCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebMessagePort.WebMessageCallback getReal() {
            return (android.webkit.WebMessagePort.WebMessageCallback) real;
        }

        public android.webkit.WebMessagePort.WebMessageCallback unwrap() {
            return getReal();
        }

        public void onMessage(com.micklab.dcg.wrapper.android.webkit.WebMessagePort arg0, com.micklab.dcg.wrapper.android.webkit.WebMessage arg1) {
            ((android.webkit.WebMessagePort.WebMessageCallback) real).onMessage(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
