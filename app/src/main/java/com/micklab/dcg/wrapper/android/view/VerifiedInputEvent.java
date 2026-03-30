// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VerifiedInputEvent {
    private final android.view.VerifiedInputEvent real;

    public VerifiedInputEvent(android.view.VerifiedInputEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VerifiedInputEvent wrap(android.view.VerifiedInputEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VerifiedInputEvent(real);
    }

    public android.view.VerifiedInputEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public long getEventTimeNanos() {
        return real.getEventTimeNanos();
    }

    public int getSource() {
        return real.getSource();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
