// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RenderScript {
    private final android.renderscript.RenderScript real;

    public RenderScript(android.renderscript.RenderScript real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript wrap(android.renderscript.RenderScript real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript(real);
    }

    public android.renderscript.RenderScript unwrap() {
        return real;
    }

    public void contextDump() {
        real.contextDump();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript create(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.create(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript create(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RenderScript createMultiContext(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.wrap(android.renderscript.RenderScript.createMultiContext(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void destroy() {
        real.destroy();
    }

    public void finish() {
        real.finish();
    }

    public com.micklab.dcg.wrapper.android.content.Context getApplicationContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getApplicationContext());
    }

    public com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler getErrorHandler() {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler.wrap(real.getErrorHandler());
    }

    public com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler getMessageHandler() {
        return com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler.wrap(real.getMessageHandler());
    }

    public static long getMinorVersion() {
        return android.renderscript.RenderScript.getMinorVersion();
    }

    public static void releaseAllContexts() {
        android.renderscript.RenderScript.releaseAllContexts();
    }

    public void sendMessage(int arg0, int[] arg1) {
        real.sendMessage(arg0, arg1);
    }

    public void setErrorHandler(com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler arg0) {
        real.setErrorHandler(arg0 == null ? null : arg0.unwrap());
    }

    public void setMessageHandler(com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler arg0) {
        real.setMessageHandler(arg0 == null ? null : arg0.unwrap());
    }

    public void setPriority(com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority arg0) {
        real.setPriority(arg0 == null ? null : arg0.unwrap());
    }

    public static final int CREATE_FLAG_LOW_LATENCY = android.renderscript.RenderScript.CREATE_FLAG_LOW_LATENCY;
    public static final int CREATE_FLAG_LOW_POWER = android.renderscript.RenderScript.CREATE_FLAG_LOW_POWER;
    public static final int CREATE_FLAG_NONE = android.renderscript.RenderScript.CREATE_FLAG_NONE;

    public static final class ContextType {
        private final android.renderscript.RenderScript.ContextType real;

        public ContextType(android.renderscript.RenderScript.ContextType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType wrap(android.renderscript.RenderScript.ContextType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.ContextType(real);
        }

        public android.renderscript.RenderScript.ContextType unwrap() {
            return real;
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
        private final android.renderscript.RenderScript.Priority real;

        public Priority(android.renderscript.RenderScript.Priority real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority wrap(android.renderscript.RenderScript.Priority real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.Priority(real);
        }

        public android.renderscript.RenderScript.Priority unwrap() {
            return real;
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
        private final android.renderscript.RenderScript.RSErrorHandler real;

        public RSErrorHandler(android.renderscript.RenderScript.RSErrorHandler real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler wrap(android.renderscript.RenderScript.RSErrorHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSErrorHandler(real);
        }

        public android.renderscript.RenderScript.RSErrorHandler unwrap() {
            return real;
        }

        public RSErrorHandler() {
            this(new android.renderscript.RenderScript.RSErrorHandler());
        }

        public void run() {
            real.run();
        }


    }
    public static final class RSMessageHandler {
        private final android.renderscript.RenderScript.RSMessageHandler real;

        public RSMessageHandler(android.renderscript.RenderScript.RSMessageHandler real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler wrap(android.renderscript.RenderScript.RSMessageHandler real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RenderScript.RSMessageHandler(real);
        }

        public android.renderscript.RenderScript.RSMessageHandler unwrap() {
            return real;
        }

        public RSMessageHandler() {
            this(new android.renderscript.RenderScript.RSMessageHandler());
        }

        public void run() {
            real.run();
        }


    }
}
