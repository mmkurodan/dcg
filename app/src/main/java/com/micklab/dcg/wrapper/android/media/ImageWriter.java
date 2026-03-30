// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ImageWriter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImageWriter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ImageWriter wrap(android.media.ImageWriter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageWriter(real, (__DcgwBridgeToken) null);
    }

    public android.media.ImageWriter getReal() {
        return (android.media.ImageWriter) real;
    }

    public android.media.ImageWriter unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.ImageWriter) real).close();
    }

    public com.micklab.dcg.wrapper.android.media.Image dequeueInputImage() {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(((android.media.ImageWriter) real).dequeueInputImage());
    }

    public int getDataSpace() {
        return ((android.media.ImageWriter) real).getDataSpace();
    }

    public int getFormat() {
        return ((android.media.ImageWriter) real).getFormat();
    }

    public int getHardwareBufferFormat() {
        return ((android.media.ImageWriter) real).getHardwareBufferFormat();
    }

    public int getHeight() {
        return ((android.media.ImageWriter) real).getHeight();
    }

    public int getMaxImages() {
        return ((android.media.ImageWriter) real).getMaxImages();
    }

    public long getUsage() {
        return ((android.media.ImageWriter) real).getUsage();
    }

    public int getWidth() {
        return ((android.media.ImageWriter) real).getWidth();
    }

    public static com.micklab.dcg.wrapper.android.media.ImageWriter newInstance(com.micklab.dcg.wrapper.android.view.Surface arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.ImageWriter.wrap(android.media.ImageWriter.newInstance(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.ImageWriter newInstance(com.micklab.dcg.wrapper.android.view.Surface arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.media.ImageWriter.wrap(android.media.ImageWriter.newInstance(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public void queueInputImage(com.micklab.dcg.wrapper.android.media.Image arg0) {
        ((android.media.ImageWriter) real).queueInputImage(arg0 == null ? null : arg0.getReal());
    }

    public void setOnImageReleasedListener(com.micklab.dcg.wrapper.android.media.ImageWriter.OnImageReleasedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.ImageWriter) real).setOnImageReleasedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageWriter.Builder wrap(android.media.ImageWriter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageWriter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.ImageWriter.Builder getReal() {
            return (android.media.ImageWriter.Builder) real;
        }

        public android.media.ImageWriter.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            this(new android.media.ImageWriter.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter build() {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.wrap(((android.media.ImageWriter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setDataSpace(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(((android.media.ImageWriter.Builder) real).setDataSpace(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setHardwareBufferFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(((android.media.ImageWriter.Builder) real).setHardwareBufferFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setImageFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(((android.media.ImageWriter.Builder) real).setImageFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setMaxImages(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(((android.media.ImageWriter.Builder) real).setMaxImages(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setUsage(long arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(((android.media.ImageWriter.Builder) real).setUsage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setWidthAndHeight(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(((android.media.ImageWriter.Builder) real).setWidthAndHeight(arg0, arg1));
        }

    }
    public static final class OnImageReleasedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnImageReleasedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageWriter.OnImageReleasedListener wrap(android.media.ImageWriter.OnImageReleasedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageWriter.OnImageReleasedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.ImageWriter.OnImageReleasedListener getReal() {
            return (android.media.ImageWriter.OnImageReleasedListener) real;
        }

        public android.media.ImageWriter.OnImageReleasedListener unwrap() {
            return getReal();
        }

        public void onImageReleased(com.micklab.dcg.wrapper.android.media.ImageWriter arg0) {
            ((android.media.ImageWriter.OnImageReleasedListener) real).onImageReleased(arg0 == null ? null : arg0.getReal());
        }

    }
}
