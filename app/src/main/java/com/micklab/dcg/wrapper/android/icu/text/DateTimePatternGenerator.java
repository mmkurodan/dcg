// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateTimePatternGenerator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateTimePatternGenerator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator wrap(android.icu.text.DateTimePatternGenerator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DateTimePatternGenerator getReal() {
        return (android.icu.text.DateTimePatternGenerator) real;
    }

    public android.icu.text.DateTimePatternGenerator unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator addPattern(java.lang.String arg0, boolean arg1, com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.PatternInfo arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(((android.icu.text.DateTimePatternGenerator) real).addPattern(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.Object clone() {
        return ((android.icu.text.DateTimePatternGenerator) real).clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(((android.icu.text.DateTimePatternGenerator) real).cloneAsThawed());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(((android.icu.text.DateTimePatternGenerator) real).freeze());
    }

    public java.lang.String getAppendItemFormat(int arg0) {
        return ((android.icu.text.DateTimePatternGenerator) real).getAppendItemFormat(arg0);
    }

    public java.lang.String getAppendItemName(int arg0) {
        return ((android.icu.text.DateTimePatternGenerator) real).getAppendItemName(arg0);
    }

    public java.lang.String getBaseSkeleton(java.lang.String arg0) {
        return ((android.icu.text.DateTimePatternGenerator) real).getBaseSkeleton(arg0);
    }

    public java.lang.String getBestPattern(java.lang.String arg0) {
        return ((android.icu.text.DateTimePatternGenerator) real).getBestPattern(arg0);
    }

    public java.lang.String getBestPattern(java.lang.String arg0, int arg1) {
        return ((android.icu.text.DateTimePatternGenerator) real).getBestPattern(arg0, arg1);
    }

    public java.lang.String getDateTimeFormat() {
        return ((android.icu.text.DateTimePatternGenerator) real).getDateTimeFormat();
    }

    public java.lang.String getDateTimeFormat(int arg0) {
        return ((android.icu.text.DateTimePatternGenerator) real).getDateTimeFormat(arg0);
    }

    public java.lang.String getDecimal() {
        return ((android.icu.text.DateTimePatternGenerator) real).getDecimal();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle getDefaultHourCycle() {
        return com.micklab.dcg.wrapper.android.icu.text.DateFormat.HourCycle.wrap(((android.icu.text.DateTimePatternGenerator) real).getDefaultHourCycle());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getEmptyInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getEmptyInstance());
    }

    public java.lang.String getFieldDisplayName(int arg0, com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth arg1) {
        return ((android.icu.text.DateTimePatternGenerator) real).getFieldDisplayName(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.wrap(android.icu.text.DateTimePatternGenerator.getInstance(arg0));
    }

    public java.lang.String getSkeleton(java.lang.String arg0) {
        return ((android.icu.text.DateTimePatternGenerator) real).getSkeleton(arg0);
    }

    public boolean isFrozen() {
        return ((android.icu.text.DateTimePatternGenerator) real).isFrozen();
    }

    public java.lang.String replaceFieldTypes(java.lang.String arg0, java.lang.String arg1) {
        return ((android.icu.text.DateTimePatternGenerator) real).replaceFieldTypes(arg0, arg1);
    }

    public java.lang.String replaceFieldTypes(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return ((android.icu.text.DateTimePatternGenerator) real).replaceFieldTypes(arg0, arg1, arg2);
    }

    public void setAppendItemFormat(int arg0, java.lang.String arg1) {
        ((android.icu.text.DateTimePatternGenerator) real).setAppendItemFormat(arg0, arg1);
    }

    public void setAppendItemName(int arg0, java.lang.String arg1) {
        ((android.icu.text.DateTimePatternGenerator) real).setAppendItemName(arg0, arg1);
    }

    public void setDateTimeFormat(java.lang.String arg0) {
        ((android.icu.text.DateTimePatternGenerator) real).setDateTimeFormat(arg0);
    }

    public void setDateTimeFormat(int arg0, java.lang.String arg1) {
        ((android.icu.text.DateTimePatternGenerator) real).setDateTimeFormat(arg0, arg1);
    }

    public void setDecimal(java.lang.String arg0) {
        ((android.icu.text.DateTimePatternGenerator) real).setDecimal(arg0);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DisplayWidth(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth wrap(android.icu.text.DateTimePatternGenerator.DisplayWidth real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.DisplayWidth(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DateTimePatternGenerator.DisplayWidth getReal() {
            return (android.icu.text.DateTimePatternGenerator.DisplayWidth) real;
        }

        public android.icu.text.DateTimePatternGenerator.DisplayWidth unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PatternInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.PatternInfo wrap(android.icu.text.DateTimePatternGenerator.PatternInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateTimePatternGenerator.PatternInfo(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DateTimePatternGenerator.PatternInfo getReal() {
            return (android.icu.text.DateTimePatternGenerator.PatternInfo) real;
        }

        public android.icu.text.DateTimePatternGenerator.PatternInfo unwrap() {
            return getReal();
        }

        public PatternInfo() {
            this(new android.icu.text.DateTimePatternGenerator.PatternInfo(), (__DcgwBridgeToken) null);
        }

        public static final int BASE_CONFLICT = android.icu.text.DateTimePatternGenerator.PatternInfo.BASE_CONFLICT;
        public static final int CONFLICT = android.icu.text.DateTimePatternGenerator.PatternInfo.CONFLICT;
        public static final int OK = android.icu.text.DateTimePatternGenerator.PatternInfo.OK;

    }
}
