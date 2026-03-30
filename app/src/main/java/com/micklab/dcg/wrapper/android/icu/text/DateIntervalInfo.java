// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateIntervalInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateIntervalInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo wrap(android.icu.text.DateIntervalInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DateIntervalInfo getReal() {
        return (android.icu.text.DateIntervalInfo) real;
    }

    public android.icu.text.DateIntervalInfo unwrap() {
        return getReal();
    }

    public DateIntervalInfo(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.DateIntervalInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public DateIntervalInfo(java.util.Locale arg0) {
        this(new android.icu.text.DateIntervalInfo(arg0), (__DcgwBridgeToken) null);
    }

    public java.lang.Object clone() {
        return ((android.icu.text.DateIntervalInfo) real).clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.wrap(((android.icu.text.DateIntervalInfo) real).cloneAsThawed());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.DateIntervalInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.wrap(((android.icu.text.DateIntervalInfo) real).freeze());
    }

    public boolean getDefaultOrder() {
        return ((android.icu.text.DateIntervalInfo) real).getDefaultOrder();
    }

    public java.lang.String getFallbackIntervalPattern() {
        return ((android.icu.text.DateIntervalInfo) real).getFallbackIntervalPattern();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo getIntervalPattern(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo.wrap(((android.icu.text.DateIntervalInfo) real).getIntervalPattern(arg0, arg1));
    }

    public int hashCode() {
        return ((android.icu.text.DateIntervalInfo) real).hashCode();
    }

    public boolean isFrozen() {
        return ((android.icu.text.DateIntervalInfo) real).isFrozen();
    }

    public void setFallbackIntervalPattern(java.lang.String arg0) {
        ((android.icu.text.DateIntervalInfo) real).setFallbackIntervalPattern(arg0);
    }

    public void setIntervalPattern(java.lang.String arg0, int arg1, java.lang.String arg2) {
        ((android.icu.text.DateIntervalInfo) real).setIntervalPattern(arg0, arg1, arg2);
    }

    public static final class PatternInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PatternInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo wrap(android.icu.text.DateIntervalInfo.PatternInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.DateIntervalInfo.PatternInfo getReal() {
            return (android.icu.text.DateIntervalInfo.PatternInfo) real;
        }

        public android.icu.text.DateIntervalInfo.PatternInfo unwrap() {
            return getReal();
        }

        public PatternInfo(java.lang.String arg0, java.lang.String arg1, boolean arg2) {
            this(new android.icu.text.DateIntervalInfo.PatternInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.icu.text.DateIntervalInfo.PatternInfo) real).equals(arg0);
        }

        public boolean firstDateInPtnIsLaterDate() {
            return ((android.icu.text.DateIntervalInfo.PatternInfo) real).firstDateInPtnIsLaterDate();
        }

        public java.lang.String getFirstPart() {
            return ((android.icu.text.DateIntervalInfo.PatternInfo) real).getFirstPart();
        }

        public java.lang.String getSecondPart() {
            return ((android.icu.text.DateIntervalInfo.PatternInfo) real).getSecondPart();
        }

        public int hashCode() {
            return ((android.icu.text.DateIntervalInfo.PatternInfo) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.icu.text.DateIntervalInfo.PatternInfo) real).toString();
        }

    }
}
