// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActivityOptions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ActivityOptions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions wrap(android.app.ActivityOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityOptions(real, (__DcgwBridgeToken) null);
    }

    public android.app.ActivityOptions getReal() {
        return (android.app.ActivityOptions) real;
    }

    public android.app.ActivityOptions unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getLaunchBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.app.ActivityOptions) real).getLaunchBounds());
    }

    public int getLaunchDisplayId() {
        return ((android.app.ActivityOptions) real).getLaunchDisplayId();
    }

    public boolean getLockTaskMode() {
        return ((android.app.ActivityOptions) real).getLockTaskMode();
    }

    public int getPendingIntentBackgroundActivityStartMode() {
        return ((android.app.ActivityOptions) real).getPendingIntentBackgroundActivityStartMode();
    }

    public int getPendingIntentCreatorBackgroundActivityStartMode() {
        return ((android.app.ActivityOptions) real).getPendingIntentCreatorBackgroundActivityStartMode();
    }

    public int getSplashScreenStyle() {
        return ((android.app.ActivityOptions) real).getSplashScreenStyle();
    }

    public boolean isPendingIntentBackgroundActivityLaunchAllowed() {
        return ((android.app.ActivityOptions) real).isPendingIntentBackgroundActivityLaunchAllowed();
    }

    public boolean isShareIdentityEnabled() {
        return ((android.app.ActivityOptions) real).isShareIdentityEnabled();
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeBasic() {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeBasic());
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeClipRevealAnimation(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeClipRevealAnimation(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeCustomAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeCustomAnimation(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeCustomAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeCustomAnimation(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeLaunchIntoPip(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeLaunchIntoPip(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeScaleUpAnimation(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeScaleUpAnimation(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeSceneTransitionAnimation(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.view.View arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeSceneTransitionAnimation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeTaskLaunchBehind() {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeTaskLaunchBehind());
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeThumbnailScaleUpAnimation(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeThumbnailScaleUpAnimation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public void requestUsageTimeReport(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.app.ActivityOptions) real).requestUsageTimeReport(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setAppVerificationBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setAppVerificationBundle(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setLaunchBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setLaunchBounds(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setLaunchDisplayId(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setLaunchDisplayId(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setLockTaskEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setLockTaskEnabled(arg0));
    }

    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean arg0) {
        ((android.app.ActivityOptions) real).setPendingIntentBackgroundActivityLaunchAllowed(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setPendingIntentBackgroundActivityStartMode(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setPendingIntentBackgroundActivityStartMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setPendingIntentCreatorBackgroundActivityStartMode(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setPendingIntentCreatorBackgroundActivityStartMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setShareIdentityEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setShareIdentityEnabled(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setSplashScreenStyle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(((android.app.ActivityOptions) real).setSplashScreenStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle toBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.ActivityOptions) real).toBundle());
    }

    public java.lang.String toString() {
        return ((android.app.ActivityOptions) real).toString();
    }

    public void update(com.micklab.dcg.wrapper.android.app.ActivityOptions arg0) {
        ((android.app.ActivityOptions) real).update(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = android.app.ActivityOptions.EXTRA_USAGE_TIME_REPORT;
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = android.app.ActivityOptions.EXTRA_USAGE_TIME_REPORT_PACKAGES;
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOWED = android.app.ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_ALLOWED;
    public static final int MODE_BACKGROUND_ACTIVITY_START_DENIED = android.app.ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_DENIED;
    public static final int MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED = android.app.ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED;

}
