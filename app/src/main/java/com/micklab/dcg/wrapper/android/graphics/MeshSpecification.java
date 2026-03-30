// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class MeshSpecification {
    private final android.graphics.MeshSpecification real;

    public MeshSpecification(android.graphics.MeshSpecification real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification wrap(android.graphics.MeshSpecification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MeshSpecification(real);
    }

    public android.graphics.MeshSpecification unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] arg0, int arg1, android.graphics.MeshSpecification.Varying[] arg2, java.lang.String arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.graphics.MeshSpecification.wrap(android.graphics.MeshSpecification.make(arg0, arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] arg0, int arg1, android.graphics.MeshSpecification.Varying[] arg2, java.lang.String arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        return com.micklab.dcg.wrapper.android.graphics.MeshSpecification.wrap(android.graphics.MeshSpecification.make(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] arg0, int arg1, android.graphics.MeshSpecification.Varying[] arg2, java.lang.String arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5, int arg6) {
        return com.micklab.dcg.wrapper.android.graphics.MeshSpecification.wrap(android.graphics.MeshSpecification.make(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6));
    }

    public static final int ALPHA_TYPE_OPAQUE = android.graphics.MeshSpecification.ALPHA_TYPE_OPAQUE;
    public static final int ALPHA_TYPE_PREMULTIPLIED = android.graphics.MeshSpecification.ALPHA_TYPE_PREMULTIPLIED;
    public static final int ALPHA_TYPE_UNKNOWN = android.graphics.MeshSpecification.ALPHA_TYPE_UNKNOWN;
    public static final int ALPHA_TYPE_UNPREMULTIPLIED = android.graphics.MeshSpecification.ALPHA_TYPE_UNPREMULTIPLIED;
    public static final int TYPE_FLOAT = android.graphics.MeshSpecification.TYPE_FLOAT;
    public static final int TYPE_FLOAT2 = android.graphics.MeshSpecification.TYPE_FLOAT2;
    public static final int TYPE_FLOAT3 = android.graphics.MeshSpecification.TYPE_FLOAT3;
    public static final int TYPE_FLOAT4 = android.graphics.MeshSpecification.TYPE_FLOAT4;
    public static final int TYPE_UBYTE4 = android.graphics.MeshSpecification.TYPE_UBYTE4;

    public static final class Attribute {
        private final android.graphics.MeshSpecification.Attribute real;

        public Attribute(android.graphics.MeshSpecification.Attribute real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Attribute wrap(android.graphics.MeshSpecification.Attribute real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Attribute(real);
        }

        public android.graphics.MeshSpecification.Attribute unwrap() {
            return real;
        }

        public Attribute(int arg0, int arg1, java.lang.String arg2) {
            this(new android.graphics.MeshSpecification.Attribute(arg0, arg1, arg2));
        }

        public java.lang.String getName() {
            return real.getName();
        }

        public int getOffset() {
            return real.getOffset();
        }

        public int getType() {
            return real.getType();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Varying {
        private final android.graphics.MeshSpecification.Varying real;

        public Varying(android.graphics.MeshSpecification.Varying real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Varying wrap(android.graphics.MeshSpecification.Varying real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Varying(real);
        }

        public android.graphics.MeshSpecification.Varying unwrap() {
            return real;
        }

        public Varying(int arg0, java.lang.String arg1) {
            this(new android.graphics.MeshSpecification.Varying(arg0, arg1));
        }

        public java.lang.String getName() {
            return real.getName();
        }

        public int getType() {
            return real.getType();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
