// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class TrustedPresentationThresholds {
    private final android.window.TrustedPresentationThresholds real;

    public TrustedPresentationThresholds(android.window.TrustedPresentationThresholds real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.TrustedPresentationThresholds wrap(android.window.TrustedPresentationThresholds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.TrustedPresentationThresholds(real);
    }

    public android.window.TrustedPresentationThresholds unwrap() {
        return real;
    }

    public TrustedPresentationThresholds(float arg0, float arg1, int arg2) {
        this(new android.window.TrustedPresentationThresholds(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getMinAlpha() {
        return real.getMinAlpha();
    }

    public float getMinFractionRendered() {
        return real.getMinFractionRendered();
    }

    public int getStabilityRequirementMillis() {
        return real.getStabilityRequirementMillis();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
