// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class DngCreator {
    private final android.hardware.camera2.DngCreator real;

    public DngCreator(android.hardware.camera2.DngCreator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator wrap(android.hardware.camera2.DngCreator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator(real);
    }

    public android.hardware.camera2.DngCreator unwrap() {
        return real;
    }

    public DngCreator(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult arg1) {
        this(new android.hardware.camera2.DngCreator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setDescription(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(real.setDescription(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setLocation(com.micklab.dcg.wrapper.android.location.Location arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(real.setLocation(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setOrientation(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(real.setOrientation(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setThumbnail(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(real.setThumbnail(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator setThumbnail(com.micklab.dcg.wrapper.android.media.Image arg0) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.DngCreator.wrap(real.setThumbnail(arg0 == null ? null : arg0.unwrap()));
    }

    public void writeByteBuffer(java.io.OutputStream arg0, com.micklab.dcg.wrapper.android.util.Size arg1, java.nio.ByteBuffer arg2, long arg3) throws java.io.IOException {
        real.writeByteBuffer(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void writeImage(java.io.OutputStream arg0, com.micklab.dcg.wrapper.android.media.Image arg1) throws java.io.IOException {
        real.writeImage(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void writeInputStream(java.io.OutputStream arg0, com.micklab.dcg.wrapper.android.util.Size arg1, java.io.InputStream arg2, long arg3) throws java.io.IOException {
        real.writeInputStream(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public static final int MAX_THUMBNAIL_DIMENSION = android.hardware.camera2.DngCreator.MAX_THUMBNAIL_DIMENSION;

}
