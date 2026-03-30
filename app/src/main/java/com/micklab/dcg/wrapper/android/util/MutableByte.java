// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableByte {
    private final android.util.MutableByte real;

    public MutableByte(android.util.MutableByte real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableByte wrap(android.util.MutableByte real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableByte(real);
    }

    public android.util.MutableByte unwrap() {
        return real;
    }

    public MutableByte(byte arg0) {
        this(new android.util.MutableByte(arg0));
    }


}
