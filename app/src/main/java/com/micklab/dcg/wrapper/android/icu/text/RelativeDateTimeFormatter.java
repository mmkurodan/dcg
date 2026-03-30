// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class RelativeDateTimeFormatter {
    private final android.icu.text.RelativeDateTimeFormatter real;

    public RelativeDateTimeFormatter(android.icu.text.RelativeDateTimeFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter wrap(android.icu.text.RelativeDateTimeFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter(real);
    }

    public android.icu.text.RelativeDateTimeFormatter unwrap() {
        return real;
    }

    public java.lang.String combineDateAndTime(java.lang.String arg0, java.lang.String arg1) {
        return real.combineDateAndTime(arg0, arg1);
    }

    public java.lang.String format(com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit arg1) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String format(double arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit arg1) {
        return real.format(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.String format(double arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction arg1, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit arg2) {
        return real.format(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.String formatNumeric(double arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit arg1) {
        return real.formatNumeric(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatNumericToValue(double arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime.wrap(real.formatNumericToValue(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatToValue(com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime.wrap(real.formatToValue(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatToValue(double arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime.wrap(real.formatToValue(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatToValue(double arg0, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction arg1, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime.wrap(real.formatToValue(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext getCapitalizationContext() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(real.getCapitalizationContext());
    }

    public com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style getFormatStyle() {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style.wrap(real.getFormatStyle());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.wrap(android.icu.text.RelativeDateTimeFormatter.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.wrap(android.icu.text.RelativeDateTimeFormatter.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.wrap(android.icu.text.RelativeDateTimeFormatter.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.wrap(android.icu.text.RelativeDateTimeFormatter.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.wrap(android.icu.text.RelativeDateTimeFormatter.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg1, com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style arg2, com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg3) {
        return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.wrap(android.icu.text.RelativeDateTimeFormatter.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(real.getNumberFormat());
    }

    public static final class AbsoluteUnit {
        private final android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit real;

        public AbsoluteUnit(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit(real);
        }

        public android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.valueOf(arg0));
        }

        public static android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit[] values() {
            return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit DAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.DAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit FRIDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.FRIDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit HOUR = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.HOUR);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit MINUTE = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.MINUTE);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit MONDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.MONDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit MONTH = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.MONTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit NOW = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit QUARTER = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.QUARTER);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit SATURDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.SATURDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit SUNDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.SUNDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit THURSDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.THURSDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit TUESDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.TUESDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit WEDNESDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.WEDNESDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit WEEK = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.WEEK);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit YEAR = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.wrap(android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.YEAR);

    }
    public static final class Direction {
        private final android.icu.text.RelativeDateTimeFormatter.Direction real;

        public Direction(android.icu.text.RelativeDateTimeFormatter.Direction real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction wrap(android.icu.text.RelativeDateTimeFormatter.Direction real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction(real);
        }

        public android.icu.text.RelativeDateTimeFormatter.Direction unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.valueOf(arg0));
        }

        public static android.icu.text.RelativeDateTimeFormatter.Direction[] values() {
            return android.icu.text.RelativeDateTimeFormatter.Direction.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction LAST = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.LAST);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction LAST_2 = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.LAST_2);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction NEXT = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.NEXT);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction NEXT_2 = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.NEXT_2);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction PLAIN = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.PLAIN);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction THIS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Direction.wrap(android.icu.text.RelativeDateTimeFormatter.Direction.THIS);

    }
    public static final class FormattedRelativeDateTime {
        private final android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime real;

        public FormattedRelativeDateTime(android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime wrap(android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime(real);
        }

        public android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime unwrap() {
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
    public static final class RelativeDateTimeUnit {
        private final android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit real;

        public RelativeDateTimeUnit(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit(real);
        }

        public android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.valueOf(arg0));
        }

        public static android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit[] values() {
            return android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit DAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.DAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit FRIDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.FRIDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit HOUR = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.HOUR);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit MINUTE = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.MINUTE);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit MONDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.MONDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit MONTH = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.MONTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit QUARTER = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.QUARTER);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit SATURDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.SATURDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit SECOND = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.SECOND);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit SUNDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.SUNDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit THURSDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.THURSDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit TUESDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.TUESDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit WEDNESDAY = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.WEDNESDAY);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit WEEK = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.WEEK);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit YEAR = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit.YEAR);

    }
    public static final class RelativeUnit {
        private final android.icu.text.RelativeDateTimeFormatter.RelativeUnit real;

        public RelativeUnit(android.icu.text.RelativeDateTimeFormatter.RelativeUnit real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit(real);
        }

        public android.icu.text.RelativeDateTimeFormatter.RelativeUnit unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.valueOf(arg0));
        }

        public static android.icu.text.RelativeDateTimeFormatter.RelativeUnit[] values() {
            return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit DAYS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.DAYS);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit HOURS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.HOURS);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit MINUTES = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MINUTES);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit MONTHS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MONTHS);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit SECONDS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.SECONDS);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit WEEKS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.WEEKS);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit YEARS = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.RelativeUnit.wrap(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.YEARS);

    }
    public static final class Style {
        private final android.icu.text.RelativeDateTimeFormatter.Style real;

        public Style(android.icu.text.RelativeDateTimeFormatter.Style real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style wrap(android.icu.text.RelativeDateTimeFormatter.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style(real);
        }

        public android.icu.text.RelativeDateTimeFormatter.Style unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style.wrap(android.icu.text.RelativeDateTimeFormatter.Style.valueOf(arg0));
        }

        public static android.icu.text.RelativeDateTimeFormatter.Style[] values() {
            return android.icu.text.RelativeDateTimeFormatter.Style.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style LONG = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style.wrap(android.icu.text.RelativeDateTimeFormatter.Style.LONG);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style NARROW = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style.wrap(android.icu.text.RelativeDateTimeFormatter.Style.NARROW);
        public static final com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style SHORT = com.micklab.dcg.wrapper.android.icu.text.RelativeDateTimeFormatter.Style.wrap(android.icu.text.RelativeDateTimeFormatter.Style.SHORT);

    }
}
