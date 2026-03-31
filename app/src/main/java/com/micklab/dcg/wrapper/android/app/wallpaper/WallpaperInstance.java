// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.wallpaper;

public final class WallpaperInstance {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WallpaperInstance(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperInstance wrap(android.app.wallpaper.WallpaperInstance real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperInstance(real, (__DcgwBridgeToken) null);
    }

    public android.app.wallpaper.WallpaperInstance getReal() {
        return (android.app.wallpaper.WallpaperInstance) real;
    }

    public android.app.wallpaper.WallpaperInstance unwrap() {
        return getReal();
    }

    public WallpaperInstance(com.micklab.dcg.wrapper.android.app.WallpaperInfo arg0, com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription arg1) {
        this(new android.app.wallpaper.WallpaperInstance(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.wallpaper.WallpaperInstance) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.wallpaper.WallpaperInstance) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription getDescription() {
        return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.wrap(((android.app.wallpaper.WallpaperInstance) real).getDescription());
    }

    public java.lang.String getId() {
        return ((android.app.wallpaper.WallpaperInstance) real).getId();
    }

    public com.micklab.dcg.wrapper.android.app.WallpaperInfo getInfo() {
        return com.micklab.dcg.wrapper.android.app.WallpaperInfo.wrap(((android.app.wallpaper.WallpaperInstance) real).getInfo());
    }

    public int hashCode() {
        return ((android.app.wallpaper.WallpaperInstance) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.wallpaper.WallpaperInstance) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
