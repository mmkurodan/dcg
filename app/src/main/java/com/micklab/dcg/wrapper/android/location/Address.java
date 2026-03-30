// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Address {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Address(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Address wrap(android.location.Address real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Address(real, (__DcgwBridgeToken) null);
    }

    public android.location.Address getReal() {
        return (android.location.Address) real;
    }

    public android.location.Address unwrap() {
        return getReal();
    }

    public Address(java.util.Locale arg0) {
        this(new android.location.Address(arg0), (__DcgwBridgeToken) null);
    }

    public void clearLatitude() {
        ((android.location.Address) real).clearLatitude();
    }

    public void clearLongitude() {
        ((android.location.Address) real).clearLongitude();
    }

    public int describeContents() {
        return ((android.location.Address) real).describeContents();
    }

    public java.lang.String getAddressLine(int arg0) {
        return ((android.location.Address) real).getAddressLine(arg0);
    }

    public java.lang.String getAdminArea() {
        return ((android.location.Address) real).getAdminArea();
    }

    public java.lang.String getCountryCode() {
        return ((android.location.Address) real).getCountryCode();
    }

    public java.lang.String getCountryName() {
        return ((android.location.Address) real).getCountryName();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.location.Address) real).getExtras());
    }

    public java.lang.String getFeatureName() {
        return ((android.location.Address) real).getFeatureName();
    }

    public double getLatitude() {
        return ((android.location.Address) real).getLatitude();
    }

    public java.util.Locale getLocale() {
        return ((android.location.Address) real).getLocale();
    }

    public java.lang.String getLocality() {
        return ((android.location.Address) real).getLocality();
    }

    public double getLongitude() {
        return ((android.location.Address) real).getLongitude();
    }

    public int getMaxAddressLineIndex() {
        return ((android.location.Address) real).getMaxAddressLineIndex();
    }

    public java.lang.String getPhone() {
        return ((android.location.Address) real).getPhone();
    }

    public java.lang.String getPostalCode() {
        return ((android.location.Address) real).getPostalCode();
    }

    public java.lang.String getPremises() {
        return ((android.location.Address) real).getPremises();
    }

    public java.lang.String getSubAdminArea() {
        return ((android.location.Address) real).getSubAdminArea();
    }

    public java.lang.String getSubLocality() {
        return ((android.location.Address) real).getSubLocality();
    }

    public java.lang.String getSubThoroughfare() {
        return ((android.location.Address) real).getSubThoroughfare();
    }

    public java.lang.String getThoroughfare() {
        return ((android.location.Address) real).getThoroughfare();
    }

    public java.lang.String getUrl() {
        return ((android.location.Address) real).getUrl();
    }

    public boolean hasLatitude() {
        return ((android.location.Address) real).hasLatitude();
    }

    public boolean hasLongitude() {
        return ((android.location.Address) real).hasLongitude();
    }

    public void setAddressLine(int arg0, java.lang.String arg1) {
        ((android.location.Address) real).setAddressLine(arg0, arg1);
    }

    public void setAdminArea(java.lang.String arg0) {
        ((android.location.Address) real).setAdminArea(arg0);
    }

    public void setCountryCode(java.lang.String arg0) {
        ((android.location.Address) real).setCountryCode(arg0);
    }

    public void setCountryName(java.lang.String arg0) {
        ((android.location.Address) real).setCountryName(arg0);
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.location.Address) real).setExtras(arg0 == null ? null : arg0.getReal());
    }

    public void setFeatureName(java.lang.String arg0) {
        ((android.location.Address) real).setFeatureName(arg0);
    }

    public void setLatitude(double arg0) {
        ((android.location.Address) real).setLatitude(arg0);
    }

    public void setLocality(java.lang.String arg0) {
        ((android.location.Address) real).setLocality(arg0);
    }

    public void setLongitude(double arg0) {
        ((android.location.Address) real).setLongitude(arg0);
    }

    public void setPhone(java.lang.String arg0) {
        ((android.location.Address) real).setPhone(arg0);
    }

    public void setPostalCode(java.lang.String arg0) {
        ((android.location.Address) real).setPostalCode(arg0);
    }

    public void setPremises(java.lang.String arg0) {
        ((android.location.Address) real).setPremises(arg0);
    }

    public void setSubAdminArea(java.lang.String arg0) {
        ((android.location.Address) real).setSubAdminArea(arg0);
    }

    public void setSubLocality(java.lang.String arg0) {
        ((android.location.Address) real).setSubLocality(arg0);
    }

    public void setSubThoroughfare(java.lang.String arg0) {
        ((android.location.Address) real).setSubThoroughfare(arg0);
    }

    public void setThoroughfare(java.lang.String arg0) {
        ((android.location.Address) real).setThoroughfare(arg0);
    }

    public void setUrl(java.lang.String arg0) {
        ((android.location.Address) real).setUrl(arg0);
    }

    public java.lang.String toString() {
        return ((android.location.Address) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.location.Address) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
