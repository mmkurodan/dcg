// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class AsyncQueryHandler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AsyncQueryHandler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.AsyncQueryHandler wrap(android.content.AsyncQueryHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.AsyncQueryHandler(real, (__DcgwBridgeToken) null);
    }

    public android.content.AsyncQueryHandler getReal() {
        return (android.content.AsyncQueryHandler) real;
    }

    public android.content.AsyncQueryHandler unwrap() {
        return getReal();
    }

    public void cancelOperation(int arg0) {
        ((android.content.AsyncQueryHandler) real).cancelOperation(arg0);
    }

    public void handleMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        ((android.content.AsyncQueryHandler) real).handleMessage(arg0 == null ? null : arg0.getReal());
    }

    public void startDelete(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String arg3, java.lang.String[] arg4) {
        ((android.content.AsyncQueryHandler) real).startDelete(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4);
    }

    public void startInsert(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.content.ContentValues arg3) {
        ((android.content.AsyncQueryHandler) real).startInsert(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void startQuery(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, java.lang.String[] arg3, java.lang.String arg4, java.lang.String[] arg5, java.lang.String arg6) {
        ((android.content.AsyncQueryHandler) real).startQuery(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6);
    }

    public void startUpdate(int arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.content.ContentValues arg3, java.lang.String arg4, java.lang.String[] arg5) {
        ((android.content.AsyncQueryHandler) real).startUpdate(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5);
    }

}
