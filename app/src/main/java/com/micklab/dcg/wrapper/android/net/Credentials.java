// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class Credentials {
    private final android.net.Credentials real;

    public Credentials(android.net.Credentials real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.Credentials wrap(android.net.Credentials real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.Credentials(real);
    }

    public android.net.Credentials unwrap() {
        return real;
    }

    public Credentials(int arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#android.net.Credentials(int,int,int)");
    }

    public int getGid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#getGid()");
    }

    public int getPid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#getPid()");
    }

    public int getUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#getUid()");
    }

}
