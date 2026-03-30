// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.storage;

public final class StorageManager {
    private final android.os.storage.StorageManager real;

    public StorageManager(android.os.storage.StorageManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.storage.StorageManager wrap(android.os.storage.StorageManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.storage.StorageManager(real);
    }

    public android.os.storage.StorageManager unwrap() {
        return real;
    }

    public void allocateBytes(java.io.FileDescriptor arg0, long arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#allocateBytes(java.io.FileDescriptor,long)");
    }

    public void allocateBytes(java.util.UUID arg0, long arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#allocateBytes(java.util.UUID,long)");
    }

    public long getAllocatableBytes(java.util.UUID arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getAllocatableBytes(java.util.UUID)");
    }

    public long getCacheQuotaBytes(java.util.UUID arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getCacheQuotaBytes(java.util.UUID)");
    }

    public long getCacheSizeBytes(java.util.UUID arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getCacheSizeBytes(java.util.UUID)");
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getManageSpaceActivityIntent(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getManageSpaceActivityIntent(java.lang.String,int)");
    }

    public java.lang.String getMountedObbPath(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getMountedObbPath(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.storage.StorageVolume getPrimaryStorageVolume() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getPrimaryStorageVolume()");
    }

    public com.micklab.dcg.wrapper.android.os.storage.StorageVolume getStorageVolume(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getStorageVolume(java.io.File)");
    }

    public com.micklab.dcg.wrapper.android.os.storage.StorageVolume getStorageVolume(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getStorageVolume(android.net.Uri)");
    }

    public java.util.UUID getUuidForPath(java.io.File arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#getUuidForPath(java.io.File)");
    }

    public boolean isAllocationSupported(java.io.FileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#isAllocationSupported(java.io.FileDescriptor)");
    }

    public boolean isCacheBehaviorGroup(java.io.File arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#isCacheBehaviorGroup(java.io.File)");
    }

    public boolean isCacheBehaviorTombstone(java.io.File arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#isCacheBehaviorTombstone(java.io.File)");
    }

    public boolean isCheckpointSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#isCheckpointSupported()");
    }

    public boolean isEncrypted(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#isEncrypted(java.io.File)");
    }

    public boolean isObbMounted(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#isObbMounted(java.lang.String)");
    }

    public boolean mountObb(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.storage.OnObbStateChangeListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#mountObb(java.lang.String,java.lang.String,android.os.storage.OnObbStateChangeListener)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openProxyFileDescriptor(int arg0, com.micklab.dcg.wrapper.android.os.ProxyFileDescriptorCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#openProxyFileDescriptor(int,android.os.ProxyFileDescriptorCallback,android.os.Handler)");
    }

    public void registerStorageVolumeCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.os.storage.StorageManager.StorageVolumeCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#registerStorageVolumeCallback(java.util.concurrent.Executor,android.os.storage.StorageManager$StorageVolumeCallback)");
    }

    public void setCacheBehaviorGroup(java.io.File arg0, boolean arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#setCacheBehaviorGroup(java.io.File,boolean)");
    }

    public void setCacheBehaviorTombstone(java.io.File arg0, boolean arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#setCacheBehaviorTombstone(java.io.File,boolean)");
    }

    public boolean unmountObb(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.os.storage.OnObbStateChangeListener arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#unmountObb(java.lang.String,boolean,android.os.storage.OnObbStateChangeListener)");
    }

    public void unregisterStorageVolumeCallback(com.micklab.dcg.wrapper.android.os.storage.StorageManager.StorageVolumeCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager#unregisterStorageVolumeCallback(android.os.storage.StorageManager$StorageVolumeCallback)");
    }


    public static final class StorageVolumeCallback {
        private final android.os.storage.StorageManager.StorageVolumeCallback real;

        public StorageVolumeCallback(android.os.storage.StorageManager.StorageVolumeCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.storage.StorageManager.StorageVolumeCallback wrap(android.os.storage.StorageManager.StorageVolumeCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.storage.StorageManager.StorageVolumeCallback(real);
        }

        public android.os.storage.StorageManager.StorageVolumeCallback unwrap() {
            return real;
        }

        public StorageVolumeCallback() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager$StorageVolumeCallback#android.os.storage.StorageManager$StorageVolumeCallback()");
        }

        public void onStateChanged(com.micklab.dcg.wrapper.android.os.storage.StorageVolume arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageManager$StorageVolumeCallback#onStateChanged(android.os.storage.StorageVolume)");
        }

    }
}
