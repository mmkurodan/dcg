// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class TextInfo {
    private final android.view.textservice.TextInfo real;

    public TextInfo(android.view.textservice.TextInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.TextInfo wrap(android.view.textservice.TextInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.TextInfo(real);
    }

    public android.view.textservice.TextInfo unwrap() {
        return real;
    }

    public TextInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.view.textservice.TextInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public TextInfo(java.lang.String arg0) {
        this(new android.view.textservice.TextInfo(arg0));
    }

    public TextInfo(java.lang.String arg0, int arg1, int arg2) {
        this(new android.view.textservice.TextInfo(arg0, arg1, arg2));
    }

    public TextInfo(java.lang.CharSequence arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.view.textservice.TextInfo(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.CharSequence getCharSequence() {
        return real.getCharSequence();
    }

    public int getCookie() {
        return real.getCookie();
    }

    public int getSequence() {
        return real.getSequence();
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
