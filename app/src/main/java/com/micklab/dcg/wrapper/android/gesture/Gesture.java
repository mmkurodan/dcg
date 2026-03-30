// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class Gesture {
    private final android.gesture.Gesture real;

    public Gesture(android.gesture.Gesture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.Gesture wrap(android.gesture.Gesture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.Gesture(real);
    }

    public android.gesture.Gesture unwrap() {
        return real;
    }

    public Gesture() {
        this(new android.gesture.Gesture());
    }

    public void addStroke(com.micklab.dcg.wrapper.android.gesture.GestureStroke arg0) {
        real.addStroke(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.graphics.RectF getBoundingBox() {
        return com.micklab.dcg.wrapper.android.graphics.RectF.wrap(real.getBoundingBox());
    }

    public long getID() {
        return real.getID();
    }

    public float getLength() {
        return real.getLength();
    }

    public int getStrokesCount() {
        return real.getStrokesCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap toBitmap(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.toBitmap(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap toBitmap(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.toBitmap(arg0, arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.toPath());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.toPath(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.toPath(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.toPath(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
