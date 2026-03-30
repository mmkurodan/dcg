// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdFilters {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdFilters(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdFilters wrap(android.adservices.common.AdFilters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdFilters(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AdFilters getReal() {
        return (android.adservices.common.AdFilters) real;
    }

    public android.adservices.common.AdFilters unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.common.AdFilters) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.common.AdFilters) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters getAppInstallFilters() {
        return com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters.wrap(((android.adservices.common.AdFilters) real).getAppInstallFilters());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters getFrequencyCapFilters() {
        return com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters.wrap(((android.adservices.common.AdFilters) real).getFrequencyCapFilters());
    }

    public int hashCode() {
        return ((android.adservices.common.AdFilters) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.common.AdFilters) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.common.AdFilters) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder wrap(android.adservices.common.AdFilters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.common.AdFilters.Builder getReal() {
            return (android.adservices.common.AdFilters.Builder) real;
        }

        public android.adservices.common.AdFilters.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.common.AdFilters.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdFilters build() {
            return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.wrap(((android.adservices.common.AdFilters.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder setAppInstallFilters(com.micklab.dcg.wrapper.android.adservices.common.AppInstallFilters arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder.wrap(((android.adservices.common.AdFilters.Builder) real).setAppInstallFilters(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder setFrequencyCapFilters(com.micklab.dcg.wrapper.android.adservices.common.FrequencyCapFilters arg0) {
            return com.micklab.dcg.wrapper.android.adservices.common.AdFilters.Builder.wrap(((android.adservices.common.AdFilters.Builder) real).setFrequencyCapFilters(arg0 == null ? null : arg0.getReal()));
        }

    }
}
