// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ImageWriter {
    private final android.media.ImageWriter real;

    public ImageWriter(android.media.ImageWriter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ImageWriter wrap(android.media.ImageWriter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageWriter(real);
    }

    public android.media.ImageWriter unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.media.Image dequeueInputImage() {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(real.dequeueInputImage());
    }

    public int getDataSpace() {
        return real.getDataSpace();
    }

    public int getFormat() {
        return real.getFormat();
    }

    public int getHardwareBufferFormat() {
        return real.getHardwareBufferFormat();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getMaxImages() {
        return real.getMaxImages();
    }

    public long getUsage() {
        return real.getUsage();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public static com.micklab.dcg.wrapper.android.media.ImageWriter newInstance(com.micklab.dcg.wrapper.android.view.Surface arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.ImageWriter.wrap(android.media.ImageWriter.newInstance(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.ImageWriter newInstance(com.micklab.dcg.wrapper.android.view.Surface arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.media.ImageWriter.wrap(android.media.ImageWriter.newInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public void queueInputImage(com.micklab.dcg.wrapper.android.media.Image arg0) {
        real.queueInputImage(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnImageReleasedListener(com.micklab.dcg.wrapper.android.media.ImageWriter.OnImageReleasedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnImageReleasedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class Builder {
        private final android.media.ImageWriter.Builder real;

        public Builder(android.media.ImageWriter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageWriter.Builder wrap(android.media.ImageWriter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageWriter.Builder(real);
        }

        public android.media.ImageWriter.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            this(new android.media.ImageWriter.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter build() {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setDataSpace(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(real.setDataSpace(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setHardwareBufferFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(real.setHardwareBufferFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setImageFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(real.setImageFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setMaxImages(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(real.setMaxImages(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setUsage(long arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(real.setUsage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageWriter.Builder setWidthAndHeight(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.media.ImageWriter.Builder.wrap(real.setWidthAndHeight(arg0, arg1));
        }

    }
    public static final class OnImageReleasedListener {
        private final android.media.ImageWriter.OnImageReleasedListener real;

        public OnImageReleasedListener(android.media.ImageWriter.OnImageReleasedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageWriter.OnImageReleasedListener wrap(android.media.ImageWriter.OnImageReleasedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageWriter.OnImageReleasedListener(real);
        }

        public android.media.ImageWriter.OnImageReleasedListener unwrap() {
            return real;
        }

        public void onImageReleased(com.micklab.dcg.wrapper.android.media.ImageWriter arg0) {
            real.onImageReleased(arg0 == null ? null : arg0.unwrap());
        }

    }
}
