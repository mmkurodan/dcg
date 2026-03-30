// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES31Ext {
    private final android.opengl.GLES31Ext real;

    public GLES31Ext(android.opengl.GLES31Ext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES31Ext wrap(android.opengl.GLES31Ext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES31Ext(real);
    }

    public android.opengl.GLES31Ext unwrap() {
        return real;
    }

    public static void glBlendBarrierKHR() {
        android.opengl.GLES31Ext.glBlendBarrierKHR();
    }

    public static void glBlendEquationSeparateiEXT(int arg0, int arg1, int arg2) {
        android.opengl.GLES31Ext.glBlendEquationSeparateiEXT(arg0, arg1, arg2);
    }

    public static void glBlendEquationiEXT(int arg0, int arg1) {
        android.opengl.GLES31Ext.glBlendEquationiEXT(arg0, arg1);
    }

    public static void glBlendFuncSeparateiEXT(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES31Ext.glBlendFuncSeparateiEXT(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glBlendFunciEXT(int arg0, int arg1, int arg2) {
        android.opengl.GLES31Ext.glBlendFunciEXT(arg0, arg1, arg2);
    }

    public static void glColorMaskiEXT(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        android.opengl.GLES31Ext.glColorMaskiEXT(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glCopyImageSubDataEXT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        android.opengl.GLES31Ext.glCopyImageSubDataEXT(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
    }

    public static void glDebugMessageCallbackKHR(com.micklab.dcg.wrapper.android.opengl.GLES31Ext.DebugProcKHR arg0) {
        android.opengl.GLES31Ext.glDebugMessageCallbackKHR(arg0 == null ? null : arg0.unwrap());
    }

    public static void glDebugMessageControlKHR(int arg0, int arg1, int arg2, int arg3, java.nio.IntBuffer arg4, boolean arg5) {
        android.opengl.GLES31Ext.glDebugMessageControlKHR(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDebugMessageControlKHR(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6) {
        android.opengl.GLES31Ext.glDebugMessageControlKHR(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glDebugMessageInsertKHR(int arg0, int arg1, int arg2, int arg3, java.lang.String arg4) {
        android.opengl.GLES31Ext.glDebugMessageInsertKHR(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDisableiEXT(int arg0, int arg1) {
        android.opengl.GLES31Ext.glDisableiEXT(arg0, arg1);
    }

    public static void glEnableiEXT(int arg0, int arg1) {
        android.opengl.GLES31Ext.glEnableiEXT(arg0, arg1);
    }

    public static void glFramebufferTextureEXT(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES31Ext.glFramebufferTextureEXT(arg0, arg1, arg2, arg3);
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES31Ext.DebugProcKHR glGetDebugMessageCallbackKHR() {
        return com.micklab.dcg.wrapper.android.opengl.GLES31Ext.DebugProcKHR.wrap(android.opengl.GLES31Ext.glGetDebugMessageCallbackKHR());
    }

    public static java.lang.String[] glGetDebugMessageLogKHR(int arg0, java.nio.IntBuffer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4) {
        return android.opengl.GLES31Ext.glGetDebugMessageLogKHR(arg0, arg1, arg2, arg3, arg4);
    }

    public static int glGetDebugMessageLogKHR(int arg0, java.nio.IntBuffer arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5, java.nio.ByteBuffer arg6) {
        return android.opengl.GLES31Ext.glGetDebugMessageLogKHR(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static java.lang.String[] glGetDebugMessageLogKHR(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8) {
        return android.opengl.GLES31Ext.glGetDebugMessageLogKHR(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static int glGetDebugMessageLogKHR(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int[] arg10, int arg11, byte[] arg12, int arg13) {
        return android.opengl.GLES31Ext.glGetDebugMessageLogKHR(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }

    public static java.lang.String glGetObjectLabelKHR(int arg0, int arg1) {
        return android.opengl.GLES31Ext.glGetObjectLabelKHR(arg0, arg1);
    }

    public static java.lang.String glGetObjectPtrLabelKHR(long arg0) {
        return android.opengl.GLES31Ext.glGetObjectPtrLabelKHR(arg0);
    }

    public static void glGetSamplerParameterIivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glGetSamplerParameterIivEXT(arg0, arg1, arg2);
    }

    public static void glGetSamplerParameterIivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glGetSamplerParameterIivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glGetSamplerParameterIuivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glGetSamplerParameterIuivEXT(arg0, arg1, arg2);
    }

    public static void glGetSamplerParameterIuivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glGetSamplerParameterIuivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameterIivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glGetTexParameterIivEXT(arg0, arg1, arg2);
    }

    public static void glGetTexParameterIivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glGetTexParameterIivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameterIuivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glGetTexParameterIuivEXT(arg0, arg1, arg2);
    }

    public static void glGetTexParameterIuivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glGetTexParameterIuivEXT(arg0, arg1, arg2, arg3);
    }

    public static boolean glIsEnablediEXT(int arg0, int arg1) {
        return android.opengl.GLES31Ext.glIsEnablediEXT(arg0, arg1);
    }

    public static void glMinSampleShadingOES(float arg0) {
        android.opengl.GLES31Ext.glMinSampleShadingOES(arg0);
    }

    public static void glObjectLabelKHR(int arg0, int arg1, int arg2, java.lang.String arg3) {
        android.opengl.GLES31Ext.glObjectLabelKHR(arg0, arg1, arg2, arg3);
    }

    public static void glObjectPtrLabelKHR(long arg0, java.lang.String arg1) {
        android.opengl.GLES31Ext.glObjectPtrLabelKHR(arg0, arg1);
    }

    public static void glPatchParameteriEXT(int arg0, int arg1) {
        android.opengl.GLES31Ext.glPatchParameteriEXT(arg0, arg1);
    }

    public static void glPopDebugGroupKHR() {
        android.opengl.GLES31Ext.glPopDebugGroupKHR();
    }

    public static void glPrimitiveBoundingBoxEXT(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        android.opengl.GLES31Ext.glPrimitiveBoundingBoxEXT(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glPushDebugGroupKHR(int arg0, int arg1, int arg2, java.lang.String arg3) {
        android.opengl.GLES31Ext.glPushDebugGroupKHR(arg0, arg1, arg2, arg3);
    }

    public static void glSamplerParameterIivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glSamplerParameterIivEXT(arg0, arg1, arg2);
    }

    public static void glSamplerParameterIivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glSamplerParameterIivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glSamplerParameterIuivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glSamplerParameterIuivEXT(arg0, arg1, arg2);
    }

    public static void glSamplerParameterIuivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glSamplerParameterIuivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glTexBufferEXT(int arg0, int arg1, int arg2) {
        android.opengl.GLES31Ext.glTexBufferEXT(arg0, arg1, arg2);
    }

    public static void glTexBufferRangeEXT(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES31Ext.glTexBufferRangeEXT(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glTexParameterIivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glTexParameterIivEXT(arg0, arg1, arg2);
    }

    public static void glTexParameterIivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glTexParameterIivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glTexParameterIuivEXT(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31Ext.glTexParameterIuivEXT(arg0, arg1, arg2);
    }

    public static void glTexParameterIuivEXT(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31Ext.glTexParameterIuivEXT(arg0, arg1, arg2, arg3);
    }

    public static void glTexStorage3DMultisampleOES(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        android.opengl.GLES31Ext.glTexStorage3DMultisampleOES(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static final int GL_BLEND_ADVANCED_COHERENT_KHR = android.opengl.GLES31Ext.GL_BLEND_ADVANCED_COHERENT_KHR;
    public static final int GL_BUFFER_KHR = android.opengl.GLES31Ext.GL_BUFFER_KHR;
    public static final int GL_CLAMP_TO_BORDER_EXT = android.opengl.GLES31Ext.GL_CLAMP_TO_BORDER_EXT;
    public static final int GL_COLORBURN_KHR = android.opengl.GLES31Ext.GL_COLORBURN_KHR;
    public static final int GL_COLORDODGE_KHR = android.opengl.GLES31Ext.GL_COLORDODGE_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x10_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_10x10_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_10x5_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x6_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_10x6_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_10x8_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_10x8_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_12x10_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_12x10_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_12x12_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_12x12_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_4x4_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_4x4_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_5x4_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_5x4_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_5x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_5x5_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_6x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_6x5_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_6x6_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_6x6_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_8x5_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x6_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_8x6_KHR;
    public static final int GL_COMPRESSED_RGBA_ASTC_8x8_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_RGBA_ASTC_8x8_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR = android.opengl.GLES31Ext.GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT_KHR = android.opengl.GLES31Ext.GL_CONTEXT_FLAG_DEBUG_BIT_KHR;
    public static final int GL_DARKEN_KHR = android.opengl.GLES31Ext.GL_DARKEN_KHR;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_KHR = android.opengl.GLES31Ext.GL_DEBUG_CALLBACK_FUNCTION_KHR;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_KHR = android.opengl.GLES31Ext.GL_DEBUG_CALLBACK_USER_PARAM_KHR;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH_KHR = android.opengl.GLES31Ext.GL_DEBUG_GROUP_STACK_DEPTH_KHR;
    public static final int GL_DEBUG_LOGGED_MESSAGES_KHR = android.opengl.GLES31Ext.GL_DEBUG_LOGGED_MESSAGES_KHR;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR = android.opengl.GLES31Ext.GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR;
    public static final int GL_DEBUG_OUTPUT_KHR = android.opengl.GLES31Ext.GL_DEBUG_OUTPUT_KHR;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR = android.opengl.GLES31Ext.GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR;
    public static final int GL_DEBUG_SEVERITY_HIGH_KHR = android.opengl.GLES31Ext.GL_DEBUG_SEVERITY_HIGH_KHR;
    public static final int GL_DEBUG_SEVERITY_LOW_KHR = android.opengl.GLES31Ext.GL_DEBUG_SEVERITY_LOW_KHR;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_KHR = android.opengl.GLES31Ext.GL_DEBUG_SEVERITY_MEDIUM_KHR;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION_KHR = android.opengl.GLES31Ext.GL_DEBUG_SEVERITY_NOTIFICATION_KHR;
    public static final int GL_DEBUG_SOURCE_API_KHR = android.opengl.GLES31Ext.GL_DEBUG_SOURCE_API_KHR;
    public static final int GL_DEBUG_SOURCE_APPLICATION_KHR = android.opengl.GLES31Ext.GL_DEBUG_SOURCE_APPLICATION_KHR;
    public static final int GL_DEBUG_SOURCE_OTHER_KHR = android.opengl.GLES31Ext.GL_DEBUG_SOURCE_OTHER_KHR;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_KHR = android.opengl.GLES31Ext.GL_DEBUG_SOURCE_SHADER_COMPILER_KHR;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_KHR = android.opengl.GLES31Ext.GL_DEBUG_SOURCE_THIRD_PARTY_KHR;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR = android.opengl.GLES31Ext.GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR;
    public static final int GL_DEBUG_TYPE_ERROR_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_ERROR_KHR;
    public static final int GL_DEBUG_TYPE_MARKER_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_MARKER_KHR;
    public static final int GL_DEBUG_TYPE_OTHER_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_OTHER_KHR;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_PERFORMANCE_KHR;
    public static final int GL_DEBUG_TYPE_POP_GROUP_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_POP_GROUP_KHR;
    public static final int GL_DEBUG_TYPE_PORTABILITY_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_PORTABILITY_KHR;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_PUSH_GROUP_KHR;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR = android.opengl.GLES31Ext.GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR;
    public static final int GL_DECODE_EXT = android.opengl.GLES31Ext.GL_DECODE_EXT;
    public static final int GL_DIFFERENCE_KHR = android.opengl.GLES31Ext.GL_DIFFERENCE_KHR;
    public static final int GL_EXCLUSION_KHR = android.opengl.GLES31Ext.GL_EXCLUSION_KHR;
    public static final int GL_FIRST_VERTEX_CONVENTION_EXT = android.opengl.GLES31Ext.GL_FIRST_VERTEX_CONVENTION_EXT;
    public static final int GL_FRACTIONAL_EVEN_EXT = android.opengl.GLES31Ext.GL_FRACTIONAL_EVEN_EXT;
    public static final int GL_FRACTIONAL_ODD_EXT = android.opengl.GLES31Ext.GL_FRACTIONAL_ODD_EXT;
    public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS_OES = android.opengl.GLES31Ext.GL_FRAGMENT_INTERPOLATION_OFFSET_BITS_OES;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = android.opengl.GLES31Ext.GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS_EXT = android.opengl.GLES31Ext.GL_FRAMEBUFFER_DEFAULT_LAYERS_EXT;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = android.opengl.GLES31Ext.GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT;
    public static final int GL_GEOMETRY_LINKED_INPUT_TYPE_EXT = android.opengl.GLES31Ext.GL_GEOMETRY_LINKED_INPUT_TYPE_EXT;
    public static final int GL_GEOMETRY_LINKED_OUTPUT_TYPE_EXT = android.opengl.GLES31Ext.GL_GEOMETRY_LINKED_OUTPUT_TYPE_EXT;
    public static final int GL_GEOMETRY_LINKED_VERTICES_OUT_EXT = android.opengl.GLES31Ext.GL_GEOMETRY_LINKED_VERTICES_OUT_EXT;
    public static final int GL_GEOMETRY_SHADER_BIT_EXT = android.opengl.GLES31Ext.GL_GEOMETRY_SHADER_BIT_EXT;
    public static final int GL_GEOMETRY_SHADER_EXT = android.opengl.GLES31Ext.GL_GEOMETRY_SHADER_EXT;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS_EXT = android.opengl.GLES31Ext.GL_GEOMETRY_SHADER_INVOCATIONS_EXT;
    public static final int GL_HARDLIGHT_KHR = android.opengl.GLES31Ext.GL_HARDLIGHT_KHR;
    public static final int GL_HSL_COLOR_KHR = android.opengl.GLES31Ext.GL_HSL_COLOR_KHR;
    public static final int GL_HSL_HUE_KHR = android.opengl.GLES31Ext.GL_HSL_HUE_KHR;
    public static final int GL_HSL_LUMINOSITY_KHR = android.opengl.GLES31Ext.GL_HSL_LUMINOSITY_KHR;
    public static final int GL_HSL_SATURATION_KHR = android.opengl.GLES31Ext.GL_HSL_SATURATION_KHR;
    public static final int GL_IMAGE_BUFFER_EXT = android.opengl.GLES31Ext.GL_IMAGE_BUFFER_EXT;
    public static final int GL_IMAGE_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_IMAGE_CUBE_MAP_ARRAY_EXT;
    public static final int GL_INT_IMAGE_BUFFER_EXT = android.opengl.GLES31Ext.GL_INT_IMAGE_BUFFER_EXT;
    public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_INT_IMAGE_CUBE_MAP_ARRAY_EXT;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = android.opengl.GLES31Ext.GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = android.opengl.GLES31Ext.GL_INT_SAMPLER_BUFFER_EXT;
    public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_INT_SAMPLER_CUBE_MAP_ARRAY_EXT;
    public static final int GL_ISOLINES_EXT = android.opengl.GLES31Ext.GL_ISOLINES_EXT;
    public static final int GL_IS_PER_PATCH_EXT = android.opengl.GLES31Ext.GL_IS_PER_PATCH_EXT;
    public static final int GL_LAST_VERTEX_CONVENTION_EXT = android.opengl.GLES31Ext.GL_LAST_VERTEX_CONVENTION_EXT;
    public static final int GL_LAYER_PROVOKING_VERTEX_EXT = android.opengl.GLES31Ext.GL_LAYER_PROVOKING_VERTEX_EXT;
    public static final int GL_LIGHTEN_KHR = android.opengl.GLES31Ext.GL_LIGHTEN_KHR;
    public static final int GL_LINES_ADJACENCY_EXT = android.opengl.GLES31Ext.GL_LINES_ADJACENCY_EXT;
    public static final int GL_LINE_STRIP_ADJACENCY_EXT = android.opengl.GLES31Ext.GL_LINE_STRIP_ADJACENCY_EXT;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS_EXT;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS_EXT;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS_EXT;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR = android.opengl.GLES31Ext.GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_KHR = android.opengl.GLES31Ext.GL_MAX_DEBUG_LOGGED_MESSAGES_KHR;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_KHR = android.opengl.GLES31Ext.GL_MAX_DEBUG_MESSAGE_LENGTH_KHR;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_OES = android.opengl.GLES31Ext.GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_OES;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS_EXT = android.opengl.GLES31Ext.GL_MAX_FRAMEBUFFER_LAYERS_EXT;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_ATOMIC_COUNTERS_EXT;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS_EXT;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_IMAGE_UNIFORMS_EXT;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_INPUT_COMPONENTS_EXT;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_OUTPUT_COMPONENTS_EXT;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_SHADER_INVOCATIONS_EXT;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS_EXT;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_UNIFORM_BLOCKS_EXT;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT;
    public static final int GL_MAX_LABEL_LENGTH_KHR = android.opengl.GLES31Ext.GL_MAX_LABEL_LENGTH_KHR;
    public static final int GL_MAX_PATCH_VERTICES_EXT = android.opengl.GLES31Ext.GL_MAX_PATCH_VERTICES_EXT;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS_EXT;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS_EXT;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS_EXT;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_INPUT_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS_EXT;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS_EXT;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS_EXT;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS_EXT;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS_EXT;
    public static final int GL_MAX_TESS_GEN_LEVEL_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_GEN_LEVEL_EXT;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS_EXT = android.opengl.GLES31Ext.GL_MAX_TESS_PATCH_COMPONENTS_EXT;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = android.opengl.GLES31Ext.GL_MAX_TEXTURE_BUFFER_SIZE_EXT;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_OES = android.opengl.GLES31Ext.GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_OES;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_OES = android.opengl.GLES31Ext.GL_MIN_SAMPLE_SHADING_VALUE_OES;
    public static final int GL_MULTIPLY_KHR = android.opengl.GLES31Ext.GL_MULTIPLY_KHR;
    public static final int GL_OVERLAY_KHR = android.opengl.GLES31Ext.GL_OVERLAY_KHR;
    public static final int GL_PATCHES_EXT = android.opengl.GLES31Ext.GL_PATCHES_EXT;
    public static final int GL_PATCH_VERTICES_EXT = android.opengl.GLES31Ext.GL_PATCH_VERTICES_EXT;
    public static final int GL_PRIMITIVES_GENERATED_EXT = android.opengl.GLES31Ext.GL_PRIMITIVES_GENERATED_EXT;
    public static final int GL_PRIMITIVE_BOUNDING_BOX_EXT = android.opengl.GLES31Ext.GL_PRIMITIVE_BOUNDING_BOX_EXT;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = android.opengl.GLES31Ext.GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED;
    public static final int GL_PROGRAM_KHR = android.opengl.GLES31Ext.GL_PROGRAM_KHR;
    public static final int GL_QUADS_EXT = android.opengl.GLES31Ext.GL_QUADS_EXT;
    public static final int GL_QUERY_KHR = android.opengl.GLES31Ext.GL_QUERY_KHR;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER_EXT = android.opengl.GLES31Ext.GL_REFERENCED_BY_GEOMETRY_SHADER_EXT;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER_EXT = android.opengl.GLES31Ext.GL_REFERENCED_BY_TESS_CONTROL_SHADER_EXT;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER_EXT = android.opengl.GLES31Ext.GL_REFERENCED_BY_TESS_EVALUATION_SHADER_EXT;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = android.opengl.GLES31Ext.GL_SAMPLER_2D_MULTISAMPLE_ARRAY_OES;
    public static final int GL_SAMPLER_BUFFER_EXT = android.opengl.GLES31Ext.GL_SAMPLER_BUFFER_EXT;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_SAMPLER_CUBE_MAP_ARRAY_EXT;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_EXT = android.opengl.GLES31Ext.GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW_EXT;
    public static final int GL_SAMPLER_KHR = android.opengl.GLES31Ext.GL_SAMPLER_KHR;
    public static final int GL_SAMPLE_SHADING_OES = android.opengl.GLES31Ext.GL_SAMPLE_SHADING_OES;
    public static final int GL_SCREEN_KHR = android.opengl.GLES31Ext.GL_SCREEN_KHR;
    public static final int GL_SHADER_KHR = android.opengl.GLES31Ext.GL_SHADER_KHR;
    public static final int GL_SKIP_DECODE_EXT = android.opengl.GLES31Ext.GL_SKIP_DECODE_EXT;
    public static final int GL_SOFTLIGHT_KHR = android.opengl.GLES31Ext.GL_SOFTLIGHT_KHR;
    public static final int GL_STACK_OVERFLOW_KHR = android.opengl.GLES31Ext.GL_STACK_OVERFLOW_KHR;
    public static final int GL_STACK_UNDERFLOW_KHR = android.opengl.GLES31Ext.GL_STACK_UNDERFLOW_KHR;
    public static final int GL_STENCIL_INDEX8_OES = android.opengl.GLES31Ext.GL_STENCIL_INDEX8_OES;
    public static final int GL_STENCIL_INDEX_OES = android.opengl.GLES31Ext.GL_STENCIL_INDEX_OES;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES_EXT = android.opengl.GLES31Ext.GL_TESS_CONTROL_OUTPUT_VERTICES_EXT;
    public static final int GL_TESS_CONTROL_SHADER_BIT_EXT = android.opengl.GLES31Ext.GL_TESS_CONTROL_SHADER_BIT_EXT;
    public static final int GL_TESS_CONTROL_SHADER_EXT = android.opengl.GLES31Ext.GL_TESS_CONTROL_SHADER_EXT;
    public static final int GL_TESS_EVALUATION_SHADER_BIT_EXT = android.opengl.GLES31Ext.GL_TESS_EVALUATION_SHADER_BIT_EXT;
    public static final int GL_TESS_EVALUATION_SHADER_EXT = android.opengl.GLES31Ext.GL_TESS_EVALUATION_SHADER_EXT;
    public static final int GL_TESS_GEN_MODE_EXT = android.opengl.GLES31Ext.GL_TESS_GEN_MODE_EXT;
    public static final int GL_TESS_GEN_POINT_MODE_EXT = android.opengl.GLES31Ext.GL_TESS_GEN_POINT_MODE_EXT;
    public static final int GL_TESS_GEN_SPACING_EXT = android.opengl.GLES31Ext.GL_TESS_GEN_SPACING_EXT;
    public static final int GL_TESS_GEN_VERTEX_ORDER_EXT = android.opengl.GLES31Ext.GL_TESS_GEN_VERTEX_ORDER_EXT;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY_OES = android.opengl.GLES31Ext.GL_TEXTURE_2D_MULTISAMPLE_ARRAY_OES;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES = android.opengl.GLES31Ext.GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES;
    public static final int GL_TEXTURE_BINDING_BUFFER_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BINDING_BUFFER_EXT;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BINDING_CUBE_MAP_ARRAY_EXT;
    public static final int GL_TEXTURE_BORDER_COLOR_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BORDER_COLOR_EXT;
    public static final int GL_TEXTURE_BUFFER_BINDING_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BUFFER_BINDING_EXT;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT;
    public static final int GL_TEXTURE_BUFFER_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BUFFER_EXT;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT_EXT;
    public static final int GL_TEXTURE_BUFFER_OFFSET_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BUFFER_OFFSET_EXT;
    public static final int GL_TEXTURE_BUFFER_SIZE_EXT = android.opengl.GLES31Ext.GL_TEXTURE_BUFFER_SIZE_EXT;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_TEXTURE_CUBE_MAP_ARRAY_EXT;
    public static final int GL_TEXTURE_SRGB_DECODE_EXT = android.opengl.GLES31Ext.GL_TEXTURE_SRGB_DECODE_EXT;
    public static final int GL_TRIANGLES_ADJACENCY_EXT = android.opengl.GLES31Ext.GL_TRIANGLES_ADJACENCY_EXT;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = android.opengl.GLES31Ext.GL_TRIANGLE_STRIP_ADJACENCY_EXT;
    public static final int GL_UNDEFINED_VERTEX_EXT = android.opengl.GLES31Ext.GL_UNDEFINED_VERTEX_EXT;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER_EXT = android.opengl.GLES31Ext.GL_UNSIGNED_INT_IMAGE_BUFFER_EXT;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY_EXT;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = android.opengl.GLES31Ext.GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = android.opengl.GLES31Ext.GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_EXT = android.opengl.GLES31Ext.GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_EXT;
    public static final int GL_VERTEX_ARRAY_KHR = android.opengl.GLES31Ext.GL_VERTEX_ARRAY_KHR;

    public static final class DebugProcKHR {
        private final android.opengl.GLES31Ext.DebugProcKHR real;

        public DebugProcKHR(android.opengl.GLES31Ext.DebugProcKHR real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLES31Ext.DebugProcKHR wrap(android.opengl.GLES31Ext.DebugProcKHR real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES31Ext.DebugProcKHR(real);
        }

        public android.opengl.GLES31Ext.DebugProcKHR unwrap() {
            return real;
        }

        public void onMessage(int arg0, int arg1, int arg2, int arg3, java.lang.String arg4) {
            real.onMessage(arg0, arg1, arg2, arg3, arg4);
        }

    }
}
