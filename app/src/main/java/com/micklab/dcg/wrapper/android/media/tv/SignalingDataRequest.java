// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SignalingDataRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SignalingDataRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SignalingDataRequest wrap(android.media.tv.SignalingDataRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SignalingDataRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.SignalingDataRequest getReal() {
        return (android.media.tv.SignalingDataRequest) real;
    }

    public android.media.tv.SignalingDataRequest unwrap() {
        return getReal();
    }

    public SignalingDataRequest(int arg0, int arg1, int arg2, java.util.List arg3) {
        this(new android.media.tv.SignalingDataRequest(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.SignalingDataRequest) real).describeContents();
    }

    public int getGroup() {
        return ((android.media.tv.SignalingDataRequest) real).getGroup();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.SignalingDataRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SIGNALING_DATA_NO_GROUP_ID = android.media.tv.SignalingDataRequest.SIGNALING_DATA_NO_GROUP_ID;
    public static final java.lang.String SIGNALING_METADATA_AEAT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_AEAT;
    public static final java.lang.String SIGNALING_METADATA_AEI = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_AEI;
    public static final java.lang.String SIGNALING_METADATA_APD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_APD;
    public static final java.lang.String SIGNALING_METADATA_ASD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_ASD;
    public static final java.lang.String SIGNALING_METADATA_ASPD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_ASPD;
    public static final java.lang.String SIGNALING_METADATA_CAD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_CAD;
    public static final java.lang.String SIGNALING_METADATA_CDT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_CDT;
    public static final java.lang.String SIGNALING_METADATA_CRIT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_CRIT;
    public static final java.lang.String SIGNALING_METADATA_DCIT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_DCIT;
    public static final java.lang.String SIGNALING_METADATA_DWD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_DWD;
    public static final java.lang.String SIGNALING_METADATA_EMSG = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_EMSG;
    public static final java.lang.String SIGNALING_METADATA_EVTI = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_EVTI;
    public static final java.lang.String SIGNALING_METADATA_HELD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_HELD;
    public static final java.lang.String SIGNALING_METADATA_IED = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_IED;
    public static final java.lang.String SIGNALING_METADATA_MPD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_MPD;
    public static final java.lang.String SIGNALING_METADATA_MPIT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_MPIT;
    public static final java.lang.String SIGNALING_METADATA_MPT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_MPT;
    public static final java.lang.String SIGNALING_METADATA_OSN = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_OSN;
    public static final java.lang.String SIGNALING_METADATA_PAT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_PAT;
    public static final java.lang.String SIGNALING_METADATA_RDT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_RDT;
    public static final java.lang.String SIGNALING_METADATA_RRT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_RRT;
    public static final java.lang.String SIGNALING_METADATA_RSAT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_RSAT;
    public static final java.lang.String SIGNALING_METADATA_SLT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_SLT;
    public static final java.lang.String SIGNALING_METADATA_SMT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_SMT;
    public static final java.lang.String SIGNALING_METADATA_SSD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_SSD;
    public static final java.lang.String SIGNALING_METADATA_STSID = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_STSID;
    public static final java.lang.String SIGNALING_METADATA_STT = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_STT;
    public static final java.lang.String SIGNALING_METADATA_USBD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_USBD;
    public static final java.lang.String SIGNALING_METADATA_USD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_USD;
    public static final java.lang.String SIGNALING_METADATA_VSPD = android.media.tv.SignalingDataRequest.SIGNALING_METADATA_VSPD;

}
