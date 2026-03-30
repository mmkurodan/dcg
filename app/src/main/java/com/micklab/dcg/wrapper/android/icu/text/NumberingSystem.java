// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class NumberingSystem {
    private final android.icu.text.NumberingSystem real;

    public NumberingSystem(android.icu.text.NumberingSystem real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem wrap(android.icu.text.NumberingSystem real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.NumberingSystem(real);
    }

    public android.icu.text.NumberingSystem unwrap() {
        return real;
    }

    public NumberingSystem() {
        this(new android.icu.text.NumberingSystem());
    }

    public static java.lang.String[] getAvailableNames() {
        return android.icu.text.NumberingSystem.getAvailableNames();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstance(int arg0, boolean arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstance(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberingSystem getInstanceByName(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.getInstanceByName(arg0));
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getRadix() {
        return real.getRadix();
    }

    public boolean isAlgorithmic() {
        return real.isAlgorithmic();
    }

    public static boolean isValidDigitString(java.lang.String arg0) {
        return android.icu.text.NumberingSystem.isValidDigitString(arg0);
    }

    public static final com.micklab.dcg.wrapper.android.icu.text.NumberingSystem LATIN = com.micklab.dcg.wrapper.android.icu.text.NumberingSystem.wrap(android.icu.text.NumberingSystem.LATIN);

}
