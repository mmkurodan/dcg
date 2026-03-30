// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class StartForegroundCalledOnStoppedServiceException {
    private final android.app.StartForegroundCalledOnStoppedServiceException real;

    public StartForegroundCalledOnStoppedServiceException(android.app.StartForegroundCalledOnStoppedServiceException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.StartForegroundCalledOnStoppedServiceException wrap(android.app.StartForegroundCalledOnStoppedServiceException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.StartForegroundCalledOnStoppedServiceException(real);
    }

    public android.app.StartForegroundCalledOnStoppedServiceException unwrap() {
        return real;
    }

    public StartForegroundCalledOnStoppedServiceException(java.lang.String arg0) {
        this(new android.app.StartForegroundCalledOnStoppedServiceException(arg0));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
