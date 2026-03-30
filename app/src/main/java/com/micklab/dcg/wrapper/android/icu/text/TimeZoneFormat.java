// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class TimeZoneFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeZoneFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat wrap(android.icu.text.TimeZoneFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.TimeZoneFormat getReal() {
        return (android.icu.text.TimeZoneFormat) real;
    }

    public android.icu.text.TimeZoneFormat unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).cloneAsThawed());
    }

    public java.lang.String format(com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style arg0, com.micklab.dcg.wrapper.android.icu.util.TimeZone arg1, long arg2) {
        return ((android.icu.text.TimeZoneFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.TimeZoneFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.String formatOffsetISO8601Basic(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        return ((android.icu.text.TimeZoneFormat) real).formatOffsetISO8601Basic(arg0, arg1, arg2, arg3);
    }

    public java.lang.String formatOffsetISO8601Extended(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        return ((android.icu.text.TimeZoneFormat) real).formatOffsetISO8601Extended(arg0, arg1, arg2, arg3);
    }

    public java.lang.String formatOffsetLocalizedGMT(int arg0) {
        return ((android.icu.text.TimeZoneFormat) real).formatOffsetLocalizedGMT(arg0);
    }

    public java.lang.String formatOffsetShortLocalizedGMT(int arg0) {
        return ((android.icu.text.TimeZoneFormat) real).formatOffsetShortLocalizedGMT(arg0);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return ((android.icu.text.TimeZoneFormat) real).formatToCharacterIterator(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).freeze());
    }

    public java.lang.String getGMTOffsetDigits() {
        return ((android.icu.text.TimeZoneFormat) real).getGMTOffsetDigits();
    }

    public java.lang.String getGMTOffsetPattern(com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType arg0) {
        return ((android.icu.text.TimeZoneFormat) real).getGMTOffsetPattern(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getGMTPattern() {
        return ((android.icu.text.TimeZoneFormat) real).getGMTPattern();
    }

    public java.lang.String getGMTZeroFormat() {
        return ((android.icu.text.TimeZoneFormat) real).getGMTZeroFormat();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(android.icu.text.TimeZoneFormat.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(android.icu.text.TimeZoneFormat.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames getTimeZoneNames() {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.wrap(((android.icu.text.TimeZoneFormat) real).getTimeZoneNames());
    }

    public boolean isFrozen() {
        return ((android.icu.text.TimeZoneFormat) real).isFrozen();
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone parse(java.lang.String arg0) throws java.text.ParseException {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(((android.icu.text.TimeZoneFormat) real).parse(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(((android.icu.text.TimeZoneFormat) real).parse(arg0, arg1));
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.TimeZoneFormat) real).parseObject(arg0, arg1);
    }

    public int parseOffsetISO8601(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.TimeZoneFormat) real).parseOffsetISO8601(arg0, arg1);
    }

    public int parseOffsetLocalizedGMT(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.TimeZoneFormat) real).parseOffsetLocalizedGMT(arg0, arg1);
    }

    public int parseOffsetShortLocalizedGMT(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.TimeZoneFormat) real).parseOffsetShortLocalizedGMT(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat setGMTOffsetDigits(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).setGMTOffsetDigits(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat setGMTOffsetPattern(com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).setGMTOffsetPattern(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat setGMTPattern(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).setGMTPattern(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat setGMTZeroFormat(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).setGMTZeroFormat(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat setTimeZoneNames(com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.wrap(((android.icu.text.TimeZoneFormat) real).setTimeZoneNames(arg0 == null ? null : arg0.getReal()));
    }

    public static final class GMTOffsetPatternType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private GMTOffsetPatternType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.TimeZoneFormat.GMTOffsetPatternType getReal() {
            return (android.icu.text.TimeZoneFormat.GMTOffsetPatternType) real;
        }

        public android.icu.text.TimeZoneFormat.GMTOffsetPatternType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.valueOf(arg0));
        }

        public static android.icu.text.TimeZoneFormat.GMTOffsetPatternType[] values() {
            return android.icu.text.TimeZoneFormat.GMTOffsetPatternType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType NEGATIVE_H = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.NEGATIVE_H);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType NEGATIVE_HM = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.NEGATIVE_HM);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType NEGATIVE_HMS = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.NEGATIVE_HMS);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType POSITIVE_H = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.POSITIVE_H);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType POSITIVE_HM = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.POSITIVE_HM);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType POSITIVE_HMS = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.GMTOffsetPatternType.wrap(android.icu.text.TimeZoneFormat.GMTOffsetPatternType.POSITIVE_HMS);

    }
    public static final class ParseOption {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ParseOption(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption wrap(android.icu.text.TimeZoneFormat.ParseOption real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.TimeZoneFormat.ParseOption getReal() {
            return (android.icu.text.TimeZoneFormat.ParseOption) real;
        }

        public android.icu.text.TimeZoneFormat.ParseOption unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption.wrap(android.icu.text.TimeZoneFormat.ParseOption.valueOf(arg0));
        }

        public static android.icu.text.TimeZoneFormat.ParseOption[] values() {
            return android.icu.text.TimeZoneFormat.ParseOption.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption ALL_STYLES = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption.wrap(android.icu.text.TimeZoneFormat.ParseOption.ALL_STYLES);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption TZ_DATABASE_ABBREVIATIONS = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.ParseOption.wrap(android.icu.text.TimeZoneFormat.ParseOption.TZ_DATABASE_ABBREVIATIONS);

    }
    public static final class Style {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Style(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style wrap(android.icu.text.TimeZoneFormat.Style real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.TimeZoneFormat.Style getReal() {
            return (android.icu.text.TimeZoneFormat.Style) real;
        }

        public android.icu.text.TimeZoneFormat.Style unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.valueOf(arg0));
        }

        public static android.icu.text.TimeZoneFormat.Style[] values() {
            return android.icu.text.TimeZoneFormat.Style.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style EXEMPLAR_LOCATION = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.EXEMPLAR_LOCATION);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style GENERIC_LOCATION = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.GENERIC_LOCATION);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style GENERIC_LONG = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.GENERIC_LONG);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style GENERIC_SHORT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.GENERIC_SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_BASIC_FIXED = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_BASIC_FIXED);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_BASIC_FULL = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_BASIC_FULL);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_BASIC_LOCAL_FIXED = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_BASIC_LOCAL_FIXED);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_BASIC_LOCAL_FULL = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_BASIC_LOCAL_FULL);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_BASIC_LOCAL_SHORT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_BASIC_LOCAL_SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_BASIC_SHORT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_BASIC_SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_EXTENDED_FIXED = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_EXTENDED_FIXED);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_EXTENDED_FULL = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_EXTENDED_FULL);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_EXTENDED_LOCAL_FIXED = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FIXED);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ISO_EXTENDED_LOCAL_FULL = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FULL);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style LOCALIZED_GMT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.LOCALIZED_GMT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style LOCALIZED_GMT_SHORT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.LOCALIZED_GMT_SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style SPECIFIC_LONG = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.SPECIFIC_LONG);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style SPECIFIC_SHORT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.SPECIFIC_SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ZONE_ID = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ZONE_ID);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style ZONE_ID_SHORT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.Style.wrap(android.icu.text.TimeZoneFormat.Style.ZONE_ID_SHORT);

    }
    public static final class TimeType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TimeType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType wrap(android.icu.text.TimeZoneFormat.TimeType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.TimeZoneFormat.TimeType getReal() {
            return (android.icu.text.TimeZoneFormat.TimeType) real;
        }

        public android.icu.text.TimeZoneFormat.TimeType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType.wrap(android.icu.text.TimeZoneFormat.TimeType.valueOf(arg0));
        }

        public static android.icu.text.TimeZoneFormat.TimeType[] values() {
            return android.icu.text.TimeZoneFormat.TimeType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType DAYLIGHT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType.wrap(android.icu.text.TimeZoneFormat.TimeType.DAYLIGHT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType STANDARD = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType.wrap(android.icu.text.TimeZoneFormat.TimeType.STANDARD);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType UNKNOWN = com.micklab.dcg.wrapper.android.icu.text.TimeZoneFormat.TimeType.wrap(android.icu.text.TimeZoneFormat.TimeType.UNKNOWN);

    }
}
