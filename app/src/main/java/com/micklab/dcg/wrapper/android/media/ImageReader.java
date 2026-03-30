// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ImageReader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImageReader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ImageReader wrap(android.media.ImageReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageReader(real, (__DcgwBridgeToken) null);
    }

    public android.media.ImageReader getReal() {
        return (android.media.ImageReader) real;
    }

    public android.media.ImageReader unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.Image acquireLatestImage() {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(((android.media.ImageReader) real).acquireLatestImage());
    }

    public com.micklab.dcg.wrapper.android.media.Image acquireNextImage() {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(((android.media.ImageReader) real).acquireNextImage());
    }

    public void close() {
        ((android.media.ImageReader) real).close();
    }

    public void discardFreeBuffers() {
        ((android.media.ImageReader) real).discardFreeBuffers();
    }

    public int getDataSpace() {
        return ((android.media.ImageReader) real).getDataSpace();
    }

    public int getHardwareBufferFormat() {
        return ((android.media.ImageReader) real).getHardwareBufferFormat();
    }

    public int getHeight() {
        return ((android.media.ImageReader) real).getHeight();
    }

    public int getImageFormat() {
        return ((android.media.ImageReader) real).getImageFormat();
    }

    public int getMaxImages() {
        return ((android.media.ImageReader) real).getMaxImages();
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.media.ImageReader) real).getSurface());
    }

    public long getUsage() {
        return ((android.media.ImageReader) real).getUsage();
    }

    public int getWidth() {
        return ((android.media.ImageReader) real).getWidth();
    }

    public static com.micklab.dcg.wrapper.android.media.ImageReader newInstance(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.media.ImageReader.wrap(android.media.ImageReader.newInstance(arg0, arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.media.ImageReader newInstance(int arg0, int arg1, int arg2, int arg3, long arg4) {
        return com.micklab.dcg.wrapper.android.media.ImageReader.wrap(android.media.ImageReader.newInstance(arg0, arg1, arg2, arg3, arg4));
    }

    public void setOnImageAvailableListener(com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.ImageReader) real).setOnImageAvailableListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageReader.Builder wrap(android.media.ImageReader.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageReader.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.ImageReader.Builder getReal() {
            return (android.media.ImageReader.Builder) real;
        }

        public android.media.ImageReader.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1) {
            this(new android.media.ImageReader.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader build() {
            return com.micklab.dcg.wrapper.android.media.ImageReader.wrap(((android.media.ImageReader.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setDefaultDataSpace(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(((android.media.ImageReader.Builder) real).setDefaultDataSpace(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setDefaultHardwareBufferFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(((android.media.ImageReader.Builder) real).setDefaultHardwareBufferFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setImageFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(((android.media.ImageReader.Builder) real).setImageFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setMaxImages(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(((android.media.ImageReader.Builder) real).setMaxImages(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setUsage(long arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(((android.media.ImageReader.Builder) real).setUsage(arg0));
        }

    }
    public static final class OnImageAvailableListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnImageAvailableListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener wrap(android.media.ImageReader.OnImageAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.ImageReader.OnImageAvailableListener getReal() {
            return (android.media.ImageReader.OnImageAvailableListener) real;
        }

        public android.media.ImageReader.OnImageAvailableListener unwrap() {
            return getReal();
        }

        public void onImageAvailable(com.micklab.dcg.wrapper.android.media.ImageReader arg0) {
            ((android.media.ImageReader.OnImageAvailableListener) real).onImageAvailable(arg0 == null ? null : arg0.getReal());
        }

    }
}
