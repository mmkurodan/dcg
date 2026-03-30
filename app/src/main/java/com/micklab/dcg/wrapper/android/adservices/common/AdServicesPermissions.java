// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.common;

public final class AdServicesPermissions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdServicesPermissions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.common.AdServicesPermissions wrap(android.adservices.common.AdServicesPermissions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.common.AdServicesPermissions(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.common.AdServicesPermissions getReal() {
        return (android.adservices.common.AdServicesPermissions) real;
    }

    public android.adservices.common.AdServicesPermissions unwrap() {
        return getReal();
    }

    public static final java.lang.String ACCESS_ADSERVICES_AD_ID = android.adservices.common.AdServicesPermissions.ACCESS_ADSERVICES_AD_ID;
    public static final java.lang.String ACCESS_ADSERVICES_AD_SELECTION = android.adservices.common.AdServicesPermissions.ACCESS_ADSERVICES_AD_SELECTION;
    public static final java.lang.String ACCESS_ADSERVICES_ATTRIBUTION = android.adservices.common.AdServicesPermissions.ACCESS_ADSERVICES_ATTRIBUTION;
    public static final java.lang.String ACCESS_ADSERVICES_CUSTOM_AUDIENCE = android.adservices.common.AdServicesPermissions.ACCESS_ADSERVICES_CUSTOM_AUDIENCE;
    public static final java.lang.String ACCESS_ADSERVICES_PROTECTED_SIGNALS = android.adservices.common.AdServicesPermissions.ACCESS_ADSERVICES_PROTECTED_SIGNALS;
    public static final java.lang.String ACCESS_ADSERVICES_TOPICS = android.adservices.common.AdServicesPermissions.ACCESS_ADSERVICES_TOPICS;

}
