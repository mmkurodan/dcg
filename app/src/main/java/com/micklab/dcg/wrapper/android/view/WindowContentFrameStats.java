// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowContentFrameStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowContentFrameStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowContentFrameStats wrap(android.view.WindowContentFrameStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowContentFrameStats(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowContentFrameStats getReal() {
        return (android.view.WindowContentFrameStats) real;
    }

    public android.view.WindowContentFrameStats unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.WindowContentFrameStats) real).describeContents();
    }

    public long getFramePostedTimeNano(int arg0) {
        return ((android.view.WindowContentFrameStats) real).getFramePostedTimeNano(arg0);
    }

    public long getFrameReadyTimeNano(int arg0) {
        return ((android.view.WindowContentFrameStats) real).getFrameReadyTimeNano(arg0);
    }

    public java.lang.String toString() {
        return ((android.view.WindowContentFrameStats) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.WindowContentFrameStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
