// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Location {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Location(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Location wrap(android.location.Location real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Location(real, (__DcgwBridgeToken) null);
    }

    public android.location.Location getReal() {
        return (android.location.Location) real;
    }

    public android.location.Location unwrap() {
        return getReal();
    }

    public Location(java.lang.String arg0) {
        this(new android.location.Location(arg0), (__DcgwBridgeToken) null);
    }

    public Location(com.micklab.dcg.wrapper.android.location.Location arg0) {
        this(new android.location.Location(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public float bearingTo(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return ((android.location.Location) real).bearingTo(arg0 == null ? null : arg0.getReal());
    }

    public static double convert(java.lang.String arg0) {
        return android.location.Location.convert(arg0);
    }

    public static java.lang.String convert(double arg0, int arg1) {
        return android.location.Location.convert(arg0, arg1);
    }

    public int describeContents() {
        return ((android.location.Location) real).describeContents();
    }

    public static void distanceBetween(double arg0, double arg1, double arg2, double arg3, float[] arg4) {
        android.location.Location.distanceBetween(arg0, arg1, arg2, arg3, arg4);
    }

    public float distanceTo(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return ((android.location.Location) real).distanceTo(arg0 == null ? null : arg0.getReal());
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        ((android.location.Location) real).dump(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.location.Location) real).equals(arg0);
    }

    public float getAccuracy() {
        return ((android.location.Location) real).getAccuracy();
    }

    public double getAltitude() {
        return ((android.location.Location) real).getAltitude();
    }

    public float getBearing() {
        return ((android.location.Location) real).getBearing();
    }

    public float getBearingAccuracyDegrees() {
        return ((android.location.Location) real).getBearingAccuracyDegrees();
    }

    public long getElapsedRealtimeAgeMillis() {
        return ((android.location.Location) real).getElapsedRealtimeAgeMillis();
    }

    public long getElapsedRealtimeAgeMillis(long arg0) {
        return ((android.location.Location) real).getElapsedRealtimeAgeMillis(arg0);
    }

    public long getElapsedRealtimeMillis() {
        return ((android.location.Location) real).getElapsedRealtimeMillis();
    }

    public long getElapsedRealtimeNanos() {
        return ((android.location.Location) real).getElapsedRealtimeNanos();
    }

    public double getElapsedRealtimeUncertaintyNanos() {
        return ((android.location.Location) real).getElapsedRealtimeUncertaintyNanos();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.location.Location) real).getExtras());
    }

    public double getLatitude() {
        return ((android.location.Location) real).getLatitude();
    }

    public double getLongitude() {
        return ((android.location.Location) real).getLongitude();
    }

    public float getMslAltitudeAccuracyMeters() {
        return ((android.location.Location) real).getMslAltitudeAccuracyMeters();
    }

    public double getMslAltitudeMeters() {
        return ((android.location.Location) real).getMslAltitudeMeters();
    }

    public java.lang.String getProvider() {
        return ((android.location.Location) real).getProvider();
    }

    public float getSpeed() {
        return ((android.location.Location) real).getSpeed();
    }

    public float getSpeedAccuracyMetersPerSecond() {
        return ((android.location.Location) real).getSpeedAccuracyMetersPerSecond();
    }

    public long getTime() {
        return ((android.location.Location) real).getTime();
    }

    public float getVerticalAccuracyMeters() {
        return ((android.location.Location) real).getVerticalAccuracyMeters();
    }

    public boolean hasAccuracy() {
        return ((android.location.Location) real).hasAccuracy();
    }

    public boolean hasAltitude() {
        return ((android.location.Location) real).hasAltitude();
    }

    public boolean hasBearing() {
        return ((android.location.Location) real).hasBearing();
    }

    public boolean hasBearingAccuracy() {
        return ((android.location.Location) real).hasBearingAccuracy();
    }

    public boolean hasElapsedRealtimeUncertaintyNanos() {
        return ((android.location.Location) real).hasElapsedRealtimeUncertaintyNanos();
    }

    public boolean hasMslAltitude() {
        return ((android.location.Location) real).hasMslAltitude();
    }

    public boolean hasMslAltitudeAccuracy() {
        return ((android.location.Location) real).hasMslAltitudeAccuracy();
    }

    public boolean hasSpeed() {
        return ((android.location.Location) real).hasSpeed();
    }

    public boolean hasSpeedAccuracy() {
        return ((android.location.Location) real).hasSpeedAccuracy();
    }

    public boolean hasVerticalAccuracy() {
        return ((android.location.Location) real).hasVerticalAccuracy();
    }

    public int hashCode() {
        return ((android.location.Location) real).hashCode();
    }

    public boolean isComplete() {
        return ((android.location.Location) real).isComplete();
    }

    public boolean isFromMockProvider() {
        return ((android.location.Location) real).isFromMockProvider();
    }

    public boolean isMock() {
        return ((android.location.Location) real).isMock();
    }

    public void removeAccuracy() {
        ((android.location.Location) real).removeAccuracy();
    }

    public void removeAltitude() {
        ((android.location.Location) real).removeAltitude();
    }

    public void removeBearing() {
        ((android.location.Location) real).removeBearing();
    }

    public void removeBearingAccuracy() {
        ((android.location.Location) real).removeBearingAccuracy();
    }

    public void removeElapsedRealtimeUncertaintyNanos() {
        ((android.location.Location) real).removeElapsedRealtimeUncertaintyNanos();
    }

    public void removeMslAltitude() {
        ((android.location.Location) real).removeMslAltitude();
    }

    public void removeMslAltitudeAccuracy() {
        ((android.location.Location) real).removeMslAltitudeAccuracy();
    }

    public void removeSpeed() {
        ((android.location.Location) real).removeSpeed();
    }

    public void removeSpeedAccuracy() {
        ((android.location.Location) real).removeSpeedAccuracy();
    }

    public void removeVerticalAccuracy() {
        ((android.location.Location) real).removeVerticalAccuracy();
    }

    public void reset() {
        ((android.location.Location) real).reset();
    }

    public void set(com.micklab.dcg.wrapper.android.location.Location arg0) {
        ((android.location.Location) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void setAccuracy(float arg0) {
        ((android.location.Location) real).setAccuracy(arg0);
    }

    public void setAltitude(double arg0) {
        ((android.location.Location) real).setAltitude(arg0);
    }

    public void setBearing(float arg0) {
        ((android.location.Location) real).setBearing(arg0);
    }

    public void setBearingAccuracyDegrees(float arg0) {
        ((android.location.Location) real).setBearingAccuracyDegrees(arg0);
    }

    public void setElapsedRealtimeNanos(long arg0) {
        ((android.location.Location) real).setElapsedRealtimeNanos(arg0);
    }

    public void setElapsedRealtimeUncertaintyNanos(double arg0) {
        ((android.location.Location) real).setElapsedRealtimeUncertaintyNanos(arg0);
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.location.Location) real).setExtras(arg0 == null ? null : arg0.getReal());
    }

    public void setLatitude(double arg0) {
        ((android.location.Location) real).setLatitude(arg0);
    }

    public void setLongitude(double arg0) {
        ((android.location.Location) real).setLongitude(arg0);
    }

    public void setMock(boolean arg0) {
        ((android.location.Location) real).setMock(arg0);
    }

    public void setMslAltitudeAccuracyMeters(float arg0) {
        ((android.location.Location) real).setMslAltitudeAccuracyMeters(arg0);
    }

    public void setMslAltitudeMeters(double arg0) {
        ((android.location.Location) real).setMslAltitudeMeters(arg0);
    }

    public void setProvider(java.lang.String arg0) {
        ((android.location.Location) real).setProvider(arg0);
    }

    public void setSpeed(float arg0) {
        ((android.location.Location) real).setSpeed(arg0);
    }

    public void setSpeedAccuracyMetersPerSecond(float arg0) {
        ((android.location.Location) real).setSpeedAccuracyMetersPerSecond(arg0);
    }

    public void setTime(long arg0) {
        ((android.location.Location) real).setTime(arg0);
    }

    public void setVerticalAccuracyMeters(float arg0) {
        ((android.location.Location) real).setVerticalAccuracyMeters(arg0);
    }

    public java.lang.String toString() {
        return ((android.location.Location) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.Location) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int FORMAT_DEGREES = android.location.Location.FORMAT_DEGREES;
    public static final int FORMAT_MINUTES = android.location.Location.FORMAT_MINUTES;
    public static final int FORMAT_SECONDS = android.location.Location.FORMAT_SECONDS;

}
