// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adid;

public final class AdId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adid.AdId wrap(android.adservices.adid.AdId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adid.AdId(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adid.AdId getReal() {
        return (android.adservices.adid.AdId) real;
    }

    public android.adservices.adid.AdId unwrap() {
        return getReal();
    }

    public AdId(java.lang.String arg0, boolean arg1) {
        this(new android.adservices.adid.AdId(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.adid.AdId) real).equals(arg0);
    }

    public java.lang.String getAdId() {
        return ((android.adservices.adid.AdId) real).getAdId();
    }

    public int hashCode() {
        return ((android.adservices.adid.AdId) real).hashCode();
    }

    public boolean isLimitAdTrackingEnabled() {
        return ((android.adservices.adid.AdId) real).isLimitAdTrackingEnabled();
    }

    public java.lang.String toString() {
        return ((android.adservices.adid.AdId) real).toString();
    }

    public static final java.lang.String ZERO_OUT = android.adservices.adid.AdId.ZERO_OUT;

}
