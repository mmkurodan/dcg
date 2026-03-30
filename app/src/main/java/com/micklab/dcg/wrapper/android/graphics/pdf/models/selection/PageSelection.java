// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models.selection;

public final class PageSelection {
    private final android.graphics.pdf.models.selection.PageSelection real;

    public PageSelection(android.graphics.pdf.models.selection.PageSelection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.PageSelection wrap(android.graphics.pdf.models.selection.PageSelection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.PageSelection(real);
    }

    public android.graphics.pdf.models.selection.PageSelection unwrap() {
        return real;
    }

    public PageSelection(int arg0, com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary arg1, com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary arg2, java.util.List arg3) {
        this(new android.graphics.pdf.models.selection.PageSelection(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getPage() {
        return real.getPage();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary getStart() {
        return com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary.wrap(real.getStart());
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary getStop() {
        return com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary.wrap(real.getStop());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
