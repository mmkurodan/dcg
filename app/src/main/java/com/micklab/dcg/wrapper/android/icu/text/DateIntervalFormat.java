// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateIntervalFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateIntervalFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat wrap(android.icu.text.DateIntervalFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DateIntervalFormat getReal() {
        return (android.icu.text.DateIntervalFormat) real;
    }

    public android.icu.text.DateIntervalFormat unwrap() {
        return getReal();
    }

    public java.lang.Object clone() {
        return ((android.icu.text.DateIntervalFormat) real).clone();
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.DateInterval arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DateIntervalFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DateIntervalFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1, java.lang.StringBuffer arg2, java.text.FieldPosition arg3) {
        return ((android.icu.text.DateIntervalFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval formatToValue(com.micklab.dcg.wrapper.android.icu.util.DateInterval arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval.wrap(((android.icu.text.DateIntervalFormat) real).formatToValue(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval formatToValue(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval.wrap(((android.icu.text.DateIntervalFormat) real).formatToValue(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext getContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(((android.icu.text.DateIntervalFormat) real).getContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(((android.icu.text.DateIntervalFormat) real).getDateFormat());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo getDateIntervalInfo() {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.wrap(((android.icu.text.DateIntervalFormat) real).getDateIntervalInfo());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, java.util.Locale arg1, com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone getTimeZone() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(((android.icu.text.DateIntervalFormat) real).getTimeZone());
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.DateIntervalFormat) real).parseObject(arg0, arg1);
    }

    public void setContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg0) {
        ((android.icu.text.DateIntervalFormat) real).setContext(arg0 == null ? null : arg0.getReal());
    }

    public void setDateIntervalInfo(com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg0) {
        ((android.icu.text.DateIntervalFormat) real).setDateIntervalInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setTimeZone(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        ((android.icu.text.DateIntervalFormat) real).setTimeZone(arg0 == null ? null : arg0.getReal());
    }

    public static final class FormattedDateInterval {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FormattedDateInterval(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval wrap(android.icu.text.DateIntervalFormat.FormattedDateInterval real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DateIntervalFormat.FormattedDateInterval getReal() {
            return (android.icu.text.DateIntervalFormat.FormattedDateInterval) real;
        }

        public android.icu.text.DateIntervalFormat.FormattedDateInterval unwrap() {
            return getReal();
        }

        public char charAt(int arg0) {
            return ((android.icu.text.DateIntervalFormat.FormattedDateInterval) real).charAt(arg0);
        }

        public int length() {
            return ((android.icu.text.DateIntervalFormat.FormattedDateInterval) real).length();
        }

        public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
            return ((android.icu.text.DateIntervalFormat.FormattedDateInterval) real).nextPosition(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence subSequence(int arg0, int arg1) {
            return ((android.icu.text.DateIntervalFormat.FormattedDateInterval) real).subSequence(arg0, arg1);
        }

        public java.text.AttributedCharacterIterator toCharacterIterator() {
            return ((android.icu.text.DateIntervalFormat.FormattedDateInterval) real).toCharacterIterator();
        }

        public java.lang.String toString() {
            return ((android.icu.text.DateIntervalFormat.FormattedDateInterval) real).toString();
        }

    }
}
