// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageTextContent {
    private final android.graphics.pdf.content.PdfPageTextContent real;

    public PdfPageTextContent(android.graphics.pdf.content.PdfPageTextContent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageTextContent wrap(android.graphics.pdf.content.PdfPageTextContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageTextContent(real);
    }

    public android.graphics.pdf.content.PdfPageTextContent unwrap() {
        return real;
    }

    public PdfPageTextContent(java.lang.String arg0) {
        this(new android.graphics.pdf.content.PdfPageTextContent(arg0));
    }

    public PdfPageTextContent(java.lang.String arg0, java.util.List arg1) {
        this(new android.graphics.pdf.content.PdfPageTextContent(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
