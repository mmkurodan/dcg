// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class GpsStatus {
    private final android.location.GpsStatus real;

    public GpsStatus(android.location.GpsStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.GpsStatus wrap(android.location.GpsStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsStatus(real);
    }

    public android.location.GpsStatus unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.location.GpsStatus create(com.micklab.dcg.wrapper.android.location.GnssStatus arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.location.GpsStatus.wrap(android.location.GpsStatus.create(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int getMaxSatellites() {
        return real.getMaxSatellites();
    }

    public int getTimeToFirstFix() {
        return real.getTimeToFirstFix();
    }

    public static final int GPS_EVENT_FIRST_FIX = android.location.GpsStatus.GPS_EVENT_FIRST_FIX;
    public static final int GPS_EVENT_SATELLITE_STATUS = android.location.GpsStatus.GPS_EVENT_SATELLITE_STATUS;
    public static final int GPS_EVENT_STARTED = android.location.GpsStatus.GPS_EVENT_STARTED;
    public static final int GPS_EVENT_STOPPED = android.location.GpsStatus.GPS_EVENT_STOPPED;

    public static final class Listener {
        private final android.location.GpsStatus.Listener real;

        public Listener(android.location.GpsStatus.Listener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GpsStatus.Listener wrap(android.location.GpsStatus.Listener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsStatus.Listener(real);
        }

        public android.location.GpsStatus.Listener unwrap() {
            return real;
        }

        public void onGpsStatusChanged(int arg0) {
            real.onGpsStatusChanged(arg0);
        }

    }
    public static final class NmeaListener {
        private final android.location.GpsStatus.NmeaListener real;

        public NmeaListener(android.location.GpsStatus.NmeaListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener wrap(android.location.GpsStatus.NmeaListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.location.GpsStatus.NmeaListener(real);
        }

        public android.location.GpsStatus.NmeaListener unwrap() {
            return real;
        }

        public void onNmeaReceived(long arg0, java.lang.String arg1) {
            real.onNmeaReceived(arg0, arg1);
        }

    }
}
