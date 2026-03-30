// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class HeaderBlock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HeaderBlock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.HeaderBlock wrap(android.net.http.HeaderBlock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.HeaderBlock(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.HeaderBlock getReal() {
        return (android.net.http.HeaderBlock) real;
    }

    public android.net.http.HeaderBlock unwrap() {
        return getReal();
    }

}
