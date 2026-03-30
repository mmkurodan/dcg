// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class TvInteractiveAppServiceInfo {
    private final android.media.tv.interactive.TvInteractiveAppServiceInfo real;

    public TvInteractiveAppServiceInfo(android.media.tv.interactive.TvInteractiveAppServiceInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppServiceInfo wrap(android.media.tv.interactive.TvInteractiveAppServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppServiceInfo(real);
    }

    public android.media.tv.interactive.TvInteractiveAppServiceInfo unwrap() {
        return real;
    }

    public TvInteractiveAppServiceInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        this(new android.media.tv.interactive.TvInteractiveAppServiceInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(real.getServiceInfo());
    }

    public int getSupportedTypes() {
        return real.getSupportedTypes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int INTERACTIVE_APP_TYPE_ATSC = android.media.tv.interactive.TvInteractiveAppServiceInfo.INTERACTIVE_APP_TYPE_ATSC;
    public static final int INTERACTIVE_APP_TYPE_GINGA = android.media.tv.interactive.TvInteractiveAppServiceInfo.INTERACTIVE_APP_TYPE_GINGA;
    public static final int INTERACTIVE_APP_TYPE_HBBTV = android.media.tv.interactive.TvInteractiveAppServiceInfo.INTERACTIVE_APP_TYPE_HBBTV;
    public static final int INTERACTIVE_APP_TYPE_OTHER = android.media.tv.interactive.TvInteractiveAppServiceInfo.INTERACTIVE_APP_TYPE_OTHER;
    public static final int INTERACTIVE_APP_TYPE_TARGETED_AD = android.media.tv.interactive.TvInteractiveAppServiceInfo.INTERACTIVE_APP_TYPE_TARGETED_AD;

}
