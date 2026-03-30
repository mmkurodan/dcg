// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CaseMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CaseMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap wrap(android.icu.text.CaseMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.CaseMap getReal() {
        return (android.icu.text.CaseMap) real;
    }

    public android.icu.text.CaseMap unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold fold() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold.wrap(android.icu.text.CaseMap.fold());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CaseMap omitUnchangedText() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.wrap(((android.icu.text.CaseMap) real).omitUnchangedText());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower toLower() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower.wrap(android.icu.text.CaseMap.toLower());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title toTitle() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(android.icu.text.CaseMap.toTitle());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper toUpper() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper.wrap(android.icu.text.CaseMap.toUpper());
    }

    public static final class Fold {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Fold(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold wrap(android.icu.text.CaseMap.Fold real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.CaseMap.Fold getReal() {
            return (android.icu.text.CaseMap.Fold) real;
        }

        public android.icu.text.CaseMap.Fold unwrap() {
            return getReal();
        }

        public java.lang.String apply(java.lang.CharSequence arg0) {
            return ((android.icu.text.CaseMap.Fold) real).apply(arg0);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold.wrap(((android.icu.text.CaseMap.Fold) real).omitUnchangedText());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold turkic() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold.wrap(((android.icu.text.CaseMap.Fold) real).turkic());
        }

    }
    public static final class Lower {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Lower(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower wrap(android.icu.text.CaseMap.Lower real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.CaseMap.Lower getReal() {
            return (android.icu.text.CaseMap.Lower) real;
        }

        public android.icu.text.CaseMap.Lower unwrap() {
            return getReal();
        }

        public java.lang.String apply(java.util.Locale arg0, java.lang.CharSequence arg1) {
            return ((android.icu.text.CaseMap.Lower) real).apply(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower.wrap(((android.icu.text.CaseMap.Lower) real).omitUnchangedText());
        }

    }
    public static final class Title {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Title(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title wrap(android.icu.text.CaseMap.Title real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.CaseMap.Title getReal() {
            return (android.icu.text.CaseMap.Title) real;
        }

        public android.icu.text.CaseMap.Title unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title adjustToCased() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(((android.icu.text.CaseMap.Title) real).adjustToCased());
        }

        public java.lang.String apply(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.BreakIterator arg1, java.lang.CharSequence arg2) {
            return ((android.icu.text.CaseMap.Title) real).apply(arg0, arg1 == null ? null : arg1.getReal(), arg2);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title noBreakAdjustment() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(((android.icu.text.CaseMap.Title) real).noBreakAdjustment());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title noLowercase() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(((android.icu.text.CaseMap.Title) real).noLowercase());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(((android.icu.text.CaseMap.Title) real).omitUnchangedText());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title sentences() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(((android.icu.text.CaseMap.Title) real).sentences());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title wholeString() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(((android.icu.text.CaseMap.Title) real).wholeString());
        }

    }
    public static final class Upper {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Upper(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper wrap(android.icu.text.CaseMap.Upper real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.CaseMap.Upper getReal() {
            return (android.icu.text.CaseMap.Upper) real;
        }

        public android.icu.text.CaseMap.Upper unwrap() {
            return getReal();
        }

        public java.lang.String apply(java.util.Locale arg0, java.lang.CharSequence arg1) {
            return ((android.icu.text.CaseMap.Upper) real).apply(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper.wrap(((android.icu.text.CaseMap.Upper) real).omitUnchangedText());
        }

    }
}
