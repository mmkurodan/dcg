// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Criteria {
    private final android.location.Criteria real;

    public Criteria(android.location.Criteria real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Criteria wrap(android.location.Criteria real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Criteria(real);
    }

    public android.location.Criteria unwrap() {
        return real;
    }

    public Criteria() {
        this(new android.location.Criteria());
    }

    public Criteria(com.micklab.dcg.wrapper.android.location.Criteria arg0) {
        this(new android.location.Criteria(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAccuracy() {
        return real.getAccuracy();
    }

    public int getBearingAccuracy() {
        return real.getBearingAccuracy();
    }

    public int getHorizontalAccuracy() {
        return real.getHorizontalAccuracy();
    }

    public int getPowerRequirement() {
        return real.getPowerRequirement();
    }

    public int getSpeedAccuracy() {
        return real.getSpeedAccuracy();
    }

    public int getVerticalAccuracy() {
        return real.getVerticalAccuracy();
    }

    public boolean isAltitudeRequired() {
        return real.isAltitudeRequired();
    }

    public boolean isBearingRequired() {
        return real.isBearingRequired();
    }

    public boolean isCostAllowed() {
        return real.isCostAllowed();
    }

    public boolean isSpeedRequired() {
        return real.isSpeedRequired();
    }

    public void setAccuracy(int arg0) {
        real.setAccuracy(arg0);
    }

    public void setAltitudeRequired(boolean arg0) {
        real.setAltitudeRequired(arg0);
    }

    public void setBearingAccuracy(int arg0) {
        real.setBearingAccuracy(arg0);
    }

    public void setBearingRequired(boolean arg0) {
        real.setBearingRequired(arg0);
    }

    public void setCostAllowed(boolean arg0) {
        real.setCostAllowed(arg0);
    }

    public void setHorizontalAccuracy(int arg0) {
        real.setHorizontalAccuracy(arg0);
    }

    public void setPowerRequirement(int arg0) {
        real.setPowerRequirement(arg0);
    }

    public void setSpeedAccuracy(int arg0) {
        real.setSpeedAccuracy(arg0);
    }

    public void setSpeedRequired(boolean arg0) {
        real.setSpeedRequired(arg0);
    }

    public void setVerticalAccuracy(int arg0) {
        real.setVerticalAccuracy(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ACCURACY_COARSE = android.location.Criteria.ACCURACY_COARSE;
    public static final int ACCURACY_FINE = android.location.Criteria.ACCURACY_FINE;
    public static final int ACCURACY_HIGH = android.location.Criteria.ACCURACY_HIGH;
    public static final int ACCURACY_LOW = android.location.Criteria.ACCURACY_LOW;
    public static final int ACCURACY_MEDIUM = android.location.Criteria.ACCURACY_MEDIUM;
    public static final int NO_REQUIREMENT = android.location.Criteria.NO_REQUIREMENT;
    public static final int POWER_HIGH = android.location.Criteria.POWER_HIGH;
    public static final int POWER_LOW = android.location.Criteria.POWER_LOW;
    public static final int POWER_MEDIUM = android.location.Criteria.POWER_MEDIUM;

}
