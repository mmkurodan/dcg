// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class UnsupportedSchemeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnsupportedSchemeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.UnsupportedSchemeException wrap(android.media.UnsupportedSchemeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.UnsupportedSchemeException(real, (__DcgwBridgeToken) null);
    }

    public android.media.UnsupportedSchemeException getReal() {
        return (android.media.UnsupportedSchemeException) real;
    }

    public android.media.UnsupportedSchemeException unwrap() {
        return getReal();
    }

    public UnsupportedSchemeException(java.lang.String arg0) {
        this(new android.media.UnsupportedSchemeException(arg0), (__DcgwBridgeToken) null);
    }

}
