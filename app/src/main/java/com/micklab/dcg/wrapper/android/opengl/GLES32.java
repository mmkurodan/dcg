// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES32 {
    private final android.opengl.GLES32 real;

    public GLES32(android.opengl.GLES32 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES32 wrap(android.opengl.GLES32 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES32(real);
    }

    public android.opengl.GLES32 unwrap() {
        return real;
    }

    public static void glBlendBarrier() {
        android.opengl.GLES32.glBlendBarrier();
    }

    public static void glBlendEquationSeparatei(int arg0, int arg1, int arg2) {
        android.opengl.GLES32.glBlendEquationSeparatei(arg0, arg1, arg2);
    }

    public static void glBlendEquationi(int arg0, int arg1) {
        android.opengl.GLES32.glBlendEquationi(arg0, arg1);
    }

    public static void glBlendFuncSeparatei(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES32.glBlendFuncSeparatei(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glBlendFunci(int arg0, int arg1, int arg2) {
        android.opengl.GLES32.glBlendFunci(arg0, arg1, arg2);
    }

    public static void glColorMaski(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        android.opengl.GLES32.glColorMaski(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glCopyImageSubData(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        android.opengl.GLES32.glCopyImageSubData(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
    }

    public static void glDebugMessageCallback(com.micklab.dcg.wrapper.android.opengl.GLES32.DebugProc arg0) {
        android.opengl.GLES32.glDebugMessageCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static void glDebugMessageControl(int arg0, int arg1, int arg2, int arg3, java.nio.IntBuffer arg4, boolean arg5) {
        android.opengl.GLES32.glDebugMessageControl(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDebugMessageControl(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6) {
        android.opengl.GLES32.glDebugMessageControl(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glDebugMessageInsert(int arg0, int arg1, int arg2, int arg3, int arg4, java.lang.String arg5) {
        android.opengl.GLES32.glDebugMessageInsert(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDisablei(int arg0, int arg1) {
        android.opengl.GLES32.glDisablei(arg0, arg1);
    }

    public static void glDrawElementsBaseVertex(int arg0, int arg1, int arg2, java.nio.Buffer arg3, int arg4) {
        android.opengl.GLES32.glDrawElementsBaseVertex(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDrawElementsInstancedBaseVertex(int arg0, int arg1, int arg2, java.nio.Buffer arg3, int arg4, int arg5) {
        android.opengl.GLES32.glDrawElementsInstancedBaseVertex(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDrawElementsInstancedBaseVertex(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES32.glDrawElementsInstancedBaseVertex(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDrawRangeElementsBaseVertex(int arg0, int arg1, int arg2, int arg3, int arg4, java.nio.Buffer arg5, int arg6) {
        android.opengl.GLES32.glDrawRangeElementsBaseVertex(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glEnablei(int arg0, int arg1) {
        android.opengl.GLES32.glEnablei(arg0, arg1);
    }

    public static void glFramebufferTexture(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES32.glFramebufferTexture(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String[] glGetDebugMessageLog(int arg0, java.nio.IntBuffer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4) {
        return android.opengl.GLES32.glGetDebugMessageLog(arg0, arg1, arg2, arg3, arg4);
    }

    public static int glGetDebugMessageLog(int arg0, java.nio.IntBuffer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5, java.nio.ByteBuffer arg6) {
        return android.opengl.GLES32.glGetDebugMessageLog(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static java.lang.String[] glGetDebugMessageLog(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8) {
        return android.opengl.GLES32.glGetDebugMessageLog(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static int glGetDebugMessageLog(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int[] arg10, int arg11, byte[] arg12, int arg13) {
        return android.opengl.GLES32.glGetDebugMessageLog(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }

    public static int glGetGraphicsResetStatus() {
        return android.opengl.GLES32.glGetGraphicsResetStatus();
    }

    public static java.lang.String glGetObjectLabel(int arg0, int arg1) {
        return android.opengl.GLES32.glGetObjectLabel(arg0, arg1);
    }

    public static java.lang.String glGetObjectPtrLabel(long arg0) {
        return android.opengl.GLES32.glGetObjectPtrLabel(arg0);
    }

    public static long glGetPointerv(int arg0) {
        return android.opengl.GLES32.glGetPointerv(arg0);
    }

    public static void glGetSamplerParameterIiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glGetSamplerParameterIiv(arg0, arg1, arg2);
    }

    public static void glGetSamplerParameterIiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glGetSamplerParameterIiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetSamplerParameterIuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glGetSamplerParameterIuiv(arg0, arg1, arg2);
    }

    public static void glGetSamplerParameterIuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glGetSamplerParameterIuiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameterIiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glGetTexParameterIiv(arg0, arg1, arg2);
    }

    public static void glGetTexParameterIiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glGetTexParameterIiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameterIuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glGetTexParameterIuiv(arg0, arg1, arg2);
    }

    public static void glGetTexParameterIuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glGetTexParameterIuiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetnUniformfv(int arg0, int arg1, int arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES32.glGetnUniformfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetnUniformfv(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.GLES32.glGetnUniformfv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetnUniformiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES32.glGetnUniformiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetnUniformiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES32.glGetnUniformiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetnUniformuiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES32.glGetnUniformuiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetnUniformuiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES32.glGetnUniformuiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean glIsEnabledi(int arg0, int arg1) {
        return android.opengl.GLES32.glIsEnabledi(arg0, arg1);
    }

    public static void glMinSampleShading(float arg0) {
        android.opengl.GLES32.glMinSampleShading(arg0);
    }

    public static void glObjectLabel(int arg0, int arg1, int arg2, java.lang.String arg3) {
        android.opengl.GLES32.glObjectLabel(arg0, arg1, arg2, arg3);
    }

    public static void glObjectPtrLabel(long arg0, java.lang.String arg1) {
        android.opengl.GLES32.glObjectPtrLabel(arg0, arg1);
    }

    public static void glPatchParameteri(int arg0, int arg1) {
        android.opengl.GLES32.glPatchParameteri(arg0, arg1);
    }

    public static void glPopDebugGroup() {
        android.opengl.GLES32.glPopDebugGroup();
    }

    public static void glPrimitiveBoundingBox(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        android.opengl.GLES32.glPrimitiveBoundingBox(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glPushDebugGroup(int arg0, int arg1, int arg2, java.lang.String arg3) {
        android.opengl.GLES32.glPushDebugGroup(arg0, arg1, arg2, arg3);
    }

    public static void glReadnPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.nio.Buffer arg7) {
        android.opengl.GLES32.glReadnPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glSamplerParameterIiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glSamplerParameterIiv(arg0, arg1, arg2);
    }

    public static void glSamplerParameterIiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glSamplerParameterIiv(arg0, arg1, arg2, arg3);
    }

    public static void glSamplerParameterIuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glSamplerParameterIuiv(arg0, arg1, arg2);
    }

    public static void glSamplerParameterIuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glSamplerParameterIuiv(arg0, arg1, arg2, arg3);
    }

    public static void glTexBuffer(int arg0, int arg1, int arg2) {
        android.opengl.GLES32.glTexBuffer(arg0, arg1, arg2);
    }

    public static void glTexBufferRange(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES32.glTexBufferRange(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glTexParameterIiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glTexParameterIiv(arg0, arg1, arg2);
    }

    public static void glTexParameterIiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glTexParameterIiv(arg0, arg1, arg2, arg3);
    }

    public static void glTexParameterIuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES32.glTexParameterIuiv(arg0, arg1, arg2);
    }

    public static void glTexParameterIuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES32.glTexParameterIuiv(arg0, arg1, arg2, arg3);
    }

    public static void glTexStorage3DMultisample(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        android.opengl.GLES32.glTexStorage3DMultisample(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static final int GL_BUFFER = android.opengl.GLES32.GL_BUFFER;
    public static final int GL_CLAMP_TO_BORDER = android.opengl.GLES32.GL_CLAMP_TO_BORDER;
    public static final int GL_COLORBURN = android.opengl.GLES32.GL_COLORBURN;
    public static final int GL_COLORDODGE = android.opengl.GLES32.GL_COLORDODGE;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x10 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_10x10;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x5 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_10x5;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x6 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_10x6;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x8 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_10x8;
    public static final int GL_COMPRESSED_RGBA_ASTC_12x10 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_12x10;
    public static final int GL_COMPRESSED_RGBA_ASTC_12x12 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_12x12;
    public static final int GL_COMPRESSED_RGBA_ASTC_4x4 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_4x4;
    public static final int GL_COMPRESSED_RGBA_ASTC_5x4 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_5x4;
    public static final int GL_COMPRESSED_RGBA_ASTC_5x5 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_5x5;
    public static final int GL_COMPRESSED_RGBA_ASTC_6x5 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_6x5;
    public static final int GL_COMPRESSED_RGBA_ASTC_6x6 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_6x6;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x5 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_8x5;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x6 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_8x6;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x8 = android.opengl.GLES32.GL_COMPRESSED_RGBA_ASTC_8x8;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8 = android.opengl.GLES32.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8;
    public static final int GL_CONTEXT_FLAGS = android.opengl.GLES32.GL_CONTEXT_FLAGS;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = android.opengl.GLES32.GL_CONTEXT_FLAG_DEBUG_BIT;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = android.opengl.GLES32.GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT;
    public static final int GL_CONTEXT_LOST = android.opengl.GLES32.GL_CONTEXT_LOST;
    public static final int GL_DARKEN = android.opengl.GLES32.GL_DARKEN;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = android.opengl.GLES32.GL_DEBUG_CALLBACK_FUNCTION;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = android.opengl.GLES32.GL_DEBUG_CALLBACK_USER_PARAM;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = android.opengl.GLES32.GL_DEBUG_GROUP_STACK_DEPTH;
    public static final int GL_DEBUG_LOGGED_MESSAGES = android.opengl.GLES32.GL_DEBUG_LOGGED_MESSAGES;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = android.opengl.GLES32.GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH;
    public static final int GL_DEBUG_OUTPUT = android.opengl.GLES32.GL_DEBUG_OUTPUT;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = android.opengl.GLES32.GL_DEBUG_OUTPUT_SYNCHRONOUS;
    public static final int GL_DEBUG_SEVERITY_HIGH = android.opengl.GLES32.GL_DEBUG_SEVERITY_HIGH;
    public static final int GL_DEBUG_SEVERITY_LOW = android.opengl.GLES32.GL_DEBUG_SEVERITY_LOW;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = android.opengl.GLES32.GL_DEBUG_SEVERITY_MEDIUM;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = android.opengl.GLES32.GL_DEBUG_SEVERITY_NOTIFICATION;
    public static final int GL_DEBUG_SOURCE_API = android.opengl.GLES32.GL_DEBUG_SOURCE_API;
    public static final int GL_DEBUG_SOURCE_APPLICATION = android.opengl.GLES32.GL_DEBUG_SOURCE_APPLICATION;
    public static final int GL_DEBUG_SOURCE_OTHER = android.opengl.GLES32.GL_DEBUG_SOURCE_OTHER;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = android.opengl.GLES32.GL_DEBUG_SOURCE_SHADER_COMPILER;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = android.opengl.GLES32.GL_DEBUG_SOURCE_THIRD_PARTY;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = android.opengl.GLES32.GL_DEBUG_SOURCE_WINDOW_SYSTEM;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = android.opengl.GLES32.GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR;
    public static final int GL_DEBUG_TYPE_ERROR = android.opengl.GLES32.GL_DEBUG_TYPE_ERROR;
    public static final int GL_DEBUG_TYPE_MARKER = android.opengl.GLES32.GL_DEBUG_TYPE_MARKER;
    public static final int GL_DEBUG_TYPE_OTHER = android.opengl.GLES32.GL_DEBUG_TYPE_OTHER;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = android.opengl.GLES32.GL_DEBUG_TYPE_PERFORMANCE;
    public static final int GL_DEBUG_TYPE_POP_GROUP = android.opengl.GLES32.GL_DEBUG_TYPE_POP_GROUP;
    public static final int GL_DEBUG_TYPE_PORTABILITY = android.opengl.GLES32.GL_DEBUG_TYPE_PORTABILITY;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = android.opengl.GLES32.GL_DEBUG_TYPE_PUSH_GROUP;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = android.opengl.GLES32.GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR;
    public static final int GL_DIFFERENCE = android.opengl.GLES32.GL_DIFFERENCE;
    public static final int GL_EXCLUSION = android.opengl.GLES32.GL_EXCLUSION;
    public static final int GL_FIRST_VERTEX_CONVENTION = android.opengl.GLES32.GL_FIRST_VERTEX_CONVENTION;
    public static final int GL_FRACTIONAL_EVEN = android.opengl.GLES32.GL_FRACTIONAL_EVEN;
    public static final int GL_FRACTIONAL_ODD = android.opengl.GLES32.GL_FRACTIONAL_ODD;
    public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = android.opengl.GLES32.GL_FRAGMENT_INTERPOLATION_OFFSET_BITS;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = android.opengl.GLES32.GL_FRAMEBUFFER_ATTACHMENT_LAYERED;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = android.opengl.GLES32.GL_FRAMEBUFFER_DEFAULT_LAYERS;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = android.opengl.GLES32.GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS;
    public static final int GL_GEOMETRY_INPUT_TYPE = android.opengl.GLES32.GL_GEOMETRY_INPUT_TYPE;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = android.opengl.GLES32.GL_GEOMETRY_OUTPUT_TYPE;
    public static final int GL_GEOMETRY_SHADER = android.opengl.GLES32.GL_GEOMETRY_SHADER;
    public static final int GL_GEOMETRY_SHADER_BIT = android.opengl.GLES32.GL_GEOMETRY_SHADER_BIT;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = android.opengl.GLES32.GL_GEOMETRY_SHADER_INVOCATIONS;
    public static final int GL_GEOMETRY_VERTICES_OUT = android.opengl.GLES32.GL_GEOMETRY_VERTICES_OUT;
    public static final int GL_GUILTY_CONTEXT_RESET = android.opengl.GLES32.GL_GUILTY_CONTEXT_RESET;
    public static final int GL_HARDLIGHT = android.opengl.GLES32.GL_HARDLIGHT;
    public static final int GL_HSL_COLOR = android.opengl.GLES32.GL_HSL_COLOR;
    public static final int GL_HSL_HUE = android.opengl.GLES32.GL_HSL_HUE;
    public static final int GL_HSL_LUMINOSITY = android.opengl.GLES32.GL_HSL_LUMINOSITY;
    public static final int GL_HSL_SATURATION = android.opengl.GLES32.GL_HSL_SATURATION;
    public static final int GL_IMAGE_BUFFER = android.opengl.GLES32.GL_IMAGE_BUFFER;
    public static final int GL_IMAGE_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_IMAGE_CUBE_MAP_ARRAY;
    public static final int GL_INNOCENT_CONTEXT_RESET = android.opengl.GLES32.GL_INNOCENT_CONTEXT_RESET;
    public static final int GL_INT_IMAGE_BUFFER = android.opengl.GLES32.GL_INT_IMAGE_BUFFER;
    public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_INT_IMAGE_CUBE_MAP_ARRAY;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = android.opengl.GLES32.GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY;
    public static final int GL_INT_SAMPLER_BUFFER = android.opengl.GLES32.GL_INT_SAMPLER_BUFFER;
    public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_INT_SAMPLER_CUBE_MAP_ARRAY;
    public static final int GL_ISOLINES = android.opengl.GLES32.GL_ISOLINES;
    public static final int GL_IS_PER_PATCH = android.opengl.GLES32.GL_IS_PER_PATCH;
    public static final int GL_LAST_VERTEX_CONVENTION = android.opengl.GLES32.GL_LAST_VERTEX_CONVENTION;
    public static final int GL_LAYER_PROVOKING_VERTEX = android.opengl.GLES32.GL_LAYER_PROVOKING_VERTEX;
    public static final int GL_LIGHTEN = android.opengl.GLES32.GL_LIGHTEN;
    public static final int GL_LINES_ADJACENCY = android.opengl.GLES32.GL_LINES_ADJACENCY;
    public static final int GL_LINE_STRIP_ADJACENCY = android.opengl.GLES32.GL_LINE_STRIP_ADJACENCY;
    public static final int GL_LOSE_CONTEXT_ON_RESET = android.opengl.GLES32.GL_LOSE_CONTEXT_ON_RESET;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = android.opengl.GLES32.GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = android.opengl.GLES32.GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = android.opengl.GLES32.GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = android.opengl.GLES32.GL_MAX_DEBUG_GROUP_STACK_DEPTH;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = android.opengl.GLES32.GL_MAX_DEBUG_LOGGED_MESSAGES;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = android.opengl.GLES32.GL_MAX_DEBUG_MESSAGE_LENGTH;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = android.opengl.GLES32.GL_MAX_FRAGMENT_INTERPOLATION_OFFSET;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS = android.opengl.GLES32.GL_MAX_FRAMEBUFFER_LAYERS;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = android.opengl.GLES32.GL_MAX_GEOMETRY_ATOMIC_COUNTERS;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES32.GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = android.opengl.GLES32.GL_MAX_GEOMETRY_IMAGE_UNIFORMS;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_GEOMETRY_INPUT_COMPONENTS;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_GEOMETRY_OUTPUT_COMPONENTS;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = android.opengl.GLES32.GL_MAX_GEOMETRY_OUTPUT_VERTICES;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = android.opengl.GLES32.GL_MAX_GEOMETRY_SHADER_INVOCATIONS;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = android.opengl.GLES32.GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = android.opengl.GLES32.GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = android.opengl.GLES32.GL_MAX_GEOMETRY_UNIFORM_BLOCKS;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = android.opengl.GLES32.GL_MAX_GEOMETRY_UNIFORM_COMPONENTS;
    public static final int GL_MAX_LABEL_LENGTH = android.opengl.GLES32.GL_MAX_LABEL_LENGTH;
    public static final int GL_MAX_PATCH_VERTICES = android.opengl.GLES32.GL_MAX_PATCH_VERTICES;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_INPUT_COMPONENTS;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS;
    public static final int GL_MAX_TESS_GEN_LEVEL = android.opengl.GLES32.GL_MAX_TESS_GEN_LEVEL;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS = android.opengl.GLES32.GL_MAX_TESS_PATCH_COMPONENTS;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = android.opengl.GLES32.GL_MAX_TEXTURE_BUFFER_SIZE;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = android.opengl.GLES32.GL_MIN_FRAGMENT_INTERPOLATION_OFFSET;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE = android.opengl.GLES32.GL_MIN_SAMPLE_SHADING_VALUE;
    public static final int GL_MULTIPLY = android.opengl.GLES32.GL_MULTIPLY;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY = android.opengl.GLES32.GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_RANGE = android.opengl.GLES32.GL_MULTISAMPLE_LINE_WIDTH_RANGE;
    public static final int GL_NO_RESET_NOTIFICATION = android.opengl.GLES32.GL_NO_RESET_NOTIFICATION;
    public static final int GL_OVERLAY = android.opengl.GLES32.GL_OVERLAY;
    public static final int GL_PATCHES = android.opengl.GLES32.GL_PATCHES;
    public static final int GL_PATCH_VERTICES = android.opengl.GLES32.GL_PATCH_VERTICES;
    public static final int GL_PRIMITIVES_GENERATED = android.opengl.GLES32.GL_PRIMITIVES_GENERATED;
    public static final int GL_PRIMITIVE_BOUNDING_BOX = android.opengl.GLES32.GL_PRIMITIVE_BOUNDING_BOX;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = android.opengl.GLES32.GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED;
    public static final int GL_PROGRAM = android.opengl.GLES32.GL_PROGRAM;
    public static final int GL_PROGRAM_PIPELINE = android.opengl.GLES32.GL_PROGRAM_PIPELINE;
    public static final int GL_QUADS = android.opengl.GLES32.GL_QUADS;
    public static final int GL_QUERY = android.opengl.GLES32.GL_QUERY;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = android.opengl.GLES32.GL_REFERENCED_BY_GEOMETRY_SHADER;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = android.opengl.GLES32.GL_REFERENCED_BY_TESS_CONTROL_SHADER;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = android.opengl.GLES32.GL_REFERENCED_BY_TESS_EVALUATION_SHADER;
    public static final int GL_RESET_NOTIFICATION_STRATEGY = android.opengl.GLES32.GL_RESET_NOTIFICATION_STRATEGY;
    public static final int GL_SAMPLER = android.opengl.GLES32.GL_SAMPLER;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = android.opengl.GLES32.GL_SAMPLER_2D_MULTISAMPLE_ARRAY;
    public static final int GL_SAMPLER_BUFFER = android.opengl.GLES32.GL_SAMPLER_BUFFER;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_SAMPLER_CUBE_MAP_ARRAY;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = android.opengl.GLES32.GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW;
    public static final int GL_SAMPLE_SHADING = android.opengl.GLES32.GL_SAMPLE_SHADING;
    public static final int GL_SCREEN = android.opengl.GLES32.GL_SCREEN;
    public static final int GL_SHADER = android.opengl.GLES32.GL_SHADER;
    public static final int GL_SOFTLIGHT = android.opengl.GLES32.GL_SOFTLIGHT;
    public static final int GL_STACK_OVERFLOW = android.opengl.GLES32.GL_STACK_OVERFLOW;
    public static final int GL_STACK_UNDERFLOW = android.opengl.GLES32.GL_STACK_UNDERFLOW;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = android.opengl.GLES32.GL_TESS_CONTROL_OUTPUT_VERTICES;
    public static final int GL_TESS_CONTROL_SHADER = android.opengl.GLES32.GL_TESS_CONTROL_SHADER;
    public static final int GL_TESS_CONTROL_SHADER_BIT = android.opengl.GLES32.GL_TESS_CONTROL_SHADER_BIT;
    public static final int GL_TESS_EVALUATION_SHADER = android.opengl.GLES32.GL_TESS_EVALUATION_SHADER;
    public static final int GL_TESS_EVALUATION_SHADER_BIT = android.opengl.GLES32.GL_TESS_EVALUATION_SHADER_BIT;
    public static final int GL_TESS_GEN_MODE = android.opengl.GLES32.GL_TESS_GEN_MODE;
    public static final int GL_TESS_GEN_POINT_MODE = android.opengl.GLES32.GL_TESS_GEN_POINT_MODE;
    public static final int GL_TESS_GEN_SPACING = android.opengl.GLES32.GL_TESS_GEN_SPACING;
    public static final int GL_TESS_GEN_VERTEX_ORDER = android.opengl.GLES32.GL_TESS_GEN_VERTEX_ORDER;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = android.opengl.GLES32.GL_TEXTURE_2D_MULTISAMPLE_ARRAY;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = android.opengl.GLES32.GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY;
    public static final int GL_TEXTURE_BINDING_BUFFER = android.opengl.GLES32.GL_TEXTURE_BINDING_BUFFER;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_TEXTURE_BINDING_CUBE_MAP_ARRAY;
    public static final int GL_TEXTURE_BORDER_COLOR = android.opengl.GLES32.GL_TEXTURE_BORDER_COLOR;
    public static final int GL_TEXTURE_BUFFER = android.opengl.GLES32.GL_TEXTURE_BUFFER;
    public static final int GL_TEXTURE_BUFFER_BINDING = android.opengl.GLES32.GL_TEXTURE_BUFFER_BINDING;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = android.opengl.GLES32.GL_TEXTURE_BUFFER_DATA_STORE_BINDING;
    public static final int GL_TEXTURE_BUFFER_OFFSET = android.opengl.GLES32.GL_TEXTURE_BUFFER_OFFSET;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = android.opengl.GLES32.GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT;
    public static final int GL_TEXTURE_BUFFER_SIZE = android.opengl.GLES32.GL_TEXTURE_BUFFER_SIZE;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_TEXTURE_CUBE_MAP_ARRAY;
    public static final int GL_TRIANGLES_ADJACENCY = android.opengl.GLES32.GL_TRIANGLES_ADJACENCY;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = android.opengl.GLES32.GL_TRIANGLE_STRIP_ADJACENCY;
    public static final int GL_UNDEFINED_VERTEX = android.opengl.GLES32.GL_UNDEFINED_VERTEX;
    public static final int GL_UNKNOWN_CONTEXT_RESET = android.opengl.GLES32.GL_UNKNOWN_CONTEXT_RESET;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = android.opengl.GLES32.GL_UNSIGNED_INT_IMAGE_BUFFER;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = android.opengl.GLES32.GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = android.opengl.GLES32.GL_UNSIGNED_INT_SAMPLER_BUFFER;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = android.opengl.GLES32.GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY;
    public static final int GL_VERTEX_ARRAY = android.opengl.GLES32.GL_VERTEX_ARRAY;

    public static final class DebugProc {
        private final android.opengl.GLES32.DebugProc real;

        public DebugProc(android.opengl.GLES32.DebugProc real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLES32.DebugProc wrap(android.opengl.GLES32.DebugProc real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES32.DebugProc(real);
        }

        public android.opengl.GLES32.DebugProc unwrap() {
            return real;
        }

        public void onMessage(int arg0, int arg1, int arg2, int arg3, java.lang.String arg4) {
            real.onMessage(arg0, arg1, arg2, arg3, arg4);
        }

    }
}
