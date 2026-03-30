// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogTokenRequest {
    private final android.health.connect.changelog.ChangeLogTokenRequest real;

    public ChangeLogTokenRequest(android.health.connect.changelog.ChangeLogTokenRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest wrap(android.health.connect.changelog.ChangeLogTokenRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest(real);
    }

    public android.health.connect.changelog.ChangeLogTokenRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.health.connect.changelog.ChangeLogTokenRequest.Builder real;

        public Builder(android.health.connect.changelog.ChangeLogTokenRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder wrap(android.health.connect.changelog.ChangeLogTokenRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder(real);
        }

        public android.health.connect.changelog.ChangeLogTokenRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.health.connect.changelog.ChangeLogTokenRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder addDataOriginFilter(com.micklab.dcg.wrapper.android.health.connect.datatypes.DataOrigin arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.Builder.wrap(real.addDataOriginFilter(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest build() {
            return com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogTokenRequest.wrap(real.build());
        }

    }
}
