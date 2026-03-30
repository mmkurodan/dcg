// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class AccessibilityGestureEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityGestureEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityGestureEvent wrap(android.accessibilityservice.AccessibilityGestureEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityGestureEvent(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.AccessibilityGestureEvent getReal() {
        return (android.accessibilityservice.AccessibilityGestureEvent) real;
    }

    public android.accessibilityservice.AccessibilityGestureEvent unwrap() {
        return getReal();
    }

    public AccessibilityGestureEvent(int arg0, int arg1, java.util.List arg2) {
        this(new android.accessibilityservice.AccessibilityGestureEvent(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.accessibilityservice.AccessibilityGestureEvent) real).describeContents();
    }

    public static java.lang.String gestureIdToString(int arg0) {
        return android.accessibilityservice.AccessibilityGestureEvent.gestureIdToString(arg0);
    }

    public int getDisplayId() {
        return ((android.accessibilityservice.AccessibilityGestureEvent) real).getDisplayId();
    }

    public int getGestureId() {
        return ((android.accessibilityservice.AccessibilityGestureEvent) real).getGestureId();
    }

    public java.lang.String toString() {
        return ((android.accessibilityservice.AccessibilityGestureEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.accessibilityservice.AccessibilityGestureEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
