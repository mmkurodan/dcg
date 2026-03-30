// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowAnimationFrameStats {
    private final android.view.WindowAnimationFrameStats real;

    public WindowAnimationFrameStats(android.view.WindowAnimationFrameStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats wrap(android.view.WindowAnimationFrameStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats(real);
    }

    public android.view.WindowAnimationFrameStats unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
