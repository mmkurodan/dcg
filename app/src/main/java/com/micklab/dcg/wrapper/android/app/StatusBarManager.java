// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class StatusBarManager {
    private final android.app.StatusBarManager real;

    public StatusBarManager(android.app.StatusBarManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.StatusBarManager wrap(android.app.StatusBarManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.StatusBarManager(real);
    }

    public android.app.StatusBarManager unwrap() {
        return real;
    }

    public boolean canLaunchCaptureContentActivityForNote(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return real.canLaunchCaptureContentActivityForNote(arg0 == null ? null : arg0.unwrap());
    }

    public static final int TILE_ADD_REQUEST_ERROR_APP_NOT_IN_FOREGROUND = android.app.StatusBarManager.TILE_ADD_REQUEST_ERROR_APP_NOT_IN_FOREGROUND;
    public static final int TILE_ADD_REQUEST_ERROR_BAD_COMPONENT = android.app.StatusBarManager.TILE_ADD_REQUEST_ERROR_BAD_COMPONENT;
    public static final int TILE_ADD_REQUEST_ERROR_MISMATCHED_PACKAGE = android.app.StatusBarManager.TILE_ADD_REQUEST_ERROR_MISMATCHED_PACKAGE;
    public static final int TILE_ADD_REQUEST_ERROR_NOT_CURRENT_USER = android.app.StatusBarManager.TILE_ADD_REQUEST_ERROR_NOT_CURRENT_USER;
    public static final int TILE_ADD_REQUEST_ERROR_NO_STATUS_BAR_SERVICE = android.app.StatusBarManager.TILE_ADD_REQUEST_ERROR_NO_STATUS_BAR_SERVICE;
    public static final int TILE_ADD_REQUEST_ERROR_REQUEST_IN_PROGRESS = android.app.StatusBarManager.TILE_ADD_REQUEST_ERROR_REQUEST_IN_PROGRESS;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ADDED = android.app.StatusBarManager.TILE_ADD_REQUEST_RESULT_TILE_ADDED;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ALREADY_ADDED = android.app.StatusBarManager.TILE_ADD_REQUEST_RESULT_TILE_ALREADY_ADDED;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_NOT_ADDED = android.app.StatusBarManager.TILE_ADD_REQUEST_RESULT_TILE_NOT_ADDED;

}
