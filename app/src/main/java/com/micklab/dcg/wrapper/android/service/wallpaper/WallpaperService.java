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

    public com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService.Engine onCreateEngine() {
        return com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService.Engine.wrap(((android.service.wallpaper.WallpaperService) real).onCreateEngine());
    }

    public com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService.Engine onCreateEngine(com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription arg0) {
        return com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService.Engine.wrap(((android.service.wallpaper.WallpaperService) real).onCreateEngine(arg0 == null ? null : arg0.getReal()));
    }

    public void onDestroy() {
        ((android.service.wallpaper.WallpaperService) real).onDestroy();
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.wallpaper.WallpaperService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.wallpaper.WallpaperService.SERVICE_META_DATA;

    public static final class Engine {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Engine(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService.Engine wrap(android.service.wallpaper.WallpaperService.Engine real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.wallpaper.WallpaperService.Engine(real, (__DcgwBridgeToken) null);
        }

        public android.service.wallpaper.WallpaperService.Engine getReal() {
            return (android.service.wallpaper.WallpaperService.Engine) real;
        }

        public android.service.wallpaper.WallpaperService.Engine unwrap() {
            return getReal();
        }

        public int getDesiredMinimumHeight() {
            return ((android.service.wallpaper.WallpaperService.Engine) real).getDesiredMinimumHeight();
        }

        public int getDesiredMinimumWidth() {
            return ((android.service.wallpaper.WallpaperService.Engine) real).getDesiredMinimumWidth();
        }

        public com.micklab.dcg.wrapper.android.content.Context getDisplayContext() {
            return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.service.wallpaper.WallpaperService.Engine) real).getDisplayContext());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceHolder getSurfaceHolder() {
            return com.micklab.dcg.wrapper.android.view.SurfaceHolder.wrap(((android.service.wallpaper.WallpaperService.Engine) real).getSurfaceHolder());
        }

        public int getWallpaperFlags() {
            return ((android.service.wallpaper.WallpaperService.Engine) real).getWallpaperFlags();
        }

        public boolean isPreview() {
            return ((android.service.wallpaper.WallpaperService.Engine) real).isPreview();
        }

        public boolean isVisible() {
            return ((android.service.wallpaper.WallpaperService.Engine) real).isVisible();
        }

        public void notifyColorsChanged() {
            ((android.service.wallpaper.WallpaperService.Engine) real).notifyColorsChanged();
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription onApplyWallpaper(int arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.wrap(((android.service.wallpaper.WallpaperService.Engine) real).onApplyWallpaper(arg0));
        }

        public void onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onApplyWindowInsets(arg0 == null ? null : arg0.getReal());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle onCommand(java.lang.String arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4, boolean arg5) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.wallpaper.WallpaperService.Engine) real).onCommand(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5));
        }

        public com.micklab.dcg.wrapper.android.app.WallpaperColors onComputeColors() {
            return com.micklab.dcg.wrapper.android.app.WallpaperColors.wrap(((android.service.wallpaper.WallpaperService.Engine) real).onComputeColors());
        }

        public void onCreate(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onCreate(arg0 == null ? null : arg0.getReal());
        }

        public void onDesiredSizeChanged(int arg0, int arg1) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onDesiredSizeChanged(arg0, arg1);
        }

        public void onDestroy() {
            ((android.service.wallpaper.WallpaperService.Engine) real).onDestroy();
        }

        public void onOffsetsChanged(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onOffsetsChanged(arg0, arg1, arg2, arg3, arg4, arg5);
        }

        public void onSurfaceChanged(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, int arg1, int arg2, int arg3) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onSurfaceChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

        public void onSurfaceCreated(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onSurfaceCreated(arg0 == null ? null : arg0.getReal());
        }

        public void onSurfaceDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onSurfaceDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onSurfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onSurfaceRedrawNeeded(arg0 == null ? null : arg0.getReal());
        }

        public void onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onVisibilityChanged(boolean arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onVisibilityChanged(arg0);
        }

        public void onWallpaperFlagsChanged(int arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onWallpaperFlagsChanged(arg0);
        }

        public void onZoomChanged(float arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).onZoomChanged(arg0);
        }

        public void setOffsetNotificationsEnabled(boolean arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).setOffsetNotificationsEnabled(arg0);
        }

        public void setTouchEventsEnabled(boolean arg0) {
            ((android.service.wallpaper.WallpaperService.Engine) real).setTouchEventsEnabled(arg0);
        }


    }
}
