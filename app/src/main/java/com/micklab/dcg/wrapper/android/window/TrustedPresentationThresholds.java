// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class TrustedPresentationThresholds {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrustedPresentationThresholds(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.TrustedPresentationThresholds wrap(android.window.TrustedPresentationThresholds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.TrustedPresentationThresholds(real, (__DcgwBridgeToken) null);
    }

    public android.window.TrustedPresentationThresholds getReal() {
        return (android.window.TrustedPresentationThresholds) real;
    }

    public android.window.TrustedPresentationThresholds unwrap() {
        return getReal();
    }

    public TrustedPresentationThresholds(float arg0, float arg1, int arg2) {
        this(new android.window.TrustedPresentationThresholds(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.window.TrustedPresentationThresholds) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.window.TrustedPresentationThresholds) real).equals(arg0);
    }

    public float getMinAlpha() {
        return ((android.window.TrustedPresentationThresholds) real).getMinAlpha();
    }

    public float getMinFractionRendered() {
        return ((android.window.TrustedPresentationThresholds) real).getMinFractionRendered();
    }

    public int getStabilityRequirementMillis() {
        return ((android.window.TrustedPresentationThresholds) real).getStabilityRequirementMillis();
    }

    public int hashCode() {
        return ((android.window.TrustedPresentationThresholds) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.window.TrustedPresentationThresholds) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.window.TrustedPresentationThresholds) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
