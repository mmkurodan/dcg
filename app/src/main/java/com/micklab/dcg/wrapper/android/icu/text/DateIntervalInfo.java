// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DateIntervalInfo {
    private final android.icu.text.DateIntervalInfo real;

    public DateIntervalInfo(android.icu.text.DateIntervalInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo wrap(android.icu.text.DateIntervalInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo(real);
    }

    public android.icu.text.DateIntervalInfo unwrap() {
        return real;
    }

    public DateIntervalInfo(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.DateIntervalInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public DateIntervalInfo(java.util.Locale arg0) {
        this(new android.icu.text.DateIntervalInfo(arg0));
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.wrap(real.cloneAsThawed());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.wrap(real.freeze());
    }

    public boolean getDefaultOrder() {
        return real.getDefaultOrder();
    }

    public java.lang.String getFallbackIntervalPattern() {
        return real.getFallbackIntervalPattern();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo getIntervalPattern(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo.wrap(real.getIntervalPattern(arg0, arg1));
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public void setFallbackIntervalPattern(java.lang.String arg0) {
        real.setFallbackIntervalPattern(arg0);
    }

    public void setIntervalPattern(java.lang.String arg0, int arg1, java.lang.String arg2) {
        real.setIntervalPattern(arg0, arg1, arg2);
    }

    public static final class PatternInfo {
        private final android.icu.text.DateIntervalInfo.PatternInfo real;

        public PatternInfo(android.icu.text.DateIntervalInfo.PatternInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo wrap(android.icu.text.DateIntervalInfo.PatternInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DateIntervalInfo.PatternInfo(real);
        }

        public android.icu.text.DateIntervalInfo.PatternInfo unwrap() {
            return real;
        }

        public PatternInfo(java.lang.String arg0, java.lang.String arg1, boolean arg2) {
            this(new android.icu.text.DateIntervalInfo.PatternInfo(arg0, arg1, arg2));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public boolean firstDateInPtnIsLaterDate() {
            return real.firstDateInPtnIsLaterDate();
        }

        public java.lang.String getFirstPart() {
            return real.getFirstPart();
        }

        public java.lang.String getSecondPart() {
            return real.getSecondPart();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
