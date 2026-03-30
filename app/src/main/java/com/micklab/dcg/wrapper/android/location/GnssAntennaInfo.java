// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssAntennaInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssAntennaInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo wrap(android.location.GnssAntennaInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssAntennaInfo getReal() {
        return (android.location.GnssAntennaInfo) real;
    }

    public android.location.GnssAntennaInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssAntennaInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.GnssAntennaInfo) real).equals(arg0);
    }

    public double getCarrierFrequencyMHz() {
        return ((android.location.GnssAntennaInfo) real).getCarrierFrequencyMHz();
    }

    public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset getPhaseCenterOffset() {
        return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset.wrap(((android.location.GnssAntennaInfo) real).getPhaseCenterOffset());
    }

    public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections getPhaseCenterVariationCorrections() {
        return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections.wrap(((android.location.GnssAntennaInfo) real).getPhaseCenterVariationCorrections());
    }

    public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections getSignalGainCorrections() {
        return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections.wrap(((android.location.GnssAntennaInfo) real).getSignalGainCorrections());
    }

    public int hashCode() {
        return ((android.location.GnssAntennaInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.location.GnssAntennaInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssAntennaInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder wrap(android.location.GnssAntennaInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssAntennaInfo.Builder getReal() {
            return (android.location.GnssAntennaInfo.Builder) real;
        }

        public android.location.GnssAntennaInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.GnssAntennaInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo arg0) {
            this(new android.location.GnssAntennaInfo.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(double arg0, com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset arg1) {
            this(new android.location.GnssAntennaInfo.Builder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo build() {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.wrap(((android.location.GnssAntennaInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setCarrierFrequencyMHz(double arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(((android.location.GnssAntennaInfo.Builder) real).setCarrierFrequencyMHz(arg0));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setPhaseCenterOffset(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(((android.location.GnssAntennaInfo.Builder) real).setPhaseCenterOffset(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setPhaseCenterVariationCorrections(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(((android.location.GnssAntennaInfo.Builder) real).setPhaseCenterVariationCorrections(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder setSignalGainCorrections(com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections arg0) {
            return com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Builder.wrap(((android.location.GnssAntennaInfo.Builder) real).setSignalGainCorrections(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Listener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Listener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener wrap(android.location.GnssAntennaInfo.Listener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.Listener(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssAntennaInfo.Listener getReal() {
            return (android.location.GnssAntennaInfo.Listener) real;
        }

        public android.location.GnssAntennaInfo.Listener unwrap() {
            return getReal();
        }

    }
    public static final class PhaseCenterOffset {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PhaseCenterOffset(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset wrap(android.location.GnssAntennaInfo.PhaseCenterOffset real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.PhaseCenterOffset(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssAntennaInfo.PhaseCenterOffset getReal() {
            return (android.location.GnssAntennaInfo.PhaseCenterOffset) real;
        }

        public android.location.GnssAntennaInfo.PhaseCenterOffset unwrap() {
            return getReal();
        }

        public PhaseCenterOffset(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
            this(new android.location.GnssAntennaInfo.PhaseCenterOffset(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).equals(arg0);
        }

        public double getXOffsetMm() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).getXOffsetMm();
        }

        public double getXOffsetUncertaintyMm() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).getXOffsetUncertaintyMm();
        }

        public double getYOffsetMm() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).getYOffsetMm();
        }

        public double getYOffsetUncertaintyMm() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).getYOffsetUncertaintyMm();
        }

        public double getZOffsetMm() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).getZOffsetMm();
        }

        public double getZOffsetUncertaintyMm() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).getZOffsetUncertaintyMm();
        }

        public int hashCode() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.location.GnssAntennaInfo.PhaseCenterOffset) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class SphericalCorrections {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SphericalCorrections(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections wrap(android.location.GnssAntennaInfo.SphericalCorrections real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssAntennaInfo.SphericalCorrections(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssAntennaInfo.SphericalCorrections getReal() {
            return (android.location.GnssAntennaInfo.SphericalCorrections) real;
        }

        public android.location.GnssAntennaInfo.SphericalCorrections unwrap() {
            return getReal();
        }

        public SphericalCorrections(double[][] arg0, double[][] arg1) {
            this(new android.location.GnssAntennaInfo.SphericalCorrections(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).equals(arg0);
        }

        public double[][] getCorrectionUncertaintiesArray() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).getCorrectionUncertaintiesArray();
        }

        public double[][] getCorrectionsArray() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).getCorrectionsArray();
        }

        public double getDeltaPhi() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).getDeltaPhi();
        }

        public double getDeltaTheta() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).getDeltaTheta();
        }

        public int hashCode() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.location.GnssAntennaInfo.SphericalCorrections) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.location.GnssAntennaInfo.SphericalCorrections) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
