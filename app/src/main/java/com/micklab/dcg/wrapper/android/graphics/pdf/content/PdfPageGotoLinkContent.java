// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.content;

public final class PdfPageGotoLinkContent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PdfPageGotoLinkContent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent wrap(android.graphics.pdf.content.PdfPageGotoLinkContent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.content.PdfPageGotoLinkContent getReal() {
        return (android.graphics.pdf.content.PdfPageGotoLinkContent) real;
    }

    public android.graphics.pdf.content.PdfPageGotoLinkContent unwrap() {
        return getReal();
    }

    public PdfPageGotoLinkContent(java.util.List arg0, com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination arg1) {
        this(new android.graphics.pdf.content.PdfPageGotoLinkContent(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.pdf.content.PdfPageGotoLinkContent) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination getDestination() {
        return com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination.wrap(((android.graphics.pdf.content.PdfPageGotoLinkContent) real).getDestination());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.content.PdfPageGotoLinkContent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Destination {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Destination(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination wrap(android.graphics.pdf.content.PdfPageGotoLinkContent.Destination real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.content.PdfPageGotoLinkContent.Destination(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.content.PdfPageGotoLinkContent.Destination getReal() {
            return (android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real;
        }

        public android.graphics.pdf.content.PdfPageGotoLinkContent.Destination unwrap() {
            return getReal();
        }

        public Destination(int arg0, float arg1, float arg2, float arg3) {
            this(new android.graphics.pdf.content.PdfPageGotoLinkContent.Destination(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real).describeContents();
        }

        public int getPageNumber() {
            return ((android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real).getPageNumber();
        }

        public float getXCoordinate() {
            return ((android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real).getXCoordinate();
        }

        public float getYCoordinate() {
            return ((android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real).getYCoordinate();
        }

        public float getZoom() {
            return ((android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real).getZoom();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.graphics.pdf.content.PdfPageGotoLinkContent.Destination) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
