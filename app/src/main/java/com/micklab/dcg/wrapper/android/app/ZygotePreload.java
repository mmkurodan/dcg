// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ZygotePreload {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ZygotePreload(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ZygotePreload wrap(android.app.ZygotePreload real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ZygotePreload(real, (__DcgwBridgeToken) null);
    }

    public android.app.ZygotePreload getReal() {
        return (android.app.ZygotePreload) real;
    }

    public android.app.ZygotePreload unwrap() {
        return getReal();
    }

    public void doPreload(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) {
        ((android.app.ZygotePreload) real).doPreload(arg0 == null ? null : arg0.getReal());
    }

}
