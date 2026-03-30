// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Icon {
    private final android.graphics.drawable.Icon real;

    public Icon(android.graphics.drawable.Icon real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon wrap(android.graphics.drawable.Icon real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Icon(real);
    }

    public android.graphics.drawable.Icon unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithAdaptiveBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithAdaptiveBitmap(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithBitmap(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithContentUri(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithContentUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithContentUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithContentUri(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithData(byte[] arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithData(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithFilePath(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.graphics.drawable.Icon#createWithFilePath(java.lang.String)");
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithResource(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithResource(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon createWithResource(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(android.graphics.drawable.Icon.createWithResource(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getResId() {
        return real.getResId();
    }

    public java.lang.String getResPackage() {
        return real.getResPackage();
    }

    public int getType() {
        return real.getType();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadDrawable(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public void loadDrawableAsync(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Message arg1) {
        real.loadDrawableAsync(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void loadDrawableAsync(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Icon.OnDrawableLoadedListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        real.loadDrawableAsync(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon setTint(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.setTint(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.setTintBlendMode(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.setTintList(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon setTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.setTintMode(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_ADAPTIVE_BITMAP = android.graphics.drawable.Icon.TYPE_ADAPTIVE_BITMAP;
    public static final int TYPE_BITMAP = android.graphics.drawable.Icon.TYPE_BITMAP;
    public static final int TYPE_DATA = android.graphics.drawable.Icon.TYPE_DATA;
    public static final int TYPE_RESOURCE = android.graphics.drawable.Icon.TYPE_RESOURCE;
    public static final int TYPE_URI = android.graphics.drawable.Icon.TYPE_URI;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = android.graphics.drawable.Icon.TYPE_URI_ADAPTIVE_BITMAP;

    public static final class OnDrawableLoadedListener {
        private final android.graphics.drawable.Icon.OnDrawableLoadedListener real;

        public OnDrawableLoadedListener(android.graphics.drawable.Icon.OnDrawableLoadedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Icon.OnDrawableLoadedListener wrap(android.graphics.drawable.Icon.OnDrawableLoadedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Icon.OnDrawableLoadedListener(real);
        }

        public android.graphics.drawable.Icon.OnDrawableLoadedListener unwrap() {
            return real;
        }

        public void onDrawableLoaded(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            real.onDrawableLoaded(arg0 == null ? null : arg0.unwrap());
        }

    }
}
