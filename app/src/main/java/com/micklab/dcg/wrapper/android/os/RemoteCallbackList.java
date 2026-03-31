// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class RemoteCallbackList {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteCallbackList(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.RemoteCallbackList wrap(android.os.RemoteCallbackList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.RemoteCallbackList(real, (__DcgwBridgeToken) null);
    }

    public android.os.RemoteCallbackList getReal() {
        return (android.os.RemoteCallbackList) real;
    }

    public android.os.RemoteCallbackList unwrap() {
        return getReal();
    }

    public RemoteCallbackList() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#android.os.RemoteCallbackList()");
    }

    public int beginBroadcast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#beginBroadcast()");
    }

    public void finishBroadcast() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#finishBroadcast()");
    }

    public java.lang.Object getBroadcastCookie(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getBroadcastCookie(int)");
    }

    public com.micklab.dcg.wrapper.android.os.IInterface getBroadcastItem(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getBroadcastItem(int)");
    }

    public java.util.concurrent.Executor getExecutor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getExecutor()");
    }

    public int getFrozenCalleePolicy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getFrozenCalleePolicy()");
    }

    public int getMaxQueueSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getMaxQueueSize()");
    }

    public java.lang.Object getRegisteredCallbackCookie(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getRegisteredCallbackCookie(int)");
    }

    public int getRegisteredCallbackCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getRegisteredCallbackCount()");
    }

    public com.micklab.dcg.wrapper.android.os.IInterface getRegisteredCallbackItem(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#getRegisteredCallbackItem(int)");
    }

    public void kill() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#kill()");
    }

    public void onCallbackDied(com.micklab.dcg.wrapper.android.os.IInterface arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#onCallbackDied(android.os.IInterface)");
    }

    public void onCallbackDied(com.micklab.dcg.wrapper.android.os.IInterface arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#onCallbackDied(android.os.IInterface,java.lang.Object)");
    }

    public boolean register(com.micklab.dcg.wrapper.android.os.IInterface arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#register(android.os.IInterface)");
    }

    public boolean register(com.micklab.dcg.wrapper.android.os.IInterface arg0, java.lang.Object arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#register(android.os.IInterface,java.lang.Object)");
    }

    public boolean unregister(com.micklab.dcg.wrapper.android.os.IInterface arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList#unregister(android.os.IInterface)");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.RemoteCallbackList.Builder wrap(android.os.RemoteCallbackList.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.RemoteCallbackList.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.os.RemoteCallbackList.Builder getReal() {
            return (android.os.RemoteCallbackList.Builder) real;
        }

        public android.os.RemoteCallbackList.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.RemoteCallbackList$Builder#android.os.RemoteCallbackList$Builder(int)");
        }

        public static final class InterfaceDiedCallback {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private InterfaceDiedCallback(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.os.RemoteCallbackList.Builder.InterfaceDiedCallback wrap(android.os.RemoteCallbackList.Builder.InterfaceDiedCallback real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.os.RemoteCallbackList.Builder.InterfaceDiedCallback(real, (__DcgwBridgeToken) null);
            }

            public android.os.RemoteCallbackList.Builder.InterfaceDiedCallback getReal() {
                return (android.os.RemoteCallbackList.Builder.InterfaceDiedCallback) real;
            }

            public android.os.RemoteCallbackList.Builder.InterfaceDiedCallback unwrap() {
                return getReal();
            }

        }
    }
}
