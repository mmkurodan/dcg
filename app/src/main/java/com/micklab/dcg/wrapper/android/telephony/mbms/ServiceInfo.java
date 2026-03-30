// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class ServiceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.ServiceInfo wrap(android.telephony.mbms.ServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.ServiceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.ServiceInfo getReal() {
        return (android.telephony.mbms.ServiceInfo) real;
    }

    public android.telephony.mbms.ServiceInfo unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#equals(java.lang.Object)");
    }

    public java.lang.CharSequence getNameForLocale(java.util.Locale arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#getNameForLocale(java.util.Locale)");
    }

    public java.lang.String getServiceClassName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#getServiceClassName()");
    }

    public java.lang.String getServiceId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#getServiceId()");
    }

    public java.util.Date getSessionEndTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#getSessionEndTime()");
    }

    public java.util.Date getSessionStartTime() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#getSessionStartTime()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.ServiceInfo#hashCode()");
    }

}
