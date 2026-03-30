// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES31 {
    private final android.opengl.GLES31 real;

    public GLES31(android.opengl.GLES31 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES31 wrap(android.opengl.GLES31 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES31(real);
    }

    public android.opengl.GLES31 unwrap() {
        return real;
    }

    public static void glActiveShaderProgram(int arg0, int arg1) {
        android.opengl.GLES31.glActiveShaderProgram(arg0, arg1);
    }

    public static void glBindImageTexture(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        android.opengl.GLES31.glBindImageTexture(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glBindProgramPipeline(int arg0) {
        android.opengl.GLES31.glBindProgramPipeline(arg0);
    }

    public static void glBindVertexBuffer(int arg0, int arg1, long arg2, int arg3) {
        android.opengl.GLES31.glBindVertexBuffer(arg0, arg1, arg2, arg3);
    }

    public static int glCreateShaderProgramv(int arg0, java.lang.String[] arg1) {
        return android.opengl.GLES31.glCreateShaderProgramv(arg0, arg1);
    }

    public static void glDeleteProgramPipelines(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES31.glDeleteProgramPipelines(arg0, arg1);
    }

    public static void glDeleteProgramPipelines(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES31.glDeleteProgramPipelines(arg0, arg1, arg2);
    }

    public static void glDispatchCompute(int arg0, int arg1, int arg2) {
        android.opengl.GLES31.glDispatchCompute(arg0, arg1, arg2);
    }

    public static void glDispatchComputeIndirect(long arg0) {
        android.opengl.GLES31.glDispatchComputeIndirect(arg0);
    }

    public static void glDrawArraysIndirect(int arg0, long arg1) {
        android.opengl.GLES31.glDrawArraysIndirect(arg0, arg1);
    }

    public static void glDrawElementsIndirect(int arg0, int arg1, long arg2) {
        android.opengl.GLES31.glDrawElementsIndirect(arg0, arg1, arg2);
    }

    public static void glFramebufferParameteri(int arg0, int arg1, int arg2) {
        android.opengl.GLES31.glFramebufferParameteri(arg0, arg1, arg2);
    }

    public static void glGenProgramPipelines(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES31.glGenProgramPipelines(arg0, arg1);
    }

    public static void glGenProgramPipelines(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES31.glGenProgramPipelines(arg0, arg1, arg2);
    }

    public static void glGetBooleani_v(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31.glGetBooleani_v(arg0, arg1, arg2);
    }

    public static void glGetBooleani_v(int arg0, int arg1, boolean[] arg2, int arg3) {
        android.opengl.GLES31.glGetBooleani_v(arg0, arg1, arg2, arg3);
    }

    public static void glGetFramebufferParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31.glGetFramebufferParameteriv(arg0, arg1, arg2);
    }

    public static void glGetFramebufferParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31.glGetFramebufferParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glGetMultisamplefv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES31.glGetMultisamplefv(arg0, arg1, arg2);
    }

    public static void glGetMultisamplefv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES31.glGetMultisamplefv(arg0, arg1, arg2, arg3);
    }

    public static void glGetProgramInterfaceiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glGetProgramInterfaceiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetProgramInterfaceiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glGetProgramInterfaceiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static java.lang.String glGetProgramPipelineInfoLog(int arg0) {
        return android.opengl.GLES31.glGetProgramPipelineInfoLog(arg0);
    }

    public static void glGetProgramPipelineiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES31.glGetProgramPipelineiv(arg0, arg1, arg2);
    }

    public static void glGetProgramPipelineiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES31.glGetProgramPipelineiv(arg0, arg1, arg2, arg3);
    }

    public static int glGetProgramResourceIndex(int arg0, int arg1, java.lang.String arg2) {
        return android.opengl.GLES31.glGetProgramResourceIndex(arg0, arg1, arg2);
    }

    public static int glGetProgramResourceLocation(int arg0, int arg1, java.lang.String arg2) {
        return android.opengl.GLES31.glGetProgramResourceLocation(arg0, arg1, arg2);
    }

    public static java.lang.String glGetProgramResourceName(int arg0, int arg1, int arg2) {
        return android.opengl.GLES31.glGetProgramResourceName(arg0, arg1, arg2);
    }

    public static void glGetProgramResourceiv(int arg0, int arg1, int arg2, int arg3, java.nio.IntBuffer arg4, int arg5, java.nio.IntBuffer arg6, java.nio.IntBuffer arg7) {
        android.opengl.GLES31.glGetProgramResourceiv(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glGetProgramResourceiv(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int[] arg9, int arg10) {
        android.opengl.GLES31.glGetProgramResourceiv(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void glGetTexLevelParameterfv(int arg0, int arg1, int arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES31.glGetTexLevelParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexLevelParameterfv(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.GLES31.glGetTexLevelParameterfv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetTexLevelParameteriv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glGetTexLevelParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexLevelParameteriv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glGetTexLevelParameteriv(arg0, arg1, arg2, arg3, arg4);
    }

    public static boolean glIsProgramPipeline(int arg0) {
        return android.opengl.GLES31.glIsProgramPipeline(arg0);
    }

    public static void glMemoryBarrier(int arg0) {
        android.opengl.GLES31.glMemoryBarrier(arg0);
    }

    public static void glMemoryBarrierByRegion(int arg0) {
        android.opengl.GLES31.glMemoryBarrierByRegion(arg0);
    }

    public static void glProgramUniform1f(int arg0, int arg1, float arg2) {
        android.opengl.GLES31.glProgramUniform1f(arg0, arg1, arg2);
    }

    public static void glProgramUniform1fv(int arg0, int arg1, int arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES31.glProgramUniform1fv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform1fv(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform1fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform1i(int arg0, int arg1, int arg2) {
        android.opengl.GLES31.glProgramUniform1i(arg0, arg1, arg2);
    }

    public static void glProgramUniform1iv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform1iv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform1iv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform1iv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform1ui(int arg0, int arg1, int arg2) {
        android.opengl.GLES31.glProgramUniform1ui(arg0, arg1, arg2);
    }

    public static void glProgramUniform1uiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform1uiv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform1uiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform1uiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform2f(int arg0, int arg1, float arg2, float arg3) {
        android.opengl.GLES31.glProgramUniform2f(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform2fv(int arg0, int arg1, int arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES31.glProgramUniform2fv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform2fv(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform2i(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES31.glProgramUniform2i(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform2iv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform2iv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform2iv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform2iv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform2ui(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES31.glProgramUniform2ui(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform2uiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform2uiv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform2uiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform2uiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform3f(int arg0, int arg1, float arg2, float arg3, float arg4) {
        android.opengl.GLES31.glProgramUniform3f(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform3fv(int arg0, int arg1, int arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES31.glProgramUniform3fv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform3fv(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform3i(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform3i(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform3iv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform3iv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform3iv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform3iv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform3ui(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform3ui(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform3uiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform3uiv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform3uiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform3uiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform4f(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5) {
        android.opengl.GLES31.glProgramUniform4f(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniform4fv(int arg0, int arg1, int arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES31.glProgramUniform4fv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform4fv(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform4i(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES31.glProgramUniform4i(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniform4iv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform4iv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform4iv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform4iv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniform4ui(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES31.glProgramUniform4ui(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniform4uiv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES31.glProgramUniform4uiv(arg0, arg1, arg2, arg3);
    }

    public static void glProgramUniform4uiv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES31.glProgramUniform4uiv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix2fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix2fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix2fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix2x3fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix2x3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix2x3fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix2x3fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix2x4fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix2x4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix2x4fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix2x4fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix3fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix3fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix3fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix3x2fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix3x2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix3x2fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix3x2fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix3x4fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix3x4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix3x4fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix3x4fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix4fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix4fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix4fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix4x2fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix4x2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix4x2fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix4x2fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glProgramUniformMatrix4x3fv(int arg0, int arg1, int arg2, boolean arg3, java.nio.FloatBuffer arg4) {
        android.opengl.GLES31.glProgramUniformMatrix4x3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glProgramUniformMatrix4x3fv(int arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5) {
        android.opengl.GLES31.glProgramUniformMatrix4x3fv(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glSampleMaski(int arg0, int arg1) {
        android.opengl.GLES31.glSampleMaski(arg0, arg1);
    }

    public static void glTexStorage2DMultisample(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        android.opengl.GLES31.glTexStorage2DMultisample(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glUseProgramStages(int arg0, int arg1, int arg2) {
        android.opengl.GLES31.glUseProgramStages(arg0, arg1, arg2);
    }

    public static void glValidateProgramPipeline(int arg0) {
        android.opengl.GLES31.glValidateProgramPipeline(arg0);
    }

    public static void glVertexAttribBinding(int arg0, int arg1) {
        android.opengl.GLES31.glVertexAttribBinding(arg0, arg1);
    }

    public static void glVertexAttribFormat(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        android.opengl.GLES31.glVertexAttribFormat(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glVertexAttribIFormat(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES31.glVertexAttribIFormat(arg0, arg1, arg2, arg3);
    }

    public static void glVertexBindingDivisor(int arg0, int arg1) {
        android.opengl.GLES31.glVertexBindingDivisor(arg0, arg1);
    }

    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES31.GL_ACTIVE_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_ACTIVE_PROGRAM = android.opengl.GLES31.GL_ACTIVE_PROGRAM;
    public static final int GL_ACTIVE_RESOURCES = android.opengl.GLES31.GL_ACTIVE_RESOURCES;
    public static final int GL_ACTIVE_VARIABLES = android.opengl.GLES31.GL_ACTIVE_VARIABLES;
    public static final int GL_ALL_BARRIER_BITS = android.opengl.GLES31.GL_ALL_BARRIER_BITS;
    public static final int GL_ALL_SHADER_BITS = android.opengl.GLES31.GL_ALL_SHADER_BITS;
    public static final int GL_ARRAY_SIZE = android.opengl.GLES31.GL_ARRAY_SIZE;
    public static final int GL_ARRAY_STRIDE = android.opengl.GLES31.GL_ARRAY_STRIDE;
    public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = android.opengl.GLES31.GL_ATOMIC_COUNTER_BARRIER_BIT;
    public static final int GL_ATOMIC_COUNTER_BUFFER = android.opengl.GLES31.GL_ATOMIC_COUNTER_BUFFER;
    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = android.opengl.GLES31.GL_ATOMIC_COUNTER_BUFFER_BINDING;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = android.opengl.GLES31.GL_ATOMIC_COUNTER_BUFFER_INDEX;
    public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = android.opengl.GLES31.GL_ATOMIC_COUNTER_BUFFER_SIZE;
    public static final int GL_ATOMIC_COUNTER_BUFFER_START = android.opengl.GLES31.GL_ATOMIC_COUNTER_BUFFER_START;
    public static final int GL_BLOCK_INDEX = android.opengl.GLES31.GL_BLOCK_INDEX;
    public static final int GL_BUFFER_BINDING = android.opengl.GLES31.GL_BUFFER_BINDING;
    public static final int GL_BUFFER_DATA_SIZE = android.opengl.GLES31.GL_BUFFER_DATA_SIZE;
    public static final int GL_BUFFER_UPDATE_BARRIER_BIT = android.opengl.GLES31.GL_BUFFER_UPDATE_BARRIER_BIT;
    public static final int GL_BUFFER_VARIABLE = android.opengl.GLES31.GL_BUFFER_VARIABLE;
    public static final int GL_COMMAND_BARRIER_BIT = android.opengl.GLES31.GL_COMMAND_BARRIER_BIT;
    public static final int GL_COMPUTE_SHADER = android.opengl.GLES31.GL_COMPUTE_SHADER;
    public static final int GL_COMPUTE_SHADER_BIT = android.opengl.GLES31.GL_COMPUTE_SHADER_BIT;
    public static final int GL_COMPUTE_WORK_GROUP_SIZE = android.opengl.GLES31.GL_COMPUTE_WORK_GROUP_SIZE;
    public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = android.opengl.GLES31.GL_DEPTH_STENCIL_TEXTURE_MODE;
    public static final int GL_DISPATCH_INDIRECT_BUFFER = android.opengl.GLES31.GL_DISPATCH_INDIRECT_BUFFER;
    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = android.opengl.GLES31.GL_DISPATCH_INDIRECT_BUFFER_BINDING;
    public static final int GL_DRAW_INDIRECT_BUFFER = android.opengl.GLES31.GL_DRAW_INDIRECT_BUFFER;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = android.opengl.GLES31.GL_DRAW_INDIRECT_BUFFER_BINDING;
    public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = android.opengl.GLES31.GL_ELEMENT_ARRAY_BARRIER_BIT;
    public static final int GL_FRAGMENT_SHADER_BIT = android.opengl.GLES31.GL_FRAGMENT_SHADER_BIT;
    public static final int GL_FRAMEBUFFER_BARRIER_BIT = android.opengl.GLES31.GL_FRAMEBUFFER_BARRIER_BIT;
    public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = android.opengl.GLES31.GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS;
    public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = android.opengl.GLES31.GL_FRAMEBUFFER_DEFAULT_HEIGHT;
    public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = android.opengl.GLES31.GL_FRAMEBUFFER_DEFAULT_SAMPLES;
    public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = android.opengl.GLES31.GL_FRAMEBUFFER_DEFAULT_WIDTH;
    public static final int GL_IMAGE_2D = android.opengl.GLES31.GL_IMAGE_2D;
    public static final int GL_IMAGE_2D_ARRAY = android.opengl.GLES31.GL_IMAGE_2D_ARRAY;
    public static final int GL_IMAGE_3D = android.opengl.GLES31.GL_IMAGE_3D;
    public static final int GL_IMAGE_BINDING_ACCESS = android.opengl.GLES31.GL_IMAGE_BINDING_ACCESS;
    public static final int GL_IMAGE_BINDING_FORMAT = android.opengl.GLES31.GL_IMAGE_BINDING_FORMAT;
    public static final int GL_IMAGE_BINDING_LAYER = android.opengl.GLES31.GL_IMAGE_BINDING_LAYER;
    public static final int GL_IMAGE_BINDING_LAYERED = android.opengl.GLES31.GL_IMAGE_BINDING_LAYERED;
    public static final int GL_IMAGE_BINDING_LEVEL = android.opengl.GLES31.GL_IMAGE_BINDING_LEVEL;
    public static final int GL_IMAGE_BINDING_NAME = android.opengl.GLES31.GL_IMAGE_BINDING_NAME;
    public static final int GL_IMAGE_CUBE = android.opengl.GLES31.GL_IMAGE_CUBE;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = android.opengl.GLES31.GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = android.opengl.GLES31.GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = android.opengl.GLES31.GL_IMAGE_FORMAT_COMPATIBILITY_TYPE;
    public static final int GL_INT_IMAGE_2D = android.opengl.GLES31.GL_INT_IMAGE_2D;
    public static final int GL_INT_IMAGE_2D_ARRAY = android.opengl.GLES31.GL_INT_IMAGE_2D_ARRAY;
    public static final int GL_INT_IMAGE_3D = android.opengl.GLES31.GL_INT_IMAGE_3D;
    public static final int GL_INT_IMAGE_CUBE = android.opengl.GLES31.GL_INT_IMAGE_CUBE;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = android.opengl.GLES31.GL_INT_SAMPLER_2D_MULTISAMPLE;
    public static final int GL_IS_ROW_MAJOR = android.opengl.GLES31.GL_IS_ROW_MAJOR;
    public static final int GL_LOCATION = android.opengl.GLES31.GL_LOCATION;
    public static final int GL_MATRIX_STRIDE = android.opengl.GLES31.GL_MATRIX_STRIDE;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = android.opengl.GLES31.GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = android.opengl.GLES31.GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = android.opengl.GLES31.GL_MAX_COLOR_TEXTURE_SAMPLES;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = android.opengl.GLES31.GL_MAX_COMBINED_ATOMIC_COUNTERS;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES31.GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = android.opengl.GLES31.GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS;
    public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = android.opengl.GLES31.GL_MAX_COMBINED_IMAGE_UNIFORMS;
    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = android.opengl.GLES31.GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES;
    public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = android.opengl.GLES31.GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = android.opengl.GLES31.GL_MAX_COMPUTE_ATOMIC_COUNTERS;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES31.GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = android.opengl.GLES31.GL_MAX_COMPUTE_IMAGE_UNIFORMS;
    public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = android.opengl.GLES31.GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS;
    public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = android.opengl.GLES31.GL_MAX_COMPUTE_SHARED_MEMORY_SIZE;
    public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = android.opengl.GLES31.GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = android.opengl.GLES31.GL_MAX_COMPUTE_UNIFORM_BLOCKS;
    public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = android.opengl.GLES31.GL_MAX_COMPUTE_UNIFORM_COMPONENTS;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = android.opengl.GLES31.GL_MAX_COMPUTE_WORK_GROUP_COUNT;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = android.opengl.GLES31.GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = android.opengl.GLES31.GL_MAX_COMPUTE_WORK_GROUP_SIZE;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = android.opengl.GLES31.GL_MAX_DEPTH_TEXTURE_SAMPLES;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = android.opengl.GLES31.GL_MAX_FRAGMENT_ATOMIC_COUNTERS;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES31.GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = android.opengl.GLES31.GL_MAX_FRAGMENT_IMAGE_UNIFORMS;
    public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = android.opengl.GLES31.GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS;
    public static final int GL_MAX_FRAMEBUFFER_HEIGHT = android.opengl.GLES31.GL_MAX_FRAMEBUFFER_HEIGHT;
    public static final int GL_MAX_FRAMEBUFFER_SAMPLES = android.opengl.GLES31.GL_MAX_FRAMEBUFFER_SAMPLES;
    public static final int GL_MAX_FRAMEBUFFER_WIDTH = android.opengl.GLES31.GL_MAX_FRAMEBUFFER_WIDTH;
    public static final int GL_MAX_IMAGE_UNITS = android.opengl.GLES31.GL_MAX_IMAGE_UNITS;
    public static final int GL_MAX_INTEGER_SAMPLES = android.opengl.GLES31.GL_MAX_INTEGER_SAMPLES;
    public static final int GL_MAX_NAME_LENGTH = android.opengl.GLES31.GL_MAX_NAME_LENGTH;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = android.opengl.GLES31.GL_MAX_NUM_ACTIVE_VARIABLES;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = android.opengl.GLES31.GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = android.opengl.GLES31.GL_MAX_SAMPLE_MASK_WORDS;
    public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = android.opengl.GLES31.GL_MAX_SHADER_STORAGE_BLOCK_SIZE;
    public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = android.opengl.GLES31.GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS;
    public static final int GL_MAX_UNIFORM_LOCATIONS = android.opengl.GLES31.GL_MAX_UNIFORM_LOCATIONS;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = android.opengl.GLES31.GL_MAX_VERTEX_ATOMIC_COUNTERS;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = android.opengl.GLES31.GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = android.opengl.GLES31.GL_MAX_VERTEX_ATTRIB_BINDINGS;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = android.opengl.GLES31.GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET;
    public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = android.opengl.GLES31.GL_MAX_VERTEX_ATTRIB_STRIDE;
    public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = android.opengl.GLES31.GL_MAX_VERTEX_IMAGE_UNIFORMS;
    public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = android.opengl.GLES31.GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = android.opengl.GLES31.GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET;
    public static final int GL_NAME_LENGTH = android.opengl.GLES31.GL_NAME_LENGTH;
    public static final int GL_NUM_ACTIVE_VARIABLES = android.opengl.GLES31.GL_NUM_ACTIVE_VARIABLES;
    public static final int GL_OFFSET = android.opengl.GLES31.GL_OFFSET;
    public static final int GL_PIXEL_BUFFER_BARRIER_BIT = android.opengl.GLES31.GL_PIXEL_BUFFER_BARRIER_BIT;
    public static final int GL_PROGRAM_INPUT = android.opengl.GLES31.GL_PROGRAM_INPUT;
    public static final int GL_PROGRAM_OUTPUT = android.opengl.GLES31.GL_PROGRAM_OUTPUT;
    public static final int GL_PROGRAM_PIPELINE_BINDING = android.opengl.GLES31.GL_PROGRAM_PIPELINE_BINDING;
    public static final int GL_PROGRAM_SEPARABLE = android.opengl.GLES31.GL_PROGRAM_SEPARABLE;
    public static final int GL_READ_ONLY = android.opengl.GLES31.GL_READ_ONLY;
    public static final int GL_READ_WRITE = android.opengl.GLES31.GL_READ_WRITE;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = android.opengl.GLES31.GL_REFERENCED_BY_COMPUTE_SHADER;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = android.opengl.GLES31.GL_REFERENCED_BY_FRAGMENT_SHADER;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = android.opengl.GLES31.GL_REFERENCED_BY_VERTEX_SHADER;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = android.opengl.GLES31.GL_SAMPLER_2D_MULTISAMPLE;
    public static final int GL_SAMPLE_MASK = android.opengl.GLES31.GL_SAMPLE_MASK;
    public static final int GL_SAMPLE_MASK_VALUE = android.opengl.GLES31.GL_SAMPLE_MASK_VALUE;
    public static final int GL_SAMPLE_POSITION = android.opengl.GLES31.GL_SAMPLE_POSITION;
    public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = android.opengl.GLES31.GL_SHADER_IMAGE_ACCESS_BARRIER_BIT;
    public static final int GL_SHADER_STORAGE_BARRIER_BIT = android.opengl.GLES31.GL_SHADER_STORAGE_BARRIER_BIT;
    public static final int GL_SHADER_STORAGE_BLOCK = android.opengl.GLES31.GL_SHADER_STORAGE_BLOCK;
    public static final int GL_SHADER_STORAGE_BUFFER = android.opengl.GLES31.GL_SHADER_STORAGE_BUFFER;
    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = android.opengl.GLES31.GL_SHADER_STORAGE_BUFFER_BINDING;
    public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = android.opengl.GLES31.GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT;
    public static final int GL_SHADER_STORAGE_BUFFER_SIZE = android.opengl.GLES31.GL_SHADER_STORAGE_BUFFER_SIZE;
    public static final int GL_SHADER_STORAGE_BUFFER_START = android.opengl.GLES31.GL_SHADER_STORAGE_BUFFER_START;
    public static final int GL_STENCIL_INDEX = android.opengl.GLES31.GL_STENCIL_INDEX;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = android.opengl.GLES31.GL_TEXTURE_2D_MULTISAMPLE;
    public static final int GL_TEXTURE_ALPHA_SIZE = android.opengl.GLES31.GL_TEXTURE_ALPHA_SIZE;
    public static final int GL_TEXTURE_ALPHA_TYPE = android.opengl.GLES31.GL_TEXTURE_ALPHA_TYPE;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = android.opengl.GLES31.GL_TEXTURE_BINDING_2D_MULTISAMPLE;
    public static final int GL_TEXTURE_BLUE_SIZE = android.opengl.GLES31.GL_TEXTURE_BLUE_SIZE;
    public static final int GL_TEXTURE_BLUE_TYPE = android.opengl.GLES31.GL_TEXTURE_BLUE_TYPE;
    public static final int GL_TEXTURE_COMPRESSED = android.opengl.GLES31.GL_TEXTURE_COMPRESSED;
    public static final int GL_TEXTURE_DEPTH = android.opengl.GLES31.GL_TEXTURE_DEPTH;
    public static final int GL_TEXTURE_DEPTH_SIZE = android.opengl.GLES31.GL_TEXTURE_DEPTH_SIZE;
    public static final int GL_TEXTURE_DEPTH_TYPE = android.opengl.GLES31.GL_TEXTURE_DEPTH_TYPE;
    public static final int GL_TEXTURE_FETCH_BARRIER_BIT = android.opengl.GLES31.GL_TEXTURE_FETCH_BARRIER_BIT;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = android.opengl.GLES31.GL_TEXTURE_FIXED_SAMPLE_LOCATIONS;
    public static final int GL_TEXTURE_GREEN_SIZE = android.opengl.GLES31.GL_TEXTURE_GREEN_SIZE;
    public static final int GL_TEXTURE_GREEN_TYPE = android.opengl.GLES31.GL_TEXTURE_GREEN_TYPE;
    public static final int GL_TEXTURE_HEIGHT = android.opengl.GLES31.GL_TEXTURE_HEIGHT;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = android.opengl.GLES31.GL_TEXTURE_INTERNAL_FORMAT;
    public static final int GL_TEXTURE_RED_SIZE = android.opengl.GLES31.GL_TEXTURE_RED_SIZE;
    public static final int GL_TEXTURE_RED_TYPE = android.opengl.GLES31.GL_TEXTURE_RED_TYPE;
    public static final int GL_TEXTURE_SAMPLES = android.opengl.GLES31.GL_TEXTURE_SAMPLES;
    public static final int GL_TEXTURE_SHARED_SIZE = android.opengl.GLES31.GL_TEXTURE_SHARED_SIZE;
    public static final int GL_TEXTURE_STENCIL_SIZE = android.opengl.GLES31.GL_TEXTURE_STENCIL_SIZE;
    public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = android.opengl.GLES31.GL_TEXTURE_UPDATE_BARRIER_BIT;
    public static final int GL_TEXTURE_WIDTH = android.opengl.GLES31.GL_TEXTURE_WIDTH;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = android.opengl.GLES31.GL_TOP_LEVEL_ARRAY_SIZE;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = android.opengl.GLES31.GL_TOP_LEVEL_ARRAY_STRIDE;
    public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = android.opengl.GLES31.GL_TRANSFORM_FEEDBACK_BARRIER_BIT;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = android.opengl.GLES31.GL_TRANSFORM_FEEDBACK_VARYING;
    public static final int GL_TYPE = android.opengl.GLES31.GL_TYPE;
    public static final int GL_UNIFORM = android.opengl.GLES31.GL_UNIFORM;
    public static final int GL_UNIFORM_BARRIER_BIT = android.opengl.GLES31.GL_UNIFORM_BARRIER_BIT;
    public static final int GL_UNIFORM_BLOCK = android.opengl.GLES31.GL_UNIFORM_BLOCK;
    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = android.opengl.GLES31.GL_UNSIGNED_INT_ATOMIC_COUNTER;
    public static final int GL_UNSIGNED_INT_IMAGE_2D = android.opengl.GLES31.GL_UNSIGNED_INT_IMAGE_2D;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = android.opengl.GLES31.GL_UNSIGNED_INT_IMAGE_2D_ARRAY;
    public static final int GL_UNSIGNED_INT_IMAGE_3D = android.opengl.GLES31.GL_UNSIGNED_INT_IMAGE_3D;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE = android.opengl.GLES31.GL_UNSIGNED_INT_IMAGE_CUBE;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = android.opengl.GLES31.GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = android.opengl.GLES31.GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT;
    public static final int GL_VERTEX_ATTRIB_BINDING = android.opengl.GLES31.GL_VERTEX_ATTRIB_BINDING;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = android.opengl.GLES31.GL_VERTEX_ATTRIB_RELATIVE_OFFSET;
    public static final int GL_VERTEX_BINDING_BUFFER = android.opengl.GLES31.GL_VERTEX_BINDING_BUFFER;
    public static final int GL_VERTEX_BINDING_DIVISOR = android.opengl.GLES31.GL_VERTEX_BINDING_DIVISOR;
    public static final int GL_VERTEX_BINDING_OFFSET = android.opengl.GLES31.GL_VERTEX_BINDING_OFFSET;
    public static final int GL_VERTEX_BINDING_STRIDE = android.opengl.GLES31.GL_VERTEX_BINDING_STRIDE;
    public static final int GL_VERTEX_SHADER_BIT = android.opengl.GLES31.GL_VERTEX_SHADER_BIT;
    public static final int GL_WRITE_ONLY = android.opengl.GLES31.GL_WRITE_ONLY;

}
