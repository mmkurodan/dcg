// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class PdfRenderer {
    private final android.graphics.pdf.PdfRenderer real;

    public PdfRenderer(android.graphics.pdf.PdfRenderer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfRenderer wrap(android.graphics.pdf.PdfRenderer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfRenderer(real);
    }

    public android.graphics.pdf.PdfRenderer unwrap() {
        return real;
    }

    public PdfRenderer(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRenderer(arg0 == null ? null : arg0.unwrap()));
    }

    public PdfRenderer(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams arg1) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRenderer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void close() {
        real.close();
    }

    public int getDocumentLinearizationType() {
        return real.getDocumentLinearizationType();
    }

    public int getPageCount() {
        return real.getPageCount();
    }

    public int getPdfFormType() {
        return real.getPdfFormType();
    }

    public android.graphics.pdf.PdfRenderer.Page openPage(int arg0) {
        return real.openPage(arg0);
    }

    public boolean shouldScaleForPrinting() {
        return real.shouldScaleForPrinting();
    }

    public void write(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, boolean arg1) throws java.io.IOException {
        real.write(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = android.graphics.pdf.PdfRenderer.DOCUMENT_LINEARIZED_TYPE_LINEARIZED;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = android.graphics.pdf.PdfRenderer.DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED;
    public static final int PDF_FORM_TYPE_ACRO_FORM = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_ACRO_FORM;
    public static final int PDF_FORM_TYPE_NONE = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_NONE;
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_XFA_FOREGROUND;
    public static final int PDF_FORM_TYPE_XFA_FULL = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_XFA_FULL;

}
