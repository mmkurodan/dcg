// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class StatFs {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StatFs(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.StatFs wrap(android.os.StatFs real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.StatFs(real, (__DcgwBridgeToken) null);
    }

    public android.os.StatFs getReal() {
        return (android.os.StatFs) real;
    }

    public android.os.StatFs unwrap() {
        return getReal();
    }

    public StatFs(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#android.os.StatFs(java.lang.String)");
    }

    public int getAvailableBlocks() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getAvailableBlocks()");
    }

    public long getAvailableBlocksLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getAvailableBlocksLong()");
    }

    public long getAvailableBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getAvailableBytes()");
    }

    public int getBlockCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getBlockCount()");
    }

    public long getBlockCountLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getBlockCountLong()");
    }

    public int getBlockSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getBlockSize()");
    }

    public long getBlockSizeLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getBlockSizeLong()");
    }

    public int getFreeBlocks() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getFreeBlocks()");
    }

    public long getFreeBlocksLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getFreeBlocksLong()");
    }

    public long getFreeBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getFreeBytes()");
    }

    public long getTotalBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#getTotalBytes()");
    }

    public void restat(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.StatFs#restat(java.lang.String)");
    }

}
