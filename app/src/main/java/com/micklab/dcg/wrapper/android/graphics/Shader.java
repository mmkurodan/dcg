// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Shader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Shader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Shader wrap(android.graphics.Shader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Shader(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Shader getReal() {
        return (android.graphics.Shader) real;
    }

    public android.graphics.Shader unwrap() {
        return getReal();
    }

    public Shader() {
        this(new android.graphics.Shader(), (__DcgwBridgeToken) null);
    }

    public boolean getLocalMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        return ((android.graphics.Shader) real).getLocalMatrix(arg0 == null ? null : arg0.getReal());
    }

    public void setLocalMatrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.graphics.Shader) real).setLocalMatrix(arg0 == null ? null : arg0.getReal());
    }

    public static final class TileMode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TileMode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Shader.TileMode wrap(android.graphics.Shader.TileMode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Shader.TileMode(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Shader.TileMode getReal() {
            return (android.graphics.Shader.TileMode) real;
        }

        public android.graphics.Shader.TileMode unwrap() {
            return getReal();
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
