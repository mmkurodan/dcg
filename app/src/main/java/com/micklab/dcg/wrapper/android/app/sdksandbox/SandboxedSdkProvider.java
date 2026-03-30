// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.sdksandbox;

public final class SandboxedSdkProvider {
    private final android.app.sdksandbox.SandboxedSdkProvider real;

    public SandboxedSdkProvider(android.app.sdksandbox.SandboxedSdkProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdkProvider wrap(android.app.sdksandbox.SandboxedSdkProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdkProvider(real);
    }

    public android.app.sdksandbox.SandboxedSdkProvider unwrap() {
        return real;
    }

    public void attachContext(com.micklab.dcg.wrapper.android.content.Context arg0) {
        real.attachContext(arg0 == null ? null : arg0.unwrap());
    }

    public void beforeUnloadSdk() {
        real.beforeUnloadSdk();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public com.micklab.dcg.wrapper.android.view.View getView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk onLoadSdk(com.micklab.dcg.wrapper.android.os.Bundle arg0) throws android.app.sdksandbox.LoadSdkException {
        return com.micklab.dcg.wrapper.android.app.sdksandbox.SandboxedSdk.wrap(real.onLoadSdk(arg0 == null ? null : arg0.unwrap()));
    }

}
