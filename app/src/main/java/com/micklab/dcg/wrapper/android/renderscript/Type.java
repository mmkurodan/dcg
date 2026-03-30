// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Type {
    private final android.renderscript.Type real;

    public Type(android.renderscript.Type real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type wrap(android.renderscript.Type real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Type(real);
    }

    public android.renderscript.Type unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type createX(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(android.renderscript.Type.createX(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type createXY(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(android.renderscript.Type.createXY(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Type createXYZ(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(android.renderscript.Type.createXYZ(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public int getCount() {
        return real.getCount();
    }

    public com.micklab.dcg.wrapper.android.renderscript.Element getElement() {
        return com.micklab.dcg.wrapper.android.renderscript.Element.wrap(real.getElement());
    }

    public int getX() {
        return real.getX();
    }

    public int getY() {
        return real.getY();
    }

    public int getYuv() {
        return real.getYuv();
    }

    public int getZ() {
        return real.getZ();
    }

    public boolean hasFaces() {
        return real.hasFaces();
    }

    public boolean hasMipmaps() {
        return real.hasMipmaps();
    }

    public static final class Builder {
        private final android.renderscript.Type.Builder real;

        public Builder(android.renderscript.Type.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Type.Builder wrap(android.renderscript.Type.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Type.Builder(real);
        }

        public android.renderscript.Type.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
            this(new android.renderscript.Type.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type create() {
            return com.micklab.dcg.wrapper.android.renderscript.Type.wrap(real.create());
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setFaces(boolean arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(real.setFaces(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setMipmaps(boolean arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(real.setMipmaps(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setX(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(real.setX(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setY(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(real.setY(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setYuvFormat(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(real.setYuvFormat(arg0));
        }

        public com.micklab.dcg.wrapper.android.renderscript.Type.Builder setZ(int arg0) {
            return com.micklab.dcg.wrapper.android.renderscript.Type.Builder.wrap(real.setZ(arg0));
        }

    }
    public static final class CubemapFace {
        private final android.renderscript.Type.CubemapFace real;

        public CubemapFace(android.renderscript.Type.CubemapFace real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace wrap(android.renderscript.Type.CubemapFace real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Type.CubemapFace(real);
        }

        public android.renderscript.Type.CubemapFace unwrap() {
            return real;
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
