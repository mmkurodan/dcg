// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class ReportSystemUsageRequest {
    private final android.app.appsearch.ReportSystemUsageRequest real;

    public ReportSystemUsageRequest(android.app.appsearch.ReportSystemUsageRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest wrap(android.app.appsearch.ReportSystemUsageRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest(real);
    }

    public android.app.appsearch.ReportSystemUsageRequest unwrap() {
        return real;
    }

    public java.lang.String getDatabaseName() {
        return real.getDatabaseName();
    }

    public java.lang.String getDocumentId() {
        return real.getDocumentId();
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public long getUsageTimestampMillis() {
        return real.getUsageTimestampMillis();
    }

    public static final class Builder {
        private final android.app.appsearch.ReportSystemUsageRequest.Builder real;

        public Builder(android.app.appsearch.ReportSystemUsageRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder wrap(android.app.appsearch.ReportSystemUsageRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder(real);
        }

        public android.app.appsearch.ReportSystemUsageRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
            this(new android.app.appsearch.ReportSystemUsageRequest.Builder(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder setUsageTimestampMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportSystemUsageRequest.Builder.wrap(real.setUsageTimestampMillis(arg0));
        }

    }
}
