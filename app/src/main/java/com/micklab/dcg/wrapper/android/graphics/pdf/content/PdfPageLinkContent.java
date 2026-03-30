// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageLinkContent {
    private final android.graphics.pdf.content.PdfPageLinkContent real;

    public PdfPageLinkContent(android.graphics.pdf.content.PdfPageLinkContent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageLinkContent wrap(android.graphics.pdf.content.PdfPageLinkContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageLinkContent(real);
    }

    public android.graphics.pdf.content.PdfPageLinkContent unwrap() {
        return real;
    }

    public PdfPageLinkContent(java.util.List arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        this(new android.graphics.pdf.content.PdfPageLinkContent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
