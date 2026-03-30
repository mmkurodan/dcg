// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ServiceWorkerClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceWorkerClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerClient wrap(android.webkit.ServiceWorkerClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ServiceWorkerClient(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.ServiceWorkerClient getReal() {
        return (android.webkit.ServiceWorkerClient) real;
    }

    public android.webkit.ServiceWorkerClient unwrap() {
        return getReal();
    }

    public ServiceWorkerClient() {
        this(new android.webkit.ServiceWorkerClient(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.webkit.WebResourceResponse shouldInterceptRequest(com.micklab.dcg.wrapper.android.webkit.WebResourceRequest arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebResourceResponse.wrap(((android.webkit.ServiceWorkerClient) real).shouldInterceptRequest(arg0 == null ? null : arg0.getReal()));
    }

}
