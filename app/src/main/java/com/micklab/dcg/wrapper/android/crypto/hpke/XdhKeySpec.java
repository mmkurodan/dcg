// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.crypto.hpke;

public final class XdhKeySpec {
    private final android.crypto.hpke.XdhKeySpec real;

    public XdhKeySpec(android.crypto.hpke.XdhKeySpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.crypto.hpke.XdhKeySpec wrap(android.crypto.hpke.XdhKeySpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.crypto.hpke.XdhKeySpec(real);
    }

    public android.crypto.hpke.XdhKeySpec unwrap() {
        return real;
    }

    public XdhKeySpec(byte[] arg0) {
        this(new android.crypto.hpke.XdhKeySpec(arg0));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getFormat() {
        return real.getFormat();
    }

    public byte[] getKey() {
        return real.getKey();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
