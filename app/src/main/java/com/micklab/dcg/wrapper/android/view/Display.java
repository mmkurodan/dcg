// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Display {
    private final android.view.Display real;

    public Display(android.view.Display real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Display wrap(android.view.Display real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Display(real);
    }

    public android.view.Display unwrap() {
        return real;
    }

    public long getAppVsyncOffsetNanos() {
        return real.getAppVsyncOffsetNanos();
    }

    public void getCurrentSizeRange(com.micklab.dcg.wrapper.android.graphics.Point arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1) {
        real.getCurrentSizeRange(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.DisplayCutout getCutout() {
        return com.micklab.dcg.wrapper.android.view.DisplayCutout.wrap(real.getCutout());
    }

    public com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo getDeviceProductInfo() {
        return com.micklab.dcg.wrapper.android.hardware.display.DeviceProductInfo.wrap(real.getDeviceProductInfo());
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public int getFlags() {
        return real.getFlags();
    }

    public com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities getHdrCapabilities() {
        return com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities.wrap(real.getHdrCapabilities());
    }

    public float getHdrSdrRatio() {
        return real.getHdrSdrRatio();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public void getMetrics(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        real.getMetrics(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.Display.Mode getMode() {
        return com.micklab.dcg.wrapper.android.view.Display.Mode.wrap(real.getMode());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getOrientation() {
        return real.getOrientation();
    }

    public com.micklab.dcg.wrapper.android.hardware.OverlayProperties getOverlaySupport() {
        return com.micklab.dcg.wrapper.android.hardware.OverlayProperties.wrap(real.getOverlaySupport());
    }

    public int getPixelFormat() {
        return real.getPixelFormat();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getPreferredWideGamutColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getPreferredWideGamutColorSpace());
    }

    public long getPresentationDeadlineNanos() {
        return real.getPresentationDeadlineNanos();
    }

    public void getRealMetrics(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        real.getRealMetrics(arg0 == null ? null : arg0.unwrap());
    }

    public void getRealSize(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        real.getRealSize(arg0 == null ? null : arg0.unwrap());
    }

    public void getRectSize(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getRectSize(arg0 == null ? null : arg0.unwrap());
    }

    public float getRefreshRate() {
        return real.getRefreshRate();
    }

    public int getRotation() {
        return real.getRotation();
    }

    public com.micklab.dcg.wrapper.android.view.RoundedCorner getRoundedCorner(int arg0) {
        return com.micklab.dcg.wrapper.android.view.RoundedCorner.wrap(real.getRoundedCorner(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.DisplayShape getShape() {
        return com.micklab.dcg.wrapper.android.view.DisplayShape.wrap(real.getShape());
    }

    public void getSize(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        real.getSize(arg0 == null ? null : arg0.unwrap());
    }

    public int getState() {
        return real.getState();
    }

    public android.view.Display.Mode[] getSupportedModes() {
        return real.getSupportedModes();
    }

    public float[] getSupportedRefreshRates() {
        return real.getSupportedRefreshRates();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean isHdr() {
        return real.isHdr();
    }

    public boolean isHdrSdrRatioAvailable() {
        return real.isHdrSdrRatioAvailable();
    }

    public boolean isMinimalPostProcessingSupported() {
        return real.isMinimalPostProcessingSupported();
    }

    public boolean isValid() {
        return real.isValid();
    }

    public boolean isWideColorGamut() {
        return real.isWideColorGamut();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int DEFAULT_DISPLAY = android.view.Display.DEFAULT_DISPLAY;
    public static final int FLAG_PRESENTATION = android.view.Display.FLAG_PRESENTATION;
    public static final int FLAG_PRIVATE = android.view.Display.FLAG_PRIVATE;
    public static final int FLAG_ROUND = android.view.Display.FLAG_ROUND;
    public static final int FLAG_SECURE = android.view.Display.FLAG_SECURE;
    public static final int FLAG_SUPPORTS_PROTECTED_BUFFERS = android.view.Display.FLAG_SUPPORTS_PROTECTED_BUFFERS;
    public static final int INVALID_DISPLAY = android.view.Display.INVALID_DISPLAY;
    public static final int STATE_DOZE = android.view.Display.STATE_DOZE;
    public static final int STATE_DOZE_SUSPEND = android.view.Display.STATE_DOZE_SUSPEND;
    public static final int STATE_OFF = android.view.Display.STATE_OFF;
    public static final int STATE_ON = android.view.Display.STATE_ON;
    public static final int STATE_ON_SUSPEND = android.view.Display.STATE_ON_SUSPEND;
    public static final int STATE_UNKNOWN = android.view.Display.STATE_UNKNOWN;
    public static final int STATE_VR = android.view.Display.STATE_VR;

    public static final class HdrCapabilities {
        private final android.view.Display.HdrCapabilities real;

        public HdrCapabilities(android.view.Display.HdrCapabilities real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities wrap(android.view.Display.HdrCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Display.HdrCapabilities(real);
        }

        public android.view.Display.HdrCapabilities unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public float getDesiredMaxAverageLuminance() {
            return real.getDesiredMaxAverageLuminance();
        }

        public float getDesiredMaxLuminance() {
            return real.getDesiredMaxLuminance();
        }

        public float getDesiredMinLuminance() {
            return real.getDesiredMinLuminance();
        }

        public int[] getSupportedHdrTypes() {
            return real.getSupportedHdrTypes();
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

        public static final int HDR_TYPE_DOLBY_VISION = android.view.Display.HdrCapabilities.HDR_TYPE_DOLBY_VISION;
        public static final int HDR_TYPE_HDR10 = android.view.Display.HdrCapabilities.HDR_TYPE_HDR10;
        public static final int HDR_TYPE_HDR10_PLUS = android.view.Display.HdrCapabilities.HDR_TYPE_HDR10_PLUS;
        public static final int HDR_TYPE_HLG = android.view.Display.HdrCapabilities.HDR_TYPE_HLG;
        public static final int HDR_TYPE_INVALID = android.view.Display.HdrCapabilities.HDR_TYPE_INVALID;
        public static final float INVALID_LUMINANCE = android.view.Display.HdrCapabilities.INVALID_LUMINANCE;

    }
    public static final class Mode {
        private final android.view.Display.Mode real;

        public Mode(android.view.Display.Mode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Display.Mode wrap(android.view.Display.Mode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Display.Mode(real);
        }

        public android.view.Display.Mode unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public float[] getAlternativeRefreshRates() {
            return real.getAlternativeRefreshRates();
        }

        public int getModeId() {
            return real.getModeId();
        }

        public int getPhysicalHeight() {
            return real.getPhysicalHeight();
        }

        public int getPhysicalWidth() {
            return real.getPhysicalWidth();
        }

        public float getRefreshRate() {
            return real.getRefreshRate();
        }

        public int[] getSupportedHdrTypes() {
            return real.getSupportedHdrTypes();
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
}
