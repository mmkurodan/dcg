// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AsyncTaskLoader {
    private final android.content.AsyncTaskLoader real;

    public AsyncTaskLoader(android.content.AsyncTaskLoader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AsyncTaskLoader wrap(android.content.AsyncTaskLoader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AsyncTaskLoader(real);
    }

    public android.content.AsyncTaskLoader unwrap() {
        return real;
    }

    public void cancelLoadInBackground() {
        real.cancelLoadInBackground();
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public boolean isLoadInBackgroundCanceled() {
        return real.isLoadInBackgroundCanceled();
    }

    public java.lang.Object loadInBackground() {
        return real.loadInBackground();
    }

    public void onCanceled(java.lang.Object arg0) {
        real.onCanceled(arg0);
    }

    public void setUpdateThrottle(long arg0) {
        real.setUpdateThrottle(arg0);
    }

}
