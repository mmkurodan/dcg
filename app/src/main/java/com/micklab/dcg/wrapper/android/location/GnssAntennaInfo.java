// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssAntennaInfo {
    private final android.location.GnssAntennaInfo real;

    public GnssAntennaInfo(android.location.GnssAntennaInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo wrap(android.location.GnssAntennaInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo(real);
    }

    public android.location.GnssAntennaInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public double getCarrierFrequencyMHz() {
        return real.getCarrierFrequencyMHz();
    }

    public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset getPhaseCenterOffset() {
        return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset.wrap(real.getPhaseCenterOffset());
    }

    public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections getPhaseCenterVariationCorrections() {
        return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections.wrap(real.getPhaseCenterVariationCorrections());
    }

    public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections getSignalGainCorrections() {
        return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections.wrap(real.getSignalGainCorrections());
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
        private final android.location.GnssAntennaInfo.Builder real;

        public Builder(android.location.GnssAntennaInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder wrap(android.location.GnssAntennaInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder(real);
        }

        public android.location.GnssAntennaInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.GnssAntennaInfo.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo arg0) {
            this(new android.location.GnssAntennaInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(double arg0, com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset arg1) {
            this(new android.location.GnssAntennaInfo.Builder(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo build() {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setCarrierFrequencyMHz(double arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(real.setCarrierFrequencyMHz(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setPhaseCenterOffset(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(real.setPhaseCenterOffset(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setPhaseCenterVariationCorrections(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(real.setPhaseCenterVariationCorrections(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setSignalGainCorrections(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(real.setSignalGainCorrections(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class Listener {
        private final android.location.GnssAntennaInfo.Listener real;

        public Listener(android.location.GnssAntennaInfo.Listener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener wrap(android.location.GnssAntennaInfo.Listener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener(real);
        }

        public android.location.GnssAntennaInfo.Listener unwrap() {
            return real;
        }

    }
    public static final class PhaseCenterOffset {
        private final android.location.GnssAntennaInfo.PhaseCenterOffset real;

        public PhaseCenterOffset(android.location.GnssAntennaInfo.PhaseCenterOffset real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset wrap(android.location.GnssAntennaInfo.PhaseCenterOffset real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset(real);
        }

        public android.location.GnssAntennaInfo.PhaseCenterOffset unwrap() {
            return real;
        }

        public PhaseCenterOffset(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
            this(new android.location.GnssAntennaInfo.PhaseCenterOffset(arg0, arg1, arg2, arg3, arg4, arg5));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public double getXOffsetMm() {
            return real.getXOffsetMm();
        }

        public double getXOffsetUncertaintyMm() {
            return real.getXOffsetUncertaintyMm();
        }

        public double getYOffsetMm() {
            return real.getYOffsetMm();
        }

        public double getYOffsetUncertaintyMm() {
            return real.getYOffsetUncertaintyMm();
        }

        public double getZOffsetMm() {
            return real.getZOffsetMm();
        }

        public double getZOffsetUncertaintyMm() {
            return real.getZOffsetUncertaintyMm();
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


    }
    public static final class SphericalCorrections {
        private final android.location.GnssAntennaInfo.SphericalCorrections real;

        public SphericalCorrections(android.location.GnssAntennaInfo.SphericalCorrections real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections wrap(android.location.GnssAntennaInfo.SphericalCorrections real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections(real);
        }

        public android.location.GnssAntennaInfo.SphericalCorrections unwrap() {
            return real;
        }

        public SphericalCorrections(double[][] arg0, double[][] arg1) {
            this(new android.location.GnssAntennaInfo.SphericalCorrections(arg0, arg1));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public double[][] getCorrectionUncertaintiesArray() {
            return real.getCorrectionUncertaintiesArray();
        }

        public double[][] getCorrectionsArray() {
            return real.getCorrectionsArray();
        }

        public double getDeltaPhi() {
            return real.getDeltaPhi();
        }

        public double getDeltaTheta() {
            return real.getDeltaTheta();
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


    }
}
