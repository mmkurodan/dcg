// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class ReportUsageRequest {
    private final android.app.appsearch.ReportUsageRequest real;

    public ReportUsageRequest(android.app.appsearch.ReportUsageRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest wrap(android.app.appsearch.ReportUsageRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest(real);
    }

    public android.app.appsearch.ReportUsageRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getDocumentId() {
        return real.getDocumentId();
    }

    public java.lang.String getNamespace() {
        return real.getNamespace();
    }

    public long getUsageTimestampMillis() {
        return real.getUsageTimestampMillis();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.ReportUsageRequest.Builder real;

        public Builder(android.app.appsearch.ReportUsageRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder wrap(android.app.appsearch.ReportUsageRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder(real);
        }

        public android.app.appsearch.ReportUsageRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.app.appsearch.ReportUsageRequest.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder setUsageTimestampMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.ReportUsageRequest.Builder.wrap(real.setUsageTimestampMillis(arg0));
        }

    }
}
