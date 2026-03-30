// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RenderScript {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RenderScript(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript wrap(android.renderscript.RenderScript real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.RenderScript getReal() {
        return (android.renderscript.RenderScript) real;
    }

    public android.renderscript.RenderScript unwrap() {
        return getReal();
    }

    public void contextDump() {
        ((android.renderscript.RenderScript) real).contextDump();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript create(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.create(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript createMultiContext(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.createMultiContext(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public void destroy() {
        ((android.renderscript.RenderScript) real).destroy();
    }

    public void finish() {
        ((android.renderscript.RenderScript) real).finish();
    }

    public com.micklab.dcg.wrapper.android.content.Context getApplicationContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.renderscript.RenderScript) real).getApplicationContext());
    }

    public com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler getErrorHandler() {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler.wrap(((android.renderscript.RenderScript) real).getErrorHandler());
    }

    public com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler getMessageHandler() {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler.wrap(((android.renderscript.RenderScript) real).getMessageHandler());
    }

    public static long getMinorVersion() {
        return android.renderscript.RenderScript.getMinorVersion();
    }

    public static void releaseAllContexts() {
        android.renderscript.RenderScript.releaseAllContexts();
    }

    public void sendMessage(int arg0, int[] arg1) {
        ((android.renderscript.RenderScript) real).sendMessage(arg0, arg1);
    }

    public void setErrorHandler(com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler arg0) {
        ((android.renderscript.RenderScript) real).setErrorHandler(arg0 == null ? null : arg0.getReal());
    }

    public void setMessageHandler(com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler arg0) {
        ((android.renderscript.RenderScript) real).setMessageHandler(arg0 == null ? null : arg0.getReal());
    }

    public void setPriority(com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority arg0) {
        ((android.renderscript.RenderScript) real).setPriority(arg0 == null ? null : arg0.getReal());
    }

    public static final int CREATE_FLAG_LOW_LATENCY = android.renderscript.RenderScript.CREATE_FLAG_LOW_LATENCY;
    public static final int CREATE_FLAG_LOW_POWER = android.renderscript.RenderScript.CREATE_FLAG_LOW_POWER;
    public static final int CREATE_FLAG_NONE = android.renderscript.RenderScript.CREATE_FLAG_NONE;

    public static final class ContextType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ContextType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType wrap(android.renderscript.RenderScript.ContextType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.RenderScript.ContextType getReal() {
            return (android.renderscript.RenderScript.ContextType) real;
        }

        public android.renderscript.RenderScript.ContextType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType.wrap(android.renderscript.RenderScript.ContextType.valueOf(arg0));
        }

        public static android.renderscript.RenderScript.ContextType[] values() {
            return android.renderscript.RenderScript.ContextType.values();
        }

        public static final com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType DEBUG = com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType.wrap(android.renderscript.RenderScript.ContextType.DEBUG);
        public static final com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType NORMAL = com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType.wrap(android.renderscript.RenderScript.ContextType.NORMAL);

    }
    public static final class Priority {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Priority(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority wrap(android.renderscript.RenderScript.Priority real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.RenderScript.Priority getReal() {
            return (android.renderscript.RenderScript.Priority) real;
        }

        public android.renderscript.RenderScript.Priority unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority.wrap(android.renderscript.RenderScript.Priority.valueOf(arg0));
        }

        public static android.renderscript.RenderScript.Priority[] values() {
            return android.renderscript.RenderScript.Priority.values();
        }

        public static final com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority LOW = com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority.wrap(android.renderscript.RenderScript.Priority.LOW);
        public static final com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority NORMAL = com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority.wrap(android.renderscript.RenderScript.Priority.NORMAL);

    }
    public static final class RSErrorHandler {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RSErrorHandler(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler wrap(android.renderscript.RenderScript.RSErrorHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.RenderScript.RSErrorHandler getReal() {
            return (android.renderscript.RenderScript.RSErrorHandler) real;
        }

        public android.renderscript.RenderScript.RSErrorHandler unwrap() {
            return getReal();
        }

        public RSErrorHandler() {
            this(new android.renderscript.RenderScript.RSErrorHandler(), (__DcgwBridgeToken) null);
        }

        public void run() {
            ((android.renderscript.RenderScript.RSErrorHandler) real).run();
        }


    }
    public static final class RSMessageHandler {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RSMessageHandler(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler wrap(android.renderscript.RenderScript.RSMessageHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.RenderScript.RSMessageHandler getReal() {
            return (android.renderscript.RenderScript.RSMessageHandler) real;
        }

        public android.renderscript.RenderScript.RSMessageHandler unwrap() {
            return getReal();
        }

        public RSMessageHandler() {
            this(new android.renderscript.RenderScript.RSMessageHandler(), (__DcgwBridgeToken) null);
        }

        public void run() {
            ((android.renderscript.RenderScript.RSMessageHandler) real).run();
        }


    }
}
