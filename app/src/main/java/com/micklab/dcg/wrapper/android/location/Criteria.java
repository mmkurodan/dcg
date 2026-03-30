// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Criteria {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Criteria(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Criteria wrap(android.location.Criteria real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Criteria(real, (__DcgwBridgeToken) null);
    }

    public android.location.Criteria getReal() {
        return (android.location.Criteria) real;
    }

    public android.location.Criteria unwrap() {
        return getReal();
    }

    public Criteria() {
        this(new android.location.Criteria(), (__DcgwBridgeToken) null);
    }

    public Criteria(com.micklab.dcg.wrapper.android.location.Criteria arg0) {
        this(new android.location.Criteria(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.location.Criteria) real).describeContents();
    }

    public int getAccuracy() {
        return ((android.location.Criteria) real).getAccuracy();
    }

    public int getBearingAccuracy() {
        return ((android.location.Criteria) real).getBearingAccuracy();
    }

    public int getHorizontalAccuracy() {
        return ((android.location.Criteria) real).getHorizontalAccuracy();
    }

    public int getPowerRequirement() {
        return ((android.location.Criteria) real).getPowerRequirement();
    }

    public int getSpeedAccuracy() {
        return ((android.location.Criteria) real).getSpeedAccuracy();
    }

    public int getVerticalAccuracy() {
        return ((android.location.Criteria) real).getVerticalAccuracy();
    }

    public boolean isAltitudeRequired() {
        return ((android.location.Criteria) real).isAltitudeRequired();
    }

    public boolean isBearingRequired() {
        return ((android.location.Criteria) real).isBearingRequired();
    }

    public boolean isCostAllowed() {
        return ((android.location.Criteria) real).isCostAllowed();
    }

    public boolean isSpeedRequired() {
        return ((android.location.Criteria) real).isSpeedRequired();
    }

    public void setAccuracy(int arg0) {
        ((android.location.Criteria) real).setAccuracy(arg0);
    }

    public void setAltitudeRequired(boolean arg0) {
        ((android.location.Criteria) real).setAltitudeRequired(arg0);
    }

    public void setBearingAccuracy(int arg0) {
        ((android.location.Criteria) real).setBearingAccuracy(arg0);
    }

    public void setBearingRequired(boolean arg0) {
        ((android.location.Criteria) real).setBearingRequired(arg0);
    }

    public void setCostAllowed(boolean arg0) {
        ((android.location.Criteria) real).setCostAllowed(arg0);
    }

    public void setHorizontalAccuracy(int arg0) {
        ((android.location.Criteria) real).setHorizontalAccuracy(arg0);
    }

    public void setPowerRequirement(int arg0) {
        ((android.location.Criteria) real).setPowerRequirement(arg0);
    }

    public void setSpeedAccuracy(int arg0) {
        ((android.location.Criteria) real).setSpeedAccuracy(arg0);
    }

    public void setSpeedRequired(boolean arg0) {
        ((android.location.Criteria) real).setSpeedRequired(arg0);
    }

    public void setVerticalAccuracy(int arg0) {
        ((android.location.Criteria) real).setVerticalAccuracy(arg0);
    }

    public java.lang.String toString() {
        return ((android.location.Criteria) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.Criteria) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
