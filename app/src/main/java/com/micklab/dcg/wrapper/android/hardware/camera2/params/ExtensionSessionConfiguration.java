// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class ExtensionSessionConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExtensionSessionConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.ExtensionSessionConfiguration wrap(android.hardware.camera2.params.ExtensionSessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.ExtensionSessionConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.ExtensionSessionConfiguration getReal() {
        return (android.hardware.camera2.params.ExtensionSessionConfiguration) real;
    }

    public android.hardware.camera2.params.ExtensionSessionConfiguration unwrap() {
        return getReal();
    }

    public ExtensionSessionConfiguration(int arg0, java.util.List arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback arg3) {
        this(new android.hardware.camera2.params.ExtensionSessionConfiguration(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public void clearColorSpace() {
        ((android.hardware.camera2.params.ExtensionSessionConfiguration) real).clearColorSpace();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.hardware.camera2.params.ExtensionSessionConfiguration) real).getColorSpace());
    }

    public java.util.concurrent.Executor getExecutor() {
        return ((android.hardware.camera2.params.ExtensionSessionConfiguration) real).getExecutor();
    }

    public int getExtension() {
        return ((android.hardware.camera2.params.ExtensionSessionConfiguration) real).getExtension();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration getPostviewOutputConfiguration() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration.wrap(((android.hardware.camera2.params.ExtensionSessionConfiguration) real).getPostviewOutputConfiguration());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback getStateCallback() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback.wrap(((android.hardware.camera2.params.ExtensionSessionConfiguration) real).getStateCallback());
    }

    public void setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named arg0) {
        ((android.hardware.camera2.params.ExtensionSessionConfiguration) real).setColorSpace(arg0 == null ? null : arg0.getReal());
    }

    public void setPostviewOutputConfiguration(com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration arg0) {
        ((android.hardware.camera2.params.ExtensionSessionConfiguration) real).setPostviewOutputConfiguration(arg0 == null ? null : arg0.getReal());
    }

}
