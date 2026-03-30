// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Script {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Script(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Script wrap(android.renderscript.Script real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Script getReal() {
        return (android.renderscript.Script) real;
    }

    public android.renderscript.Script unwrap() {
        return getReal();
    }

    public void bindAllocation(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, int arg1) {
        ((android.renderscript.Script) real).bindAllocation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean getVarB(int arg0) {
        return ((android.renderscript.Script) real).getVarB(arg0);
    }

    public double getVarD(int arg0) {
        return ((android.renderscript.Script) real).getVarD(arg0);
    }

    public float getVarF(int arg0) {
        return ((android.renderscript.Script) real).getVarF(arg0);
    }

    public int getVarI(int arg0) {
        return ((android.renderscript.Script) real).getVarI(arg0);
    }

    public long getVarJ(int arg0) {
        return ((android.renderscript.Script) real).getVarJ(arg0);
    }

    public void getVarV(int arg0, com.micklab.dcg.wrapper.android.renderscript.FieldPacker arg1) {
        ((android.renderscript.Script) real).getVarV(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTimeZone(java.lang.String arg0) {
        ((android.renderscript.Script) real).setTimeZone(arg0);
    }

    public void setVar(int arg0, com.micklab.dcg.wrapper.android.renderscript.FieldPacker arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setVar(int arg0, long arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1);
    }

    public void setVar(int arg0, com.micklab.dcg.wrapper.android.renderscript.BaseObj arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setVar(int arg0, boolean arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1);
    }

    public void setVar(int arg0, float arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1);
    }

    public void setVar(int arg0, double arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1);
    }

    public void setVar(int arg0, int arg1) {
        ((android.renderscript.Script) real).setVar(arg0, arg1);
    }

    public void setVar(int arg0, com.micklab.dcg.wrapper.android.renderscript.FieldPacker arg1, com.micklab.dcg.wrapper.android.renderscript.Element arg2, int[] arg3) {
        ((android.renderscript.Script) real).setVar(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.Builder wrap(android.renderscript.Script.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Script.Builder getReal() {
            return (android.renderscript.Script.Builder) real;
        }

        public android.renderscript.Script.Builder unwrap() {
            return getReal();
        }

    }
    public static final class FieldBase {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FieldBase(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.FieldBase wrap(android.renderscript.Script.FieldBase real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.FieldBase(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Script.FieldBase getReal() {
            return (android.renderscript.Script.FieldBase) real;
        }

        public android.renderscript.Script.FieldBase unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.renderscript.Allocation getAllocation() {
            return com.micklab.dcg.wrapper.android.renderscript.Allocation.wrap(((android.renderscript.Script.FieldBase) real).getAllocation());
        }

        public com.micklab.dcg.wrapper.android.renderscript.Element getElement() {
            return com.micklab.dcg.wrapper.android.renderscript.Element.wrap(((android.renderscript.Script.FieldBase) real).getElement());
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type getType() {
            return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(((android.renderscript.Script.FieldBase) real).getType());
        }

        public void updateAllocation() {
            ((android.renderscript.Script.FieldBase) real).updateAllocation();
        }


    }
    public static final class FieldID {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FieldID(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.FieldID wrap(android.renderscript.Script.FieldID real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.FieldID(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Script.FieldID getReal() {
            return (android.renderscript.Script.FieldID) real;
        }

        public android.renderscript.Script.FieldID unwrap() {
            return getReal();
        }

    }
    public static final class InvokeID {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InvokeID(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.InvokeID wrap(android.renderscript.Script.InvokeID real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.InvokeID(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Script.InvokeID getReal() {
            return (android.renderscript.Script.InvokeID) real;
        }

        public android.renderscript.Script.InvokeID unwrap() {
            return getReal();
        }

    }
    public static final class KernelID {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private KernelID(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.KernelID wrap(android.renderscript.Script.KernelID real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.KernelID(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Script.KernelID getReal() {
            return (android.renderscript.Script.KernelID) real;
        }

        public android.renderscript.Script.KernelID unwrap() {
            return getReal();
        }

    }
    public static final class LaunchOptions {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LaunchOptions(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions wrap(android.renderscript.Script.LaunchOptions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Script.LaunchOptions getReal() {
            return (android.renderscript.Script.LaunchOptions) real;
        }

        public android.renderscript.Script.LaunchOptions unwrap() {
            return getReal();
        }

        public LaunchOptions() {
            this(new android.renderscript.Script.LaunchOptions(), (__DcgwBridgeToken) null);
        }

        public int getXEnd() {
            return ((android.renderscript.Script.LaunchOptions) real).getXEnd();
        }

        public int getXStart() {
            return ((android.renderscript.Script.LaunchOptions) real).getXStart();
        }

        public int getYEnd() {
            return ((android.renderscript.Script.LaunchOptions) real).getYEnd();
        }

        public int getYStart() {
            return ((android.renderscript.Script.LaunchOptions) real).getYStart();
        }

        public int getZEnd() {
            return ((android.renderscript.Script.LaunchOptions) real).getZEnd();
        }

        public int getZStart() {
            return ((android.renderscript.Script.LaunchOptions) real).getZStart();
        }

        public com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions setX(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions.wrap(((android.renderscript.Script.LaunchOptions) real).setX(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions setY(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions.wrap(((android.renderscript.Script.LaunchOptions) real).setY(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions setZ(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions.wrap(((android.renderscript.Script.LaunchOptions) real).setZ(arg0, arg1));
        }

    }
}
