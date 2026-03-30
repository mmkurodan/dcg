// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class ColorSpaceProfiles {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorSpaceProfiles(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceProfiles wrap(android.hardware.camera2.params.ColorSpaceProfiles real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceProfiles(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.ColorSpaceProfiles getReal() {
        return (android.hardware.camera2.params.ColorSpaceProfiles) real;
    }

    public android.hardware.camera2.params.ColorSpaceProfiles unwrap() {
        return getReal();
    }

    public ColorSpaceProfiles(long[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.ColorSpaceProfiles#android.hardware.camera2.params.ColorSpaceProfiles([J)");
    }

    public static final int UNSPECIFIED = android.hardware.camera2.params.ColorSpaceProfiles.UNSPECIFIED;

}
