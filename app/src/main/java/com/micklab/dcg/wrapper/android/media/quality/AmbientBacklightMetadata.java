// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class AmbientBacklightMetadata {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AmbientBacklightMetadata(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightMetadata wrap(android.media.quality.AmbientBacklightMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightMetadata(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.AmbientBacklightMetadata getReal() {
        return (android.media.quality.AmbientBacklightMetadata) real;
    }

    public android.media.quality.AmbientBacklightMetadata unwrap() {
        return getReal();
    }

    public AmbientBacklightMetadata(java.lang.String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        this(new android.media.quality.AmbientBacklightMetadata(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.quality.AmbientBacklightMetadata) real).describeContents();
    }

    public int getColorFormat() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getColorFormat();
    }

    public int getCompressionAlgorithm() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getCompressionAlgorithm();
    }

    public int getHorizontalZonesCount() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getHorizontalZonesCount();
    }

    public java.lang.String getPackageName() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getPackageName();
    }

    public int getSource() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getSource();
    }

    public int getVerticalZonesCount() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getVerticalZonesCount();
    }

    public int[] getZoneColors() {
        return ((android.media.quality.AmbientBacklightMetadata) real).getZoneColors();
    }

    public java.lang.String toString() {
        return ((android.media.quality.AmbientBacklightMetadata) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.AmbientBacklightMetadata) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ALGORITHM_NONE = android.media.quality.AmbientBacklightMetadata.ALGORITHM_NONE;
    public static final int ALGORITHM_RLE = android.media.quality.AmbientBacklightMetadata.ALGORITHM_RLE;

}
