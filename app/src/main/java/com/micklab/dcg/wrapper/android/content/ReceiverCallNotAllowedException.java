// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ReceiverCallNotAllowedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReceiverCallNotAllowedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ReceiverCallNotAllowedException wrap(android.content.ReceiverCallNotAllowedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ReceiverCallNotAllowedException(real, (__DcgwBridgeToken) null);
    }

    public android.content.ReceiverCallNotAllowedException getReal() {
        return (android.content.ReceiverCallNotAllowedException) real;
    }

    public android.content.ReceiverCallNotAllowedException unwrap() {
        return getReal();
    }

    public ReceiverCallNotAllowedException(java.lang.String arg0) {
        this(new android.content.ReceiverCallNotAllowedException(arg0), (__DcgwBridgeToken) null);
    }

}
