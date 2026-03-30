// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class RemoteException {
    private final android.os.RemoteException real;

    public RemoteException(android.os.RemoteException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.RemoteException wrap(android.os.RemoteException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.RemoteException(real);
    }

    public android.os.RemoteException unwrap() {
        return real;
    }

    public RemoteException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteException#android.os.RemoteException()");
    }

    public RemoteException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteException#android.os.RemoteException(java.lang.String)");
    }

    public java.lang.RuntimeException rethrowAsRuntimeException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteException#rethrowAsRuntimeException()");
    }

    public java.lang.RuntimeException rethrowFromSystemServer() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteException#rethrowFromSystemServer()");
    }

}
