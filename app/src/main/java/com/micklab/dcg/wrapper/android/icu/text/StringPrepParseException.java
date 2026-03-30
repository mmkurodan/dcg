// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class StringPrepParseException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StringPrepParseException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.StringPrepParseException wrap(android.icu.text.StringPrepParseException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.StringPrepParseException(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.StringPrepParseException getReal() {
        return (android.icu.text.StringPrepParseException) real;
    }

    public android.icu.text.StringPrepParseException unwrap() {
        return getReal();
    }

    public StringPrepParseException(java.lang.String arg0, int arg1) {
        this(new android.icu.text.StringPrepParseException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public StringPrepParseException(java.lang.String arg0, int arg1, java.lang.String arg2, int arg3) {
        this(new android.icu.text.StringPrepParseException(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public StringPrepParseException(java.lang.String arg0, int arg1, java.lang.String arg2, int arg3, int arg4) {
        this(new android.icu.text.StringPrepParseException(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.StringPrepParseException) real).equals(arg0);
    }

    public int getError() {
        return ((android.icu.text.StringPrepParseException) real).getError();
    }

    public int hashCode() {
        return ((android.icu.text.StringPrepParseException) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.icu.text.StringPrepParseException) real).toString();
    }

    public static final int ACE_PREFIX_ERROR = android.icu.text.StringPrepParseException.ACE_PREFIX_ERROR;
    public static final int BUFFER_OVERFLOW_ERROR = android.icu.text.StringPrepParseException.BUFFER_OVERFLOW_ERROR;
    public static final int CHECK_BIDI_ERROR = android.icu.text.StringPrepParseException.CHECK_BIDI_ERROR;
    public static final int DOMAIN_NAME_TOO_LONG_ERROR = android.icu.text.StringPrepParseException.DOMAIN_NAME_TOO_LONG_ERROR;
    public static final int ILLEGAL_CHAR_FOUND = android.icu.text.StringPrepParseException.ILLEGAL_CHAR_FOUND;
    public static final int INVALID_CHAR_FOUND = android.icu.text.StringPrepParseException.INVALID_CHAR_FOUND;
    public static final int LABEL_TOO_LONG_ERROR = android.icu.text.StringPrepParseException.LABEL_TOO_LONG_ERROR;
    public static final int PROHIBITED_ERROR = android.icu.text.StringPrepParseException.PROHIBITED_ERROR;
    public static final int STD3_ASCII_RULES_ERROR = android.icu.text.StringPrepParseException.STD3_ASCII_RULES_ERROR;
    public static final int UNASSIGNED_ERROR = android.icu.text.StringPrepParseException.UNASSIGNED_ERROR;
    public static final int VERIFICATION_ERROR = android.icu.text.StringPrepParseException.VERIFICATION_ERROR;
    public static final int ZERO_LENGTH_LABEL = android.icu.text.StringPrepParseException.ZERO_LENGTH_LABEL;

}
