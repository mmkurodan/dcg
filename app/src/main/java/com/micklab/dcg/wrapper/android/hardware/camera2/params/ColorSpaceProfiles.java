// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class ColorSpaceProfiles {
    private final android.hardware.camera2.params.ColorSpaceProfiles real;

    public ColorSpaceProfiles(android.hardware.camera2.params.ColorSpaceProfiles real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceProfiles wrap(android.hardware.camera2.params.ColorSpaceProfiles real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceProfiles(real);
    }

    public android.hardware.camera2.params.ColorSpaceProfiles unwrap() {
        return real;
    }

    public ColorSpaceProfiles(long[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.ColorSpaceProfiles#android.hardware.camera2.params.ColorSpaceProfiles([J)");
    }

    public static final int UNSPECIFIED = android.hardware.camera2.params.ColorSpaceProfiles.UNSPECIFIED;

}
