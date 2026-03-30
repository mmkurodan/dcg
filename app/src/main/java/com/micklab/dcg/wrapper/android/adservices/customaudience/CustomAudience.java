// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class CustomAudience {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CustomAudience(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience wrap(android.adservices.customaudience.CustomAudience real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.CustomAudience getReal() {
        return (android.adservices.customaudience.CustomAudience) real;
    }

    public android.adservices.customaudience.CustomAudience unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.customaudience.CustomAudience) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.CustomAudience) real).equals(arg0);
    }

    public java.time.Instant getActivationTime() {
        return ((android.adservices.customaudience.CustomAudience) real).getActivationTime();
    }

    public int getAuctionServerRequestFlags() {
        return ((android.adservices.customaudience.CustomAudience) real).getAuctionServerRequestFlags();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getBiddingLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.customaudience.CustomAudience) real).getBiddingLogicUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(((android.adservices.customaudience.CustomAudience) real).getBuyer());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDailyUpdateUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.adservices.customaudience.CustomAudience) real).getDailyUpdateUri());
    }

    public java.time.Instant getExpirationTime() {
        return ((android.adservices.customaudience.CustomAudience) real).getExpirationTime();
    }

    public java.lang.String getName() {
        return ((android.adservices.customaudience.CustomAudience) real).getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData getTrustedBiddingData() {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.wrap(((android.adservices.customaudience.CustomAudience) real).getTrustedBiddingData());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getUserBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.customaudience.CustomAudience) real).getUserBiddingSignals());
    }

    public int hashCode() {
        return ((android.adservices.customaudience.CustomAudience) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.customaudience.CustomAudience) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.customaudience.CustomAudience) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FLAG_AUCTION_SERVER_REQUEST_OMIT_ADS = android.adservices.customaudience.CustomAudience.FLAG_AUCTION_SERVER_REQUEST_OMIT_ADS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder wrap(android.adservices.customaudience.CustomAudience.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.CustomAudience.Builder getReal() {
            return (android.adservices.customaudience.CustomAudience.Builder) real;
        }

        public android.adservices.customaudience.CustomAudience.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.customaudience.CustomAudience.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setActivationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setActivationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setAuctionServerRequestFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setAuctionServerRequestFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setBiddingLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setBiddingLogicUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setBuyer(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setDailyUpdateUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setDailyUpdateUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setExpirationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setExpirationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setTrustedBiddingData(com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setTrustedBiddingData(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setUserBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(((android.adservices.customaudience.CustomAudience.Builder) real).setUserBiddingSignals(arg0 == null ? null : arg0.getReal()));
        }

    }
}
