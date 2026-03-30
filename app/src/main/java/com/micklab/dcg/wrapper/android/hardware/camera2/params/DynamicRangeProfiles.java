// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class DynamicRangeProfiles {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DynamicRangeProfiles(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.DynamicRangeProfiles wrap(android.hardware.camera2.params.DynamicRangeProfiles real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.DynamicRangeProfiles(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.DynamicRangeProfiles getReal() {
        return (android.hardware.camera2.params.DynamicRangeProfiles) real;
    }

    public android.hardware.camera2.params.DynamicRangeProfiles unwrap() {
        return getReal();
    }

    public DynamicRangeProfiles(long[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.DynamicRangeProfiles#android.hardware.camera2.params.DynamicRangeProfiles([J)");
    }

    public boolean isExtraLatencyPresent(long arg0) {
        return ((android.hardware.camera2.params.DynamicRangeProfiles) real).isExtraLatencyPresent(arg0);
    }

    public static final long DOLBY_VISION_10B_HDR_OEM = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_10B_HDR_OEM;
    public static final long DOLBY_VISION_10B_HDR_OEM_PO = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_10B_HDR_OEM_PO;
    public static final long DOLBY_VISION_10B_HDR_REF = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_10B_HDR_REF;
    public static final long DOLBY_VISION_10B_HDR_REF_PO = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_10B_HDR_REF_PO;
    public static final long DOLBY_VISION_8B_HDR_OEM = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_8B_HDR_OEM;
    public static final long DOLBY_VISION_8B_HDR_OEM_PO = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_8B_HDR_OEM_PO;
    public static final long DOLBY_VISION_8B_HDR_REF = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_8B_HDR_REF;
    public static final long DOLBY_VISION_8B_HDR_REF_PO = android.hardware.camera2.params.DynamicRangeProfiles.DOLBY_VISION_8B_HDR_REF_PO;
    public static final long HDR10 = android.hardware.camera2.params.DynamicRangeProfiles.HDR10;
    public static final long HDR10_PLUS = android.hardware.camera2.params.DynamicRangeProfiles.HDR10_PLUS;
    public static final long HLG10 = android.hardware.camera2.params.DynamicRangeProfiles.HLG10;
    public static final long PUBLIC_MAX = android.hardware.camera2.params.DynamicRangeProfiles.PUBLIC_MAX;
    public static final long STANDARD = android.hardware.camera2.params.DynamicRangeProfiles.STANDARD;

}
