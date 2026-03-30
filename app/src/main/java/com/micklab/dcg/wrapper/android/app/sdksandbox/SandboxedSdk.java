// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class SandboxedSdk {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SandboxedSdk(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk wrap(android.app.sdksandbox.SandboxedSdk real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.SandboxedSdk getReal() {
        return (android.app.sdksandbox.SandboxedSdk) real;
    }

    public android.app.sdksandbox.SandboxedSdk unwrap() {
        return getReal();
    }

    public SandboxedSdk(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        this(new android.app.sdksandbox.SandboxedSdk(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.sdksandbox.SandboxedSdk) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder getInterface() {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.sdksandbox.SandboxedSdk) real).getInterface());
    }

    public com.micklab.dcg.wrapper.android.content.pm.SharedLibraryInfo getSharedLibraryInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.SharedLibraryInfo.wrap(((android.app.sdksandbox.SandboxedSdk) real).getSharedLibraryInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.sdksandbox.SandboxedSdk) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
