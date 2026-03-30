// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetHost {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppWidgetHost(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetHost wrap(android.appwidget.AppWidgetHost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetHost(real, (__DcgwBridgeToken) null);
    }

    public android.appwidget.AppWidgetHost getReal() {
        return (android.appwidget.AppWidgetHost) real;
    }

    public android.appwidget.AppWidgetHost unwrap() {
        return getReal();
    }

    public AppWidgetHost(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.appwidget.AppWidgetHost(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int allocateAppWidgetId() {
        return ((android.appwidget.AppWidgetHost) real).allocateAppWidgetId();
    }

    public com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView createView(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo arg2) {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetHostView.wrap(((android.appwidget.AppWidgetHost) real).createView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static void deleteAllHosts() {
        android.appwidget.AppWidgetHost.deleteAllHosts();
    }

    public void deleteAppWidgetId(int arg0) {
        ((android.appwidget.AppWidgetHost) real).deleteAppWidgetId(arg0);
    }

    public void deleteHost() {
        ((android.appwidget.AppWidgetHost) real).deleteHost();
    }

    public int[] getAppWidgetIds() {
        return ((android.appwidget.AppWidgetHost) real).getAppWidgetIds();
    }

    public void onAppWidgetRemoved(int arg0) {
        ((android.appwidget.AppWidgetHost) real).onAppWidgetRemoved(arg0);
    }

    public void startAppWidgetConfigureActivityForResult(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
        ((android.appwidget.AppWidgetHost) real).startAppWidgetConfigureActivityForResult(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public void startListening() {
        ((android.appwidget.AppWidgetHost) real).startListening();
    }

    public void stopListening() {
        ((android.appwidget.AppWidgetHost) real).stopListening();
    }

}
