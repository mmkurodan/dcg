// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class NotProvisionedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NotProvisionedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.NotProvisionedException wrap(android.media.NotProvisionedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.NotProvisionedException(real, (__DcgwBridgeToken) null);
    }

    public android.media.NotProvisionedException getReal() {
        return (android.media.NotProvisionedException) real;
    }

    public android.media.NotProvisionedException unwrap() {
        return getReal();
    }

    public NotProvisionedException(java.lang.String arg0) {
        this(new android.media.NotProvisionedException(arg0), (__DcgwBridgeToken) null);
    }

}
