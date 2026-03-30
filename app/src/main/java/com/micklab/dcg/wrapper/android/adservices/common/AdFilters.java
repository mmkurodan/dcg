// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdFilters {
    private final android.adservices.common.AdFilters real;

    public AdFilters(android.adservices.common.AdFilters real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdFilters wrap(android.adservices.common.AdFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdFilters(real);
    }

    public android.adservices.common.AdFilters unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters getAppInstallFilters() {
        return com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.wrap(real.getAppInstallFilters());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters getFrequencyCapFilters() {
        return com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.wrap(real.getFrequencyCapFilters());
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
        private final android.adservices.common.AdFilters.Builder real;

        public Builder(android.adservices.common.AdFilters.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder wrap(android.adservices.common.AdFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder(real);
        }

        public android.adservices.common.AdFilters.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.common.AdFilters.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdFilters build() {
            return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder setAppInstallFilters(com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder.wrap(real.setAppInstallFilters(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder setFrequencyCapFilters(com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder.wrap(real.setFrequencyCapFilters(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
