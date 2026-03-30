// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowAnimationFrameStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowAnimationFrameStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats wrap(android.view.WindowAnimationFrameStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowAnimationFrameStats(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowAnimationFrameStats getReal() {
        return (android.view.WindowAnimationFrameStats) real;
    }

    public android.view.WindowAnimationFrameStats unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.WindowAnimationFrameStats) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.view.WindowAnimationFrameStats) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.WindowAnimationFrameStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
