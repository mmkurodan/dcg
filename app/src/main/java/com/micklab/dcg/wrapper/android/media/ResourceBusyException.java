// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ResourceBusyException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ResourceBusyException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ResourceBusyException wrap(android.media.ResourceBusyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ResourceBusyException(real, (__DcgwBridgeToken) null);
    }

    public android.media.ResourceBusyException getReal() {
        return (android.media.ResourceBusyException) real;
    }

    public android.media.ResourceBusyException unwrap() {
        return getReal();
    }

    public ResourceBusyException(java.lang.String arg0) {
        this(new android.media.ResourceBusyException(arg0), (__DcgwBridgeToken) null);
    }

}
