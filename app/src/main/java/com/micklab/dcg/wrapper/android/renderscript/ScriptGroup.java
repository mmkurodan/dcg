// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup wrap(android.renderscript.ScriptGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptGroup getReal() {
        return (android.renderscript.ScriptGroup) real;
    }

    public android.renderscript.ScriptGroup unwrap() {
        return getReal();
    }

    public void destroy() {
        ((android.renderscript.ScriptGroup) real).destroy();
    }

    public void execute() {
        ((android.renderscript.ScriptGroup) real).execute();
    }

    public java.lang.Object[] execute(java.lang.Object... arg0) {
        return ((android.renderscript.ScriptGroup) real).execute(arg0);
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        ((android.renderscript.ScriptGroup) real).setInput(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOutput(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        ((android.renderscript.ScriptGroup) real).setOutput(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class Binding {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Binding(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Binding wrap(android.renderscript.ScriptGroup.Binding real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Binding(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.ScriptGroup.Binding getReal() {
            return (android.renderscript.ScriptGroup.Binding) real;
        }

        public android.renderscript.ScriptGroup.Binding unwrap() {
            return getReal();
        }

        public Binding(com.micklab.dcg.wrapper.android.renderscript.Script.FieldID arg0, java.lang.Object arg1) {
            this(new android.renderscript.ScriptGroup.Binding(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

    }
    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder wrap(android.renderscript.ScriptGroup.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.ScriptGroup.Builder getReal() {
            return (android.renderscript.ScriptGroup.Builder) real;
        }

        public android.renderscript.ScriptGroup.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
            this(new android.renderscript.ScriptGroup.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder addConnection(com.micklab.dcg.wrapper.android.renderscript.Type arg0, com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg1, com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg2) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder.wrap(((android.renderscript.ScriptGroup.Builder) real).addConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder addConnection(com.micklab.dcg.wrapper.android.renderscript.Type arg0, com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg1, com.micklab.dcg.wrapper.android.renderscript.Script.FieldID arg2) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder.wrap(((android.renderscript.ScriptGroup.Builder) real).addConnection(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder addKernel(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder.wrap(((android.renderscript.ScriptGroup.Builder) real).addKernel(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup create() {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.wrap(((android.renderscript.ScriptGroup.Builder) real).create());
        }

    }
    public static final class Builder2 {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder2(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder2 wrap(android.renderscript.ScriptGroup.Builder2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder2(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.ScriptGroup.Builder2 getReal() {
            return (android.renderscript.ScriptGroup.Builder2) real;
        }

        public android.renderscript.ScriptGroup.Builder2 unwrap() {
            return getReal();
        }

        public Builder2(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
            this(new android.renderscript.ScriptGroup.Builder2(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input addInput() {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input.wrap(((android.renderscript.ScriptGroup.Builder2) real).addInput());
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure addInvoke(com.micklab.dcg.wrapper.android.renderscript.Script.InvokeID arg0, java.lang.Object... arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure.wrap(((android.renderscript.ScriptGroup.Builder2) real).addInvoke(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure addKernel(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0, com.micklab.dcg.wrapper.android.renderscript.Type arg1, java.lang.Object... arg2) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure.wrap(((android.renderscript.ScriptGroup.Builder2) real).addKernel(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup create(java.lang.String arg0, android.renderscript.ScriptGroup.Future... arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.wrap(((android.renderscript.ScriptGroup.Builder2) real).create(arg0, arg1));
        }

    }
    public static final class Closure {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Closure(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure wrap(android.renderscript.ScriptGroup.Closure real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.ScriptGroup.Closure getReal() {
            return (android.renderscript.ScriptGroup.Closure) real;
        }

        public android.renderscript.ScriptGroup.Closure unwrap() {
            return getReal();
        }

        public void destroy() {
            ((android.renderscript.ScriptGroup.Closure) real).destroy();
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future getGlobal(com.micklab.dcg.wrapper.android.renderscript.Script.FieldID arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future.wrap(((android.renderscript.ScriptGroup.Closure) real).getGlobal(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future getReturn() {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future.wrap(((android.renderscript.ScriptGroup.Closure) real).getReturn());
        }

    }
    public static final class Future {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Future(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future wrap(android.renderscript.ScriptGroup.Future real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.ScriptGroup.Future getReal() {
            return (android.renderscript.ScriptGroup.Future) real;
        }

        public android.renderscript.ScriptGroup.Future unwrap() {
            return getReal();
        }

    }
    public static final class Input {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Input(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input wrap(android.renderscript.ScriptGroup.Input real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.ScriptGroup.Input getReal() {
            return (android.renderscript.ScriptGroup.Input) real;
        }

        public android.renderscript.ScriptGroup.Input unwrap() {
            return getReal();
        }

    }
}
