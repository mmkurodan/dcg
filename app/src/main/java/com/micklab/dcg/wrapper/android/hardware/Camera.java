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

    public com.micklab.dcg.wrapper.android.hardware.Camera.Parameters getParameters() {
        return com.micklab.dcg.wrapper.android.hardware.Camera.Parameters.wrap(((android.hardware.Camera) real).getParameters());
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

    public void setParameters(com.micklab.dcg.wrapper.android.hardware.Camera.Parameters arg0) {
        ((android.hardware.Camera) real).setParameters(arg0 == null ? null : arg0.getReal());
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
    public static final class Parameters {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Parameters(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.Parameters wrap(android.hardware.Camera.Parameters real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.Parameters(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.Parameters getReal() {
            return (android.hardware.Camera.Parameters) real;
        }

        public android.hardware.Camera.Parameters unwrap() {
            return getReal();
        }

        public java.lang.String flatten() {
            return ((android.hardware.Camera.Parameters) real).flatten();
        }

        public java.lang.String get(java.lang.String arg0) {
            return ((android.hardware.Camera.Parameters) real).get(arg0);
        }

        public java.lang.String getAntibanding() {
            return ((android.hardware.Camera.Parameters) real).getAntibanding();
        }

        public boolean getAutoExposureLock() {
            return ((android.hardware.Camera.Parameters) real).getAutoExposureLock();
        }

        public boolean getAutoWhiteBalanceLock() {
            return ((android.hardware.Camera.Parameters) real).getAutoWhiteBalanceLock();
        }

        public java.lang.String getColorEffect() {
            return ((android.hardware.Camera.Parameters) real).getColorEffect();
        }

        public int getExposureCompensation() {
            return ((android.hardware.Camera.Parameters) real).getExposureCompensation();
        }

        public float getExposureCompensationStep() {
            return ((android.hardware.Camera.Parameters) real).getExposureCompensationStep();
        }

        public java.lang.String getFlashMode() {
            return ((android.hardware.Camera.Parameters) real).getFlashMode();
        }

        public float getFocalLength() {
            return ((android.hardware.Camera.Parameters) real).getFocalLength();
        }

        public void getFocusDistances(float[] arg0) {
            ((android.hardware.Camera.Parameters) real).getFocusDistances(arg0);
        }

        public java.lang.String getFocusMode() {
            return ((android.hardware.Camera.Parameters) real).getFocusMode();
        }

        public float getHorizontalViewAngle() {
            return ((android.hardware.Camera.Parameters) real).getHorizontalViewAngle();
        }

        public int getInt(java.lang.String arg0) {
            return ((android.hardware.Camera.Parameters) real).getInt(arg0);
        }

        public int getJpegQuality() {
            return ((android.hardware.Camera.Parameters) real).getJpegQuality();
        }

        public int getJpegThumbnailQuality() {
            return ((android.hardware.Camera.Parameters) real).getJpegThumbnailQuality();
        }

        public com.micklab.dcg.wrapper.android.hardware.Camera.Size getJpegThumbnailSize() {
            return com.micklab.dcg.wrapper.android.hardware.Camera.Size.wrap(((android.hardware.Camera.Parameters) real).getJpegThumbnailSize());
        }

        public int getMaxExposureCompensation() {
            return ((android.hardware.Camera.Parameters) real).getMaxExposureCompensation();
        }

        public int getMaxNumDetectedFaces() {
            return ((android.hardware.Camera.Parameters) real).getMaxNumDetectedFaces();
        }

        public int getMaxNumFocusAreas() {
            return ((android.hardware.Camera.Parameters) real).getMaxNumFocusAreas();
        }

        public int getMaxNumMeteringAreas() {
            return ((android.hardware.Camera.Parameters) real).getMaxNumMeteringAreas();
        }

        public int getMaxZoom() {
            return ((android.hardware.Camera.Parameters) real).getMaxZoom();
        }

        public int getMinExposureCompensation() {
            return ((android.hardware.Camera.Parameters) real).getMinExposureCompensation();
        }

        public int getPictureFormat() {
            return ((android.hardware.Camera.Parameters) real).getPictureFormat();
        }

        public com.micklab.dcg.wrapper.android.hardware.Camera.Size getPictureSize() {
            return com.micklab.dcg.wrapper.android.hardware.Camera.Size.wrap(((android.hardware.Camera.Parameters) real).getPictureSize());
        }

        public com.micklab.dcg.wrapper.android.hardware.Camera.Size getPreferredPreviewSizeForVideo() {
            return com.micklab.dcg.wrapper.android.hardware.Camera.Size.wrap(((android.hardware.Camera.Parameters) real).getPreferredPreviewSizeForVideo());
        }

        public int getPreviewFormat() {
            return ((android.hardware.Camera.Parameters) real).getPreviewFormat();
        }

        public void getPreviewFpsRange(int[] arg0) {
            ((android.hardware.Camera.Parameters) real).getPreviewFpsRange(arg0);
        }

        public int getPreviewFrameRate() {
            return ((android.hardware.Camera.Parameters) real).getPreviewFrameRate();
        }

        public com.micklab.dcg.wrapper.android.hardware.Camera.Size getPreviewSize() {
            return com.micklab.dcg.wrapper.android.hardware.Camera.Size.wrap(((android.hardware.Camera.Parameters) real).getPreviewSize());
        }

        public java.lang.String getSceneMode() {
            return ((android.hardware.Camera.Parameters) real).getSceneMode();
        }

        public float getVerticalViewAngle() {
            return ((android.hardware.Camera.Parameters) real).getVerticalViewAngle();
        }

        public boolean getVideoStabilization() {
            return ((android.hardware.Camera.Parameters) real).getVideoStabilization();
        }

        public java.lang.String getWhiteBalance() {
            return ((android.hardware.Camera.Parameters) real).getWhiteBalance();
        }

        public int getZoom() {
            return ((android.hardware.Camera.Parameters) real).getZoom();
        }

        public boolean isAutoExposureLockSupported() {
            return ((android.hardware.Camera.Parameters) real).isAutoExposureLockSupported();
        }

        public boolean isAutoWhiteBalanceLockSupported() {
            return ((android.hardware.Camera.Parameters) real).isAutoWhiteBalanceLockSupported();
        }

        public boolean isSmoothZoomSupported() {
            return ((android.hardware.Camera.Parameters) real).isSmoothZoomSupported();
        }

        public boolean isVideoSnapshotSupported() {
            return ((android.hardware.Camera.Parameters) real).isVideoSnapshotSupported();
        }

        public boolean isVideoStabilizationSupported() {
            return ((android.hardware.Camera.Parameters) real).isVideoStabilizationSupported();
        }

        public boolean isZoomSupported() {
            return ((android.hardware.Camera.Parameters) real).isZoomSupported();
        }

        public void remove(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).remove(arg0);
        }

        public void removeGpsData() {
            ((android.hardware.Camera.Parameters) real).removeGpsData();
        }

        public void set(java.lang.String arg0, int arg1) {
            ((android.hardware.Camera.Parameters) real).set(arg0, arg1);
        }

        public void set(java.lang.String arg0, java.lang.String arg1) {
            ((android.hardware.Camera.Parameters) real).set(arg0, arg1);
        }

        public void setAntibanding(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setAntibanding(arg0);
        }

        public void setAutoExposureLock(boolean arg0) {
            ((android.hardware.Camera.Parameters) real).setAutoExposureLock(arg0);
        }

        public void setAutoWhiteBalanceLock(boolean arg0) {
            ((android.hardware.Camera.Parameters) real).setAutoWhiteBalanceLock(arg0);
        }

        public void setColorEffect(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setColorEffect(arg0);
        }

        public void setExposureCompensation(int arg0) {
            ((android.hardware.Camera.Parameters) real).setExposureCompensation(arg0);
        }

        public void setFlashMode(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setFlashMode(arg0);
        }

        public void setFocusMode(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setFocusMode(arg0);
        }

        public void setGpsAltitude(double arg0) {
            ((android.hardware.Camera.Parameters) real).setGpsAltitude(arg0);
        }

        public void setGpsLatitude(double arg0) {
            ((android.hardware.Camera.Parameters) real).setGpsLatitude(arg0);
        }

        public void setGpsLongitude(double arg0) {
            ((android.hardware.Camera.Parameters) real).setGpsLongitude(arg0);
        }

        public void setGpsProcessingMethod(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setGpsProcessingMethod(arg0);
        }

        public void setGpsTimestamp(long arg0) {
            ((android.hardware.Camera.Parameters) real).setGpsTimestamp(arg0);
        }

        public void setJpegQuality(int arg0) {
            ((android.hardware.Camera.Parameters) real).setJpegQuality(arg0);
        }

        public void setJpegThumbnailQuality(int arg0) {
            ((android.hardware.Camera.Parameters) real).setJpegThumbnailQuality(arg0);
        }

        public void setJpegThumbnailSize(int arg0, int arg1) {
            ((android.hardware.Camera.Parameters) real).setJpegThumbnailSize(arg0, arg1);
        }

        public void setPictureFormat(int arg0) {
            ((android.hardware.Camera.Parameters) real).setPictureFormat(arg0);
        }

        public void setPictureSize(int arg0, int arg1) {
            ((android.hardware.Camera.Parameters) real).setPictureSize(arg0, arg1);
        }

        public void setPreviewFormat(int arg0) {
            ((android.hardware.Camera.Parameters) real).setPreviewFormat(arg0);
        }

        public void setPreviewFpsRange(int arg0, int arg1) {
            ((android.hardware.Camera.Parameters) real).setPreviewFpsRange(arg0, arg1);
        }

        public void setPreviewFrameRate(int arg0) {
            ((android.hardware.Camera.Parameters) real).setPreviewFrameRate(arg0);
        }

        public void setPreviewSize(int arg0, int arg1) {
            ((android.hardware.Camera.Parameters) real).setPreviewSize(arg0, arg1);
        }

        public void setRecordingHint(boolean arg0) {
            ((android.hardware.Camera.Parameters) real).setRecordingHint(arg0);
        }

        public void setRotation(int arg0) {
            ((android.hardware.Camera.Parameters) real).setRotation(arg0);
        }

        public void setSceneMode(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setSceneMode(arg0);
        }

        public void setVideoStabilization(boolean arg0) {
            ((android.hardware.Camera.Parameters) real).setVideoStabilization(arg0);
        }

        public void setWhiteBalance(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).setWhiteBalance(arg0);
        }

        public void setZoom(int arg0) {
            ((android.hardware.Camera.Parameters) real).setZoom(arg0);
        }

        public void unflatten(java.lang.String arg0) {
            ((android.hardware.Camera.Parameters) real).unflatten(arg0);
        }

        public static final java.lang.String ANTIBANDING_50HZ = android.hardware.Camera.Parameters.ANTIBANDING_50HZ;
        public static final java.lang.String ANTIBANDING_60HZ = android.hardware.Camera.Parameters.ANTIBANDING_60HZ;
        public static final java.lang.String ANTIBANDING_AUTO = android.hardware.Camera.Parameters.ANTIBANDING_AUTO;
        public static final java.lang.String ANTIBANDING_OFF = android.hardware.Camera.Parameters.ANTIBANDING_OFF;
        public static final java.lang.String EFFECT_AQUA = android.hardware.Camera.Parameters.EFFECT_AQUA;
        public static final java.lang.String EFFECT_BLACKBOARD = android.hardware.Camera.Parameters.EFFECT_BLACKBOARD;
        public static final java.lang.String EFFECT_MONO = android.hardware.Camera.Parameters.EFFECT_MONO;
        public static final java.lang.String EFFECT_NEGATIVE = android.hardware.Camera.Parameters.EFFECT_NEGATIVE;
        public static final java.lang.String EFFECT_NONE = android.hardware.Camera.Parameters.EFFECT_NONE;
        public static final java.lang.String EFFECT_POSTERIZE = android.hardware.Camera.Parameters.EFFECT_POSTERIZE;
        public static final java.lang.String EFFECT_SEPIA = android.hardware.Camera.Parameters.EFFECT_SEPIA;
        public static final java.lang.String EFFECT_SOLARIZE = android.hardware.Camera.Parameters.EFFECT_SOLARIZE;
        public static final java.lang.String EFFECT_WHITEBOARD = android.hardware.Camera.Parameters.EFFECT_WHITEBOARD;
        public static final java.lang.String FLASH_MODE_AUTO = android.hardware.Camera.Parameters.FLASH_MODE_AUTO;
        public static final java.lang.String FLASH_MODE_OFF = android.hardware.Camera.Parameters.FLASH_MODE_OFF;
        public static final java.lang.String FLASH_MODE_ON = android.hardware.Camera.Parameters.FLASH_MODE_ON;
        public static final java.lang.String FLASH_MODE_RED_EYE = android.hardware.Camera.Parameters.FLASH_MODE_RED_EYE;
        public static final java.lang.String FLASH_MODE_TORCH = android.hardware.Camera.Parameters.FLASH_MODE_TORCH;
        public static final int FOCUS_DISTANCE_FAR_INDEX = android.hardware.Camera.Parameters.FOCUS_DISTANCE_FAR_INDEX;
        public static final int FOCUS_DISTANCE_NEAR_INDEX = android.hardware.Camera.Parameters.FOCUS_DISTANCE_NEAR_INDEX;
        public static final int FOCUS_DISTANCE_OPTIMAL_INDEX = android.hardware.Camera.Parameters.FOCUS_DISTANCE_OPTIMAL_INDEX;
        public static final java.lang.String FOCUS_MODE_AUTO = android.hardware.Camera.Parameters.FOCUS_MODE_AUTO;
        public static final java.lang.String FOCUS_MODE_CONTINUOUS_PICTURE = android.hardware.Camera.Parameters.FOCUS_MODE_CONTINUOUS_PICTURE;
        public static final java.lang.String FOCUS_MODE_CONTINUOUS_VIDEO = android.hardware.Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO;
        public static final java.lang.String FOCUS_MODE_EDOF = android.hardware.Camera.Parameters.FOCUS_MODE_EDOF;
        public static final java.lang.String FOCUS_MODE_FIXED = android.hardware.Camera.Parameters.FOCUS_MODE_FIXED;
        public static final java.lang.String FOCUS_MODE_INFINITY = android.hardware.Camera.Parameters.FOCUS_MODE_INFINITY;
        public static final java.lang.String FOCUS_MODE_MACRO = android.hardware.Camera.Parameters.FOCUS_MODE_MACRO;
        public static final int PREVIEW_FPS_MAX_INDEX = android.hardware.Camera.Parameters.PREVIEW_FPS_MAX_INDEX;
        public static final int PREVIEW_FPS_MIN_INDEX = android.hardware.Camera.Parameters.PREVIEW_FPS_MIN_INDEX;
        public static final java.lang.String SCENE_MODE_ACTION = android.hardware.Camera.Parameters.SCENE_MODE_ACTION;
        public static final java.lang.String SCENE_MODE_AUTO = android.hardware.Camera.Parameters.SCENE_MODE_AUTO;
        public static final java.lang.String SCENE_MODE_BARCODE = android.hardware.Camera.Parameters.SCENE_MODE_BARCODE;
        public static final java.lang.String SCENE_MODE_BEACH = android.hardware.Camera.Parameters.SCENE_MODE_BEACH;
        public static final java.lang.String SCENE_MODE_CANDLELIGHT = android.hardware.Camera.Parameters.SCENE_MODE_CANDLELIGHT;
        public static final java.lang.String SCENE_MODE_FIREWORKS = android.hardware.Camera.Parameters.SCENE_MODE_FIREWORKS;
        public static final java.lang.String SCENE_MODE_HDR = android.hardware.Camera.Parameters.SCENE_MODE_HDR;
        public static final java.lang.String SCENE_MODE_LANDSCAPE = android.hardware.Camera.Parameters.SCENE_MODE_LANDSCAPE;
        public static final java.lang.String SCENE_MODE_NIGHT = android.hardware.Camera.Parameters.SCENE_MODE_NIGHT;
        public static final java.lang.String SCENE_MODE_NIGHT_PORTRAIT = android.hardware.Camera.Parameters.SCENE_MODE_NIGHT_PORTRAIT;
        public static final java.lang.String SCENE_MODE_PARTY = android.hardware.Camera.Parameters.SCENE_MODE_PARTY;
        public static final java.lang.String SCENE_MODE_PORTRAIT = android.hardware.Camera.Parameters.SCENE_MODE_PORTRAIT;
        public static final java.lang.String SCENE_MODE_SNOW = android.hardware.Camera.Parameters.SCENE_MODE_SNOW;
        public static final java.lang.String SCENE_MODE_SPORTS = android.hardware.Camera.Parameters.SCENE_MODE_SPORTS;
        public static final java.lang.String SCENE_MODE_STEADYPHOTO = android.hardware.Camera.Parameters.SCENE_MODE_STEADYPHOTO;
        public static final java.lang.String SCENE_MODE_SUNSET = android.hardware.Camera.Parameters.SCENE_MODE_SUNSET;
        public static final java.lang.String SCENE_MODE_THEATRE = android.hardware.Camera.Parameters.SCENE_MODE_THEATRE;
        public static final java.lang.String WHITE_BALANCE_AUTO = android.hardware.Camera.Parameters.WHITE_BALANCE_AUTO;
        public static final java.lang.String WHITE_BALANCE_CLOUDY_DAYLIGHT = android.hardware.Camera.Parameters.WHITE_BALANCE_CLOUDY_DAYLIGHT;
        public static final java.lang.String WHITE_BALANCE_DAYLIGHT = android.hardware.Camera.Parameters.WHITE_BALANCE_DAYLIGHT;
        public static final java.lang.String WHITE_BALANCE_FLUORESCENT = android.hardware.Camera.Parameters.WHITE_BALANCE_FLUORESCENT;
        public static final java.lang.String WHITE_BALANCE_INCANDESCENT = android.hardware.Camera.Parameters.WHITE_BALANCE_INCANDESCENT;
        public static final java.lang.String WHITE_BALANCE_SHADE = android.hardware.Camera.Parameters.WHITE_BALANCE_SHADE;
        public static final java.lang.String WHITE_BALANCE_TWILIGHT = android.hardware.Camera.Parameters.WHITE_BALANCE_TWILIGHT;
        public static final java.lang.String WHITE_BALANCE_WARM_FLUORESCENT = android.hardware.Camera.Parameters.WHITE_BALANCE_WARM_FLUORESCENT;

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
    public static final class Size {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Size(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.Camera.Size wrap(android.hardware.Camera.Size real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Camera.Size(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.Camera.Size getReal() {
            return (android.hardware.Camera.Size) real;
        }

        public android.hardware.Camera.Size unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.Camera.Size) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.hardware.Camera.Size) real).hashCode();
        }


    }
}
