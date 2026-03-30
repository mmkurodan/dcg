// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Script {
    private final android.renderscript.Script real;

    public Script(android.renderscript.Script real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Script wrap(android.renderscript.Script real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script(real);
    }

    public android.renderscript.Script unwrap() {
        return real;
    }

    public void bindAllocation(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, int arg1) {
        real.bindAllocation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean getVarB(int arg0) {
        return real.getVarB(arg0);
    }

    public double getVarD(int arg0) {
        return real.getVarD(arg0);
    }

    public float getVarF(int arg0) {
        return real.getVarF(arg0);
    }

    public int getVarI(int arg0) {
        return real.getVarI(arg0);
    }

    public long getVarJ(int arg0) {
        return real.getVarJ(arg0);
    }

    public void getVarV(int arg0, com.micklab.dcg.wrapper.android.renderscript.FieldPacker arg1) {
        real.getVarV(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTimeZone(java.lang.String arg0) {
        real.setTimeZone(arg0);
    }

    public void setVar(int arg0, com.micklab.dcg.wrapper.android.renderscript.FieldPacker arg1) {
        real.setVar(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setVar(int arg0, long arg1) {
        real.setVar(arg0, arg1);
    }

    public void setVar(int arg0, com.micklab.dcg.wrapper.android.renderscript.BaseObj arg1) {
        real.setVar(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setVar(int arg0, boolean arg1) {
        real.setVar(arg0, arg1);
    }

    public void setVar(int arg0, float arg1) {
        real.setVar(arg0, arg1);
    }

    public void setVar(int arg0, double arg1) {
        real.setVar(arg0, arg1);
    }

    public void setVar(int arg0, int arg1) {
        real.setVar(arg0, arg1);
    }

    public void setVar(int arg0, com.micklab.dcg.wrapper.android.renderscript.FieldPacker arg1, com.micklab.dcg.wrapper.android.renderscript.Element arg2, int[] arg3) {
        real.setVar(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public static final class Builder {
        private final android.renderscript.Script.Builder real;

        public Builder(android.renderscript.Script.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.Builder wrap(android.renderscript.Script.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.Builder(real);
        }

        public android.renderscript.Script.Builder unwrap() {
            return real;
        }

    }
    public static final class FieldBase {
        private final android.renderscript.Script.FieldBase real;

        public FieldBase(android.renderscript.Script.FieldBase real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.FieldBase wrap(android.renderscript.Script.FieldBase real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.FieldBase(real);
        }

        public android.renderscript.Script.FieldBase unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.renderscript.Allocation getAllocation() {
            return com.micklab.dcg.wrapper.android.renderscript.Allocation.wrap(real.getAllocation());
        }

        public com.micklab.dcg.wrapper.android.renderscript.Element getElement() {
            return com.micklab.dcg.wrapper.android.renderscript.Element.wrap(real.getElement());
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type getType() {
            return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(real.getType());
        }

        public void updateAllocation() {
            real.updateAllocation();
        }


    }
    public static final class FieldID {
        private final android.renderscript.Script.FieldID real;

        public FieldID(android.renderscript.Script.FieldID real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.FieldID wrap(android.renderscript.Script.FieldID real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.FieldID(real);
        }

        public android.renderscript.Script.FieldID unwrap() {
            return real;
        }

    }
    public static final class InvokeID {
        private final android.renderscript.Script.InvokeID real;

        public InvokeID(android.renderscript.Script.InvokeID real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.InvokeID wrap(android.renderscript.Script.InvokeID real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.InvokeID(real);
        }

        public android.renderscript.Script.InvokeID unwrap() {
            return real;
        }

    }
    public static final class KernelID {
        private final android.renderscript.Script.KernelID real;

        public KernelID(android.renderscript.Script.KernelID real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.KernelID wrap(android.renderscript.Script.KernelID real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.KernelID(real);
        }

        public android.renderscript.Script.KernelID unwrap() {
            return real;
        }

    }
    public static final class LaunchOptions {
        private final android.renderscript.Script.LaunchOptions real;

        public LaunchOptions(android.renderscript.Script.LaunchOptions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions wrap(android.renderscript.Script.LaunchOptions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions(real);
        }

        public android.renderscript.Script.LaunchOptions unwrap() {
            return real;
        }

        public LaunchOptions() {
            this(new android.renderscript.Script.LaunchOptions());
        }

        public int getXEnd() {
            return real.getXEnd();
        }

        public int getXStart() {
            return real.getXStart();
        }

        public int getYEnd() {
            return real.getYEnd();
        }

        public int getYStart() {
            return real.getYStart();
        }

        public int getZEnd() {
            return real.getZEnd();
        }

        public int getZStart() {
            return real.getZStart();
        }

        public com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions setX(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions.wrap(real.setX(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions setY(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions.wrap(real.setY(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions setZ(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions.wrap(real.setZ(arg0, arg1));
        }

    }
}
