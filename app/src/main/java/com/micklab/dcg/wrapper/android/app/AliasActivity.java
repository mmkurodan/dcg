// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AliasActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AliasActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AliasActivity wrap(android.app.AliasActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AliasActivity(real, (__DcgwBridgeToken) null);
    }

    public android.app.AliasActivity getReal() {
        return (android.app.AliasActivity) real;
    }

    public android.app.AliasActivity unwrap() {
        return getReal();
    }

    public AliasActivity() {
        this(new android.app.AliasActivity(), (__DcgwBridgeToken) null);
    }

}
