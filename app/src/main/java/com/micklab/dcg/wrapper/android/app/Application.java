// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Application {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Application(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Application wrap(android.app.Application real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Application(real, (__DcgwBridgeToken) null);
    }

    public android.app.Application getReal() {
        return (android.app.Application) real;
    }

    public android.app.Application unwrap() {
        return getReal();
    }

    public Application() {
        this(new android.app.Application(), (__DcgwBridgeToken) null);
    }

    public static java.lang.String getProcessName() {
        return android.app.Application.getProcessName();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.app.Application) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate() {
        ((android.app.Application) real).onCreate();
    }

    public void onLowMemory() {
        ((android.app.Application) real).onLowMemory();
    }

    public void onTerminate() {
        ((android.app.Application) real).onTerminate();
    }

    public void onTrimMemory(int arg0) {
        ((android.app.Application) real).onTrimMemory(arg0);
    }

    public void registerActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        ((android.app.Application) real).registerActivityLifecycleCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.app.Application) real).registerComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void registerOnProvideAssistDataListener(com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener arg0) {
        ((android.app.Application) real).registerOnProvideAssistDataListener(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        ((android.app.Application) real).unregisterActivityLifecycleCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.app.Application) real).unregisterComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterOnProvideAssistDataListener(com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener arg0) {
        ((android.app.Application) real).unregisterOnProvideAssistDataListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class ActivityLifecycleCallbacks {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ActivityLifecycleCallbacks(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks wrap(android.app.Application.ActivityLifecycleCallbacks real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks(real, (__DcgwBridgeToken) null);
        }

        public android.app.Application.ActivityLifecycleCallbacks getReal() {
            return (android.app.Application.ActivityLifecycleCallbacks) real;
        }

        public android.app.Application.ActivityLifecycleCallbacks unwrap() {
            return getReal();
        }

        public void onActivityCreated(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onActivityDestroyed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPaused(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPaused(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPostCreated(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onActivityPostDestroyed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPostPaused(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostPaused(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPostResumed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostResumed(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPostSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostSaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onActivityPostStarted(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostStarted(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPostStopped(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPostStopped(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPreCreated(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPreCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onActivityPreDestroyed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPreDestroyed(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPrePaused(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPrePaused(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPreResumed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPreResumed(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPreSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPreSaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onActivityPreStarted(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPreStarted(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityPreStopped(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityPreStopped(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityResumed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityResumed(arg0 == null ? null : arg0.getReal());
        }

        public void onActivitySaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivitySaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onActivityStarted(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityStarted(arg0 == null ? null : arg0.getReal());
        }

        public void onActivityStopped(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.Application.ActivityLifecycleCallbacks) real).onActivityStopped(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnProvideAssistDataListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnProvideAssistDataListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener wrap(android.app.Application.OnProvideAssistDataListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.Application.OnProvideAssistDataListener getReal() {
            return (android.app.Application.OnProvideAssistDataListener) real;
        }

        public android.app.Application.OnProvideAssistDataListener unwrap() {
            return getReal();
        }

        public void onProvideAssistData(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.Application.OnProvideAssistDataListener) real).onProvideAssistData(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
