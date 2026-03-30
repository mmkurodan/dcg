// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Handler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Handler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Handler wrap(android.os.Handler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Handler(real, (__DcgwBridgeToken) null);
    }

    public android.os.Handler getReal() {
        return (android.os.Handler) real;
    }

    public android.os.Handler unwrap() {
        return getReal();
    }

    public Handler() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#android.os.Handler()");
    }

    public Handler(com.micklab.dcg.wrapper.android.os.Looper arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#android.os.Handler(android.os.Looper)");
    }

    public Handler(com.micklab.dcg.wrapper.android.os.Handler.Callback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#android.os.Handler(android.os.Handler$Callback)");
    }

    public Handler(com.micklab.dcg.wrapper.android.os.Looper arg0, com.micklab.dcg.wrapper.android.os.Handler.Callback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#android.os.Handler(android.os.Looper,android.os.Handler$Callback)");
    }

    public static com.micklab.dcg.wrapper.android.os.Handler createAsync(com.micklab.dcg.wrapper.android.os.Looper arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#createAsync(android.os.Looper)");
    }

    public static com.micklab.dcg.wrapper.android.os.Handler createAsync(com.micklab.dcg.wrapper.android.os.Looper arg0, com.micklab.dcg.wrapper.android.os.Handler.Callback arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#createAsync(android.os.Looper,android.os.Handler$Callback)");
    }

    public void dispatchMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#dispatchMessage(android.os.Message)");
    }

    public void dump(com.micklab.dcg.wrapper.android.util.Printer arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#dump(android.util.Printer,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.Looper getLooper() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#getLooper()");
    }

    public java.lang.String getMessageName(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#getMessageName(android.os.Message)");
    }

    public void handleMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#handleMessage(android.os.Message)");
    }

    public boolean hasCallbacks(java.lang.Runnable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#hasCallbacks(java.lang.Runnable)");
    }

    public boolean hasMessages(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#hasMessages(int)");
    }

    public boolean hasMessages(int arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#hasMessages(int,java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.os.Message obtainMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#obtainMessage()");
    }

    public com.micklab.dcg.wrapper.android.os.Message obtainMessage(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#obtainMessage(int)");
    }

    public com.micklab.dcg.wrapper.android.os.Message obtainMessage(int arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#obtainMessage(int,java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.os.Message obtainMessage(int arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#obtainMessage(int,int,int)");
    }

    public com.micklab.dcg.wrapper.android.os.Message obtainMessage(int arg0, int arg1, int arg2, java.lang.Object arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#obtainMessage(int,int,int,java.lang.Object)");
    }

    public boolean post(java.lang.Runnable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#post(java.lang.Runnable)");
    }

    public boolean postAtFrontOfQueue(java.lang.Runnable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#postAtFrontOfQueue(java.lang.Runnable)");
    }

    public boolean postAtTime(java.lang.Runnable arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#postAtTime(java.lang.Runnable,long)");
    }

    public boolean postAtTime(java.lang.Runnable arg0, java.lang.Object arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#postAtTime(java.lang.Runnable,java.lang.Object,long)");
    }

    public boolean postDelayed(java.lang.Runnable arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#postDelayed(java.lang.Runnable,long)");
    }

    public boolean postDelayed(java.lang.Runnable arg0, java.lang.Object arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#postDelayed(java.lang.Runnable,java.lang.Object,long)");
    }

    public void removeCallbacks(java.lang.Runnable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#removeCallbacks(java.lang.Runnable)");
    }

    public void removeCallbacks(java.lang.Runnable arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#removeCallbacks(java.lang.Runnable,java.lang.Object)");
    }

    public void removeCallbacksAndMessages(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#removeCallbacksAndMessages(java.lang.Object)");
    }

    public void removeMessages(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#removeMessages(int)");
    }

    public void removeMessages(int arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#removeMessages(int,java.lang.Object)");
    }

    public boolean sendEmptyMessage(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendEmptyMessage(int)");
    }

    public boolean sendEmptyMessageAtTime(int arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendEmptyMessageAtTime(int,long)");
    }

    public boolean sendEmptyMessageDelayed(int arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendEmptyMessageDelayed(int,long)");
    }

    public boolean sendMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendMessage(android.os.Message)");
    }

    public boolean sendMessageAtFrontOfQueue(com.micklab.dcg.wrapper.android.os.Message arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendMessageAtFrontOfQueue(android.os.Message)");
    }

    public boolean sendMessageAtTime(com.micklab.dcg.wrapper.android.os.Message arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendMessageAtTime(android.os.Message,long)");
    }

    public boolean sendMessageDelayed(com.micklab.dcg.wrapper.android.os.Message arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#sendMessageDelayed(android.os.Message,long)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler#toString()");
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.Handler.Callback wrap(android.os.Handler.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.Handler.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.os.Handler.Callback getReal() {
            return (android.os.Handler.Callback) real;
        }

        public android.os.Handler.Callback unwrap() {
            return getReal();
        }

        public boolean handleMessage(com.micklab.dcg.wrapper.android.os.Message arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Handler$Callback#handleMessage(android.os.Message)");
        }

    }
}
