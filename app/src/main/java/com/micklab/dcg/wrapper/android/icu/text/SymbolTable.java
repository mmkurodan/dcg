// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SymbolTable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SymbolTable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SymbolTable wrap(android.icu.text.SymbolTable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SymbolTable(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.SymbolTable getReal() {
        return (android.icu.text.SymbolTable) real;
    }

    public android.icu.text.SymbolTable unwrap() {
        return getReal();
    }

    public char[] lookup(java.lang.String arg0) {
        return ((android.icu.text.SymbolTable) real).lookup(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeMatcher lookupMatcher(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeMatcher.wrap(((android.icu.text.SymbolTable) real).lookupMatcher(arg0));
    }

    public java.lang.String parseReference(java.lang.String arg0, java.text.ParsePosition arg1, int arg2) {
        return ((android.icu.text.SymbolTable) real).parseReference(arg0, arg1, arg2);
    }

    public static final char SYMBOL_REF = android.icu.text.SymbolTable.SYMBOL_REF;

}
