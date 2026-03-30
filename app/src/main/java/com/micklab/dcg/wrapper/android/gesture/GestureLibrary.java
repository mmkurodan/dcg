// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureLibrary {
    private final android.gesture.GestureLibrary real;

    public GestureLibrary(android.gesture.GestureLibrary real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary wrap(android.gesture.GestureLibrary real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureLibrary(real);
    }

    public android.gesture.GestureLibrary unwrap() {
        return real;
    }

    public void addGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        real.addGesture(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int getOrientationStyle() {
        return real.getOrientationStyle();
    }

    public int getSequenceType() {
        return real.getSequenceType();
    }

    public boolean isReadOnly() {
        return real.isReadOnly();
    }

    public boolean load() {
        return real.load();
    }

    public void removeEntry(java.lang.String arg0) {
        real.removeEntry(arg0);
    }

    public void removeGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        real.removeGesture(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean save() {
        return real.save();
    }

    public void setOrientationStyle(int arg0) {
        real.setOrientationStyle(arg0);
    }

    public void setSequenceType(int arg0) {
        real.setSequenceType(arg0);
    }


}
