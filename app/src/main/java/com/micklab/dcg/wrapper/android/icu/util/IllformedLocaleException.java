// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class IllformedLocaleException {
    private final android.icu.util.IllformedLocaleException real;

    public IllformedLocaleException(android.icu.util.IllformedLocaleException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.IllformedLocaleException wrap(android.icu.util.IllformedLocaleException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.IllformedLocaleException(real);
    }

    public android.icu.util.IllformedLocaleException unwrap() {
        return real;
    }

    public IllformedLocaleException() {
        this(new android.icu.util.IllformedLocaleException());
    }

    public IllformedLocaleException(java.lang.String arg0) {
        this(new android.icu.util.IllformedLocaleException(arg0));
    }

    public IllformedLocaleException(java.lang.String arg0, int arg1) {
        this(new android.icu.util.IllformedLocaleException(arg0, arg1));
    }

    public int getErrorIndex() {
        return real.getErrorIndex();
    }

}
