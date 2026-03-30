// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Binder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Binder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Binder wrap(android.os.Binder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Binder(real, (__DcgwBridgeToken) null);
    }

    public android.os.Binder getReal() {
        return (android.os.Binder) real;
    }

    public android.os.Binder unwrap() {
        return getReal();
    }

    public Binder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#android.os.Binder()");
    }

    public Binder(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#android.os.Binder(java.lang.String)");
    }

    public void attachInterface(com.micklab.dcg.wrapper.android.os.IInterface arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#attachInterface(android.os.IInterface,java.lang.String)");
    }

    public static long clearCallingIdentity() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#clearCallingIdentity()");
    }

    public static long clearCallingWorkSource() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#clearCallingWorkSource()");
    }

    public void dump(java.io.FileDescriptor arg0, java.lang.String[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#dump(java.io.FileDescriptor,[Ljava.lang.String;)");
    }

    public void dumpAsync(java.io.FileDescriptor arg0, java.lang.String[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#dumpAsync(java.io.FileDescriptor,[Ljava.lang.String;)");
    }

    public static void flushPendingCommands() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#flushPendingCommands()");
    }

    public static int getCallingPid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#getCallingPid()");
    }

    public static int getCallingUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#getCallingUid()");
    }

    public static int getCallingUidOrThrow() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#getCallingUidOrThrow()");
    }

    public static com.micklab.dcg.wrapper.android.os.UserHandle getCallingUserHandle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#getCallingUserHandle()");
    }

    public static int getCallingWorkSourceUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#getCallingWorkSourceUid()");
    }

    public java.lang.String getInterfaceDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#getInterfaceDescriptor()");
    }

    public boolean isBinderAlive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#isBinderAlive()");
    }

    public static void joinThreadPool() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#joinThreadPool()");
    }

    public void linkToDeath(com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#linkToDeath(android.os.IBinder$DeathRecipient,int)");
    }

    public boolean pingBinder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#pingBinder()");
    }

    public com.micklab.dcg.wrapper.android.os.IInterface queryLocalInterface(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#queryLocalInterface(java.lang.String)");
    }

    public static void restoreCallingIdentity(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#restoreCallingIdentity(long)");
    }

    public static void restoreCallingWorkSource(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#restoreCallingWorkSource(long)");
    }

    public static long setCallingWorkSourceUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#setCallingWorkSourceUid(int)");
    }

    public boolean transact(int arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1, com.micklab.dcg.wrapper.android.os.Parcel arg2, int arg3) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#transact(int,android.os.Parcel,android.os.Parcel,int)");
    }

    public boolean unlinkToDeath(com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Binder#unlinkToDeath(android.os.IBinder$DeathRecipient,int)");
    }

}
