// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageImageContent {
    private final android.graphics.pdf.content.PdfPageImageContent real;

    public PdfPageImageContent(android.graphics.pdf.content.PdfPageImageContent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageImageContent wrap(android.graphics.pdf.content.PdfPageImageContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageImageContent(real);
    }

    public android.graphics.pdf.content.PdfPageImageContent unwrap() {
        return real;
    }

    public PdfPageImageContent(java.lang.String arg0) {
        this(new android.graphics.pdf.content.PdfPageImageContent(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getAltText() {
        return real.getAltText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
