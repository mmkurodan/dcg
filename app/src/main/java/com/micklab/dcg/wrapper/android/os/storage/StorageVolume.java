// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.storage;

public final class StorageVolume {
    private final android.os.storage.StorageVolume real;

    public StorageVolume(android.os.storage.StorageVolume real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.storage.StorageVolume wrap(android.os.storage.StorageVolume real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.storage.StorageVolume(real);
    }

    public android.os.storage.StorageVolume unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.Intent createAccessIntent(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#createAccessIntent(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.Intent createOpenDocumentTreeIntent() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#createOpenDocumentTreeIntent()");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#equals(java.lang.Object)");
    }

    public java.lang.String getDescription(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getDescription(android.content.Context)");
    }

    public java.io.File getDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getDirectory()");
    }

    public java.lang.String getMediaStoreVolumeName() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getMediaStoreVolumeName()");
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getOwner() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getOwner()");
    }

    public java.lang.String getState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getState()");
    }

    public java.util.UUID getStorageUuid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getStorageUuid()");
    }

    public java.lang.String getUuid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#getUuid()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#hashCode()");
    }

    public boolean isEmulated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#isEmulated()");
    }

    public boolean isPrimary() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#isPrimary()");
    }

    public boolean isRemovable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#isRemovable()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.storage.StorageVolume#writeToParcel(android.os.Parcel,int)");
    }


}
