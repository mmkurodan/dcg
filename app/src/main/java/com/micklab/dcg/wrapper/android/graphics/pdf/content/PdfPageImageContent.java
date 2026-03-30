// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageImageContent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfPageImageContent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageImageContent wrap(android.graphics.pdf.content.PdfPageImageContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageImageContent(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.content.PdfPageImageContent getReal() {
        return (android.graphics.pdf.content.PdfPageImageContent) real;
    }

    public android.graphics.pdf.content.PdfPageImageContent unwrap() {
        return getReal();
    }

    public PdfPageImageContent(java.lang.String arg0) {
        this(new android.graphics.pdf.content.PdfPageImageContent(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.content.PdfPageImageContent) real).describeContents();
    }

    public java.lang.String getAltText() {
        return ((android.graphics.pdf.content.PdfPageImageContent) real).getAltText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.content.PdfPageImageContent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
