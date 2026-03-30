// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class MessageFormat {
    private final android.icu.text.MessageFormat real;

    public MessageFormat(android.icu.text.MessageFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MessageFormat wrap(android.icu.text.MessageFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessageFormat(real);
    }

    public android.icu.text.MessageFormat unwrap() {
        return real;
    }

    public MessageFormat(java.lang.String arg0) {
        this(new android.icu.text.MessageFormat(arg0));
    }

    public MessageFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        this(new android.icu.text.MessageFormat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public MessageFormat(java.lang.String arg0, java.util.Locale arg1) {
        this(new android.icu.text.MessageFormat(arg0, arg1));
    }

    public void applyPattern(java.lang.String arg0) {
        real.applyPattern(arg0);
    }

    public void applyPattern(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode arg1) {
        real.applyPattern(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String autoQuoteApostrophe(java.lang.String arg0) {
        return android.icu.text.MessageFormat.autoQuoteApostrophe(arg0);
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static java.lang.String format(java.lang.String arg0, java.lang.Object... arg1) {
        return android.icu.text.MessageFormat.format(arg0, arg1);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object[] arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return real.formatToCharacterIterator(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode getApostropheMode() {
        return com.micklab.dcg.wrapper.android.icu.text.MessagePattern.ApostropheMode.wrap(real.getApostropheMode());
    }

    public java.text.Format getFormatByArgumentName(java.lang.String arg0) {
        return real.getFormatByArgumentName(arg0);
    }

    public java.text.Format[] getFormats() {
        return real.getFormats();
    }

    public java.text.Format[] getFormatsByArgumentIndex() {
        return real.getFormatsByArgumentIndex();
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getULocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getULocale());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.Object[] parse(java.lang.String arg0) throws java.text.ParseException {
        return real.parse(arg0);
    }

    public java.lang.Object[] parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parse(arg0, arg1);
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parseObject(arg0, arg1);
    }

    public void setFormat(int arg0, java.text.Format arg1) {
        real.setFormat(arg0, arg1);
    }

    public void setFormatByArgumentIndex(int arg0, java.text.Format arg1) {
        real.setFormatByArgumentIndex(arg0, arg1);
    }

    public void setFormatByArgumentName(java.lang.String arg0, java.text.Format arg1) {
        real.setFormatByArgumentName(arg0, arg1);
    }

    public void setFormats(java.text.Format[] arg0) {
        real.setFormats(arg0);
    }

    public void setFormatsByArgumentIndex(java.text.Format[] arg0) {
        real.setFormatsByArgumentIndex(arg0);
    }

    public void setLocale(java.util.Locale arg0) {
        real.setLocale(arg0);
    }

    public void setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        real.setLocale(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toPattern() {
        return real.toPattern();
    }

    public boolean usesNamedArguments() {
        return real.usesNamedArguments();
    }

    public static final class Field {
        private final android.icu.text.MessageFormat.Field real;

        public Field(android.icu.text.MessageFormat.Field real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field wrap(android.icu.text.MessageFormat.Field real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field(real);
        }

        public android.icu.text.MessageFormat.Field unwrap() {
            return real;
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field ARGUMENT = com.micklab.dcg.wrapper.android.icu.text.MessageFormat.Field.wrap(android.icu.text.MessageFormat.Field.ARGUMENT);

    }
}
