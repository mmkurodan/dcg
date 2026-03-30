// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureStore {
    private final android.gesture.GestureStore real;

    public GestureStore(android.gesture.GestureStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureStore wrap(android.gesture.GestureStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureStore(real);
    }

    public android.gesture.GestureStore unwrap() {
        return real;
    }

    public GestureStore() {
        this(new android.gesture.GestureStore());
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

    public boolean hasChanged() {
        return real.hasChanged();
    }

    public void load(java.io.InputStream arg0) throws java.io.IOException {
        real.load(arg0);
    }

    public void load(java.io.InputStream arg0, boolean arg1) throws java.io.IOException {
        real.load(arg0, arg1);
    }

    public void removeEntry(java.lang.String arg0) {
        real.removeEntry(arg0);
    }

    public void removeGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        real.removeGesture(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void save(java.io.OutputStream arg0) throws java.io.IOException {
        real.save(arg0);
    }

    public void save(java.io.OutputStream arg0, boolean arg1) throws java.io.IOException {
        real.save(arg0, arg1);
    }

    public void setOrientationStyle(int arg0) {
        real.setOrientationStyle(arg0);
    }

    public void setSequenceType(int arg0) {
        real.setSequenceType(arg0);
    }

    public static final int ORIENTATION_INVARIANT = android.gesture.GestureStore.ORIENTATION_INVARIANT;
    public static final int ORIENTATION_SENSITIVE = android.gesture.GestureStore.ORIENTATION_SENSITIVE;
    public static final int SEQUENCE_INVARIANT = android.gesture.GestureStore.SEQUENCE_INVARIANT;
    public static final int SEQUENCE_SENSITIVE = android.gesture.GestureStore.SEQUENCE_SENSITIVE;

}
