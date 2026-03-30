// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Patterns {
    private final android.util.Patterns real;

    public Patterns(android.util.Patterns real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Patterns wrap(android.util.Patterns real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Patterns(real);
    }

    public android.util.Patterns unwrap() {
        return real;
    }

    public static java.lang.String concatGroups(java.util.regex.Matcher arg0) {
        return android.util.Patterns.concatGroups(arg0);
    }

    public static java.lang.String digitsAndPlusOnly(java.util.regex.Matcher arg0) {
        return android.util.Patterns.digitsAndPlusOnly(arg0);
    }

    public static final java.util.regex.Pattern DOMAIN_NAME = android.util.Patterns.DOMAIN_NAME;
    public static final java.util.regex.Pattern EMAIL_ADDRESS = android.util.Patterns.EMAIL_ADDRESS;
    public static final java.lang.String GOOD_IRI_CHAR = android.util.Patterns.GOOD_IRI_CHAR;
    public static final java.util.regex.Pattern IP_ADDRESS = android.util.Patterns.IP_ADDRESS;
    public static final java.util.regex.Pattern PHONE = android.util.Patterns.PHONE;
    public static final java.util.regex.Pattern TOP_LEVEL_DOMAIN = android.util.Patterns.TOP_LEVEL_DOMAIN;
    public static final java.lang.String TOP_LEVEL_DOMAIN_STR = android.util.Patterns.TOP_LEVEL_DOMAIN_STR;
    public static final java.lang.String TOP_LEVEL_DOMAIN_STR_FOR_WEB_URL = android.util.Patterns.TOP_LEVEL_DOMAIN_STR_FOR_WEB_URL;
    public static final java.util.regex.Pattern WEB_URL = android.util.Patterns.WEB_URL;

}
