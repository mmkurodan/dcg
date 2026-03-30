// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class PageMatchBounds {
    private final android.graphics.pdf.models.PageMatchBounds real;

    public PageMatchBounds(android.graphics.pdf.models.PageMatchBounds real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.PageMatchBounds wrap(android.graphics.pdf.models.PageMatchBounds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.PageMatchBounds(real);
    }

    public android.graphics.pdf.models.PageMatchBounds unwrap() {
        return real;
    }

    public PageMatchBounds(java.util.List arg0, int arg1) {
        this(new android.graphics.pdf.models.PageMatchBounds(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getTextStartIndex() {
        return real.getTextStartIndex();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
