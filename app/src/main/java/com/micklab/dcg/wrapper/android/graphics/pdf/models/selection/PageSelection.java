// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models.selection;

public final class PageSelection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PageSelection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.PageSelection wrap(android.graphics.pdf.models.selection.PageSelection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.PageSelection(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.models.selection.PageSelection getReal() {
        return (android.graphics.pdf.models.selection.PageSelection) real;
    }

    public android.graphics.pdf.models.selection.PageSelection unwrap() {
        return getReal();
    }

    public PageSelection(int arg0, com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary arg1, com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary arg2, java.util.List arg3) {
        this(new android.graphics.pdf.models.selection.PageSelection(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.models.selection.PageSelection) real).describeContents();
    }

    public int getPage() {
        return ((android.graphics.pdf.models.selection.PageSelection) real).getPage();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary getStart() {
        return com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary.wrap(((android.graphics.pdf.models.selection.PageSelection) real).getStart());
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary getStop() {
        return com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary.wrap(((android.graphics.pdf.models.selection.PageSelection) real).getStop());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.models.selection.PageSelection) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
