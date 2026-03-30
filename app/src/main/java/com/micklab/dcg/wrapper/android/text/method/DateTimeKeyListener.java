// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class DateTimeKeyListener {
    private final android.text.method.DateTimeKeyListener real;

    public DateTimeKeyListener(android.text.method.DateTimeKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener wrap(android.text.method.DateTimeKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener(real);
    }

    public android.text.method.DateTimeKeyListener unwrap() {
        return real;
    }

    public DateTimeKeyListener() {
        this(new android.text.method.DateTimeKeyListener());
    }

    public DateTimeKeyListener(java.util.Locale arg0) {
        this(new android.text.method.DateTimeKeyListener(arg0));
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener.wrap(android.text.method.DateTimeKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.DateTimeKeyListener.wrap(android.text.method.DateTimeKeyListener.getInstance(arg0));
    }

    public static final char[] CHARACTERS = android.text.method.DateTimeKeyListener.CHARACTERS;

}
