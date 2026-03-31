// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.ad;

public final class TvAdServiceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvAdServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.ad.TvAdServiceInfo wrap(android.media.tv.ad.TvAdServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.ad.TvAdServiceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.ad.TvAdServiceInfo getReal() {
        return (android.media.tv.ad.TvAdServiceInfo) real;
    }

    public android.media.tv.ad.TvAdServiceInfo unwrap() {
        return getReal();
    }

    public TvAdServiceInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        this(new android.media.tv.ad.TvAdServiceInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.ad.TvAdServiceInfo) real).describeContents();
    }

    public java.lang.String getId() {
        return ((android.media.tv.ad.TvAdServiceInfo) real).getId();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(((android.media.tv.ad.TvAdServiceInfo) real).getServiceInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.ad.TvAdServiceInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
