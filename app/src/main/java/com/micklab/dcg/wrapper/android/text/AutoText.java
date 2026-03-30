// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class AutoText {
    private final android.text.AutoText real;

    public AutoText(android.text.AutoText real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.AutoText wrap(android.text.AutoText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.AutoText(real);
    }

    public android.text.AutoText unwrap() {
        return real;
    }

    public static java.lang.String get(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.view.View arg3) {
        return android.text.AutoText.get(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public static int getSize(com.micklab.dcg.wrapper.android.view.View arg0) {
        return android.text.AutoText.getSize(arg0 == null ? null : arg0.unwrap());
    }

}
