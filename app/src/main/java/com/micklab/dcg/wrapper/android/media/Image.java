// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Image {
    private final android.media.Image real;

    public Image(android.media.Image real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Image wrap(android.media.Image real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Image(real);
    }

    public android.media.Image unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getCropRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getCropRect());
    }

    public int getDataSpace() {
        return real.getDataSpace();
    }

    public com.micklab.dcg.wrapper.android.hardware.SyncFence getFence() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(real.getFence());
    }

    public int getFormat() {
        return real.getFormat();
    }

    public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
        return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(real.getHardwareBuffer());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public android.media.Image.Plane[] getPlanes() {
        return real.getPlanes();
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public void setCropRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setCropRect(arg0 == null ? null : arg0.unwrap());
    }

    public void setDataSpace(int arg0) {
        real.setDataSpace(arg0);
    }

    public void setFence(com.micklab.dcg.wrapper.android.hardware.SyncFence arg0) throws java.io.IOException {
        real.setFence(arg0 == null ? null : arg0.unwrap());
    }

    public void setTimestamp(long arg0) {
        real.setTimestamp(arg0);
    }

    public static final class Plane {
        private final android.media.Image.Plane real;

        public Plane(android.media.Image.Plane real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Image.Plane wrap(android.media.Image.Plane real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Image.Plane(real);
        }

        public android.media.Image.Plane unwrap() {
            return real;
        }

        public java.nio.ByteBuffer getBuffer() {
            return real.getBuffer();
        }

        public int getPixelStride() {
            return real.getPixelStride();
        }

        public int getRowStride() {
            return real.getRowStride();
        }

    }
}
