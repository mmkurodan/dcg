// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Instrumentation {
    private final android.app.Instrumentation real;

    public Instrumentation(android.app.Instrumentation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Instrumentation wrap(android.app.Instrumentation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Instrumentation(real);
    }

    public android.app.Instrumentation unwrap() {
        return real;
    }

    public Instrumentation() {
        this(new android.app.Instrumentation());
    }

    public com.micklab.dcg.wrapper.android.os.TestLooperManager acquireLooperManager(com.micklab.dcg.wrapper.android.os.Looper arg0) {
        return com.micklab.dcg.wrapper.android.os.TestLooperManager.wrap(real.acquireLooperManager(arg0 == null ? null : arg0.unwrap()));
    }

    public void addMonitor(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0) {
        real.addMonitor(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor addMonitor(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor.wrap(real.addMonitor(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor addMonitor(com.micklab.dcg.wrapper.android.content.IntentFilter arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
        return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor.wrap(real.addMonitor(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void addResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.addResults(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.callActivityOnCreate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void callActivityOnCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.callActivityOnCreate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void callActivityOnDestroy(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnDestroy(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnNewIntent(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        real.callActivityOnNewIntent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void callActivityOnNewIntent(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.app.ComponentCaller arg2) {
        real.callActivityOnNewIntent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void callActivityOnPause(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnPause(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnPictureInPictureRequested(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnPictureInPictureRequested(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnPostCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.callActivityOnPostCreate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void callActivityOnPostCreate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.callActivityOnPostCreate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void callActivityOnRestart(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnRestart(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnRestoreInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.callActivityOnRestoreInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void callActivityOnRestoreInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.callActivityOnRestoreInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void callActivityOnResume(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnResume(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.callActivityOnSaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void callActivityOnSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.callActivityOnSaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void callActivityOnStart(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnStart(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnStop(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnStop(arg0 == null ? null : arg0.unwrap());
    }

    public void callActivityOnUserLeaving(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.callActivityOnUserLeaving(arg0 == null ? null : arg0.unwrap());
    }

    public void callApplicationOnCreate(com.micklab.dcg.wrapper.android.app.Application arg0) {
        real.callApplicationOnCreate(arg0 == null ? null : arg0.unwrap());
    }

    public boolean checkMonitorHit(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0, int arg1) {
        return real.checkMonitorHit(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void endPerformanceSnapshot() {
        real.endPerformanceSnapshot();
    }

    public void finish(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.finish(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getAllocCounts() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getAllocCounts());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getBinderCounts() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getBinderCounts());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getComponentName());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public java.lang.String getProcessName() {
        return real.getProcessName();
    }

    public com.micklab.dcg.wrapper.android.content.Context getTargetContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getTargetContext());
    }

    public com.micklab.dcg.wrapper.android.app.UiAutomation getUiAutomation() {
        return com.micklab.dcg.wrapper.android.app.UiAutomation.wrap(real.getUiAutomation());
    }

    public com.micklab.dcg.wrapper.android.app.UiAutomation getUiAutomation(int arg0) {
        return com.micklab.dcg.wrapper.android.app.UiAutomation.wrap(real.getUiAutomation(arg0));
    }

    public boolean invokeContextMenuAction(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2) {
        return real.invokeContextMenuAction(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean invokeMenuActionSync(com.micklab.dcg.wrapper.android.app.Activity arg0, int arg1, int arg2) {
        return real.invokeMenuActionSync(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean isProfiling() {
        return real.isProfiling();
    }

    public com.micklab.dcg.wrapper.android.app.Activity newActivity(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.newActivity(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.Application newApplication(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Context arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(real.newApplication(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onCreate(arg0 == null ? null : arg0.unwrap());
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public boolean onException(java.lang.Object arg0, java.lang.Throwable arg1) {
        return real.onException(arg0, arg1);
    }

    public void onStart() {
        real.onStart();
    }

    public void removeMonitor(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0) {
        real.removeMonitor(arg0 == null ? null : arg0.unwrap());
    }

    public void resetInTouchMode() {
        real.resetInTouchMode();
    }

    public void runOnMainSync(java.lang.Runnable arg0) {
        real.runOnMainSync(arg0);
    }

    public void sendCharacterSync(int arg0) {
        real.sendCharacterSync(arg0);
    }

    public void sendKeyDownUpSync(int arg0) {
        real.sendKeyDownUpSync(arg0);
    }

    public void sendKeySync(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        real.sendKeySync(arg0 == null ? null : arg0.unwrap());
    }

    public void sendPointerSync(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.sendPointerSync(arg0 == null ? null : arg0.unwrap());
    }

    public void sendStatus(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendStatus(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void sendStringSync(java.lang.String arg0) {
        real.sendStringSync(arg0);
    }

    public void sendTrackballEventSync(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.sendTrackballEventSync(arg0 == null ? null : arg0.unwrap());
    }

    public void setAutomaticPerformanceSnapshots() {
        real.setAutomaticPerformanceSnapshots();
    }

    public void setInTouchMode(boolean arg0) {
        real.setInTouchMode(arg0);
    }

    public void start() {
        real.start();
    }

    public com.micklab.dcg.wrapper.android.app.Activity startActivitySync(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.startActivitySync(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.Activity startActivitySync(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.startActivitySync(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void startAllocCounting() {
        real.startAllocCounting();
    }

    public void startPerformanceSnapshot() {
        real.startPerformanceSnapshot();
    }

    public void startProfiling() {
        real.startProfiling();
    }

    public void stopAllocCounting() {
        real.stopAllocCounting();
    }

    public void stopProfiling() {
        real.stopProfiling();
    }

    public void waitForIdle(java.lang.Runnable arg0) {
        real.waitForIdle(arg0);
    }

    public void waitForIdleSync() {
        real.waitForIdleSync();
    }

    public com.micklab.dcg.wrapper.android.app.Activity waitForMonitor(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.waitForMonitor(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.Activity waitForMonitorWithTimeout(com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor arg0, long arg1) {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.waitForMonitorWithTimeout(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static final java.lang.String REPORT_KEY_IDENTIFIER = android.app.Instrumentation.REPORT_KEY_IDENTIFIER;
    public static final java.lang.String REPORT_KEY_STREAMRESULT = android.app.Instrumentation.REPORT_KEY_STREAMRESULT;

    public static final class ActivityMonitor {
        private final android.app.Instrumentation.ActivityMonitor real;

        public ActivityMonitor(android.app.Instrumentation.ActivityMonitor real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor wrap(android.app.Instrumentation.ActivityMonitor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityMonitor(real);
        }

        public android.app.Instrumentation.ActivityMonitor unwrap() {
            return real;
        }

        public ActivityMonitor() {
            this(new android.app.Instrumentation.ActivityMonitor());
        }

        public ActivityMonitor(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
            this(new android.app.Instrumentation.ActivityMonitor(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public ActivityMonitor(com.micklab.dcg.wrapper.android.content.IntentFilter arg0, com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult arg1, boolean arg2) {
            this(new android.app.Instrumentation.ActivityMonitor(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.content.IntentFilter getFilter() {
            return com.micklab.dcg.wrapper.android.content.IntentFilter.wrap(real.getFilter());
        }

        public int getHits() {
            return real.getHits();
        }

        public com.micklab.dcg.wrapper.android.app.Activity getLastActivity() {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getLastActivity());
        }

        public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult getResult() {
            return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult.wrap(real.getResult());
        }

        public boolean isBlocking() {
            return real.isBlocking();
        }

        public com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult onStartActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult.wrap(real.onStartActivity(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Activity waitForActivity() {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.waitForActivity());
        }

        public com.micklab.dcg.wrapper.android.app.Activity waitForActivityWithTimeout(long arg0) {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.waitForActivityWithTimeout(arg0));
        }

    }
    public static final class ActivityResult {
        private final android.app.Instrumentation.ActivityResult real;

        public ActivityResult(android.app.Instrumentation.ActivityResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult wrap(android.app.Instrumentation.ActivityResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Instrumentation.ActivityResult(real);
        }

        public android.app.Instrumentation.ActivityResult unwrap() {
            return real;
        }

        public ActivityResult(int arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
            this(new android.app.Instrumentation.ActivityResult(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public int getResultCode() {
            return real.getResultCode();
        }

        public com.micklab.dcg.wrapper.android.content.Intent getResultData() {
            return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.getResultData());
        }

    }
}
