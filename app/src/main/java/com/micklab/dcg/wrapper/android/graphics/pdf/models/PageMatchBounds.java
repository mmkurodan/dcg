// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class PageMatchBounds {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PageMatchBounds(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.PageMatchBounds wrap(android.graphics.pdf.models.PageMatchBounds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.PageMatchBounds(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.models.PageMatchBounds getReal() {
        return (android.graphics.pdf.models.PageMatchBounds) real;
    }

    public android.graphics.pdf.models.PageMatchBounds unwrap() {
        return getReal();
    }

    public PageMatchBounds(java.util.List arg0, int arg1) {
        this(new android.graphics.pdf.models.PageMatchBounds(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.models.PageMatchBounds) real).describeContents();
    }

    public int getTextStartIndex() {
        return ((android.graphics.pdf.models.PageMatchBounds) real).getTextStartIndex();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.models.PageMatchBounds) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
