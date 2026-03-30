// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class MeshSpecification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MeshSpecification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification wrap(android.graphics.MeshSpecification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MeshSpecification(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.MeshSpecification getReal() {
        return (android.graphics.MeshSpecification) real;
    }

    public android.graphics.MeshSpecification unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] arg0, int arg1, android.graphics.MeshSpecification.Varying[] arg2, java.lang.String arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.graphics.MeshSpecification.wrap(android.graphics.MeshSpecification.make(arg0, arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] arg0, int arg1, android.graphics.MeshSpecification.Varying[] arg2, java.lang.String arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        return com.micklab.dcg.wrapper.android.graphics.MeshSpecification.wrap(android.graphics.MeshSpecification.make(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification make(android.graphics.MeshSpecification.Attribute[] arg0, int arg1, android.graphics.MeshSpecification.Varying[] arg2, java.lang.String arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5, int arg6) {
        return com.micklab.dcg.wrapper.android.graphics.MeshSpecification.wrap(android.graphics.MeshSpecification.make(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6));
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Attribute(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Attribute wrap(android.graphics.MeshSpecification.Attribute real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Attribute(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.MeshSpecification.Attribute getReal() {
            return (android.graphics.MeshSpecification.Attribute) real;
        }

        public android.graphics.MeshSpecification.Attribute unwrap() {
            return getReal();
        }

        public Attribute(int arg0, int arg1, java.lang.String arg2) {
            this(new android.graphics.MeshSpecification.Attribute(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public java.lang.String getName() {
            return ((android.graphics.MeshSpecification.Attribute) real).getName();
        }

        public int getOffset() {
            return ((android.graphics.MeshSpecification.Attribute) real).getOffset();
        }

        public int getType() {
            return ((android.graphics.MeshSpecification.Attribute) real).getType();
        }

        public java.lang.String toString() {
            return ((android.graphics.MeshSpecification.Attribute) real).toString();
        }

    }
    public static final class Varying {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Varying(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Varying wrap(android.graphics.MeshSpecification.Varying real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MeshSpecification.Varying(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.MeshSpecification.Varying getReal() {
            return (android.graphics.MeshSpecification.Varying) real;
        }

        public android.graphics.MeshSpecification.Varying unwrap() {
            return getReal();
        }

        public Varying(int arg0, java.lang.String arg1) {
            this(new android.graphics.MeshSpecification.Varying(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public java.lang.String getName() {
            return ((android.graphics.MeshSpecification.Varying) real).getName();
        }

        public int getType() {
            return ((android.graphics.MeshSpecification.Varying) real).getType();
        }

        public java.lang.String toString() {
            return ((android.graphics.MeshSpecification.Varying) real).toString();
        }

    }
}
