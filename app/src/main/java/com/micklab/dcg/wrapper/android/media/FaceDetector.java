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

}
