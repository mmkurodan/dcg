// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class CustomAudience {
    private final android.adservices.customaudience.CustomAudience real;

    public CustomAudience(android.adservices.customaudience.CustomAudience real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience wrap(android.adservices.customaudience.CustomAudience real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience(real);
    }

    public android.adservices.customaudience.CustomAudience unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getActivationTime() {
        return real.getActivationTime();
    }

    public int getAuctionServerRequestFlags() {
        return real.getAuctionServerRequestFlags();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getBiddingLogicUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getBiddingLogicUri());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier getBuyer() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier.wrap(real.getBuyer());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getDailyUpdateUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getDailyUpdateUri());
    }

    public java.time.Instant getExpirationTime() {
        return real.getExpirationTime();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData getTrustedBiddingData() {
        return com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData.wrap(real.getTrustedBiddingData());
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getUserBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(real.getUserBiddingSignals());
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

    public static final int FLAG_AUCTION_SERVER_REQUEST_OMIT_ADS = android.adservices.customaudience.CustomAudience.FLAG_AUCTION_SERVER_REQUEST_OMIT_ADS;

    public static final class Builder {
        private final android.adservices.customaudience.CustomAudience.Builder real;

        public Builder(android.adservices.customaudience.CustomAudience.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder wrap(android.adservices.customaudience.CustomAudience.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder(real);
        }

        public android.adservices.customaudience.CustomAudience.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.customaudience.CustomAudience.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setActivationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setActivationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setAuctionServerRequestFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setAuctionServerRequestFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setBiddingLogicUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setBiddingLogicUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setBuyer(com.micklab.dcg.wrapper.android.adservices.common.AdTechIdentifier arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setBuyer(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setDailyUpdateUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setDailyUpdateUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setExpirationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setExpirationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setTrustedBiddingData(com.micklab.dcg.wrapper.android.adservices.customaudience.TrustedBiddingData arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setTrustedBiddingData(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder setUserBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.CustomAudience.Builder.wrap(real.setUserBiddingSignals(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
