// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpStorageInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MtpStorageInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo wrap(android.mtp.MtpStorageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo(real, (__DcgwBridgeToken) null);
    }

    public android.mtp.MtpStorageInfo getReal() {
        return (android.mtp.MtpStorageInfo) real;
    }

    public android.mtp.MtpStorageInfo unwrap() {
        return getReal();
    }

    public java.lang.String getDescription() {
        return ((android.mtp.MtpStorageInfo) real).getDescription();
    }

    public long getFreeSpace() {
        return ((android.mtp.MtpStorageInfo) real).getFreeSpace();
    }

    public long getMaxCapacity() {
        return ((android.mtp.MtpStorageInfo) real).getMaxCapacity();
    }

    public int getStorageId() {
        return ((android.mtp.MtpStorageInfo) real).getStorageId();
    }

    public java.lang.String getVolumeIdentifier() {
        return ((android.mtp.MtpStorageInfo) real).getVolumeIdentifier();
    }

}
