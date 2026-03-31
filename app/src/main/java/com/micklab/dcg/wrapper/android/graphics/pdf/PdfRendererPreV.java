// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class PdfRendererPreV {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfRendererPreV(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV wrap(android.graphics.pdf.PdfRendererPreV real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.PdfRendererPreV getReal() {
        return (android.graphics.pdf.PdfRendererPreV) real;
    }

    public android.graphics.pdf.PdfRendererPreV unwrap() {
        return getReal();
    }

    public PdfRendererPreV(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRendererPreV(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PdfRendererPreV(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.graphics.pdf.LoadParams arg1) throws java.io.IOException {
        this(new android.graphics.pdf.PdfRendererPreV(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.graphics.pdf.PdfRendererPreV) real).close();
    }

    public int getDocumentLinearizationType() {
        return ((android.graphics.pdf.PdfRendererPreV) real).getDocumentLinearizationType();
    }

    public int getPageCount() {
        return ((android.graphics.pdf.PdfRendererPreV) real).getPageCount();
    }

    public int getPdfFormType() {
        return ((android.graphics.pdf.PdfRendererPreV) real).getPdfFormType();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV.Page openPage(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV.Page.wrap(((android.graphics.pdf.PdfRendererPreV) real).openPage(arg0));
    }

    public void write(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, boolean arg1) throws java.io.IOException {
        ((android.graphics.pdf.PdfRendererPreV) real).write(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = android.graphics.pdf.PdfRendererPreV.DOCUMENT_LINEARIZED_TYPE_LINEARIZED;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = android.graphics.pdf.PdfRendererPreV.DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED;
    public static final int PDF_FORM_TYPE_ACRO_FORM = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_ACRO_FORM;
    public static final int PDF_FORM_TYPE_NONE = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_NONE;
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_XFA_FOREGROUND;
    public static final int PDF_FORM_TYPE_XFA_FULL = android.graphics.pdf.PdfRendererPreV.PDF_FORM_TYPE_XFA_FULL;

    public static final class Page {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Page(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV.Page wrap(android.graphics.pdf.PdfRendererPreV.Page real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfRendererPreV.Page(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.PdfRendererPreV.Page getReal() {
            return (android.graphics.pdf.PdfRendererPreV.Page) real;
        }

        public android.graphics.pdf.PdfRendererPreV.Page unwrap() {
            return getReal();
        }

        public void close() {
            ((android.graphics.pdf.PdfRendererPreV.Page) real).close();
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo getFormWidgetInfoAtIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.wrap(((android.graphics.pdf.PdfRendererPreV.Page) real).getFormWidgetInfoAtIndex(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo getFormWidgetInfoAtPosition(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.wrap(((android.graphics.pdf.PdfRendererPreV.Page) real).getFormWidgetInfoAtPosition(arg0, arg1));
        }

        public int getHeight() {
            return ((android.graphics.pdf.PdfRendererPreV.Page) real).getHeight();
        }

        public int getIndex() {
            return ((android.graphics.pdf.PdfRendererPreV.Page) real).getIndex();
        }

        public int getWidth() {
            return ((android.graphics.pdf.PdfRendererPreV.Page) real).getWidth();
        }

        public void render(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Matrix arg2, com.micklab.dcg.wrapper.android.graphics.pdf.RenderParams arg3) {
            ((android.graphics.pdf.PdfRendererPreV.Page) real).render(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.PageSelection selectContent(com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary arg0, com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.SelectionBoundary arg1) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.selection.PageSelection.wrap(((android.graphics.pdf.PdfRendererPreV.Page) real).selectContent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }


    }
}
