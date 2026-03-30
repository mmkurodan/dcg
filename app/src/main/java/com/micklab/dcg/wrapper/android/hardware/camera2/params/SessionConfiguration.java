// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class SessionConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SessionConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration wrap(android.hardware.camera2.params.SessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.SessionConfiguration getReal() {
        return (android.hardware.camera2.params.SessionConfiguration) real;
    }

    public android.hardware.camera2.params.SessionConfiguration unwrap() {
        return getReal();
    }

    public SessionConfiguration(int arg0, java.util.List arg1) {
        this(new android.hardware.camera2.params.SessionConfiguration(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public SessionConfiguration(int arg0, java.util.List arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback arg3) {
        this(new android.hardware.camera2.params.SessionConfiguration(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public void clearColorSpace() {
        ((android.hardware.camera2.params.SessionConfiguration) real).clearColorSpace();
    }

    public int describeContents() {
        return ((android.hardware.camera2.params.SessionConfiguration) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.SessionConfiguration) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.hardware.camera2.params.SessionConfiguration) real).getColorSpace());
    }

    public java.util.concurrent.Executor getExecutor() {
        return ((android.hardware.camera2.params.SessionConfiguration) real).getExecutor();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration getInputConfiguration() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration.wrap(((android.hardware.camera2.params.SessionConfiguration) real).getInputConfiguration());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest getSessionParameters() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(((android.hardware.camera2.params.SessionConfiguration) real).getSessionParameters());
    }

    public int getSessionType() {
        return ((android.hardware.camera2.params.SessionConfiguration) real).getSessionType();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback.wrap(((android.hardware.camera2.params.SessionConfiguration) real).getStateCallback());
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.SessionConfiguration) real).hashCode();
    }

    public void setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named arg0) {
        ((android.hardware.camera2.params.SessionConfiguration) real).setColorSpace(arg0 == null ? null : arg0.getReal());
    }

    public void setInputConfiguration(com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration arg0) {
        ((android.hardware.camera2.params.SessionConfiguration) real).setInputConfiguration(arg0 == null ? null : arg0.getReal());
    }

    public void setSessionParameters(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0) {
        ((android.hardware.camera2.params.SessionConfiguration) real).setSessionParameters(arg0 == null ? null : arg0.getReal());
    }

    public void setStateCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback arg1) {
        ((android.hardware.camera2.params.SessionConfiguration) real).setStateCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.camera2.params.SessionConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SESSION_HIGH_SPEED = android.hardware.camera2.params.SessionConfiguration.SESSION_HIGH_SPEED;
    public static final int SESSION_REGULAR = android.hardware.camera2.params.SessionConfiguration.SESSION_REGULAR;

}
