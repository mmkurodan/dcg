// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models.selection;

public final class SelectionBoundary {
    private final android.graphics.pdf.models.selection.SelectionBoundary real;

    public SelectionBoundary(android.graphics.pdf.models.selection.SelectionBoundary real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary wrap(android.graphics.pdf.models.selection.SelectionBoundary real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary(real);
    }

    public android.graphics.pdf.models.selection.SelectionBoundary unwrap() {
        return real;
    }

    public SelectionBoundary(int arg0) {
        this(new android.graphics.pdf.models.selection.SelectionBoundary(arg0));
    }

    public SelectionBoundary(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        this(new android.graphics.pdf.models.selection.SelectionBoundary(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getIndex() {
        return real.getIndex();
    }

    public boolean getIsRtl() {
        return real.getIsRtl();
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPoint() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getPoint());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
