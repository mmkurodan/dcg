// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class ColorStateList {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorStateList(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList wrap(android.content.res.ColorStateList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.ColorStateList(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.ColorStateList getReal() {
        return (android.content.res.ColorStateList) real;
    }

    public android.content.res.ColorStateList unwrap() {
        return getReal();
    }

    public ColorStateList(int[][] arg0, int[] arg1) {
        this(new android.content.res.ColorStateList(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(android.content.res.ColorStateList.createFromXml(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(android.content.res.ColorStateList.createFromXml(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public int describeContents() {
        return ((android.content.res.ColorStateList) real).describeContents();
    }

    public int getChangingConfigurations() {
        return ((android.content.res.ColorStateList) real).getChangingConfigurations();
    }

    public int getColorForState(int[] arg0, int arg1) {
        return ((android.content.res.ColorStateList) real).getColorForState(arg0, arg1);
    }

    public int getDefaultColor() {
        return ((android.content.res.ColorStateList) real).getDefaultColor();
    }

    public boolean isOpaque() {
        return ((android.content.res.ColorStateList) real).isOpaque();
    }

    public boolean isStateful() {
        return ((android.content.res.ColorStateList) real).isStateful();
    }

    public java.lang.String toString() {
        return ((android.content.res.ColorStateList) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.content.res.ColorStateList valueOf(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(android.content.res.ColorStateList.valueOf(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList withAlpha(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.content.res.ColorStateList) real).withAlpha(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList withLStar(float arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.content.res.ColorStateList) real).withLStar(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.res.ColorStateList) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
