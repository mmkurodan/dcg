// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SymbolTable {
    private final android.icu.text.SymbolTable real;

    public SymbolTable(android.icu.text.SymbolTable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SymbolTable wrap(android.icu.text.SymbolTable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SymbolTable(real);
    }

    public android.icu.text.SymbolTable unwrap() {
        return real;
    }

    public char[] lookup(java.lang.String arg0) {
        return real.lookup(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeMatcher lookupMatcher(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeMatcher.wrap(real.lookupMatcher(arg0));
    }

    public java.lang.String parseReference(java.lang.String arg0, java.text.ParsePosition arg1, int arg2) {
        return real.parseReference(arg0, arg1, arg2);
    }

    public static final char SYMBOL_REF = android.icu.text.SymbolTable.SYMBOL_REF;

}
