// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class ReportUsageRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReportUsageRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest wrap(android.app.appsearch.ReportUsageRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.ReportUsageRequest getReal() {
        return (android.app.appsearch.ReportUsageRequest) real;
    }

    public android.app.appsearch.ReportUsageRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.ReportUsageRequest) real).describeContents();
    }

    public java.lang.String getDocumentId() {
        return ((android.app.appsearch.ReportUsageRequest) real).getDocumentId();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.ReportUsageRequest) real).getNamespace();
    }

    public long getUsageTimestampMillis() {
        return ((android.app.appsearch.ReportUsageRequest) real).getUsageTimestampMillis();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.ReportUsageRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder wrap(android.app.appsearch.ReportUsageRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.ReportUsageRequest.Builder getReal() {
            return (android.app.appsearch.ReportUsageRequest.Builder) real;
        }

        public android.app.appsearch.ReportUsageRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.app.appsearch.ReportUsageRequest.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.wrap(((android.app.appsearch.ReportUsageRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder setUsageTimestampMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder.wrap(((android.app.appsearch.ReportUsageRequest.Builder) real).setUsageTimestampMillis(arg0));
        }

    }
}
