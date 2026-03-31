// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Display {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Display(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Display wrap(android.view.Display real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Display(real, (__DcgwBridgeToken) null);
    }

    public android.view.Display getReal() {
        return (android.view.Display) real;
    }

    public android.view.Display unwrap() {
        return getReal();
    }

    public long getAppVsyncOffsetNanos() {
        return ((android.view.Display) real).getAppVsyncOffsetNanos();
    }

    public void getCurrentSizeRange(com.micklab.dcg.wrapper.android.graphics.Point arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1) {
        ((android.view.Display) real).getCurrentSizeRange(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.DisplayCutout getCutout() {
        return com.micklab.dcg.wrapper.android.view.DisplayCutout.wrap(((android.view.Display) real).getCutout());
    }

    public com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo getDeviceProductInfo() {
        return com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo.wrap(((android.view.Display) real).getDeviceProductInfo());
    }

    public int getDisplayId() {
        return ((android.view.Display) real).getDisplayId();
    }

    public int getFlags() {
        return ((android.view.Display) real).getFlags();
    }

    public com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities getHdrCapabilities() {
        return com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities.wrap(((android.view.Display) real).getHdrCapabilities());
    }

    public float getHdrSdrRatio() {
        return ((android.view.Display) real).getHdrSdrRatio();
    }

    public int getHeight() {
        return ((android.view.Display) real).getHeight();
    }

    public float getHighestHdrSdrRatio() {
        return ((android.view.Display) real).getHighestHdrSdrRatio();
    }

    public void getMetrics(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        ((android.view.Display) real).getMetrics(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.Display.Mode getMode() {
        return com.micklab.dcg.wrapper.android.view.Display.Mode.wrap(((android.view.Display) real).getMode());
    }

    public java.lang.String getName() {
        return ((android.view.Display) real).getName();
    }

    public int getOrientation() {
        return ((android.view.Display) real).getOrientation();
    }

    public com.micklab.dcg.wrapper.android.hardware.OverlayProperties getOverlaySupport() {
        return com.micklab.dcg.wrapper.android.hardware.OverlayProperties.wrap(((android.view.Display) real).getOverlaySupport());
    }

    public int getPixelFormat() {
        return ((android.view.Display) real).getPixelFormat();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getPreferredWideGamutColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.view.Display) real).getPreferredWideGamutColorSpace());
    }

    public long getPresentationDeadlineNanos() {
        return ((android.view.Display) real).getPresentationDeadlineNanos();
    }

    public void getRealMetrics(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        ((android.view.Display) real).getRealMetrics(arg0 == null ? null : arg0.getReal());
    }

    public void getRealSize(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        ((android.view.Display) real).getRealSize(arg0 == null ? null : arg0.getReal());
    }

    public void getRectSize(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.Display) real).getRectSize(arg0 == null ? null : arg0.getReal());
    }

    public float getRefreshRate() {
        return ((android.view.Display) real).getRefreshRate();
    }

    public int getRotation() {
        return ((android.view.Display) real).getRotation();
    }

    public com.micklab.dcg.wrapper.android.view.RoundedCorner getRoundedCorner(int arg0) {
        return com.micklab.dcg.wrapper.android.view.RoundedCorner.wrap(((android.view.Display) real).getRoundedCorner(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.DisplayShape getShape() {
        return com.micklab.dcg.wrapper.android.view.DisplayShape.wrap(((android.view.Display) real).getShape());
    }

    public void getSize(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        ((android.view.Display) real).getSize(arg0 == null ? null : arg0.getReal());
    }

    public int getState() {
        return ((android.view.Display) real).getState();
    }

    public float getSuggestedFrameRate(int arg0) {
        return ((android.view.Display) real).getSuggestedFrameRate(arg0);
    }

    public android.view.Display.Mode[] getSupportedModes() {
        return ((android.view.Display) real).getSupportedModes();
    }

    public float[] getSupportedRefreshRates() {
        return ((android.view.Display) real).getSupportedRefreshRates();
    }

    public int getWidth() {
        return ((android.view.Display) real).getWidth();
    }

    public boolean hasArrSupport() {
        return ((android.view.Display) real).hasArrSupport();
    }

    public boolean isHdr() {
        return ((android.view.Display) real).isHdr();
    }

    public boolean isHdrSdrRatioAvailable() {
        return ((android.view.Display) real).isHdrSdrRatioAvailable();
    }

    public boolean isMinimalPostProcessingSupported() {
        return ((android.view.Display) real).isMinimalPostProcessingSupported();
    }

    public boolean isValid() {
        return ((android.view.Display) real).isValid();
    }

    public boolean isWideColorGamut() {
        return ((android.view.Display) real).isWideColorGamut();
    }

    public java.lang.String toString() {
        return ((android.view.Display) real).toString();
    }

    public static final int DEFAULT_DISPLAY = android.view.Display.DEFAULT_DISPLAY;
    public static final int FLAG_PRESENTATION = android.view.Display.FLAG_PRESENTATION;
    public static final int FLAG_PRIVATE = android.view.Display.FLAG_PRIVATE;
    public static final int FLAG_ROUND = android.view.Display.FLAG_ROUND;
    public static final int FLAG_SECURE = android.view.Display.FLAG_SECURE;
    public static final int FLAG_SUPPORTS_PROTECTED_BUFFERS = android.view.Display.FLAG_SUPPORTS_PROTECTED_BUFFERS;
    public static final int FRAME_RATE_CATEGORY_HIGH = android.view.Display.FRAME_RATE_CATEGORY_HIGH;
    public static final int FRAME_RATE_CATEGORY_NORMAL = android.view.Display.FRAME_RATE_CATEGORY_NORMAL;
    public static final int INVALID_DISPLAY = android.view.Display.INVALID_DISPLAY;
    public static final int STATE_DOZE = android.view.Display.STATE_DOZE;
    public static final int STATE_DOZE_SUSPEND = android.view.Display.STATE_DOZE_SUSPEND;
    public static final int STATE_OFF = android.view.Display.STATE_OFF;
    public static final int STATE_ON = android.view.Display.STATE_ON;
    public static final int STATE_ON_SUSPEND = android.view.Display.STATE_ON_SUSPEND;
    public static final int STATE_UNKNOWN = android.view.Display.STATE_UNKNOWN;
    public static final int STATE_VR = android.view.Display.STATE_VR;

    public static final class HdrCapabilities {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HdrCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities wrap(android.view.Display.HdrCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities(real, (__DcgwBridgeToken) null);
        }

        public android.view.Display.HdrCapabilities getReal() {
            return (android.view.Display.HdrCapabilities) real;
        }

        public android.view.Display.HdrCapabilities unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.Display.HdrCapabilities) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.view.Display.HdrCapabilities) real).equals(arg0);
        }

        public float getDesiredMaxAverageLuminance() {
            return ((android.view.Display.HdrCapabilities) real).getDesiredMaxAverageLuminance();
        }

        public float getDesiredMaxLuminance() {
            return ((android.view.Display.HdrCapabilities) real).getDesiredMaxLuminance();
        }

        public float getDesiredMinLuminance() {
            return ((android.view.Display.HdrCapabilities) real).getDesiredMinLuminance();
        }

        public int[] getSupportedHdrTypes() {
            return ((android.view.Display.HdrCapabilities) real).getSupportedHdrTypes();
        }

        public int hashCode() {
            return ((android.view.Display.HdrCapabilities) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.view.Display.HdrCapabilities) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.Display.HdrCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int HDR_TYPE_DOLBY_VISION = android.view.Display.HdrCapabilities.HDR_TYPE_DOLBY_VISION;
        public static final int HDR_TYPE_HDR10 = android.view.Display.HdrCapabilities.HDR_TYPE_HDR10;
        public static final int HDR_TYPE_HDR10_PLUS = android.view.Display.HdrCapabilities.HDR_TYPE_HDR10_PLUS;
        public static final int HDR_TYPE_HLG = android.view.Display.HdrCapabilities.HDR_TYPE_HLG;
        public static final int HDR_TYPE_INVALID = android.view.Display.HdrCapabilities.HDR_TYPE_INVALID;
        public static final float INVALID_LUMINANCE = android.view.Display.HdrCapabilities.INVALID_LUMINANCE;

    }
    public static final class Mode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Mode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Display.Mode wrap(android.view.Display.Mode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Display.Mode(real, (__DcgwBridgeToken) null);
        }

        public android.view.Display.Mode getReal() {
            return (android.view.Display.Mode) real;
        }

        public android.view.Display.Mode unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.view.Display.Mode) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.view.Display.Mode) real).equals(arg0);
        }

        public float[] getAlternativeRefreshRates() {
            return ((android.view.Display.Mode) real).getAlternativeRefreshRates();
        }

        public int getModeId() {
            return ((android.view.Display.Mode) real).getModeId();
        }

        public int getPhysicalHeight() {
            return ((android.view.Display.Mode) real).getPhysicalHeight();
        }

        public int getPhysicalWidth() {
            return ((android.view.Display.Mode) real).getPhysicalWidth();
        }

        public float getRefreshRate() {
            return ((android.view.Display.Mode) real).getRefreshRate();
        }

        public int[] getSupportedHdrTypes() {
            return ((android.view.Display.Mode) real).getSupportedHdrTypes();
        }

        public int hashCode() {
            return ((android.view.Display.Mode) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.view.Display.Mode) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.Display.Mode) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
