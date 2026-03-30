// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class TimeKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.TimeKeyListener wrap(android.text.method.TimeKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.TimeKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.TimeKeyListener getReal() {
        return (android.text.method.TimeKeyListener) real;
    }

    public android.text.method.TimeKeyListener unwrap() {
        return getReal();
    }

    public TimeKeyListener() {
        this(new android.text.method.TimeKeyListener(), (__DcgwBridgeToken) null);
    }

    public TimeKeyListener(java.util.Locale arg0) {
        this(new android.text.method.TimeKeyListener(arg0), (__DcgwBridgeToken) null);
    }

    public int getInputType() {
        return ((android.text.method.TimeKeyListener) real).getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.TimeKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.TimeKeyListener.wrap(android.text.method.TimeKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.TimeKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.TimeKeyListener.wrap(android.text.method.TimeKeyListener.getInstance(arg0));
    }

    public static final char[] CHARACTERS = android.text.method.TimeKeyListener.CHARACTERS;

}
