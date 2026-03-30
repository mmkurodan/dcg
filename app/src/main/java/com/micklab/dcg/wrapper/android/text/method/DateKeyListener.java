// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class DateKeyListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DateKeyListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateKeyListener wrap(android.text.method.DateKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.DateKeyListener(real, (__DcgwBridgeToken) null);
    }

    public android.text.method.DateKeyListener getReal() {
        return (android.text.method.DateKeyListener) real;
    }

    public android.text.method.DateKeyListener unwrap() {
        return getReal();
    }

    public DateKeyListener() {
        this(new android.text.method.DateKeyListener(), (__DcgwBridgeToken) null);
    }

    public DateKeyListener(java.util.Locale arg0) {
        this(new android.text.method.DateKeyListener(arg0), (__DcgwBridgeToken) null);
    }

    public int getInputType() {
        return ((android.text.method.DateKeyListener) real).getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.DateKeyListener.wrap(android.text.method.DateKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.DateKeyListener.wrap(android.text.method.DateKeyListener.getInstance(arg0));
    }

    public static final char[] CHARACTERS = android.text.method.DateKeyListener.CHARACTERS;

}
