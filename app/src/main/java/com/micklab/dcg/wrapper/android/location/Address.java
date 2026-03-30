// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class Address {
    private final android.location.Address real;

    public Address(android.location.Address real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.Address wrap(android.location.Address real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.Address(real);
    }

    public android.location.Address unwrap() {
        return real;
    }

    public Address(java.util.Locale arg0) {
        this(new android.location.Address(arg0));
    }

    public void clearLatitude() {
        real.clearLatitude();
    }

    public void clearLongitude() {
        real.clearLongitude();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getAddressLine(int arg0) {
        return real.getAddressLine(arg0);
    }

    public java.lang.String getAdminArea() {
        return real.getAdminArea();
    }

    public java.lang.String getCountryCode() {
        return real.getCountryCode();
    }

    public java.lang.String getCountryName() {
        return real.getCountryName();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getFeatureName() {
        return real.getFeatureName();
    }

    public double getLatitude() {
        return real.getLatitude();
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public java.lang.String getLocality() {
        return real.getLocality();
    }

    public double getLongitude() {
        return real.getLongitude();
    }

    public int getMaxAddressLineIndex() {
        return real.getMaxAddressLineIndex();
    }

    public java.lang.String getPhone() {
        return real.getPhone();
    }

    public java.lang.String getPostalCode() {
        return real.getPostalCode();
    }

    public java.lang.String getPremises() {
        return real.getPremises();
    }

    public java.lang.String getSubAdminArea() {
        return real.getSubAdminArea();
    }

    public java.lang.String getSubLocality() {
        return real.getSubLocality();
    }

    public java.lang.String getSubThoroughfare() {
        return real.getSubThoroughfare();
    }

    public java.lang.String getThoroughfare() {
        return real.getThoroughfare();
    }

    public java.lang.String getUrl() {
        return real.getUrl();
    }

    public boolean hasLatitude() {
        return real.hasLatitude();
    }

    public boolean hasLongitude() {
        return real.hasLongitude();
    }

    public void setAddressLine(int arg0, java.lang.String arg1) {
        real.setAddressLine(arg0, arg1);
    }

    public void setAdminArea(java.lang.String arg0) {
        real.setAdminArea(arg0);
    }

    public void setCountryCode(java.lang.String arg0) {
        real.setCountryCode(arg0);
    }

    public void setCountryName(java.lang.String arg0) {
        real.setCountryName(arg0);
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setExtras(arg0 == null ? null : arg0.unwrap());
    }

    public void setFeatureName(java.lang.String arg0) {
        real.setFeatureName(arg0);
    }

    public void setLatitude(double arg0) {
        real.setLatitude(arg0);
    }

    public void setLocality(java.lang.String arg0) {
        real.setLocality(arg0);
    }

    public void setLongitude(double arg0) {
        real.setLongitude(arg0);
    }

    public void setPhone(java.lang.String arg0) {
        real.setPhone(arg0);
    }

    public void setPostalCode(java.lang.String arg0) {
        real.setPostalCode(arg0);
    }

    public void setPremises(java.lang.String arg0) {
        real.setPremises(arg0);
    }

    public void setSubAdminArea(java.lang.String arg0) {
        real.setSubAdminArea(arg0);
    }

    public void setSubLocality(java.lang.String arg0) {
        real.setSubLocality(arg0);
    }

    public void setSubThoroughfare(java.lang.String arg0) {
        real.setSubThoroughfare(arg0);
    }

    public void setThoroughfare(java.lang.String arg0) {
        real.setThoroughfare(arg0);
    }

    public void setUrl(java.lang.String arg0) {
        real.setUrl(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
