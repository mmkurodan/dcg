// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.crypto.hpke;

public final class XdhKeySpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private XdhKeySpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.crypto.hpke.XdhKeySpec wrap(android.crypto.hpke.XdhKeySpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.crypto.hpke.XdhKeySpec(real, (__DcgwBridgeToken) null);
    }

    public android.crypto.hpke.XdhKeySpec getReal() {
        return (android.crypto.hpke.XdhKeySpec) real;
    }

    public android.crypto.hpke.XdhKeySpec unwrap() {
        return getReal();
    }

    public XdhKeySpec(byte[] arg0) {
        this(new android.crypto.hpke.XdhKeySpec(arg0), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.crypto.hpke.XdhKeySpec) real).equals(arg0);
    }

    public java.lang.String getFormat() {
        return ((android.crypto.hpke.XdhKeySpec) real).getFormat();
    }

    public byte[] getKey() {
        return ((android.crypto.hpke.XdhKeySpec) real).getKey();
    }

    public int hashCode() {
        return ((android.crypto.hpke.XdhKeySpec) real).hashCode();
    }

}
