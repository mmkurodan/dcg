// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print.pdf;

public final class PrintedPdfDocument {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintedPdfDocument(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.pdf.PrintedPdfDocument wrap(android.print.pdf.PrintedPdfDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.pdf.PrintedPdfDocument(real, (__DcgwBridgeToken) null);
    }

    public android.print.pdf.PrintedPdfDocument getReal() {
        return (android.print.pdf.PrintedPdfDocument) real;
    }

    public android.print.pdf.PrintedPdfDocument unwrap() {
        return getReal();
    }

    public PrintedPdfDocument(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.print.PrintAttributes arg1) {
        this(new android.print.pdf.PrintedPdfDocument(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getPageContentRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.print.pdf.PrintedPdfDocument) real).getPageContentRect());
    }

    public int getPageHeight() {
        return ((android.print.pdf.PrintedPdfDocument) real).getPageHeight();
    }

    public int getPageWidth() {
        return ((android.print.pdf.PrintedPdfDocument) real).getPageWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page startPage(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page.wrap(((android.print.pdf.PrintedPdfDocument) real).startPage(arg0));
    }

}
