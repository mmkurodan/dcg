// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class URLSpan {
    private final android.text.style.URLSpan real;

    public URLSpan(android.text.style.URLSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.URLSpan wrap(android.text.style.URLSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.URLSpan(real);
    }

    public android.text.style.URLSpan unwrap() {
        return real;
    }

    public URLSpan(java.lang.String arg0) {
        this(new android.text.style.URLSpan(arg0));
    }

    public URLSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.URLSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public java.lang.String getURL() {
        return real.getURL();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onClick(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
