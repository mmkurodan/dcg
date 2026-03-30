// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class PdfRenderer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfRenderer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfRenderer wrap(android.graphics.pdf.PdfRenderer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfRenderer(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.PdfRenderer getReal() {
        return (android.graphics.pdf.PdfRenderer) real;
    }

    public android.graphics.pdf.PdfRenderer unwrap() {
        return getReal();
    }

    public PdfRenderer(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRenderer(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PdfRenderer(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams arg1) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRenderer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.graphics.pdf.PdfRenderer) real).close();
    }

    public int getDocumentLinearizationType() {
        return ((android.graphics.pdf.PdfRenderer) real).getDocumentLinearizationType();
    }

    public int getPageCount() {
        return ((android.graphics.pdf.PdfRenderer) real).getPageCount();
    }

    public int getPdfFormType() {
        return ((android.graphics.pdf.PdfRenderer) real).getPdfFormType();
    }

    public android.graphics.pdf.PdfRenderer.Page openPage(int arg0) {
        return ((android.graphics.pdf.PdfRenderer) real).openPage(arg0);
    }

    public boolean shouldScaleForPrinting() {
        return ((android.graphics.pdf.PdfRenderer) real).shouldScaleForPrinting();
    }

    public void write(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, boolean arg1) throws java.io.IOException {
        ((android.graphics.pdf.PdfRenderer) real).write(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = android.graphics.pdf.PdfRenderer.DOCUMENT_LINEARIZED_TYPE_LINEARIZED;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = android.graphics.pdf.PdfRenderer.DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED;
    public static final int PDF_FORM_TYPE_ACRO_FORM = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_ACRO_FORM;
    public static final int PDF_FORM_TYPE_NONE = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_NONE;
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_XFA_FOREGROUND;
    public static final int PDF_FORM_TYPE_XFA_FULL = android.graphics.pdf.PdfRenderer.PDF_FORM_TYPE_XFA_FULL;

}
