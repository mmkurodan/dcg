// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf;

public final class PdfDocument {
    private final android.graphics.pdf.PdfDocument real;

    public PdfDocument(android.graphics.pdf.PdfDocument real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument wrap(android.graphics.pdf.PdfDocument real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument(real);
    }

    public android.graphics.pdf.PdfDocument unwrap() {
        return real;
    }

    public PdfDocument() {
        this(new android.graphics.pdf.PdfDocument());
    }

    public void close() {
        real.close();
    }

    public void finishPage(com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page arg0) {
        real.finishPage(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page startPage(com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo arg0) {
        return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page.wrap(real.startPage(arg0 == null ? null : arg0.unwrap()));
    }

    public void writeTo(java.io.OutputStream arg0) throws java.io.IOException {
        real.writeTo(arg0);
    }

    public static final class Page {
        private final android.graphics.pdf.PdfDocument.Page real;

        public Page(android.graphics.pdf.PdfDocument.Page real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page wrap(android.graphics.pdf.PdfDocument.Page real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.Page(real);
        }

        public android.graphics.pdf.PdfDocument.Page unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.Canvas getCanvas() {
            return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(real.getCanvas());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo getInfo() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.wrap(real.getInfo());
        }

    }
    public static final class PageInfo {
        private final android.graphics.pdf.PdfDocument.PageInfo real;

        public PageInfo(android.graphics.pdf.PdfDocument.PageInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo wrap(android.graphics.pdf.PdfDocument.PageInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo(real);
        }

        public android.graphics.pdf.PdfDocument.PageInfo unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.Rect getContentRect() {
            return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getContentRect());
        }

        public int getPageHeight() {
            return real.getPageHeight();
        }

        public int getPageNumber() {
            return real.getPageNumber();
        }

        public int getPageWidth() {
            return real.getPageWidth();
        }

        public static final class Builder {
            private final android.graphics.pdf.PdfDocument.PageInfo.Builder real;

            public Builder(android.graphics.pdf.PdfDocument.PageInfo.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder wrap(android.graphics.pdf.PdfDocument.PageInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder(real);
            }

            public android.graphics.pdf.PdfDocument.PageInfo.Builder unwrap() {
                return real;
            }

            public Builder(int arg0, int arg1, int arg2) {
                this(new android.graphics.pdf.PdfDocument.PageInfo.Builder(arg0, arg1, arg2));
            }

            public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo create() {
                return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.wrap(real.create());
            }

            public com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder setContentRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
                return com.micklab.dcg.wrapper.android.graphics.pdf.PdfDocument.PageInfo.Builder.wrap(real.setContentRect(arg0 == null ? null : arg0.unwrap()));
            }

        }
    }
}
