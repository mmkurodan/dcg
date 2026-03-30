// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Shader {
    private final android.graphics.Shader real;

    public Shader(android.graphics.Shader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Shader wrap(android.graphics.Shader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Shader(real);
    }

    public android.graphics.Shader unwrap() {
        return real;
    }

    public Shader() {
        this(new android.graphics.Shader());
    }

    public boolean getLocalMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        return real.getLocalMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public void setLocalMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.setLocalMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public static final class TileMode {
        private final android.graphics.Shader.TileMode real;

        public TileMode(android.graphics.Shader.TileMode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Shader.TileMode wrap(android.graphics.Shader.TileMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Shader.TileMode(real);
        }

        public android.graphics.Shader.TileMode unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Shader.TileMode valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(android.graphics.Shader.TileMode.valueOf(arg0));
        }

        public static android.graphics.Shader.TileMode[] values() {
            return android.graphics.Shader.TileMode.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Shader.TileMode CLAMP = com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(android.graphics.Shader.TileMode.CLAMP);
        public static final com.micklab.dcg.wrapper.android.graphics.Shader.TileMode DECAL = com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(android.graphics.Shader.TileMode.DECAL);
        public static final com.micklab.dcg.wrapper.android.graphics.Shader.TileMode MIRROR = com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(android.graphics.Shader.TileMode.MIRROR);
        public static final com.micklab.dcg.wrapper.android.graphics.Shader.TileMode REPEAT = com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(android.graphics.Shader.TileMode.REPEAT);

    }
}
