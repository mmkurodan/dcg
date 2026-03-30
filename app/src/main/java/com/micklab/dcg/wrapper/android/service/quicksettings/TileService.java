// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.quicksettings;

public final class TileService {
    private final android.service.quicksettings.TileService real;

    public TileService(android.service.quicksettings.TileService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.quicksettings.TileService wrap(android.service.quicksettings.TileService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.quicksettings.TileService(real);
    }

    public android.service.quicksettings.TileService unwrap() {
        return real;
    }

    public TileService() {
        this(new android.service.quicksettings.TileService());
    }

    public com.micklab.dcg.wrapper.android.service.quicksettings.Tile getQsTile() {
        return com.micklab.dcg.wrapper.android.service.quicksettings.Tile.wrap(real.getQsTile());
    }

    public boolean isLocked() {
        return real.isLocked();
    }

    public boolean isSecure() {
        return real.isSecure();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onClick() {
        real.onClick();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onStartListening() {
        real.onStartListening();
    }

    public void onStopListening() {
        real.onStopListening();
    }

    public void onTileAdded() {
        real.onTileAdded();
    }

    public void onTileRemoved() {
        real.onTileRemoved();
    }

    public static void requestListeningState(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        android.service.quicksettings.TileService.requestListeningState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void showDialog(com.micklab.dcg.wrapper.android.app.Dialog arg0) {
        real.showDialog(arg0 == null ? null : arg0.unwrap());
    }

    public void startActivityAndCollapse(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.startActivityAndCollapse(arg0 == null ? null : arg0.unwrap());
    }

    public void startActivityAndCollapse(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.startActivityAndCollapse(arg0 == null ? null : arg0.unwrap());
    }

    public void unlockAndRun(java.lang.Runnable arg0) {
        real.unlockAndRun(arg0);
    }

    public static final java.lang.String ACTION_QS_TILE = android.service.quicksettings.TileService.ACTION_QS_TILE;
    public static final java.lang.String ACTION_QS_TILE_PREFERENCES = android.service.quicksettings.TileService.ACTION_QS_TILE_PREFERENCES;
    public static final java.lang.String META_DATA_ACTIVE_TILE = android.service.quicksettings.TileService.META_DATA_ACTIVE_TILE;
    public static final java.lang.String META_DATA_TOGGLEABLE_TILE = android.service.quicksettings.TileService.META_DATA_TOGGLEABLE_TILE;

}
