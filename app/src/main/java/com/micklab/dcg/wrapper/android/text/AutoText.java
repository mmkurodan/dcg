// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text;

public final class AutoText {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutoText(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.AutoText wrap(android.text.AutoText real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.AutoText(real, (__DcgwBridgeToken) null);
    }

    public android.text.AutoText getReal() {
        return (android.text.AutoText) real;
    }

    public android.text.AutoText unwrap() {
        return getReal();
    }

    public static java.lang.String get(java.lang.CharSequence arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.view.View arg3) {
        return android.text.AutoText.get(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public static int getSize(com.micklab.dcg.wrapper.android.view.View arg0) {
        return android.text.AutoText.getSize(arg0 == null ? null : arg0.getReal());
    }

}
