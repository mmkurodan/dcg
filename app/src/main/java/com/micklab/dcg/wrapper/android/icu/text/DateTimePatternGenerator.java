// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateTimePatternGenerator {
    private final android.icu.text.DateTimePatternGenerator real;

    public DateTimePatternGenerator(android.icu.text.DateTimePatternGenerator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator wrap(android.icu.text.DateTimePatternGenerator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator(real);
    }

    public android.icu.text.DateTimePatternGenerator unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator addPattern(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.PatternInfo arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(real.addPattern(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(real.cloneAsThawed());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(real.freeze());
    }

    public java.lang.String getAppendItemFormat(int arg0) {
        return real.getAppendItemFormat(arg0);
    }

    public java.lang.String getAppendItemName(int arg0) {
        return real.getAppendItemName(arg0);
    }

    public java.lang.String getBaseSkeleton(java.lang.String arg0) {
        return real.getBaseSkeleton(arg0);
    }

    public java.lang.String getBestPattern(java.lang.String arg0) {
        return real.getBestPattern(arg0);
    }

    public java.lang.String getBestPattern(java.lang.String arg0, int arg1) {
        return real.getBestPattern(arg0, arg1);
    }

    public java.lang.String getDateTimeFormat() {
        return real.getDateTimeFormat();
    }

    public java.lang.String getDateTimeFormat(int arg0) {
        return real.getDateTimeFormat(arg0);
    }

    public java.lang.String getDecimal() {
        return real.getDecimal();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle getDefaultHourCycle() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(real.getDefaultHourCycle());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getEmptyInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getEmptyInstance());
    }

    public java.lang.String getFieldDisplayName(int arg0, com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth arg1) {
        return real.getFieldDisplayName(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getInstance(arg0));
    }

    public java.lang.String getSkeleton(java.lang.String arg0) {
        return real.getSkeleton(arg0);
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public java.lang.String replaceFieldTypes(java.lang.String arg0, java.lang.String arg1) {
        return real.replaceFieldTypes(arg0, arg1);
    }

    public java.lang.String replaceFieldTypes(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return real.replaceFieldTypes(arg0, arg1, arg2);
    }

    public void setAppendItemFormat(int arg0, java.lang.String arg1) {
        real.setAppendItemFormat(arg0, arg1);
    }

    public void setAppendItemName(int arg0, java.lang.String arg1) {
        real.setAppendItemName(arg0, arg1);
    }

    public void setDateTimeFormat(java.lang.String arg0) {
        real.setDateTimeFormat(arg0);
    }

    public void setDateTimeFormat(int arg0, java.lang.String arg1) {
        real.setDateTimeFormat(arg0, arg1);
    }

    public void setDecimal(java.lang.String arg0) {
        real.setDecimal(arg0);
    }

    public static final int DAY = android.icu.text.DateTimePatternGenerator.DAY;
    public static final int DAYPERIOD = android.icu.text.DateTimePatternGenerator.DAYPERIOD;
    public static final int DAY_OF_WEEK_IN_MONTH = android.icu.text.DateTimePatternGenerator.DAY_OF_WEEK_IN_MONTH;
    public static final int DAY_OF_YEAR = android.icu.text.DateTimePatternGenerator.DAY_OF_YEAR;
    public static final int ERA = android.icu.text.DateTimePatternGenerator.ERA;
    public static final int FRACTIONAL_SECOND = android.icu.text.DateTimePatternGenerator.FRACTIONAL_SECOND;
    public static final int HOUR = android.icu.text.DateTimePatternGenerator.HOUR;
    public static final int MATCH_ALL_FIELDS_LENGTH = android.icu.text.DateTimePatternGenerator.MATCH_ALL_FIELDS_LENGTH;
    public static final int MATCH_HOUR_FIELD_LENGTH = android.icu.text.DateTimePatternGenerator.MATCH_HOUR_FIELD_LENGTH;
    public static final int MATCH_NO_OPTIONS = android.icu.text.DateTimePatternGenerator.MATCH_NO_OPTIONS;
    public static final int MINUTE = android.icu.text.DateTimePatternGenerator.MINUTE;
    public static final int MONTH = android.icu.text.DateTimePatternGenerator.MONTH;
    public static final int QUARTER = android.icu.text.DateTimePatternGenerator.QUARTER;
    public static final int SECOND = android.icu.text.DateTimePatternGenerator.SECOND;
    public static final int WEEKDAY = android.icu.text.DateTimePatternGenerator.WEEKDAY;
    public static final int WEEK_OF_MONTH = android.icu.text.DateTimePatternGenerator.WEEK_OF_MONTH;
    public static final int WEEK_OF_YEAR = android.icu.text.DateTimePatternGenerator.WEEK_OF_YEAR;
    public static final int YEAR = android.icu.text.DateTimePatternGenerator.YEAR;
    public static final int ZONE = android.icu.text.DateTimePatternGenerator.ZONE;

    public static final class DisplayWidth {
        private final android.icu.text.DateTimePatternGenerator.DisplayWidth real;

        public DisplayWidth(android.icu.text.DateTimePatternGenerator.DisplayWidth real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth wrap(android.icu.text.DateTimePatternGenerator.DisplayWidth real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth(real);
        }

        public android.icu.text.DateTimePatternGenerator.DisplayWidth unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth.wrap(android.icu.text.DateTimePatternGenerator.DisplayWidth.valueOf(arg0));
        }

        public static android.icu.text.DateTimePatternGenerator.DisplayWidth[] values() {
            return android.icu.text.DateTimePatternGenerator.DisplayWidth.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth ABBREVIATED = com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth.wrap(android.icu.text.DateTimePatternGenerator.DisplayWidth.ABBREVIATED);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth NARROW = com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth.wrap(android.icu.text.DateTimePatternGenerator.DisplayWidth.NARROW);
        public static final com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth WIDE = com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth.wrap(android.icu.text.DateTimePatternGenerator.DisplayWidth.WIDE);

    }
    public static final class PatternInfo {
        private final android.icu.text.DateTimePatternGenerator.PatternInfo real;

        public PatternInfo(android.icu.text.DateTimePatternGenerator.PatternInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.PatternInfo wrap(android.icu.text.DateTimePatternGenerator.PatternInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.PatternInfo(real);
        }

        public android.icu.text.DateTimePatternGenerator.PatternInfo unwrap() {
            return real;
        }

        public PatternInfo() {
            this(new android.icu.text.DateTimePatternGenerator.PatternInfo());
        }

        public static final int BASE_CONFLICT = android.icu.text.DateTimePatternGenerator.PatternInfo.BASE_CONFLICT;
        public static final int CONFLICT = android.icu.text.DateTimePatternGenerator.PatternInfo.CONFLICT;
        public static final int OK = android.icu.text.DateTimePatternGenerator.PatternInfo.OK;

    }
}
