// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class FontRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FontRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.FontRequest wrap(android.provider.FontRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.FontRequest(real, (__DcgwBridgeToken) null);
    }

    public android.provider.FontRequest getReal() {
        return (android.provider.FontRequest) real;
    }

    public android.provider.FontRequest unwrap() {
        return getReal();
    }

    public FontRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        this(new android.provider.FontRequest(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public FontRequest(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.util.List arg3) {
        this(new android.provider.FontRequest(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.String getProviderAuthority() {
        return ((android.provider.FontRequest) real).getProviderAuthority();
    }

    public java.lang.String getProviderPackage() {
        return ((android.provider.FontRequest) real).getProviderPackage();
    }

    public java.lang.String getQuery() {
        return ((android.provider.FontRequest) real).getQuery();
    }

    public java.lang.String toString() {
        return ((android.provider.FontRequest) real).toString();
    }

}
