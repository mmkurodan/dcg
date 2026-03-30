// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class LoadSdkException {
    private final android.app.sdksandbox.LoadSdkException real;

    public LoadSdkException(android.app.sdksandbox.LoadSdkException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.LoadSdkException wrap(android.app.sdksandbox.LoadSdkException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.LoadSdkException(real);
    }

    public android.app.sdksandbox.LoadSdkException unwrap() {
        return real;
    }

    public LoadSdkException(java.lang.Throwable arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.app.sdksandbox.LoadSdkException(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtraInformation() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtraInformation());
    }

    public int getLoadSdkErrorCode() {
        return real.getLoadSdkErrorCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
