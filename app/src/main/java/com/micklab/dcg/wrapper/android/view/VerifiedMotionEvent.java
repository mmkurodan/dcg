// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VerifiedMotionEvent {
    private final android.view.VerifiedMotionEvent real;

    public VerifiedMotionEvent(android.view.VerifiedMotionEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VerifiedMotionEvent wrap(android.view.VerifiedMotionEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VerifiedMotionEvent(real);
    }

    public android.view.VerifiedMotionEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getActionMasked() {
        return real.getActionMasked();
    }

    public int getButtonState() {
        return real.getButtonState();
    }

    public long getDownTimeNanos() {
        return real.getDownTimeNanos();
    }

    public java.lang.Boolean getFlag(int arg0) {
        return real.getFlag(arg0);
    }

    public int getMetaState() {
        return real.getMetaState();
    }

    public float getRawX() {
        return real.getRawX();
    }

    public float getRawY() {
        return real.getRawY();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
