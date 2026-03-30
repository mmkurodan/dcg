// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adid;

public final class AdId {
    private final android.adservices.adid.AdId real;

    public AdId(android.adservices.adid.AdId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adid.AdId wrap(android.adservices.adid.AdId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adid.AdId(real);
    }

    public android.adservices.adid.AdId unwrap() {
        return real;
    }

    public AdId(java.lang.String arg0, boolean arg1) {
        this(new android.adservices.adid.AdId(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAdId() {
        return real.getAdId();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isLimitAdTrackingEnabled() {
        return real.isLimitAdTrackingEnabled();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final java.lang.String ZERO_OUT = android.adservices.adid.AdId.ZERO_OUT;

}
