// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.appwidget;

public final class AppWidgetProviderInfo {
    private final android.appwidget.AppWidgetProviderInfo real;

    public AppWidgetProviderInfo(android.appwidget.AppWidgetProviderInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo wrap(android.appwidget.AppWidgetProviderInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo(real);
    }

    public android.appwidget.AppWidgetProviderInfo unwrap() {
        return real;
    }

    public AppWidgetProviderInfo() {
        this(new android.appwidget.AppWidgetProviderInfo());
    }

    public AppWidgetProviderInfo(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.appwidget.AppWidgetProviderInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo clone() {
        return com.micklab.dcg.wrapper.android.appwidget.AppWidgetProviderInfo.wrap(real.clone());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo getActivityInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ActivityInfo.wrap(real.getActivityInfo());
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.appwidget.AppWidgetProviderInfo#getProfile()");
    }

    public java.lang.CharSequence loadDescription(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.loadDescription(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadIcon(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public java.lang.String loadLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
        return real.loadLabel(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadPreviewImage(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadPreviewImage(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int RESIZE_BOTH = android.appwidget.AppWidgetProviderInfo.RESIZE_BOTH;
    public static final int RESIZE_HORIZONTAL = android.appwidget.AppWidgetProviderInfo.RESIZE_HORIZONTAL;
    public static final int RESIZE_NONE = android.appwidget.AppWidgetProviderInfo.RESIZE_NONE;
    public static final int RESIZE_VERTICAL = android.appwidget.AppWidgetProviderInfo.RESIZE_VERTICAL;
    public static final int WIDGET_CATEGORY_HOME_SCREEN = android.appwidget.AppWidgetProviderInfo.WIDGET_CATEGORY_HOME_SCREEN;
    public static final int WIDGET_CATEGORY_KEYGUARD = android.appwidget.AppWidgetProviderInfo.WIDGET_CATEGORY_KEYGUARD;
    public static final int WIDGET_CATEGORY_SEARCHBOX = android.appwidget.AppWidgetProviderInfo.WIDGET_CATEGORY_SEARCHBOX;
    public static final int WIDGET_FEATURE_CONFIGURATION_OPTIONAL = android.appwidget.AppWidgetProviderInfo.WIDGET_FEATURE_CONFIGURATION_OPTIONAL;
    public static final int WIDGET_FEATURE_HIDE_FROM_PICKER = android.appwidget.AppWidgetProviderInfo.WIDGET_FEATURE_HIDE_FROM_PICKER;
    public static final int WIDGET_FEATURE_RECONFIGURABLE = android.appwidget.AppWidgetProviderInfo.WIDGET_FEATURE_RECONFIGURABLE;

}
