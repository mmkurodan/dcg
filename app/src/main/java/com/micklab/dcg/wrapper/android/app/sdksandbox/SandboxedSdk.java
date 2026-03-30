// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class SandboxedSdk {
    private final android.app.sdksandbox.SandboxedSdk real;

    public SandboxedSdk(android.app.sdksandbox.SandboxedSdk real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk wrap(android.app.sdksandbox.SandboxedSdk real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk(real);
    }

    public android.app.sdksandbox.SandboxedSdk unwrap() {
        return real;
    }

    public SandboxedSdk(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        this(new android.app.sdksandbox.SandboxedSdk(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getInterface() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.getInterface());
    }

    public com.micklab.dcg.wrapper.android.content.pm.SharedLibraryInfo getSharedLibraryInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.SharedLibraryInfo.wrap(real.getSharedLibraryInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
