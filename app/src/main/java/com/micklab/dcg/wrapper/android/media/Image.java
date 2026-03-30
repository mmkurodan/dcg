// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Image {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Image(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Image wrap(android.media.Image real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Image(real, (__DcgwBridgeToken) null);
    }

    public android.media.Image getReal() {
        return (android.media.Image) real;
    }

    public android.media.Image unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.Image) real).close();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getCropRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.media.Image) real).getCropRect());
    }

    public int getDataSpace() {
        return ((android.media.Image) real).getDataSpace();
    }

    public com.micklab.dcg.wrapper.android.hardware.SyncFence getFence() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(((android.media.Image) real).getFence());
    }

    public int getFormat() {
        return ((android.media.Image) real).getFormat();
    }

    public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
        return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(((android.media.Image) real).getHardwareBuffer());
    }

    public int getHeight() {
        return ((android.media.Image) real).getHeight();
    }

    public android.media.Image.Plane[] getPlanes() {
        return ((android.media.Image) real).getPlanes();
    }

    public long getTimestamp() {
        return ((android.media.Image) real).getTimestamp();
    }

    public int getWidth() {
        return ((android.media.Image) real).getWidth();
    }

    public void setCropRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.media.Image) real).setCropRect(arg0 == null ? null : arg0.getReal());
    }

    public void setDataSpace(int arg0) {
        ((android.media.Image) real).setDataSpace(arg0);
    }

    public void setFence(com.micklab.dcg.wrapper.android.hardware.SyncFence arg0) throws java.io.IOException {
        ((android.media.Image) real).setFence(arg0 == null ? null : arg0.getReal());
    }

    public void setTimestamp(long arg0) {
        ((android.media.Image) real).setTimestamp(arg0);
    }

    public static final class Plane {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Plane(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Image.Plane wrap(android.media.Image.Plane real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Image.Plane(real, (__DcgwBridgeToken) null);
        }

        public android.media.Image.Plane getReal() {
            return (android.media.Image.Plane) real;
        }

        public android.media.Image.Plane unwrap() {
            return getReal();
        }

        public java.nio.ByteBuffer getBuffer() {
            return ((android.media.Image.Plane) real).getBuffer();
        }

        public int getPixelStride() {
            return ((android.media.Image.Plane) real).getPixelStride();
        }

        public int getRowStride() {
            return ((android.media.Image.Plane) real).getRowStride();
        }

    }
}
