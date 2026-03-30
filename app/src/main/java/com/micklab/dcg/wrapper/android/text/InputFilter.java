// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class InputFilter {
    private final android.text.InputFilter real;

    public InputFilter(android.text.InputFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.InputFilter wrap(android.text.InputFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.InputFilter(real);
    }

    public android.text.InputFilter unwrap() {
        return real;
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return real.filter(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

    public static final class AllCaps {
        private final android.text.InputFilter.AllCaps real;

        public AllCaps(android.text.InputFilter.AllCaps real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.InputFilter.AllCaps wrap(android.text.InputFilter.AllCaps real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.InputFilter.AllCaps(real);
        }

        public android.text.InputFilter.AllCaps unwrap() {
            return real;
        }

        public AllCaps() {
            this(new android.text.InputFilter.AllCaps());
        }

        public AllCaps(java.util.Locale arg0) {
            this(new android.text.InputFilter.AllCaps(arg0));
        }

        public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
            return real.filter(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
        }

    }
    public static final class LengthFilter {
        private final android.text.InputFilter.LengthFilter real;

        public LengthFilter(android.text.InputFilter.LengthFilter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.InputFilter.LengthFilter wrap(android.text.InputFilter.LengthFilter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.InputFilter.LengthFilter(real);
        }

        public android.text.InputFilter.LengthFilter unwrap() {
            return real;
        }

        public LengthFilter(int arg0) {
            this(new android.text.InputFilter.LengthFilter(arg0));
        }

        public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
            return real.filter(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
        }

        public int getMax() {
            return real.getMax();
        }

    }
}
