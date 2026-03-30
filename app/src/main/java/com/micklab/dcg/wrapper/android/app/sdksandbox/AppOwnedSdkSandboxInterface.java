// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class AppOwnedSdkSandboxInterface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppOwnedSdkSandboxInterface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.AppOwnedSdkSandboxInterface wrap(android.app.sdksandbox.AppOwnedSdkSandboxInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.AppOwnedSdkSandboxInterface(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.AppOwnedSdkSandboxInterface getReal() {
        return (android.app.sdksandbox.AppOwnedSdkSandboxInterface) real;
    }

    public android.app.sdksandbox.AppOwnedSdkSandboxInterface unwrap() {
        return getReal();
    }

    public AppOwnedSdkSandboxInterface(java.lang.String arg0, long arg1, com.micklab.dcg.wrapper.android.os.IBinder arg2) {
        this(new android.app.sdksandbox.AppOwnedSdkSandboxInterface(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.sdksandbox.AppOwnedSdkSandboxInterface) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getInterface() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.sdksandbox.AppOwnedSdkSandboxInterface) real).getInterface());
    }

    public java.lang.String getName() {
        return ((android.app.sdksandbox.AppOwnedSdkSandboxInterface) real).getName();
    }

    public long getVersion() {
        return ((android.app.sdksandbox.AppOwnedSdkSandboxInterface) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.sdksandbox.AppOwnedSdkSandboxInterface) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
