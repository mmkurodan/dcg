// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssAutomaticGainControl {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssAutomaticGainControl(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl wrap(android.location.GnssAutomaticGainControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssAutomaticGainControl getReal() {
        return (android.location.GnssAutomaticGainControl) real;
    }

    public android.location.GnssAutomaticGainControl unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssAutomaticGainControl) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.GnssAutomaticGainControl) real).equals(arg0);
    }

    public long getCarrierFrequencyHz() {
        return ((android.location.GnssAutomaticGainControl) real).getCarrierFrequencyHz();
    }

    public int getConstellationType() {
        return ((android.location.GnssAutomaticGainControl) real).getConstellationType();
    }

    public double getLevelDb() {
        return ((android.location.GnssAutomaticGainControl) real).getLevelDb();
    }

    public int hashCode() {
        return ((android.location.GnssAutomaticGainControl) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.location.GnssAutomaticGainControl) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssAutomaticGainControl) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder wrap(android.location.GnssAutomaticGainControl.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssAutomaticGainControl.Builder getReal() {
            return (android.location.GnssAutomaticGainControl.Builder) real;
        }

        public android.location.GnssAutomaticGainControl.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.GnssAutomaticGainControl.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl arg0) {
            this(new android.location.GnssAutomaticGainControl.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl build() {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.wrap(((android.location.GnssAutomaticGainControl.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder setCarrierFrequencyHz(long arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder.wrap(((android.location.GnssAutomaticGainControl.Builder) real).setCarrierFrequencyHz(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder setConstellationType(int arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder.wrap(((android.location.GnssAutomaticGainControl.Builder) real).setConstellationType(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder setLevelDb(double arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder.wrap(((android.location.GnssAutomaticGainControl.Builder) real).setLevelDb(arg0));
        }

    }
}
