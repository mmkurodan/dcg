// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class DeniedByServerException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeniedByServerException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.DeniedByServerException wrap(android.media.DeniedByServerException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.DeniedByServerException(real, (__DcgwBridgeToken) null);
    }

    public android.media.DeniedByServerException getReal() {
        return (android.media.DeniedByServerException) real;
    }

    public android.media.DeniedByServerException unwrap() {
        return getReal();
    }

    public DeniedByServerException(java.lang.String arg0) {
        this(new android.media.DeniedByServerException(arg0), (__DcgwBridgeToken) null);
    }

}
