// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SearchIterator {
    private final android.icu.text.SearchIterator real;

    public SearchIterator(android.icu.text.SearchIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SearchIterator wrap(android.icu.text.SearchIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SearchIterator(real);
    }

    public android.icu.text.SearchIterator unwrap() {
        return real;
    }

    public int first() {
        return real.first();
    }

    public int following(int arg0) {
        return real.following(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.BreakIterator getBreakIterator() {
        return com.micklab.dcg.wrapper.android.icu.text.BreakIterator.wrap(real.getBreakIterator());
    }

    public com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType getElementComparisonType() {
        return com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType.wrap(real.getElementComparisonType());
    }

    public int getIndex() {
        return real.getIndex();
    }

    public int getMatchLength() {
        return real.getMatchLength();
    }

    public int getMatchStart() {
        return real.getMatchStart();
    }

    public java.lang.String getMatchedText() {
        return real.getMatchedText();
    }

    public java.text.CharacterIterator getTarget() {
        return real.getTarget();
    }

    public boolean isOverlapping() {
        return real.isOverlapping();
    }

    public int last() {
        return real.last();
    }

    public int next() {
        return real.next();
    }

    public int preceding(int arg0) {
        return real.preceding(arg0);
    }

    public int previous() {
        return real.previous();
    }

    public void reset() {
        real.reset();
    }

    public void setBreakIterator(com.micklab.dcg.wrapper.android.icu.text.BreakIterator arg0) {
        real.setBreakIterator(arg0 == null ? null : arg0.unwrap());
    }

    public void setElementComparisonType(com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType arg0) {
        real.setElementComparisonType(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndex(int arg0) {
        real.setIndex(arg0);
    }

    public void setOverlapping(boolean arg0) {
        real.setOverlapping(arg0);
    }

    public void setTarget(java.text.CharacterIterator arg0) {
        real.setTarget(arg0);
    }

    public static final int DONE = android.icu.text.SearchIterator.DONE;

    public static final class ElementComparisonType {
        private final android.icu.text.SearchIterator.ElementComparisonType real;

        public ElementComparisonType(android.icu.text.SearchIterator.ElementComparisonType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType wrap(android.icu.text.SearchIterator.ElementComparisonType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SearchIterator.ElementComparisonType(real);
        }

        public android.icu.text.SearchIterator.ElementComparisonType unwrap() {
            return real;
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
