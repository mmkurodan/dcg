// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class DateKeyListener {
    private final android.text.method.DateKeyListener real;

    public DateKeyListener(android.text.method.DateKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateKeyListener wrap(android.text.method.DateKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.DateKeyListener(real);
    }

    public android.text.method.DateKeyListener unwrap() {
        return real;
    }

    public DateKeyListener() {
        this(new android.text.method.DateKeyListener());
    }

    public DateKeyListener(java.util.Locale arg0) {
        this(new android.text.method.DateKeyListener(arg0));
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.DateKeyListener.wrap(android.text.method.DateKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.DateKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.DateKeyListener.wrap(android.text.method.DateKeyListener.getInstance(arg0));
    }

    public static final char[] CHARACTERS = android.text.method.DateKeyListener.CHARACTERS;

}
