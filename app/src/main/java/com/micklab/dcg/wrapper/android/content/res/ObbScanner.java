// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class ObbScanner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ObbScanner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.ObbScanner wrap(android.content.res.ObbScanner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.ObbScanner(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.ObbScanner getReal() {
        return (android.content.res.ObbScanner) real;
    }

    public android.content.res.ObbScanner unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.content.res.ObbInfo getObbInfo(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.content.res.ObbInfo.wrap(android.content.res.ObbScanner.getObbInfo(arg0));
    }

}
