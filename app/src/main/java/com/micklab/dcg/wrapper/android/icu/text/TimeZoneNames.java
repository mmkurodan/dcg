// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class TimeZoneNames {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeZoneNames(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames wrap(android.icu.text.TimeZoneNames real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.TimeZoneNames getReal() {
        return (android.icu.text.TimeZoneNames) real;
    }

    public android.icu.text.TimeZoneNames unwrap() {
        return getReal();
    }

    public java.lang.String getDisplayName(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType arg1, long arg2) {
        return ((android.icu.text.TimeZoneNames) real).getDisplayName(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public java.lang.String getExemplarLocationName(java.lang.String arg0) {
        return ((android.icu.text.TimeZoneNames) real).getExemplarLocationName(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.wrap(android.icu.text.TimeZoneNames.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.wrap(android.icu.text.TimeZoneNames.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String getMetaZoneDisplayName(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType arg1) {
        return ((android.icu.text.TimeZoneNames) real).getMetaZoneDisplayName(arg0, arg1 == null ? null : arg1.getReal());
    }

    public java.lang.String getMetaZoneID(java.lang.String arg0, long arg1) {
        return ((android.icu.text.TimeZoneNames) real).getMetaZoneID(arg0, arg1);
    }

    public java.lang.String getReferenceZoneID(java.lang.String arg0, java.lang.String arg1) {
        return ((android.icu.text.TimeZoneNames) real).getReferenceZoneID(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames getTZDBInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.wrap(android.icu.text.TimeZoneNames.getTZDBInstance(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String getTimeZoneDisplayName(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType arg1) {
        return ((android.icu.text.TimeZoneNames) real).getTimeZoneDisplayName(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static final class NameType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NameType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType wrap(android.icu.text.TimeZoneNames.NameType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.TimeZoneNames.NameType getReal() {
            return (android.icu.text.TimeZoneNames.NameType) real;
        }

        public android.icu.text.TimeZoneNames.NameType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.valueOf(arg0));
        }

        public static android.icu.text.TimeZoneNames.NameType[] values() {
            return android.icu.text.TimeZoneNames.NameType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType EXEMPLAR_LOCATION = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.EXEMPLAR_LOCATION);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType LONG_DAYLIGHT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.LONG_DAYLIGHT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType LONG_GENERIC = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.LONG_GENERIC);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType LONG_STANDARD = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.LONG_STANDARD);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType SHORT_DAYLIGHT = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.SHORT_DAYLIGHT);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType SHORT_GENERIC = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.SHORT_GENERIC);
        public static final com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType SHORT_STANDARD = com.micklab.dcg.wrapper.android.icu.text.TimeZoneNames.NameType.wrap(android.icu.text.TimeZoneNames.NameType.SHORT_STANDARD);

    }
}
