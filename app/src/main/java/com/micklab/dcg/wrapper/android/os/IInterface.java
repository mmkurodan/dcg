// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class IInterface {
    private final android.os.IInterface real;

    public IInterface(android.os.IInterface real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.IInterface wrap(android.os.IInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.IInterface(real);
    }

    public android.os.IInterface unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder asBinder() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.IInterface#asBinder()");
    }

}
