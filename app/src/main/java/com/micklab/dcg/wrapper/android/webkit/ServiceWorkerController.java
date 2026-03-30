// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ServiceWorkerController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceWorkerController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController wrap(android.webkit.ServiceWorkerController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.ServiceWorkerController getReal() {
        return (android.webkit.ServiceWorkerController) real;
    }

    public android.webkit.ServiceWorkerController unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController.wrap(android.webkit.ServiceWorkerController.getInstance());
    }

    public com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings getServiceWorkerWebSettings() {
        return com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings.wrap(((android.webkit.ServiceWorkerController) real).getServiceWorkerWebSettings());
    }

    public void setServiceWorkerClient(com.micklab.dcg.wrapper.android.webkit.ServiceWorkerClient arg0) {
        ((android.webkit.ServiceWorkerController) real).setServiceWorkerClient(arg0 == null ? null : arg0.getReal());
    }

}
