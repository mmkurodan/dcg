// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeMatcher {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnicodeMatcher(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeMatcher wrap(android.icu.text.UnicodeMatcher real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeMatcher(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UnicodeMatcher getReal() {
        return (android.icu.text.UnicodeMatcher) real;
    }

    public android.icu.text.UnicodeMatcher unwrap() {
        return getReal();
    }

    public void addMatchSetTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        ((android.icu.text.UnicodeMatcher) real).addMatchSetTo(arg0 == null ? null : arg0.getReal());
    }

    public int matches(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int[] arg1, int arg2, boolean arg3) {
        return ((android.icu.text.UnicodeMatcher) real).matches(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public boolean matchesIndexValue(int arg0) {
        return ((android.icu.text.UnicodeMatcher) real).matchesIndexValue(arg0);
    }

    public java.lang.String toPattern(boolean arg0) {
        return ((android.icu.text.UnicodeMatcher) real).toPattern(arg0);
    }

    public static final char ETHER = android.icu.text.UnicodeMatcher.ETHER;
    public static final int U_MATCH = android.icu.text.UnicodeMatcher.U_MATCH;
    public static final int U_MISMATCH = android.icu.text.UnicodeMatcher.U_MISMATCH;
    public static final int U_PARTIAL_MATCH = android.icu.text.UnicodeMatcher.U_PARTIAL_MATCH;

}
