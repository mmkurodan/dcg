// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class LoadSdkException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LoadSdkException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.LoadSdkException wrap(android.app.sdksandbox.LoadSdkException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.LoadSdkException(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.LoadSdkException getReal() {
        return (android.app.sdksandbox.LoadSdkException) real;
    }

    public android.app.sdksandbox.LoadSdkException unwrap() {
        return getReal();
    }

    public LoadSdkException(java.lang.Throwable arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.app.sdksandbox.LoadSdkException(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.sdksandbox.LoadSdkException) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtraInformation() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.sdksandbox.LoadSdkException) real).getExtraInformation());
    }

    public int getLoadSdkErrorCode() {
        return ((android.app.sdksandbox.LoadSdkException) real).getLoadSdkErrorCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.sdksandbox.LoadSdkException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
