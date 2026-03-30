// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureLibrary {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureLibrary(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureLibrary wrap(android.gesture.GestureLibrary real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureLibrary(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.GestureLibrary getReal() {
        return (android.gesture.GestureLibrary) real;
    }

    public android.gesture.GestureLibrary unwrap() {
        return getReal();
    }

    public void addGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        ((android.gesture.GestureLibrary) real).addGesture(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int getOrientationStyle() {
        return ((android.gesture.GestureLibrary) real).getOrientationStyle();
    }

    public int getSequenceType() {
        return ((android.gesture.GestureLibrary) real).getSequenceType();
    }

    public boolean isReadOnly() {
        return ((android.gesture.GestureLibrary) real).isReadOnly();
    }

    public boolean load() {
        return ((android.gesture.GestureLibrary) real).load();
    }

    public void removeEntry(java.lang.String arg0) {
        ((android.gesture.GestureLibrary) real).removeEntry(arg0);
    }

    public void removeGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        ((android.gesture.GestureLibrary) real).removeGesture(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean save() {
        return ((android.gesture.GestureLibrary) real).save();
    }

    public void setOrientationStyle(int arg0) {
        ((android.gesture.GestureLibrary) real).setOrientationStyle(arg0);
    }

    public void setSequenceType(int arg0) {
        ((android.gesture.GestureLibrary) real).setSequenceType(arg0);
    }


}
