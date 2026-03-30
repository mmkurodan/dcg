// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class DateTimeKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateTimeKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener wrap(android.text.method.DateTimeKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.DateTimeKeyListener getReal() {
        return (android.text.method.DateTimeKeyListener) real;
    }

    public android.text.method.DateTimeKeyListener unwrap() {
        return getReal();
    }

    public DateTimeKeyListener() {
        this(new android.text.method.DateTimeKeyListener(), (__DcgwBridgeToken) null);
    }

    public DateTimeKeyListener(java.util.Locale arg0) {
        this(new android.text.method.DateTimeKeyListener(arg0), (__DcgwBridgeToken) null);
    }

    public int getInputType() {
        return ((android.text.method.DateTimeKeyListener) real).getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener.wrap(android.text.method.DateTimeKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener.wrap(android.text.method.DateTimeKeyListener.getInstance(arg0));
    }

    public static final char[] CHARACTERS = android.text.method.DateTimeKeyListener.CHARACTERS;

}
