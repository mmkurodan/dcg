// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class Gesture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Gesture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.Gesture wrap(android.gesture.Gesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.Gesture(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.Gesture getReal() {
        return (android.gesture.Gesture) real;
    }

    public android.gesture.Gesture unwrap() {
        return getReal();
    }

    public Gesture() {
        this(new android.gesture.Gesture(), (__DcgwBridgeToken) null);
    }

    public void addStroke(com.micklab.dcg.wrapper.android.gesture.GestureStroke arg0) {
        ((android.gesture.Gesture) real).addStroke(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.Object clone() {
        return ((android.gesture.Gesture) real).clone();
    }

    public int describeContents() {
        return ((android.gesture.Gesture) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(((android.gesture.Gesture) real).getBoundingBox());
    }

    public long getID() {
        return ((android.gesture.Gesture) real).getID();
    }

    public float getLength() {
        return ((android.gesture.Gesture) real).getLength();
    }

    public int getStrokesCount() {
        return ((android.gesture.Gesture) real).getStrokesCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap toBitmap(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.gesture.Gesture) real).toBitmap(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap toBitmap(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.gesture.Gesture) real).toBitmap(arg0, arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.Gesture) real).toPath());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.Gesture) real).toPath(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.Gesture) real).toPath(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.Gesture) real).toPath(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.gesture.Gesture) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
