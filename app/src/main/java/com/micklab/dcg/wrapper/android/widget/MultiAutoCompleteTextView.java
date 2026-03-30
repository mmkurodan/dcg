// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class MultiAutoCompleteTextView {
    private final android.widget.MultiAutoCompleteTextView real;

    public MultiAutoCompleteTextView(android.widget.MultiAutoCompleteTextView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView wrap(android.widget.MultiAutoCompleteTextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView(real);
    }

    public android.widget.MultiAutoCompleteTextView unwrap() {
        return real;
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.unwrap()));
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public MultiAutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.MultiAutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public boolean enoughToFilter() {
        return real.enoughToFilter();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void performValidation() {
        real.performValidation();
    }

    public void setTokenizer(com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.Tokenizer arg0) {
        real.setTokenizer(arg0 == null ? null : arg0.unwrap());
    }

    public static final class CommaTokenizer {
        private final android.widget.MultiAutoCompleteTextView.CommaTokenizer real;

        public CommaTokenizer(android.widget.MultiAutoCompleteTextView.CommaTokenizer real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.CommaTokenizer wrap(android.widget.MultiAutoCompleteTextView.CommaTokenizer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.CommaTokenizer(real);
        }

        public android.widget.MultiAutoCompleteTextView.CommaTokenizer unwrap() {
            return real;
        }

        public CommaTokenizer() {
            this(new android.widget.MultiAutoCompleteTextView.CommaTokenizer());
        }

        public int findTokenEnd(java.lang.CharSequence arg0, int arg1) {
            return real.findTokenEnd(arg0, arg1);
        }

        public int findTokenStart(java.lang.CharSequence arg0, int arg1) {
            return real.findTokenStart(arg0, arg1);
        }

        public java.lang.CharSequence terminateToken(java.lang.CharSequence arg0) {
            return real.terminateToken(arg0);
        }

    }
    public static final class Tokenizer {
        private final android.widget.MultiAutoCompleteTextView.Tokenizer real;

        public Tokenizer(android.widget.MultiAutoCompleteTextView.Tokenizer real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.Tokenizer wrap(android.widget.MultiAutoCompleteTextView.Tokenizer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MultiAutoCompleteTextView.Tokenizer(real);
        }

        public android.widget.MultiAutoCompleteTextView.Tokenizer unwrap() {
            return real;
        }

        public int findTokenEnd(java.lang.CharSequence arg0, int arg1) {
            return real.findTokenEnd(arg0, arg1);
        }

        public int findTokenStart(java.lang.CharSequence arg0, int arg1) {
            return real.findTokenStart(arg0, arg1);
        }

        public java.lang.CharSequence terminateToken(java.lang.CharSequence arg0) {
            return real.terminateToken(arg0);
        }

    }
}
