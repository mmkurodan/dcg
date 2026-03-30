// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AsyncQueryHandler {
    private final android.content.AsyncQueryHandler real;

    public AsyncQueryHandler(android.content.AsyncQueryHandler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AsyncQueryHandler wrap(android.content.AsyncQueryHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AsyncQueryHandler(real);
    }

    public android.content.AsyncQueryHandler unwrap() {
        return real;
    }

    public void cancelOperation(int arg0) {
        real.cancelOperation(arg0);
    }

    public void handleMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        real.handleMessage(arg0 == null ? null : arg0.unwrap());
    }

    public void startDelete(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String arg3, java.lang.String[] arg4) {
        real.startDelete(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4);
    }

    public void startInsert(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.content.ContentValues arg3) {
        real.startInsert(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void startQuery(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String[] arg3, java.lang.String arg4, java.lang.String[] arg5, java.lang.String arg6) {
        real.startQuery(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6);
    }

    public void startUpdate(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.content.ContentValues arg3, java.lang.String arg4, java.lang.String[] arg5) {
        real.startUpdate(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

}
