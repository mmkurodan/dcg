// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageTextContent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfPageTextContent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageTextContent wrap(android.graphics.pdf.content.PdfPageTextContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageTextContent(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.content.PdfPageTextContent getReal() {
        return (android.graphics.pdf.content.PdfPageTextContent) real;
    }

    public android.graphics.pdf.content.PdfPageTextContent unwrap() {
        return getReal();
    }

    public PdfPageTextContent(java.lang.String arg0) {
        this(new android.graphics.pdf.content.PdfPageTextContent(arg0), (__DcgwBridgeToken) null);
    }

    public PdfPageTextContent(java.lang.String arg0, java.util.List arg1) {
        this(new android.graphics.pdf.content.PdfPageTextContent(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.content.PdfPageTextContent) real).describeContents();
    }

    public java.lang.String getText() {
        return ((android.graphics.pdf.content.PdfPageTextContent) real).getText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.content.PdfPageTextContent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
