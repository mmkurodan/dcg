// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptGroup {
    private final android.renderscript.ScriptGroup real;

    public ScriptGroup(android.renderscript.ScriptGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup wrap(android.renderscript.ScriptGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup(real);
    }

    public android.renderscript.ScriptGroup unwrap() {
        return real;
    }

    public void destroy() {
        real.destroy();
    }

    public void execute() {
        real.execute();
    }

    public java.lang.Object[] execute(java.lang.Object... arg0) {
        return real.execute(arg0);
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        real.setInput(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOutput(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        real.setOutput(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class Binding {
        private final android.renderscript.ScriptGroup.Binding real;

        public Binding(android.renderscript.ScriptGroup.Binding real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Binding wrap(android.renderscript.ScriptGroup.Binding real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Binding(real);
        }

        public android.renderscript.ScriptGroup.Binding unwrap() {
            return real;
        }

        public Binding(com.micklab.dcg.wrapper.android.renderscript.Script.FieldID arg0, java.lang.Object arg1) {
            this(new android.renderscript.ScriptGroup.Binding(arg0 == null ? null : arg0.unwrap(), arg1));
        }

    }
    public static final class Builder {
        private final android.renderscript.ScriptGroup.Builder real;

        public Builder(android.renderscript.ScriptGroup.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder wrap(android.renderscript.ScriptGroup.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder(real);
        }

        public android.renderscript.ScriptGroup.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
            this(new android.renderscript.ScriptGroup.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder addConnection(com.micklab.dcg.wrapper.android.renderscript.Type arg0, com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg1, com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg2) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder.wrap(real.addConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder addConnection(com.micklab.dcg.wrapper.android.renderscript.Type arg0, com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg1, com.micklab.dcg.wrapper.android.renderscript.Script.FieldID arg2) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder.wrap(real.addConnection(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder addKernel(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder.wrap(real.addKernel(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup create() {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.wrap(real.create());
        }

    }
    public static final class Builder2 {
        private final android.renderscript.ScriptGroup.Builder2 real;

        public Builder2(android.renderscript.ScriptGroup.Builder2 real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder2 wrap(android.renderscript.ScriptGroup.Builder2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Builder2(real);
        }

        public android.renderscript.ScriptGroup.Builder2 unwrap() {
            return real;
        }

        public Builder2(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
            this(new android.renderscript.ScriptGroup.Builder2(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input addInput() {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input.wrap(real.addInput());
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure addInvoke(com.micklab.dcg.wrapper.android.renderscript.Script.InvokeID arg0, java.lang.Object... arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure.wrap(real.addInvoke(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure addKernel(com.micklab.dcg.wrapper.android.renderscript.Script.KernelID arg0, com.micklab.dcg.wrapper.android.renderscript.Type arg1, java.lang.Object... arg2) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure.wrap(real.addKernel(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup create(java.lang.String arg0, android.renderscript.ScriptGroup.Future... arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.wrap(real.create(arg0, arg1));
        }

    }
    public static final class Closure {
        private final android.renderscript.ScriptGroup.Closure real;

        public Closure(android.renderscript.ScriptGroup.Closure real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure wrap(android.renderscript.ScriptGroup.Closure real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Closure(real);
        }

        public android.renderscript.ScriptGroup.Closure unwrap() {
            return real;
        }

        public void destroy() {
            real.destroy();
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future getGlobal(com.micklab.dcg.wrapper.android.renderscript.Script.FieldID arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future.wrap(real.getGlobal(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future getReturn() {
            return com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future.wrap(real.getReturn());
        }

    }
    public static final class Future {
        private final android.renderscript.ScriptGroup.Future real;

        public Future(android.renderscript.ScriptGroup.Future real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future wrap(android.renderscript.ScriptGroup.Future real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Future(real);
        }

        public android.renderscript.ScriptGroup.Future unwrap() {
            return real;
        }

    }
    public static final class Input {
        private final android.renderscript.ScriptGroup.Input real;

        public Input(android.renderscript.ScriptGroup.Input real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input wrap(android.renderscript.ScriptGroup.Input real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptGroup.Input(real);
        }

        public android.renderscript.ScriptGroup.Input unwrap() {
            return real;
        }

    }
}
