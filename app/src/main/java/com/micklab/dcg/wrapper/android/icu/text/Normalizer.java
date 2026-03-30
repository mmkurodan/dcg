// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Normalizer {
    private final android.icu.text.Normalizer real;

    public Normalizer(android.icu.text.Normalizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Normalizer wrap(android.icu.text.Normalizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Normalizer(real);
    }

    public android.icu.text.Normalizer unwrap() {
        return real;
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public static int compare(int arg0, int arg1, int arg2) {
        return android.icu.text.Normalizer.compare(arg0, arg1, arg2);
    }

    public static int compare(char[] arg0, char[] arg1, int arg2) {
        return android.icu.text.Normalizer.compare(arg0, arg1, arg2);
    }

    public static int compare(int arg0, java.lang.String arg1, int arg2) {
        return android.icu.text.Normalizer.compare(arg0, arg1, arg2);
    }

    public static int compare(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return android.icu.text.Normalizer.compare(arg0, arg1, arg2);
    }

    public static int compare(char[] arg0, int arg1, int arg2, char[] arg3, int arg4, int arg5, int arg6) {
        return android.icu.text.Normalizer.compare(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static final int COMPARE_CODE_POINT_ORDER = android.icu.text.Normalizer.COMPARE_CODE_POINT_ORDER;
    public static final int COMPARE_IGNORE_CASE = android.icu.text.Normalizer.COMPARE_IGNORE_CASE;
    public static final int FOLD_CASE_DEFAULT = android.icu.text.Normalizer.FOLD_CASE_DEFAULT;
    public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = android.icu.text.Normalizer.FOLD_CASE_EXCLUDE_SPECIAL_I;
    public static final int INPUT_IS_FCD = android.icu.text.Normalizer.INPUT_IS_FCD;
    public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult MAYBE = com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult.wrap(android.icu.text.Normalizer.MAYBE);
    public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult NO = com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult.wrap(android.icu.text.Normalizer.NO);
    public static final com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult YES = com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult.wrap(android.icu.text.Normalizer.YES);

    public static final class QuickCheckResult {
        private final android.icu.text.Normalizer.QuickCheckResult real;

        public QuickCheckResult(android.icu.text.Normalizer.QuickCheckResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult wrap(android.icu.text.Normalizer.QuickCheckResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Normalizer.QuickCheckResult(real);
        }

        public android.icu.text.Normalizer.QuickCheckResult unwrap() {
            return real;
        }

    }
}
