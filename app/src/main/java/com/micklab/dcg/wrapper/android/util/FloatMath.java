// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class FloatMath {
    private final android.util.FloatMath real;

    public FloatMath(android.util.FloatMath real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.FloatMath wrap(android.util.FloatMath real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.FloatMath(real);
    }

    public android.util.FloatMath unwrap() {
        return real;
    }

}
