// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GpsStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GpsStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GpsStatus wrap(android.location.GpsStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsStatus(real, (__DcgwBridgeToken) null);
    }

    public android.location.GpsStatus getReal() {
        return (android.location.GpsStatus) real;
    }

    public android.location.GpsStatus unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.location.GpsStatus create(com.micklab.dcg.wrapper.android.location.GnssStatus arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.location.GpsStatus.wrap(android.location.GpsStatus.create(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public int getMaxSatellites() {
        return ((android.location.GpsStatus) real).getMaxSatellites();
    }

    public int getTimeToFirstFix() {
        return ((android.location.GpsStatus) real).getTimeToFirstFix();
    }

    public static final int GPS_EVENT_FIRST_FIX = android.location.GpsStatus.GPS_EVENT_FIRST_FIX;
    public static final int GPS_EVENT_SATELLITE_STATUS = android.location.GpsStatus.GPS_EVENT_SATELLITE_STATUS;
    public static final int GPS_EVENT_STARTED = android.location.GpsStatus.GPS_EVENT_STARTED;
    public static final int GPS_EVENT_STOPPED = android.location.GpsStatus.GPS_EVENT_STOPPED;

    public static final class Listener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Listener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GpsStatus.Listener wrap(android.location.GpsStatus.Listener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsStatus.Listener(real, (__DcgwBridgeToken) null);
        }

        public android.location.GpsStatus.Listener getReal() {
            return (android.location.GpsStatus.Listener) real;
        }

        public android.location.GpsStatus.Listener unwrap() {
            return getReal();
        }

        public void onGpsStatusChanged(int arg0) {
            ((android.location.GpsStatus.Listener) real).onGpsStatusChanged(arg0);
        }

    }
    public static final class NmeaListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NmeaListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener wrap(android.location.GpsStatus.NmeaListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener(real, (__DcgwBridgeToken) null);
        }

        public android.location.GpsStatus.NmeaListener getReal() {
            return (android.location.GpsStatus.NmeaListener) real;
        }

        public android.location.GpsStatus.NmeaListener unwrap() {
            return getReal();
        }

        public void onNmeaReceived(long arg0, java.lang.String arg1) {
            ((android.location.GpsStatus.NmeaListener) real).onNmeaReceived(arg0, arg1);
        }

    }
}
