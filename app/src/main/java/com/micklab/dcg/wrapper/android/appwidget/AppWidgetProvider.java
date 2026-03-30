// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetProvider {
    private final android.appwidget.AppWidgetProvider real;

    public AppWidgetProvider(android.appwidget.AppWidgetProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetProvider wrap(android.appwidget.AppWidgetProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetProvider(real);
    }

    public android.appwidget.AppWidgetProvider unwrap() {
        return real;
    }

    public AppWidgetProvider() {
        this(new android.appwidget.AppWidgetProvider());
    }

    public void onAppWidgetOptionsChanged(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager arg1, int arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        real.onAppWidgetOptionsChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void onDeleted(com.micklab.dcg.wrapper.android.content.Context arg0, int[] arg1) {
        real.onDeleted(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onDisabled(com.micklab.dcg.wrapper.android.content.Context arg0) {
        real.onDisabled(arg0 == null ? null : arg0.unwrap());
    }

    public void onEnabled(com.micklab.dcg.wrapper.android.content.Context arg0) {
        real.onEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public void onReceive(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.onReceive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onRestored(com.micklab.dcg.wrapper.android.content.Context arg0, int[] arg1, int[] arg2) {
        real.onRestored(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onUpdate(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.appwidget.AppWidgetManager arg1, int[] arg2) {
        real.onUpdate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

}
