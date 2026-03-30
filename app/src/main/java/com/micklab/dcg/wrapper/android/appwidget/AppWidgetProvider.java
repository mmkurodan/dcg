// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppWidgetProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetProvider wrap(android.appwidget.AppWidgetProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetProvider(real, (__DcgwBridgeToken) null);
    }

    public android.appwidget.AppWidgetProvider getReal() {
        return (android.appwidget.AppWidgetProvider) real;
    }

    public android.appwidget.AppWidgetProvider unwrap() {
        return getReal();
    }

    public AppWidgetProvider() {
        this(new android.appwidget.AppWidgetProvider(), (__DcgwBridgeToken) null);
    }

    public void onAppWidgetOptionsChanged(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        ((android.appwidget.AppWidgetProvider) real).onAppWidgetOptionsChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onDeleted(com.micklab.dcg.wrapper.android.content.Context arg0, int[] arg1) {
        ((android.appwidget.AppWidgetProvider) real).onDeleted(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onDisabled(com.micklab.dcg.wrapper.android.content.Context arg0) {
        ((android.appwidget.AppWidgetProvider) real).onDisabled(arg0 == null ? null : arg0.getReal());
    }

    public void onEnabled(com.micklab.dcg.wrapper.android.content.Context arg0) {
        ((android.appwidget.AppWidgetProvider) real).onEnabled(arg0 == null ? null : arg0.getReal());
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.appwidget.AppWidgetProvider) real).onReceive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onRestored(com.micklab.dcg.wrapper.android.content.Context arg0, int[] arg1, int[] arg2) {
        ((android.appwidget.AppWidgetProvider) real).onRestored(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onUpdate(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager arg1, int[] arg2) {
        ((android.appwidget.AppWidgetProvider) real).onUpdate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

}
