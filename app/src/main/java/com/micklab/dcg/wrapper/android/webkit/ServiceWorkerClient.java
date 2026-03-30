// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ServiceWorkerClient {
    private final android.webkit.ServiceWorkerClient real;

    public ServiceWorkerClient(android.webkit.ServiceWorkerClient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerClient wrap(android.webkit.ServiceWorkerClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ServiceWorkerClient(real);
    }

    public android.webkit.ServiceWorkerClient unwrap() {
        return real;
    }

    public ServiceWorkerClient() {
        this(new android.webkit.ServiceWorkerClient());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebResourceResponse shouldInterceptRequest(com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebResourceResponse.wrap(real.shouldInterceptRequest(arg0 == null ? null : arg0.unwrap()));
    }

}
