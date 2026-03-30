// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Application {
    private final android.app.Application real;

    public Application(android.app.Application real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Application wrap(android.app.Application real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Application(real);
    }

    public android.app.Application unwrap() {
        return real;
    }

    public Application() {
        this(new android.app.Application());
    }

    public static java.lang.String getProcessName() {
        return android.app.Application.getProcessName();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public void onTerminate() {
        real.onTerminate();
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public void registerActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        real.registerActivityLifecycleCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.registerComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void registerOnProvideAssistDataListener(com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener arg0) {
        real.registerOnProvideAssistDataListener(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterActivityLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks arg0) {
        real.unregisterActivityLifecycleCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.unregisterComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterOnProvideAssistDataListener(com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener arg0) {
        real.unregisterOnProvideAssistDataListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class ActivityLifecycleCallbacks {
        private final android.app.Application.ActivityLifecycleCallbacks real;

        public ActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks wrap(android.app.Application.ActivityLifecycleCallbacks real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Application.ActivityLifecycleCallbacks(real);
        }

        public android.app.Application.ActivityLifecycleCallbacks unwrap() {
            return real;
        }

        public void onActivityCreated(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onActivityCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onActivityDestroyed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityDestroyed(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPaused(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPaused(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPostCreated(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onActivityPostCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onActivityPostDestroyed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPostDestroyed(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPostPaused(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPostPaused(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPostResumed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPostResumed(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPostSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onActivityPostSaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onActivityPostStarted(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPostStarted(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPostStopped(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPostStopped(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPreCreated(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onActivityPreCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onActivityPreDestroyed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPreDestroyed(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPrePaused(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPrePaused(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPreResumed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPreResumed(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPreSaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onActivityPreSaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onActivityPreStarted(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPreStarted(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityPreStopped(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityPreStopped(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityResumed(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityResumed(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivitySaveInstanceState(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onActivitySaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onActivityStarted(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityStarted(arg0 == null ? null : arg0.unwrap());
        }

        public void onActivityStopped(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onActivityStopped(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnProvideAssistDataListener {
        private final android.app.Application.OnProvideAssistDataListener real;

        public OnProvideAssistDataListener(android.app.Application.OnProvideAssistDataListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener wrap(android.app.Application.OnProvideAssistDataListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Application.OnProvideAssistDataListener(real);
        }

        public android.app.Application.OnProvideAssistDataListener unwrap() {
            return real;
        }

        public void onProvideAssistData(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onProvideAssistData(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
