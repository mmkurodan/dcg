// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class WallpaperColors {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WallpaperColors(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperColors wrap(android.app.WallpaperColors real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.WallpaperColors(real, (__DcgwBridgeToken) null);
    }

    public android.app.WallpaperColors getReal() {
        return (android.app.WallpaperColors) real;
    }

    public android.app.WallpaperColors unwrap() {
        return getReal();
    }

    public WallpaperColors(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.app.WallpaperColors(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public WallpaperColors(com.micklab.dcg.wrapper.android.graphics.Color arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1, com.micklab.dcg.wrapper.android.graphics.Color arg2) {
        this(new android.app.WallpaperColors(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public WallpaperColors(com.micklab.dcg.wrapper.android.graphics.Color arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1, com.micklab.dcg.wrapper.android.graphics.Color arg2, int arg3) {
        this(new android.app.WallpaperColors(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.WallpaperColors) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.WallpaperColors) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperColors fromBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperColors.wrap(android.app.WallpaperColors.fromBitmap(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperColors fromDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperColors.wrap(android.app.WallpaperColors.fromDrawable(arg0 == null ? null : arg0.getReal()));
    }

    public int getColorHints() {
        return ((android.app.WallpaperColors) real).getColorHints();
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getPrimaryColor() {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(((android.app.WallpaperColors) real).getPrimaryColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getSecondaryColor() {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(((android.app.WallpaperColors) real).getSecondaryColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getTertiaryColor() {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(((android.app.WallpaperColors) real).getTertiaryColor());
    }

    public int hashCode() {
        return ((android.app.WallpaperColors) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.app.WallpaperColors) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.WallpaperColors) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int HINT_SUPPORTS_DARK_TEXT = android.app.WallpaperColors.HINT_SUPPORTS_DARK_TEXT;
    public static final int HINT_SUPPORTS_DARK_THEME = android.app.WallpaperColors.HINT_SUPPORTS_DARK_THEME;

}
