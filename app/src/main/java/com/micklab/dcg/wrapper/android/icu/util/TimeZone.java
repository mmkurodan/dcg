// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class TimeZone {
    private final android.icu.util.TimeZone real;

    public TimeZone(android.icu.util.TimeZone real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeZone wrap(android.icu.util.TimeZone real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.TimeZone(real);
    }

    public android.icu.util.TimeZone unwrap() {
        return real;
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(real.cloneAsThawed());
    }

    public static int countEquivalentIDs(java.lang.String arg0) {
        return android.icu.util.TimeZone.countEquivalentIDs(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.util.TimeZone freeze() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(real.freeze());
    }

    public static java.lang.String[] getAvailableIDs() {
        return android.icu.util.TimeZone.getAvailableIDs();
    }

    public static java.lang.String[] getAvailableIDs(int arg0) {
        return android.icu.util.TimeZone.getAvailableIDs(arg0);
    }

    public static java.lang.String[] getAvailableIDs(java.lang.String arg0) {
        return android.icu.util.TimeZone.getAvailableIDs(arg0);
    }

    public static java.lang.String getCanonicalID(java.lang.String arg0) {
        return android.icu.util.TimeZone.getCanonicalID(arg0);
    }

    public static java.lang.String getCanonicalID(java.lang.String arg0, boolean[] arg1) {
        return android.icu.util.TimeZone.getCanonicalID(arg0, arg1);
    }

    public int getDSTSavings() {
        return real.getDSTSavings();
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeZone getDefault() {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(android.icu.util.TimeZone.getDefault());
    }

    public java.lang.String getDisplayName() {
        return real.getDisplayName();
    }

    public java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return real.getDisplayName(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getDisplayName(java.util.Locale arg0) {
        return real.getDisplayName(arg0);
    }

    public java.lang.String getDisplayName(boolean arg0, int arg1) {
        return real.getDisplayName(arg0, arg1);
    }

    public java.lang.String getDisplayName(boolean arg0, int arg1, java.util.Locale arg2) {
        return real.getDisplayName(arg0, arg1, arg2);
    }

    public java.lang.String getDisplayName(boolean arg0, int arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        return real.getDisplayName(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static java.lang.String getEquivalentID(java.lang.String arg0, int arg1) {
        return android.icu.util.TimeZone.getEquivalentID(arg0, arg1);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeZone getFrozenTimeZone(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(android.icu.util.TimeZone.getFrozenTimeZone(arg0));
    }

    public java.lang.String getID() {
        return real.getID();
    }

    public static java.lang.String getIDForWindowsID(java.lang.String arg0, java.lang.String arg1) {
        return android.icu.util.TimeZone.getIDForWindowsID(arg0, arg1);
    }

    public int getOffset(long arg0) {
        return real.getOffset(arg0);
    }

    public void getOffset(long arg0, boolean arg1, int[] arg2) {
        real.getOffset(arg0, arg1, arg2);
    }

    public int getOffset(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return real.getOffset(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public int getRawOffset() {
        return real.getRawOffset();
    }

    public static java.lang.String getRegion(java.lang.String arg0) {
        return android.icu.util.TimeZone.getRegion(arg0);
    }

    public static java.lang.String getTZDataVersion() {
        return android.icu.util.TimeZone.getTZDataVersion();
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeZone getTimeZone(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(android.icu.util.TimeZone.getTimeZone(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.TimeZone getTimeZone(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(android.icu.util.TimeZone.getTimeZone(arg0, arg1));
    }

    public static java.lang.String getWindowsID(java.lang.String arg0) {
        return android.icu.util.TimeZone.getWindowsID(arg0);
    }

    public boolean hasSameRules(com.micklab.dcg.wrapper.android.icu.util.TimeZone arg0) {
        return real.hasSameRules(arg0 == null ? null : arg0.unwrap());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean inDaylightTime(java.util.Date arg0) {
        return real.inDaylightTime(arg0);
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public boolean observesDaylightTime() {
        return real.observesDaylightTime();
    }

    public void setID(java.lang.String arg0) {
        real.setID(arg0);
    }

    public void setRawOffset(int arg0) {
        real.setRawOffset(arg0);
    }

    public boolean useDaylightTime() {
        return real.useDaylightTime();
    }

    public static final int GENERIC_LOCATION = android.icu.util.TimeZone.GENERIC_LOCATION;
    public static final com.micklab.dcg.wrapper.android.icu.util.TimeZone GMT_ZONE = com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(android.icu.util.TimeZone.GMT_ZONE);
    public static final int LONG = android.icu.util.TimeZone.LONG;
    public static final int LONG_GENERIC = android.icu.util.TimeZone.LONG_GENERIC;
    public static final int LONG_GMT = android.icu.util.TimeZone.LONG_GMT;
    public static final int SHORT = android.icu.util.TimeZone.SHORT;
    public static final int SHORT_COMMONLY_USED = android.icu.util.TimeZone.SHORT_COMMONLY_USED;
    public static final int SHORT_GENERIC = android.icu.util.TimeZone.SHORT_GENERIC;
    public static final int SHORT_GMT = android.icu.util.TimeZone.SHORT_GMT;
    public static final int TIMEZONE_ICU = android.icu.util.TimeZone.TIMEZONE_ICU;
    public static final int TIMEZONE_JDK = android.icu.util.TimeZone.TIMEZONE_JDK;
    public static final com.micklab.dcg.wrapper.android.icu.util.TimeZone UNKNOWN_ZONE = com.micklab.dcg.wrapper.android.icu.util.TimeZone.wrap(android.icu.util.TimeZone.UNKNOWN_ZONE);
    public static final java.lang.String UNKNOWN_ZONE_ID = android.icu.util.TimeZone.UNKNOWN_ZONE_ID;

    public static final class SystemTimeZoneType {
        private final android.icu.util.TimeZone.SystemTimeZoneType real;

        public SystemTimeZoneType(android.icu.util.TimeZone.SystemTimeZoneType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType wrap(android.icu.util.TimeZone.SystemTimeZoneType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType(real);
        }

        public android.icu.util.TimeZone.SystemTimeZoneType unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType.wrap(android.icu.util.TimeZone.SystemTimeZoneType.valueOf(arg0));
        }

        public static android.icu.util.TimeZone.SystemTimeZoneType[] values() {
            return android.icu.util.TimeZone.SystemTimeZoneType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType ANY = com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType.wrap(android.icu.util.TimeZone.SystemTimeZoneType.ANY);
        public static final com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType CANONICAL = com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType.wrap(android.icu.util.TimeZone.SystemTimeZoneType.CANONICAL);
        public static final com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType CANONICAL_LOCATION = com.micklab.dcg.wrapper.android.icu.util.TimeZone.SystemTimeZoneType.wrap(android.icu.util.TimeZone.SystemTimeZoneType.CANONICAL_LOCATION);

    }
}
