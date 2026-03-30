// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdSelectionConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig wrap(android.adservices.adselection.AdSelectionConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AdSelectionConfig getReal() {
        return (android.adservices.adselection.AdSelectionConfig) real;
    }

    public android.adservices.adselection.AdSelectionConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.adselection.AdSelectionConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.AdSelectionConfig) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getAdSelectionSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.adselection.AdSelectionConfig) real).getAdSelectionSignals());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDecisionLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.adselection.AdSelectionConfig) real).getDecisionLogicUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.AdSelectionConfig) real).getSeller());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getSellerSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.adselection.AdSelectionConfig) real).getSellerSignals());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTrustedScoringSignalsUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.adselection.AdSelectionConfig) real).getTrustedScoringSignalsUri());
    }

    public int hashCode() {
        return ((android.adservices.adselection.AdSelectionConfig) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.AdSelectionConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder wrap(android.adservices.adselection.AdSelectionConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.AdSelectionConfig.Builder getReal() {
            return (android.adservices.adselection.AdSelectionConfig.Builder) real;
        }

        public android.adservices.adselection.AdSelectionConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.AdSelectionConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(((android.adservices.adselection.AdSelectionConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setAdSelectionSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(((android.adservices.adselection.AdSelectionConfig.Builder) real).setAdSelectionSignals(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setDecisionLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(((android.adservices.adselection.AdSelectionConfig.Builder) real).setDecisionLogicUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(((android.adservices.adselection.AdSelectionConfig.Builder) real).setSeller(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setSellerSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(((android.adservices.adselection.AdSelectionConfig.Builder) real).setSellerSignals(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setTrustedScoringSignalsUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(((android.adservices.adselection.AdSelectionConfig.Builder) real).setTrustedScoringSignalsUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
