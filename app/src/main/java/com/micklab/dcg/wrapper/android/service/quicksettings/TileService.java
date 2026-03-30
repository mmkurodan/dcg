// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quicksettings;

public final class TileService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TileService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quicksettings.TileService wrap(android.service.quicksettings.TileService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quicksettings.TileService(real, (__DcgwBridgeToken) null);
    }

    public android.service.quicksettings.TileService getReal() {
        return (android.service.quicksettings.TileService) real;
    }

    public android.service.quicksettings.TileService unwrap() {
        return getReal();
    }

    public TileService() {
        this(new android.service.quicksettings.TileService(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.service.quicksettings.Tile getQsTile() {
        return com.micklab.dcg.wrapper.android.service.quicksettings.Tile.wrap(((android.service.quicksettings.TileService) real).getQsTile());
    }

    public boolean isLocked() {
        return ((android.service.quicksettings.TileService) real).isLocked();
    }

    public boolean isSecure() {
        return ((android.service.quicksettings.TileService) real).isSecure();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.quicksettings.TileService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onClick() {
        ((android.service.quicksettings.TileService) real).onClick();
    }

    public void onDestroy() {
        ((android.service.quicksettings.TileService) real).onDestroy();
    }

    public void onStartListening() {
        ((android.service.quicksettings.TileService) real).onStartListening();
    }

    public void onStopListening() {
        ((android.service.quicksettings.TileService) real).onStopListening();
    }

    public void onTileAdded() {
        ((android.service.quicksettings.TileService) real).onTileAdded();
    }

    public void onTileRemoved() {
        ((android.service.quicksettings.TileService) real).onTileRemoved();
    }

    public static void requestListeningState(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        android.service.quicksettings.TileService.requestListeningState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void showDialog(com.micklab.dcg.wrapper.android.app.Dialog arg0) {
        ((android.service.quicksettings.TileService) real).showDialog(arg0 == null ? null : arg0.getReal());
    }

    public void startActivityAndCollapse(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.service.quicksettings.TileService) real).startActivityAndCollapse(arg0 == null ? null : arg0.getReal());
    }

    public void startActivityAndCollapse(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.service.quicksettings.TileService) real).startActivityAndCollapse(arg0 == null ? null : arg0.getReal());
    }

    public void unlockAndRun(java.lang.Runnable arg0) {
        ((android.service.quicksettings.TileService) real).unlockAndRun(arg0);
    }

    public static final java.lang.String ACTION_QS_TILE = android.service.quicksettings.TileService.ACTION_QS_TILE;
    public static final java.lang.String ACTION_QS_TILE_PREFERENCES = android.service.quicksettings.TileService.ACTION_QS_TILE_PREFERENCES;
    public static final java.lang.String META_DATA_ACTIVE_TILE = android.service.quicksettings.TileService.META_DATA_ACTIVE_TILE;
    public static final java.lang.String META_DATA_TOGGLEABLE_TILE = android.service.quicksettings.TileService.META_DATA_TOGGLEABLE_TILE;

}
