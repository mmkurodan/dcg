// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class NumberingSystem {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NumberingSystem(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem wrap(android.icu.text.NumberingSystem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.NumberingSystem(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.NumberingSystem getReal() {
        return (android.icu.text.NumberingSystem) real;
    }

    public android.icu.text.NumberingSystem unwrap() {
        return getReal();
    }

    public NumberingSystem() {
        this(new android.icu.text.NumberingSystem(), (__DcgwBridgeToken) null);
    }

    public static java.lang.String[] getAvailableNames() {
        return android.icu.text.NumberingSystem.getAvailableNames();
    }

    public java.lang.String getDescription() {
        return ((android.icu.text.NumberingSystem) real).getDescription();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance(int arg0, boolean arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstanceByName(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstanceByName(arg0));
    }

    public java.lang.String getName() {
        return ((android.icu.text.NumberingSystem) real).getName();
    }

    public int getRadix() {
        return ((android.icu.text.NumberingSystem) real).getRadix();
    }

    public boolean isAlgorithmic() {
        return ((android.icu.text.NumberingSystem) real).isAlgorithmic();
    }

    public static boolean isValidDigitString(java.lang.String arg0) {
        return android.icu.text.NumberingSystem.isValidDigitString(arg0);
    }

    public static final com.micklab.dcg.wrapper.android.icu.text.NumberingSystem LATIN = com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.LATIN);

}
