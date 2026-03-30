// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AppInstallFilters {
    private final android.adservices.common.AppInstallFilters real;

    public AppInstallFilters(android.adservices.common.AppInstallFilters real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters wrap(android.adservices.common.AppInstallFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters(real);
    }

    public android.adservices.common.AppInstallFilters unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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


    public static final class Builder {
        private final android.adservices.common.AppInstallFilters.Builder real;

        public Builder(android.adservices.common.AppInstallFilters.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.Builder wrap(android.adservices.common.AppInstallFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.Builder(real);
        }

        public android.adservices.common.AppInstallFilters.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.common.AppInstallFilters.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters build() {
            return com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.wrap(real.build());
        }

    }
}
