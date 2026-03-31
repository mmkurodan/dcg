// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class MessageFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MessageFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MessageFormat wrap(android.icu.text.MessageFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessageFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.MessageFormat getReal() {
        return (android.icu.text.MessageFormat) real;
    }

    public android.icu.text.MessageFormat unwrap() {
        return getReal();
    }

    public MessageFormat(java.lang.String arg0) {
        this(new android.icu.text.MessageFormat(arg0), (__DcgwBridgeToken) null);
    }

    public MessageFormat(java.lang.String arg0, java.util.Locale arg1) {
        this(new android.icu.text.MessageFormat(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public MessageFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.MessageFormat(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void applyPattern(java.lang.String arg0) {
        ((android.icu.text.MessageFormat) real).applyPattern(arg0);
    }

    public void applyPattern(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode arg1) {
        ((android.icu.text.MessageFormat) real).applyPattern(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static java.lang.String autoQuoteApostrophe(java.lang.String arg0) {
        return android.icu.text.MessageFormat.autoQuoteApostrophe(arg0);
    }

    public java.lang.Object clone() {
        return ((android.icu.text.MessageFormat) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.MessageFormat) real).equals(arg0);
    }

    public static java.lang.String format(java.lang.String arg0, java.lang.Object... arg1) {
        return android.icu.text.MessageFormat.format(arg0, arg1);
    }

    public java.lang.StringBuffer format(java.lang.Object[] arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.MessageFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.MessageFormat) real).format(arg0, arg1, arg2);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return ((android.icu.text.MessageFormat) real).formatToCharacterIterator(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode getApostropheMode() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(((android.icu.text.MessageFormat) real).getApostropheMode());
    }

    public java.text.Format getFormatByArgumentName(java.lang.String arg0) {
        return ((android.icu.text.MessageFormat) real).getFormatByArgumentName(arg0);
    }

    public java.text.Format[] getFormats() {
        return ((android.icu.text.MessageFormat) real).getFormats();
    }

    public java.text.Format[] getFormatsByArgumentIndex() {
        return ((android.icu.text.MessageFormat) real).getFormatsByArgumentIndex();
    }

    public java.util.Locale getLocale() {
        return ((android.icu.text.MessageFormat) real).getLocale();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getULocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.icu.text.MessageFormat) real).getULocale());
    }

    public int hashCode() {
        return ((android.icu.text.MessageFormat) real).hashCode();
    }

    public java.lang.Object[] parse(java.lang.String arg0) throws java.text.ParseException {
        return ((android.icu.text.MessageFormat) real).parse(arg0);
    }

    public java.lang.Object[] parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.MessageFormat) real).parse(arg0, arg1);
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.MessageFormat) real).parseObject(arg0, arg1);
    }

    public void setFormat(int arg0, java.text.Format arg1) {
        ((android.icu.text.MessageFormat) real).setFormat(arg0, arg1);
    }

    public void setFormatByArgumentIndex(int arg0, java.text.Format arg1) {
        ((android.icu.text.MessageFormat) real).setFormatByArgumentIndex(arg0, arg1);
    }

    public void setFormatByArgumentName(java.lang.String arg0, java.text.Format arg1) {
        ((android.icu.text.MessageFormat) real).setFormatByArgumentName(arg0, arg1);
    }

    public void setFormats(java.text.Format[] arg0) {
        ((android.icu.text.MessageFormat) real).setFormats(arg0);
    }

    public void setFormatsByArgumentIndex(java.text.Format[] arg0) {
        ((android.icu.text.MessageFormat) real).setFormatsByArgumentIndex(arg0);
    }

    public void setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        ((android.icu.text.MessageFormat) real).setLocale(arg0 == null ? null : arg0.getReal());
    }

    public void setLocale(java.util.Locale arg0) {
        ((android.icu.text.MessageFormat) real).setLocale(arg0);
    }

    public java.lang.String toPattern() {
        return ((android.icu.text.MessageFormat) real).toPattern();
    }

    public boolean usesNamedArguments() {
        return ((android.icu.text.MessageFormat) real).usesNamedArguments();
    }

    public static final class Field {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Field(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field wrap(android.icu.text.MessageFormat.Field real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.MessageFormat.Field getReal() {
            return (android.icu.text.MessageFormat.Field) real;
        }

        public android.icu.text.MessageFormat.Field unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field ARGUMENT = com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field.wrap(android.icu.text.MessageFormat.Field.ARGUMENT);

    }
}
