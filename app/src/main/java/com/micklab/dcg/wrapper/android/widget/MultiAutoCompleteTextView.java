// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class MultiAutoCompleteTextView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MultiAutoCompleteTextView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView wrap(android.widget.MultiAutoCompleteTextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.MultiAutoCompleteTextView getReal() {
        return (android.widget.MultiAutoCompleteTextView) real;
    }

    public android.widget.MultiAutoCompleteTextView unwrap() {
        return getReal();
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean enoughToFilter() {
        return ((android.widget.MultiAutoCompleteTextView) real).enoughToFilter();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.MultiAutoCompleteTextView) real).getAccessibilityClassName();
    }

    public void performValidation() {
        ((android.widget.MultiAutoCompleteTextView) real).performValidation();
    }

    public void setTokenizer(com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.Tokenizer arg0) {
        ((android.widget.MultiAutoCompleteTextView) real).setTokenizer(arg0 == null ? null : arg0.getReal());
    }

    public static final class CommaTokenizer {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CommaTokenizer(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.CommaTokenizer wrap(android.widget.MultiAutoCompleteTextView.CommaTokenizer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.CommaTokenizer(real, (__DcgwBridgeToken) null);
        }

        public android.widget.MultiAutoCompleteTextView.CommaTokenizer getReal() {
            return (android.widget.MultiAutoCompleteTextView.CommaTokenizer) real;
        }

        public android.widget.MultiAutoCompleteTextView.CommaTokenizer unwrap() {
            return getReal();
        }

        public CommaTokenizer() {
            this(new android.widget.MultiAutoCompleteTextView.CommaTokenizer(), (__DcgwBridgeToken) null);
        }

        public int findTokenEnd(java.lang.CharSequence arg0, int arg1) {
            return ((android.widget.MultiAutoCompleteTextView.CommaTokenizer) real).findTokenEnd(arg0, arg1);
        }

        public int findTokenStart(java.lang.CharSequence arg0, int arg1) {
            return ((android.widget.MultiAutoCompleteTextView.CommaTokenizer) real).findTokenStart(arg0, arg1);
        }

        public java.lang.CharSequence terminateToken(java.lang.CharSequence arg0) {
            return ((android.widget.MultiAutoCompleteTextView.CommaTokenizer) real).terminateToken(arg0);
        }

    }
    public static final class Tokenizer {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Tokenizer(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.Tokenizer wrap(android.widget.MultiAutoCompleteTextView.Tokenizer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.Tokenizer(real, (__DcgwBridgeToken) null);
        }

        public android.widget.MultiAutoCompleteTextView.Tokenizer getReal() {
            return (android.widget.MultiAutoCompleteTextView.Tokenizer) real;
        }

        public android.widget.MultiAutoCompleteTextView.Tokenizer unwrap() {
            return getReal();
        }

        public int findTokenEnd(java.lang.CharSequence arg0, int arg1) {
            return ((android.widget.MultiAutoCompleteTextView.Tokenizer) real).findTokenEnd(arg0, arg1);
        }

        public int findTokenStart(java.lang.CharSequence arg0, int arg1) {
            return ((android.widget.MultiAutoCompleteTextView.Tokenizer) real).findTokenStart(arg0, arg1);
        }

        public java.lang.CharSequence terminateToken(java.lang.CharSequence arg0) {
            return ((android.widget.MultiAutoCompleteTextView.Tokenizer) real).terminateToken(arg0);
        }

    }
}
