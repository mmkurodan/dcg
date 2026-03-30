// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.method;

public final class DigitsKeyListener {
    private final android.text.method.DigitsKeyListener real;

    public DigitsKeyListener(android.text.method.DigitsKeyListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener wrap(android.text.method.DigitsKeyListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener(real);
    }

    public android.text.method.DigitsKeyListener unwrap() {
        return real;
    }

    public DigitsKeyListener() {
        this(new android.text.method.DigitsKeyListener());
    }

    public DigitsKeyListener(java.util.Locale arg0) {
        this(new android.text.method.DigitsKeyListener(arg0));
    }

    public DigitsKeyListener(boolean arg0, boolean arg1) {
        this(new android.text.method.DigitsKeyListener(arg0, arg1));
    }

    public DigitsKeyListener(java.util.Locale arg0, boolean arg1, boolean arg2) {
        this(new android.text.method.DigitsKeyListener(arg0, arg1, arg2));
    }

    public java.lang.CharSequence filter(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.text.Spanned arg3, int arg4, int arg5) {
        return real.filter(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

    public int getInputType() {
        return real.getInputType();
    }

    public static com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener getInstance() {
        return com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener.wrap(android.text.method.DigitsKeyListener.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener.wrap(android.text.method.DigitsKeyListener.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener.wrap(android.text.method.DigitsKeyListener.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener getInstance(boolean arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener.wrap(android.text.method.DigitsKeyListener.getInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener getInstance(java.util.Locale arg0, boolean arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.text.method.DigitsKeyListener.wrap(android.text.method.DigitsKeyListener.getInstance(arg0, arg1, arg2));
    }

}
