// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class TextInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.TextInfo wrap(android.view.textservice.TextInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.TextInfo(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.TextInfo getReal() {
        return (android.view.textservice.TextInfo) real;
    }

    public android.view.textservice.TextInfo unwrap() {
        return getReal();
    }

    public TextInfo(java.lang.String arg0) {
        this(new android.view.textservice.TextInfo(arg0), (__DcgwBridgeToken) null);
    }

    public TextInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.textservice.TextInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TextInfo(java.lang.String arg0, int arg1, int arg2) {
        this(new android.view.textservice.TextInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public TextInfo(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.view.textservice.TextInfo(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.textservice.TextInfo) real).describeContents();
    }

    public java.lang.CharSequence getCharSequence() {
        return ((android.view.textservice.TextInfo) real).getCharSequence();
    }

    public int getCookie() {
        return ((android.view.textservice.TextInfo) real).getCookie();
    }

    public int getSequence() {
        return ((android.view.textservice.TextInfo) real).getSequence();
    }

    public java.lang.String getText() {
        return ((android.view.textservice.TextInfo) real).getText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textservice.TextInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
