// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class MessagePdu {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MessagePdu(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.MessagePdu wrap(android.service.carrier.MessagePdu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.MessagePdu(real, (__DcgwBridgeToken) null);
    }

    public android.service.carrier.MessagePdu getReal() {
        return (android.service.carrier.MessagePdu) real;
    }

    public android.service.carrier.MessagePdu unwrap() {
        return getReal();
    }

    public MessagePdu(java.util.List arg0) {
        this(new android.service.carrier.MessagePdu(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.carrier.MessagePdu) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.carrier.MessagePdu) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
