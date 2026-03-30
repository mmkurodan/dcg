// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print.pdf;

public final class PrintedPdfDocument {
    private final android.print.pdf.PrintedPdfDocument real;

    public PrintedPdfDocument(android.print.pdf.PrintedPdfDocument real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.pdf.PrintedPdfDocument wrap(android.print.pdf.PrintedPdfDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.pdf.PrintedPdfDocument(real);
    }

    public android.print.pdf.PrintedPdfDocument unwrap() {
        return real;
    }

    public PrintedPdfDocument(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.print.PrintAttributes arg1) {
        this(new android.print.pdf.PrintedPdfDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getPageContentRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getPageContentRect());
    }

    public int getPageHeight() {
        return real.getPageHeight();
    }

    public int getPageWidth() {
        return real.getPageWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page startPage(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page.wrap(real.startPage(arg0));
    }

}
