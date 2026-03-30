// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Parcel {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Parcel(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Parcel wrap(android.os.Parcel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Parcel(real, (__DcgwBridgeToken) null);
    }

    public android.os.Parcel getReal() {
        return (android.os.Parcel) real;
    }

    public android.os.Parcel unwrap() {
        return getReal();
    }

    public void appendFrom(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#appendFrom(android.os.Parcel,int,int)");
    }

    public android.os.IBinder[] createBinderArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createBinderArray()");
    }

    public boolean[] createBooleanArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createBooleanArray()");
    }

    public byte[] createByteArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createByteArray()");
    }

    public char[] createCharArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createCharArray()");
    }

    public double[] createDoubleArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createDoubleArray()");
    }

    public float[] createFloatArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createFloatArray()");
    }

    public int[] createIntArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createIntArray()");
    }

    public long[] createLongArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createLongArray()");
    }

    public java.lang.String[] createStringArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#createStringArray()");
    }

    public int dataAvail() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#dataAvail()");
    }

    public int dataCapacity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#dataCapacity()");
    }

    public int dataPosition() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#dataPosition()");
    }

    public int dataSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#dataSize()");
    }

    public void enforceInterface(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#enforceInterface(java.lang.String)");
    }

    public void enforceNoDataAvail() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#enforceNoDataAvail()");
    }

    public boolean hasFileDescriptors() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#hasFileDescriptors()");
    }

    public boolean hasFileDescriptors(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#hasFileDescriptors(int,int)");
    }

    public byte[] marshall() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#marshall()");
    }

    public static com.micklab.dcg.wrapper.android.os.Parcel obtain() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#obtain()");
    }

    public static com.micklab.dcg.wrapper.android.os.Parcel obtain(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#obtain(android.os.IBinder)");
    }

    public java.lang.Object[] readArray(java.lang.ClassLoader arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readArray(java.lang.ClassLoader)");
    }

    public void readBinderArray(android.os.IBinder[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readBinderArray([Landroid.os.IBinder;)");
    }

    public byte[] readBlob() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readBlob()");
    }

    public boolean readBoolean() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readBoolean()");
    }

    public void readBooleanArray(boolean[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readBooleanArray([Z)");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle readBundle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readBundle()");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle readBundle(java.lang.ClassLoader arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readBundle(java.lang.ClassLoader)");
    }

    public byte readByte() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readByte()");
    }

    public void readByteArray(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readByteArray([B)");
    }

    public void readCharArray(char[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readCharArray([C)");
    }

    public double readDouble() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readDouble()");
    }

    public void readDoubleArray(double[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readDoubleArray([D)");
    }

    public void readException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readException()");
    }

    public void readException(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readException(int,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor readFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readFileDescriptor()");
    }

    public float readFloat() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readFloat()");
    }

    public void readFloatArray(float[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readFloatArray([F)");
    }

    public int readInt() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readInt()");
    }

    public void readIntArray(int[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readIntArray([I)");
    }

    public long readLong() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readLong()");
    }

    public void readLongArray(long[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readLongArray([J)");
    }

    public android.os.Parcelable[] readParcelableArray(java.lang.ClassLoader arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readParcelableArray(java.lang.ClassLoader)");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle readPersistableBundle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readPersistableBundle()");
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle readPersistableBundle(java.lang.ClassLoader arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readPersistableBundle(java.lang.ClassLoader)");
    }

    public java.io.Serializable readSerializable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readSerializable()");
    }

    public com.micklab.dcg.wrapper.android.util.Size readSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readSize()");
    }

    public com.micklab.dcg.wrapper.android.util.SizeF readSizeF() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readSizeF()");
    }

    public com.micklab.dcg.wrapper.android.util.SparseBooleanArray readSparseBooleanArray() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readSparseBooleanArray()");
    }

    public java.lang.String readString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readString()");
    }

    public void readStringArray(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readStringArray([Ljava.lang.String;)");
    }

    public com.micklab.dcg.wrapper.android.os.IBinder readStrongBinder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readStrongBinder()");
    }

    public java.lang.Object readValue(java.lang.ClassLoader arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#readValue(java.lang.ClassLoader)");
    }

    public void recycle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#recycle()");
    }

    public void setDataCapacity(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#setDataCapacity(int)");
    }

    public void setDataPosition(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#setDataPosition(int)");
    }

    public void setDataSize(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#setDataSize(int)");
    }

    public void setPropagateAllowBlocking() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#setPropagateAllowBlocking()");
    }

    public void unmarshall(byte[] arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#unmarshall([B,int,int)");
    }

    public void writeArray(java.lang.Object[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeArray([Ljava.lang.Object;)");
    }

    public void writeBinderArray(android.os.IBinder[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeBinderArray([Landroid.os.IBinder;)");
    }

    public void writeBlob(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeBlob([B)");
    }

    public void writeBlob(byte[] arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeBlob([B,int,int)");
    }

    public void writeBoolean(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeBoolean(boolean)");
    }

    public void writeBooleanArray(boolean[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeBooleanArray([Z)");
    }

    public void writeBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeBundle(android.os.Bundle)");
    }

    public void writeByte(byte arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeByte(byte)");
    }

    public void writeByteArray(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeByteArray([B)");
    }

    public void writeByteArray(byte[] arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeByteArray([B,int,int)");
    }

    public void writeCharArray(char[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeCharArray([C)");
    }

    public void writeDouble(double arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeDouble(double)");
    }

    public void writeDoubleArray(double[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeDoubleArray([D)");
    }

    public void writeException(java.lang.Exception arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeException(java.lang.Exception)");
    }

    public void writeFileDescriptor(java.io.FileDescriptor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeFileDescriptor(java.io.FileDescriptor)");
    }

    public void writeFloat(float arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeFloat(float)");
    }

    public void writeFloatArray(float[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeFloatArray([F)");
    }

    public void writeInt(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeInt(int)");
    }

    public void writeIntArray(int[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeIntArray([I)");
    }

    public void writeInterfaceToken(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeInterfaceToken(java.lang.String)");
    }

    public void writeLong(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeLong(long)");
    }

    public void writeLongArray(long[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeLongArray([J)");
    }

    public void writeNoException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeNoException()");
    }

    public void writeParcelable(com.micklab.dcg.wrapper.android.os.Parcelable arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeParcelable(android.os.Parcelable,int)");
    }

    public void writeParcelableCreator(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeParcelableCreator(android.os.Parcelable)");
    }

    public void writePersistableBundle(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writePersistableBundle(android.os.PersistableBundle)");
    }

    public void writeSerializable(java.io.Serializable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeSerializable(java.io.Serializable)");
    }

    public void writeSize(com.micklab.dcg.wrapper.android.util.Size arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeSize(android.util.Size)");
    }

    public void writeSizeF(com.micklab.dcg.wrapper.android.util.SizeF arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeSizeF(android.util.SizeF)");
    }

    public void writeSparseBooleanArray(com.micklab.dcg.wrapper.android.util.SparseBooleanArray arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeSparseBooleanArray(android.util.SparseBooleanArray)");
    }

    public void writeString(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeString(java.lang.String)");
    }

    public void writeStringArray(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeStringArray([Ljava.lang.String;)");
    }

    public void writeStrongBinder(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeStrongBinder(android.os.IBinder)");
    }

    public void writeStrongInterface(com.micklab.dcg.wrapper.android.os.IInterface arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeStrongInterface(android.os.IInterface)");
    }

    public void writeValue(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Parcel#writeValue(java.lang.Object)");
    }


}
