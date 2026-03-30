// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class LiveFolders {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LiveFolders(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.LiveFolders wrap(android.provider.LiveFolders real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.LiveFolders(real, (__DcgwBridgeToken) null);
    }

    public android.provider.LiveFolders getReal() {
        return (android.provider.LiveFolders) real;
    }

    public android.provider.LiveFolders unwrap() {
        return getReal();
    }

    public static final java.lang.String ACTION_CREATE_LIVE_FOLDER = android.provider.LiveFolders.ACTION_CREATE_LIVE_FOLDER;
    public static final java.lang.String DESCRIPTION = android.provider.LiveFolders.DESCRIPTION;
    public static final int DISPLAY_MODE_GRID = android.provider.LiveFolders.DISPLAY_MODE_GRID;
    public static final int DISPLAY_MODE_LIST = android.provider.LiveFolders.DISPLAY_MODE_LIST;
    public static final java.lang.String EXTRA_LIVE_FOLDER_BASE_INTENT = android.provider.LiveFolders.EXTRA_LIVE_FOLDER_BASE_INTENT;
    public static final java.lang.String EXTRA_LIVE_FOLDER_DISPLAY_MODE = android.provider.LiveFolders.EXTRA_LIVE_FOLDER_DISPLAY_MODE;
    public static final java.lang.String EXTRA_LIVE_FOLDER_ICON = android.provider.LiveFolders.EXTRA_LIVE_FOLDER_ICON;
    public static final java.lang.String EXTRA_LIVE_FOLDER_NAME = android.provider.LiveFolders.EXTRA_LIVE_FOLDER_NAME;
    public static final java.lang.String ICON_BITMAP = android.provider.LiveFolders.ICON_BITMAP;
    public static final java.lang.String ICON_PACKAGE = android.provider.LiveFolders.ICON_PACKAGE;
    public static final java.lang.String ICON_RESOURCE = android.provider.LiveFolders.ICON_RESOURCE;
    public static final java.lang.String INTENT = android.provider.LiveFolders.INTENT;
    public static final java.lang.String NAME = android.provider.LiveFolders.NAME;

}
