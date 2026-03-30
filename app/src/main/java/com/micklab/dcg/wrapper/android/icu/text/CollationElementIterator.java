// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CollationElementIterator {
    private final android.icu.text.CollationElementIterator real;

    public CollationElementIterator(android.icu.text.CollationElementIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator wrap(android.icu.text.CollationElementIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CollationElementIterator(real);
    }

    public android.icu.text.CollationElementIterator unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getMaxExpansion(int arg0) {
        return real.getMaxExpansion(arg0);
    }

    public int getOffset() {
        return real.getOffset();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int next() {
        return real.next();
    }

    public int previous() {
        return real.previous();
    }

    public static int primaryOrder(int arg0) {
        return android.icu.text.CollationElementIterator.primaryOrder(arg0);
    }

    public void reset() {
        real.reset();
    }

    public static int secondaryOrder(int arg0) {
        return android.icu.text.CollationElementIterator.secondaryOrder(arg0);
    }

    public void setOffset(int arg0) {
        real.setOffset(arg0);
    }

    public void setText(com.micklab.dcg.wrapper.android.icu.text.UCharacterIterator arg0) {
        real.setText(arg0 == null ? null : arg0.unwrap());
    }

    public void setText(java.lang.String arg0) {
        real.setText(arg0);
    }

    public void setText(java.text.CharacterIterator arg0) {
        real.setText(arg0);
    }

    public static int tertiaryOrder(int arg0) {
        return android.icu.text.CollationElementIterator.tertiaryOrder(arg0);
    }

    public static final int IGNORABLE = android.icu.text.CollationElementIterator.IGNORABLE;
    public static final int NULLORDER = android.icu.text.CollationElementIterator.NULLORDER;

}
