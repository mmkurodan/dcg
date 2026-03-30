// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateIntervalFormat {
    private final android.icu.text.DateIntervalFormat real;

    public DateIntervalFormat(android.icu.text.DateIntervalFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat wrap(android.icu.text.DateIntervalFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat(real);
    }

    public android.icu.text.DateIntervalFormat unwrap() {
        return real;
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.DateInterval arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1, java.lang.StringBuffer arg2, java.text.FieldPosition arg3) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval formatToValue(com.micklab.dcg.wrapper.android.icu.util.DateInterval arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval.wrap(real.formatToValue(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval formatToValue(com.micklab.dcg.wrapper.android.icu.util.Calendar arg0, com.micklab.dcg.wrapper.android.icu.util.Calendar arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval.wrap(real.formatToValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext getContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(real.getContext(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat getDateFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.wrap(real.getDateFormat());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo getDateIntervalInfo() {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.wrap(real.getDateIntervalInfo());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, java.util.Locale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat getInstance(java.lang.String arg0, java.util.Locale arg1, com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.wrap(android.icu.text.DateIntervalFormat.getInstance(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone getTimeZone() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(real.getTimeZone());
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parseObject(arg0, arg1);
    }

    public void setContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg0) {
        real.setContext(arg0 == null ? null : arg0.unwrap());
    }

    public void setDateIntervalInfo(com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo arg0) {
        real.setDateIntervalInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setTimeZone(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        real.setTimeZone(arg0 == null ? null : arg0.unwrap());
    }

    public static final class FormattedDateInterval {
        private final android.icu.text.DateIntervalFormat.FormattedDateInterval real;

        public FormattedDateInterval(android.icu.text.DateIntervalFormat.FormattedDateInterval real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval wrap(android.icu.text.DateIntervalFormat.FormattedDateInterval real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalFormat.FormattedDateInterval(real);
        }

        public android.icu.text.DateIntervalFormat.FormattedDateInterval unwrap() {
            return real;
        }

        public char charAt(int arg0) {
            return real.charAt(arg0);
        }

        public int length() {
            return real.length();
        }

        public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
            return real.nextPosition(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.CharSequence subSequence(int arg0, int arg1) {
            return real.subSequence(arg0, arg1);
        }

        public java.text.AttributedCharacterIterator toCharacterIterator() {
            return real.toCharacterIterator();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
