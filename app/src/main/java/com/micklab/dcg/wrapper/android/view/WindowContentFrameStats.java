// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowContentFrameStats {
    private final android.view.WindowContentFrameStats real;

    public WindowContentFrameStats(android.view.WindowContentFrameStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowContentFrameStats wrap(android.view.WindowContentFrameStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowContentFrameStats(real);
    }

    public android.view.WindowContentFrameStats unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getFramePostedTimeNano(int arg0) {
        return real.getFramePostedTimeNano(arg0);
    }

    public long getFrameReadyTimeNano(int arg0) {
        return real.getFrameReadyTimeNano(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
