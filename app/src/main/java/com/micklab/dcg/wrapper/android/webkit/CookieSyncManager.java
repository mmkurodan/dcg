// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class CookieSyncManager {
    private final android.webkit.CookieSyncManager real;

    public CookieSyncManager(android.webkit.CookieSyncManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieSyncManager wrap(android.webkit.CookieSyncManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.CookieSyncManager(real);
    }

    public android.webkit.CookieSyncManager unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieSyncManager createInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.webkit.CookieSyncManager.wrap(android.webkit.CookieSyncManager.createInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.webkit.CookieSyncManager getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.CookieSyncManager.wrap(android.webkit.CookieSyncManager.getInstance());
    }

    public void resetSync() {
        real.resetSync();
    }

    public void run() {
        real.run();
    }

    public void startSync() {
        real.startSync();
    }

    public void stopSync() {
        real.stopSync();
    }

    public void sync() {
        real.sync();
    }

}
