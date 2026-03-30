// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class StreamEventRequest {
    private final android.media.tv.StreamEventRequest real;

    public StreamEventRequest(android.media.tv.StreamEventRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.StreamEventRequest wrap(android.media.tv.StreamEventRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.StreamEventRequest(real);
    }

    public android.media.tv.StreamEventRequest unwrap() {
        return real;
    }

    public StreamEventRequest(int arg0, int arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String arg3) {
        this(new android.media.tv.StreamEventRequest(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getEventName() {
        return real.getEventName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTargetUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getTargetUri());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
