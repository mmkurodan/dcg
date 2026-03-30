// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class StartForegroundCalledOnStoppedServiceException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StartForegroundCalledOnStoppedServiceException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.StartForegroundCalledOnStoppedServiceException wrap(android.app.StartForegroundCalledOnStoppedServiceException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.StartForegroundCalledOnStoppedServiceException(real, (__DcgwBridgeToken) null);
    }

    public android.app.StartForegroundCalledOnStoppedServiceException getReal() {
        return (android.app.StartForegroundCalledOnStoppedServiceException) real;
    }

    public android.app.StartForegroundCalledOnStoppedServiceException unwrap() {
        return getReal();
    }

    public StartForegroundCalledOnStoppedServiceException(java.lang.String arg0) {
        this(new android.app.StartForegroundCalledOnStoppedServiceException(arg0), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.StartForegroundCalledOnStoppedServiceException) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.StartForegroundCalledOnStoppedServiceException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
