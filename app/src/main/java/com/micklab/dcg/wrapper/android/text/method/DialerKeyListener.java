// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class DialerKeyListener {
    private final android.text.method.DialerKeyListener real;

    public DialerKeyListener(android.text.method.DialerKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.DialerKeyListener wrap(android.text.method.DialerKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.DialerKeyListener(real);
    }

    public android.text.method.DialerKeyListener unwrap() {
        return real;
    }

    public DialerKeyListener() {
        this(new android.text.method.DialerKeyListener());
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.DialerKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.DialerKeyListener.wrap(android.text.method.DialerKeyListener.getInstance());
    }

    public static final char[] CHARACTERS = android.text.method.DialerKeyListener.CHARACTERS;

}
