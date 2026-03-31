// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Instrumentation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Instrumentation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Instrumentation wrap(android.app.Instrumentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Instrumentation(real, (__DcgwBridgeToken) null);
    }

    public android.app.Instrumentation getReal() {
        return (android.app.Instrumentation) real;
    }

    public android.app.Instrumentation unwrap() {
        return getReal();
    }

    public Instrumentation() {
        this(new android.app.Instrumentation(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.os.TestLooperManager acquireLooperManager(com.micklab.dcg.wrapper.android.os.Looper arg0) {
        return com.micklab.dcg.wrapper.android.os.TestLooperManager.wrap(((android.app.Instrumentation) real).acquireLooperManager(arg0 == null ? null : arg0.getReal()));
    }

    public void addMonitor(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0) {
        ((android.app.Instrumentation) real).addMonitor(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor addMonitor(com.micklab.dcg.wrapper.android.content.IntentFilter arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor.wrap(((android.app.Instrumentation) real).addMonitor(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor addMonitor(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor.wrap(((android.app.Instrumentation) real).addMonitor(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public void addResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Instrumentation) real).addResults(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Instrumentation) real).callActivityOnCreate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void callActivityOnCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        ((android.app.Instrumentation) real).callActivityOnCreate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void callActivityOnDestroy(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnDestroy(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnNewIntent(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        ((android.app.Instrumentation) real).callActivityOnNewIntent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void callActivityOnNewIntent(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.app.ComponentCaller arg2) {
        ((android.app.Instrumentation) real).callActivityOnNewIntent(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void callActivityOnPause(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnPause(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnPictureInPictureRequested(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnPictureInPictureRequested(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnPostCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Instrumentation) real).callActivityOnPostCreate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void callActivityOnPostCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        ((android.app.Instrumentation) real).callActivityOnPostCreate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void callActivityOnRestart(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnRestart(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnRestoreInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Instrumentation) real).callActivityOnRestoreInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void callActivityOnRestoreInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        ((android.app.Instrumentation) real).callActivityOnRestoreInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void callActivityOnResume(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnResume(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Instrumentation) real).callActivityOnSaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void callActivityOnSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        ((android.app.Instrumentation) real).callActivityOnSaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void callActivityOnStart(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnStart(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnStop(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnStop(arg0 == null ? null : arg0.getReal());
    }

    public void callActivityOnUserLeaving(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Instrumentation) real).callActivityOnUserLeaving(arg0 == null ? null : arg0.getReal());
    }

    public void callApplicationOnCreate(com.micklab.dcg.wrapper.android.app.Application arg0) {
        ((android.app.Instrumentation) real).callApplicationOnCreate(arg0 == null ? null : arg0.getReal());
    }

    public boolean checkMonitorHit(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0, int arg1) {
        return ((android.app.Instrumentation) real).checkMonitorHit(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void endPerformanceSnapshot() {
        ((android.app.Instrumentation) real).endPerformanceSnapshot();
    }

    public void finish(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Instrumentation) real).finish(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAllocCounts() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Instrumentation) real).getAllocCounts());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getBinderCounts() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Instrumentation) real).getBinderCounts());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.Instrumentation) real).getComponentName());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.Instrumentation) real).getContext());
    }

    public java.lang.String getProcessName() {
        return ((android.app.Instrumentation) real).getProcessName();
    }

    public com.micklab.dcg.wrapper.android.content.Context getTargetContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.Instrumentation) real).getTargetContext());
    }

    public com.micklab.dcg.wrapper.android.app.UiAutomation getUiAutomation() {
        return com.micklab.dcg.wrapper.android.app.UiAutomation.wrap(((android.app.Instrumentation) real).getUiAutomation());
    }

    public com.micklab.dcg.wrapper.android.app.UiAutomation getUiAutomation(int arg0) {
        return com.micklab.dcg.wrapper.android.app.UiAutomation.wrap(((android.app.Instrumentation) real).getUiAutomation(arg0));
    }

    public boolean invokeContextMenuAction(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2) {
        return ((android.app.Instrumentation) real).invokeContextMenuAction(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean invokeMenuActionSync(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2) {
        return ((android.app.Instrumentation) real).invokeMenuActionSync(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean isProfiling() {
        return ((android.app.Instrumentation) real).isProfiling();
    }

    public com.micklab.dcg.wrapper.android.app.Activity newActivity(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation) real).newActivity(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.Application newApplication(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(((android.app.Instrumentation) real).newApplication(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Instrumentation) real).onCreate(arg0 == null ? null : arg0.getReal());
    }

    public void onDestroy() {
        ((android.app.Instrumentation) real).onDestroy();
    }

    public boolean onException(java.lang.Object arg0, java.lang.Throwable arg1) {
        return ((android.app.Instrumentation) real).onException(arg0, arg1);
    }

    public void onStart() {
        ((android.app.Instrumentation) real).onStart();
    }

    public void removeMonitor(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0) {
        ((android.app.Instrumentation) real).removeMonitor(arg0 == null ? null : arg0.getReal());
    }

    public void resetInTouchMode() {
        ((android.app.Instrumentation) real).resetInTouchMode();
    }

    public void runOnMainSync(java.lang.Runnable arg0) {
        ((android.app.Instrumentation) real).runOnMainSync(arg0);
    }

    public void sendCharacterSync(int arg0) {
        ((android.app.Instrumentation) real).sendCharacterSync(arg0);
    }

    public void sendKeyDownUpSync(int arg0) {
        ((android.app.Instrumentation) real).sendKeyDownUpSync(arg0);
    }

    public void sendKeySync(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        ((android.app.Instrumentation) real).sendKeySync(arg0 == null ? null : arg0.getReal());
    }

    public void sendPointerSync(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.app.Instrumentation) real).sendPointerSync(arg0 == null ? null : arg0.getReal());
    }

    public void sendStatus(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Instrumentation) real).sendStatus(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void sendStringSync(java.lang.String arg0) {
        ((android.app.Instrumentation) real).sendStringSync(arg0);
    }

    public void sendTrackballEventSync(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.app.Instrumentation) real).sendTrackballEventSync(arg0 == null ? null : arg0.getReal());
    }

    public void setAutomaticPerformanceSnapshots() {
        ((android.app.Instrumentation) real).setAutomaticPerformanceSnapshots();
    }

    public void setInTouchMode(boolean arg0) {
        ((android.app.Instrumentation) real).setInTouchMode(arg0);
    }

    public void start() {
        ((android.app.Instrumentation) real).start();
    }

    public com.micklab.dcg.wrapper.android.app.Activity startActivitySync(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation) real).startActivitySync(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.Activity startActivitySync(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation) real).startActivitySync(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void startAllocCounting() {
        ((android.app.Instrumentation) real).startAllocCounting();
    }

    public void startPerformanceSnapshot() {
        ((android.app.Instrumentation) real).startPerformanceSnapshot();
    }

    public void startProfiling() {
        ((android.app.Instrumentation) real).startProfiling();
    }

    public void stopAllocCounting() {
        ((android.app.Instrumentation) real).stopAllocCounting();
    }

    public void stopProfiling() {
        ((android.app.Instrumentation) real).stopProfiling();
    }

    public void waitForIdle(java.lang.Runnable arg0) {
        ((android.app.Instrumentation) real).waitForIdle(arg0);
    }

    public void waitForIdleSync() {
        ((android.app.Instrumentation) real).waitForIdleSync();
    }

    public com.micklab.dcg.wrapper.android.app.Activity waitForMonitor(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation) real).waitForMonitor(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.Activity waitForMonitorWithTimeout(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation) real).waitForMonitorWithTimeout(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static final java.lang.String REPORT_KEY_IDENTIFIER = android.app.Instrumentation.REPORT_KEY_IDENTIFIER;
    public static final java.lang.String REPORT_KEY_STREAMRESULT = android.app.Instrumentation.REPORT_KEY_STREAMRESULT;

    public static final class ActivityMonitor {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ActivityMonitor(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor wrap(android.app.Instrumentation.ActivityMonitor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor(real, (__DcgwBridgeToken) null);
        }

        public android.app.Instrumentation.ActivityMonitor getReal() {
            return (android.app.Instrumentation.ActivityMonitor) real;
        }

        public android.app.Instrumentation.ActivityMonitor unwrap() {
            return getReal();
        }

        public ActivityMonitor() {
            this(new android.app.Instrumentation.ActivityMonitor(), (__DcgwBridgeToken) null);
        }

        public ActivityMonitor(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
            this(new android.app.Instrumentation.ActivityMonitor(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
        }

        public ActivityMonitor(com.micklab.dcg.wrapper.android.content.IntentFilter arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
            this(new android.app.Instrumentation.ActivityMonitor(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.content.IntentFilter getFilter() {
            return com.micklab.dcg.wrapper.android.content.IntentFilter.wrap(((android.app.Instrumentation.ActivityMonitor) real).getFilter());
        }

        public int getHits() {
            return ((android.app.Instrumentation.ActivityMonitor) real).getHits();
        }

        public com.micklab.dcg.wrapper.android.app.Activity getLastActivity() {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation.ActivityMonitor) real).getLastActivity());
        }

        public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult getResult() {
            return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult.wrap(((android.app.Instrumentation.ActivityMonitor) real).getResult());
        }

        public boolean isBlocking() {
            return ((android.app.Instrumentation.ActivityMonitor) real).isBlocking();
        }

        public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult onStartActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult.wrap(((android.app.Instrumentation.ActivityMonitor) real).onStartActivity(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.Activity waitForActivity() {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation.ActivityMonitor) real).waitForActivity());
        }

        public com.micklab.dcg.wrapper.android.app.Activity waitForActivityWithTimeout(long arg0) {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Instrumentation.ActivityMonitor) real).waitForActivityWithTimeout(arg0));
        }

    }
    public static final class ActivityResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ActivityResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult wrap(android.app.Instrumentation.ActivityResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult(real, (__DcgwBridgeToken) null);
        }

        public android.app.Instrumentation.ActivityResult getReal() {
            return (android.app.Instrumentation.ActivityResult) real;
        }

        public android.app.Instrumentation.ActivityResult unwrap() {
            return getReal();
        }

        public ActivityResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
            this(new android.app.Instrumentation.ActivityResult(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public int getResultCode() {
            return ((android.app.Instrumentation.ActivityResult) real).getResultCode();
        }

        public com.micklab.dcg.wrapper.android.content.Intent getResultData() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.app.Instrumentation.ActivityResult) real).getResultData());
        }

    }
}
