// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VerifiedKeyEvent {
    private final android.view.VerifiedKeyEvent real;

    public VerifiedKeyEvent(android.view.VerifiedKeyEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VerifiedKeyEvent wrap(android.view.VerifiedKeyEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VerifiedKeyEvent(real);
    }

    public android.view.VerifiedKeyEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAction() {
        return real.getAction();
    }

    public long getDownTimeNanos() {
        return real.getDownTimeNanos();
    }

    public java.lang.Boolean getFlag(int arg0) {
        return real.getFlag(arg0);
    }

    public int getKeyCode() {
        return real.getKeyCode();
    }

    public int getMetaState() {
        return real.getMetaState();
    }

    public int getRepeatCount() {
        return real.getRepeatCount();
    }

    public int getScanCode() {
        return real.getScanCode();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
