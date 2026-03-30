// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureStore {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureStore(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureStore wrap(android.gesture.GestureStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureStore(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.GestureStore getReal() {
        return (android.gesture.GestureStore) real;
    }

    public android.gesture.GestureStore unwrap() {
        return getReal();
    }

    public GestureStore() {
        this(new android.gesture.GestureStore(), (__DcgwBridgeToken) null);
    }

    public void addGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        ((android.gesture.GestureStore) real).addGesture(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int getOrientationStyle() {
        return ((android.gesture.GestureStore) real).getOrientationStyle();
    }

    public int getSequenceType() {
        return ((android.gesture.GestureStore) real).getSequenceType();
    }

    public boolean hasChanged() {
        return ((android.gesture.GestureStore) real).hasChanged();
    }

    public void load(java.io.InputStream arg0) throws java.io.IOException {
        ((android.gesture.GestureStore) real).load(arg0);
    }

    public void load(java.io.InputStream arg0, boolean arg1) throws java.io.IOException {
        ((android.gesture.GestureStore) real).load(arg0, arg1);
    }

    public void removeEntry(java.lang.String arg0) {
        ((android.gesture.GestureStore) real).removeEntry(arg0);
    }

    public void removeGesture(java.lang.String arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
        ((android.gesture.GestureStore) real).removeGesture(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void save(java.io.OutputStream arg0) throws java.io.IOException {
        ((android.gesture.GestureStore) real).save(arg0);
    }

    public void save(java.io.OutputStream arg0, boolean arg1) throws java.io.IOException {
        ((android.gesture.GestureStore) real).save(arg0, arg1);
    }

    public void setOrientationStyle(int arg0) {
        ((android.gesture.GestureStore) real).setOrientationStyle(arg0);
    }

    public void setSequenceType(int arg0) {
        ((android.gesture.GestureStore) real).setSequenceType(arg0);
    }

    public static final int ORIENTATION_INVARIANT = android.gesture.GestureStore.ORIENTATION_INVARIANT;
    public static final int ORIENTATION_SENSITIVE = android.gesture.GestureStore.ORIENTATION_SENSITIVE;
    public static final int SEQUENCE_INVARIANT = android.gesture.GestureStore.SEQUENCE_INVARIANT;
    public static final int SEQUENCE_SENSITIVE = android.gesture.GestureStore.SEQUENCE_SENSITIVE;

}
