// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetManager {
    private final android.appwidget.AppWidgetManager real;

    public AppWidgetManager(android.appwidget.AppWidgetManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager wrap(android.appwidget.AppWidgetManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager(real);
    }

    public android.appwidget.AppWidgetManager unwrap() {
        return real;
    }

    public boolean bindAppWidgetIdIfAllowed(int arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return real.bindAppWidgetIdIfAllowed(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean bindAppWidgetIdIfAllowed(int arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.bindAppWidgetIdIfAllowed(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean bindAppWidgetIdIfAllowed(int arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.content.ComponentName arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        return real.bindAppWidgetIdIfAllowed(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public int[] getAppWidgetIds(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getAppWidgetIds(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo.wrap(real.getAppWidgetInfo(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAppWidgetOptions(int arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getAppWidgetOptions(arg0));
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager.wrap(android.appwidget.AppWidgetManager.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViews getWidgetPreview(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.getWidgetPreview(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public boolean isRequestPinAppWidgetSupported() {
        return real.isRequestPinAppWidgetSupported();
    }

    public void notifyAppWidgetViewDataChanged(int arg0, int arg1) {
        real.notifyAppWidgetViewDataChanged(arg0, arg1);
    }

    public void notifyAppWidgetViewDataChanged(int[] arg0, int arg1) {
        real.notifyAppWidgetViewDataChanged(arg0, arg1);
    }

    public void partiallyUpdateAppWidget(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        real.partiallyUpdateAppWidget(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void partiallyUpdateAppWidget(int[] arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        real.partiallyUpdateAppWidget(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void removeWidgetPreview(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.removeWidgetPreview(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean requestPinAppWidget(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
        return real.requestPinAppWidget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean setWidgetPreview(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1, com.micklab.dcg.wrapper.android.widget.RemoteViews arg2) {
        return real.setWidgetPreview(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void updateAppWidget(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        real.updateAppWidget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void updateAppWidget(int[] arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        real.updateAppWidget(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void updateAppWidget(int arg0, com.micklab.dcg.wrapper.android.widget.RemoteViews arg1) {
        real.updateAppWidget(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void updateAppWidgetOptions(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.updateAppWidgetOptions(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void updateAppWidgetProviderInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        real.updateAppWidgetProviderInfo(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String ACTION_APPWIDGET_BIND = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_BIND;
    public static final java.lang.String ACTION_APPWIDGET_CONFIGURE = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_CONFIGURE;
    public static final java.lang.String ACTION_APPWIDGET_DELETED = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_DELETED;
    public static final java.lang.String ACTION_APPWIDGET_DISABLED = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_DISABLED;
    public static final java.lang.String ACTION_APPWIDGET_ENABLED = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_ENABLED;
    public static final java.lang.String ACTION_APPWIDGET_HOST_RESTORED = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_HOST_RESTORED;
    public static final java.lang.String ACTION_APPWIDGET_OPTIONS_CHANGED = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_OPTIONS_CHANGED;
    public static final java.lang.String ACTION_APPWIDGET_PICK = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_PICK;
    public static final java.lang.String ACTION_APPWIDGET_RESTORED = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_RESTORED;
    public static final java.lang.String ACTION_APPWIDGET_UPDATE = android.appwidget.AppWidgetManager.ACTION_APPWIDGET_UPDATE;
    public static final java.lang.String EXTRA_APPWIDGET_ID = android.appwidget.AppWidgetManager.EXTRA_APPWIDGET_ID;
    public static final java.lang.String EXTRA_APPWIDGET_IDS = android.appwidget.AppWidgetManager.EXTRA_APPWIDGET_IDS;
    public static final java.lang.String EXTRA_APPWIDGET_OLD_IDS = android.appwidget.AppWidgetManager.EXTRA_APPWIDGET_OLD_IDS;
    public static final java.lang.String EXTRA_APPWIDGET_OPTIONS = android.appwidget.AppWidgetManager.EXTRA_APPWIDGET_OPTIONS;
    public static final java.lang.String EXTRA_APPWIDGET_PREVIEW = android.appwidget.AppWidgetManager.EXTRA_APPWIDGET_PREVIEW;
    public static final java.lang.String EXTRA_APPWIDGET_PROVIDER = android.appwidget.AppWidgetManager.EXTRA_APPWIDGET_PROVIDER;
    public static final java.lang.String EXTRA_CUSTOM_EXTRAS = android.appwidget.AppWidgetManager.EXTRA_CUSTOM_EXTRAS;
    public static final java.lang.String EXTRA_CUSTOM_INFO = android.appwidget.AppWidgetManager.EXTRA_CUSTOM_INFO;
    public static final java.lang.String EXTRA_HOST_ID = android.appwidget.AppWidgetManager.EXTRA_HOST_ID;
    public static final int INVALID_APPWIDGET_ID = android.appwidget.AppWidgetManager.INVALID_APPWIDGET_ID;
    public static final java.lang.String META_DATA_APPWIDGET_PROVIDER = android.appwidget.AppWidgetManager.META_DATA_APPWIDGET_PROVIDER;
    public static final java.lang.String OPTION_APPWIDGET_HOST_CATEGORY = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_HOST_CATEGORY;
    public static final java.lang.String OPTION_APPWIDGET_MAX_HEIGHT = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_MAX_HEIGHT;
    public static final java.lang.String OPTION_APPWIDGET_MAX_WIDTH = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_MAX_WIDTH;
    public static final java.lang.String OPTION_APPWIDGET_MIN_HEIGHT = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_MIN_HEIGHT;
    public static final java.lang.String OPTION_APPWIDGET_MIN_WIDTH = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_MIN_WIDTH;
    public static final java.lang.String OPTION_APPWIDGET_RESTORE_COMPLETED = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_RESTORE_COMPLETED;
    public static final java.lang.String OPTION_APPWIDGET_SIZES = android.appwidget.AppWidgetManager.OPTION_APPWIDGET_SIZES;

}
