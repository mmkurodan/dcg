// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class ETC1Util {
    private final android.opengl.ETC1Util real;

    public ETC1Util(android.opengl.ETC1Util real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.ETC1Util wrap(android.opengl.ETC1Util real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.ETC1Util(real);
    }

    public android.opengl.ETC1Util unwrap() {
        return real;
    }

    public ETC1Util() {
        this(new android.opengl.ETC1Util());
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
        android.opengl.ETC1Util.loadTexture(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public static void loadTexture(int arg0, int arg1, int arg2, int arg3, int arg4, java.io.InputStream arg5) throws java.io.IOException {
        android.opengl.ETC1Util.loadTexture(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void writeTexture(com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture arg0, java.io.OutputStream arg1) throws java.io.IOException {
        android.opengl.ETC1Util.writeTexture(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final class ETC1Texture {
        private final android.opengl.ETC1Util.ETC1Texture real;

        public ETC1Texture(android.opengl.ETC1Util.ETC1Texture real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture wrap(android.opengl.ETC1Util.ETC1Texture real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.ETC1Util.ETC1Texture(real);
        }

        public android.opengl.ETC1Util.ETC1Texture unwrap() {
            return real;
        }

        public ETC1Texture(int arg0, int arg1, java.nio.ByteBuffer arg2) {
            this(new android.opengl.ETC1Util.ETC1Texture(arg0, arg1, arg2));
        }

        public java.nio.ByteBuffer getData() {
            return real.getData();
        }

        public int getHeight() {
            return real.getHeight();
        }

        public int getWidth() {
            return real.getWidth();
        }

    }
}
