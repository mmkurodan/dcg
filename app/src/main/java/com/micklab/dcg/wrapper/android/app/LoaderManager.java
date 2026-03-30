// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LoaderManager {
    private final android.app.LoaderManager real;

    public LoaderManager(android.app.LoaderManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LoaderManager wrap(android.app.LoaderManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LoaderManager(real);
    }

    public android.app.LoaderManager unwrap() {
        return real;
    }

    public void destroyLoader(int arg0) {
        real.destroyLoader(arg0);
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public static void enableDebugLogging(boolean arg0) {
        android.app.LoaderManager.enableDebugLogging(arg0);
    }

    public static final class LoaderCallbacks {
        private final android.app.LoaderManager.LoaderCallbacks real;

        public LoaderCallbacks(android.app.LoaderManager.LoaderCallbacks real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.LoaderManager.LoaderCallbacks wrap(android.app.LoaderManager.LoaderCallbacks real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.LoaderManager.LoaderCallbacks(real);
        }

        public android.app.LoaderManager.LoaderCallbacks unwrap() {
            return real;
        }

    }
}
