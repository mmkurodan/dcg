// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Gainmap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Gainmap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Gainmap wrap(android.graphics.Gainmap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Gainmap(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Gainmap getReal() {
        return (android.graphics.Gainmap) real;
    }

    public android.graphics.Gainmap unwrap() {
        return getReal();
    }

    public Gainmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.graphics.Gainmap(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Gainmap(com.micklab.dcg.wrapper.android.graphics.Gainmap arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        this(new android.graphics.Gainmap(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.Gainmap) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getAlternativeImagePrimaries() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.Gainmap) real).getAlternativeImagePrimaries());
    }

    public float getDisplayRatioForFullHdr() {
        return ((android.graphics.Gainmap) real).getDisplayRatioForFullHdr();
    }

    public float[] getEpsilonHdr() {
        return ((android.graphics.Gainmap) real).getEpsilonHdr();
    }

    public float[] getEpsilonSdr() {
        return ((android.graphics.Gainmap) real).getEpsilonSdr();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getGainmapContents() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.Gainmap) real).getGainmapContents());
    }

    public int getGainmapDirection() {
        return ((android.graphics.Gainmap) real).getGainmapDirection();
    }

    public float[] getGamma() {
        return ((android.graphics.Gainmap) real).getGamma();
    }

    public float getMinDisplayRatioForHdrTransition() {
        return ((android.graphics.Gainmap) real).getMinDisplayRatioForHdrTransition();
    }

    public float[] getRatioMax() {
        return ((android.graphics.Gainmap) real).getRatioMax();
    }

    public float[] getRatioMin() {
        return ((android.graphics.Gainmap) real).getRatioMin();
    }

    public void setAlternativeImagePrimaries(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        ((android.graphics.Gainmap) real).setAlternativeImagePrimaries(arg0 == null ? null : arg0.getReal());
    }

    public void setDisplayRatioForFullHdr(float arg0) {
        ((android.graphics.Gainmap) real).setDisplayRatioForFullHdr(arg0);
    }

    public void setEpsilonHdr(float arg0, float arg1, float arg2) {
        ((android.graphics.Gainmap) real).setEpsilonHdr(arg0, arg1, arg2);
    }

    public void setEpsilonSdr(float arg0, float arg1, float arg2) {
        ((android.graphics.Gainmap) real).setEpsilonSdr(arg0, arg1, arg2);
    }

    public void setGainmapContents(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        ((android.graphics.Gainmap) real).setGainmapContents(arg0 == null ? null : arg0.getReal());
    }

    public void setGainmapDirection(int arg0) {
        ((android.graphics.Gainmap) real).setGainmapDirection(arg0);
    }

    public void setGamma(float arg0, float arg1, float arg2) {
        ((android.graphics.Gainmap) real).setGamma(arg0, arg1, arg2);
    }

    public void setMinDisplayRatioForHdrTransition(float arg0) {
        ((android.graphics.Gainmap) real).setMinDisplayRatioForHdrTransition(arg0);
    }

    public void setRatioMax(float arg0, float arg1, float arg2) {
        ((android.graphics.Gainmap) real).setRatioMax(arg0, arg1, arg2);
    }

    public void setRatioMin(float arg0, float arg1, float arg2) {
        ((android.graphics.Gainmap) real).setRatioMin(arg0, arg1, arg2);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.Gainmap) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int GAINMAP_DIRECTION_HDR_TO_SDR = android.graphics.Gainmap.GAINMAP_DIRECTION_HDR_TO_SDR;
    public static final int GAINMAP_DIRECTION_SDR_TO_HDR = android.graphics.Gainmap.GAINMAP_DIRECTION_SDR_TO_HDR;

}
