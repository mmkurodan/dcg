// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class SellerConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SellerConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration wrap(android.adservices.adselection.SellerConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.SellerConfiguration getReal() {
        return (android.adservices.adselection.SellerConfiguration) real;
    }

    public android.adservices.adselection.SellerConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.adselection.SellerConfiguration) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.SellerConfiguration) real).equals(arg0);
    }

    public int getMaximumPayloadSizeBytes() {
        return ((android.adservices.adselection.SellerConfiguration) real).getMaximumPayloadSizeBytes();
    }

    public int hashCode() {
        return ((android.adservices.adselection.SellerConfiguration) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.SellerConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration.Builder wrap(android.adservices.adselection.SellerConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.SellerConfiguration.Builder getReal() {
            return (android.adservices.adselection.SellerConfiguration.Builder) real;
        }

        public android.adservices.adselection.SellerConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.SellerConfiguration.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration.wrap(((android.adservices.adselection.SellerConfiguration.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration.Builder setMaximumPayloadSizeBytes(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SellerConfiguration.Builder.wrap(((android.adservices.adselection.SellerConfiguration.Builder) real).setMaximumPayloadSizeBytes(arg0));
        }

    }
}
