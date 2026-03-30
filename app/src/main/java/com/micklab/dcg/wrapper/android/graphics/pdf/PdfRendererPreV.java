// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class PdfRendererPreV {
    private final android.graphics.pdf.PdfRendererPreV real;

    public PdfRendererPreV(android.graphics.pdf.PdfRendererPreV real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV wrap(android.graphics.pdf.PdfRendererPreV real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV(real);
    }

    public android.graphics.pdf.PdfRendererPreV unwrap() {
        return real;
    }

    public PdfRendererPreV(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRendererPreV(arg0 == null ? null : arg0.unwrap()));
    }

    public PdfRendererPreV(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams arg1) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRendererPreV(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
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

    public android.graphics.pdf.PdfRendererPreV.Page openPage(int arg0) {
        return real.openPage(arg0);
    }

    public void write(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, boolean arg1) throws java.io.IOException {
        real.write(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = android.graphics.pdf.PdfRendererPreV.DOCUMENT_LINEARIZED_TYPE_LINEARIZED;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = android.graphics.pdf.PdfRendererPreV.DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED;
    public static final int PDF_FORM_TYPE_ACRO_FORM = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_ACRO_FORM;
    public static final int PDF_FORM_TYPE_NONE = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_NONE;
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_XFA_FOREGROUND;
    public static final int PDF_FORM_TYPE_XFA_FULL = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_XFA_FULL;

}
