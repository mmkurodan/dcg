// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class PartialCustomAudience {
    private final android.adservices.customaudience.PartialCustomAudience real;

    public PartialCustomAudience(android.adservices.customaudience.PartialCustomAudience real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience wrap(android.adservices.customaudience.PartialCustomAudience real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience(real);
    }

    public android.adservices.customaudience.PartialCustomAudience unwrap() {
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

    public java.time.Instant getExpirationTime() {
        return real.getExpirationTime();
    }

    public java.lang.String getName() {
        return real.getName();
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


    public static final class Builder {
        private final android.adservices.customaudience.PartialCustomAudience.Builder real;

        public Builder(android.adservices.customaudience.PartialCustomAudience.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder wrap(android.adservices.customaudience.PartialCustomAudience.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder(real);
        }

        public android.adservices.customaudience.PartialCustomAudience.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0) {
            this(new android.adservices.customaudience.PartialCustomAudience.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder setActivationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder.wrap(real.setActivationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder setExpirationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder.wrap(real.setExpirationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder setUserBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder.wrap(real.setUserBiddingSignals(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
