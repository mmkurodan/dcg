// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Location {
    private final android.location.Location real;

    public Location(android.location.Location real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Location wrap(android.location.Location real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Location(real);
    }

    public android.location.Location unwrap() {
        return real;
    }

    public Location(java.lang.String arg0) {
        this(new android.location.Location(arg0));
    }

    public Location(com.micklab.dcg.wrapper.android.location.Location arg0) {
        this(new android.location.Location(arg0 == null ? null : arg0.unwrap()));
    }

    public float bearingTo(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return real.bearingTo(arg0 == null ? null : arg0.unwrap());
    }

    public static double convert(java.lang.String arg0) {
        return android.location.Location.convert(arg0);
    }

    public static java.lang.String convert(double arg0, int arg1) {
        return android.location.Location.convert(arg0, arg1);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public static void distanceBetween(double arg0, double arg1, double arg2, double arg3, float[] arg4) {
        android.location.Location.distanceBetween(arg0, arg1, arg2, arg3, arg4);
    }

    public float distanceTo(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return real.distanceTo(arg0 == null ? null : arg0.unwrap());
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        real.dump(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getAccuracy() {
        return real.getAccuracy();
    }

    public double getAltitude() {
        return real.getAltitude();
    }

    public float getBearing() {
        return real.getBearing();
    }

    public float getBearingAccuracyDegrees() {
        return real.getBearingAccuracyDegrees();
    }

    public long getElapsedRealtimeAgeMillis() {
        return real.getElapsedRealtimeAgeMillis();
    }

    public long getElapsedRealtimeAgeMillis(long arg0) {
        return real.getElapsedRealtimeAgeMillis(arg0);
    }

    public long getElapsedRealtimeMillis() {
        return real.getElapsedRealtimeMillis();
    }

    public long getElapsedRealtimeNanos() {
        return real.getElapsedRealtimeNanos();
    }

    public double getElapsedRealtimeUncertaintyNanos() {
        return real.getElapsedRealtimeUncertaintyNanos();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public double getLatitude() {
        return real.getLatitude();
    }

    public double getLongitude() {
        return real.getLongitude();
    }

    public float getMslAltitudeAccuracyMeters() {
        return real.getMslAltitudeAccuracyMeters();
    }

    public double getMslAltitudeMeters() {
        return real.getMslAltitudeMeters();
    }

    public java.lang.String getProvider() {
        return real.getProvider();
    }

    public float getSpeed() {
        return real.getSpeed();
    }

    public float getSpeedAccuracyMetersPerSecond() {
        return real.getSpeedAccuracyMetersPerSecond();
    }

    public long getTime() {
        return real.getTime();
    }

    public float getVerticalAccuracyMeters() {
        return real.getVerticalAccuracyMeters();
    }

    public boolean hasAccuracy() {
        return real.hasAccuracy();
    }

    public boolean hasAltitude() {
        return real.hasAltitude();
    }

    public boolean hasBearing() {
        return real.hasBearing();
    }

    public boolean hasBearingAccuracy() {
        return real.hasBearingAccuracy();
    }

    public boolean hasElapsedRealtimeUncertaintyNanos() {
        return real.hasElapsedRealtimeUncertaintyNanos();
    }

    public boolean hasMslAltitude() {
        return real.hasMslAltitude();
    }

    public boolean hasMslAltitudeAccuracy() {
        return real.hasMslAltitudeAccuracy();
    }

    public boolean hasSpeed() {
        return real.hasSpeed();
    }

    public boolean hasSpeedAccuracy() {
        return real.hasSpeedAccuracy();
    }

    public boolean hasVerticalAccuracy() {
        return real.hasVerticalAccuracy();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isComplete() {
        return real.isComplete();
    }

    public boolean isFromMockProvider() {
        return real.isFromMockProvider();
    }

    public boolean isMock() {
        return real.isMock();
    }

    public void removeAccuracy() {
        real.removeAccuracy();
    }

    public void removeAltitude() {
        real.removeAltitude();
    }

    public void removeBearing() {
        real.removeBearing();
    }

    public void removeBearingAccuracy() {
        real.removeBearingAccuracy();
    }

    public void removeElapsedRealtimeUncertaintyNanos() {
        real.removeElapsedRealtimeUncertaintyNanos();
    }

    public void removeMslAltitude() {
        real.removeMslAltitude();
    }

    public void removeMslAltitudeAccuracy() {
        real.removeMslAltitudeAccuracy();
    }

    public void removeSpeed() {
        real.removeSpeed();
    }

    public void removeSpeedAccuracy() {
        real.removeSpeedAccuracy();
    }

    public void removeVerticalAccuracy() {
        real.removeVerticalAccuracy();
    }

    public void reset() {
        real.reset();
    }

    public void set(com.micklab.dcg.wrapper.android.location.Location arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void setAccuracy(float arg0) {
        real.setAccuracy(arg0);
    }

    public void setAltitude(double arg0) {
        real.setAltitude(arg0);
    }

    public void setBearing(float arg0) {
        real.setBearing(arg0);
    }

    public void setBearingAccuracyDegrees(float arg0) {
        real.setBearingAccuracyDegrees(arg0);
    }

    public void setElapsedRealtimeNanos(long arg0) {
        real.setElapsedRealtimeNanos(arg0);
    }

    public void setElapsedRealtimeUncertaintyNanos(double arg0) {
        real.setElapsedRealtimeUncertaintyNanos(arg0);
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setExtras(arg0 == null ? null : arg0.unwrap());
    }

    public void setLatitude(double arg0) {
        real.setLatitude(arg0);
    }

    public void setLongitude(double arg0) {
        real.setLongitude(arg0);
    }

    public void setMock(boolean arg0) {
        real.setMock(arg0);
    }

    public void setMslAltitudeAccuracyMeters(float arg0) {
        real.setMslAltitudeAccuracyMeters(arg0);
    }

    public void setMslAltitudeMeters(double arg0) {
        real.setMslAltitudeMeters(arg0);
    }

    public void setProvider(java.lang.String arg0) {
        real.setProvider(arg0);
    }

    public void setSpeed(float arg0) {
        real.setSpeed(arg0);
    }

    public void setSpeedAccuracyMetersPerSecond(float arg0) {
        real.setSpeedAccuracyMetersPerSecond(arg0);
    }

    public void setTime(long arg0) {
        real.setTime(arg0);
    }

    public void setVerticalAccuracyMeters(float arg0) {
        real.setVerticalAccuracyMeters(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FORMAT_DEGREES = android.location.Location.FORMAT_DEGREES;
    public static final int FORMAT_MINUTES = android.location.Location.FORMAT_MINUTES;
    public static final int FORMAT_SECONDS = android.location.Location.FORMAT_SECONDS;

}
