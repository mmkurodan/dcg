// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class AppOwnedSdkSandboxInterface {
    private final android.app.sdksandbox.AppOwnedSdkSandboxInterface real;

    public AppOwnedSdkSandboxInterface(android.app.sdksandbox.AppOwnedSdkSandboxInterface real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.AppOwnedSdkSandboxInterface wrap(android.app.sdksandbox.AppOwnedSdkSandboxInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.AppOwnedSdkSandboxInterface(real);
    }

    public android.app.sdksandbox.AppOwnedSdkSandboxInterface unwrap() {
        return real;
    }

    public AppOwnedSdkSandboxInterface(java.lang.String arg0, long arg1, com.micklab.dcg.wrapper.android.os.IBinder arg2) {
        this(new android.app.sdksandbox.AppOwnedSdkSandboxInterface(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getInterface() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getInterface());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public long getVersion() {
        return real.getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
