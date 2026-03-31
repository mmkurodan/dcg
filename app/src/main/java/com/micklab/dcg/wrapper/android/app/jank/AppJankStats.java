// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.jank;

public final class AppJankStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppJankStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.jank.AppJankStats wrap(android.app.jank.AppJankStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.jank.AppJankStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.jank.AppJankStats getReal() {
        return (android.app.jank.AppJankStats) real;
    }

    public android.app.jank.AppJankStats unwrap() {
        return getReal();
    }

    public AppJankStats(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, long arg5, long arg6, com.micklab.dcg.wrapper.android.app.jank.RelativeFrameTimeHistogram arg7) {
        this(new android.app.jank.AppJankStats(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.getReal()), (__DcgwBridgeToken) null);
    }

    public long getJankyFrameCount() {
        return ((android.app.jank.AppJankStats) real).getJankyFrameCount();
    }

    public java.lang.String getNavigationComponent() {
        return ((android.app.jank.AppJankStats) real).getNavigationComponent();
    }

    public com.micklab.dcg.wrapper.android.app.jank.RelativeFrameTimeHistogram getRelativeFrameTimeHistogram() {
        return com.micklab.dcg.wrapper.android.app.jank.RelativeFrameTimeHistogram.wrap(((android.app.jank.AppJankStats) real).getRelativeFrameTimeHistogram());
    }

    public long getTotalFrameCount() {
        return ((android.app.jank.AppJankStats) real).getTotalFrameCount();
    }

    public int getUid() {
        return ((android.app.jank.AppJankStats) real).getUid();
    }

    public java.lang.String getWidgetCategory() {
        return ((android.app.jank.AppJankStats) real).getWidgetCategory();
    }

    public java.lang.String getWidgetId() {
        return ((android.app.jank.AppJankStats) real).getWidgetId();
    }

    public java.lang.String getWidgetState() {
        return ((android.app.jank.AppJankStats) real).getWidgetState();
    }

    public static final java.lang.String WIDGET_CATEGORY_ANIMATION = android.app.jank.AppJankStats.WIDGET_CATEGORY_ANIMATION;
    public static final java.lang.String WIDGET_CATEGORY_KEYBOARD = android.app.jank.AppJankStats.WIDGET_CATEGORY_KEYBOARD;
    public static final java.lang.String WIDGET_CATEGORY_MEDIA = android.app.jank.AppJankStats.WIDGET_CATEGORY_MEDIA;
    public static final java.lang.String WIDGET_CATEGORY_NAVIGATION = android.app.jank.AppJankStats.WIDGET_CATEGORY_NAVIGATION;
    public static final java.lang.String WIDGET_CATEGORY_OTHER = android.app.jank.AppJankStats.WIDGET_CATEGORY_OTHER;
    public static final java.lang.String WIDGET_CATEGORY_SCROLL = android.app.jank.AppJankStats.WIDGET_CATEGORY_SCROLL;
    public static final java.lang.String WIDGET_CATEGORY_UNSPECIFIED = android.app.jank.AppJankStats.WIDGET_CATEGORY_UNSPECIFIED;
    public static final java.lang.String WIDGET_STATE_ANIMATING = android.app.jank.AppJankStats.WIDGET_STATE_ANIMATING;
    public static final java.lang.String WIDGET_STATE_DRAGGING = android.app.jank.AppJankStats.WIDGET_STATE_DRAGGING;
    public static final java.lang.String WIDGET_STATE_FLINGING = android.app.jank.AppJankStats.WIDGET_STATE_FLINGING;
    public static final java.lang.String WIDGET_STATE_NONE = android.app.jank.AppJankStats.WIDGET_STATE_NONE;
    public static final java.lang.String WIDGET_STATE_PLAYBACK = android.app.jank.AppJankStats.WIDGET_STATE_PLAYBACK;
    public static final java.lang.String WIDGET_STATE_PREDICTIVE_BACK = android.app.jank.AppJankStats.WIDGET_STATE_PREDICTIVE_BACK;
    public static final java.lang.String WIDGET_STATE_SCROLLING = android.app.jank.AppJankStats.WIDGET_STATE_SCROLLING;
    public static final java.lang.String WIDGET_STATE_SWIPING = android.app.jank.AppJankStats.WIDGET_STATE_SWIPING;
    public static final java.lang.String WIDGET_STATE_TAPPING = android.app.jank.AppJankStats.WIDGET_STATE_TAPPING;
    public static final java.lang.String WIDGET_STATE_UNSPECIFIED = android.app.jank.AppJankStats.WIDGET_STATE_UNSPECIFIED;
    public static final java.lang.String WIDGET_STATE_ZOOMING = android.app.jank.AppJankStats.WIDGET_STATE_ZOOMING;

}
