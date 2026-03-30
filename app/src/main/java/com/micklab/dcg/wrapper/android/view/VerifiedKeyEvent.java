// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VerifiedKeyEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VerifiedKeyEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VerifiedKeyEvent wrap(android.view.VerifiedKeyEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VerifiedKeyEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.VerifiedKeyEvent getReal() {
        return (android.view.VerifiedKeyEvent) real;
    }

    public android.view.VerifiedKeyEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.VerifiedKeyEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.VerifiedKeyEvent) real).equals(arg0);
    }

    public int getAction() {
        return ((android.view.VerifiedKeyEvent) real).getAction();
    }

    public long getDownTimeNanos() {
        return ((android.view.VerifiedKeyEvent) real).getDownTimeNanos();
    }

    public java.lang.Boolean getFlag(int arg0) {
        return ((android.view.VerifiedKeyEvent) real).getFlag(arg0);
    }

    public int getKeyCode() {
        return ((android.view.VerifiedKeyEvent) real).getKeyCode();
    }

    public int getMetaState() {
        return ((android.view.VerifiedKeyEvent) real).getMetaState();
    }

    public int getRepeatCount() {
        return ((android.view.VerifiedKeyEvent) real).getRepeatCount();
    }

    public int getScanCode() {
        return ((android.view.VerifiedKeyEvent) real).getScanCode();
    }

    public int hashCode() {
        return ((android.view.VerifiedKeyEvent) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.VerifiedKeyEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
