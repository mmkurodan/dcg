// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogsRequest {
    private final android.health.connect.changelog.ChangeLogsRequest real;

    public ChangeLogsRequest(android.health.connect.changelog.ChangeLogsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest wrap(android.health.connect.changelog.ChangeLogsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest(real);
    }

    public android.health.connect.changelog.ChangeLogsRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getPageSize() {
        return real.getPageSize();
    }

    public java.lang.String getToken() {
        return real.getToken();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.health.connect.changelog.ChangeLogsRequest.Builder real;

        public Builder(android.health.connect.changelog.ChangeLogsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder wrap(android.health.connect.changelog.ChangeLogsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder(real);
        }

        public android.health.connect.changelog.ChangeLogsRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.health.connect.changelog.ChangeLogsRequest.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder setPageSize(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsRequest.Builder.wrap(real.setPageSize(arg0));
        }

    }
}
