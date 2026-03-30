// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class FaceDetector {
    private final android.media.FaceDetector real;

    public FaceDetector(android.media.FaceDetector real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.FaceDetector wrap(android.media.FaceDetector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.FaceDetector(real);
    }

    public android.media.FaceDetector unwrap() {
        return real;
    }

    public FaceDetector(int arg0, int arg1, int arg2) {
        this(new android.media.FaceDetector(arg0, arg1, arg2));
    }

    public int findFaces(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, android.media.FaceDetector.Face[] arg1) {
        return real.findFaces(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
