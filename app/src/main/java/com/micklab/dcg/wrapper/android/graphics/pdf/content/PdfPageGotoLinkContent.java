// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageGotoLinkContent {
    private final android.graphics.pdf.content.PdfPageGotoLinkContent real;

    public PdfPageGotoLinkContent(android.graphics.pdf.content.PdfPageGotoLinkContent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent wrap(android.graphics.pdf.content.PdfPageGotoLinkContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent(real);
    }

    public android.graphics.pdf.content.PdfPageGotoLinkContent unwrap() {
        return real;
    }

    public PdfPageGotoLinkContent(java.util.List arg0, com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination arg1) {
        this(new android.graphics.pdf.content.PdfPageGotoLinkContent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination getDestination() {
        return com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination.wrap(real.getDestination());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Destination {
        private final android.graphics.pdf.content.PdfPageGotoLinkContent.Destination real;

        public Destination(android.graphics.pdf.content.PdfPageGotoLinkContent.Destination real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination wrap(android.graphics.pdf.content.PdfPageGotoLinkContent.Destination real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination(real);
        }

        public android.graphics.pdf.content.PdfPageGotoLinkContent.Destination unwrap() {
            return real;
        }

        public Destination(int arg0, float arg1, float arg2, float arg3) {
            this(new android.graphics.pdf.content.PdfPageGotoLinkContent.Destination(arg0, arg1, arg2, arg3));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public int getPageNumber() {
            return real.getPageNumber();
        }

        public float getXCoordinate() {
            return real.getXCoordinate();
        }

        public float getYCoordinate() {
            return real.getYCoordinate();
        }

        public float getZoom() {
            return real.getZoom();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
