// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetHostView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppWidgetHostView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView wrap(android.appwidget.AppWidgetHostView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView(real, (__DcgwBridgeToken) null);
    }

    public android.appwidget.AppWidgetHostView getReal() {
        return (android.appwidget.AppWidgetHostView) real;
    }

    public android.appwidget.AppWidgetHostView unwrap() {
        return getReal();
    }

    public AppWidgetHostView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.appwidget.AppWidgetHostView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AppWidgetHostView(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.appwidget.AppWidgetHostView(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.FrameLayout.LayoutParams.wrap(((android.appwidget.AppWidgetHostView) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public int getAppWidgetId() {
        return ((android.appwidget.AppWidgetHostView) real).getAppWidgetId();
    }

    public com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo getAppWidgetInfo() {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo.wrap(((android.appwidget.AppWidgetHostView) real).getAppWidgetInfo());
    }

    public static com.micklab.dcg.wrapper.android.graphics.Rect getDefaultPaddingForWidget(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(android.appwidget.AppWidgetHostView.getDefaultPaddingForWidget(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void resetColorResources() {
        ((android.appwidget.AppWidgetHostView) real).resetColorResources();
    }

    public void setAppWidget(int arg0, com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo arg1) {
        ((android.appwidget.AppWidgetHostView) real).setAppWidget(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setColorResources(com.micklab.dcg.wrapper.android.util.SparseIntArray arg0) {
        ((android.appwidget.AppWidgetHostView) real).setColorResources(arg0 == null ? null : arg0.getReal());
    }

    public void setExecutor(java.util.concurrent.Executor arg0) {
        ((android.appwidget.AppWidgetHostView) real).setExecutor(arg0);
    }

    public void setOnLightBackground(boolean arg0) {
        ((android.appwidget.AppWidgetHostView) real).setOnLightBackground(arg0);
    }

    public void updateAppWidget(com.micklab.dcg.wrapper.android.widget.RemoteViews arg0) {
        ((android.appwidget.AppWidgetHostView) real).updateAppWidget(arg0 == null ? null : arg0.getReal());
    }

    public void updateAppWidgetOptions(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.appwidget.AppWidgetHostView) real).updateAppWidgetOptions(arg0 == null ? null : arg0.getReal());
    }

    public void updateAppWidgetSize(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.appwidget.AppWidgetHostView) real).updateAppWidgetSize(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

}
