// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GnssStatus {
    private final android.location.GnssStatus real;

    public GnssStatus(android.location.GnssStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GnssStatus wrap(android.location.GnssStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssStatus(real);
    }

    public android.location.GnssStatus unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getAzimuthDegrees(int arg0) {
        return real.getAzimuthDegrees(arg0);
    }

    public float getBasebandCn0DbHz(int arg0) {
        return real.getBasebandCn0DbHz(arg0);
    }

    public float getCarrierFrequencyHz(int arg0) {
        return real.getCarrierFrequencyHz(arg0);
    }

    public float getCn0DbHz(int arg0) {
        return real.getCn0DbHz(arg0);
    }

    public int getConstellationType(int arg0) {
        return real.getConstellationType(arg0);
    }

    public float getElevationDegrees(int arg0) {
        return real.getElevationDegrees(arg0);
    }

    public int getSatelliteCount() {
        return real.getSatelliteCount();
    }

    public int getSvid(int arg0) {
        return real.getSvid(arg0);
    }

    public boolean hasAlmanacData(int arg0) {
        return real.hasAlmanacData(arg0);
    }

    public boolean hasBasebandCn0DbHz(int arg0) {
        return real.hasBasebandCn0DbHz(arg0);
    }

    public boolean hasCarrierFrequencyHz(int arg0) {
        return real.hasCarrierFrequencyHz(arg0);
    }

    public boolean hasEphemerisData(int arg0) {
        return real.hasEphemerisData(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean usedInFix(int arg0) {
        return real.usedInFix(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
        private final android.location.GnssStatus.Builder real;

        public Builder(android.location.GnssStatus.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssStatus.Builder wrap(android.location.GnssStatus.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssStatus.Builder(real);
        }

        public android.location.GnssStatus.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.location.GnssStatus.Builder());
        }

        public com.micklab.dcg.wrapper.android.location.GnssStatus.Builder addSatellite(int arg0, int arg1, float arg2, float arg3, float arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, float arg9, boolean arg10, float arg11) {
            return com.micklab.dcg.wrapper.android.location.GnssStatus.Builder.wrap(real.addSatellite(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11));
        }

        public com.micklab.dcg.wrapper.android.location.GnssStatus build() {
            return com.micklab.dcg.wrapper.android.location.GnssStatus.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.location.GnssStatus.Builder clearSatellites() {
            return com.micklab.dcg.wrapper.android.location.GnssStatus.Builder.wrap(real.clearSatellites());
        }

    }
    public static final class Callback {
        private final android.location.GnssStatus.Callback real;

        public Callback(android.location.GnssStatus.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GnssStatus.Callback wrap(android.location.GnssStatus.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GnssStatus.Callback(real);
        }

        public android.location.GnssStatus.Callback unwrap() {
            return real;
        }

        public void onFirstFix(int arg0) {
            real.onFirstFix(arg0);
        }

        public void onSatelliteStatusChanged(com.micklab.dcg.wrapper.android.location.GnssStatus arg0) {
            real.onSatelliteStatusChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onStarted() {
            real.onStarted();
        }

        public void onStopped() {
            real.onStopped();
        }

    }
}
