// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class Camera {
    private final android.hardware.Camera real;

    public Camera(android.hardware.Camera real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.Camera wrap(android.hardware.Camera real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera(real);
    }

    public android.hardware.Camera unwrap() {
        return real;
    }

    public void addCallbackBuffer(byte[] arg0) {
        real.addCallbackBuffer(arg0);
    }

    public void autoFocus(com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusCallback arg0) {
        real.autoFocus(arg0 == null ? null : arg0.unwrap());
    }

    public void cancelAutoFocus() {
        real.cancelAutoFocus();
    }

    public boolean enableShutterSound(boolean arg0) {
        return real.enableShutterSound(arg0);
    }

    public static void getCameraInfo(int arg0, com.micklab.dcg.wrapper.android.hardware.Camera.CameraInfo arg1) {
        android.hardware.Camera.getCameraInfo(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static int getNumberOfCameras() {
        return android.hardware.Camera.getNumberOfCameras();
    }

    public android.hardware.Camera.Parameters getParameters() {
        return real.getParameters();
    }

    public void lock() {
        real.lock();
    }

    public static com.micklab.dcg.wrapper.android.hardware.Camera open() {
        return com.micklab.dcg.wrapper.android.hardware.Camera.wrap(android.hardware.Camera.open());
    }

    public static com.micklab.dcg.wrapper.android.hardware.Camera open(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.Camera.wrap(android.hardware.Camera.open(arg0));
    }

    public void reconnect() throws java.io.IOException {
        real.reconnect();
    }

    public void release() {
        real.release();
    }

    public void setAutoFocusMoveCallback(com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusMoveCallback arg0) {
        real.setAutoFocusMoveCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setDisplayOrientation(int arg0) {
        real.setDisplayOrientation(arg0);
    }

    public void setErrorCallback(com.micklab.dcg.wrapper.android.hardware.Camera.ErrorCallback arg0) {
        real.setErrorCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setFaceDetectionListener(com.micklab.dcg.wrapper.android.hardware.Camera.FaceDetectionListener arg0) {
        real.setFaceDetectionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOneShotPreviewCallback(com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback arg0) {
        real.setOneShotPreviewCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setParameters(android.hardware.Camera.Parameters arg0) {
        real.setParameters(arg0);
    }

    public void setPreviewCallback(com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback arg0) {
        real.setPreviewCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreviewCallbackWithBuffer(com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback arg0) {
        real.setPreviewCallbackWithBuffer(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreviewDisplay(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) throws java.io.IOException {
        real.setPreviewDisplay(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreviewTexture(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) throws java.io.IOException {
        real.setPreviewTexture(arg0 == null ? null : arg0.unwrap());
    }

    public void setZoomChangeListener(com.micklab.dcg.wrapper.android.hardware.Camera.OnZoomChangeListener arg0) {
        real.setZoomChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void startFaceDetection() {
        real.startFaceDetection();
    }

    public void startPreview() {
        real.startPreview();
    }

    public void startSmoothZoom(int arg0) {
        real.startSmoothZoom(arg0);
    }

    public void stopFaceDetection() {
        real.stopFaceDetection();
    }

    public void stopPreview() {
        real.stopPreview();
    }

    public void stopSmoothZoom() {
        real.stopSmoothZoom();
    }

    public void takePicture(com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback arg0, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg1, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg2) {
        real.takePicture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void takePicture(com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback arg0, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg1, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg2, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg3) {
        real.takePicture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void unlock() {
        real.unlock();
    }

    public static final java.lang.String ACTION_NEW_PICTURE = android.hardware.Camera.ACTION_NEW_PICTURE;
    public static final java.lang.String ACTION_NEW_VIDEO = android.hardware.Camera.ACTION_NEW_VIDEO;
    public static final int CAMERA_ERROR_EVICTED = android.hardware.Camera.CAMERA_ERROR_EVICTED;
    public static final int CAMERA_ERROR_SERVER_DIED = android.hardware.Camera.CAMERA_ERROR_SERVER_DIED;
    public static final int CAMERA_ERROR_UNKNOWN = android.hardware.Camera.CAMERA_ERROR_UNKNOWN;

    public static final class Area {
        private final android.hardware.Camera.Area real;

        public Area(android.hardware.Camera.Area real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.Area wrap(android.hardware.Camera.Area real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.Area(real);
        }

        public android.hardware.Camera.Area unwrap() {
            return real;
        }

        public Area(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1) {
            this(new android.hardware.Camera.Area(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }


    }
    public static final class AutoFocusCallback {
        private final android.hardware.Camera.AutoFocusCallback real;

        public AutoFocusCallback(android.hardware.Camera.AutoFocusCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusCallback wrap(android.hardware.Camera.AutoFocusCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusCallback(real);
        }

        public android.hardware.Camera.AutoFocusCallback unwrap() {
            return real;
        }

        public void onAutoFocus(boolean arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            real.onAutoFocus(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class AutoFocusMoveCallback {
        private final android.hardware.Camera.AutoFocusMoveCallback real;

        public AutoFocusMoveCallback(android.hardware.Camera.AutoFocusMoveCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusMoveCallback wrap(android.hardware.Camera.AutoFocusMoveCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusMoveCallback(real);
        }

        public android.hardware.Camera.AutoFocusMoveCallback unwrap() {
            return real;
        }

        public void onAutoFocusMoving(boolean arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            real.onAutoFocusMoving(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class CameraInfo {
        private final android.hardware.Camera.CameraInfo real;

        public CameraInfo(android.hardware.Camera.CameraInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.CameraInfo wrap(android.hardware.Camera.CameraInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.CameraInfo(real);
        }

        public android.hardware.Camera.CameraInfo unwrap() {
            return real;
        }

        public CameraInfo() {
            this(new android.hardware.Camera.CameraInfo());
        }

        public static final int CAMERA_FACING_BACK = android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK;
        public static final int CAMERA_FACING_FRONT = android.hardware.Camera.CameraInfo.CAMERA_FACING_FRONT;

    }
    public static final class ErrorCallback {
        private final android.hardware.Camera.ErrorCallback real;

        public ErrorCallback(android.hardware.Camera.ErrorCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.ErrorCallback wrap(android.hardware.Camera.ErrorCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.ErrorCallback(real);
        }

        public android.hardware.Camera.ErrorCallback unwrap() {
            return real;
        }

        public void onError(int arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            real.onError(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class Face {
        private final android.hardware.Camera.Face real;

        public Face(android.hardware.Camera.Face real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.Face wrap(android.hardware.Camera.Face real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.Face(real);
        }

        public android.hardware.Camera.Face unwrap() {
            return real;
        }

        public Face() {
            this(new android.hardware.Camera.Face());
        }


    }
    public static final class FaceDetectionListener {
        private final android.hardware.Camera.FaceDetectionListener real;

        public FaceDetectionListener(android.hardware.Camera.FaceDetectionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.FaceDetectionListener wrap(android.hardware.Camera.FaceDetectionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.FaceDetectionListener(real);
        }

        public android.hardware.Camera.FaceDetectionListener unwrap() {
            return real;
        }

        public void onFaceDetection(android.hardware.Camera.Face[] arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            real.onFaceDetection(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnZoomChangeListener {
        private final android.hardware.Camera.OnZoomChangeListener real;

        public OnZoomChangeListener(android.hardware.Camera.OnZoomChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.OnZoomChangeListener wrap(android.hardware.Camera.OnZoomChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.OnZoomChangeListener(real);
        }

        public android.hardware.Camera.OnZoomChangeListener unwrap() {
            return real;
        }

        public void onZoomChange(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.hardware.Camera arg2) {
            real.onZoomChange(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class PictureCallback {
        private final android.hardware.Camera.PictureCallback real;

        public PictureCallback(android.hardware.Camera.PictureCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback wrap(android.hardware.Camera.PictureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback(real);
        }

        public android.hardware.Camera.PictureCallback unwrap() {
            return real;
        }

        public void onPictureTaken(byte[] arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            real.onPictureTaken(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class PreviewCallback {
        private final android.hardware.Camera.PreviewCallback real;

        public PreviewCallback(android.hardware.Camera.PreviewCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback wrap(android.hardware.Camera.PreviewCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback(real);
        }

        public android.hardware.Camera.PreviewCallback unwrap() {
            return real;
        }

        public void onPreviewFrame(byte[] arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            real.onPreviewFrame(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class ShutterCallback {
        private final android.hardware.Camera.ShutterCallback real;

        public ShutterCallback(android.hardware.Camera.ShutterCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback wrap(android.hardware.Camera.ShutterCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback(real);
        }

        public android.hardware.Camera.ShutterCallback unwrap() {
            return real;
        }

        public void onShutter() {
            real.onShutter();
        }

    }
}
