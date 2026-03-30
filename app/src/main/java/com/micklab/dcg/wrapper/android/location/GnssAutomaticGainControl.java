// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssAutomaticGainControl {
    private final android.location.GnssAutomaticGainControl real;

    public GnssAutomaticGainControl(android.location.GnssAutomaticGainControl real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl wrap(android.location.GnssAutomaticGainControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl(real);
    }

    public android.location.GnssAutomaticGainControl unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getCarrierFrequencyHz() {
        return real.getCarrierFrequencyHz();
    }

    public int getConstellationType() {
        return real.getConstellationType();
    }

    public double getLevelDb() {
        return real.getLevelDb();
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
        private final android.location.GnssAutomaticGainControl.Builder real;

        public Builder(android.location.GnssAutomaticGainControl.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder wrap(android.location.GnssAutomaticGainControl.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder(real);
        }

        public android.location.GnssAutomaticGainControl.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.GnssAutomaticGainControl.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl arg0) {
            this(new android.location.GnssAutomaticGainControl.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl build() {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder setCarrierFrequencyHz(long arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder.wrap(real.setCarrierFrequencyHz(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder setConstellationType(int arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder.wrap(real.setConstellationType(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder setLevelDb(double arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAutomaticGainControl.Builder.wrap(real.setLevelDb(arg0));
        }

    }
}
