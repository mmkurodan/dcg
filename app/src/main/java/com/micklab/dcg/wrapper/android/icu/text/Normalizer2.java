// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Normalizer2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Normalizer2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 wrap(android.icu.text.Normalizer2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Normalizer2(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.Normalizer2 getReal() {
        return (android.icu.text.Normalizer2) real;
    }

    public android.icu.text.Normalizer2 unwrap() {
        return getReal();
    }

    public java.lang.StringBuilder append(java.lang.StringBuilder arg0, java.lang.CharSequence arg1) {
        return ((android.icu.text.Normalizer2) real).append(arg0, arg1);
    }

    public int composePair(int arg0, int arg1) {
        return ((android.icu.text.Normalizer2) real).composePair(arg0, arg1);
    }

    public int getCombiningClass(int arg0) {
        return ((android.icu.text.Normalizer2) real).getCombiningClass(arg0);
    }

    public java.lang.String getDecomposition(int arg0) {
        return ((android.icu.text.Normalizer2) real).getDecomposition(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getInstance(java.io.InputStream arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getInstance(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getNFCInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getNFCInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getNFDInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getNFDInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getNFKCCasefoldInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getNFKCCasefoldInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getNFKCInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getNFKCInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getNFKCSimpleCasefoldInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getNFKCSimpleCasefoldInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2 getNFKDInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.wrap(android.icu.text.Normalizer2.getNFKDInstance());
    }

    public java.lang.String getRawDecomposition(int arg0) {
        return ((android.icu.text.Normalizer2) real).getRawDecomposition(arg0);
    }

    public boolean hasBoundaryAfter(int arg0) {
        return ((android.icu.text.Normalizer2) real).hasBoundaryAfter(arg0);
    }

    public boolean hasBoundaryBefore(int arg0) {
        return ((android.icu.text.Normalizer2) real).hasBoundaryBefore(arg0);
    }

    public boolean isInert(int arg0) {
        return ((android.icu.text.Normalizer2) real).isInert(arg0);
    }

    public boolean isNormalized(java.lang.CharSequence arg0) {
        return ((android.icu.text.Normalizer2) real).isNormalized(arg0);
    }

    public java.lang.String normalize(java.lang.CharSequence arg0) {
        return ((android.icu.text.Normalizer2) real).normalize(arg0);
    }

    public java.lang.Appendable normalize(java.lang.CharSequence arg0, java.lang.Appendable arg1) {
        return ((android.icu.text.Normalizer2) real).normalize(arg0, arg1);
    }

    public java.lang.StringBuilder normalize(java.lang.CharSequence arg0, java.lang.StringBuilder arg1) {
        return ((android.icu.text.Normalizer2) real).normalize(arg0, arg1);
    }

    public java.lang.StringBuilder normalizeSecondAndAppend(java.lang.StringBuilder arg0, java.lang.CharSequence arg1) {
        return ((android.icu.text.Normalizer2) real).normalizeSecondAndAppend(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult quickCheck(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult.wrap(((android.icu.text.Normalizer2) real).quickCheck(arg0));
    }

    public int spanQuickCheckYes(java.lang.CharSequence arg0) {
        return ((android.icu.text.Normalizer2) real).spanQuickCheckYes(arg0);
    }

    public static final class Mode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Mode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode wrap(android.icu.text.Normalizer2.Mode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.Normalizer2.Mode getReal() {
            return (android.icu.text.Normalizer2.Mode) real;
        }

        public android.icu.text.Normalizer2.Mode unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode.wrap(android.icu.text.Normalizer2.Mode.valueOf(arg0));
        }

        public static android.icu.text.Normalizer2.Mode[] values() {
            return android.icu.text.Normalizer2.Mode.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode COMPOSE = com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode.wrap(android.icu.text.Normalizer2.Mode.COMPOSE);
        public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode COMPOSE_CONTIGUOUS = com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode.wrap(android.icu.text.Normalizer2.Mode.COMPOSE_CONTIGUOUS);
        public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode DECOMPOSE = com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode.wrap(android.icu.text.Normalizer2.Mode.DECOMPOSE);
        public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode FCD = com.micklab.dcg.wrapper.android.icu.text.Normalizer2.Mode.wrap(android.icu.text.Normalizer2.Mode.FCD);

    }
}
