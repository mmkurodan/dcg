// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SectionResponse {
    private final android.media.tv.SectionResponse real;

    public SectionResponse(android.media.tv.SectionResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SectionResponse wrap(android.media.tv.SectionResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SectionResponse(real);
    }

    public android.media.tv.SectionResponse unwrap() {
        return real;
    }

    public SectionResponse(int arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
        this(new android.media.tv.SectionResponse(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getSessionData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getSessionData());
    }

    public int getSessionId() {
        return real.getSessionId();
    }

    public int getVersion() {
        return real.getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
