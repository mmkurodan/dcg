// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models.selection;

public final class SelectionBoundary {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SelectionBoundary(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary wrap(android.graphics.pdf.models.selection.SelectionBoundary real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.models.selection.SelectionBoundary getReal() {
        return (android.graphics.pdf.models.selection.SelectionBoundary) real;
    }

    public android.graphics.pdf.models.selection.SelectionBoundary unwrap() {
        return getReal();
    }

    public SelectionBoundary(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        this(new android.graphics.pdf.models.selection.SelectionBoundary(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SelectionBoundary(int arg0) {
        this(new android.graphics.pdf.models.selection.SelectionBoundary(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.models.selection.SelectionBoundary) real).describeContents();
    }

    public int getIndex() {
        return ((android.graphics.pdf.models.selection.SelectionBoundary) real).getIndex();
    }

    public boolean getIsRtl() {
        return ((android.graphics.pdf.models.selection.SelectionBoundary) real).getIsRtl();
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPoint() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.graphics.pdf.models.selection.SelectionBoundary) real).getPoint());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.models.selection.SelectionBoundary) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
