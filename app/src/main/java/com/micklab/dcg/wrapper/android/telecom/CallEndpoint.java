// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallEndpoint {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallEndpoint(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallEndpoint wrap(android.telecom.CallEndpoint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallEndpoint(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallEndpoint getReal() {
        return (android.telecom.CallEndpoint) real;
    }

    public android.telecom.CallEndpoint unwrap() {
        return getReal();
    }

    public CallEndpoint(java.lang.CharSequence arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelUuid arg2) {
        this(new android.telecom.CallEndpoint(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.CallEndpoint) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.telecom.CallEndpoint) real).equals(arg0);
    }

    public java.lang.CharSequence getEndpointName() {
        return ((android.telecom.CallEndpoint) real).getEndpointName();
    }

    public int getEndpointType() {
        return ((android.telecom.CallEndpoint) real).getEndpointType();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getIdentifier() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.telecom.CallEndpoint) real).getIdentifier());
    }

    public int hashCode() {
        return ((android.telecom.CallEndpoint) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.telecom.CallEndpoint) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.CallEndpoint) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_BLUETOOTH = android.telecom.CallEndpoint.TYPE_BLUETOOTH;
    public static final int TYPE_EARPIECE = android.telecom.CallEndpoint.TYPE_EARPIECE;
    public static final int TYPE_SPEAKER = android.telecom.CallEndpoint.TYPE_SPEAKER;
    public static final int TYPE_STREAMING = android.telecom.CallEndpoint.TYPE_STREAMING;
    public static final int TYPE_UNKNOWN = android.telecom.CallEndpoint.TYPE_UNKNOWN;
    public static final int TYPE_WIRED_HEADSET = android.telecom.CallEndpoint.TYPE_WIRED_HEADSET;

}
