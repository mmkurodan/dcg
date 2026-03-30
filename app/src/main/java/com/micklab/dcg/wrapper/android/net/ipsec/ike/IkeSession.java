// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSession wrap(android.net.ipsec.ike.IkeSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSession(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.IkeSession getReal() {
        return (android.net.ipsec.ike.IkeSession) real;
    }

    public android.net.ipsec.ike.IkeSession unwrap() {
        return getReal();
    }

    public IkeSession(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionParams arg1, com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionParams arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionCallback arg4, com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionCallback arg5) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#android.net.ipsec.ike.IkeSession(android.content.Context,android.net.ipsec.ike.IkeSessionParams,android.net.ipsec.ike.ChildSessionParams,java.util.concurrent.Executor,android.net.ipsec.ike.IkeSessionCallback,android.net.ipsec.ike.ChildSessionCallback)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#close()");
    }

    public void closeChildSession(com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#closeChildSession(android.net.ipsec.ike.ChildSessionCallback)");
    }

    public void dump(java.io.PrintWriter arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#dump(java.io.PrintWriter)");
    }

    public void finalize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#finalize()");
    }

    public void kill() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#kill()");
    }

    public void openChildSession(com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionParams arg0, com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionCallback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSession#openChildSession(android.net.ipsec.ike.ChildSessionParams,android.net.ipsec.ike.ChildSessionCallback)");
    }

}
