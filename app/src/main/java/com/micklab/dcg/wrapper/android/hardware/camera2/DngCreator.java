// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class DngCreator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DngCreator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator wrap(android.hardware.camera2.DngCreator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.DngCreator getReal() {
        return (android.hardware.camera2.DngCreator) real;
    }

    public android.hardware.camera2.DngCreator unwrap() {
        return getReal();
    }

    public DngCreator(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult arg1) {
        this(new android.hardware.camera2.DngCreator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.hardware.camera2.DngCreator) real).close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setDescription(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(((android.hardware.camera2.DngCreator) real).setDescription(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setLocation(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(((android.hardware.camera2.DngCreator) real).setLocation(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setOrientation(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(((android.hardware.camera2.DngCreator) real).setOrientation(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setThumbnail(com.micklab.dcg.wrapper.android.media.Image arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(((android.hardware.camera2.DngCreator) real).setThumbnail(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setThumbnail(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(((android.hardware.camera2.DngCreator) real).setThumbnail(arg0 == null ? null : arg0.getReal()));
    }

    public void writeByteBuffer(java.io.OutputStream arg0, com.micklab.dcg.wrapper.android.util.Size arg1, java.nio.ByteBuffer arg2, long arg3) throws java.io.IOException {
        ((android.hardware.camera2.DngCreator) real).writeByteBuffer(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void writeImage(java.io.OutputStream arg0, com.micklab.dcg.wrapper.android.media.Image arg1) throws java.io.IOException {
        ((android.hardware.camera2.DngCreator) real).writeImage(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void writeInputStream(java.io.OutputStream arg0, com.micklab.dcg.wrapper.android.util.Size arg1, java.io.InputStream arg2, long arg3) throws java.io.IOException {
        ((android.hardware.camera2.DngCreator) real).writeInputStream(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public static final int MAX_THUMBNAIL_DIMENSION = android.hardware.camera2.DngCreator.MAX_THUMBNAIL_DIMENSION;

}
