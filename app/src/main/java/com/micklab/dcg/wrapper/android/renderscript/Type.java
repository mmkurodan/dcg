// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Type {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Type(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type wrap(android.renderscript.Type real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Type(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Type getReal() {
        return (android.renderscript.Type) real;
    }

    public android.renderscript.Type unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type createX(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(android.renderscript.Type.createX(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type createXY(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(android.renderscript.Type.createXY(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type createXYZ(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(android.renderscript.Type.createXYZ(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4));
    }

    public int getCount() {
        return ((android.renderscript.Type) real).getCount();
    }

    public com.micklab.dcg.wrapper.android.renderscript.Element getElement() {
        return com.micklab.dcg.wrapper.android.renderscript.Element.wrap(((android.renderscript.Type) real).getElement());
    }

    public int getX() {
        return ((android.renderscript.Type) real).getX();
    }

    public int getY() {
        return ((android.renderscript.Type) real).getY();
    }

    public int getYuv() {
        return ((android.renderscript.Type) real).getYuv();
    }

    public int getZ() {
        return ((android.renderscript.Type) real).getZ();
    }

    public boolean hasFaces() {
        return ((android.renderscript.Type) real).hasFaces();
    }

    public boolean hasMipmaps() {
        return ((android.renderscript.Type) real).hasMipmaps();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Type.Builder wrap(android.renderscript.Type.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Type.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Type.Builder getReal() {
            return (android.renderscript.Type.Builder) real;
        }

        public android.renderscript.Type.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
            this(new android.renderscript.Type.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type create() {
            return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(((android.renderscript.Type.Builder) real).create());
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setFaces(boolean arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(((android.renderscript.Type.Builder) real).setFaces(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setMipmaps(boolean arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(((android.renderscript.Type.Builder) real).setMipmaps(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setX(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(((android.renderscript.Type.Builder) real).setX(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setY(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(((android.renderscript.Type.Builder) real).setY(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setYuvFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(((android.renderscript.Type.Builder) real).setYuvFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setZ(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(((android.renderscript.Type.Builder) real).setZ(arg0));
        }

    }
    public static final class CubemapFace {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CubemapFace(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace wrap(android.renderscript.Type.CubemapFace real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace(real, (__DcgwBridgeToken) null);
        }

        public android.renderscript.Type.CubemapFace getReal() {
            return (android.renderscript.Type.CubemapFace) real;
        }

        public android.renderscript.Type.CubemapFace unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.valueOf(arg0));
        }

        public static android.renderscript.Type.CubemapFace[] values() {
            return android.renderscript.Type.CubemapFace.values();
        }

        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace NEGATIVE_X = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.NEGATIVE_X);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace NEGATIVE_Y = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.NEGATIVE_Y);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace NEGATIVE_Z = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.NEGATIVE_Z);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace POSITIVE_X = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.POSITIVE_X);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace POSITIVE_Y = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.POSITIVE_Y);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace POSITIVE_Z = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.POSITIVE_Z);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace POSITVE_X = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.POSITVE_X);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace POSITVE_Y = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.POSITVE_Y);
        public static final com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace POSITVE_Z = com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace.wrap(android.renderscript.Type.CubemapFace.POSITVE_Z);

    }
}
