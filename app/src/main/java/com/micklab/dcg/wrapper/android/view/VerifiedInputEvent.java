// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class VerifiedInputEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VerifiedInputEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.VerifiedInputEvent wrap(android.view.VerifiedInputEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.VerifiedInputEvent(real, (__DcgwBridgeToken) null);
    }

    public android.view.VerifiedInputEvent getReal() {
        return (android.view.VerifiedInputEvent) real;
    }

    public android.view.VerifiedInputEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.VerifiedInputEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.VerifiedInputEvent) real).equals(arg0);
    }

    public int getDeviceId() {
        return ((android.view.VerifiedInputEvent) real).getDeviceId();
    }

    public int getDisplayId() {
        return ((android.view.VerifiedInputEvent) real).getDisplayId();
    }

    public long getEventTimeNanos() {
        return ((android.view.VerifiedInputEvent) real).getEventTimeNanos();
    }

    public int getSource() {
        return ((android.view.VerifiedInputEvent) real).getSource();
    }

    public int hashCode() {
        return ((android.view.VerifiedInputEvent) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.VerifiedInputEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
