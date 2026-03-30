// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class Camera {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Camera(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.Camera wrap(android.hardware.Camera real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.Camera getReal() {
        return (android.hardware.Camera) real;
    }

    public android.hardware.Camera unwrap() {
        return getReal();
    }

    public void addCallbackBuffer(byte[] arg0) {
        ((android.hardware.Camera) real).addCallbackBuffer(arg0);
    }

    public void autoFocus(com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusCallback arg0) {
        ((android.hardware.Camera) real).autoFocus(arg0 == null ? null : arg0.getReal());
    }

    public void cancelAutoFocus() {
        ((android.hardware.Camera) real).cancelAutoFocus();
    }

    public boolean enableShutterSound(boolean arg0) {
        return ((android.hardware.Camera) real).enableShutterSound(arg0);
    }

    public static void getCameraInfo(int arg0, com.micklab.dcg.wrapper.android.hardware.Camera.CameraInfo arg1) {
        android.hardware.Camera.getCameraInfo(arg0, arg1 == null ? null : arg1.getReal());
    }

    public static int getNumberOfCameras() {
        return android.hardware.Camera.getNumberOfCameras();
    }

    public android.hardware.Camera.Parameters getParameters() {
        return ((android.hardware.Camera) real).getParameters();
    }

    public void lock() {
        ((android.hardware.Camera) real).lock();
    }

    public static com.micklab.dcg.wrapper.android.hardware.Camera open() {
        return com.micklab.dcg.wrapper.android.hardware.Camera.wrap(android.hardware.Camera.open());
    }

    public static com.micklab.dcg.wrapper.android.hardware.Camera open(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.Camera.wrap(android.hardware.Camera.open(arg0));
    }

    public void reconnect() throws java.io.IOException {
        ((android.hardware.Camera) real).reconnect();
    }

    public void release() {
        ((android.hardware.Camera) real).release();
    }

    public void setAutoFocusMoveCallback(com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusMoveCallback arg0) {
        ((android.hardware.Camera) real).setAutoFocusMoveCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setDisplayOrientation(int arg0) {
        ((android.hardware.Camera) real).setDisplayOrientation(arg0);
    }

    public void setErrorCallback(com.micklab.dcg.wrapper.android.hardware.Camera.ErrorCallback arg0) {
        ((android.hardware.Camera) real).setErrorCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setFaceDetectionListener(com.micklab.dcg.wrapper.android.hardware.Camera.FaceDetectionListener arg0) {
        ((android.hardware.Camera) real).setFaceDetectionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOneShotPreviewCallback(com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback arg0) {
        ((android.hardware.Camera) real).setOneShotPreviewCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setParameters(android.hardware.Camera.Parameters arg0) {
        ((android.hardware.Camera) real).setParameters(arg0);
    }

    public void setPreviewCallback(com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback arg0) {
        ((android.hardware.Camera) real).setPreviewCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setPreviewCallbackWithBuffer(com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback arg0) {
        ((android.hardware.Camera) real).setPreviewCallbackWithBuffer(arg0 == null ? null : arg0.getReal());
    }

    public void setPreviewDisplay(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) throws java.io.IOException {
        ((android.hardware.Camera) real).setPreviewDisplay(arg0 == null ? null : arg0.getReal());
    }

    public void setPreviewTexture(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) throws java.io.IOException {
        ((android.hardware.Camera) real).setPreviewTexture(arg0 == null ? null : arg0.getReal());
    }

    public void setZoomChangeListener(com.micklab.dcg.wrapper.android.hardware.Camera.OnZoomChangeListener arg0) {
        ((android.hardware.Camera) real).setZoomChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void startFaceDetection() {
        ((android.hardware.Camera) real).startFaceDetection();
    }

    public void startPreview() {
        ((android.hardware.Camera) real).startPreview();
    }

    public void startSmoothZoom(int arg0) {
        ((android.hardware.Camera) real).startSmoothZoom(arg0);
    }

    public void stopFaceDetection() {
        ((android.hardware.Camera) real).stopFaceDetection();
    }

    public void stopPreview() {
        ((android.hardware.Camera) real).stopPreview();
    }

    public void stopSmoothZoom() {
        ((android.hardware.Camera) real).stopSmoothZoom();
    }

    public void takePicture(com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback arg0, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg1, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg2) {
        ((android.hardware.Camera) real).takePicture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void takePicture(com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback arg0, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg1, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg2, com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback arg3) {
        ((android.hardware.Camera) real).takePicture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void unlock() {
        ((android.hardware.Camera) real).unlock();
    }

    public static final java.lang.String ACTION_NEW_PICTURE = android.hardware.Camera.ACTION_NEW_PICTURE;
    public static final java.lang.String ACTION_NEW_VIDEO = android.hardware.Camera.ACTION_NEW_VIDEO;
    public static final int CAMERA_ERROR_EVICTED = android.hardware.Camera.CAMERA_ERROR_EVICTED;
    public static final int CAMERA_ERROR_SERVER_DIED = android.hardware.Camera.CAMERA_ERROR_SERVER_DIED;
    public static final int CAMERA_ERROR_UNKNOWN = android.hardware.Camera.CAMERA_ERROR_UNKNOWN;

    public static final class Area {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Area(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.Area wrap(android.hardware.Camera.Area real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.Area(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.Area getReal() {
            return (android.hardware.Camera.Area) real;
        }

        public android.hardware.Camera.Area unwrap() {
            return getReal();
        }

        public Area(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1) {
            this(new android.hardware.Camera.Area(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.Camera.Area) real).equals(arg0);
        }


    }
    public static final class AutoFocusCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutoFocusCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusCallback wrap(android.hardware.Camera.AutoFocusCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.AutoFocusCallback getReal() {
            return (android.hardware.Camera.AutoFocusCallback) real;
        }

        public android.hardware.Camera.AutoFocusCallback unwrap() {
            return getReal();
        }

        public void onAutoFocus(boolean arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            ((android.hardware.Camera.AutoFocusCallback) real).onAutoFocus(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class AutoFocusMoveCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AutoFocusMoveCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusMoveCallback wrap(android.hardware.Camera.AutoFocusMoveCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.AutoFocusMoveCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.AutoFocusMoveCallback getReal() {
            return (android.hardware.Camera.AutoFocusMoveCallback) real;
        }

        public android.hardware.Camera.AutoFocusMoveCallback unwrap() {
            return getReal();
        }

        public void onAutoFocusMoving(boolean arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            ((android.hardware.Camera.AutoFocusMoveCallback) real).onAutoFocusMoving(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class CameraInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CameraInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.CameraInfo wrap(android.hardware.Camera.CameraInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.CameraInfo(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.CameraInfo getReal() {
            return (android.hardware.Camera.CameraInfo) real;
        }

        public android.hardware.Camera.CameraInfo unwrap() {
            return getReal();
        }

        public CameraInfo() {
            this(new android.hardware.Camera.CameraInfo(), (__DcgwBridgeToken) null);
        }

        public static final int CAMERA_FACING_BACK = android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK;
        public static final int CAMERA_FACING_FRONT = android.hardware.Camera.CameraInfo.CAMERA_FACING_FRONT;

    }
    public static final class ErrorCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ErrorCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.ErrorCallback wrap(android.hardware.Camera.ErrorCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.ErrorCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.ErrorCallback getReal() {
            return (android.hardware.Camera.ErrorCallback) real;
        }

        public android.hardware.Camera.ErrorCallback unwrap() {
            return getReal();
        }

        public void onError(int arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            ((android.hardware.Camera.ErrorCallback) real).onError(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class Face {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Face(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.Face wrap(android.hardware.Camera.Face real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.Face(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.Face getReal() {
            return (android.hardware.Camera.Face) real;
        }

        public android.hardware.Camera.Face unwrap() {
            return getReal();
        }

        public Face() {
            this(new android.hardware.Camera.Face(), (__DcgwBridgeToken) null);
        }


    }
    public static final class FaceDetectionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FaceDetectionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.FaceDetectionListener wrap(android.hardware.Camera.FaceDetectionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.FaceDetectionListener(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.FaceDetectionListener getReal() {
            return (android.hardware.Camera.FaceDetectionListener) real;
        }

        public android.hardware.Camera.FaceDetectionListener unwrap() {
            return getReal();
        }

        public void onFaceDetection(android.hardware.Camera.Face[] arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            ((android.hardware.Camera.FaceDetectionListener) real).onFaceDetection(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnZoomChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnZoomChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.OnZoomChangeListener wrap(android.hardware.Camera.OnZoomChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.OnZoomChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.OnZoomChangeListener getReal() {
            return (android.hardware.Camera.OnZoomChangeListener) real;
        }

        public android.hardware.Camera.OnZoomChangeListener unwrap() {
            return getReal();
        }

        public void onZoomChange(int arg0, boolean arg1, com.micklab.dcg.wrapper.android.hardware.Camera arg2) {
            ((android.hardware.Camera.OnZoomChangeListener) real).onZoomChange(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class PictureCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PictureCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback wrap(android.hardware.Camera.PictureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.PictureCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.PictureCallback getReal() {
            return (android.hardware.Camera.PictureCallback) real;
        }

        public android.hardware.Camera.PictureCallback unwrap() {
            return getReal();
        }

        public void onPictureTaken(byte[] arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            ((android.hardware.Camera.PictureCallback) real).onPictureTaken(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class PreviewCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PreviewCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback wrap(android.hardware.Camera.PreviewCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.PreviewCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.PreviewCallback getReal() {
            return (android.hardware.Camera.PreviewCallback) real;
        }

        public android.hardware.Camera.PreviewCallback unwrap() {
            return getReal();
        }

        public void onPreviewFrame(byte[] arg0, com.micklab.dcg.wrapper.android.hardware.Camera arg1) {
            ((android.hardware.Camera.PreviewCallback) real).onPreviewFrame(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class ShutterCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ShutterCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback wrap(android.hardware.Camera.ShutterCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.ShutterCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.ShutterCallback getReal() {
            return (android.hardware.Camera.ShutterCallback) real;
        }

        public android.hardware.Camera.ShutterCallback unwrap() {
            return getReal();
        }

        public void onShutter() {
            ((android.hardware.Camera.ShutterCallback) real).onShutter();
        }

    }
}
