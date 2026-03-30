// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SearchIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SearchIterator wrap(android.icu.text.SearchIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SearchIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.SearchIterator getReal() {
        return (android.icu.text.SearchIterator) real;
    }

    public android.icu.text.SearchIterator unwrap() {
        return getReal();
    }

    public int first() {
        return ((android.icu.text.SearchIterator) real).first();
    }

    public int following(int arg0) {
        return ((android.icu.text.SearchIterator) real).following(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.BreakIterator getBreakIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(((android.icu.text.SearchIterator) real).getBreakIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType getElementComparisonType() {
        return com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType.wrap(((android.icu.text.SearchIterator) real).getElementComparisonType());
    }

    public int getIndex() {
        return ((android.icu.text.SearchIterator) real).getIndex();
    }

    public int getMatchLength() {
        return ((android.icu.text.SearchIterator) real).getMatchLength();
    }

    public int getMatchStart() {
        return ((android.icu.text.SearchIterator) real).getMatchStart();
    }

    public java.lang.String getMatchedText() {
        return ((android.icu.text.SearchIterator) real).getMatchedText();
    }

    public java.text.CharacterIterator getTarget() {
        return ((android.icu.text.SearchIterator) real).getTarget();
    }

    public boolean isOverlapping() {
        return ((android.icu.text.SearchIterator) real).isOverlapping();
    }

    public int last() {
        return ((android.icu.text.SearchIterator) real).last();
    }

    public int next() {
        return ((android.icu.text.SearchIterator) real).next();
    }

    public int preceding(int arg0) {
        return ((android.icu.text.SearchIterator) real).preceding(arg0);
    }

    public int previous() {
        return ((android.icu.text.SearchIterator) real).previous();
    }

    public void reset() {
        ((android.icu.text.SearchIterator) real).reset();
    }

    public void setBreakIterator(com.micklab.dcg.wrapper.android.icu.text.BreakIterator arg0) {
        ((android.icu.text.SearchIterator) real).setBreakIterator(arg0 == null ? null : arg0.getReal());
    }

    public void setElementComparisonType(com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType arg0) {
        ((android.icu.text.SearchIterator) real).setElementComparisonType(arg0 == null ? null : arg0.getReal());
    }

    public void setIndex(int arg0) {
        ((android.icu.text.SearchIterator) real).setIndex(arg0);
    }

    public void setOverlapping(boolean arg0) {
        ((android.icu.text.SearchIterator) real).setOverlapping(arg0);
    }

    public void setTarget(java.text.CharacterIterator arg0) {
        ((android.icu.text.SearchIterator) real).setTarget(arg0);
    }

    public static final int DONE = android.icu.text.SearchIterator.DONE;

    public static final class ElementComparisonType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ElementComparisonType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType wrap(android.icu.text.SearchIterator.ElementComparisonType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.SearchIterator.ElementComparisonType getReal() {
            return (android.icu.text.SearchIterator.ElementComparisonType) real;
        }

        public android.icu.text.SearchIterator.ElementComparisonType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType.wrap(android.icu.text.SearchIterator.ElementComparisonType.valueOf(arg0));
        }

        public static android.icu.text.SearchIterator.ElementComparisonType[] values() {
            return android.icu.text.SearchIterator.ElementComparisonType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType ANY_BASE_WEIGHT_IS_WILDCARD = com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType.wrap(android.icu.text.SearchIterator.ElementComparisonType.ANY_BASE_WEIGHT_IS_WILDCARD);
        public static final com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType PATTERN_BASE_WEIGHT_IS_WILDCARD = com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType.wrap(android.icu.text.SearchIterator.ElementComparisonType.PATTERN_BASE_WEIGHT_IS_WILDCARD);
        public static final com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType STANDARD_ELEMENT_COMPARISON = com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType.wrap(android.icu.text.SearchIterator.ElementComparisonType.STANDARD_ELEMENT_COMPARISON);

    }
}
