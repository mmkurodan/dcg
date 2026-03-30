// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class URLSpan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private URLSpan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.URLSpan wrap(android.text.style.URLSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.URLSpan(real, (__DcgwBridgeToken) null);
    }

    public android.text.style.URLSpan getReal() {
        return (android.text.style.URLSpan) real;
    }

    public android.text.style.URLSpan unwrap() {
        return getReal();
    }

    public URLSpan(java.lang.String arg0) {
        this(new android.text.style.URLSpan(arg0), (__DcgwBridgeToken) null);
    }

    public URLSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.URLSpan(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.text.style.URLSpan) real).describeContents();
    }

    public int getSpanTypeId() {
        return ((android.text.style.URLSpan) real).getSpanTypeId();
    }

    public java.lang.String getURL() {
        return ((android.text.style.URLSpan) real).getURL();
    }

    public void onClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.text.style.URLSpan) real).onClick(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.text.style.URLSpan) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.text.style.URLSpan) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
