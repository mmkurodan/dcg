// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VerifiedMotionEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VerifiedMotionEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VerifiedMotionEvent wrap(android.view.VerifiedMotionEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VerifiedMotionEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.VerifiedMotionEvent getReal() {
        return (android.view.VerifiedMotionEvent) real;
    }

    public android.view.VerifiedMotionEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.VerifiedMotionEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.VerifiedMotionEvent) real).equals(arg0);
    }

    public int getActionMasked() {
        return ((android.view.VerifiedMotionEvent) real).getActionMasked();
    }

    public int getButtonState() {
        return ((android.view.VerifiedMotionEvent) real).getButtonState();
    }

    public long getDownTimeNanos() {
        return ((android.view.VerifiedMotionEvent) real).getDownTimeNanos();
    }

    public java.lang.Boolean getFlag(int arg0) {
        return ((android.view.VerifiedMotionEvent) real).getFlag(arg0);
    }

    public int getMetaState() {
        return ((android.view.VerifiedMotionEvent) real).getMetaState();
    }

    public float getRawX() {
        return ((android.view.VerifiedMotionEvent) real).getRawX();
    }

    public float getRawY() {
        return ((android.view.VerifiedMotionEvent) real).getRawY();
    }

    public int hashCode() {
        return ((android.view.VerifiedMotionEvent) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.VerifiedMotionEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
