// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebMessagePort {
    private final android.webkit.WebMessagePort real;

    public WebMessagePort(android.webkit.WebMessagePort real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebMessagePort wrap(android.webkit.WebMessagePort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebMessagePort(real);
    }

    public android.webkit.WebMessagePort unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public void postMessage(com.micklab.dcg.wrapper.android.webkit.WebMessage arg0) {
        real.postMessage(arg0 == null ? null : arg0.unwrap());
    }

    public void setWebMessageCallback(com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback arg0) {
        real.setWebMessageCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setWebMessageCallback(com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setWebMessageCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class WebMessageCallback {
        private final android.webkit.WebMessagePort.WebMessageCallback real;

        public WebMessageCallback(android.webkit.WebMessagePort.WebMessageCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback wrap(android.webkit.WebMessagePort.WebMessageCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebMessagePort.WebMessageCallback(real);
        }

        public android.webkit.WebMessagePort.WebMessageCallback unwrap() {
            return real;
        }

        public void onMessage(com.micklab.dcg.wrapper.android.webkit.WebMessagePort arg0, com.micklab.dcg.wrapper.android.webkit.WebMessage arg1) {
            real.onMessage(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
