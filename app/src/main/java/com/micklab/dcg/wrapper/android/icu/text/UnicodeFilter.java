// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnicodeFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter wrap(android.icu.text.UnicodeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UnicodeFilter getReal() {
        return (android.icu.text.UnicodeFilter) real;
    }

    public android.icu.text.UnicodeFilter unwrap() {
        return getReal();
    }

    public boolean contains(int arg0) {
        return ((android.icu.text.UnicodeFilter) real).contains(arg0);
    }

    public int matches(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int[] arg1, int arg2, boolean arg3) {
        return ((android.icu.text.UnicodeFilter) real).matches(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

}
