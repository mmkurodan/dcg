// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ServiceWorkerWebSettings {
    private final android.webkit.ServiceWorkerWebSettings real;

    public ServiceWorkerWebSettings(android.webkit.ServiceWorkerWebSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings wrap(android.webkit.ServiceWorkerWebSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ServiceWorkerWebSettings(real);
    }

    public android.webkit.ServiceWorkerWebSettings unwrap() {
        return real;
    }

    public boolean getAllowContentAccess() {
        return real.getAllowContentAccess();
    }

    public boolean getAllowFileAccess() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#getAllowFileAccess()");
    }

    public boolean getBlockNetworkLoads() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#getBlockNetworkLoads()");
    }

    public int getCacheMode() {
        return real.getCacheMode();
    }

    public void setAllowContentAccess(boolean arg0) {
        real.setAllowContentAccess(arg0);
    }

    public void setAllowFileAccess(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#setAllowFileAccess(boolean)");
    }

    public void setBlockNetworkLoads(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.ServiceWorkerWebSettings#setBlockNetworkLoads(boolean)");
    }

    public void setCacheMode(int arg0) {
        real.setCacheMode(arg0);
    }

}
