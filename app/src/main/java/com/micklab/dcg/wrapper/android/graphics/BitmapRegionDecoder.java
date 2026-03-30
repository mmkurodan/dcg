// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BitmapRegionDecoder {
    private final android.graphics.BitmapRegionDecoder real;

    public BitmapRegionDecoder(android.graphics.BitmapRegionDecoder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder wrap(android.graphics.BitmapRegionDecoder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder(real);
    }

    public android.graphics.BitmapRegionDecoder unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap decodeRegion(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.decodeRegion(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean isRecycled() {
        return real.isRecycled();
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.io.InputStream arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(java.lang.String arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder newInstance(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.graphics.BitmapRegionDecoder.wrap(android.graphics.BitmapRegionDecoder.newInstance(arg0 == null ? null : arg0.unwrap()));
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
        real.recycle();
    }

}
