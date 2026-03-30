// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintDocumentInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintDocumentInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintDocumentInfo wrap(android.print.PrintDocumentInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentInfo(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintDocumentInfo getReal() {
        return (android.print.PrintDocumentInfo) real;
    }

    public android.print.PrintDocumentInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrintDocumentInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrintDocumentInfo) real).equals(arg0);
    }

    public int getContentType() {
        return ((android.print.PrintDocumentInfo) real).getContentType();
    }

    public long getDataSize() {
        return ((android.print.PrintDocumentInfo) real).getDataSize();
    }

    public java.lang.String getName() {
        return ((android.print.PrintDocumentInfo) real).getName();
    }

    public int getPageCount() {
        return ((android.print.PrintDocumentInfo) real).getPageCount();
    }

    public int hashCode() {
        return ((android.print.PrintDocumentInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.print.PrintDocumentInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrintDocumentInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONTENT_TYPE_DOCUMENT = android.print.PrintDocumentInfo.CONTENT_TYPE_DOCUMENT;
    public static final int CONTENT_TYPE_PHOTO = android.print.PrintDocumentInfo.CONTENT_TYPE_PHOTO;
    public static final int CONTENT_TYPE_UNKNOWN = android.print.PrintDocumentInfo.CONTENT_TYPE_UNKNOWN;
    public static final int PAGE_COUNT_UNKNOWN = android.print.PrintDocumentInfo.PAGE_COUNT_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder wrap(android.print.PrintDocumentInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintDocumentInfo.Builder getReal() {
            return (android.print.PrintDocumentInfo.Builder) real;
        }

        public android.print.PrintDocumentInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.print.PrintDocumentInfo.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.wrap(((android.print.PrintDocumentInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder setContentType(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder.wrap(((android.print.PrintDocumentInfo.Builder) real).setContentType(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder setPageCount(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder.wrap(((android.print.PrintDocumentInfo.Builder) real).setPageCount(arg0));
        }

    }
}
