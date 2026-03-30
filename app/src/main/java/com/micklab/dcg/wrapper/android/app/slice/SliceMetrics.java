// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.slice;

public final class SliceMetrics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SliceMetrics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.slice.SliceMetrics wrap(android.app.slice.SliceMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.slice.SliceMetrics(real, (__DcgwBridgeToken) null);
    }

    public android.app.slice.SliceMetrics getReal() {
        return (android.app.slice.SliceMetrics) real;
    }

    public android.app.slice.SliceMetrics unwrap() {
        return getReal();
    }

    public SliceMetrics(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.app.slice.SliceMetrics(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void logHidden() {
        ((android.app.slice.SliceMetrics) real).logHidden();
    }

    public void logTouch(int arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.app.slice.SliceMetrics) real).logTouch(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void logVisible() {
        ((android.app.slice.SliceMetrics) real).logVisible();
    }

}
