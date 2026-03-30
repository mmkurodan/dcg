// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnicodeSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet wrap(android.icu.text.UnicodeSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UnicodeSet getReal() {
        return (android.icu.text.UnicodeSet) real;
    }

    public android.icu.text.UnicodeSet unwrap() {
        return getReal();
    }

    public UnicodeSet() {
        this(new android.icu.text.UnicodeSet(), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(java.lang.String arg0) {
        this(new android.icu.text.UnicodeSet(arg0), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        this(new android.icu.text.UnicodeSet(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(int... arg0) {
        this(new android.icu.text.UnicodeSet(arg0), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(java.lang.String arg0, boolean arg1) {
        this(new android.icu.text.UnicodeSet(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(java.lang.String arg0, int arg1) {
        this(new android.icu.text.UnicodeSet(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(int arg0, int arg1) {
        this(new android.icu.text.UnicodeSet(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(java.lang.String arg0, java.text.ParsePosition arg1, com.micklab.dcg.wrapper.android.icu.text.SymbolTable arg2) {
        this(new android.icu.text.UnicodeSet(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public UnicodeSet(java.lang.String arg0, java.text.ParsePosition arg1, com.micklab.dcg.wrapper.android.icu.text.SymbolTable arg2, int arg3) {
        this(new android.icu.text.UnicodeSet(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.StringBuffer _generatePattern(java.lang.StringBuffer arg0, boolean arg1) {
        return ((android.icu.text.UnicodeSet) real)._generatePattern(arg0, arg1);
    }

    public java.lang.StringBuffer _generatePattern(java.lang.StringBuffer arg0, boolean arg1, boolean arg2) {
        return ((android.icu.text.UnicodeSet) real)._generatePattern(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet add(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).add(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet add(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).add(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet add(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).add(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet addAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).addAll(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet addAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).addAll(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet addAll(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).addAll(arg0, arg1));
    }

    public void addMatchSetTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        ((android.icu.text.UnicodeSet) real).addMatchSetTo(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyIntPropertyValue(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).applyIntPropertyValue(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPattern(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).applyPattern(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPattern(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).applyPattern(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPattern(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).applyPattern(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).applyPropertyAlias(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.icu.text.SymbolTable arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).applyPropertyAlias(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public int charAt(int arg0) {
        return ((android.icu.text.UnicodeSet) real).charAt(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet clear() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).clear());
    }

    public java.lang.Object clone() {
        return ((android.icu.text.UnicodeSet) real).clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).cloneAsThawed());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet closeOver(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).closeOver(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet compact() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).compact());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return ((android.icu.text.UnicodeSet) real).compareTo(arg0 == null ? null : arg0.getReal());
    }

    public int compareTo(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle arg1) {
        return ((android.icu.text.UnicodeSet) real).compareTo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).complement());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).complement(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).complement(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complement(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).complement(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complementAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).complementAll(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet complementAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).complementAll(arg0));
    }

    public boolean contains(java.lang.CharSequence arg0) {
        return ((android.icu.text.UnicodeSet) real).contains(arg0);
    }

    public boolean contains(int arg0) {
        return ((android.icu.text.UnicodeSet) real).contains(arg0);
    }

    public boolean contains(int arg0, int arg1) {
        return ((android.icu.text.UnicodeSet) real).contains(arg0, arg1);
    }

    public boolean containsAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return ((android.icu.text.UnicodeSet) real).containsAll(arg0 == null ? null : arg0.getReal());
    }

    public boolean containsAll(java.lang.String arg0) {
        return ((android.icu.text.UnicodeSet) real).containsAll(arg0);
    }

    public boolean containsNone(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return ((android.icu.text.UnicodeSet) real).containsNone(arg0 == null ? null : arg0.getReal());
    }

    public boolean containsNone(java.lang.CharSequence arg0) {
        return ((android.icu.text.UnicodeSet) real).containsNone(arg0);
    }

    public boolean containsNone(int arg0, int arg1) {
        return ((android.icu.text.UnicodeSet) real).containsNone(arg0, arg1);
    }

    public boolean containsSome(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return ((android.icu.text.UnicodeSet) real).containsSome(arg0 == null ? null : arg0.getReal());
    }

    public boolean containsSome(java.lang.CharSequence arg0) {
        return ((android.icu.text.UnicodeSet) real).containsSome(arg0);
    }

    public boolean containsSome(int arg0, int arg1) {
        return ((android.icu.text.UnicodeSet) real).containsSome(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.UnicodeSet) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).freeze());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet from(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(android.icu.text.UnicodeSet.from(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet fromAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(android.icu.text.UnicodeSet.fromAll(arg0));
    }

    public int getRangeCount() {
        return ((android.icu.text.UnicodeSet) real).getRangeCount();
    }

    public int getRangeEnd(int arg0) {
        return ((android.icu.text.UnicodeSet) real).getRangeEnd(arg0);
    }

    public int getRangeStart(int arg0) {
        return ((android.icu.text.UnicodeSet) real).getRangeStart(arg0);
    }

    public boolean hasStrings() {
        return ((android.icu.text.UnicodeSet) real).hasStrings();
    }

    public int hashCode() {
        return ((android.icu.text.UnicodeSet) real).hashCode();
    }

    public int indexOf(int arg0) {
        return ((android.icu.text.UnicodeSet) real).indexOf(arg0);
    }

    public boolean isEmpty() {
        return ((android.icu.text.UnicodeSet) real).isEmpty();
    }

    public boolean isFrozen() {
        return ((android.icu.text.UnicodeSet) real).isFrozen();
    }

    public int matches(com.micklab.dcg.wrapper.android.icu.text.Replaceable arg0, int[] arg1, int arg2, boolean arg3) {
        return ((android.icu.text.UnicodeSet) real).matches(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public boolean matchesIndexValue(int arg0) {
        return ((android.icu.text.UnicodeSet) real).matchesIndexValue(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet remove(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).remove(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet remove(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).remove(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet remove(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).remove(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet removeAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).removeAll(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet removeAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).removeAll(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet removeAllStrings() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).removeAllStrings());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retain(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).retain(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retain(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).retain(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retain(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).retain(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retainAll(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).retainAll(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet retainAll(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).retainAll(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet set(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).set(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet set(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSet) real).set(arg0, arg1));
    }

    public int size() {
        return ((android.icu.text.UnicodeSet) real).size();
    }

    public int span(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg1) {
        return ((android.icu.text.UnicodeSet) real).span(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int span(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return ((android.icu.text.UnicodeSet) real).span(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public int spanBack(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg1) {
        return ((android.icu.text.UnicodeSet) real).spanBack(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int spanBack(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return ((android.icu.text.UnicodeSet) real).spanBack(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.String toPattern(boolean arg0) {
        return ((android.icu.text.UnicodeSet) real).toPattern(arg0);
    }

    public java.lang.String toString() {
        return ((android.icu.text.UnicodeSet) real).toString();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ComparisonStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle wrap(android.icu.text.UnicodeSet.ComparisonStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.ComparisonStyle(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.UnicodeSet.ComparisonStyle getReal() {
            return (android.icu.text.UnicodeSet.ComparisonStyle) real;
        }

        public android.icu.text.UnicodeSet.ComparisonStyle unwrap() {
            return getReal();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EntryRange(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.EntryRange wrap(android.icu.text.UnicodeSet.EntryRange real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.EntryRange(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.UnicodeSet.EntryRange getReal() {
            return (android.icu.text.UnicodeSet.EntryRange) real;
        }

        public android.icu.text.UnicodeSet.EntryRange unwrap() {
            return getReal();
        }

        public java.lang.String toString() {
            return ((android.icu.text.UnicodeSet.EntryRange) real).toString();
        }


    }
    public static final class SpanCondition {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SpanCondition(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition wrap(android.icu.text.UnicodeSet.SpanCondition real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.UnicodeSet.SpanCondition getReal() {
            return (android.icu.text.UnicodeSet.SpanCondition) real;
        }

        public android.icu.text.UnicodeSet.SpanCondition unwrap() {
            return getReal();
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
