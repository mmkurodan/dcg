// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class WallpaperColors {
    private final android.app.WallpaperColors real;

    public WallpaperColors(android.app.WallpaperColors real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperColors wrap(android.app.WallpaperColors real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.WallpaperColors(real);
    }

    public android.app.WallpaperColors unwrap() {
        return real;
    }

    public WallpaperColors(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.app.WallpaperColors(arg0 == null ? null : arg0.unwrap()));
    }

    public WallpaperColors(com.micklab.dcg.wrapper.android.graphics.Color arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1, com.micklab.dcg.wrapper.android.graphics.Color arg2) {
        this(new android.app.WallpaperColors(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public WallpaperColors(com.micklab.dcg.wrapper.android.graphics.Color arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1, com.micklab.dcg.wrapper.android.graphics.Color arg2, int arg3) {
        this(new android.app.WallpaperColors(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperColors fromBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperColors.wrap(android.app.WallpaperColors.fromBitmap(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperColors fromDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperColors.wrap(android.app.WallpaperColors.fromDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public int getColorHints() {
        return real.getColorHints();
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getPrimaryColor() {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(real.getPrimaryColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getSecondaryColor() {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(real.getSecondaryColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getTertiaryColor() {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(real.getTertiaryColor());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int HINT_SUPPORTS_DARK_TEXT = android.app.WallpaperColors.HINT_SUPPORTS_DARK_TEXT;
    public static final int HINT_SUPPORTS_DARK_THEME = android.app.WallpaperColors.HINT_SUPPORTS_DARK_THEME;

}
