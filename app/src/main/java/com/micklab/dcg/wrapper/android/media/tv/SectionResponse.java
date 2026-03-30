// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SectionResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SectionResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SectionResponse wrap(android.media.tv.SectionResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SectionResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.SectionResponse getReal() {
        return (android.media.tv.SectionResponse) real;
    }

    public android.media.tv.SectionResponse unwrap() {
        return getReal();
    }

    public SectionResponse(int arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
        this(new android.media.tv.SectionResponse(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.SectionResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getSessionData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.tv.SectionResponse) real).getSessionData());
    }

    public int getSessionId() {
        return ((android.media.tv.SectionResponse) real).getSessionId();
    }

    public int getVersion() {
        return ((android.media.tv.SectionResponse) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.SectionResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
