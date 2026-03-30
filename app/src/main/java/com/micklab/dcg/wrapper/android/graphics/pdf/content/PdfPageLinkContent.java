// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageLinkContent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfPageLinkContent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageLinkContent wrap(android.graphics.pdf.content.PdfPageLinkContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageLinkContent(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.content.PdfPageLinkContent getReal() {
        return (android.graphics.pdf.content.PdfPageLinkContent) real;
    }

    public android.graphics.pdf.content.PdfPageLinkContent unwrap() {
        return getReal();
    }

    public PdfPageLinkContent(java.util.List arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.graphics.pdf.content.PdfPageLinkContent(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.content.PdfPageLinkContent) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.graphics.pdf.content.PdfPageLinkContent) real).getUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.content.PdfPageLinkContent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
