// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class ChildSessionCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChildSessionCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionCallback wrap(android.net.ipsec.ike.ChildSessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionCallback(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.ChildSessionCallback getReal() {
        return (android.net.ipsec.ike.ChildSessionCallback) real;
    }

    public android.net.ipsec.ike.ChildSessionCallback unwrap() {
        return getReal();
    }

    public void onClosed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionCallback#onClosed()");
    }

    public void onClosedWithException(com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionCallback#onClosedWithException(android.net.ipsec.ike.exceptions.IkeException)");
    }

    public void onIpSecTransformCreated(com.micklab.dcg.wrapper.android.net.IpSecTransform arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionCallback#onIpSecTransformCreated(android.net.IpSecTransform,int)");
    }

    public void onIpSecTransformDeleted(com.micklab.dcg.wrapper.android.net.IpSecTransform arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionCallback#onIpSecTransformDeleted(android.net.IpSecTransform,int)");
    }

    public void onOpened(com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionCallback#onOpened(android.net.ipsec.ike.ChildSessionConfiguration)");
    }

}
