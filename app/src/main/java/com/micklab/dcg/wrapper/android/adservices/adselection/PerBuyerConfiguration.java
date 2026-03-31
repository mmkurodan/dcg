// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class PerBuyerConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PerBuyerConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration wrap(android.adservices.adselection.PerBuyerConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.PerBuyerConfiguration getReal() {
        return (android.adservices.adselection.PerBuyerConfiguration) real;
    }

    public android.adservices.adselection.PerBuyerConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.adselection.PerBuyerConfiguration) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.PerBuyerConfiguration) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.PerBuyerConfiguration) real).getBuyer());
    }

    public int getTargetInputSizeBytes() {
        return ((android.adservices.adselection.PerBuyerConfiguration) real).getTargetInputSizeBytes();
    }

    public int hashCode() {
        return ((android.adservices.adselection.PerBuyerConfiguration) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.PerBuyerConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.Builder wrap(android.adservices.adselection.PerBuyerConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.PerBuyerConfiguration.Builder getReal() {
            return (android.adservices.adselection.PerBuyerConfiguration.Builder) real;
        }

        public android.adservices.adselection.PerBuyerConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.PerBuyerConfiguration.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.wrap(((android.adservices.adselection.PerBuyerConfiguration.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.Builder.wrap(((android.adservices.adselection.PerBuyerConfiguration.Builder) real).setBuyer(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.Builder setTargetInputSizeBytes(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.PerBuyerConfiguration.Builder.wrap(((android.adservices.adselection.PerBuyerConfiguration.Builder) real).setTargetInputSizeBytes(arg0));
        }

    }
}
