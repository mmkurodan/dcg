// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class WallpaperManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WallpaperManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperManager wrap(android.app.WallpaperManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.WallpaperManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.WallpaperManager getReal() {
        return (android.app.WallpaperManager) real;
    }

    public android.app.WallpaperManager unwrap() {
        return getReal();
    }

    public void addOnColorsChangedListener(com.micklab.dcg.wrapper.android.app.WallpaperManager.OnColorsChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.app.WallpaperManager) real).addOnColorsChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void clear() throws java.io.IOException {
        ((android.app.WallpaperManager) real).clear();
    }

    public void clear(int arg0) throws java.io.IOException {
        ((android.app.WallpaperManager) real).clear(arg0);
    }

    public void clearWallpaper() {
        ((android.app.WallpaperManager) real).clearWallpaper();
    }

    public void clearWallpaperOffsets(com.micklab.dcg.wrapper.android.os.IBinder arg0) {
        ((android.app.WallpaperManager) real).clearWallpaperOffsets(arg0 == null ? null : arg0.getReal());
    }

    public void forgetLoadedWallpaper() {
        ((android.app.WallpaperManager) real).forgetLoadedWallpaper();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBuiltInDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getBuiltInDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBuiltInDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getBuiltInDrawable(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBuiltInDrawable(int arg0, int arg1, boolean arg2, float arg3, float arg4) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getBuiltInDrawable(arg0, arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBuiltInDrawable(int arg0, int arg1, boolean arg2, float arg3, float arg4, int arg5) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getBuiltInDrawable(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public com.micklab.dcg.wrapper.android.content.Intent getCropAndSetWallpaperIntent(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.WallpaperManager) real).getCropAndSetWallpaperIntent(arg0 == null ? null : arg0.getReal()));
    }

    public int getDesiredMinimumHeight() {
        return ((android.app.WallpaperManager) real).getDesiredMinimumHeight();
    }

    public int getDesiredMinimumWidth() {
        return ((android.app.WallpaperManager) real).getDesiredMinimumWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getDrawable(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getFastDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getFastDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getFastDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).getFastDrawable(arg0));
    }

    public static com.micklab.dcg.wrapper.android.app.WallpaperManager getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperManager.wrap(android.app.WallpaperManager.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.WallpaperColors getWallpaperColors(int arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperColors.wrap(((android.app.WallpaperManager) real).getWallpaperColors(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getWallpaperFile(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.WallpaperManager#getWallpaperFile(int)");
    }

    public int getWallpaperId(int arg0) {
        return ((android.app.WallpaperManager) real).getWallpaperId(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.WallpaperInfo getWallpaperInfo() {
        return com.micklab.dcg.wrapper.android.app.WallpaperInfo.wrap(((android.app.WallpaperManager) real).getWallpaperInfo());
    }

    public com.micklab.dcg.wrapper.android.app.WallpaperInfo getWallpaperInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.app.WallpaperInfo.wrap(((android.app.WallpaperManager) real).getWallpaperInfo(arg0));
    }

    public boolean hasResourceWallpaper(int arg0) {
        return ((android.app.WallpaperManager) real).hasResourceWallpaper(arg0);
    }

    public boolean isSetWallpaperAllowed() {
        return ((android.app.WallpaperManager) real).isSetWallpaperAllowed();
    }

    public boolean isWallpaperSupported() {
        return ((android.app.WallpaperManager) real).isWallpaperSupported();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).peekDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).peekDrawable(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekFastDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).peekFastDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekFastDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.app.WallpaperManager) real).peekFastDrawable(arg0));
    }

    public void removeOnColorsChangedListener(com.micklab.dcg.wrapper.android.app.WallpaperManager.OnColorsChangedListener arg0) {
        ((android.app.WallpaperManager) real).removeOnColorsChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void sendWallpaperCommand(com.micklab.dcg.wrapper.android.os.IBinder arg0, java.lang.String arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
        ((android.app.WallpaperManager) real).sendWallpaperCommand(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) throws java.io.IOException {
        ((android.app.WallpaperManager) real).setBitmap(arg0 == null ? null : arg0.getReal());
    }

    public int setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) throws java.io.IOException {
        return ((android.app.WallpaperManager) real).setBitmap(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2, int arg3) throws java.io.IOException {
        return ((android.app.WallpaperManager) real).setBitmap(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void setDisplayPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.app.WallpaperManager) real).setDisplayPadding(arg0 == null ? null : arg0.getReal());
    }

    public void setResource(int arg0) throws java.io.IOException {
        ((android.app.WallpaperManager) real).setResource(arg0);
    }

    public int setResource(int arg0, int arg1) throws java.io.IOException {
        return ((android.app.WallpaperManager) real).setResource(arg0, arg1);
    }

    public void setStream(java.io.InputStream arg0) throws java.io.IOException {
        ((android.app.WallpaperManager) real).setStream(arg0);
    }

    public int setStream(java.io.InputStream arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) throws java.io.IOException {
        return ((android.app.WallpaperManager) real).setStream(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int setStream(java.io.InputStream arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2, int arg3) throws java.io.IOException {
        return ((android.app.WallpaperManager) real).setStream(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void setWallpaperOffsetSteps(float arg0, float arg1) {
        ((android.app.WallpaperManager) real).setWallpaperOffsetSteps(arg0, arg1);
    }

    public void setWallpaperOffsets(com.micklab.dcg.wrapper.android.os.IBinder arg0, float arg1, float arg2) {
        ((android.app.WallpaperManager) real).setWallpaperOffsets(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void suggestDesiredDimensions(int arg0, int arg1) {
        ((android.app.WallpaperManager) real).suggestDesiredDimensions(arg0, arg1);
    }

    public static final java.lang.String ACTION_CHANGE_LIVE_WALLPAPER = android.app.WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER;
    public static final java.lang.String ACTION_CROP_AND_SET_WALLPAPER = android.app.WallpaperManager.ACTION_CROP_AND_SET_WALLPAPER;
    public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = android.app.WallpaperManager.ACTION_LIVE_WALLPAPER_CHOOSER;
    public static final java.lang.String COMMAND_DROP = android.app.WallpaperManager.COMMAND_DROP;
    public static final java.lang.String COMMAND_SECONDARY_TAP = android.app.WallpaperManager.COMMAND_SECONDARY_TAP;
    public static final java.lang.String COMMAND_TAP = android.app.WallpaperManager.COMMAND_TAP;
    public static final java.lang.String EXTRA_LIVE_WALLPAPER_COMPONENT = android.app.WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT;
    public static final int FLAG_LOCK = android.app.WallpaperManager.FLAG_LOCK;
    public static final int FLAG_SYSTEM = android.app.WallpaperManager.FLAG_SYSTEM;
    public static final java.lang.String WALLPAPER_PREVIEW_META_DATA = android.app.WallpaperManager.WALLPAPER_PREVIEW_META_DATA;

    public static final class OnColorsChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnColorsChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.WallpaperManager.OnColorsChangedListener wrap(android.app.WallpaperManager.OnColorsChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.WallpaperManager.OnColorsChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.WallpaperManager.OnColorsChangedListener getReal() {
            return (android.app.WallpaperManager.OnColorsChangedListener) real;
        }

        public android.app.WallpaperManager.OnColorsChangedListener unwrap() {
            return getReal();
        }

        public void onColorsChanged(com.micklab.dcg.wrapper.android.app.WallpaperColors arg0, int arg1) {
            ((android.app.WallpaperManager.OnColorsChangedListener) real).onColorsChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
