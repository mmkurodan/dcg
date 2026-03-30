// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionConfig {
    private final android.adservices.adselection.AdSelectionConfig real;

    public AdSelectionConfig(android.adservices.adselection.AdSelectionConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig wrap(android.adservices.adselection.AdSelectionConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig(real);
    }

    public android.adservices.adselection.AdSelectionConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getAdSelectionSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getAdSelectionSignals());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDecisionLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getDecisionLogicUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getSeller());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getSellerSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getSellerSignals());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTrustedScoringSignalsUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getTrustedScoringSignalsUri());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.adselection.AdSelectionConfig.Builder real;

        public Builder(android.adservices.adselection.AdSelectionConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder wrap(android.adservices.adselection.AdSelectionConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder(real);
        }

        public android.adservices.adselection.AdSelectionConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.AdSelectionConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setAdSelectionSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(real.setAdSelectionSignals(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setDecisionLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(real.setDecisionLogicUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(real.setSeller(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setSellerSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(real.setSellerSignals(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder setTrustedScoringSignalsUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionConfig.Builder.wrap(real.setTrustedScoringSignalsUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
