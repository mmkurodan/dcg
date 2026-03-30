// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class AccessibilityGestureEvent {
    private final android.accessibilityservice.AccessibilityGestureEvent real;

    public AccessibilityGestureEvent(android.accessibilityservice.AccessibilityGestureEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityGestureEvent wrap(android.accessibilityservice.AccessibilityGestureEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityGestureEvent(real);
    }

    public android.accessibilityservice.AccessibilityGestureEvent unwrap() {
        return real;
    }

    public AccessibilityGestureEvent(int arg0, int arg1, java.util.List arg2) {
        this(new android.accessibilityservice.AccessibilityGestureEvent(arg0, arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public static java.lang.String gestureIdToString(int arg0) {
        return android.accessibilityservice.AccessibilityGestureEvent.gestureIdToString(arg0);
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public int getGestureId() {
        return real.getGestureId();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
