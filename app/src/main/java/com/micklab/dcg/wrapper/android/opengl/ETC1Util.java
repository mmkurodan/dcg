// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class ETC1Util {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ETC1Util(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.ETC1Util wrap(android.opengl.ETC1Util real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.ETC1Util(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.ETC1Util getReal() {
        return (android.opengl.ETC1Util) real;
    }

    public android.opengl.ETC1Util unwrap() {
        return getReal();
    }

    public ETC1Util() {
        this(new android.opengl.ETC1Util(), (__DcgwBridgeToken) null);
    }

    public static com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture compressTexture(java.nio.Buffer arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture.wrap(android.opengl.ETC1Util.compressTexture(arg0, arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture createTexture(java.io.InputStream arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture.wrap(android.opengl.ETC1Util.createTexture(arg0));
    }

    public static boolean isETC1Supported() {
        return android.opengl.ETC1Util.isETC1Supported();
    }

    public static void loadTexture(int arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture arg5) {
        android.opengl.ETC1Util.loadTexture(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public static void loadTexture(int arg0, int arg1, int arg2, int arg3, int arg4, java.io.InputStream arg5) throws java.io.IOException {
        android.opengl.ETC1Util.loadTexture(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void writeTexture(com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture arg0, java.io.OutputStream arg1) throws java.io.IOException {
        android.opengl.ETC1Util.writeTexture(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final class ETC1Texture {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ETC1Texture(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture wrap(android.opengl.ETC1Util.ETC1Texture real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture(real, (__DcgwBridgeToken) null);
        }

        public android.opengl.ETC1Util.ETC1Texture getReal() {
            return (android.opengl.ETC1Util.ETC1Texture) real;
        }

        public android.opengl.ETC1Util.ETC1Texture unwrap() {
            return getReal();
        }

        public ETC1Texture(int arg0, int arg1, java.nio.ByteBuffer arg2) {
            this(new android.opengl.ETC1Util.ETC1Texture(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public java.nio.ByteBuffer getData() {
            return ((android.opengl.ETC1Util.ETC1Texture) real).getData();
        }

        public int getHeight() {
            return ((android.opengl.ETC1Util.ETC1Texture) real).getHeight();
        }

        public int getWidth() {
            return ((android.opengl.ETC1Util.ETC1Texture) real).getWidth();
        }

    }
}
