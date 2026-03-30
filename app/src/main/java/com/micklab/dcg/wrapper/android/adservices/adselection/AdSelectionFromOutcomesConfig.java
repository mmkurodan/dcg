// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionFromOutcomesConfig {
    private final android.adservices.adselection.AdSelectionFromOutcomesConfig real;

    public AdSelectionFromOutcomesConfig(android.adservices.adselection.AdSelectionFromOutcomesConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig wrap(android.adservices.adselection.AdSelectionFromOutcomesConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig(real);
    }

    public android.adservices.adselection.AdSelectionFromOutcomesConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSelectionLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getSelectionLogicUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getSelectionSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getSelectionSignals());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getSeller());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder real;

        public Builder(android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder wrap(android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder(real);
        }

        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSelectionLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder.wrap(real.setSelectionLogicUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSelectionSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder.wrap(real.setSelectionSignals(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder.wrap(real.setSeller(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
