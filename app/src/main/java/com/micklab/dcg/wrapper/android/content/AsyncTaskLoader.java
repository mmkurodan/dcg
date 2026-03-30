// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AsyncTaskLoader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AsyncTaskLoader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AsyncTaskLoader wrap(android.content.AsyncTaskLoader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AsyncTaskLoader(real, (__DcgwBridgeToken) null);
    }

    public android.content.AsyncTaskLoader getReal() {
        return (android.content.AsyncTaskLoader) real;
    }

    public android.content.AsyncTaskLoader unwrap() {
        return getReal();
    }

    public void cancelLoadInBackground() {
        ((android.content.AsyncTaskLoader) real).cancelLoadInBackground();
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.content.AsyncTaskLoader) real).dump(arg0, arg1, arg2, arg3);
    }

    public boolean isLoadInBackgroundCanceled() {
        return ((android.content.AsyncTaskLoader) real).isLoadInBackgroundCanceled();
    }

    public java.lang.Object loadInBackground() {
        return ((android.content.AsyncTaskLoader) real).loadInBackground();
    }

    public void onCanceled(java.lang.Object arg0) {
        ((android.content.AsyncTaskLoader) real).onCanceled(arg0);
    }

    public void setUpdateThrottle(long arg0) {
        ((android.content.AsyncTaskLoader) real).setUpdateThrottle(arg0);
    }

}
