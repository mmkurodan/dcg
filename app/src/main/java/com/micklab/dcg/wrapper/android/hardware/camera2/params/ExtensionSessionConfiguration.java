// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class ExtensionSessionConfiguration {
    private final android.hardware.camera2.params.ExtensionSessionConfiguration real;

    public ExtensionSessionConfiguration(android.hardware.camera2.params.ExtensionSessionConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.ExtensionSessionConfiguration wrap(android.hardware.camera2.params.ExtensionSessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.ExtensionSessionConfiguration(real);
    }

    public android.hardware.camera2.params.ExtensionSessionConfiguration unwrap() {
        return real;
    }

    public ExtensionSessionConfiguration(int arg0, java.util.List arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback arg3) {
        this(new android.hardware.camera2.params.ExtensionSessionConfiguration(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public void clearColorSpace() {
        real.clearColorSpace();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getColorSpace());
    }

    public java.util.concurrent.Executor getExecutor() {
        return real.getExecutor();
    }

    public int getExtension() {
        return real.getExtension();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration getPostviewOutputConfiguration() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration.wrap(real.getPostviewOutputConfiguration());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback getStateCallback() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback.wrap(real.getStateCallback());
    }

    public void setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named arg0) {
        real.setColorSpace(arg0 == null ? null : arg0.unwrap());
    }

    public void setPostviewOutputConfiguration(com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration arg0) {
        real.setPostviewOutputConfiguration(arg0 == null ? null : arg0.unwrap());
    }

}
