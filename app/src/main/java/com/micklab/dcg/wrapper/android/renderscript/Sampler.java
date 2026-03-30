// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Sampler {
    private final android.renderscript.Sampler real;

    public Sampler(android.renderscript.Sampler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler wrap(android.renderscript.Sampler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Sampler(real);
    }

    public android.renderscript.Sampler unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler CLAMP_LINEAR(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.CLAMP_LINEAR(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler CLAMP_LINEAR_MIP_LINEAR(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.CLAMP_LINEAR_MIP_LINEAR(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler CLAMP_NEAREST(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.CLAMP_NEAREST(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler MIRRORED_REPEAT_LINEAR(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.MIRRORED_REPEAT_LINEAR(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.MIRRORED_REPEAT_LINEAR_MIP_LINEAR(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler MIRRORED_REPEAT_NEAREST(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.MIRRORED_REPEAT_NEAREST(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler WRAP_LINEAR(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.WRAP_LINEAR(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler WRAP_LINEAR_MIP_LINEAR(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.WRAP_LINEAR_MIP_LINEAR(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Sampler WRAP_NEAREST(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(android.renderscript.Sampler.WRAP_NEAREST(arg0 == null ? null : arg0.unwrap()));
    }

    public float getAnisotropy() {
        return real.getAnisotropy();
    }

    public com.micklab.dcg.wrapper.android.renderscript.Sampler.Value getMagnification() {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(real.getMagnification());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Sampler.Value getMinification() {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(real.getMinification());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Sampler.Value getWrapS() {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(real.getWrapS());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Sampler.Value getWrapT() {
        return com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(real.getWrapT());
    }

    public static final class Builder {
        private final android.renderscript.Sampler.Builder real;

        public Builder(android.renderscript.Sampler.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Sampler.Builder wrap(android.renderscript.Sampler.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Sampler.Builder(real);
        }

        public android.renderscript.Sampler.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
            this(new android.renderscript.Sampler.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Sampler create() {
            return com.micklab.dcg.wrapper.android.renderscript.Sampler.wrap(real.create());
        }

        public void setAnisotropy(float arg0) {
            real.setAnisotropy(arg0);
        }

        public void setMagnification(com.micklab.dcg.wrapper.android.renderscript.Sampler.Value arg0) {
            real.setMagnification(arg0 == null ? null : arg0.unwrap());
        }

        public void setMinification(com.micklab.dcg.wrapper.android.renderscript.Sampler.Value arg0) {
            real.setMinification(arg0 == null ? null : arg0.unwrap());
        }

        public void setWrapS(com.micklab.dcg.wrapper.android.renderscript.Sampler.Value arg0) {
            real.setWrapS(arg0 == null ? null : arg0.unwrap());
        }

        public void setWrapT(com.micklab.dcg.wrapper.android.renderscript.Sampler.Value arg0) {
            real.setWrapT(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class Value {
        private final android.renderscript.Sampler.Value real;

        public Value(android.renderscript.Sampler.Value real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Sampler.Value wrap(android.renderscript.Sampler.Value real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Sampler.Value(real);
        }

        public android.renderscript.Sampler.Value unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Sampler.Value valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.valueOf(arg0));
        }

        public static android.renderscript.Sampler.Value[] values() {
            return android.renderscript.Sampler.Value.values();
        }

        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value CLAMP = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.CLAMP);
        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value LINEAR = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.LINEAR);
        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value LINEAR_MIP_LINEAR = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.LINEAR_MIP_LINEAR);
        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value LINEAR_MIP_NEAREST = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.LINEAR_MIP_NEAREST);
        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value MIRRORED_REPEAT = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.MIRRORED_REPEAT);
        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value NEAREST = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.NEAREST);
        public static final com.micklab.dcg.wrapper.android.renderscript.Sampler.Value WRAP = com.micklab.dcg.wrapper.android.renderscript.Sampler.Value.wrap(android.renderscript.Sampler.Value.WRAP);

    }
}
