// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class SignedContextualAds {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SignedContextualAds(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds wrap(android.adservices.adselection.SignedContextualAds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adselection.SignedContextualAds getReal() {
        return (android.adservices.adselection.SignedContextualAds) real;
    }

    public android.adservices.adselection.SignedContextualAds unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.adselection.SignedContextualAds) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adselection.SignedContextualAds) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.adselection.SignedContextualAds) real).getBuyer());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDecisionLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.adselection.SignedContextualAds) real).getDecisionLogicUri());
    }

    public byte[] getSignature() {
        return ((android.adservices.adselection.SignedContextualAds) real).getSignature();
    }

    public int hashCode() {
        return ((android.adservices.adselection.SignedContextualAds) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.adselection.SignedContextualAds) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.adselection.SignedContextualAds) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder wrap(android.adservices.adselection.SignedContextualAds.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.adselection.SignedContextualAds.Builder getReal() {
            return (android.adservices.adselection.SignedContextualAds.Builder) real;
        }

        public android.adservices.adselection.SignedContextualAds.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.adselection.SignedContextualAds.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds arg0) {
            this(new android.adservices.adselection.SignedContextualAds.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.wrap(((android.adservices.adselection.SignedContextualAds.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder.wrap(((android.adservices.adselection.SignedContextualAds.Builder) real).setBuyer(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder setDecisionLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder.wrap(((android.adservices.adselection.SignedContextualAds.Builder) real).setDecisionLogicUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder setSignature(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder.wrap(((android.adservices.adselection.SignedContextualAds.Builder) real).setSignature(arg0));
        }

    }
}
