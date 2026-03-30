// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Transliterator {
    private final android.icu.text.Transliterator real;

    public Transliterator(android.icu.text.Transliterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator wrap(android.icu.text.Transliterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Transliterator(real);
    }

    public android.icu.text.Transliterator unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator createFromRules(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(android.icu.text.Transliterator.createFromRules(arg0, arg1, arg2));
    }

    public void filteredTransliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1, boolean arg2) {
        real.filteredTransliterate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void finishTransliteration(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1) {
        real.finishTransliteration(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayName(java.lang.String arg0) {
        return android.icu.text.Transliterator.getDisplayName(arg0);
    }

    public static java.lang.String getDisplayName(java.lang.String arg0, java.util.Locale arg1) {
        return android.icu.text.Transliterator.getDisplayName(arg0, arg1);
    }

    public static java.lang.String getDisplayName(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.text.Transliterator.getDisplayName(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public android.icu.text.Transliterator[] getElements() {
        return real.getElements();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter getFilter() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter.wrap(real.getFilter());
    }

    public java.lang.String getID() {
        return real.getID();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(android.icu.text.Transliterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator getInstance(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(android.icu.text.Transliterator.getInstance(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.Transliterator getInverse() {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(real.getInverse());
    }

    public int getMaximumContextLength() {
        return real.getMaximumContextLength();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getSourceSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.getSourceSet());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getTargetSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.getTargetSet());
    }

    public void setFilter(com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter arg0) {
        real.setFilter(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toRules(boolean arg0) {
        return real.toRules(arg0);
    }

    public java.lang.String transliterate(java.lang.String arg0) {
        return real.transliterate(arg0);
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0) {
        real.transliterate(arg0 == null ? null : arg0.unwrap());
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1) {
        real.transliterate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int arg1, int arg2) {
        return real.transliterate(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1, int arg2) {
        real.transliterate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1, java.lang.String arg2) {
        real.transliterate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final int FORWARD = android.icu.text.Transliterator.FORWARD;
    public static final int REVERSE = android.icu.text.Transliterator.REVERSE;

    public static final class Position {
        private final android.icu.text.Transliterator.Position real;

        public Position(android.icu.text.Transliterator.Position real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position wrap(android.icu.text.Transliterator.Position real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position(real);
        }

        public android.icu.text.Transliterator.Position unwrap() {
            return real;
        }

        public Position() {
            this(new android.icu.text.Transliterator.Position());
        }

        public Position(com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg0) {
            this(new android.icu.text.Transliterator.Position(arg0 == null ? null : arg0.unwrap()));
        }

        public Position(int arg0, int arg1, int arg2) {
            this(new android.icu.text.Transliterator.Position(arg0, arg1, arg2));
        }

        public Position(int arg0, int arg1, int arg2, int arg3) {
            this(new android.icu.text.Transliterator.Position(arg0, arg1, arg2, arg3));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void set(com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg0) {
            real.set(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void validate(int arg0) {
            real.validate(arg0);
        }


    }
}
