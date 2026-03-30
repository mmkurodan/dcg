// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class ReportSystemUsageRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReportSystemUsageRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest wrap(android.app.appsearch.ReportSystemUsageRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.ReportSystemUsageRequest getReal() {
        return (android.app.appsearch.ReportSystemUsageRequest) real;
    }

    public android.app.appsearch.ReportSystemUsageRequest unwrap() {
        return getReal();
    }

    public java.lang.String getDatabaseName() {
        return ((android.app.appsearch.ReportSystemUsageRequest) real).getDatabaseName();
    }

    public java.lang.String getDocumentId() {
        return ((android.app.appsearch.ReportSystemUsageRequest) real).getDocumentId();
    }

    public java.lang.String getNamespace() {
        return ((android.app.appsearch.ReportSystemUsageRequest) real).getNamespace();
    }

    public java.lang.String getPackageName() {
        return ((android.app.appsearch.ReportSystemUsageRequest) real).getPackageName();
    }

    public long getUsageTimestampMillis() {
        return ((android.app.appsearch.ReportSystemUsageRequest) real).getUsageTimestampMillis();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder wrap(android.app.appsearch.ReportSystemUsageRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.ReportSystemUsageRequest.Builder getReal() {
            return (android.app.appsearch.ReportSystemUsageRequest.Builder) real;
        }

        public android.app.appsearch.ReportSystemUsageRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
            this(new android.app.appsearch.ReportSystemUsageRequest.Builder(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.wrap(((android.app.appsearch.ReportSystemUsageRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder setUsageTimestampMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder.wrap(((android.app.appsearch.ReportSystemUsageRequest.Builder) real).setUsageTimestampMillis(arg0));
        }

    }
}
