// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES11 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLES11(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES11 wrap(android.opengl.GLES11 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES11(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLES11 getReal() {
        return (android.opengl.GLES11) real;
    }

    public android.opengl.GLES11 unwrap() {
        return getReal();
    }

    public GLES11() {
        this(new android.opengl.GLES11(), (__DcgwBridgeToken) null);
    }

    public static void glBindBuffer(int arg0, int arg1) {
        android.opengl.GLES11.glBindBuffer(arg0, arg1);
    }

    public static void glBufferData(int arg0, int arg1, java.nio.Buffer arg2, int arg3) {
        android.opengl.GLES11.glBufferData(arg0, arg1, arg2, arg3);
    }

    public static void glBufferSubData(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES11.glBufferSubData(arg0, arg1, arg2, arg3);
    }

    public static void glClipPlanef(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES11.glClipPlanef(arg0, arg1);
    }

    public static void glClipPlanef(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES11.glClipPlanef(arg0, arg1, arg2);
    }

    public static void glClipPlanex(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glClipPlanex(arg0, arg1);
    }

    public static void glClipPlanex(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES11.glClipPlanex(arg0, arg1, arg2);
    }

    public static void glColor4ub(byte arg0, byte arg1, byte arg2, byte arg3) {
        android.opengl.GLES11.glColor4ub(arg0, arg1, arg2, arg3);
    }

    public static void glColorPointer(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES11.glColorPointer(arg0, arg1, arg2, arg3);
    }

    public static void glDeleteBuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glDeleteBuffers(arg0, arg1);
    }

    public static void glDeleteBuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES11.glDeleteBuffers(arg0, arg1, arg2);
    }

    public static void glDrawElements(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES11.glDrawElements(arg0, arg1, arg2, arg3);
    }

    public static void glGenBuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glGenBuffers(arg0, arg1);
    }

    public static void glGenBuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES11.glGenBuffers(arg0, arg1, arg2);
    }

    public static void glGetBooleanv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glGetBooleanv(arg0, arg1);
    }

    public static void glGetBooleanv(int arg0, boolean[] arg1, int arg2) {
        android.opengl.GLES11.glGetBooleanv(arg0, arg1, arg2);
    }

    public static void glGetBufferParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetBufferParameteriv(arg0, arg1, arg2);
    }

    public static void glGetBufferParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetBufferParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glGetClipPlanef(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES11.glGetClipPlanef(arg0, arg1);
    }

    public static void glGetClipPlanef(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES11.glGetClipPlanef(arg0, arg1, arg2);
    }

    public static void glGetClipPlanex(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glGetClipPlanex(arg0, arg1);
    }

    public static void glGetClipPlanex(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES11.glGetClipPlanex(arg0, arg1, arg2);
    }

    public static void glGetFixedv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glGetFixedv(arg0, arg1);
    }

    public static void glGetFixedv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES11.glGetFixedv(arg0, arg1, arg2);
    }

    public static void glGetFloatv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES11.glGetFloatv(arg0, arg1);
    }

    public static void glGetFloatv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES11.glGetFloatv(arg0, arg1, arg2);
    }

    public static void glGetLightfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES11.glGetLightfv(arg0, arg1, arg2);
    }

    public static void glGetLightfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES11.glGetLightfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetLightxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetLightxv(arg0, arg1, arg2);
    }

    public static void glGetLightxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetLightxv(arg0, arg1, arg2, arg3);
    }

    public static void glGetMaterialfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES11.glGetMaterialfv(arg0, arg1, arg2);
    }

    public static void glGetMaterialfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES11.glGetMaterialfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetMaterialxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetMaterialxv(arg0, arg1, arg2);
    }

    public static void glGetMaterialxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetMaterialxv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexEnvfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES11.glGetTexEnvfv(arg0, arg1, arg2);
    }

    public static void glGetTexEnvfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES11.glGetTexEnvfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexEnviv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetTexEnviv(arg0, arg1, arg2);
    }

    public static void glGetTexEnviv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetTexEnviv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexEnvxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetTexEnvxv(arg0, arg1, arg2);
    }

    public static void glGetTexEnvxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetTexEnvxv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameterfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES11.glGetTexParameterfv(arg0, arg1, arg2);
    }

    public static void glGetTexParameterfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES11.glGetTexParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetTexParameteriv(arg0, arg1, arg2);
    }

    public static void glGetTexParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetTexParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameterxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glGetTexParameterxv(arg0, arg1, arg2);
    }

    public static void glGetTexParameterxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glGetTexParameterxv(arg0, arg1, arg2, arg3);
    }

    public static boolean glIsBuffer(int arg0) {
        return android.opengl.GLES11.glIsBuffer(arg0);
    }

    public static boolean glIsEnabled(int arg0) {
        return android.opengl.GLES11.glIsEnabled(arg0);
    }

    public static boolean glIsTexture(int arg0) {
        return android.opengl.GLES11.glIsTexture(arg0);
    }

    public static void glNormalPointer(int arg0, int arg1, int arg2) {
        android.opengl.GLES11.glNormalPointer(arg0, arg1, arg2);
    }

    public static void glPointParameterf(int arg0, float arg1) {
        android.opengl.GLES11.glPointParameterf(arg0, arg1);
    }

    public static void glPointParameterfv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES11.glPointParameterfv(arg0, arg1);
    }

    public static void glPointParameterfv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES11.glPointParameterfv(arg0, arg1, arg2);
    }

    public static void glPointParameterx(int arg0, int arg1) {
        android.opengl.GLES11.glPointParameterx(arg0, arg1);
    }

    public static void glPointParameterxv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES11.glPointParameterxv(arg0, arg1);
    }

    public static void glPointParameterxv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES11.glPointParameterxv(arg0, arg1, arg2);
    }

    public static void glPointSizePointerOES(int arg0, int arg1, java.nio.Buffer arg2) {
        android.opengl.GLES11.glPointSizePointerOES(arg0, arg1, arg2);
    }

    public static void glTexCoordPointer(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES11.glTexCoordPointer(arg0, arg1, arg2, arg3);
    }

    public static void glTexEnvi(int arg0, int arg1, int arg2) {
        android.opengl.GLES11.glTexEnvi(arg0, arg1, arg2);
    }

    public static void glTexEnviv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glTexEnviv(arg0, arg1, arg2);
    }

    public static void glTexEnviv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glTexEnviv(arg0, arg1, arg2, arg3);
    }

    public static void glTexParameterfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES11.glTexParameterfv(arg0, arg1, arg2);
    }

    public static void glTexParameterfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES11.glTexParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glTexParameteri(int arg0, int arg1, int arg2) {
        android.opengl.GLES11.glTexParameteri(arg0, arg1, arg2);
    }

    public static void glTexParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glTexParameteriv(arg0, arg1, arg2);
    }

    public static void glTexParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glTexParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glTexParameterxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES11.glTexParameterxv(arg0, arg1, arg2);
    }

    public static void glTexParameterxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES11.glTexParameterxv(arg0, arg1, arg2, arg3);
    }

    public static void glVertexPointer(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES11.glVertexPointer(arg0, arg1, arg2, arg3);
    }

    public static final int GL_ACTIVE_TEXTURE = android.opengl.GLES11.GL_ACTIVE_TEXTURE;
    public static final int GL_ADD_SIGNED = android.opengl.GLES11.GL_ADD_SIGNED;
    public static final int GL_ALPHA_SCALE = android.opengl.GLES11.GL_ALPHA_SCALE;
    public static final int GL_ALPHA_TEST_FUNC = android.opengl.GLES11.GL_ALPHA_TEST_FUNC;
    public static final int GL_ALPHA_TEST_REF = android.opengl.GLES11.GL_ALPHA_TEST_REF;
    public static final int GL_ARRAY_BUFFER = android.opengl.GLES11.GL_ARRAY_BUFFER;
    public static final int GL_ARRAY_BUFFER_BINDING = android.opengl.GLES11.GL_ARRAY_BUFFER_BINDING;
    public static final int GL_BLEND_DST = android.opengl.GLES11.GL_BLEND_DST;
    public static final int GL_BLEND_SRC = android.opengl.GLES11.GL_BLEND_SRC;
    public static final int GL_BUFFER_ACCESS = android.opengl.GLES11.GL_BUFFER_ACCESS;
    public static final int GL_BUFFER_SIZE = android.opengl.GLES11.GL_BUFFER_SIZE;
    public static final int GL_BUFFER_USAGE = android.opengl.GLES11.GL_BUFFER_USAGE;
    public static final int GL_CLIENT_ACTIVE_TEXTURE = android.opengl.GLES11.GL_CLIENT_ACTIVE_TEXTURE;
    public static final int GL_CLIP_PLANE0 = android.opengl.GLES11.GL_CLIP_PLANE0;
    public static final int GL_CLIP_PLANE1 = android.opengl.GLES11.GL_CLIP_PLANE1;
    public static final int GL_CLIP_PLANE2 = android.opengl.GLES11.GL_CLIP_PLANE2;
    public static final int GL_CLIP_PLANE3 = android.opengl.GLES11.GL_CLIP_PLANE3;
    public static final int GL_CLIP_PLANE4 = android.opengl.GLES11.GL_CLIP_PLANE4;
    public static final int GL_CLIP_PLANE5 = android.opengl.GLES11.GL_CLIP_PLANE5;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING = android.opengl.GLES11.GL_COLOR_ARRAY_BUFFER_BINDING;
    public static final int GL_COLOR_ARRAY_POINTER = android.opengl.GLES11.GL_COLOR_ARRAY_POINTER;
    public static final int GL_COLOR_ARRAY_SIZE = android.opengl.GLES11.GL_COLOR_ARRAY_SIZE;
    public static final int GL_COLOR_ARRAY_STRIDE = android.opengl.GLES11.GL_COLOR_ARRAY_STRIDE;
    public static final int GL_COLOR_ARRAY_TYPE = android.opengl.GLES11.GL_COLOR_ARRAY_TYPE;
    public static final int GL_COLOR_CLEAR_VALUE = android.opengl.GLES11.GL_COLOR_CLEAR_VALUE;
    public static final int GL_COLOR_WRITEMASK = android.opengl.GLES11.GL_COLOR_WRITEMASK;
    public static final int GL_COMBINE = android.opengl.GLES11.GL_COMBINE;
    public static final int GL_COMBINE_ALPHA = android.opengl.GLES11.GL_COMBINE_ALPHA;
    public static final int GL_COMBINE_RGB = android.opengl.GLES11.GL_COMBINE_RGB;
    public static final int GL_CONSTANT = android.opengl.GLES11.GL_CONSTANT;
    public static final int GL_COORD_REPLACE_OES = android.opengl.GLES11.GL_COORD_REPLACE_OES;
    public static final int GL_CULL_FACE_MODE = android.opengl.GLES11.GL_CULL_FACE_MODE;
    public static final int GL_CURRENT_COLOR = android.opengl.GLES11.GL_CURRENT_COLOR;
    public static final int GL_CURRENT_NORMAL = android.opengl.GLES11.GL_CURRENT_NORMAL;
    public static final int GL_CURRENT_TEXTURE_COORDS = android.opengl.GLES11.GL_CURRENT_TEXTURE_COORDS;
    public static final int GL_DEPTH_CLEAR_VALUE = android.opengl.GLES11.GL_DEPTH_CLEAR_VALUE;
    public static final int GL_DEPTH_FUNC = android.opengl.GLES11.GL_DEPTH_FUNC;
    public static final int GL_DEPTH_RANGE = android.opengl.GLES11.GL_DEPTH_RANGE;
    public static final int GL_DEPTH_WRITEMASK = android.opengl.GLES11.GL_DEPTH_WRITEMASK;
    public static final int GL_DOT3_RGB = android.opengl.GLES11.GL_DOT3_RGB;
    public static final int GL_DOT3_RGBA = android.opengl.GLES11.GL_DOT3_RGBA;
    public static final int GL_DYNAMIC_DRAW = android.opengl.GLES11.GL_DYNAMIC_DRAW;
    public static final int GL_ELEMENT_ARRAY_BUFFER = android.opengl.GLES11.GL_ELEMENT_ARRAY_BUFFER;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = android.opengl.GLES11.GL_ELEMENT_ARRAY_BUFFER_BINDING;
    public static final int GL_FRONT_FACE = android.opengl.GLES11.GL_FRONT_FACE;
    public static final int GL_GENERATE_MIPMAP = android.opengl.GLES11.GL_GENERATE_MIPMAP;
    public static final int GL_GENERATE_MIPMAP_HINT = android.opengl.GLES11.GL_GENERATE_MIPMAP_HINT;
    public static final int GL_INTERPOLATE = android.opengl.GLES11.GL_INTERPOLATE;
    public static final int GL_LINE_WIDTH = android.opengl.GLES11.GL_LINE_WIDTH;
    public static final int GL_LOGIC_OP_MODE = android.opengl.GLES11.GL_LOGIC_OP_MODE;
    public static final int GL_MATRIX_MODE = android.opengl.GLES11.GL_MATRIX_MODE;
    public static final int GL_MAX_CLIP_PLANES = android.opengl.GLES11.GL_MAX_CLIP_PLANES;
    public static final int GL_MODELVIEW_MATRIX = android.opengl.GLES11.GL_MODELVIEW_MATRIX;
    public static final int GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES = android.opengl.GLES11.GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES;
    public static final int GL_MODELVIEW_STACK_DEPTH = android.opengl.GLES11.GL_MODELVIEW_STACK_DEPTH;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = android.opengl.GLES11.GL_NORMAL_ARRAY_BUFFER_BINDING;
    public static final int GL_NORMAL_ARRAY_POINTER = android.opengl.GLES11.GL_NORMAL_ARRAY_POINTER;
    public static final int GL_NORMAL_ARRAY_STRIDE = android.opengl.GLES11.GL_NORMAL_ARRAY_STRIDE;
    public static final int GL_NORMAL_ARRAY_TYPE = android.opengl.GLES11.GL_NORMAL_ARRAY_TYPE;
    public static final int GL_OPERAND0_ALPHA = android.opengl.GLES11.GL_OPERAND0_ALPHA;
    public static final int GL_OPERAND0_RGB = android.opengl.GLES11.GL_OPERAND0_RGB;
    public static final int GL_OPERAND1_ALPHA = android.opengl.GLES11.GL_OPERAND1_ALPHA;
    public static final int GL_OPERAND1_RGB = android.opengl.GLES11.GL_OPERAND1_RGB;
    public static final int GL_OPERAND2_ALPHA = android.opengl.GLES11.GL_OPERAND2_ALPHA;
    public static final int GL_OPERAND2_RGB = android.opengl.GLES11.GL_OPERAND2_RGB;
    public static final int GL_POINT_DISTANCE_ATTENUATION = android.opengl.GLES11.GL_POINT_DISTANCE_ATTENUATION;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = android.opengl.GLES11.GL_POINT_FADE_THRESHOLD_SIZE;
    public static final int GL_POINT_SIZE = android.opengl.GLES11.GL_POINT_SIZE;
    public static final int GL_POINT_SIZE_ARRAY_BUFFER_BINDING_OES = android.opengl.GLES11.GL_POINT_SIZE_ARRAY_BUFFER_BINDING_OES;
    public static final int GL_POINT_SIZE_ARRAY_OES = android.opengl.GLES11.GL_POINT_SIZE_ARRAY_OES;
    public static final int GL_POINT_SIZE_ARRAY_POINTER_OES = android.opengl.GLES11.GL_POINT_SIZE_ARRAY_POINTER_OES;
    public static final int GL_POINT_SIZE_ARRAY_STRIDE_OES = android.opengl.GLES11.GL_POINT_SIZE_ARRAY_STRIDE_OES;
    public static final int GL_POINT_SIZE_ARRAY_TYPE_OES = android.opengl.GLES11.GL_POINT_SIZE_ARRAY_TYPE_OES;
    public static final int GL_POINT_SIZE_MAX = android.opengl.GLES11.GL_POINT_SIZE_MAX;
    public static final int GL_POINT_SIZE_MIN = android.opengl.GLES11.GL_POINT_SIZE_MIN;
    public static final int GL_POINT_SPRITE_OES = android.opengl.GLES11.GL_POINT_SPRITE_OES;
    public static final int GL_POLYGON_OFFSET_FACTOR = android.opengl.GLES11.GL_POLYGON_OFFSET_FACTOR;
    public static final int GL_POLYGON_OFFSET_UNITS = android.opengl.GLES11.GL_POLYGON_OFFSET_UNITS;
    public static final int GL_PREVIOUS = android.opengl.GLES11.GL_PREVIOUS;
    public static final int GL_PRIMARY_COLOR = android.opengl.GLES11.GL_PRIMARY_COLOR;
    public static final int GL_PROJECTION_MATRIX = android.opengl.GLES11.GL_PROJECTION_MATRIX;
    public static final int GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES = android.opengl.GLES11.GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES;
    public static final int GL_PROJECTION_STACK_DEPTH = android.opengl.GLES11.GL_PROJECTION_STACK_DEPTH;
    public static final int GL_RGB_SCALE = android.opengl.GLES11.GL_RGB_SCALE;
    public static final int GL_SAMPLES = android.opengl.GLES11.GL_SAMPLES;
    public static final int GL_SAMPLE_BUFFERS = android.opengl.GLES11.GL_SAMPLE_BUFFERS;
    public static final int GL_SAMPLE_COVERAGE_INVERT = android.opengl.GLES11.GL_SAMPLE_COVERAGE_INVERT;
    public static final int GL_SAMPLE_COVERAGE_VALUE = android.opengl.GLES11.GL_SAMPLE_COVERAGE_VALUE;
    public static final int GL_SCISSOR_BOX = android.opengl.GLES11.GL_SCISSOR_BOX;
    public static final int GL_SHADE_MODEL = android.opengl.GLES11.GL_SHADE_MODEL;
    public static final int GL_SRC0_ALPHA = android.opengl.GLES11.GL_SRC0_ALPHA;
    public static final int GL_SRC0_RGB = android.opengl.GLES11.GL_SRC0_RGB;
    public static final int GL_SRC1_ALPHA = android.opengl.GLES11.GL_SRC1_ALPHA;
    public static final int GL_SRC1_RGB = android.opengl.GLES11.GL_SRC1_RGB;
    public static final int GL_SRC2_ALPHA = android.opengl.GLES11.GL_SRC2_ALPHA;
    public static final int GL_SRC2_RGB = android.opengl.GLES11.GL_SRC2_RGB;
    public static final int GL_STATIC_DRAW = android.opengl.GLES11.GL_STATIC_DRAW;
    public static final int GL_STENCIL_CLEAR_VALUE = android.opengl.GLES11.GL_STENCIL_CLEAR_VALUE;
    public static final int GL_STENCIL_FAIL = android.opengl.GLES11.GL_STENCIL_FAIL;
    public static final int GL_STENCIL_FUNC = android.opengl.GLES11.GL_STENCIL_FUNC;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = android.opengl.GLES11.GL_STENCIL_PASS_DEPTH_FAIL;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = android.opengl.GLES11.GL_STENCIL_PASS_DEPTH_PASS;
    public static final int GL_STENCIL_REF = android.opengl.GLES11.GL_STENCIL_REF;
    public static final int GL_STENCIL_VALUE_MASK = android.opengl.GLES11.GL_STENCIL_VALUE_MASK;
    public static final int GL_STENCIL_WRITEMASK = android.opengl.GLES11.GL_STENCIL_WRITEMASK;
    public static final int GL_SUBTRACT = android.opengl.GLES11.GL_SUBTRACT;
    public static final int GL_TEXTURE_BINDING_2D = android.opengl.GLES11.GL_TEXTURE_BINDING_2D;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = android.opengl.GLES11.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER = android.opengl.GLES11.GL_TEXTURE_COORD_ARRAY_POINTER;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE = android.opengl.GLES11.GL_TEXTURE_COORD_ARRAY_SIZE;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = android.opengl.GLES11.GL_TEXTURE_COORD_ARRAY_STRIDE;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE = android.opengl.GLES11.GL_TEXTURE_COORD_ARRAY_TYPE;
    public static final int GL_TEXTURE_MATRIX = android.opengl.GLES11.GL_TEXTURE_MATRIX;
    public static final int GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES = android.opengl.GLES11.GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES;
    public static final int GL_TEXTURE_STACK_DEPTH = android.opengl.GLES11.GL_TEXTURE_STACK_DEPTH;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = android.opengl.GLES11.GL_VERTEX_ARRAY_BUFFER_BINDING;
    public static final int GL_VERTEX_ARRAY_POINTER = android.opengl.GLES11.GL_VERTEX_ARRAY_POINTER;
    public static final int GL_VERTEX_ARRAY_SIZE = android.opengl.GLES11.GL_VERTEX_ARRAY_SIZE;
    public static final int GL_VERTEX_ARRAY_STRIDE = android.opengl.GLES11.GL_VERTEX_ARRAY_STRIDE;
    public static final int GL_VERTEX_ARRAY_TYPE = android.opengl.GLES11.GL_VERTEX_ARRAY_TYPE;
    public static final int GL_VIEWPORT = android.opengl.GLES11.GL_VIEWPORT;
    public static final int GL_WRITE_ONLY = android.opengl.GLES11.GL_WRITE_ONLY;

}
