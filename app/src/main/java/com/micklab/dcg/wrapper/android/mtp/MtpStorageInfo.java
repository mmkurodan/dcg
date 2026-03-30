// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpStorageInfo {
    private final android.mtp.MtpStorageInfo real;

    public MtpStorageInfo(android.mtp.MtpStorageInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo wrap(android.mtp.MtpStorageInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo(real);
    }

    public android.mtp.MtpStorageInfo unwrap() {
        return real;
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public long getFreeSpace() {
        return real.getFreeSpace();
    }

    public long getMaxCapacity() {
        return real.getMaxCapacity();
    }

    public int getStorageId() {
        return real.getStorageId();
    }

    public java.lang.String getVolumeIdentifier() {
        return real.getVolumeIdentifier();
    }

}
