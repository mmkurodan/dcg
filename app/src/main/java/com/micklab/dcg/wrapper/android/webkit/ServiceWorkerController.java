// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ServiceWorkerController {
    private final android.webkit.ServiceWorkerController real;

    public ServiceWorkerController(android.webkit.ServiceWorkerController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController wrap(android.webkit.ServiceWorkerController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController(real);
    }

    public android.webkit.ServiceWorkerController unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.ServiceWorkerController.wrap(android.webkit.ServiceWorkerController.getInstance());
    }

    public com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings getServiceWorkerWebSettings() {
        return com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings.wrap(real.getServiceWorkerWebSettings());
    }

    public void setServiceWorkerClient(com.micklab.dcg.wrapper.android.webkit.ServiceWorkerClient arg0) {
        real.setServiceWorkerClient(arg0 == null ? null : arg0.unwrap());
    }

}
