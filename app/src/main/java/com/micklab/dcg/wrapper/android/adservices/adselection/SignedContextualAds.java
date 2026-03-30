// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adselection;

public final class SignedContextualAds {
    private final android.adservices.adselection.SignedContextualAds real;

    public SignedContextualAds(android.adservices.adselection.SignedContextualAds real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds wrap(android.adservices.adselection.SignedContextualAds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds(real);
    }

    public android.adservices.adselection.SignedContextualAds unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getBuyer());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDecisionLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getDecisionLogicUri());
    }

    public byte[] getSignature() {
        return real.getSignature();
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
        private final android.adservices.adselection.SignedContextualAds.Builder real;

        public Builder(android.adservices.adselection.SignedContextualAds.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder wrap(android.adservices.adselection.SignedContextualAds.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder(real);
        }

        public android.adservices.adselection.SignedContextualAds.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.adselection.SignedContextualAds.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds arg0) {
            this(new android.adservices.adselection.SignedContextualAds.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds build() {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder.wrap(real.setBuyer(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder setDecisionLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder.wrap(real.setDecisionLogicUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder setSignature(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.adservices.adselection.SignedContextualAds.Builder.wrap(real.setSignature(arg0));
        }

    }
}
