// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class CookieSyncManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CookieSyncManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieSyncManager wrap(android.webkit.CookieSyncManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.CookieSyncManager(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.CookieSyncManager getReal() {
        return (android.webkit.CookieSyncManager) real;
    }

    public android.webkit.CookieSyncManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieSyncManager createInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.webkit.CookieSyncManager.wrap(android.webkit.CookieSyncManager.createInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieSyncManager getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.CookieSyncManager.wrap(android.webkit.CookieSyncManager.getInstance());
    }

    public void resetSync() {
        ((android.webkit.CookieSyncManager) real).resetSync();
    }

    public void run() {
        ((android.webkit.CookieSyncManager) real).run();
    }

    public void startSync() {
        ((android.webkit.CookieSyncManager) real).startSync();
    }

    public void stopSync() {
        ((android.webkit.CookieSyncManager) real).stopSync();
    }

    public void sync() {
        ((android.webkit.CookieSyncManager) real).sync();
    }

}
