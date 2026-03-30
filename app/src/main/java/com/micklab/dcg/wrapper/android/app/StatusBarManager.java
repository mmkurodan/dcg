// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class StatusBarManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StatusBarManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.StatusBarManager wrap(android.app.StatusBarManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.StatusBarManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.StatusBarManager getReal() {
        return (android.app.StatusBarManager) real;
    }

    public android.app.StatusBarManager unwrap() {
        return getReal();
    }

    public boolean canLaunchCaptureContentActivityForNote(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        return ((android.app.StatusBarManager) real).canLaunchCaptureContentActivityForNote(arg0 == null ? null : arg0.getReal());
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
