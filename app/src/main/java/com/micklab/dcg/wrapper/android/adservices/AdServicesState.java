// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices;

public final class AdServicesState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdServicesState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.AdServicesState wrap(android.adservices.AdServicesState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.AdServicesState(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.AdServicesState getReal() {
        return (android.adservices.AdServicesState) real;
    }

    public android.adservices.AdServicesState unwrap() {
        return getReal();
    }

    public static boolean isAdServicesStateEnabled() {
        return android.adservices.AdServicesState.isAdServicesStateEnabled();
    }

}
