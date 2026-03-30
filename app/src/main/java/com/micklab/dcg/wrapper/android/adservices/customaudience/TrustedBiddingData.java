// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class TrustedBiddingData {
    private final android.adservices.customaudience.TrustedBiddingData real;

    public TrustedBiddingData(android.adservices.customaudience.TrustedBiddingData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData wrap(android.adservices.customaudience.TrustedBiddingData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData(real);
    }

    public android.adservices.customaudience.TrustedBiddingData unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTrustedBiddingUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getTrustedBiddingUri());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.adservices.customaudience.TrustedBiddingData.Builder real;

        public Builder(android.adservices.customaudience.TrustedBiddingData.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder wrap(android.adservices.customaudience.TrustedBiddingData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder(real);
        }

        public android.adservices.customaudience.TrustedBiddingData.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.customaudience.TrustedBiddingData.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder setTrustedBiddingUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder.wrap(real.setTrustedBiddingUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
