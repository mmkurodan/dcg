// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class ParcelableSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParcelableSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.ParcelableSpan wrap(android.text.ParcelableSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.ParcelableSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.ParcelableSpan getReal() {
        return (android.text.ParcelableSpan) real;
    }

    public android.text.ParcelableSpan unwrap() {
        return getReal();
    }

    public int getSpanTypeId() {
        return ((android.text.ParcelableSpan) real).getSpanTypeId();
    }

}
