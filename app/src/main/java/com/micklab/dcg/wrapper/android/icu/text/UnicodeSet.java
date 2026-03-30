// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeSet {
    private final android.icu.text.UnicodeSet real;

    public UnicodeSet(android.icu.text.UnicodeSet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet wrap(android.icu.text.UnicodeSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet(real);
    }

    public android.icu.text.UnicodeSet unwrap() {
        return real;
    }

    public UnicodeSet() {
        this(new android.icu.text.UnicodeSet());
    }

    public UnicodeSet(java.lang.String arg0) {
        this(new android.icu.text.UnicodeSet(arg0));
    }

    public UnicodeSet(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        this(new android.icu.text.UnicodeSet(arg0 == null ? null : arg0.unwrap()));
    }

    public UnicodeSet(int... arg0) {
        this(new android.icu.text.UnicodeSet(arg0));
    }

    public UnicodeSet(java.lang.String arg0, boolean arg1) {
        this(new android.icu.text.UnicodeSet(arg0, arg1));
    }

    public UnicodeSet(java.lang.String arg0, int arg1) {
        this(new android.icu.text.UnicodeSet(arg0, arg1));
    }

    public UnicodeSet(int arg0, int arg1) {
        this(new android.icu.text.UnicodeSet(arg0, arg1));
    }

    public UnicodeSet(java.lang.String arg0, java.text.ParsePosition arg1, com.micklab.dcg.wrapper.android.icu.text.SymbolTable arg2) {
        this(new android.icu.text.UnicodeSet(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public UnicodeSet(java.lang.String arg0, java.text.ParsePosition arg1, com.micklab.dcg.wrapper.android.icu.text.SymbolTable arg2, int arg3) {
        this(new android.icu.text.UnicodeSet(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public java.lang.StringBuffer _generatePattern(java.lang.StringBuffer arg0, boolean arg1) {
        return real._generatePattern(arg0, arg1);
    }

    public java.lang.StringBuffer _generatePattern(java.lang.StringBuffer arg0, boolean arg1, boolean arg2) {
        return real._generatePattern(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet add(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.add(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet add(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.add(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet add(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.add(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet addAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.addAll(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet addAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.addAll(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet addAll(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.addAll(arg0, arg1));
    }

    public void addMatchSetTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        real.addMatchSetTo(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyIntPropertyValue(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.applyIntPropertyValue(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPattern(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.applyPattern(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPattern(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.applyPattern(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPattern(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.applyPattern(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.applyPropertyAlias(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.text.SymbolTable arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.applyPropertyAlias(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int charAt(int arg0) {
        return real.charAt(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet clear() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.clear());
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.cloneAsThawed());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet closeOver(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.closeOver(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet compact() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.compact());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle arg1) {
        return real.compareTo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.complement());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.complement(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.complement(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.complement(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complementAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.complementAll(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complementAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.complementAll(arg0));
    }

    public boolean contains(java.lang.CharSequence arg0) {
        return real.contains(arg0);
    }

    public boolean contains(int arg0) {
        return real.contains(arg0);
    }

    public boolean contains(int arg0, int arg1) {
        return real.contains(arg0, arg1);
    }

    public boolean containsAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return real.containsAll(arg0 == null ? null : arg0.unwrap());
    }

    public boolean containsAll(java.lang.String arg0) {
        return real.containsAll(arg0);
    }

    public boolean containsNone(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return real.containsNone(arg0 == null ? null : arg0.unwrap());
    }

    public boolean containsNone(java.lang.CharSequence arg0) {
        return real.containsNone(arg0);
    }

    public boolean containsNone(int arg0, int arg1) {
        return real.containsNone(arg0, arg1);
    }

    public boolean containsSome(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return real.containsSome(arg0 == null ? null : arg0.unwrap());
    }

    public boolean containsSome(java.lang.CharSequence arg0) {
        return real.containsSome(arg0);
    }

    public boolean containsSome(int arg0, int arg1) {
        return real.containsSome(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.freeze());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet from(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(android.icu.text.UnicodeSet.from(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet fromAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(android.icu.text.UnicodeSet.fromAll(arg0));
    }

    public int getRangeCount() {
        return real.getRangeCount();
    }

    public int getRangeEnd(int arg0) {
        return real.getRangeEnd(arg0);
    }

    public int getRangeStart(int arg0) {
        return real.getRangeStart(arg0);
    }

    public boolean hasStrings() {
        return real.hasStrings();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int indexOf(int arg0) {
        return real.indexOf(arg0);
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public int matches(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int[] arg1, int arg2, boolean arg3) {
        return real.matches(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public boolean matchesIndexValue(int arg0) {
        return real.matchesIndexValue(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet remove(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.remove(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet remove(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.remove(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet remove(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.remove(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet removeAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.removeAll(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet removeAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.removeAll(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet removeAllStrings() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.removeAllStrings());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retain(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.retain(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retain(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.retain(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retain(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.retain(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retainAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.retainAll(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retainAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.retainAll(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet set(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.set(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet set(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.set(arg0, arg1));
    }

    public int size() {
        return real.size();
    }

    public int span(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg1) {
        return real.span(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int span(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return real.span(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public int spanBack(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg1) {
        return real.spanBack(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int spanBack(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return real.spanBack(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.String toPattern(boolean arg0) {
        return real.toPattern(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int ADD_CASE_MAPPINGS = android.icu.text.UnicodeSet.ADD_CASE_MAPPINGS;
    public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet ALL_CODE_POINTS = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(android.icu.text.UnicodeSet.ALL_CODE_POINTS);
    public static final int CASE = android.icu.text.UnicodeSet.CASE;
    public static final int CASE_INSENSITIVE = android.icu.text.UnicodeSet.CASE_INSENSITIVE;
    public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet EMPTY = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(android.icu.text.UnicodeSet.EMPTY);
    public static final int IGNORE_SPACE = android.icu.text.UnicodeSet.IGNORE_SPACE;
    public static final int MAX_VALUE = android.icu.text.UnicodeSet.MAX_VALUE;
    public static final int MIN_VALUE = android.icu.text.UnicodeSet.MIN_VALUE;

    public static final class ComparisonStyle {
        private final android.icu.text.UnicodeSet.ComparisonStyle real;

        public ComparisonStyle(android.icu.text.UnicodeSet.ComparisonStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle wrap(android.icu.text.UnicodeSet.ComparisonStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle(real);
        }

        public android.icu.text.UnicodeSet.ComparisonStyle unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle.wrap(android.icu.text.UnicodeSet.ComparisonStyle.valueOf(arg0));
        }

        public static android.icu.text.UnicodeSet.ComparisonStyle[] values() {
            return android.icu.text.UnicodeSet.ComparisonStyle.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle LEXICOGRAPHIC = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle.wrap(android.icu.text.UnicodeSet.ComparisonStyle.LEXICOGRAPHIC);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle LONGER_FIRST = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle.wrap(android.icu.text.UnicodeSet.ComparisonStyle.LONGER_FIRST);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle SHORTER_FIRST = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle.wrap(android.icu.text.UnicodeSet.ComparisonStyle.SHORTER_FIRST);

    }
    public static final class EntryRange {
        private final android.icu.text.UnicodeSet.EntryRange real;

        public EntryRange(android.icu.text.UnicodeSet.EntryRange real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.EntryRange wrap(android.icu.text.UnicodeSet.EntryRange real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.EntryRange(real);
        }

        public android.icu.text.UnicodeSet.EntryRange unwrap() {
            return real;
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
    public static final class SpanCondition {
        private final android.icu.text.UnicodeSet.SpanCondition real;

        public SpanCondition(android.icu.text.UnicodeSet.SpanCondition real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition wrap(android.icu.text.UnicodeSet.SpanCondition real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition(real);
        }

        public android.icu.text.UnicodeSet.SpanCondition unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition.wrap(android.icu.text.UnicodeSet.SpanCondition.valueOf(arg0));
        }

        public static android.icu.text.UnicodeSet.SpanCondition[] values() {
            return android.icu.text.UnicodeSet.SpanCondition.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition CONDITION_COUNT = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition.wrap(android.icu.text.UnicodeSet.SpanCondition.CONDITION_COUNT);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition CONTAINED = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition.wrap(android.icu.text.UnicodeSet.SpanCondition.CONTAINED);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition NOT_CONTAINED = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition.wrap(android.icu.text.UnicodeSet.SpanCondition.NOT_CONTAINED);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition SIMPLE = com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition.wrap(android.icu.text.UnicodeSet.SpanCondition.SIMPLE);

    }
}
