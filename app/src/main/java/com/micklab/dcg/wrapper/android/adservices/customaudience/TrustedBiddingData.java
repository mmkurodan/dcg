// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class TrustedBiddingData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrustedBiddingData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData wrap(android.adservices.customaudience.TrustedBiddingData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.TrustedBiddingData getReal() {
        return (android.adservices.customaudience.TrustedBiddingData) real;
    }

    public android.adservices.customaudience.TrustedBiddingData unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.customaudience.TrustedBiddingData) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.TrustedBiddingData) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTrustedBiddingUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.customaudience.TrustedBiddingData) real).getTrustedBiddingUri());
    }

    public int hashCode() {
        return ((android.adservices.customaudience.TrustedBiddingData) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.customaudience.TrustedBiddingData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder wrap(android.adservices.customaudience.TrustedBiddingData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.TrustedBiddingData.Builder getReal() {
            return (android.adservices.customaudience.TrustedBiddingData.Builder) real;
        }

        public android.adservices.customaudience.TrustedBiddingData.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.customaudience.TrustedBiddingData.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.wrap(((android.adservices.customaudience.TrustedBiddingData.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder setTrustedBiddingUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.Builder.wrap(((android.adservices.customaudience.TrustedBiddingData.Builder) real).setTrustedBiddingUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
