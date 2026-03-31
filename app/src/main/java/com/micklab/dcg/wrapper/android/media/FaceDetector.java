// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class FaceDetector {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FaceDetector(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.FaceDetector wrap(android.media.FaceDetector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.FaceDetector(real, (__DcgwBridgeToken) null);
    }

    public android.media.FaceDetector getReal() {
        return (android.media.FaceDetector) real;
    }

    public android.media.FaceDetector unwrap() {
        return getReal();
    }

    public FaceDetector(int arg0, int arg1, int arg2) {
        this(new android.media.FaceDetector(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int findFaces(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, android.media.FaceDetector.Face[] arg1) {
        return ((android.media.FaceDetector) real).findFaces(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final class Face {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Face(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.FaceDetector.Face wrap(android.media.FaceDetector.Face real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.FaceDetector.Face(real, (__DcgwBridgeToken) null);
        }

        public android.media.FaceDetector.Face getReal() {
            return (android.media.FaceDetector.Face) real;
        }

        public android.media.FaceDetector.Face unwrap() {
            return getReal();
        }

        public float confidence() {
            return ((android.media.FaceDetector.Face) real).confidence();
        }

        public float eyesDistance() {
            return ((android.media.FaceDetector.Face) real).eyesDistance();
        }

        public void getMidPoint(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
            ((android.media.FaceDetector.Face) real).getMidPoint(arg0 == null ? null : arg0.getReal());
        }

        public float pose(int arg0) {
            return ((android.media.FaceDetector.Face) real).pose(arg0);
        }

        public static final float CONFIDENCE_THRESHOLD = android.media.FaceDetector.Face.CONFIDENCE_THRESHOLD;
        public static final int EULER_X = android.media.FaceDetector.Face.EULER_X;
        public static final int EULER_Y = android.media.FaceDetector.Face.EULER_Y;
        public static final int EULER_Z = android.media.FaceDetector.Face.EULER_Z;

    }
}
