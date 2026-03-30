// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class EasyEditSpan {
    private final android.text.style.EasyEditSpan real;

    public EasyEditSpan(android.text.style.EasyEditSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.EasyEditSpan wrap(android.text.style.EasyEditSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.EasyEditSpan(real);
    }

    public android.text.style.EasyEditSpan unwrap() {
        return real;
    }

    public EasyEditSpan() {
        this(new android.text.style.EasyEditSpan());
    }

    public EasyEditSpan(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.text.style.EasyEditSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public EasyEditSpan(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        this(new android.text.style.EasyEditSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String EXTRA_TEXT_CHANGED_TYPE = android.text.style.EasyEditSpan.EXTRA_TEXT_CHANGED_TYPE;
    public static final int TEXT_DELETED = android.text.style.EasyEditSpan.TEXT_DELETED;
    public static final int TEXT_MODIFIED = android.text.style.EasyEditSpan.TEXT_MODIFIED;

}
