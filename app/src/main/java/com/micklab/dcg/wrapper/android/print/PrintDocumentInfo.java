// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintDocumentInfo {
    private final android.print.PrintDocumentInfo real;

    public PrintDocumentInfo(android.print.PrintDocumentInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintDocumentInfo wrap(android.print.PrintDocumentInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentInfo(real);
    }

    public android.print.PrintDocumentInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getContentType() {
        return real.getContentType();
    }

    public long getDataSize() {
        return real.getDataSize();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getPageCount() {
        return real.getPageCount();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CONTENT_TYPE_DOCUMENT = android.print.PrintDocumentInfo.CONTENT_TYPE_DOCUMENT;
    public static final int CONTENT_TYPE_PHOTO = android.print.PrintDocumentInfo.CONTENT_TYPE_PHOTO;
    public static final int CONTENT_TYPE_UNKNOWN = android.print.PrintDocumentInfo.CONTENT_TYPE_UNKNOWN;
    public static final int PAGE_COUNT_UNKNOWN = android.print.PrintDocumentInfo.PAGE_COUNT_UNKNOWN;

    public static final class Builder {
        private final android.print.PrintDocumentInfo.Builder real;

        public Builder(android.print.PrintDocumentInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder wrap(android.print.PrintDocumentInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder(real);
        }

        public android.print.PrintDocumentInfo.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.print.PrintDocumentInfo.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder setContentType(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder.wrap(real.setContentType(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder setPageCount(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintDocumentInfo.Builder.wrap(real.setPageCount(arg0));
        }

    }
}
