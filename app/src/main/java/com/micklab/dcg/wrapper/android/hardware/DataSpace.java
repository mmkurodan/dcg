// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class DataSpace {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataSpace(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.DataSpace wrap(android.hardware.DataSpace real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.DataSpace(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.DataSpace getReal() {
        return (android.hardware.DataSpace) real;
    }

    public android.hardware.DataSpace unwrap() {
        return getReal();
    }

    public static int getRange(int arg0) {
        return android.hardware.DataSpace.getRange(arg0);
    }

    public static int getStandard(int arg0) {
        return android.hardware.DataSpace.getStandard(arg0);
    }

    public static int getTransfer(int arg0) {
        return android.hardware.DataSpace.getTransfer(arg0);
    }

    public static int pack(int arg0, int arg1, int arg2) {
        return android.hardware.DataSpace.pack(arg0, arg1, arg2);
    }

    public static final int DATASPACE_ADOBE_RGB = android.hardware.DataSpace.DATASPACE_ADOBE_RGB;
    public static final int DATASPACE_BT2020 = android.hardware.DataSpace.DATASPACE_BT2020;
    public static final int DATASPACE_BT2020_HLG = android.hardware.DataSpace.DATASPACE_BT2020_HLG;
    public static final int DATASPACE_BT2020_PQ = android.hardware.DataSpace.DATASPACE_BT2020_PQ;
    public static final int DATASPACE_BT601_525 = android.hardware.DataSpace.DATASPACE_BT601_525;
    public static final int DATASPACE_BT601_625 = android.hardware.DataSpace.DATASPACE_BT601_625;
    public static final int DATASPACE_BT709 = android.hardware.DataSpace.DATASPACE_BT709;
    public static final int DATASPACE_DCI_P3 = android.hardware.DataSpace.DATASPACE_DCI_P3;
    public static final int DATASPACE_DEPTH = android.hardware.DataSpace.DATASPACE_DEPTH;
    public static final int DATASPACE_DISPLAY_P3 = android.hardware.DataSpace.DATASPACE_DISPLAY_P3;
    public static final int DATASPACE_DYNAMIC_DEPTH = android.hardware.DataSpace.DATASPACE_DYNAMIC_DEPTH;
    public static final int DATASPACE_HEIF = android.hardware.DataSpace.DATASPACE_HEIF;
    public static final int DATASPACE_HEIF_ULTRAHDR = android.hardware.DataSpace.DATASPACE_HEIF_ULTRAHDR;
    public static final int DATASPACE_JFIF = android.hardware.DataSpace.DATASPACE_JFIF;
    public static final int DATASPACE_JPEG_R = android.hardware.DataSpace.DATASPACE_JPEG_R;
    public static final int DATASPACE_SCRGB = android.hardware.DataSpace.DATASPACE_SCRGB;
    public static final int DATASPACE_SCRGB_LINEAR = android.hardware.DataSpace.DATASPACE_SCRGB_LINEAR;
    public static final int DATASPACE_SRGB = android.hardware.DataSpace.DATASPACE_SRGB;
    public static final int DATASPACE_SRGB_LINEAR = android.hardware.DataSpace.DATASPACE_SRGB_LINEAR;
    public static final int DATASPACE_UNKNOWN = android.hardware.DataSpace.DATASPACE_UNKNOWN;
    public static final int RANGE_EXTENDED = android.hardware.DataSpace.RANGE_EXTENDED;
    public static final int RANGE_FULL = android.hardware.DataSpace.RANGE_FULL;
    public static final int RANGE_LIMITED = android.hardware.DataSpace.RANGE_LIMITED;
    public static final int RANGE_UNSPECIFIED = android.hardware.DataSpace.RANGE_UNSPECIFIED;
    public static final int STANDARD_ADOBE_RGB = android.hardware.DataSpace.STANDARD_ADOBE_RGB;
    public static final int STANDARD_BT2020 = android.hardware.DataSpace.STANDARD_BT2020;
    public static final int STANDARD_BT2020_CONSTANT_LUMINANCE = android.hardware.DataSpace.STANDARD_BT2020_CONSTANT_LUMINANCE;
    public static final int STANDARD_BT470M = android.hardware.DataSpace.STANDARD_BT470M;
    public static final int STANDARD_BT601_525 = android.hardware.DataSpace.STANDARD_BT601_525;
    public static final int STANDARD_BT601_525_UNADJUSTED = android.hardware.DataSpace.STANDARD_BT601_525_UNADJUSTED;
    public static final int STANDARD_BT601_625 = android.hardware.DataSpace.STANDARD_BT601_625;
    public static final int STANDARD_BT601_625_UNADJUSTED = android.hardware.DataSpace.STANDARD_BT601_625_UNADJUSTED;
    public static final int STANDARD_BT709 = android.hardware.DataSpace.STANDARD_BT709;
    public static final int STANDARD_DCI_P3 = android.hardware.DataSpace.STANDARD_DCI_P3;
    public static final int STANDARD_FILM = android.hardware.DataSpace.STANDARD_FILM;
    public static final int STANDARD_UNSPECIFIED = android.hardware.DataSpace.STANDARD_UNSPECIFIED;
    public static final int TRANSFER_GAMMA2_2 = android.hardware.DataSpace.TRANSFER_GAMMA2_2;
    public static final int TRANSFER_GAMMA2_6 = android.hardware.DataSpace.TRANSFER_GAMMA2_6;
    public static final int TRANSFER_GAMMA2_8 = android.hardware.DataSpace.TRANSFER_GAMMA2_8;
    public static final int TRANSFER_HLG = android.hardware.DataSpace.TRANSFER_HLG;
    public static final int TRANSFER_LINEAR = android.hardware.DataSpace.TRANSFER_LINEAR;
    public static final int TRANSFER_SMPTE_170M = android.hardware.DataSpace.TRANSFER_SMPTE_170M;
    public static final int TRANSFER_SRGB = android.hardware.DataSpace.TRANSFER_SRGB;
    public static final int TRANSFER_ST2084 = android.hardware.DataSpace.TRANSFER_ST2084;
    public static final int TRANSFER_UNSPECIFIED = android.hardware.DataSpace.TRANSFER_UNSPECIFIED;

}
