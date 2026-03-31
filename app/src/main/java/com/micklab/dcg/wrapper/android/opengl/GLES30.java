// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES30 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLES30(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES30 wrap(android.opengl.GLES30 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES30(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLES30 getReal() {
        return (android.opengl.GLES30) real;
    }

    public android.opengl.GLES30 unwrap() {
        return getReal();
    }

    public GLES30() {
        this(new android.opengl.GLES30(), (__DcgwBridgeToken) null);
    }

    public static void glBeginQuery(int arg0, int arg1) {
        android.opengl.GLES30.glBeginQuery(arg0, arg1);
    }

    public static void glBeginTransformFeedback(int arg0) {
        android.opengl.GLES30.glBeginTransformFeedback(arg0);
    }

    public static void glBindBufferBase(int arg0, int arg1, int arg2) {
        android.opengl.GLES30.glBindBufferBase(arg0, arg1, arg2);
    }

    public static void glBindBufferRange(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glBindBufferRange(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glBindSampler(int arg0, int arg1) {
        android.opengl.GLES30.glBindSampler(arg0, arg1);
    }

    public static void glBindTransformFeedback(int arg0, int arg1) {
        android.opengl.GLES30.glBindTransformFeedback(arg0, arg1);
    }

    public static void glBindVertexArray(int arg0) {
        android.opengl.GLES30.glBindVertexArray(arg0);
    }

    public static void glBlitFramebuffer(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        android.opengl.GLES30.glBlitFramebuffer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public static void glClearBufferfi(int arg0, int arg1, float arg2, int arg3) {
        android.opengl.GLES30.glClearBufferfi(arg0, arg1, arg2, arg3);
    }

    public static void glClearBufferfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES30.glClearBufferfv(arg0, arg1, arg2);
    }

    public static void glClearBufferfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES30.glClearBufferfv(arg0, arg1, arg2, arg3);
    }

    public static void glClearBufferiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glClearBufferiv(arg0, arg1, arg2);
    }

    public static void glClearBufferiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glClearBufferiv(arg0, arg1, arg2, arg3);
    }

    public static void glClearBufferuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glClearBufferuiv(arg0, arg1, arg2);
    }

    public static void glClearBufferuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glClearBufferuiv(arg0, arg1, arg2, arg3);
    }

    public static int glClientWaitSync(long arg0, int arg1, long arg2) {
        return android.opengl.GLES30.glClientWaitSync(arg0, arg1, arg2);
    }

    public static void glCompressedTexImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES30.glCompressedTexImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glCompressedTexImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        android.opengl.GLES30.glCompressedTexImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glCompressedTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        android.opengl.GLES30.glCompressedTexSubImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void glCompressedTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, java.nio.Buffer arg10) {
        android.opengl.GLES30.glCompressedTexSubImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void glCopyBufferSubData(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glCopyBufferSubData(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glCopyTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        android.opengl.GLES30.glCopyTexSubImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glDeleteQueries(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glDeleteQueries(arg0, arg1);
    }

    public static void glDeleteQueries(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glDeleteQueries(arg0, arg1, arg2);
    }

    public static void glDeleteSamplers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glDeleteSamplers(arg0, arg1);
    }

    public static void glDeleteSamplers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glDeleteSamplers(arg0, arg1, arg2);
    }

    public static void glDeleteSync(long arg0) {
        android.opengl.GLES30.glDeleteSync(arg0);
    }

    public static void glDeleteTransformFeedbacks(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glDeleteTransformFeedbacks(arg0, arg1);
    }

    public static void glDeleteTransformFeedbacks(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glDeleteTransformFeedbacks(arg0, arg1, arg2);
    }

    public static void glDeleteVertexArrays(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glDeleteVertexArrays(arg0, arg1);
    }

    public static void glDeleteVertexArrays(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glDeleteVertexArrays(arg0, arg1, arg2);
    }

    public static void glDrawArraysInstanced(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES30.glDrawArraysInstanced(arg0, arg1, arg2, arg3);
    }

    public static void glDrawBuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glDrawBuffers(arg0, arg1);
    }

    public static void glDrawBuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glDrawBuffers(arg0, arg1, arg2);
    }

    public static void glDrawElementsInstanced(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glDrawElementsInstanced(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDrawElementsInstanced(int arg0, int arg1, int arg2, java.nio.Buffer arg3, int arg4) {
        android.opengl.GLES30.glDrawElementsInstanced(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glDrawRangeElements(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES30.glDrawRangeElements(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glDrawRangeElements(int arg0, int arg1, int arg2, int arg3, int arg4, java.nio.Buffer arg5) {
        android.opengl.GLES30.glDrawRangeElements(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glEndQuery(int arg0) {
        android.opengl.GLES30.glEndQuery(arg0);
    }

    public static void glEndTransformFeedback() {
        android.opengl.GLES30.glEndTransformFeedback();
    }

    public static long glFenceSync(int arg0, int arg1) {
        return android.opengl.GLES30.glFenceSync(arg0, arg1);
    }

    public static void glFlushMappedBufferRange(int arg0, int arg1, int arg2) {
        android.opengl.GLES30.glFlushMappedBufferRange(arg0, arg1, arg2);
    }

    public static void glFramebufferTextureLayer(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glFramebufferTextureLayer(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGenQueries(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glGenQueries(arg0, arg1);
    }

    public static void glGenQueries(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glGenQueries(arg0, arg1, arg2);
    }

    public static void glGenSamplers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glGenSamplers(arg0, arg1);
    }

    public static void glGenSamplers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glGenSamplers(arg0, arg1, arg2);
    }

    public static void glGenTransformFeedbacks(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glGenTransformFeedbacks(arg0, arg1);
    }

    public static void glGenTransformFeedbacks(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glGenTransformFeedbacks(arg0, arg1, arg2);
    }

    public static void glGenVertexArrays(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glGenVertexArrays(arg0, arg1);
    }

    public static void glGenVertexArrays(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glGenVertexArrays(arg0, arg1, arg2);
    }

    public static java.lang.String glGetActiveUniformBlockName(int arg0, int arg1) {
        return android.opengl.GLES30.glGetActiveUniformBlockName(arg0, arg1);
    }

    public static void glGetActiveUniformBlockName(int arg0, int arg1, java.nio.Buffer arg2, java.nio.Buffer arg3) {
        android.opengl.GLES30.glGetActiveUniformBlockName(arg0, arg1, arg2, arg3);
    }

    public static void glGetActiveUniformBlockName(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte[] arg5, int arg6) {
        android.opengl.GLES30.glGetActiveUniformBlockName(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glGetActiveUniformBlockiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES30.glGetActiveUniformBlockiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetActiveUniformBlockiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES30.glGetActiveUniformBlockiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetActiveUniformsiv(int arg0, int arg1, java.nio.IntBuffer arg2, int arg3, java.nio.IntBuffer arg4) {
        android.opengl.GLES30.glGetActiveUniformsiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetActiveUniformsiv(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6) {
        android.opengl.GLES30.glGetActiveUniformsiv(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glGetBufferParameteri64v(int arg0, int arg1, java.nio.LongBuffer arg2) {
        android.opengl.GLES30.glGetBufferParameteri64v(arg0, arg1, arg2);
    }

    public static void glGetBufferParameteri64v(int arg0, int arg1, long[] arg2, int arg3) {
        android.opengl.GLES30.glGetBufferParameteri64v(arg0, arg1, arg2, arg3);
    }

    public static java.nio.Buffer glGetBufferPointerv(int arg0, int arg1) {
        return android.opengl.GLES30.glGetBufferPointerv(arg0, arg1);
    }

    public static int glGetFragDataLocation(int arg0, java.lang.String arg1) {
        return android.opengl.GLES30.glGetFragDataLocation(arg0, arg1);
    }

    public static void glGetInteger64i_v(int arg0, int arg1, java.nio.LongBuffer arg2) {
        android.opengl.GLES30.glGetInteger64i_v(arg0, arg1, arg2);
    }

    public static void glGetInteger64i_v(int arg0, int arg1, long[] arg2, int arg3) {
        android.opengl.GLES30.glGetInteger64i_v(arg0, arg1, arg2, arg3);
    }

    public static void glGetInteger64v(int arg0, java.nio.LongBuffer arg1) {
        android.opengl.GLES30.glGetInteger64v(arg0, arg1);
    }

    public static void glGetInteger64v(int arg0, long[] arg1, int arg2) {
        android.opengl.GLES30.glGetInteger64v(arg0, arg1, arg2);
    }

    public static void glGetIntegeri_v(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetIntegeri_v(arg0, arg1, arg2);
    }

    public static void glGetIntegeri_v(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetIntegeri_v(arg0, arg1, arg2, arg3);
    }

    public static void glGetInternalformativ(int arg0, int arg1, int arg2, int arg3, java.nio.IntBuffer arg4) {
        android.opengl.GLES30.glGetInternalformativ(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetInternalformativ(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        android.opengl.GLES30.glGetInternalformativ(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glGetProgramBinary(int arg0, int arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3, java.nio.Buffer arg4) {
        android.opengl.GLES30.glGetProgramBinary(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetProgramBinary(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, java.nio.Buffer arg6) {
        android.opengl.GLES30.glGetProgramBinary(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glGetQueryObjectuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetQueryObjectuiv(arg0, arg1, arg2);
    }

    public static void glGetQueryObjectuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetQueryObjectuiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetQueryiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetQueryiv(arg0, arg1, arg2);
    }

    public static void glGetQueryiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetQueryiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetSamplerParameterfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES30.glGetSamplerParameterfv(arg0, arg1, arg2);
    }

    public static void glGetSamplerParameterfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES30.glGetSamplerParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetSamplerParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetSamplerParameteriv(arg0, arg1, arg2);
    }

    public static void glGetSamplerParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetSamplerParameteriv(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String glGetStringi(int arg0, int arg1) {
        return android.opengl.GLES30.glGetStringi(arg0, arg1);
    }

    public static void glGetSynciv(long arg0, int arg1, int arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4) {
        android.opengl.GLES30.glGetSynciv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetSynciv(long arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        android.opengl.GLES30.glGetSynciv(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static java.lang.String glGetTransformFeedbackVarying(int arg0, int arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        return android.opengl.GLES30.glGetTransformFeedbackVarying(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String glGetTransformFeedbackVarying(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        return android.opengl.GLES30.glGetTransformFeedbackVarying(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glGetTransformFeedbackVarying(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5, byte arg6) {
        android.opengl.GLES30.glGetTransformFeedbackVarying(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glGetTransformFeedbackVarying(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3, java.nio.IntBuffer arg4, java.nio.IntBuffer arg5, java.nio.ByteBuffer arg6) {
        android.opengl.GLES30.glGetTransformFeedbackVarying(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glGetTransformFeedbackVarying(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
        android.opengl.GLES30.glGetTransformFeedbackVarying(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static int glGetUniformBlockIndex(int arg0, java.lang.String arg1) {
        return android.opengl.GLES30.glGetUniformBlockIndex(arg0, arg1);
    }

    public static void glGetUniformIndices(int arg0, java.lang.String[] arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetUniformIndices(arg0, arg1, arg2);
    }

    public static void glGetUniformIndices(int arg0, java.lang.String[] arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetUniformIndices(arg0, arg1, arg2, arg3);
    }

    public static void glGetUniformuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetUniformuiv(arg0, arg1, arg2);
    }

    public static void glGetUniformuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetUniformuiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetVertexAttribIiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetVertexAttribIiv(arg0, arg1, arg2);
    }

    public static void glGetVertexAttribIiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetVertexAttribIiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetVertexAttribIuiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glGetVertexAttribIuiv(arg0, arg1, arg2);
    }

    public static void glGetVertexAttribIuiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glGetVertexAttribIuiv(arg0, arg1, arg2, arg3);
    }

    public static void glInvalidateFramebuffer(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glInvalidateFramebuffer(arg0, arg1, arg2);
    }

    public static void glInvalidateFramebuffer(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glInvalidateFramebuffer(arg0, arg1, arg2, arg3);
    }

    public static void glInvalidateSubFramebuffer(int arg0, int arg1, java.nio.IntBuffer arg2, int arg3, int arg4, int arg5, int arg6) {
        android.opengl.GLES30.glInvalidateSubFramebuffer(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glInvalidateSubFramebuffer(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        android.opengl.GLES30.glInvalidateSubFramebuffer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static boolean glIsQuery(int arg0) {
        return android.opengl.GLES30.glIsQuery(arg0);
    }

    public static boolean glIsSampler(int arg0) {
        return android.opengl.GLES30.glIsSampler(arg0);
    }

    public static boolean glIsSync(long arg0) {
        return android.opengl.GLES30.glIsSync(arg0);
    }

    public static boolean glIsTransformFeedback(int arg0) {
        return android.opengl.GLES30.glIsTransformFeedback(arg0);
    }

    public static boolean glIsVertexArray(int arg0) {
        return android.opengl.GLES30.glIsVertexArray(arg0);
    }

    public static java.nio.Buffer glMapBufferRange(int arg0, int arg1, int arg2, int arg3) {
        return android.opengl.GLES30.glMapBufferRange(arg0, arg1, arg2, arg3);
    }

    public static void glPauseTransformFeedback() {
        android.opengl.GLES30.glPauseTransformFeedback();
    }

    public static void glProgramBinary(int arg0, int arg1, java.nio.Buffer arg2, int arg3) {
        android.opengl.GLES30.glProgramBinary(arg0, arg1, arg2, arg3);
    }

    public static void glProgramParameteri(int arg0, int arg1, int arg2) {
        android.opengl.GLES30.glProgramParameteri(arg0, arg1, arg2);
    }

    public static void glReadBuffer(int arg0) {
        android.opengl.GLES30.glReadBuffer(arg0);
    }

    public static void glReadPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        android.opengl.GLES30.glReadPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glRenderbufferStorageMultisample(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glRenderbufferStorageMultisample(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glResumeTransformFeedback() {
        android.opengl.GLES30.glResumeTransformFeedback();
    }

    public static void glSamplerParameterf(int arg0, int arg1, float arg2) {
        android.opengl.GLES30.glSamplerParameterf(arg0, arg1, arg2);
    }

    public static void glSamplerParameterfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES30.glSamplerParameterfv(arg0, arg1, arg2);
    }

    public static void glSamplerParameterfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES30.glSamplerParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glSamplerParameteri(int arg0, int arg1, int arg2) {
        android.opengl.GLES30.glSamplerParameteri(arg0, arg1, arg2);
    }

    public static void glSamplerParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glSamplerParameteriv(arg0, arg1, arg2);
    }

    public static void glSamplerParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glSamplerParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glTexImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, java.nio.Buffer arg9) {
        android.opengl.GLES30.glTexImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public static void glTexImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        android.opengl.GLES30.glTexImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public static void glTexStorage2D(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glTexStorage2D(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glTexStorage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES30.glTexStorage3D(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        android.opengl.GLES30.glTexSubImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void glTexSubImage3D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, java.nio.Buffer arg10) {
        android.opengl.GLES30.glTexSubImage3D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void glTransformFeedbackVaryings(int arg0, java.lang.String[] arg1, int arg2) {
        android.opengl.GLES30.glTransformFeedbackVaryings(arg0, arg1, arg2);
    }

    public static void glUniform1ui(int arg0, int arg1) {
        android.opengl.GLES30.glUniform1ui(arg0, arg1);
    }

    public static void glUniform1uiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glUniform1uiv(arg0, arg1, arg2);
    }

    public static void glUniform1uiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glUniform1uiv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform2ui(int arg0, int arg1, int arg2) {
        android.opengl.GLES30.glUniform2ui(arg0, arg1, arg2);
    }

    public static void glUniform2uiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glUniform2uiv(arg0, arg1, arg2);
    }

    public static void glUniform2uiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glUniform2uiv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform3ui(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES30.glUniform3ui(arg0, arg1, arg2, arg3);
    }

    public static void glUniform3uiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glUniform3uiv(arg0, arg1, arg2);
    }

    public static void glUniform3uiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glUniform3uiv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform4ui(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glUniform4ui(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniform4uiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES30.glUniform4uiv(arg0, arg1, arg2);
    }

    public static void glUniform4uiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES30.glUniform4uiv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformBlockBinding(int arg0, int arg1, int arg2) {
        android.opengl.GLES30.glUniformBlockBinding(arg0, arg1, arg2);
    }

    public static void glUniformMatrix2x3fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES30.glUniformMatrix2x3fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix2x3fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES30.glUniformMatrix2x3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix2x4fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES30.glUniformMatrix2x4fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix2x4fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES30.glUniformMatrix2x4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix3x2fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES30.glUniformMatrix3x2fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix3x2fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES30.glUniformMatrix3x2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix3x4fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES30.glUniformMatrix3x4fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix3x4fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES30.glUniformMatrix3x4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix4x2fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES30.glUniformMatrix4x2fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix4x2fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES30.glUniformMatrix4x2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix4x3fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES30.glUniformMatrix4x3fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix4x3fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES30.glUniformMatrix4x3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean glUnmapBuffer(int arg0) {
        return android.opengl.GLES30.glUnmapBuffer(arg0);
    }

    public static void glVertexAttribDivisor(int arg0, int arg1) {
        android.opengl.GLES30.glVertexAttribDivisor(arg0, arg1);
    }

    public static void glVertexAttribI4i(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glVertexAttribI4i(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glVertexAttribI4iv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glVertexAttribI4iv(arg0, arg1);
    }

    public static void glVertexAttribI4iv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glVertexAttribI4iv(arg0, arg1, arg2);
    }

    public static void glVertexAttribI4ui(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glVertexAttribI4ui(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glVertexAttribI4uiv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES30.glVertexAttribI4uiv(arg0, arg1);
    }

    public static void glVertexAttribI4uiv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES30.glVertexAttribI4uiv(arg0, arg1, arg2);
    }

    public static void glVertexAttribIPointer(int arg0, int arg1, int arg2, int arg3, java.nio.Buffer arg4) {
        android.opengl.GLES30.glVertexAttribIPointer(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glVertexAttribIPointer(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES30.glVertexAttribIPointer(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glWaitSync(long arg0, int arg1, long arg2) {
        android.opengl.GLES30.glWaitSync(arg0, arg1, arg2);
    }

    public static final int GL_ACTIVE_UNIFORM_BLOCKS = android.opengl.GLES30.GL_ACTIVE_UNIFORM_BLOCKS;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = android.opengl.GLES30.GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH;
    public static final int GL_ALREADY_SIGNALED = android.opengl.GLES30.GL_ALREADY_SIGNALED;
    public static final int GL_ANY_SAMPLES_PASSED = android.opengl.GLES30.GL_ANY_SAMPLES_PASSED;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = android.opengl.GLES30.GL_ANY_SAMPLES_PASSED_CONSERVATIVE;
    public static final int GL_BLUE = android.opengl.GLES30.GL_BLUE;
    public static final int GL_BUFFER_ACCESS_FLAGS = android.opengl.GLES30.GL_BUFFER_ACCESS_FLAGS;
    public static final int GL_BUFFER_MAPPED = android.opengl.GLES30.GL_BUFFER_MAPPED;
    public static final int GL_BUFFER_MAP_LENGTH = android.opengl.GLES30.GL_BUFFER_MAP_LENGTH;
    public static final int GL_BUFFER_MAP_OFFSET = android.opengl.GLES30.GL_BUFFER_MAP_OFFSET;
    public static final int GL_BUFFER_MAP_POINTER = android.opengl.GLES30.GL_BUFFER_MAP_POINTER;
    public static final int GL_COLOR = android.opengl.GLES30.GL_COLOR;
    public static final int GL_COLOR_ATTACHMENT1 = android.opengl.GLES30.GL_COLOR_ATTACHMENT1;
    public static final int GL_COLOR_ATTACHMENT10 = android.opengl.GLES30.GL_COLOR_ATTACHMENT10;
    public static final int GL_COLOR_ATTACHMENT11 = android.opengl.GLES30.GL_COLOR_ATTACHMENT11;
    public static final int GL_COLOR_ATTACHMENT12 = android.opengl.GLES30.GL_COLOR_ATTACHMENT12;
    public static final int GL_COLOR_ATTACHMENT13 = android.opengl.GLES30.GL_COLOR_ATTACHMENT13;
    public static final int GL_COLOR_ATTACHMENT14 = android.opengl.GLES30.GL_COLOR_ATTACHMENT14;
    public static final int GL_COLOR_ATTACHMENT15 = android.opengl.GLES30.GL_COLOR_ATTACHMENT15;
    public static final int GL_COLOR_ATTACHMENT2 = android.opengl.GLES30.GL_COLOR_ATTACHMENT2;
    public static final int GL_COLOR_ATTACHMENT3 = android.opengl.GLES30.GL_COLOR_ATTACHMENT3;
    public static final int GL_COLOR_ATTACHMENT4 = android.opengl.GLES30.GL_COLOR_ATTACHMENT4;
    public static final int GL_COLOR_ATTACHMENT5 = android.opengl.GLES30.GL_COLOR_ATTACHMENT5;
    public static final int GL_COLOR_ATTACHMENT6 = android.opengl.GLES30.GL_COLOR_ATTACHMENT6;
    public static final int GL_COLOR_ATTACHMENT7 = android.opengl.GLES30.GL_COLOR_ATTACHMENT7;
    public static final int GL_COLOR_ATTACHMENT8 = android.opengl.GLES30.GL_COLOR_ATTACHMENT8;
    public static final int GL_COLOR_ATTACHMENT9 = android.opengl.GLES30.GL_COLOR_ATTACHMENT9;
    public static final int GL_COMPARE_REF_TO_TEXTURE = android.opengl.GLES30.GL_COMPARE_REF_TO_TEXTURE;
    public static final int GL_COMPRESSED_R11_EAC = android.opengl.GLES30.GL_COMPRESSED_R11_EAC;
    public static final int GL_COMPRESSED_RG11_EAC = android.opengl.GLES30.GL_COMPRESSED_RG11_EAC;
    public static final int GL_COMPRESSED_RGB8_ETC2 = android.opengl.GLES30.GL_COMPRESSED_RGB8_ETC2;
    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = android.opengl.GLES30.GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2;
    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = android.opengl.GLES30.GL_COMPRESSED_RGBA8_ETC2_EAC;
    public static final int GL_COMPRESSED_SIGNED_R11_EAC = android.opengl.GLES30.GL_COMPRESSED_SIGNED_R11_EAC;
    public static final int GL_COMPRESSED_SIGNED_RG11_EAC = android.opengl.GLES30.GL_COMPRESSED_SIGNED_RG11_EAC;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = android.opengl.GLES30.GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC;
    public static final int GL_COMPRESSED_SRGB8_ETC2 = android.opengl.GLES30.GL_COMPRESSED_SRGB8_ETC2;
    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = android.opengl.GLES30.GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2;
    public static final int GL_CONDITION_SATISFIED = android.opengl.GLES30.GL_CONDITION_SATISFIED;
    public static final int GL_COPY_READ_BUFFER = android.opengl.GLES30.GL_COPY_READ_BUFFER;
    public static final int GL_COPY_READ_BUFFER_BINDING = android.opengl.GLES30.GL_COPY_READ_BUFFER_BINDING;
    public static final int GL_COPY_WRITE_BUFFER = android.opengl.GLES30.GL_COPY_WRITE_BUFFER;
    public static final int GL_COPY_WRITE_BUFFER_BINDING = android.opengl.GLES30.GL_COPY_WRITE_BUFFER_BINDING;
    public static final int GL_CURRENT_QUERY = android.opengl.GLES30.GL_CURRENT_QUERY;
    public static final int GL_DEPTH = android.opengl.GLES30.GL_DEPTH;
    public static final int GL_DEPTH24_STENCIL8 = android.opengl.GLES30.GL_DEPTH24_STENCIL8;
    public static final int GL_DEPTH32F_STENCIL8 = android.opengl.GLES30.GL_DEPTH32F_STENCIL8;
    public static final int GL_DEPTH_COMPONENT24 = android.opengl.GLES30.GL_DEPTH_COMPONENT24;
    public static final int GL_DEPTH_COMPONENT32F = android.opengl.GLES30.GL_DEPTH_COMPONENT32F;
    public static final int GL_DEPTH_STENCIL = android.opengl.GLES30.GL_DEPTH_STENCIL;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = android.opengl.GLES30.GL_DEPTH_STENCIL_ATTACHMENT;
    public static final int GL_DRAW_BUFFER0 = android.opengl.GLES30.GL_DRAW_BUFFER0;
    public static final int GL_DRAW_BUFFER1 = android.opengl.GLES30.GL_DRAW_BUFFER1;
    public static final int GL_DRAW_BUFFER10 = android.opengl.GLES30.GL_DRAW_BUFFER10;
    public static final int GL_DRAW_BUFFER11 = android.opengl.GLES30.GL_DRAW_BUFFER11;
    public static final int GL_DRAW_BUFFER12 = android.opengl.GLES30.GL_DRAW_BUFFER12;
    public static final int GL_DRAW_BUFFER13 = android.opengl.GLES30.GL_DRAW_BUFFER13;
    public static final int GL_DRAW_BUFFER14 = android.opengl.GLES30.GL_DRAW_BUFFER14;
    public static final int GL_DRAW_BUFFER15 = android.opengl.GLES30.GL_DRAW_BUFFER15;
    public static final int GL_DRAW_BUFFER2 = android.opengl.GLES30.GL_DRAW_BUFFER2;
    public static final int GL_DRAW_BUFFER3 = android.opengl.GLES30.GL_DRAW_BUFFER3;
    public static final int GL_DRAW_BUFFER4 = android.opengl.GLES30.GL_DRAW_BUFFER4;
    public static final int GL_DRAW_BUFFER5 = android.opengl.GLES30.GL_DRAW_BUFFER5;
    public static final int GL_DRAW_BUFFER6 = android.opengl.GLES30.GL_DRAW_BUFFER6;
    public static final int GL_DRAW_BUFFER7 = android.opengl.GLES30.GL_DRAW_BUFFER7;
    public static final int GL_DRAW_BUFFER8 = android.opengl.GLES30.GL_DRAW_BUFFER8;
    public static final int GL_DRAW_BUFFER9 = android.opengl.GLES30.GL_DRAW_BUFFER9;
    public static final int GL_DRAW_FRAMEBUFFER = android.opengl.GLES30.GL_DRAW_FRAMEBUFFER;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = android.opengl.GLES30.GL_DRAW_FRAMEBUFFER_BINDING;
    public static final int GL_DYNAMIC_COPY = android.opengl.GLES30.GL_DYNAMIC_COPY;
    public static final int GL_DYNAMIC_READ = android.opengl.GLES30.GL_DYNAMIC_READ;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = android.opengl.GLES30.GL_FLOAT_32_UNSIGNED_INT_24_8_REV;
    public static final int GL_FLOAT_MAT2x3 = android.opengl.GLES30.GL_FLOAT_MAT2x3;
    public static final int GL_FLOAT_MAT2x4 = android.opengl.GLES30.GL_FLOAT_MAT2x4;
    public static final int GL_FLOAT_MAT3x2 = android.opengl.GLES30.GL_FLOAT_MAT3x2;
    public static final int GL_FLOAT_MAT3x4 = android.opengl.GLES30.GL_FLOAT_MAT3x4;
    public static final int GL_FLOAT_MAT4x2 = android.opengl.GLES30.GL_FLOAT_MAT4x2;
    public static final int GL_FLOAT_MAT4x3 = android.opengl.GLES30.GL_FLOAT_MAT4x3;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = android.opengl.GLES30.GL_FRAGMENT_SHADER_DERIVATIVE_HINT;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = android.opengl.GLES30.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER;
    public static final int GL_FRAMEBUFFER_DEFAULT = android.opengl.GLES30.GL_FRAMEBUFFER_DEFAULT;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = android.opengl.GLES30.GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE;
    public static final int GL_FRAMEBUFFER_UNDEFINED = android.opengl.GLES30.GL_FRAMEBUFFER_UNDEFINED;
    public static final int GL_GREEN = android.opengl.GLES30.GL_GREEN;
    public static final int GL_HALF_FLOAT = android.opengl.GLES30.GL_HALF_FLOAT;
    public static final int GL_INTERLEAVED_ATTRIBS = android.opengl.GLES30.GL_INTERLEAVED_ATTRIBS;
    public static final int GL_INT_2_10_10_10_REV = android.opengl.GLES30.GL_INT_2_10_10_10_REV;
    public static final int GL_INT_SAMPLER_2D = android.opengl.GLES30.GL_INT_SAMPLER_2D;
    public static final int GL_INT_SAMPLER_2D_ARRAY = android.opengl.GLES30.GL_INT_SAMPLER_2D_ARRAY;
    public static final int GL_INT_SAMPLER_3D = android.opengl.GLES30.GL_INT_SAMPLER_3D;
    public static final int GL_INT_SAMPLER_CUBE = android.opengl.GLES30.GL_INT_SAMPLER_CUBE;
    public static final int GL_INVALID_INDEX = android.opengl.GLES30.GL_INVALID_INDEX;
    public static final int GL_MAJOR_VERSION = android.opengl.GLES30.GL_MAJOR_VERSION;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = android.opengl.GLES30.GL_MAP_FLUSH_EXPLICIT_BIT;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = android.opengl.GLES30.GL_MAP_INVALIDATE_BUFFER_BIT;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = android.opengl.GLES30.GL_MAP_INVALIDATE_RANGE_BIT;
    public static final int GL_MAP_READ_BIT = android.opengl.GLES30.GL_MAP_READ_BIT;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = android.opengl.GLES30.GL_MAP_UNSYNCHRONIZED_BIT;
    public static final int GL_MAP_WRITE_BIT = android.opengl.GLES30.GL_MAP_WRITE_BIT;
    public static final int GL_MAX = android.opengl.GLES30.GL_MAX;
    public static final int GL_MAX_3D_TEXTURE_SIZE = android.opengl.GLES30.GL_MAX_3D_TEXTURE_SIZE;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = android.opengl.GLES30.GL_MAX_ARRAY_TEXTURE_LAYERS;
    public static final int GL_MAX_COLOR_ATTACHMENTS = android.opengl.GLES30.GL_MAX_COLOR_ATTACHMENTS;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = android.opengl.GLES30.GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = android.opengl.GLES30.GL_MAX_COMBINED_UNIFORM_BLOCKS;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = android.opengl.GLES30.GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS;
    public static final int GL_MAX_DRAW_BUFFERS = android.opengl.GLES30.GL_MAX_DRAW_BUFFERS;
    public static final int GL_MAX_ELEMENTS_INDICES = android.opengl.GLES30.GL_MAX_ELEMENTS_INDICES;
    public static final int GL_MAX_ELEMENTS_VERTICES = android.opengl.GLES30.GL_MAX_ELEMENTS_VERTICES;
    public static final int GL_MAX_ELEMENT_INDEX = android.opengl.GLES30.GL_MAX_ELEMENT_INDEX;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = android.opengl.GLES30.GL_MAX_FRAGMENT_INPUT_COMPONENTS;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = android.opengl.GLES30.GL_MAX_FRAGMENT_UNIFORM_BLOCKS;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = android.opengl.GLES30.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = android.opengl.GLES30.GL_MAX_PROGRAM_TEXEL_OFFSET;
    public static final int GL_MAX_SAMPLES = android.opengl.GLES30.GL_MAX_SAMPLES;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = android.opengl.GLES30.GL_MAX_SERVER_WAIT_TIMEOUT;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = android.opengl.GLES30.GL_MAX_TEXTURE_LOD_BIAS;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = android.opengl.GLES30.GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = android.opengl.GLES30.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = android.opengl.GLES30.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = android.opengl.GLES30.GL_MAX_UNIFORM_BLOCK_SIZE;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = android.opengl.GLES30.GL_MAX_UNIFORM_BUFFER_BINDINGS;
    public static final int GL_MAX_VARYING_COMPONENTS = android.opengl.GLES30.GL_MAX_VARYING_COMPONENTS;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = android.opengl.GLES30.GL_MAX_VERTEX_OUTPUT_COMPONENTS;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = android.opengl.GLES30.GL_MAX_VERTEX_UNIFORM_BLOCKS;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = android.opengl.GLES30.GL_MAX_VERTEX_UNIFORM_COMPONENTS;
    public static final int GL_MIN = android.opengl.GLES30.GL_MIN;
    public static final int GL_MINOR_VERSION = android.opengl.GLES30.GL_MINOR_VERSION;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = android.opengl.GLES30.GL_MIN_PROGRAM_TEXEL_OFFSET;
    public static final int GL_NUM_EXTENSIONS = android.opengl.GLES30.GL_NUM_EXTENSIONS;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = android.opengl.GLES30.GL_NUM_PROGRAM_BINARY_FORMATS;
    public static final int GL_NUM_SAMPLE_COUNTS = android.opengl.GLES30.GL_NUM_SAMPLE_COUNTS;
    public static final int GL_OBJECT_TYPE = android.opengl.GLES30.GL_OBJECT_TYPE;
    public static final int GL_PACK_ROW_LENGTH = android.opengl.GLES30.GL_PACK_ROW_LENGTH;
    public static final int GL_PACK_SKIP_PIXELS = android.opengl.GLES30.GL_PACK_SKIP_PIXELS;
    public static final int GL_PACK_SKIP_ROWS = android.opengl.GLES30.GL_PACK_SKIP_ROWS;
    public static final int GL_PIXEL_PACK_BUFFER = android.opengl.GLES30.GL_PIXEL_PACK_BUFFER;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = android.opengl.GLES30.GL_PIXEL_PACK_BUFFER_BINDING;
    public static final int GL_PIXEL_UNPACK_BUFFER = android.opengl.GLES30.GL_PIXEL_UNPACK_BUFFER;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = android.opengl.GLES30.GL_PIXEL_UNPACK_BUFFER_BINDING;
    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = android.opengl.GLES30.GL_PRIMITIVE_RESTART_FIXED_INDEX;
    public static final int GL_PROGRAM_BINARY_FORMATS = android.opengl.GLES30.GL_PROGRAM_BINARY_FORMATS;
    public static final int GL_PROGRAM_BINARY_LENGTH = android.opengl.GLES30.GL_PROGRAM_BINARY_LENGTH;
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = android.opengl.GLES30.GL_PROGRAM_BINARY_RETRIEVABLE_HINT;
    public static final int GL_QUERY_RESULT = android.opengl.GLES30.GL_QUERY_RESULT;
    public static final int GL_QUERY_RESULT_AVAILABLE = android.opengl.GLES30.GL_QUERY_RESULT_AVAILABLE;
    public static final int GL_R11F_G11F_B10F = android.opengl.GLES30.GL_R11F_G11F_B10F;
    public static final int GL_R16F = android.opengl.GLES30.GL_R16F;
    public static final int GL_R16I = android.opengl.GLES30.GL_R16I;
    public static final int GL_R16UI = android.opengl.GLES30.GL_R16UI;
    public static final int GL_R32F = android.opengl.GLES30.GL_R32F;
    public static final int GL_R32I = android.opengl.GLES30.GL_R32I;
    public static final int GL_R32UI = android.opengl.GLES30.GL_R32UI;
    public static final int GL_R8 = android.opengl.GLES30.GL_R8;
    public static final int GL_R8I = android.opengl.GLES30.GL_R8I;
    public static final int GL_R8UI = android.opengl.GLES30.GL_R8UI;
    public static final int GL_R8_SNORM = android.opengl.GLES30.GL_R8_SNORM;
    public static final int GL_RASTERIZER_DISCARD = android.opengl.GLES30.GL_RASTERIZER_DISCARD;
    public static final int GL_READ_BUFFER = android.opengl.GLES30.GL_READ_BUFFER;
    public static final int GL_READ_FRAMEBUFFER = android.opengl.GLES30.GL_READ_FRAMEBUFFER;
    public static final int GL_READ_FRAMEBUFFER_BINDING = android.opengl.GLES30.GL_READ_FRAMEBUFFER_BINDING;
    public static final int GL_RED = android.opengl.GLES30.GL_RED;
    public static final int GL_RED_INTEGER = android.opengl.GLES30.GL_RED_INTEGER;
    public static final int GL_RENDERBUFFER_SAMPLES = android.opengl.GLES30.GL_RENDERBUFFER_SAMPLES;
    public static final int GL_RG = android.opengl.GLES30.GL_RG;
    public static final int GL_RG16F = android.opengl.GLES30.GL_RG16F;
    public static final int GL_RG16I = android.opengl.GLES30.GL_RG16I;
    public static final int GL_RG16UI = android.opengl.GLES30.GL_RG16UI;
    public static final int GL_RG32F = android.opengl.GLES30.GL_RG32F;
    public static final int GL_RG32I = android.opengl.GLES30.GL_RG32I;
    public static final int GL_RG32UI = android.opengl.GLES30.GL_RG32UI;
    public static final int GL_RG8 = android.opengl.GLES30.GL_RG8;
    public static final int GL_RG8I = android.opengl.GLES30.GL_RG8I;
    public static final int GL_RG8UI = android.opengl.GLES30.GL_RG8UI;
    public static final int GL_RG8_SNORM = android.opengl.GLES30.GL_RG8_SNORM;
    public static final int GL_RGB10_A2 = android.opengl.GLES30.GL_RGB10_A2;
    public static final int GL_RGB10_A2UI = android.opengl.GLES30.GL_RGB10_A2UI;
    public static final int GL_RGB16F = android.opengl.GLES30.GL_RGB16F;
    public static final int GL_RGB16I = android.opengl.GLES30.GL_RGB16I;
    public static final int GL_RGB16UI = android.opengl.GLES30.GL_RGB16UI;
    public static final int GL_RGB32F = android.opengl.GLES30.GL_RGB32F;
    public static final int GL_RGB32I = android.opengl.GLES30.GL_RGB32I;
    public static final int GL_RGB32UI = android.opengl.GLES30.GL_RGB32UI;
    public static final int GL_RGB8 = android.opengl.GLES30.GL_RGB8;
    public static final int GL_RGB8I = android.opengl.GLES30.GL_RGB8I;
    public static final int GL_RGB8UI = android.opengl.GLES30.GL_RGB8UI;
    public static final int GL_RGB8_SNORM = android.opengl.GLES30.GL_RGB8_SNORM;
    public static final int GL_RGB9_E5 = android.opengl.GLES30.GL_RGB9_E5;
    public static final int GL_RGBA16F = android.opengl.GLES30.GL_RGBA16F;
    public static final int GL_RGBA16I = android.opengl.GLES30.GL_RGBA16I;
    public static final int GL_RGBA16UI = android.opengl.GLES30.GL_RGBA16UI;
    public static final int GL_RGBA32F = android.opengl.GLES30.GL_RGBA32F;
    public static final int GL_RGBA32I = android.opengl.GLES30.GL_RGBA32I;
    public static final int GL_RGBA32UI = android.opengl.GLES30.GL_RGBA32UI;
    public static final int GL_RGBA8 = android.opengl.GLES30.GL_RGBA8;
    public static final int GL_RGBA8I = android.opengl.GLES30.GL_RGBA8I;
    public static final int GL_RGBA8UI = android.opengl.GLES30.GL_RGBA8UI;
    public static final int GL_RGBA8_SNORM = android.opengl.GLES30.GL_RGBA8_SNORM;
    public static final int GL_RGBA_INTEGER = android.opengl.GLES30.GL_RGBA_INTEGER;
    public static final int GL_RGB_INTEGER = android.opengl.GLES30.GL_RGB_INTEGER;
    public static final int GL_RG_INTEGER = android.opengl.GLES30.GL_RG_INTEGER;
    public static final int GL_SAMPLER_2D_ARRAY = android.opengl.GLES30.GL_SAMPLER_2D_ARRAY;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = android.opengl.GLES30.GL_SAMPLER_2D_ARRAY_SHADOW;
    public static final int GL_SAMPLER_2D_SHADOW = android.opengl.GLES30.GL_SAMPLER_2D_SHADOW;
    public static final int GL_SAMPLER_3D = android.opengl.GLES30.GL_SAMPLER_3D;
    public static final int GL_SAMPLER_BINDING = android.opengl.GLES30.GL_SAMPLER_BINDING;
    public static final int GL_SAMPLER_CUBE_SHADOW = android.opengl.GLES30.GL_SAMPLER_CUBE_SHADOW;
    public static final int GL_SEPARATE_ATTRIBS = android.opengl.GLES30.GL_SEPARATE_ATTRIBS;
    public static final int GL_SIGNALED = android.opengl.GLES30.GL_SIGNALED;
    public static final int GL_SIGNED_NORMALIZED = android.opengl.GLES30.GL_SIGNED_NORMALIZED;
    public static final int GL_SRGB = android.opengl.GLES30.GL_SRGB;
    public static final int GL_SRGB8 = android.opengl.GLES30.GL_SRGB8;
    public static final int GL_SRGB8_ALPHA8 = android.opengl.GLES30.GL_SRGB8_ALPHA8;
    public static final int GL_STATIC_COPY = android.opengl.GLES30.GL_STATIC_COPY;
    public static final int GL_STATIC_READ = android.opengl.GLES30.GL_STATIC_READ;
    public static final int GL_STENCIL = android.opengl.GLES30.GL_STENCIL;
    public static final int GL_STREAM_COPY = android.opengl.GLES30.GL_STREAM_COPY;
    public static final int GL_STREAM_READ = android.opengl.GLES30.GL_STREAM_READ;
    public static final int GL_SYNC_CONDITION = android.opengl.GLES30.GL_SYNC_CONDITION;
    public static final int GL_SYNC_FENCE = android.opengl.GLES30.GL_SYNC_FENCE;
    public static final int GL_SYNC_FLAGS = android.opengl.GLES30.GL_SYNC_FLAGS;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = android.opengl.GLES30.GL_SYNC_FLUSH_COMMANDS_BIT;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = android.opengl.GLES30.GL_SYNC_GPU_COMMANDS_COMPLETE;
    public static final int GL_SYNC_STATUS = android.opengl.GLES30.GL_SYNC_STATUS;
    public static final int GL_TEXTURE_2D_ARRAY = android.opengl.GLES30.GL_TEXTURE_2D_ARRAY;
    public static final int GL_TEXTURE_3D = android.opengl.GLES30.GL_TEXTURE_3D;
    public static final int GL_TEXTURE_BASE_LEVEL = android.opengl.GLES30.GL_TEXTURE_BASE_LEVEL;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = android.opengl.GLES30.GL_TEXTURE_BINDING_2D_ARRAY;
    public static final int GL_TEXTURE_BINDING_3D = android.opengl.GLES30.GL_TEXTURE_BINDING_3D;
    public static final int GL_TEXTURE_COMPARE_FUNC = android.opengl.GLES30.GL_TEXTURE_COMPARE_FUNC;
    public static final int GL_TEXTURE_COMPARE_MODE = android.opengl.GLES30.GL_TEXTURE_COMPARE_MODE;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = android.opengl.GLES30.GL_TEXTURE_IMMUTABLE_FORMAT;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = android.opengl.GLES30.GL_TEXTURE_IMMUTABLE_LEVELS;
    public static final int GL_TEXTURE_MAX_LEVEL = android.opengl.GLES30.GL_TEXTURE_MAX_LEVEL;
    public static final int GL_TEXTURE_MAX_LOD = android.opengl.GLES30.GL_TEXTURE_MAX_LOD;
    public static final int GL_TEXTURE_MIN_LOD = android.opengl.GLES30.GL_TEXTURE_MIN_LOD;
    public static final int GL_TEXTURE_SWIZZLE_A = android.opengl.GLES30.GL_TEXTURE_SWIZZLE_A;
    public static final int GL_TEXTURE_SWIZZLE_B = android.opengl.GLES30.GL_TEXTURE_SWIZZLE_B;
    public static final int GL_TEXTURE_SWIZZLE_G = android.opengl.GLES30.GL_TEXTURE_SWIZZLE_G;
    public static final int GL_TEXTURE_SWIZZLE_R = android.opengl.GLES30.GL_TEXTURE_SWIZZLE_R;
    public static final int GL_TEXTURE_WRAP_R = android.opengl.GLES30.GL_TEXTURE_WRAP_R;
    public static final int GL_TIMEOUT_EXPIRED = android.opengl.GLES30.GL_TIMEOUT_EXPIRED;
    public static final long GL_TIMEOUT_IGNORED = android.opengl.GLES30.GL_TIMEOUT_IGNORED;
    public static final int GL_TRANSFORM_FEEDBACK = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK;
    public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_ACTIVE;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_BINDING;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_BUFFER;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_BUFFER_BINDING;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_BUFFER_MODE;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_BUFFER_SIZE;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_BUFFER_START;
    public static final int GL_TRANSFORM_FEEDBACK_PAUSED = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_PAUSED;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_VARYINGS;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = android.opengl.GLES30.GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH;
    public static final int GL_UNIFORM_ARRAY_STRIDE = android.opengl.GLES30.GL_UNIFORM_ARRAY_STRIDE;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = android.opengl.GLES30.GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = android.opengl.GLES30.GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES;
    public static final int GL_UNIFORM_BLOCK_BINDING = android.opengl.GLES30.GL_UNIFORM_BLOCK_BINDING;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = android.opengl.GLES30.GL_UNIFORM_BLOCK_DATA_SIZE;
    public static final int GL_UNIFORM_BLOCK_INDEX = android.opengl.GLES30.GL_UNIFORM_BLOCK_INDEX;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = android.opengl.GLES30.GL_UNIFORM_BLOCK_NAME_LENGTH;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = android.opengl.GLES30.GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = android.opengl.GLES30.GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER;
    public static final int GL_UNIFORM_BUFFER = android.opengl.GLES30.GL_UNIFORM_BUFFER;
    public static final int GL_UNIFORM_BUFFER_BINDING = android.opengl.GLES30.GL_UNIFORM_BUFFER_BINDING;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = android.opengl.GLES30.GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT;
    public static final int GL_UNIFORM_BUFFER_SIZE = android.opengl.GLES30.GL_UNIFORM_BUFFER_SIZE;
    public static final int GL_UNIFORM_BUFFER_START = android.opengl.GLES30.GL_UNIFORM_BUFFER_START;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = android.opengl.GLES30.GL_UNIFORM_IS_ROW_MAJOR;
    public static final int GL_UNIFORM_MATRIX_STRIDE = android.opengl.GLES30.GL_UNIFORM_MATRIX_STRIDE;
    public static final int GL_UNIFORM_NAME_LENGTH = android.opengl.GLES30.GL_UNIFORM_NAME_LENGTH;
    public static final int GL_UNIFORM_OFFSET = android.opengl.GLES30.GL_UNIFORM_OFFSET;
    public static final int GL_UNIFORM_SIZE = android.opengl.GLES30.GL_UNIFORM_SIZE;
    public static final int GL_UNIFORM_TYPE = android.opengl.GLES30.GL_UNIFORM_TYPE;
    public static final int GL_UNPACK_IMAGE_HEIGHT = android.opengl.GLES30.GL_UNPACK_IMAGE_HEIGHT;
    public static final int GL_UNPACK_ROW_LENGTH = android.opengl.GLES30.GL_UNPACK_ROW_LENGTH;
    public static final int GL_UNPACK_SKIP_IMAGES = android.opengl.GLES30.GL_UNPACK_SKIP_IMAGES;
    public static final int GL_UNPACK_SKIP_PIXELS = android.opengl.GLES30.GL_UNPACK_SKIP_PIXELS;
    public static final int GL_UNPACK_SKIP_ROWS = android.opengl.GLES30.GL_UNPACK_SKIP_ROWS;
    public static final int GL_UNSIGNALED = android.opengl.GLES30.GL_UNSIGNALED;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = android.opengl.GLES30.GL_UNSIGNED_INT_10F_11F_11F_REV;
    public static final int GL_UNSIGNED_INT_24_8 = android.opengl.GLES30.GL_UNSIGNED_INT_24_8;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = android.opengl.GLES30.GL_UNSIGNED_INT_2_10_10_10_REV;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = android.opengl.GLES30.GL_UNSIGNED_INT_5_9_9_9_REV;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = android.opengl.GLES30.GL_UNSIGNED_INT_SAMPLER_2D;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = android.opengl.GLES30.GL_UNSIGNED_INT_SAMPLER_2D_ARRAY;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = android.opengl.GLES30.GL_UNSIGNED_INT_SAMPLER_3D;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = android.opengl.GLES30.GL_UNSIGNED_INT_SAMPLER_CUBE;
    public static final int GL_UNSIGNED_INT_VEC2 = android.opengl.GLES30.GL_UNSIGNED_INT_VEC2;
    public static final int GL_UNSIGNED_INT_VEC3 = android.opengl.GLES30.GL_UNSIGNED_INT_VEC3;
    public static final int GL_UNSIGNED_INT_VEC4 = android.opengl.GLES30.GL_UNSIGNED_INT_VEC4;
    public static final int GL_UNSIGNED_NORMALIZED = android.opengl.GLES30.GL_UNSIGNED_NORMALIZED;
    public static final int GL_VERTEX_ARRAY_BINDING = android.opengl.GLES30.GL_VERTEX_ARRAY_BINDING;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = android.opengl.GLES30.GL_VERTEX_ATTRIB_ARRAY_DIVISOR;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = android.opengl.GLES30.GL_VERTEX_ATTRIB_ARRAY_INTEGER;
    public static final int GL_WAIT_FAILED = android.opengl.GLES30.GL_WAIT_FAILED;

}
