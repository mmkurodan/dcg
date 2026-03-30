// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ActivityOptions {
    private final android.app.ActivityOptions real;

    public ActivityOptions(android.app.ActivityOptions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions wrap(android.app.ActivityOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ActivityOptions(real);
    }

    public android.app.ActivityOptions unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getLaunchBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getLaunchBounds());
    }

    public int getLaunchDisplayId() {
        return real.getLaunchDisplayId();
    }

    public boolean getLockTaskMode() {
        return real.getLockTaskMode();
    }

    public int getPendingIntentBackgroundActivityStartMode() {
        return real.getPendingIntentBackgroundActivityStartMode();
    }

    public int getPendingIntentCreatorBackgroundActivityStartMode() {
        return real.getPendingIntentCreatorBackgroundActivityStartMode();
    }

    public int getSplashScreenStyle() {
        return real.getSplashScreenStyle();
    }

    public boolean isPendingIntentBackgroundActivityLaunchAllowed() {
        return real.isPendingIntentBackgroundActivityLaunchAllowed();
    }

    public boolean isShareIdentityEnabled() {
        return real.isShareIdentityEnabled();
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeBasic() {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeBasic());
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeClipRevealAnimation(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeClipRevealAnimation(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeCustomAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeCustomAnimation(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeCustomAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeCustomAnimation(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeLaunchIntoPip(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeLaunchIntoPip(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeScaleUpAnimation(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeScaleUpAnimation(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeSceneTransitionAnimation(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.view.View arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeSceneTransitionAnimation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeTaskLaunchBehind() {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeTaskLaunchBehind());
    }

    public static com.micklab.dcg.wrapper.android.app.ActivityOptions makeThumbnailScaleUpAnimation(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(android.app.ActivityOptions.makeThumbnailScaleUpAnimation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void requestUsageTimeReport(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.requestUsageTimeReport(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setAppVerificationBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setAppVerificationBundle(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setLaunchBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setLaunchBounds(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setLaunchDisplayId(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setLaunchDisplayId(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setLockTaskEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setLockTaskEnabled(arg0));
    }

    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean arg0) {
        real.setPendingIntentBackgroundActivityLaunchAllowed(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setPendingIntentBackgroundActivityStartMode(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setPendingIntentBackgroundActivityStartMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setPendingIntentCreatorBackgroundActivityStartMode(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setPendingIntentCreatorBackgroundActivityStartMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setShareIdentityEnabled(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setShareIdentityEnabled(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.ActivityOptions setSplashScreenStyle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.ActivityOptions.wrap(real.setSplashScreenStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle toBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.toBundle());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void update(com.micklab.dcg.wrapper.android.app.ActivityOptions arg0) {
        real.update(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = android.app.ActivityOptions.EXTRA_USAGE_TIME_REPORT;
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = android.app.ActivityOptions.EXTRA_USAGE_TIME_REPORT_PACKAGES;
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOWED = android.app.ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_ALLOWED;
    public static final int MODE_BACKGROUND_ACTIVITY_START_DENIED = android.app.ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_DENIED;
    public static final int MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED = android.app.ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED;

}
