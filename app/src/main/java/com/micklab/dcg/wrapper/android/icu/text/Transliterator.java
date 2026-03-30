// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Transliterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Transliterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator wrap(android.icu.text.Transliterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Transliterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.Transliterator getReal() {
        return (android.icu.text.Transliterator) real;
    }

    public android.icu.text.Transliterator unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator createFromRules(java.lang.String arg0, java.lang.String arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(android.icu.text.Transliterator.createFromRules(arg0, arg1, arg2));
    }

    public void filteredTransliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1, boolean arg2) {
        ((android.icu.text.Transliterator) real).filteredTransliterate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void finishTransliteration(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1) {
        ((android.icu.text.Transliterator) real).finishTransliteration(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static java.lang.String getDisplayName(java.lang.String arg0) {
        return android.icu.text.Transliterator.getDisplayName(arg0);
    }

    public static java.lang.String getDisplayName(java.lang.String arg0, java.util.Locale arg1) {
        return android.icu.text.Transliterator.getDisplayName(arg0, arg1);
    }

    public static java.lang.String getDisplayName(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.text.Transliterator.getDisplayName(arg0, arg1 == null ? null : arg1.getReal());
    }

    public android.icu.text.Transliterator[] getElements() {
        return ((android.icu.text.Transliterator) real).getElements();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter getFilter() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter.wrap(((android.icu.text.Transliterator) real).getFilter());
    }

    public java.lang.String getID() {
        return ((android.icu.text.Transliterator) real).getID();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(android.icu.text.Transliterator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Transliterator getInstance(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(android.icu.text.Transliterator.getInstance(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.Transliterator getInverse() {
        return com.micklab.dcg.wrapper.android.icu.text.Transliterator.wrap(((android.icu.text.Transliterator) real).getInverse());
    }

    public int getMaximumContextLength() {
        return ((android.icu.text.Transliterator) real).getMaximumContextLength();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getSourceSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.Transliterator) real).getSourceSet());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getTargetSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.Transliterator) real).getTargetSet());
    }

    public void setFilter(com.micklab.dcg.wrapper.android.icu.text.UnicodeFilter arg0) {
        ((android.icu.text.Transliterator) real).setFilter(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toRules(boolean arg0) {
        return ((android.icu.text.Transliterator) real).toRules(arg0);
    }

    public java.lang.String transliterate(java.lang.String arg0) {
        return ((android.icu.text.Transliterator) real).transliterate(arg0);
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0) {
        ((android.icu.text.Transliterator) real).transliterate(arg0 == null ? null : arg0.getReal());
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1) {
        ((android.icu.text.Transliterator) real).transliterate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int arg1, int arg2) {
        return ((android.icu.text.Transliterator) real).transliterate(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1, int arg2) {
        ((android.icu.text.Transliterator) real).transliterate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void transliterate(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg1, java.lang.String arg2) {
        ((android.icu.text.Transliterator) real).transliterate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final int FORWARD = android.icu.text.Transliterator.FORWARD;
    public static final int REVERSE = android.icu.text.Transliterator.REVERSE;

    public static final class Position {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Position(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position wrap(android.icu.text.Transliterator.Position real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.Transliterator.Position getReal() {
            return (android.icu.text.Transliterator.Position) real;
        }

        public android.icu.text.Transliterator.Position unwrap() {
            return getReal();
        }

        public Position() {
            this(new android.icu.text.Transliterator.Position(), (__DcgwBridgeToken) null);
        }

        public Position(com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg0) {
            this(new android.icu.text.Transliterator.Position(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Position(int arg0, int arg1, int arg2) {
            this(new android.icu.text.Transliterator.Position(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public Position(int arg0, int arg1, int arg2, int arg3) {
            this(new android.icu.text.Transliterator.Position(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.icu.text.Transliterator.Position) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.icu.text.Transliterator.Position) real).hashCode();
        }

        public void set(com.micklab.dcg.wrapper.android.icu.text.Transliterator.Position arg0) {
            ((android.icu.text.Transliterator.Position) real).set(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.String toString() {
            return ((android.icu.text.Transliterator.Position) real).toString();
        }

        public void validate(int arg0) {
            ((android.icu.text.Transliterator.Position) real).validate(arg0);
        }


    }
}
