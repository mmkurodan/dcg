// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class PdfDocument {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfDocument(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument wrap(android.graphics.pdf.PdfDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.PdfDocument getReal() {
        return (android.graphics.pdf.PdfDocument) real;
    }

    public android.graphics.pdf.PdfDocument unwrap() {
        return getReal();
    }

    public PdfDocument() {
        this(new android.graphics.pdf.PdfDocument(), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.graphics.pdf.PdfDocument) real).close();
    }

    public void finishPage(com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page arg0) {
        ((android.graphics.pdf.PdfDocument) real).finishPage(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page startPage(com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo arg0) {
        return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page.wrap(((android.graphics.pdf.PdfDocument) real).startPage(arg0 == null ? null : arg0.getReal()));
    }

    public void writeTo(java.io.OutputStream arg0) throws java.io.IOException {
        ((android.graphics.pdf.PdfDocument) real).writeTo(arg0);
    }

    public static final class Page {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Page(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page wrap(android.graphics.pdf.PdfDocument.Page real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.PdfDocument.Page getReal() {
            return (android.graphics.pdf.PdfDocument.Page) real;
        }

        public android.graphics.pdf.PdfDocument.Page unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.Canvas getCanvas() {
            return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.graphics.pdf.PdfDocument.Page) real).getCanvas());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo getInfo() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.wrap(((android.graphics.pdf.PdfDocument.Page) real).getInfo());
        }

    }
    public static final class PageInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PageInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo wrap(android.graphics.pdf.PdfDocument.PageInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.PdfDocument.PageInfo getReal() {
            return (android.graphics.pdf.PdfDocument.PageInfo) real;
        }

        public android.graphics.pdf.PdfDocument.PageInfo unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.Rect getContentRect() {
            return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.pdf.PdfDocument.PageInfo) real).getContentRect());
        }

        public int getPageHeight() {
            return ((android.graphics.pdf.PdfDocument.PageInfo) real).getPageHeight();
        }

        public int getPageNumber() {
            return ((android.graphics.pdf.PdfDocument.PageInfo) real).getPageNumber();
        }

        public int getPageWidth() {
            return ((android.graphics.pdf.PdfDocument.PageInfo) real).getPageWidth();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder wrap(android.graphics.pdf.PdfDocument.PageInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.graphics.pdf.PdfDocument.PageInfo.Builder getReal() {
                return (android.graphics.pdf.PdfDocument.PageInfo.Builder) real;
            }

            public android.graphics.pdf.PdfDocument.PageInfo.Builder unwrap() {
                return getReal();
            }

            public Builder(int arg0, int arg1, int arg2) {
                this(new android.graphics.pdf.PdfDocument.PageInfo.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo create() {
                return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.wrap(((android.graphics.pdf.PdfDocument.PageInfo.Builder) real).create());
            }

            public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder setContentRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
                return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder.wrap(((android.graphics.pdf.PdfDocument.PageInfo.Builder) real).setContentRect(arg0 == null ? null : arg0.getReal()));
            }

        }
    }
}
