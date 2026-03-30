// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class SandboxedSdkProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SandboxedSdkProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdkProvider wrap(android.app.sdksandbox.SandboxedSdkProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdkProvider(real, (__DcgwBridgeToken) null);
    }

    public android.app.sdksandbox.SandboxedSdkProvider getReal() {
        return (android.app.sdksandbox.SandboxedSdkProvider) real;
    }

    public android.app.sdksandbox.SandboxedSdkProvider unwrap() {
        return getReal();
    }

    public void attachContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
        ((android.app.sdksandbox.SandboxedSdkProvider) real).attachContext(arg0 == null ? null : arg0.getReal());
    }

    public void beforeUnloadSdk() {
        ((android.app.sdksandbox.SandboxedSdkProvider) real).beforeUnloadSdk();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.sdksandbox.SandboxedSdkProvider) real).getContext());
    }

    public com.micklab.dcg.wrapper.android.view.View getView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.sdksandbox.SandboxedSdkProvider) real).getView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk onLoadSdk(com.micklab.dcg.wrapper.android.os.Bundle arg0) throws android.app.sdksandbox.LoadSdkException {
        return com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk.wrap(((android.app.sdksandbox.SandboxedSdkProvider) real).onLoadSdk(arg0 == null ? null : arg0.getReal()));
    }

}
