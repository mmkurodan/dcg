// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ImageDecoder {
    private final android.graphics.ImageDecoder real;

    public ImageDecoder(android.graphics.ImageDecoder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder wrap(android.graphics.ImageDecoder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageDecoder(real);
    }

    public android.graphics.ImageDecoder unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(java.nio.ByteBuffer arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(byte[] arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(java.io.File arg0) {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(com.micklab.dcg.wrapper.android.content.res.Resources arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(com.micklab.dcg.wrapper.android.content.res.AssetManager arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source createSource(byte[] arg0, int arg1, int arg2) throws java.lang.ArrayIndexOutOfBoundsException {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(android.graphics.ImageDecoder.createSource(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeBitmap(com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.ImageDecoder.decodeBitmap(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap decodeBitmap(com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source arg0, com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnHeaderDecodedListener arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.ImageDecoder.decodeBitmap(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable decodeDrawable(com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.ImageDecoder.decodeDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable decodeDrawable(com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source arg0, com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnHeaderDecodedListener arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.ImageDecoder.decodeDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int getAllocator() {
        return real.getAllocator();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getCrop() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getCrop());
    }

    public int getMemorySizePolicy() {
        return real.getMemorySizePolicy();
    }

    public com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnPartialImageListener getOnPartialImageListener() {
        return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnPartialImageListener.wrap(real.getOnPartialImageListener());
    }

    public com.micklab.dcg.wrapper.android.graphics.PostProcessor getPostProcessor() {
        return com.micklab.dcg.wrapper.android.graphics.PostProcessor.wrap(real.getPostProcessor());
    }

    public boolean isDecodeAsAlphaMaskEnabled() {
        return real.isDecodeAsAlphaMaskEnabled();
    }

    public static boolean isMimeTypeSupported(java.lang.String arg0) {
        return android.graphics.ImageDecoder.isMimeTypeSupported(arg0);
    }

    public boolean isMutableRequired() {
        return real.isMutableRequired();
    }

    public boolean isUnpremultipliedRequired() {
        return real.isUnpremultipliedRequired();
    }

    public void setAllocator(int arg0) {
        real.setAllocator(arg0);
    }

    public void setCrop(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setCrop(arg0 == null ? null : arg0.unwrap());
    }

    public void setDecodeAsAlphaMaskEnabled(boolean arg0) {
        real.setDecodeAsAlphaMaskEnabled(arg0);
    }

    public void setMemorySizePolicy(int arg0) {
        real.setMemorySizePolicy(arg0);
    }

    public void setMutableRequired(boolean arg0) {
        real.setMutableRequired(arg0);
    }

    public void setOnPartialImageListener(com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnPartialImageListener arg0) {
        real.setOnPartialImageListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPostProcessor(com.micklab.dcg.wrapper.android.graphics.PostProcessor arg0) {
        real.setPostProcessor(arg0 == null ? null : arg0.unwrap());
    }

    public void setTargetColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        real.setTargetColorSpace(arg0 == null ? null : arg0.unwrap());
    }

    public void setTargetSampleSize(int arg0) {
        real.setTargetSampleSize(arg0);
    }

    public void setTargetSize(int arg0, int arg1) {
        real.setTargetSize(arg0, arg1);
    }

    public void setUnpremultipliedRequired(boolean arg0) {
        real.setUnpremultipliedRequired(arg0);
    }

    public static final int ALLOCATOR_DEFAULT = android.graphics.ImageDecoder.ALLOCATOR_DEFAULT;
    public static final int ALLOCATOR_HARDWARE = android.graphics.ImageDecoder.ALLOCATOR_HARDWARE;
    public static final int ALLOCATOR_SHARED_MEMORY = android.graphics.ImageDecoder.ALLOCATOR_SHARED_MEMORY;
    public static final int ALLOCATOR_SOFTWARE = android.graphics.ImageDecoder.ALLOCATOR_SOFTWARE;
    public static final int MEMORY_POLICY_DEFAULT = android.graphics.ImageDecoder.MEMORY_POLICY_DEFAULT;
    public static final int MEMORY_POLICY_LOW_RAM = android.graphics.ImageDecoder.MEMORY_POLICY_LOW_RAM;

    public static final class DecodeException {
        private final android.graphics.ImageDecoder.DecodeException real;

        public DecodeException(android.graphics.ImageDecoder.DecodeException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.DecodeException wrap(android.graphics.ImageDecoder.DecodeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageDecoder.DecodeException(real);
        }

        public android.graphics.ImageDecoder.DecodeException unwrap() {
            return real;
        }

        public int getError() {
            return real.getError();
        }

        public com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source getSource() {
            return com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source.wrap(real.getSource());
        }

        public static final int SOURCE_EXCEPTION = android.graphics.ImageDecoder.DecodeException.SOURCE_EXCEPTION;
        public static final int SOURCE_INCOMPLETE = android.graphics.ImageDecoder.DecodeException.SOURCE_INCOMPLETE;
        public static final int SOURCE_MALFORMED_DATA = android.graphics.ImageDecoder.DecodeException.SOURCE_MALFORMED_DATA;

    }
    public static final class ImageInfo {
        private final android.graphics.ImageDecoder.ImageInfo real;

        public ImageInfo(android.graphics.ImageDecoder.ImageInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.ImageInfo wrap(android.graphics.ImageDecoder.ImageInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageDecoder.ImageInfo(real);
        }

        public android.graphics.ImageDecoder.ImageInfo unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getColorSpace());
        }

        public java.lang.String getMimeType() {
            return real.getMimeType();
        }

        public com.micklab.dcg.wrapper.android.util.Size getSize() {
            return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getSize());
        }

        public boolean isAnimated() {
            return real.isAnimated();
        }

    }
    public static final class OnHeaderDecodedListener {
        private final android.graphics.ImageDecoder.OnHeaderDecodedListener real;

        public OnHeaderDecodedListener(android.graphics.ImageDecoder.OnHeaderDecodedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnHeaderDecodedListener wrap(android.graphics.ImageDecoder.OnHeaderDecodedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnHeaderDecodedListener(real);
        }

        public android.graphics.ImageDecoder.OnHeaderDecodedListener unwrap() {
            return real;
        }

        public void onHeaderDecoded(com.micklab.dcg.wrapper.android.graphics.ImageDecoder arg0, com.micklab.dcg.wrapper.android.graphics.ImageDecoder.ImageInfo arg1, com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source arg2) {
            real.onHeaderDecoded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class OnPartialImageListener {
        private final android.graphics.ImageDecoder.OnPartialImageListener real;

        public OnPartialImageListener(android.graphics.ImageDecoder.OnPartialImageListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnPartialImageListener wrap(android.graphics.ImageDecoder.OnPartialImageListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageDecoder.OnPartialImageListener(real);
        }

        public android.graphics.ImageDecoder.OnPartialImageListener unwrap() {
            return real;
        }

        public boolean onPartialImage(com.micklab.dcg.wrapper.android.graphics.ImageDecoder.DecodeException arg0) {
            return real.onPartialImage(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class Source {
        private final android.graphics.ImageDecoder.Source real;

        public Source(android.graphics.ImageDecoder.Source real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source wrap(android.graphics.ImageDecoder.Source real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageDecoder.Source(real);
        }

        public android.graphics.ImageDecoder.Source unwrap() {
            return real;
        }

    }
}
