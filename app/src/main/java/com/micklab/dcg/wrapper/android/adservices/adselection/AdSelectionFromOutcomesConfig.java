// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class AdSelectionFromOutcomesConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdSelectionFromOutcomesConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig wrap(android.adservices.adselection.AdSelectionFromOutcomesConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.AdSelectionFromOutcomesConfig getReal() {
        return (android.adservices.adselection.AdSelectionFromOutcomesConfig) real;
    }

    public android.adservices.adselection.AdSelectionFromOutcomesConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getSelectionLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).getSelectionLogicUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getSelectionSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).getSelectionSignals());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getSeller() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).getSeller());
    }

    public int hashCode() {
        return ((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.AdSelectionFromOutcomesConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder wrap(android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder getReal() {
            return (android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder) real;
        }

        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSelectionLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder) real).setSelectionLogicUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSelectionSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder) real).setSelectionSignals(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSeller(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder.wrap(((android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder) real).setSeller(arg0 == null ? null : arg0.getReal()));
        }

    }
}
