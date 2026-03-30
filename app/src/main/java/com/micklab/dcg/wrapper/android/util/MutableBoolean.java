// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableBoolean {
    private final android.util.MutableBoolean real;

    public MutableBoolean(android.util.MutableBoolean real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableBoolean wrap(android.util.MutableBoolean real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableBoolean(real);
    }

    public android.util.MutableBoolean unwrap() {
        return real;
    }

    public MutableBoolean(boolean arg0) {
        this(new android.util.MutableBoolean(arg0));
    }


}
