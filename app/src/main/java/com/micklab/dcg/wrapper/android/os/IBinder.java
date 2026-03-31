// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class IBinder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IBinder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.IBinder wrap(android.os.IBinder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.IBinder(real, (__DcgwBridgeToken) null);
    }

    public android.os.IBinder getReal() {
        return (android.os.IBinder) real;
    }

    public android.os.IBinder unwrap() {
        return getReal();
    }

    public void addFrozenStateChangeCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.os.IBinder.FrozenStateChangeCallback arg1) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#addFrozenStateChangeCallback(java.util.concurrent.Executor,android.os.IBinder$FrozenStateChangeCallback)");
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

    public boolean removeFrozenStateChangeCallback(com.micklab.dcg.wrapper.android.os.IBinder.FrozenStateChangeCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#removeFrozenStateChangeCallback(android.os.IBinder$FrozenStateChangeCallback)");
    }

    public boolean transact(int arg0, com.micklab.dcg.wrapper.android.os.Parcel arg1, com.micklab.dcg.wrapper.android.os.Parcel arg2, int arg3) throws android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#transact(int,android.os.Parcel,android.os.Parcel,int)");
    }

    public boolean unlinkToDeath(com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder#unlinkToDeath(android.os.IBinder$DeathRecipient,int)");
    }


    public static final class DeathRecipient {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DeathRecipient(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient wrap(android.os.IBinder.DeathRecipient real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.IBinder.DeathRecipient(real, (__DcgwBridgeToken) null);
        }

        public android.os.IBinder.DeathRecipient getReal() {
            return (android.os.IBinder.DeathRecipient) real;
        }

        public android.os.IBinder.DeathRecipient unwrap() {
            return getReal();
        }

        public void binderDied() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder$DeathRecipient#binderDied()");
        }

        public void binderDied(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder$DeathRecipient#binderDied(android.os.IBinder)");
        }

    }
    public static final class FrozenStateChangeCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FrozenStateChangeCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.IBinder.FrozenStateChangeCallback wrap(android.os.IBinder.FrozenStateChangeCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.IBinder.FrozenStateChangeCallback(real, (__DcgwBridgeToken) null);
        }

        public android.os.IBinder.FrozenStateChangeCallback getReal() {
            return (android.os.IBinder.FrozenStateChangeCallback) real;
        }

        public android.os.IBinder.FrozenStateChangeCallback unwrap() {
            return getReal();
        }

        public void onFrozenStateChanged(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IBinder$FrozenStateChangeCallback#onFrozenStateChanged(android.os.IBinder,int)");
        }


    }
}
