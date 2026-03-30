// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class TimeKeyListener {
    private final android.text.method.TimeKeyListener real;

    public TimeKeyListener(android.text.method.TimeKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.TimeKeyListener wrap(android.text.method.TimeKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TimeKeyListener(real);
    }

    public android.text.method.TimeKeyListener unwrap() {
        return real;
    }

    public TimeKeyListener() {
        this(new android.text.method.TimeKeyListener());
    }

    public TimeKeyListener(java.util.Locale arg0) {
        this(new android.text.method.TimeKeyListener(arg0));
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.TimeKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.TimeKeyListener.wrap(android.text.method.TimeKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.TimeKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.TimeKeyListener.wrap(android.text.method.TimeKeyListener.getInstance(arg0));
    }

    public static final char[] CHARACTERS = android.text.method.TimeKeyListener.CHARACTERS;

}
