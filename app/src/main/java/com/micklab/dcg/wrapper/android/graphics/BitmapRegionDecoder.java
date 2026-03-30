// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BitmapRegionDecoder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BitmapRegionDecoder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder wrap(android.graphics.BitmapRegionDecoder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.BitmapRegionDecoder getReal() {
        return (android.graphics.BitmapRegionDecoder) real;
    }

    public android.graphics.BitmapRegionDecoder unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap decodeRegion(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.BitmapRegionDecoder) real).decodeRegion(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public int getHeight() {
        return ((android.graphics.BitmapRegionDecoder) real).getHeight();
    }

    public int getWidth() {
        return ((android.graphics.BitmapRegionDecoder) real).getWidth();
    }

    public boolean isRecycled() {
        return ((android.graphics.BitmapRegionDecoder) real).isRecycled();
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.io.InputStream arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.lang.String arg0, boolean arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.io.FileDescriptor arg0, boolean arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.io.InputStream arg0, boolean arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(byte[] arg0, int arg1, int arg2, boolean arg3) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0, arg1, arg2, arg3));
    }

    public void recycle() {
        ((android.graphics.BitmapRegionDecoder) real).recycle();
    }

}
