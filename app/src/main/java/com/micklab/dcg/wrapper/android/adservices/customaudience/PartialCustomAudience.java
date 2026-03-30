// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.customaudience;

public final class PartialCustomAudience {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PartialCustomAudience(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience wrap(android.adservices.customaudience.PartialCustomAudience real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.customaudience.PartialCustomAudience getReal() {
        return (android.adservices.customaudience.PartialCustomAudience) real;
    }

    public android.adservices.customaudience.PartialCustomAudience unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.adservices.customaudience.PartialCustomAudience) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.customaudience.PartialCustomAudience) real).equals(arg0);
    }

    public java.time.Instant getActivationTime() {
        return ((android.adservices.customaudience.PartialCustomAudience) real).getActivationTime();
    }

    public java.time.Instant getExpirationTime() {
        return ((android.adservices.customaudience.PartialCustomAudience) real).getExpirationTime();
    }

    public java.lang.String getName() {
        return ((android.adservices.customaudience.PartialCustomAudience) real).getName();
    }

    public com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals getUserBiddingSignals() {
        return com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals.wrap(((android.adservices.customaudience.PartialCustomAudience) real).getUserBiddingSignals());
    }

    public int hashCode() {
        return ((android.adservices.customaudience.PartialCustomAudience) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.adservices.customaudience.PartialCustomAudience) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.adservices.customaudience.PartialCustomAudience) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder wrap(android.adservices.customaudience.PartialCustomAudience.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.customaudience.PartialCustomAudience.Builder getReal() {
            return (android.adservices.customaudience.PartialCustomAudience.Builder) real;
        }

        public android.adservices.customaudience.PartialCustomAudience.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.adservices.customaudience.PartialCustomAudience.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience build() {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.wrap(((android.adservices.customaudience.PartialCustomAudience.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder setActivationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder.wrap(((android.adservices.customaudience.PartialCustomAudience.Builder) real).setActivationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder setExpirationTime(java.time.Instant arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder.wrap(((android.adservices.customaudience.PartialCustomAudience.Builder) real).setExpirationTime(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder setUserBiddingSignals(com.micklab.dcg.wrapper.android.adservices.common.AdSelectionSignals arg0) {
            return com.micklab.dcg.wrapper.android.adservices.customaudience.PartialCustomAudience.Builder.wrap(((android.adservices.customaudience.PartialCustomAudience.Builder) real).setUserBiddingSignals(arg0 == null ? null : arg0.getReal()));
        }

    }
}
