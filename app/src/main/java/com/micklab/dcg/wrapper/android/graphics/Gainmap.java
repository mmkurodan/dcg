// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Gainmap {
    private final android.graphics.Gainmap real;

    public Gainmap(android.graphics.Gainmap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Gainmap wrap(android.graphics.Gainmap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Gainmap(real);
    }

    public android.graphics.Gainmap unwrap() {
        return real;
    }

    public Gainmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.graphics.Gainmap(arg0 == null ? null : arg0.unwrap()));
    }

    public Gainmap(com.micklab.dcg.wrapper.android.graphics.Gainmap arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        this(new android.graphics.Gainmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public float getDisplayRatioForFullHdr() {
        return real.getDisplayRatioForFullHdr();
    }

    public float[] getEpsilonHdr() {
        return real.getEpsilonHdr();
    }

    public float[] getEpsilonSdr() {
        return real.getEpsilonSdr();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getGainmapContents() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getGainmapContents());
    }

    public float[] getGamma() {
        return real.getGamma();
    }

    public float getMinDisplayRatioForHdrTransition() {
        return real.getMinDisplayRatioForHdrTransition();
    }

    public float[] getRatioMax() {
        return real.getRatioMax();
    }

    public float[] getRatioMin() {
        return real.getRatioMin();
    }

    public void setDisplayRatioForFullHdr(float arg0) {
        real.setDisplayRatioForFullHdr(arg0);
    }

    public void setEpsilonHdr(float arg0, float arg1, float arg2) {
        real.setEpsilonHdr(arg0, arg1, arg2);
    }

    public void setEpsilonSdr(float arg0, float arg1, float arg2) {
        real.setEpsilonSdr(arg0, arg1, arg2);
    }

    public void setGainmapContents(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        real.setGainmapContents(arg0 == null ? null : arg0.unwrap());
    }

    public void setGamma(float arg0, float arg1, float arg2) {
        real.setGamma(arg0, arg1, arg2);
    }

    public void setMinDisplayRatioForHdrTransition(float arg0) {
        real.setMinDisplayRatioForHdrTransition(arg0);
    }

    public void setRatioMax(float arg0, float arg1, float arg2) {
        real.setRatioMax(arg0, arg1, arg2);
    }

    public void setRatioMin(float arg0, float arg1, float arg2) {
        real.setRatioMin(arg0, arg1, arg2);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
