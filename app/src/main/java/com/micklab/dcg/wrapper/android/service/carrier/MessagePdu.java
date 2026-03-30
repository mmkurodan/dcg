// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.carrier;

public final class MessagePdu {
    private final android.service.carrier.MessagePdu real;

    public MessagePdu(android.service.carrier.MessagePdu real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.carrier.MessagePdu wrap(android.service.carrier.MessagePdu real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.carrier.MessagePdu(real);
    }

    public android.service.carrier.MessagePdu unwrap() {
        return real;
    }

    public MessagePdu(java.util.List arg0) {
        this(new android.service.carrier.MessagePdu(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
