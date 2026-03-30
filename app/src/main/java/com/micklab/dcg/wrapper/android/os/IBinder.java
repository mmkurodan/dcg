// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class IBinder {
    private final android.os.IBinder real;

    public IBinder(android.os.IBinder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.IBinder wrap(android.os.IBinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.IBinder(real);
    }

    public android.os.IBinder unwrap() {
        return real;
    }

    public void dump(java.io.FileDescriptor arg0, java.lang.String[] arg1) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#dump(java.io.FileDescriptor,[Ljava.lang.String;)");
    }

    public void dumpAsync(java.io.FileDescriptor arg0, java.lang.String[] arg1) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#dumpAsync(java.io.FileDescriptor,[Ljava.lang.String;)");
    }

    public java.lang.String getInterfaceDescriptor() throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#getInterfaceDescriptor()");
    }

    public static int getSuggestedMaxIpcSizeBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#getSuggestedMaxIpcSizeBytes()");
    }

    public boolean isBinderAlive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#isBinderAlive()");
    }

    public void linkToDeath(com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient arg0, int arg1) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#linkToDeath(android.os.IBinder$DeathRecipient,int)");
    }

    public boolean pingBinder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#pingBinder()");
    }

    public com.micklab.dcg.wrapper.android.os.IInterface queryLocalInterface(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#queryLocalInterface(java.lang.String)");
    }

    public boolean transact(int arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1, com.micklab.dcg.wrapper.android.os.Parcel arg2, int arg3) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#transact(int,android.os.Parcel,android.os.Parcel,int)");
    }

    public boolean unlinkToDeath(com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#unlinkToDeath(android.os.IBinder$DeathRecipient,int)");
    }


    public static final class DeathRecipient {
        private final android.os.IBinder.DeathRecipient real;

        public DeathRecipient(android.os.IBinder.DeathRecipient real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient wrap(android.os.IBinder.DeathRecipient real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient(real);
        }

        public android.os.IBinder.DeathRecipient unwrap() {
            return real;
        }

        public void binderDied() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder$DeathRecipient#binderDied()");
        }

        public void binderDied(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder$DeathRecipient#binderDied(android.os.IBinder)");
        }

    }
}
