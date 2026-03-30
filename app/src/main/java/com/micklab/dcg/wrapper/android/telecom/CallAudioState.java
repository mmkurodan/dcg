// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallAudioState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallAudioState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallAudioState wrap(android.telecom.CallAudioState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallAudioState(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallAudioState getReal() {
        return (android.telecom.CallAudioState) real;
    }

    public android.telecom.CallAudioState unwrap() {
        return getReal();
    }

    public CallAudioState(boolean arg0, int arg1, int arg2) {
        this(new android.telecom.CallAudioState(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public static java.lang.String audioRouteToString(int arg0) {
        return android.telecom.CallAudioState.audioRouteToString(arg0);
    }

    public int describeContents() {
        return ((android.telecom.CallAudioState) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.telecom.CallAudioState) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getActiveBluetoothDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.telecom.CallAudioState) real).getActiveBluetoothDevice());
    }

    public int getRoute() {
        return ((android.telecom.CallAudioState) real).getRoute();
    }

    public int getSupportedRouteMask() {
        return ((android.telecom.CallAudioState) real).getSupportedRouteMask();
    }

    public boolean isMuted() {
        return ((android.telecom.CallAudioState) real).isMuted();
    }

    public java.lang.String toString() {
        return ((android.telecom.CallAudioState) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.CallAudioState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ROUTE_BLUETOOTH = android.telecom.CallAudioState.ROUTE_BLUETOOTH;
    public static final int ROUTE_EARPIECE = android.telecom.CallAudioState.ROUTE_EARPIECE;
    public static final int ROUTE_SPEAKER = android.telecom.CallAudioState.ROUTE_SPEAKER;
    public static final int ROUTE_STREAMING = android.telecom.CallAudioState.ROUTE_STREAMING;
    public static final int ROUTE_WIRED_HEADSET = android.telecom.CallAudioState.ROUTE_WIRED_HEADSET;
    public static final int ROUTE_WIRED_OR_EARPIECE = android.telecom.CallAudioState.ROUTE_WIRED_OR_EARPIECE;

}
