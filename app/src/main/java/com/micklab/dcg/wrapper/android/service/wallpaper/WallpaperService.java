// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.wallpaper;

public final class WallpaperService {
    private final android.service.wallpaper.WallpaperService real;

    public WallpaperService(android.service.wallpaper.WallpaperService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService wrap(android.service.wallpaper.WallpaperService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService(real);
    }

    public android.service.wallpaper.WallpaperService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreate() {
        real.onCreate();
    }

    public android.service.wallpaper.WallpaperService.Engine onCreateEngine() {
        return real.onCreateEngine();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.wallpaper.WallpaperService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.wallpaper.WallpaperService.SERVICE_META_DATA;

}
