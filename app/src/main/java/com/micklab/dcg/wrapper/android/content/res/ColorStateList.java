// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class ColorStateList {
    private final android.content.res.ColorStateList real;

    public ColorStateList(android.content.res.ColorStateList real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList wrap(android.content.res.ColorStateList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.ColorStateList(real);
    }

    public android.content.res.ColorStateList unwrap() {
        return real;
    }

    public ColorStateList(int[][] arg0, int[] arg1) {
        this(new android.content.res.ColorStateList(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(android.content.res.ColorStateList.createFromXml(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, android.content.res.Resources.Theme arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(android.content.res.ColorStateList.createFromXml(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public int getColorForState(int[] arg0, int arg1) {
        return real.getColorForState(arg0, arg1);
    }

    public int getDefaultColor() {
        return real.getDefaultColor();
    }

    public boolean isOpaque() {
        return real.isOpaque();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList valueOf(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(android.content.res.ColorStateList.valueOf(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList withAlpha(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.withAlpha(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList withLStar(float arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.withLStar(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
