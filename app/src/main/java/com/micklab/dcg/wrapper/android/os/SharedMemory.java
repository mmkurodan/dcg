// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class SharedMemory {
    private final android.os.SharedMemory real;

    public SharedMemory(android.os.SharedMemory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.SharedMemory wrap(android.os.SharedMemory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.SharedMemory(real);
    }

    public android.os.SharedMemory unwrap() {
        return real;
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#close()");
    }

    public static com.micklab.dcg.wrapper.android.os.SharedMemory create(java.lang.String arg0, int arg1) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#create(java.lang.String,int)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#describeContents()");
    }

    public static com.micklab.dcg.wrapper.android.os.SharedMemory fromFileDescriptor(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#fromFileDescriptor(android.os.ParcelFileDescriptor)");
    }

    public int getSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#getSize()");
    }

    public java.nio.ByteBuffer map(int arg0, int arg1, int arg2) throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#map(int,int,int)");
    }

    public java.nio.ByteBuffer mapReadOnly() throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#mapReadOnly()");
    }

    public java.nio.ByteBuffer mapReadWrite() throws android.system.ErrnoException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#mapReadWrite()");
    }

    public boolean setProtect(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#setProtect(int)");
    }

    public static void unmap(java.nio.ByteBuffer arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#unmap(java.nio.ByteBuffer)");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.SharedMemory#writeToParcel(android.os.Parcel,int)");
    }


}
