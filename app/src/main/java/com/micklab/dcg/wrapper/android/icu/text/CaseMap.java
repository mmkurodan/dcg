// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CaseMap {
    private final android.icu.text.CaseMap real;

    public CaseMap(android.icu.text.CaseMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap wrap(android.icu.text.CaseMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap(real);
    }

    public android.icu.text.CaseMap unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold fold() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold.wrap(android.icu.text.CaseMap.fold());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CaseMap omitUnchangedText() {
        return com.micklab.dcg.wrapper.android.icu.text.CaseMap.wrap(real.omitUnchangedText());
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
        private final android.icu.text.CaseMap.Fold real;

        public Fold(android.icu.text.CaseMap.Fold real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold wrap(android.icu.text.CaseMap.Fold real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold(real);
        }

        public android.icu.text.CaseMap.Fold unwrap() {
            return real;
        }

        public java.lang.String apply(java.lang.CharSequence arg0) {
            return real.apply(arg0);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold.wrap(real.omitUnchangedText());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold turkic() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Fold.wrap(real.turkic());
        }

    }
    public static final class Lower {
        private final android.icu.text.CaseMap.Lower real;

        public Lower(android.icu.text.CaseMap.Lower real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower wrap(android.icu.text.CaseMap.Lower real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower(real);
        }

        public android.icu.text.CaseMap.Lower unwrap() {
            return real;
        }

        public java.lang.String apply(java.util.Locale arg0, java.lang.CharSequence arg1) {
            return real.apply(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Lower.wrap(real.omitUnchangedText());
        }

    }
    public static final class Title {
        private final android.icu.text.CaseMap.Title real;

        public Title(android.icu.text.CaseMap.Title real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title wrap(android.icu.text.CaseMap.Title real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title(real);
        }

        public android.icu.text.CaseMap.Title unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title adjustToCased() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(real.adjustToCased());
        }

        public java.lang.String apply(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.BreakIterator arg1, java.lang.CharSequence arg2) {
            return real.apply(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title noBreakAdjustment() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(real.noBreakAdjustment());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title noLowercase() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(real.noLowercase());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(real.omitUnchangedText());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title sentences() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(real.sentences());
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title wholeString() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Title.wrap(real.wholeString());
        }

    }
    public static final class Upper {
        private final android.icu.text.CaseMap.Upper real;

        public Upper(android.icu.text.CaseMap.Upper real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper wrap(android.icu.text.CaseMap.Upper real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper(real);
        }

        public android.icu.text.CaseMap.Upper unwrap() {
            return real;
        }

        public java.lang.String apply(java.util.Locale arg0, java.lang.CharSequence arg1) {
            return real.apply(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper omitUnchangedText() {
            return com.micklab.dcg.wrapper.android.icu.text.CaseMap.Upper.wrap(real.omitUnchangedText());
        }

    }
}
