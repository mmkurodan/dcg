// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class ImageReader {
    private final android.media.ImageReader real;

    public ImageReader(android.media.ImageReader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.ImageReader wrap(android.media.ImageReader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageReader(real);
    }

    public android.media.ImageReader unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.Image acquireLatestImage() {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(real.acquireLatestImage());
    }

    public com.micklab.dcg.wrapper.android.media.Image acquireNextImage() {
        return com.micklab.dcg.wrapper.android.media.Image.wrap(real.acquireNextImage());
    }

    public void close() {
        real.close();
    }

    public void discardFreeBuffers() {
        real.discardFreeBuffers();
    }

    public int getDataSpace() {
        return real.getDataSpace();
    }

    public int getHardwareBufferFormat() {
        return real.getHardwareBufferFormat();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getImageFormat() {
        return real.getImageFormat();
    }

    public int getMaxImages() {
        return real.getMaxImages();
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public long getUsage() {
        return real.getUsage();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public static com.micklab.dcg.wrapper.android.media.ImageReader newInstance(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.media.ImageReader.wrap(android.media.ImageReader.newInstance(arg0, arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.media.ImageReader newInstance(int arg0, int arg1, int arg2, int arg3, long arg4) {
        return com.micklab.dcg.wrapper.android.media.ImageReader.wrap(android.media.ImageReader.newInstance(arg0, arg1, arg2, arg3, arg4));
    }

    public void setOnImageAvailableListener(com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnImageAvailableListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class Builder {
        private final android.media.ImageReader.Builder real;

        public Builder(android.media.ImageReader.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageReader.Builder wrap(android.media.ImageReader.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageReader.Builder(real);
        }

        public android.media.ImageReader.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1) {
            this(new android.media.ImageReader.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader build() {
            return com.micklab.dcg.wrapper.android.media.ImageReader.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setDefaultDataSpace(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(real.setDefaultDataSpace(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setDefaultHardwareBufferFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(real.setDefaultHardwareBufferFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setImageFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(real.setImageFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setMaxImages(int arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(real.setMaxImages(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.ImageReader.Builder setUsage(long arg0) {
            return com.micklab.dcg.wrapper.android.media.ImageReader.Builder.wrap(real.setUsage(arg0));
        }

    }
    public static final class OnImageAvailableListener {
        private final android.media.ImageReader.OnImageAvailableListener real;

        public OnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener wrap(android.media.ImageReader.OnImageAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.ImageReader.OnImageAvailableListener(real);
        }

        public android.media.ImageReader.OnImageAvailableListener unwrap() {
            return real;
        }

        public void onImageAvailable(com.micklab.dcg.wrapper.android.media.ImageReader arg0) {
            real.onImageAvailable(arg0 == null ? null : arg0.unwrap());
        }

    }
}
