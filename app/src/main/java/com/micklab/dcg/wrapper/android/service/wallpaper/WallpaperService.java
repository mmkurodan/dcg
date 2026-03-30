// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.wallpaper;

public final class WallpaperService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WallpaperService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService wrap(android.service.wallpaper.WallpaperService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService(real, (__DcgwBridgeToken) null);
    }

    public android.service.wallpaper.WallpaperService getReal() {
        return (android.service.wallpaper.WallpaperService) real;
    }

    public android.service.wallpaper.WallpaperService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.wallpaper.WallpaperService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.service.wallpaper.WallpaperService) real).onCreate();
    }

    public android.service.wallpaper.WallpaperService.Engine onCreateEngine() {
        return ((android.service.wallpaper.WallpaperService) real).onCreateEngine();
    }

    public void onDestroy() {
        ((android.service.wallpaper.WallpaperService) real).onDestroy();
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.wallpaper.WallpaperService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.wallpaper.WallpaperService.SERVICE_META_DATA;

}
