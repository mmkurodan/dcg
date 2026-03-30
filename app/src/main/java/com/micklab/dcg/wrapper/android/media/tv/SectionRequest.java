// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class SectionRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SectionRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.SectionRequest wrap(android.media.tv.SectionRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.SectionRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.SectionRequest getReal() {
        return (android.media.tv.SectionRequest) real;
    }

    public android.media.tv.SectionRequest unwrap() {
        return getReal();
    }

    public SectionRequest(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.media.tv.SectionRequest(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.SectionRequest) real).describeContents();
    }

    public int getTableId() {
        return ((android.media.tv.SectionRequest) real).getTableId();
    }

    public int getTsPid() {
        return ((android.media.tv.SectionRequest) real).getTsPid();
    }

    public int getVersion() {
        return ((android.media.tv.SectionRequest) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.SectionRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
