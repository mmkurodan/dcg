// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LoaderManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LoaderManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LoaderManager wrap(android.app.LoaderManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LoaderManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.LoaderManager getReal() {
        return (android.app.LoaderManager) real;
    }

    public android.app.LoaderManager unwrap() {
        return getReal();
    }

    public void destroyLoader(int arg0) {
        ((android.app.LoaderManager) real).destroyLoader(arg0);
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.LoaderManager) real).dump(arg0, arg1, arg2, arg3);
    }

    public static void enableDebugLogging(boolean arg0) {
        android.app.LoaderManager.enableDebugLogging(arg0);
    }

    public static final class LoaderCallbacks {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LoaderCallbacks(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.LoaderManager.LoaderCallbacks wrap(android.app.LoaderManager.LoaderCallbacks real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.LoaderManager.LoaderCallbacks(real, (__DcgwBridgeToken) null);
        }

        public android.app.LoaderManager.LoaderCallbacks getReal() {
            return (android.app.LoaderManager.LoaderCallbacks) real;
        }

        public android.app.LoaderManager.LoaderCallbacks unwrap() {
            return getReal();
        }

    }
}
