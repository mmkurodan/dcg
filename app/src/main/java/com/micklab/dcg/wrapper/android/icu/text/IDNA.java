// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class IDNA {
    private final android.icu.text.IDNA real;

    public IDNA(android.icu.text.IDNA real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.IDNA wrap(android.icu.text.IDNA real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.IDNA(real);
    }

    public android.icu.text.IDNA unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.IDNA getUTS46Instance(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.IDNA.wrap(android.icu.text.IDNA.getUTS46Instance(arg0));
    }

    public java.lang.StringBuilder labelToASCII(java.lang.CharSequence arg0, java.lang.StringBuilder arg1, com.micklab.dcg.wrapper.android.icu.text.IDNA.Info arg2) {
        return real.labelToASCII(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.StringBuilder labelToUnicode(java.lang.CharSequence arg0, java.lang.StringBuilder arg1, com.micklab.dcg.wrapper.android.icu.text.IDNA.Info arg2) {
        return real.labelToUnicode(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.StringBuilder nameToASCII(java.lang.CharSequence arg0, java.lang.StringBuilder arg1, com.micklab.dcg.wrapper.android.icu.text.IDNA.Info arg2) {
        return real.nameToASCII(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.StringBuilder nameToUnicode(java.lang.CharSequence arg0, java.lang.StringBuilder arg1, com.micklab.dcg.wrapper.android.icu.text.IDNA.Info arg2) {
        return real.nameToUnicode(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static final int CHECK_BIDI = android.icu.text.IDNA.CHECK_BIDI;
    public static final int CHECK_CONTEXTJ = android.icu.text.IDNA.CHECK_CONTEXTJ;
    public static final int CHECK_CONTEXTO = android.icu.text.IDNA.CHECK_CONTEXTO;
    public static final int DEFAULT = android.icu.text.IDNA.DEFAULT;
    public static final int NONTRANSITIONAL_TO_ASCII = android.icu.text.IDNA.NONTRANSITIONAL_TO_ASCII;
    public static final int NONTRANSITIONAL_TO_UNICODE = android.icu.text.IDNA.NONTRANSITIONAL_TO_UNICODE;
    public static final int USE_STD3_RULES = android.icu.text.IDNA.USE_STD3_RULES;

    public static final class Error {
        private final android.icu.text.IDNA.Error real;

        public Error(android.icu.text.IDNA.Error real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.IDNA.Error wrap(android.icu.text.IDNA.Error real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.IDNA.Error(real);
        }

        public android.icu.text.IDNA.Error unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.IDNA.Error valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.valueOf(arg0));
        }

        public static android.icu.text.IDNA.Error[] values() {
            return android.icu.text.IDNA.Error.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error BIDI = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.BIDI);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error CONTEXTJ = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.CONTEXTJ);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error CONTEXTO_DIGITS = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.CONTEXTO_DIGITS);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error CONTEXTO_PUNCTUATION = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.CONTEXTO_PUNCTUATION);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error DISALLOWED = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.DISALLOWED);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error DOMAIN_NAME_TOO_LONG = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.DOMAIN_NAME_TOO_LONG);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error EMPTY_LABEL = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.EMPTY_LABEL);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error HYPHEN_3_4 = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.HYPHEN_3_4);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error INVALID_ACE_LABEL = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.INVALID_ACE_LABEL);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error LABEL_HAS_DOT = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.LABEL_HAS_DOT);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error LABEL_TOO_LONG = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.LABEL_TOO_LONG);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error LEADING_COMBINING_MARK = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.LEADING_COMBINING_MARK);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error LEADING_HYPHEN = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.LEADING_HYPHEN);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error PUNYCODE = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.PUNYCODE);
        public static final com.micklab.dcg.wrapper.android.icu.text.IDNA.Error TRAILING_HYPHEN = com.micklab.dcg.wrapper.android.icu.text.IDNA.Error.wrap(android.icu.text.IDNA.Error.TRAILING_HYPHEN);

    }
    public static final class Info {
        private final android.icu.text.IDNA.Info real;

        public Info(android.icu.text.IDNA.Info real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.IDNA.Info wrap(android.icu.text.IDNA.Info real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.IDNA.Info(real);
        }

        public android.icu.text.IDNA.Info unwrap() {
            return real;
        }

        public Info() {
            this(new android.icu.text.IDNA.Info());
        }

        public boolean hasErrors() {
            return real.hasErrors();
        }

        public boolean isTransitionalDifferent() {
            return real.isTransitionalDifferent();
        }

    }
}
