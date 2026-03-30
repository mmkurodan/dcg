// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetHost {
    private final android.appwidget.AppWidgetHost real;

    public AppWidgetHost(android.appwidget.AppWidgetHost real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetHost wrap(android.appwidget.AppWidgetHost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetHost(real);
    }

    public android.appwidget.AppWidgetHost unwrap() {
        return real;
    }

    public AppWidgetHost(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.appwidget.AppWidgetHost(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int allocateAppWidgetId() {
        return real.allocateAppWidgetId();
    }

    public com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView createView(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo arg2) {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView.wrap(real.createView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static void deleteAllHosts() {
        android.appwidget.AppWidgetHost.deleteAllHosts();
    }

    public void deleteAppWidgetId(int arg0) {
        real.deleteAppWidgetId(arg0);
    }

    public void deleteHost() {
        real.deleteHost();
    }

    public int[] getAppWidgetIds() {
        return real.getAppWidgetIds();
    }

    public void onAppWidgetRemoved(int arg0) {
        real.onAppWidgetRemoved(arg0);
    }

    public void startAppWidgetConfigureActivityForResult(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        real.startAppWidgetConfigureActivityForResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void startListening() {
        real.startListening();
    }

    public void stopListening() {
        real.stopListening();
    }

}
