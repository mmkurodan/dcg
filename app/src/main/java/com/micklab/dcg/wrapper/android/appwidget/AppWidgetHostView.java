// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetHostView {
    private final android.appwidget.AppWidgetHostView real;

    public AppWidgetHostView(android.appwidget.AppWidgetHostView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView wrap(android.appwidget.AppWidgetHostView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView(real);
    }

    public android.appwidget.AppWidgetHostView unwrap() {
        return real;
    }

    public AppWidgetHostView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.appwidget.AppWidgetHostView(arg0 == null ? null : arg0.unwrap()));
    }

    public AppWidgetHostView(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.appwidget.AppWidgetHostView(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public int getAppWidgetId() {
        return real.getAppWidgetId();
    }

    public com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo getAppWidgetInfo() {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo.wrap(real.getAppWidgetInfo());
    }

    public static com.micklab.dcg.wrapper.android.graphics.Rect getDefaultPaddingForWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(android.appwidget.AppWidgetHostView.getDefaultPaddingForWidget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void resetColorResources() {
        real.resetColorResources();
    }

    public void setAppWidget(int arg0, com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo arg1) {
        real.setAppWidget(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setColorResources(com.micklab.dcg.wrapper.android.util.SparseIntArray arg0) {
        real.setColorResources(arg0 == null ? null : arg0.unwrap());
    }

    public void setExecutor(java.util.concurrent.Executor arg0) {
        real.setExecutor(arg0);
    }

    public void setOnLightBackground(boolean arg0) {
        real.setOnLightBackground(arg0);
    }

    public void updateAppWidget(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
        real.updateAppWidget(arg0 == null ? null : arg0.unwrap());
    }

    public void updateAppWidgetOptions(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.updateAppWidgetOptions(arg0 == null ? null : arg0.unwrap());
    }

    public void updateAppWidgetSize(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1, int arg2, int arg3, int arg4) {
        real.updateAppWidgetSize(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

}
