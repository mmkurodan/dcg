// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeFilter {
    private final android.icu.text.UnicodeFilter real;

    public UnicodeFilter(android.icu.text.UnicodeFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter wrap(android.icu.text.UnicodeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter(real);
    }

    public android.icu.text.UnicodeFilter unwrap() {
        return real;
    }

    public boolean contains(int arg0) {
        return real.contains(arg0);
    }

    public int matches(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int[] arg1, int arg2, boolean arg3) {
        return real.matches(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

}
