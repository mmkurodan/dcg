// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class InputFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.InputFilter wrap(android.text.InputFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.InputFilter(real, (__DcgwBridgeToken) null);
    }

    public android.text.InputFilter getReal() {
        return (android.text.InputFilter) real;
    }

    public android.text.InputFilter unwrap() {
        return getReal();
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return ((android.text.InputFilter) real).filter(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5);
    }

    public static final class AllCaps {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AllCaps(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.InputFilter.AllCaps wrap(android.text.InputFilter.AllCaps real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.InputFilter.AllCaps(real, (__DcgwBridgeToken) null);
        }

        public android.text.InputFilter.AllCaps getReal() {
            return (android.text.InputFilter.AllCaps) real;
        }

        public android.text.InputFilter.AllCaps unwrap() {
            return getReal();
        }

        public AllCaps() {
            this(new android.text.InputFilter.AllCaps(), (__DcgwBridgeToken) null);
        }

        public AllCaps(java.util.Locale arg0) {
            this(new android.text.InputFilter.AllCaps(arg0), (__DcgwBridgeToken) null);
        }

        public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
            return ((android.text.InputFilter.AllCaps) real).filter(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5);
        }

    }
    public static final class LengthFilter {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LengthFilter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.text.InputFilter.LengthFilter wrap(android.text.InputFilter.LengthFilter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.text.InputFilter.LengthFilter(real, (__DcgwBridgeToken) null);
        }

        public android.text.InputFilter.LengthFilter getReal() {
            return (android.text.InputFilter.LengthFilter) real;
        }

        public android.text.InputFilter.LengthFilter unwrap() {
            return getReal();
        }

        public LengthFilter(int arg0) {
            this(new android.text.InputFilter.LengthFilter(arg0), (__DcgwBridgeToken) null);
        }

        public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
            return ((android.text.InputFilter.LengthFilter) real).filter(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5);
        }

        public int getMax() {
            return ((android.text.InputFilter.LengthFilter) real).getMax();
        }

    }
}
