// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class SessionConfiguration {
    private final android.hardware.camera2.params.SessionConfiguration real;

    public SessionConfiguration(android.hardware.camera2.params.SessionConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration wrap(android.hardware.camera2.params.SessionConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration(real);
    }

    public android.hardware.camera2.params.SessionConfiguration unwrap() {
        return real;
    }

    public SessionConfiguration(int arg0, java.util.List arg1) {
        this(new android.hardware.camera2.params.SessionConfiguration(arg0, arg1));
    }

    public SessionConfiguration(int arg0, java.util.List arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback arg3) {
        this(new android.hardware.camera2.params.SessionConfiguration(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public void clearColorSpace() {
        real.clearColorSpace();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getColorSpace());
    }

    public java.util.concurrent.Executor getExecutor() {
        return real.getExecutor();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration getInputConfiguration() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration.wrap(real.getInputConfiguration());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest getSessionParameters() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(real.getSessionParameters());
    }

    public int getSessionType() {
        return real.getSessionType();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback.wrap(real.getStateCallback());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace.Named arg0) {
        real.setColorSpace(arg0 == null ? null : arg0.unwrap());
    }

    public void setInputConfiguration(com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration arg0) {
        real.setInputConfiguration(arg0 == null ? null : arg0.unwrap());
    }

    public void setSessionParameters(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0) {
        real.setSessionParameters(arg0 == null ? null : arg0.unwrap());
    }

    public void setStateCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback arg1) {
        real.setStateCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int SESSION_HIGH_SPEED = android.hardware.camera2.params.SessionConfiguration.SESSION_HIGH_SPEED;
    public static final int SESSION_REGULAR = android.hardware.camera2.params.SessionConfiguration.SESSION_REGULAR;

}
