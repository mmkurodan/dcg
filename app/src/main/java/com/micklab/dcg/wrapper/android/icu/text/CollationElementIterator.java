// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CollationElementIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CollationElementIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator wrap(android.icu.text.CollationElementIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.CollationElementIterator getReal() {
        return (android.icu.text.CollationElementIterator) real;
    }

    public android.icu.text.CollationElementIterator unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.CollationElementIterator) real).equals(arg0);
    }

    public int getMaxExpansion(int arg0) {
        return ((android.icu.text.CollationElementIterator) real).getMaxExpansion(arg0);
    }

    public int getOffset() {
        return ((android.icu.text.CollationElementIterator) real).getOffset();
    }

    public int hashCode() {
        return ((android.icu.text.CollationElementIterator) real).hashCode();
    }

    public int next() {
        return ((android.icu.text.CollationElementIterator) real).next();
    }

    public int previous() {
        return ((android.icu.text.CollationElementIterator) real).previous();
    }

    public static int primaryOrder(int arg0) {
        return android.icu.text.CollationElementIterator.primaryOrder(arg0);
    }

    public void reset() {
        ((android.icu.text.CollationElementIterator) real).reset();
    }

    public static int secondaryOrder(int arg0) {
        return android.icu.text.CollationElementIterator.secondaryOrder(arg0);
    }

    public void setOffset(int arg0) {
        ((android.icu.text.CollationElementIterator) real).setOffset(arg0);
    }

    public void setText(java.lang.String arg0) {
        ((android.icu.text.CollationElementIterator) real).setText(arg0);
    }

    public void setText(com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator arg0) {
        ((android.icu.text.CollationElementIterator) real).setText(arg0 == null ? null : arg0.getReal());
    }

    public void setText(java.text.CharacterIterator arg0) {
        ((android.icu.text.CollationElementIterator) real).setText(arg0);
    }

    public static int tertiaryOrder(int arg0) {
        return android.icu.text.CollationElementIterator.tertiaryOrder(arg0);
    }

    public static final int IGNORABLE = android.icu.text.CollationElementIterator.IGNORABLE;
    public static final int NULLORDER = android.icu.text.CollationElementIterator.NULLORDER;

}
