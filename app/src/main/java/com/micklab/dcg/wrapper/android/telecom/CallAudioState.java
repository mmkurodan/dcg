// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallAudioState {
    private final android.telecom.CallAudioState real;

    public CallAudioState(android.telecom.CallAudioState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallAudioState wrap(android.telecom.CallAudioState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallAudioState(real);
    }

    public android.telecom.CallAudioState unwrap() {
        return real;
    }

    public CallAudioState(boolean arg0, int arg1, int arg2) {
        this(new android.telecom.CallAudioState(arg0, arg1, arg2));
    }

    public static java.lang.String audioRouteToString(int arg0) {
        return android.telecom.CallAudioState.audioRouteToString(arg0);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getActiveBluetoothDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getActiveBluetoothDevice());
    }

    public int getRoute() {
        return real.getRoute();
    }

    public int getSupportedRouteMask() {
        return real.getSupportedRouteMask();
    }

    public boolean isMuted() {
        return real.isMuted();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ROUTE_BLUETOOTH = android.telecom.CallAudioState.ROUTE_BLUETOOTH;
    public static final int ROUTE_EARPIECE = android.telecom.CallAudioState.ROUTE_EARPIECE;
    public static final int ROUTE_SPEAKER = android.telecom.CallAudioState.ROUTE_SPEAKER;
    public static final int ROUTE_STREAMING = android.telecom.CallAudioState.ROUTE_STREAMING;
    public static final int ROUTE_WIRED_HEADSET = android.telecom.CallAudioState.ROUTE_WIRED_HEADSET;
    public static final int ROUTE_WIRED_OR_EARPIECE = android.telecom.CallAudioState.ROUTE_WIRED_OR_EARPIECE;

}
