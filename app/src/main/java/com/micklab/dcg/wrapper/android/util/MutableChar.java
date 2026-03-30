// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableChar {
    private final android.util.MutableChar real;

    public MutableChar(android.util.MutableChar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableChar wrap(android.util.MutableChar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableChar(real);
    }

    public android.util.MutableChar unwrap() {
        return real;
    }

    public MutableChar(char arg0) {
        this(new android.util.MutableChar(arg0));
    }


}
