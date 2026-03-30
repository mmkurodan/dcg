// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.text.style;

public final class LineBreakConfigSpan {
    private final android.text.style.LineBreakConfigSpan real;

    public LineBreakConfigSpan(android.text.style.LineBreakConfigSpan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan wrap(android.text.style.LineBreakConfigSpan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan(real);
    }

    public android.text.style.LineBreakConfigSpan unwrap() {
        return real;
    }

    public LineBreakConfigSpan(com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig arg0) {
        this(new android.text.style.LineBreakConfigSpan(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan createNoBreakSpan() {
        return com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan.wrap(android.text.style.LineBreakConfigSpan.createNoBreakSpan());
    }

    public static com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan createNoHyphenationSpan() {
        return com.micklab.dcg.wrapper.android.text.style.LineBreakConfigSpan.wrap(android.text.style.LineBreakConfigSpan.createNoHyphenationSpan());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig getLineBreakConfig() {
        return com.micklab.dcg.wrapper.android.graphics.text.LineBreakConfig.wrap(real.getLineBreakConfig());
    }

    public int getSpanTypeId() {
        return real.getSpanTypeId();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
