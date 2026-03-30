// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ServiceWorkerWebSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceWorkerWebSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings wrap(android.webkit.ServiceWorkerWebSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.ServiceWorkerWebSettings getReal() {
        return (android.webkit.ServiceWorkerWebSettings) real;
    }

    public android.webkit.ServiceWorkerWebSettings unwrap() {
        return getReal();
    }

    public boolean getAllowContentAccess() {
        return ((android.webkit.ServiceWorkerWebSettings) real).getAllowContentAccess();
    }

    public boolean getAllowFileAccess() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#getAllowFileAccess()");
    }

    public boolean getBlockNetworkLoads() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#getBlockNetworkLoads()");
    }

    public int getCacheMode() {
        return ((android.webkit.ServiceWorkerWebSettings) real).getCacheMode();
    }

    public void setAllowContentAccess(boolean arg0) {
        ((android.webkit.ServiceWorkerWebSettings) real).setAllowContentAccess(arg0);
    }

    public void setAllowFileAccess(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#setAllowFileAccess(boolean)");
    }

    public void setBlockNetworkLoads(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#setBlockNetworkLoads(boolean)");
    }

    public void setCacheMode(int arg0) {
        ((android.webkit.ServiceWorkerWebSettings) real).setCacheMode(arg0);
    }

}
