// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GnssStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssStatus wrap(android.location.GnssStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssStatus(real, (__DcgwBridgeToken) null);
    }

    public android.location.GnssStatus getReal() {
        return (android.location.GnssStatus) real;
    }

    public android.location.GnssStatus unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.location.GnssStatus) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.GnssStatus) real).equals(arg0);
    }

    public float getAzimuthDegrees(int arg0) {
        return ((android.location.GnssStatus) real).getAzimuthDegrees(arg0);
    }

    public float getBasebandCn0DbHz(int arg0) {
        return ((android.location.GnssStatus) real).getBasebandCn0DbHz(arg0);
    }

    public float getCarrierFrequencyHz(int arg0) {
        return ((android.location.GnssStatus) real).getCarrierFrequencyHz(arg0);
    }

    public float getCn0DbHz(int arg0) {
        return ((android.location.GnssStatus) real).getCn0DbHz(arg0);
    }

    public int getConstellationType(int arg0) {
        return ((android.location.GnssStatus) real).getConstellationType(arg0);
    }

    public float getElevationDegrees(int arg0) {
        return ((android.location.GnssStatus) real).getElevationDegrees(arg0);
    }

    public int getSatelliteCount() {
        return ((android.location.GnssStatus) real).getSatelliteCount();
    }

    public int getSvid(int arg0) {
        return ((android.location.GnssStatus) real).getSvid(arg0);
    }

    public boolean hasAlmanacData(int arg0) {
        return ((android.location.GnssStatus) real).hasAlmanacData(arg0);
    }

    public boolean hasBasebandCn0DbHz(int arg0) {
        return ((android.location.GnssStatus) real).hasBasebandCn0DbHz(arg0);
    }

    public boolean hasCarrierFrequencyHz(int arg0) {
        return ((android.location.GnssStatus) real).hasCarrierFrequencyHz(arg0);
    }

    public boolean hasEphemerisData(int arg0) {
        return ((android.location.GnssStatus) real).hasEphemerisData(arg0);
    }

    public int hashCode() {
        return ((android.location.GnssStatus) real).hashCode();
    }

    public boolean usedInFix(int arg0) {
        return ((android.location.GnssStatus) real).usedInFix(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.GnssStatus) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONSTELLATION_BEIDOU = android.location.GnssStatus.CONSTELLATION_BEIDOU;
    public static final int CONSTELLATION_GALILEO = android.location.GnssStatus.CONSTELLATION_GALILEO;
    public static final int CONSTELLATION_GLONASS = android.location.GnssStatus.CONSTELLATION_GLONASS;
    public static final int CONSTELLATION_GPS = android.location.GnssStatus.CONSTELLATION_GPS;
    public static final int CONSTELLATION_IRNSS = android.location.GnssStatus.CONSTELLATION_IRNSS;
    public static final int CONSTELLATION_QZSS = android.location.GnssStatus.CONSTELLATION_QZSS;
    public static final int CONSTELLATION_SBAS = android.location.GnssStatus.CONSTELLATION_SBAS;
    public static final int CONSTELLATION_UNKNOWN = android.location.GnssStatus.CONSTELLATION_UNKNOWN;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssStatus.Builder wrap(android.location.GnssStatus.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssStatus.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssStatus.Builder getReal() {
            return (android.location.GnssStatus.Builder) real;
        }

        public android.location.GnssStatus.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.location.GnssStatus.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.location.GnssStatus.Builder addSatellite(int arg0, int arg1, float arg2, float arg3, float arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, float arg9, boolean arg10, float arg11) {
            return com.micklab.dcg.wrapper.android.location.GnssStatus.Builder.wrap(((android.location.GnssStatus.Builder) real).addSatellite(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11));
        }

        public com.micklab.dcg.wrapper.android.location.GnssStatus build() {
            return com.micklab.dcg.wrapper.android.location.GnssStatus.wrap(((android.location.GnssStatus.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssStatus.Builder clearSatellites() {
            return com.micklab.dcg.wrapper.android.location.GnssStatus.Builder.wrap(((android.location.GnssStatus.Builder) real).clearSatellites());
        }

    }
    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssStatus.Callback wrap(android.location.GnssStatus.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssStatus.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.location.GnssStatus.Callback getReal() {
            return (android.location.GnssStatus.Callback) real;
        }

        public android.location.GnssStatus.Callback unwrap() {
            return getReal();
        }

        public void onFirstFix(int arg0) {
            ((android.location.GnssStatus.Callback) real).onFirstFix(arg0);
        }

        public void onSatelliteStatusChanged(com.micklab.dcg.wrapper.android.location.GnssStatus arg0) {
            ((android.location.GnssStatus.Callback) real).onSatelliteStatusChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onStarted() {
            ((android.location.GnssStatus.Callback) real).onStarted();
        }

        public void onStopped() {
            ((android.location.GnssStatus.Callback) real).onStopped();
        }

    }
}
