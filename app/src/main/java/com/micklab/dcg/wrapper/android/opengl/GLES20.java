// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES20 {
    private final android.opengl.GLES20 real;

    public GLES20(android.opengl.GLES20 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES20 wrap(android.opengl.GLES20 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES20(real);
    }

    public android.opengl.GLES20 unwrap() {
        return real;
    }

    public GLES20() {
        this(new android.opengl.GLES20());
    }

    public static void glActiveTexture(int arg0) {
        android.opengl.GLES20.glActiveTexture(arg0);
    }

    public static void glAttachShader(int arg0, int arg1) {
        android.opengl.GLES20.glAttachShader(arg0, arg1);
    }

    public static void glBindAttribLocation(int arg0, int arg1, java.lang.String arg2) {
        android.opengl.GLES20.glBindAttribLocation(arg0, arg1, arg2);
    }

    public static void glBindBuffer(int arg0, int arg1) {
        android.opengl.GLES20.glBindBuffer(arg0, arg1);
    }

    public static void glBindFramebuffer(int arg0, int arg1) {
        android.opengl.GLES20.glBindFramebuffer(arg0, arg1);
    }

    public static void glBindRenderbuffer(int arg0, int arg1) {
        android.opengl.GLES20.glBindRenderbuffer(arg0, arg1);
    }

    public static void glBindTexture(int arg0, int arg1) {
        android.opengl.GLES20.glBindTexture(arg0, arg1);
    }

    public static void glBlendColor(float arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES20.glBlendColor(arg0, arg1, arg2, arg3);
    }

    public static void glBlendEquation(int arg0) {
        android.opengl.GLES20.glBlendEquation(arg0);
    }

    public static void glBlendEquationSeparate(int arg0, int arg1) {
        android.opengl.GLES20.glBlendEquationSeparate(arg0, arg1);
    }

    public static void glBlendFunc(int arg0, int arg1) {
        android.opengl.GLES20.glBlendFunc(arg0, arg1);
    }

    public static void glBlendFuncSeparate(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glBlendFuncSeparate(arg0, arg1, arg2, arg3);
    }

    public static void glBufferData(int arg0, int arg1, java.nio.Buffer arg2, int arg3) {
        android.opengl.GLES20.glBufferData(arg0, arg1, arg2, arg3);
    }

    public static void glBufferSubData(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES20.glBufferSubData(arg0, arg1, arg2, arg3);
    }

    public static int glCheckFramebufferStatus(int arg0) {
        return android.opengl.GLES20.glCheckFramebufferStatus(arg0);
    }

    public static void glClear(int arg0) {
        android.opengl.GLES20.glClear(arg0);
    }

    public static void glClearColor(float arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES20.glClearColor(arg0, arg1, arg2, arg3);
    }

    public static void glClearDepthf(float arg0) {
        android.opengl.GLES20.glClearDepthf(arg0);
    }

    public static void glClearStencil(int arg0) {
        android.opengl.GLES20.glClearStencil(arg0);
    }

    public static void glColorMask(boolean arg0, boolean arg1, boolean arg2, boolean arg3) {
        android.opengl.GLES20.glColorMask(arg0, arg1, arg2, arg3);
    }

    public static void glCompileShader(int arg0) {
        android.opengl.GLES20.glCompileShader(arg0);
    }

    public static void glCompressedTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.nio.Buffer arg7) {
        android.opengl.GLES20.glCompressedTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glCompressedTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES20.glCompressedTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glCopyTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        android.opengl.GLES20.glCopyTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glCopyTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        android.opengl.GLES20.glCopyTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static int glCreateProgram() {
        return android.opengl.GLES20.glCreateProgram();
    }

    public static int glCreateShader(int arg0) {
        return android.opengl.GLES20.glCreateShader(arg0);
    }

    public static void glCullFace(int arg0) {
        android.opengl.GLES20.glCullFace(arg0);
    }

    public static void glDeleteBuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glDeleteBuffers(arg0, arg1);
    }

    public static void glDeleteBuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glDeleteBuffers(arg0, arg1, arg2);
    }

    public static void glDeleteFramebuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glDeleteFramebuffers(arg0, arg1);
    }

    public static void glDeleteFramebuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glDeleteFramebuffers(arg0, arg1, arg2);
    }

    public static void glDeleteProgram(int arg0) {
        android.opengl.GLES20.glDeleteProgram(arg0);
    }

    public static void glDeleteRenderbuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glDeleteRenderbuffers(arg0, arg1);
    }

    public static void glDeleteRenderbuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glDeleteRenderbuffers(arg0, arg1, arg2);
    }

    public static void glDeleteShader(int arg0) {
        android.opengl.GLES20.glDeleteShader(arg0);
    }

    public static void glDeleteTextures(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glDeleteTextures(arg0, arg1);
    }

    public static void glDeleteTextures(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glDeleteTextures(arg0, arg1, arg2);
    }

    public static void glDepthFunc(int arg0) {
        android.opengl.GLES20.glDepthFunc(arg0);
    }

    public static void glDepthMask(boolean arg0) {
        android.opengl.GLES20.glDepthMask(arg0);
    }

    public static void glDepthRangef(float arg0, float arg1) {
        android.opengl.GLES20.glDepthRangef(arg0, arg1);
    }

    public static void glDetachShader(int arg0, int arg1) {
        android.opengl.GLES20.glDetachShader(arg0, arg1);
    }

    public static void glDisable(int arg0) {
        android.opengl.GLES20.glDisable(arg0);
    }

    public static void glDisableVertexAttribArray(int arg0) {
        android.opengl.GLES20.glDisableVertexAttribArray(arg0);
    }

    public static void glDrawArrays(int arg0, int arg1, int arg2) {
        android.opengl.GLES20.glDrawArrays(arg0, arg1, arg2);
    }

    public static void glDrawElements(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glDrawElements(arg0, arg1, arg2, arg3);
    }

    public static void glDrawElements(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES20.glDrawElements(arg0, arg1, arg2, arg3);
    }

    public static void glEnable(int arg0) {
        android.opengl.GLES20.glEnable(arg0);
    }

    public static void glEnableVertexAttribArray(int arg0) {
        android.opengl.GLES20.glEnableVertexAttribArray(arg0);
    }

    public static void glFinish() {
        android.opengl.GLES20.glFinish();
    }

    public static void glFlush() {
        android.opengl.GLES20.glFlush();
    }

    public static void glFramebufferRenderbuffer(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glFramebufferRenderbuffer(arg0, arg1, arg2, arg3);
    }

    public static void glFramebufferTexture2D(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES20.glFramebufferTexture2D(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glFrontFace(int arg0) {
        android.opengl.GLES20.glFrontFace(arg0);
    }

    public static void glGenBuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glGenBuffers(arg0, arg1);
    }

    public static void glGenBuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glGenBuffers(arg0, arg1, arg2);
    }

    public static void glGenFramebuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glGenFramebuffers(arg0, arg1);
    }

    public static void glGenFramebuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glGenFramebuffers(arg0, arg1, arg2);
    }

    public static void glGenRenderbuffers(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glGenRenderbuffers(arg0, arg1);
    }

    public static void glGenRenderbuffers(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glGenRenderbuffers(arg0, arg1, arg2);
    }

    public static void glGenTextures(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glGenTextures(arg0, arg1);
    }

    public static void glGenTextures(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glGenTextures(arg0, arg1, arg2);
    }

    public static void glGenerateMipmap(int arg0) {
        android.opengl.GLES20.glGenerateMipmap(arg0);
    }

    public static java.lang.String glGetActiveAttrib(int arg0, int arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        return android.opengl.GLES20.glGetActiveAttrib(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String glGetActiveAttrib(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        return android.opengl.GLES20.glGetActiveAttrib(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glGetActiveAttrib(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
        android.opengl.GLES20.glGetActiveAttrib(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static java.lang.String glGetActiveUniform(int arg0, int arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        return android.opengl.GLES20.glGetActiveUniform(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String glGetActiveUniform(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        return android.opengl.GLES20.glGetActiveUniform(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glGetActiveUniform(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, byte[] arg9, int arg10) {
        android.opengl.GLES20.glGetActiveUniform(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void glGetAttachedShaders(int arg0, int arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES20.glGetAttachedShaders(arg0, arg1, arg2, arg3);
    }

    public static void glGetAttachedShaders(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        android.opengl.GLES20.glGetAttachedShaders(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static int glGetAttribLocation(int arg0, java.lang.String arg1) {
        return android.opengl.GLES20.glGetAttribLocation(arg0, arg1);
    }

    public static void glGetBooleanv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glGetBooleanv(arg0, arg1);
    }

    public static void glGetBooleanv(int arg0, boolean[] arg1, int arg2) {
        android.opengl.GLES20.glGetBooleanv(arg0, arg1, arg2);
    }

    public static void glGetBufferParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetBufferParameteriv(arg0, arg1, arg2);
    }

    public static void glGetBufferParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetBufferParameteriv(arg0, arg1, arg2, arg3);
    }

    public static int glGetError() {
        return android.opengl.GLES20.glGetError();
    }

    public static void glGetFloatv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES20.glGetFloatv(arg0, arg1);
    }

    public static void glGetFloatv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES20.glGetFloatv(arg0, arg1, arg2);
    }

    public static void glGetFramebufferAttachmentParameteriv(int arg0, int arg1, int arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES20.glGetFramebufferAttachmentParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glGetFramebufferAttachmentParameteriv(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        android.opengl.GLES20.glGetFramebufferAttachmentParameteriv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glGetIntegerv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES20.glGetIntegerv(arg0, arg1);
    }

    public static void glGetIntegerv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES20.glGetIntegerv(arg0, arg1, arg2);
    }

    public static java.lang.String glGetProgramInfoLog(int arg0) {
        return android.opengl.GLES20.glGetProgramInfoLog(arg0);
    }

    public static void glGetProgramiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetProgramiv(arg0, arg1, arg2);
    }

    public static void glGetProgramiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetProgramiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetRenderbufferParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetRenderbufferParameteriv(arg0, arg1, arg2);
    }

    public static void glGetRenderbufferParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetRenderbufferParameteriv(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String glGetShaderInfoLog(int arg0) {
        return android.opengl.GLES20.glGetShaderInfoLog(arg0);
    }

    public static void glGetShaderPrecisionFormat(int arg0, int arg1, java.nio.IntBuffer arg2, java.nio.IntBuffer arg3) {
        android.opengl.GLES20.glGetShaderPrecisionFormat(arg0, arg1, arg2, arg3);
    }

    public static void glGetShaderPrecisionFormat(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        android.opengl.GLES20.glGetShaderPrecisionFormat(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static java.lang.String glGetShaderSource(int arg0) {
        return android.opengl.GLES20.glGetShaderSource(arg0);
    }

    public static void glGetShaderSource(int arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int arg5) {
        android.opengl.GLES20.glGetShaderSource(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glGetShaderiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetShaderiv(arg0, arg1, arg2);
    }

    public static void glGetShaderiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetShaderiv(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String glGetString(int arg0) {
        return android.opengl.GLES20.glGetString(arg0);
    }

    public static void glGetTexParameterfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glGetTexParameterfv(arg0, arg1, arg2);
    }

    public static void glGetTexParameterfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glGetTexParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetTexParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetTexParameteriv(arg0, arg1, arg2);
    }

    public static void glGetTexParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetTexParameteriv(arg0, arg1, arg2, arg3);
    }

    public static int glGetUniformLocation(int arg0, java.lang.String arg1) {
        return android.opengl.GLES20.glGetUniformLocation(arg0, arg1);
    }

    public static void glGetUniformfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glGetUniformfv(arg0, arg1, arg2);
    }

    public static void glGetUniformfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glGetUniformfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetUniformiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetUniformiv(arg0, arg1, arg2);
    }

    public static void glGetUniformiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetUniformiv(arg0, arg1, arg2, arg3);
    }

    public static void glGetVertexAttribfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glGetVertexAttribfv(arg0, arg1, arg2);
    }

    public static void glGetVertexAttribfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glGetVertexAttribfv(arg0, arg1, arg2, arg3);
    }

    public static void glGetVertexAttribiv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glGetVertexAttribiv(arg0, arg1, arg2);
    }

    public static void glGetVertexAttribiv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glGetVertexAttribiv(arg0, arg1, arg2, arg3);
    }

    public static void glHint(int arg0, int arg1) {
        android.opengl.GLES20.glHint(arg0, arg1);
    }

    public static boolean glIsBuffer(int arg0) {
        return android.opengl.GLES20.glIsBuffer(arg0);
    }

    public static boolean glIsEnabled(int arg0) {
        return android.opengl.GLES20.glIsEnabled(arg0);
    }

    public static boolean glIsFramebuffer(int arg0) {
        return android.opengl.GLES20.glIsFramebuffer(arg0);
    }

    public static boolean glIsProgram(int arg0) {
        return android.opengl.GLES20.glIsProgram(arg0);
    }

    public static boolean glIsRenderbuffer(int arg0) {
        return android.opengl.GLES20.glIsRenderbuffer(arg0);
    }

    public static boolean glIsShader(int arg0) {
        return android.opengl.GLES20.glIsShader(arg0);
    }

    public static boolean glIsTexture(int arg0) {
        return android.opengl.GLES20.glIsTexture(arg0);
    }

    public static void glLineWidth(float arg0) {
        android.opengl.GLES20.glLineWidth(arg0);
    }

    public static void glLinkProgram(int arg0) {
        android.opengl.GLES20.glLinkProgram(arg0);
    }

    public static void glPixelStorei(int arg0, int arg1) {
        android.opengl.GLES20.glPixelStorei(arg0, arg1);
    }

    public static void glPolygonOffset(float arg0, float arg1) {
        android.opengl.GLES20.glPolygonOffset(arg0, arg1);
    }

    public static void glReadPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, java.nio.Buffer arg6) {
        android.opengl.GLES20.glReadPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glReleaseShaderCompiler() {
        android.opengl.GLES20.glReleaseShaderCompiler();
    }

    public static void glRenderbufferStorage(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glRenderbufferStorage(arg0, arg1, arg2, arg3);
    }

    public static void glSampleCoverage(float arg0, boolean arg1) {
        android.opengl.GLES20.glSampleCoverage(arg0, arg1);
    }

    public static void glScissor(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glScissor(arg0, arg1, arg2, arg3);
    }

    public static void glShaderBinary(int arg0, java.nio.IntBuffer arg1, int arg2, java.nio.Buffer arg3, int arg4) {
        android.opengl.GLES20.glShaderBinary(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glShaderBinary(int arg0, int[] arg1, int arg2, int arg3, java.nio.Buffer arg4, int arg5) {
        android.opengl.GLES20.glShaderBinary(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glShaderSource(int arg0, java.lang.String arg1) {
        android.opengl.GLES20.glShaderSource(arg0, arg1);
    }

    public static void glStencilFunc(int arg0, int arg1, int arg2) {
        android.opengl.GLES20.glStencilFunc(arg0, arg1, arg2);
    }

    public static void glStencilFuncSeparate(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glStencilFuncSeparate(arg0, arg1, arg2, arg3);
    }

    public static void glStencilMask(int arg0) {
        android.opengl.GLES20.glStencilMask(arg0);
    }

    public static void glStencilMaskSeparate(int arg0, int arg1) {
        android.opengl.GLES20.glStencilMaskSeparate(arg0, arg1);
    }

    public static void glStencilOp(int arg0, int arg1, int arg2) {
        android.opengl.GLES20.glStencilOp(arg0, arg1, arg2);
    }

    public static void glStencilOpSeparate(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glStencilOpSeparate(arg0, arg1, arg2, arg3);
    }

    public static void glTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES20.glTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glTexParameterf(int arg0, int arg1, float arg2) {
        android.opengl.GLES20.glTexParameterf(arg0, arg1, arg2);
    }

    public static void glTexParameterfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glTexParameterfv(arg0, arg1, arg2);
    }

    public static void glTexParameterfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glTexParameterfv(arg0, arg1, arg2, arg3);
    }

    public static void glTexParameteri(int arg0, int arg1, int arg2) {
        android.opengl.GLES20.glTexParameteri(arg0, arg1, arg2);
    }

    public static void glTexParameteriv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glTexParameteriv(arg0, arg1, arg2);
    }

    public static void glTexParameteriv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glTexParameteriv(arg0, arg1, arg2, arg3);
    }

    public static void glTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES20.glTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glUniform1f(int arg0, float arg1) {
        android.opengl.GLES20.glUniform1f(arg0, arg1);
    }

    public static void glUniform1fv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glUniform1fv(arg0, arg1, arg2);
    }

    public static void glUniform1fv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glUniform1fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform1i(int arg0, int arg1) {
        android.opengl.GLES20.glUniform1i(arg0, arg1);
    }

    public static void glUniform1iv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glUniform1iv(arg0, arg1, arg2);
    }

    public static void glUniform1iv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glUniform1iv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform2f(int arg0, float arg1, float arg2) {
        android.opengl.GLES20.glUniform2f(arg0, arg1, arg2);
    }

    public static void glUniform2fv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glUniform2fv(arg0, arg1, arg2);
    }

    public static void glUniform2fv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glUniform2fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform2i(int arg0, int arg1, int arg2) {
        android.opengl.GLES20.glUniform2i(arg0, arg1, arg2);
    }

    public static void glUniform2iv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glUniform2iv(arg0, arg1, arg2);
    }

    public static void glUniform2iv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glUniform2iv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform3f(int arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES20.glUniform3f(arg0, arg1, arg2, arg3);
    }

    public static void glUniform3fv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glUniform3fv(arg0, arg1, arg2);
    }

    public static void glUniform3fv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glUniform3fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform3i(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glUniform3i(arg0, arg1, arg2, arg3);
    }

    public static void glUniform3iv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glUniform3iv(arg0, arg1, arg2);
    }

    public static void glUniform3iv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glUniform3iv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
        android.opengl.GLES20.glUniform4f(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniform4fv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES20.glUniform4fv(arg0, arg1, arg2);
    }

    public static void glUniform4fv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES20.glUniform4fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniform4i(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES20.glUniform4i(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniform4iv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES20.glUniform4iv(arg0, arg1, arg2);
    }

    public static void glUniform4iv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES20.glUniform4iv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix2fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES20.glUniformMatrix2fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix2fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES20.glUniformMatrix2fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix3fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES20.glUniformMatrix3fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix3fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES20.glUniformMatrix3fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUniformMatrix4fv(int arg0, int arg1, boolean arg2, java.nio.FloatBuffer arg3) {
        android.opengl.GLES20.glUniformMatrix4fv(arg0, arg1, arg2, arg3);
    }

    public static void glUniformMatrix4fv(int arg0, int arg1, boolean arg2, float[] arg3, int arg4) {
        android.opengl.GLES20.glUniformMatrix4fv(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glUseProgram(int arg0) {
        android.opengl.GLES20.glUseProgram(arg0);
    }

    public static void glValidateProgram(int arg0) {
        android.opengl.GLES20.glValidateProgram(arg0);
    }

    public static void glVertexAttrib1f(int arg0, float arg1) {
        android.opengl.GLES20.glVertexAttrib1f(arg0, arg1);
    }

    public static void glVertexAttrib1fv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES20.glVertexAttrib1fv(arg0, arg1);
    }

    public static void glVertexAttrib1fv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES20.glVertexAttrib1fv(arg0, arg1, arg2);
    }

    public static void glVertexAttrib2f(int arg0, float arg1, float arg2) {
        android.opengl.GLES20.glVertexAttrib2f(arg0, arg1, arg2);
    }

    public static void glVertexAttrib2fv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES20.glVertexAttrib2fv(arg0, arg1);
    }

    public static void glVertexAttrib2fv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES20.glVertexAttrib2fv(arg0, arg1, arg2);
    }

    public static void glVertexAttrib3f(int arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES20.glVertexAttrib3f(arg0, arg1, arg2, arg3);
    }

    public static void glVertexAttrib3fv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES20.glVertexAttrib3fv(arg0, arg1);
    }

    public static void glVertexAttrib3fv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES20.glVertexAttrib3fv(arg0, arg1, arg2);
    }

    public static void glVertexAttrib4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
        android.opengl.GLES20.glVertexAttrib4f(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glVertexAttrib4fv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES20.glVertexAttrib4fv(arg0, arg1);
    }

    public static void glVertexAttrib4fv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES20.glVertexAttrib4fv(arg0, arg1, arg2);
    }

    public static void glVertexAttribPointer(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        android.opengl.GLES20.glVertexAttribPointer(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glVertexAttribPointer(int arg0, int arg1, int arg2, boolean arg3, int arg4, java.nio.Buffer arg5) {
        android.opengl.GLES20.glVertexAttribPointer(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glViewport(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES20.glViewport(arg0, arg1, arg2, arg3);
    }

    public static final int GL_ACTIVE_ATTRIBUTES = android.opengl.GLES20.GL_ACTIVE_ATTRIBUTES;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = android.opengl.GLES20.GL_ACTIVE_ATTRIBUTE_MAX_LENGTH;
    public static final int GL_ACTIVE_TEXTURE = android.opengl.GLES20.GL_ACTIVE_TEXTURE;
    public static final int GL_ACTIVE_UNIFORMS = android.opengl.GLES20.GL_ACTIVE_UNIFORMS;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = android.opengl.GLES20.GL_ACTIVE_UNIFORM_MAX_LENGTH;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = android.opengl.GLES20.GL_ALIASED_LINE_WIDTH_RANGE;
    public static final int GL_ALIASED_POINT_SIZE_RANGE = android.opengl.GLES20.GL_ALIASED_POINT_SIZE_RANGE;
    public static final int GL_ALPHA = android.opengl.GLES20.GL_ALPHA;
    public static final int GL_ALPHA_BITS = android.opengl.GLES20.GL_ALPHA_BITS;
    public static final int GL_ALWAYS = android.opengl.GLES20.GL_ALWAYS;
    public static final int GL_ARRAY_BUFFER = android.opengl.GLES20.GL_ARRAY_BUFFER;
    public static final int GL_ARRAY_BUFFER_BINDING = android.opengl.GLES20.GL_ARRAY_BUFFER_BINDING;
    public static final int GL_ATTACHED_SHADERS = android.opengl.GLES20.GL_ATTACHED_SHADERS;
    public static final int GL_BACK = android.opengl.GLES20.GL_BACK;
    public static final int GL_BLEND = android.opengl.GLES20.GL_BLEND;
    public static final int GL_BLEND_COLOR = android.opengl.GLES20.GL_BLEND_COLOR;
    public static final int GL_BLEND_DST_ALPHA = android.opengl.GLES20.GL_BLEND_DST_ALPHA;
    public static final int GL_BLEND_DST_RGB = android.opengl.GLES20.GL_BLEND_DST_RGB;
    public static final int GL_BLEND_EQUATION = android.opengl.GLES20.GL_BLEND_EQUATION;
    public static final int GL_BLEND_EQUATION_ALPHA = android.opengl.GLES20.GL_BLEND_EQUATION_ALPHA;
    public static final int GL_BLEND_EQUATION_RGB = android.opengl.GLES20.GL_BLEND_EQUATION_RGB;
    public static final int GL_BLEND_SRC_ALPHA = android.opengl.GLES20.GL_BLEND_SRC_ALPHA;
    public static final int GL_BLEND_SRC_RGB = android.opengl.GLES20.GL_BLEND_SRC_RGB;
    public static final int GL_BLUE_BITS = android.opengl.GLES20.GL_BLUE_BITS;
    public static final int GL_BOOL = android.opengl.GLES20.GL_BOOL;
    public static final int GL_BOOL_VEC2 = android.opengl.GLES20.GL_BOOL_VEC2;
    public static final int GL_BOOL_VEC3 = android.opengl.GLES20.GL_BOOL_VEC3;
    public static final int GL_BOOL_VEC4 = android.opengl.GLES20.GL_BOOL_VEC4;
    public static final int GL_BUFFER_SIZE = android.opengl.GLES20.GL_BUFFER_SIZE;
    public static final int GL_BUFFER_USAGE = android.opengl.GLES20.GL_BUFFER_USAGE;
    public static final int GL_BYTE = android.opengl.GLES20.GL_BYTE;
    public static final int GL_CCW = android.opengl.GLES20.GL_CCW;
    public static final int GL_CLAMP_TO_EDGE = android.opengl.GLES20.GL_CLAMP_TO_EDGE;
    public static final int GL_COLOR_ATTACHMENT0 = android.opengl.GLES20.GL_COLOR_ATTACHMENT0;
    public static final int GL_COLOR_BUFFER_BIT = android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
    public static final int GL_COLOR_CLEAR_VALUE = android.opengl.GLES20.GL_COLOR_CLEAR_VALUE;
    public static final int GL_COLOR_WRITEMASK = android.opengl.GLES20.GL_COLOR_WRITEMASK;
    public static final int GL_COMPILE_STATUS = android.opengl.GLES20.GL_COMPILE_STATUS;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = android.opengl.GLES20.GL_COMPRESSED_TEXTURE_FORMATS;
    public static final int GL_CONSTANT_ALPHA = android.opengl.GLES20.GL_CONSTANT_ALPHA;
    public static final int GL_CONSTANT_COLOR = android.opengl.GLES20.GL_CONSTANT_COLOR;
    public static final int GL_CULL_FACE = android.opengl.GLES20.GL_CULL_FACE;
    public static final int GL_CULL_FACE_MODE = android.opengl.GLES20.GL_CULL_FACE_MODE;
    public static final int GL_CURRENT_PROGRAM = android.opengl.GLES20.GL_CURRENT_PROGRAM;
    public static final int GL_CURRENT_VERTEX_ATTRIB = android.opengl.GLES20.GL_CURRENT_VERTEX_ATTRIB;
    public static final int GL_CW = android.opengl.GLES20.GL_CW;
    public static final int GL_DECR = android.opengl.GLES20.GL_DECR;
    public static final int GL_DECR_WRAP = android.opengl.GLES20.GL_DECR_WRAP;
    public static final int GL_DELETE_STATUS = android.opengl.GLES20.GL_DELETE_STATUS;
    public static final int GL_DEPTH_ATTACHMENT = android.opengl.GLES20.GL_DEPTH_ATTACHMENT;
    public static final int GL_DEPTH_BITS = android.opengl.GLES20.GL_DEPTH_BITS;
    public static final int GL_DEPTH_BUFFER_BIT = android.opengl.GLES20.GL_DEPTH_BUFFER_BIT;
    public static final int GL_DEPTH_CLEAR_VALUE = android.opengl.GLES20.GL_DEPTH_CLEAR_VALUE;
    public static final int GL_DEPTH_COMPONENT = android.opengl.GLES20.GL_DEPTH_COMPONENT;
    public static final int GL_DEPTH_COMPONENT16 = android.opengl.GLES20.GL_DEPTH_COMPONENT16;
    public static final int GL_DEPTH_FUNC = android.opengl.GLES20.GL_DEPTH_FUNC;
    public static final int GL_DEPTH_RANGE = android.opengl.GLES20.GL_DEPTH_RANGE;
    public static final int GL_DEPTH_TEST = android.opengl.GLES20.GL_DEPTH_TEST;
    public static final int GL_DEPTH_WRITEMASK = android.opengl.GLES20.GL_DEPTH_WRITEMASK;
    public static final int GL_DITHER = android.opengl.GLES20.GL_DITHER;
    public static final int GL_DONT_CARE = android.opengl.GLES20.GL_DONT_CARE;
    public static final int GL_DST_ALPHA = android.opengl.GLES20.GL_DST_ALPHA;
    public static final int GL_DST_COLOR = android.opengl.GLES20.GL_DST_COLOR;
    public static final int GL_DYNAMIC_DRAW = android.opengl.GLES20.GL_DYNAMIC_DRAW;
    public static final int GL_ELEMENT_ARRAY_BUFFER = android.opengl.GLES20.GL_ELEMENT_ARRAY_BUFFER;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = android.opengl.GLES20.GL_ELEMENT_ARRAY_BUFFER_BINDING;
    public static final int GL_EQUAL = android.opengl.GLES20.GL_EQUAL;
    public static final int GL_EXTENSIONS = android.opengl.GLES20.GL_EXTENSIONS;
    public static final int GL_FALSE = android.opengl.GLES20.GL_FALSE;
    public static final int GL_FASTEST = android.opengl.GLES20.GL_FASTEST;
    public static final int GL_FIXED = android.opengl.GLES20.GL_FIXED;
    public static final int GL_FLOAT = android.opengl.GLES20.GL_FLOAT;
    public static final int GL_FLOAT_MAT2 = android.opengl.GLES20.GL_FLOAT_MAT2;
    public static final int GL_FLOAT_MAT3 = android.opengl.GLES20.GL_FLOAT_MAT3;
    public static final int GL_FLOAT_MAT4 = android.opengl.GLES20.GL_FLOAT_MAT4;
    public static final int GL_FLOAT_VEC2 = android.opengl.GLES20.GL_FLOAT_VEC2;
    public static final int GL_FLOAT_VEC3 = android.opengl.GLES20.GL_FLOAT_VEC3;
    public static final int GL_FLOAT_VEC4 = android.opengl.GLES20.GL_FLOAT_VEC4;
    public static final int GL_FRAGMENT_SHADER = android.opengl.GLES20.GL_FRAGMENT_SHADER;
    public static final int GL_FRAMEBUFFER = android.opengl.GLES20.GL_FRAMEBUFFER;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = android.opengl.GLES20.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = android.opengl.GLES20.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = android.opengl.GLES20.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = android.opengl.GLES20.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL;
    public static final int GL_FRAMEBUFFER_BINDING = android.opengl.GLES20.GL_FRAMEBUFFER_BINDING;
    public static final int GL_FRAMEBUFFER_COMPLETE = android.opengl.GLES20.GL_FRAMEBUFFER_COMPLETE;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = android.opengl.GLES20.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = android.opengl.GLES20.GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = android.opengl.GLES20.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = android.opengl.GLES20.GL_FRAMEBUFFER_UNSUPPORTED;
    public static final int GL_FRONT = android.opengl.GLES20.GL_FRONT;
    public static final int GL_FRONT_AND_BACK = android.opengl.GLES20.GL_FRONT_AND_BACK;
    public static final int GL_FRONT_FACE = android.opengl.GLES20.GL_FRONT_FACE;
    public static final int GL_FUNC_ADD = android.opengl.GLES20.GL_FUNC_ADD;
    public static final int GL_FUNC_REVERSE_SUBTRACT = android.opengl.GLES20.GL_FUNC_REVERSE_SUBTRACT;
    public static final int GL_FUNC_SUBTRACT = android.opengl.GLES20.GL_FUNC_SUBTRACT;
    public static final int GL_GENERATE_MIPMAP_HINT = android.opengl.GLES20.GL_GENERATE_MIPMAP_HINT;
    public static final int GL_GEQUAL = android.opengl.GLES20.GL_GEQUAL;
    public static final int GL_GREATER = android.opengl.GLES20.GL_GREATER;
    public static final int GL_GREEN_BITS = android.opengl.GLES20.GL_GREEN_BITS;
    public static final int GL_HIGH_FLOAT = android.opengl.GLES20.GL_HIGH_FLOAT;
    public static final int GL_HIGH_INT = android.opengl.GLES20.GL_HIGH_INT;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = android.opengl.GLES20.GL_IMPLEMENTATION_COLOR_READ_FORMAT;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = android.opengl.GLES20.GL_IMPLEMENTATION_COLOR_READ_TYPE;
    public static final int GL_INCR = android.opengl.GLES20.GL_INCR;
    public static final int GL_INCR_WRAP = android.opengl.GLES20.GL_INCR_WRAP;
    public static final int GL_INFO_LOG_LENGTH = android.opengl.GLES20.GL_INFO_LOG_LENGTH;
    public static final int GL_INT = android.opengl.GLES20.GL_INT;
    public static final int GL_INT_VEC2 = android.opengl.GLES20.GL_INT_VEC2;
    public static final int GL_INT_VEC3 = android.opengl.GLES20.GL_INT_VEC3;
    public static final int GL_INT_VEC4 = android.opengl.GLES20.GL_INT_VEC4;
    public static final int GL_INVALID_ENUM = android.opengl.GLES20.GL_INVALID_ENUM;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = android.opengl.GLES20.GL_INVALID_FRAMEBUFFER_OPERATION;
    public static final int GL_INVALID_OPERATION = android.opengl.GLES20.GL_INVALID_OPERATION;
    public static final int GL_INVALID_VALUE = android.opengl.GLES20.GL_INVALID_VALUE;
    public static final int GL_INVERT = android.opengl.GLES20.GL_INVERT;
    public static final int GL_KEEP = android.opengl.GLES20.GL_KEEP;
    public static final int GL_LEQUAL = android.opengl.GLES20.GL_LEQUAL;
    public static final int GL_LESS = android.opengl.GLES20.GL_LESS;
    public static final int GL_LINEAR = android.opengl.GLES20.GL_LINEAR;
    public static final int GL_LINEAR_MIPMAP_LINEAR = android.opengl.GLES20.GL_LINEAR_MIPMAP_LINEAR;
    public static final int GL_LINEAR_MIPMAP_NEAREST = android.opengl.GLES20.GL_LINEAR_MIPMAP_NEAREST;
    public static final int GL_LINES = android.opengl.GLES20.GL_LINES;
    public static final int GL_LINE_LOOP = android.opengl.GLES20.GL_LINE_LOOP;
    public static final int GL_LINE_STRIP = android.opengl.GLES20.GL_LINE_STRIP;
    public static final int GL_LINE_WIDTH = android.opengl.GLES20.GL_LINE_WIDTH;
    public static final int GL_LINK_STATUS = android.opengl.GLES20.GL_LINK_STATUS;
    public static final int GL_LOW_FLOAT = android.opengl.GLES20.GL_LOW_FLOAT;
    public static final int GL_LOW_INT = android.opengl.GLES20.GL_LOW_INT;
    public static final int GL_LUMINANCE = android.opengl.GLES20.GL_LUMINANCE;
    public static final int GL_LUMINANCE_ALPHA = android.opengl.GLES20.GL_LUMINANCE_ALPHA;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = android.opengl.GLES20.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = android.opengl.GLES20.GL_MAX_CUBE_MAP_TEXTURE_SIZE;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = android.opengl.GLES20.GL_MAX_FRAGMENT_UNIFORM_VECTORS;
    public static final int GL_MAX_RENDERBUFFER_SIZE = android.opengl.GLES20.GL_MAX_RENDERBUFFER_SIZE;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = android.opengl.GLES20.GL_MAX_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_TEXTURE_SIZE = android.opengl.GLES20.GL_MAX_TEXTURE_SIZE;
    public static final int GL_MAX_VARYING_VECTORS = android.opengl.GLES20.GL_MAX_VARYING_VECTORS;
    public static final int GL_MAX_VERTEX_ATTRIBS = android.opengl.GLES20.GL_MAX_VERTEX_ATTRIBS;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = android.opengl.GLES20.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = android.opengl.GLES20.GL_MAX_VERTEX_UNIFORM_VECTORS;
    public static final int GL_MAX_VIEWPORT_DIMS = android.opengl.GLES20.GL_MAX_VIEWPORT_DIMS;
    public static final int GL_MEDIUM_FLOAT = android.opengl.GLES20.GL_MEDIUM_FLOAT;
    public static final int GL_MEDIUM_INT = android.opengl.GLES20.GL_MEDIUM_INT;
    public static final int GL_MIRRORED_REPEAT = android.opengl.GLES20.GL_MIRRORED_REPEAT;
    public static final int GL_NEAREST = android.opengl.GLES20.GL_NEAREST;
    public static final int GL_NEAREST_MIPMAP_LINEAR = android.opengl.GLES20.GL_NEAREST_MIPMAP_LINEAR;
    public static final int GL_NEAREST_MIPMAP_NEAREST = android.opengl.GLES20.GL_NEAREST_MIPMAP_NEAREST;
    public static final int GL_NEVER = android.opengl.GLES20.GL_NEVER;
    public static final int GL_NICEST = android.opengl.GLES20.GL_NICEST;
    public static final int GL_NONE = android.opengl.GLES20.GL_NONE;
    public static final int GL_NOTEQUAL = android.opengl.GLES20.GL_NOTEQUAL;
    public static final int GL_NO_ERROR = android.opengl.GLES20.GL_NO_ERROR;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = android.opengl.GLES20.GL_NUM_COMPRESSED_TEXTURE_FORMATS;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = android.opengl.GLES20.GL_NUM_SHADER_BINARY_FORMATS;
    public static final int GL_ONE = android.opengl.GLES20.GL_ONE;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = android.opengl.GLES20.GL_ONE_MINUS_CONSTANT_ALPHA;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = android.opengl.GLES20.GL_ONE_MINUS_CONSTANT_COLOR;
    public static final int GL_ONE_MINUS_DST_ALPHA = android.opengl.GLES20.GL_ONE_MINUS_DST_ALPHA;
    public static final int GL_ONE_MINUS_DST_COLOR = android.opengl.GLES20.GL_ONE_MINUS_DST_COLOR;
    public static final int GL_ONE_MINUS_SRC_ALPHA = android.opengl.GLES20.GL_ONE_MINUS_SRC_ALPHA;
    public static final int GL_ONE_MINUS_SRC_COLOR = android.opengl.GLES20.GL_ONE_MINUS_SRC_COLOR;
    public static final int GL_OUT_OF_MEMORY = android.opengl.GLES20.GL_OUT_OF_MEMORY;
    public static final int GL_PACK_ALIGNMENT = android.opengl.GLES20.GL_PACK_ALIGNMENT;
    public static final int GL_POINTS = android.opengl.GLES20.GL_POINTS;
    public static final int GL_POLYGON_OFFSET_FACTOR = android.opengl.GLES20.GL_POLYGON_OFFSET_FACTOR;
    public static final int GL_POLYGON_OFFSET_FILL = android.opengl.GLES20.GL_POLYGON_OFFSET_FILL;
    public static final int GL_POLYGON_OFFSET_UNITS = android.opengl.GLES20.GL_POLYGON_OFFSET_UNITS;
    public static final int GL_RED_BITS = android.opengl.GLES20.GL_RED_BITS;
    public static final int GL_RENDERBUFFER = android.opengl.GLES20.GL_RENDERBUFFER;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = android.opengl.GLES20.GL_RENDERBUFFER_ALPHA_SIZE;
    public static final int GL_RENDERBUFFER_BINDING = android.opengl.GLES20.GL_RENDERBUFFER_BINDING;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = android.opengl.GLES20.GL_RENDERBUFFER_BLUE_SIZE;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = android.opengl.GLES20.GL_RENDERBUFFER_DEPTH_SIZE;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = android.opengl.GLES20.GL_RENDERBUFFER_GREEN_SIZE;
    public static final int GL_RENDERBUFFER_HEIGHT = android.opengl.GLES20.GL_RENDERBUFFER_HEIGHT;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = android.opengl.GLES20.GL_RENDERBUFFER_INTERNAL_FORMAT;
    public static final int GL_RENDERBUFFER_RED_SIZE = android.opengl.GLES20.GL_RENDERBUFFER_RED_SIZE;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = android.opengl.GLES20.GL_RENDERBUFFER_STENCIL_SIZE;
    public static final int GL_RENDERBUFFER_WIDTH = android.opengl.GLES20.GL_RENDERBUFFER_WIDTH;
    public static final int GL_RENDERER = android.opengl.GLES20.GL_RENDERER;
    public static final int GL_REPEAT = android.opengl.GLES20.GL_REPEAT;
    public static final int GL_REPLACE = android.opengl.GLES20.GL_REPLACE;
    public static final int GL_RGB = android.opengl.GLES20.GL_RGB;
    public static final int GL_RGB565 = android.opengl.GLES20.GL_RGB565;
    public static final int GL_RGB5_A1 = android.opengl.GLES20.GL_RGB5_A1;
    public static final int GL_RGBA = android.opengl.GLES20.GL_RGBA;
    public static final int GL_RGBA4 = android.opengl.GLES20.GL_RGBA4;
    public static final int GL_SAMPLER_2D = android.opengl.GLES20.GL_SAMPLER_2D;
    public static final int GL_SAMPLER_CUBE = android.opengl.GLES20.GL_SAMPLER_CUBE;
    public static final int GL_SAMPLES = android.opengl.GLES20.GL_SAMPLES;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = android.opengl.GLES20.GL_SAMPLE_ALPHA_TO_COVERAGE;
    public static final int GL_SAMPLE_BUFFERS = android.opengl.GLES20.GL_SAMPLE_BUFFERS;
    public static final int GL_SAMPLE_COVERAGE = android.opengl.GLES20.GL_SAMPLE_COVERAGE;
    public static final int GL_SAMPLE_COVERAGE_INVERT = android.opengl.GLES20.GL_SAMPLE_COVERAGE_INVERT;
    public static final int GL_SAMPLE_COVERAGE_VALUE = android.opengl.GLES20.GL_SAMPLE_COVERAGE_VALUE;
    public static final int GL_SCISSOR_BOX = android.opengl.GLES20.GL_SCISSOR_BOX;
    public static final int GL_SCISSOR_TEST = android.opengl.GLES20.GL_SCISSOR_TEST;
    public static final int GL_SHADER_BINARY_FORMATS = android.opengl.GLES20.GL_SHADER_BINARY_FORMATS;
    public static final int GL_SHADER_COMPILER = android.opengl.GLES20.GL_SHADER_COMPILER;
    public static final int GL_SHADER_SOURCE_LENGTH = android.opengl.GLES20.GL_SHADER_SOURCE_LENGTH;
    public static final int GL_SHADER_TYPE = android.opengl.GLES20.GL_SHADER_TYPE;
    public static final int GL_SHADING_LANGUAGE_VERSION = android.opengl.GLES20.GL_SHADING_LANGUAGE_VERSION;
    public static final int GL_SHORT = android.opengl.GLES20.GL_SHORT;
    public static final int GL_SRC_ALPHA = android.opengl.GLES20.GL_SRC_ALPHA;
    public static final int GL_SRC_ALPHA_SATURATE = android.opengl.GLES20.GL_SRC_ALPHA_SATURATE;
    public static final int GL_SRC_COLOR = android.opengl.GLES20.GL_SRC_COLOR;
    public static final int GL_STATIC_DRAW = android.opengl.GLES20.GL_STATIC_DRAW;
    public static final int GL_STENCIL_ATTACHMENT = android.opengl.GLES20.GL_STENCIL_ATTACHMENT;
    public static final int GL_STENCIL_BACK_FAIL = android.opengl.GLES20.GL_STENCIL_BACK_FAIL;
    public static final int GL_STENCIL_BACK_FUNC = android.opengl.GLES20.GL_STENCIL_BACK_FUNC;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = android.opengl.GLES20.GL_STENCIL_BACK_PASS_DEPTH_FAIL;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = android.opengl.GLES20.GL_STENCIL_BACK_PASS_DEPTH_PASS;
    public static final int GL_STENCIL_BACK_REF = android.opengl.GLES20.GL_STENCIL_BACK_REF;
    public static final int GL_STENCIL_BACK_VALUE_MASK = android.opengl.GLES20.GL_STENCIL_BACK_VALUE_MASK;
    public static final int GL_STENCIL_BACK_WRITEMASK = android.opengl.GLES20.GL_STENCIL_BACK_WRITEMASK;
    public static final int GL_STENCIL_BITS = android.opengl.GLES20.GL_STENCIL_BITS;
    public static final int GL_STENCIL_BUFFER_BIT = android.opengl.GLES20.GL_STENCIL_BUFFER_BIT;
    public static final int GL_STENCIL_CLEAR_VALUE = android.opengl.GLES20.GL_STENCIL_CLEAR_VALUE;
    public static final int GL_STENCIL_FAIL = android.opengl.GLES20.GL_STENCIL_FAIL;
    public static final int GL_STENCIL_FUNC = android.opengl.GLES20.GL_STENCIL_FUNC;
    public static final int GL_STENCIL_INDEX = android.opengl.GLES20.GL_STENCIL_INDEX;
    public static final int GL_STENCIL_INDEX8 = android.opengl.GLES20.GL_STENCIL_INDEX8;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = android.opengl.GLES20.GL_STENCIL_PASS_DEPTH_FAIL;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = android.opengl.GLES20.GL_STENCIL_PASS_DEPTH_PASS;
    public static final int GL_STENCIL_REF = android.opengl.GLES20.GL_STENCIL_REF;
    public static final int GL_STENCIL_TEST = android.opengl.GLES20.GL_STENCIL_TEST;
    public static final int GL_STENCIL_VALUE_MASK = android.opengl.GLES20.GL_STENCIL_VALUE_MASK;
    public static final int GL_STENCIL_WRITEMASK = android.opengl.GLES20.GL_STENCIL_WRITEMASK;
    public static final int GL_STREAM_DRAW = android.opengl.GLES20.GL_STREAM_DRAW;
    public static final int GL_SUBPIXEL_BITS = android.opengl.GLES20.GL_SUBPIXEL_BITS;
    public static final int GL_TEXTURE = android.opengl.GLES20.GL_TEXTURE;
    public static final int GL_TEXTURE0 = android.opengl.GLES20.GL_TEXTURE0;
    public static final int GL_TEXTURE1 = android.opengl.GLES20.GL_TEXTURE1;
    public static final int GL_TEXTURE10 = android.opengl.GLES20.GL_TEXTURE10;
    public static final int GL_TEXTURE11 = android.opengl.GLES20.GL_TEXTURE11;
    public static final int GL_TEXTURE12 = android.opengl.GLES20.GL_TEXTURE12;
    public static final int GL_TEXTURE13 = android.opengl.GLES20.GL_TEXTURE13;
    public static final int GL_TEXTURE14 = android.opengl.GLES20.GL_TEXTURE14;
    public static final int GL_TEXTURE15 = android.opengl.GLES20.GL_TEXTURE15;
    public static final int GL_TEXTURE16 = android.opengl.GLES20.GL_TEXTURE16;
    public static final int GL_TEXTURE17 = android.opengl.GLES20.GL_TEXTURE17;
    public static final int GL_TEXTURE18 = android.opengl.GLES20.GL_TEXTURE18;
    public static final int GL_TEXTURE19 = android.opengl.GLES20.GL_TEXTURE19;
    public static final int GL_TEXTURE2 = android.opengl.GLES20.GL_TEXTURE2;
    public static final int GL_TEXTURE20 = android.opengl.GLES20.GL_TEXTURE20;
    public static final int GL_TEXTURE21 = android.opengl.GLES20.GL_TEXTURE21;
    public static final int GL_TEXTURE22 = android.opengl.GLES20.GL_TEXTURE22;
    public static final int GL_TEXTURE23 = android.opengl.GLES20.GL_TEXTURE23;
    public static final int GL_TEXTURE24 = android.opengl.GLES20.GL_TEXTURE24;
    public static final int GL_TEXTURE25 = android.opengl.GLES20.GL_TEXTURE25;
    public static final int GL_TEXTURE26 = android.opengl.GLES20.GL_TEXTURE26;
    public static final int GL_TEXTURE27 = android.opengl.GLES20.GL_TEXTURE27;
    public static final int GL_TEXTURE28 = android.opengl.GLES20.GL_TEXTURE28;
    public static final int GL_TEXTURE29 = android.opengl.GLES20.GL_TEXTURE29;
    public static final int GL_TEXTURE3 = android.opengl.GLES20.GL_TEXTURE3;
    public static final int GL_TEXTURE30 = android.opengl.GLES20.GL_TEXTURE30;
    public static final int GL_TEXTURE31 = android.opengl.GLES20.GL_TEXTURE31;
    public static final int GL_TEXTURE4 = android.opengl.GLES20.GL_TEXTURE4;
    public static final int GL_TEXTURE5 = android.opengl.GLES20.GL_TEXTURE5;
    public static final int GL_TEXTURE6 = android.opengl.GLES20.GL_TEXTURE6;
    public static final int GL_TEXTURE7 = android.opengl.GLES20.GL_TEXTURE7;
    public static final int GL_TEXTURE8 = android.opengl.GLES20.GL_TEXTURE8;
    public static final int GL_TEXTURE9 = android.opengl.GLES20.GL_TEXTURE9;
    public static final int GL_TEXTURE_2D = android.opengl.GLES20.GL_TEXTURE_2D;
    public static final int GL_TEXTURE_BINDING_2D = android.opengl.GLES20.GL_TEXTURE_BINDING_2D;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = android.opengl.GLES20.GL_TEXTURE_BINDING_CUBE_MAP;
    public static final int GL_TEXTURE_CUBE_MAP = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = android.opengl.GLES20.GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
    public static final int GL_TEXTURE_MAG_FILTER = android.opengl.GLES20.GL_TEXTURE_MAG_FILTER;
    public static final int GL_TEXTURE_MIN_FILTER = android.opengl.GLES20.GL_TEXTURE_MIN_FILTER;
    public static final int GL_TEXTURE_WRAP_S = android.opengl.GLES20.GL_TEXTURE_WRAP_S;
    public static final int GL_TEXTURE_WRAP_T = android.opengl.GLES20.GL_TEXTURE_WRAP_T;
    public static final int GL_TRIANGLES = android.opengl.GLES20.GL_TRIANGLES;
    public static final int GL_TRIANGLE_FAN = android.opengl.GLES20.GL_TRIANGLE_FAN;
    public static final int GL_TRIANGLE_STRIP = android.opengl.GLES20.GL_TRIANGLE_STRIP;
    public static final int GL_TRUE = android.opengl.GLES20.GL_TRUE;
    public static final int GL_UNPACK_ALIGNMENT = android.opengl.GLES20.GL_UNPACK_ALIGNMENT;
    public static final int GL_UNSIGNED_BYTE = android.opengl.GLES20.GL_UNSIGNED_BYTE;
    public static final int GL_UNSIGNED_INT = android.opengl.GLES20.GL_UNSIGNED_INT;
    public static final int GL_UNSIGNED_SHORT = android.opengl.GLES20.GL_UNSIGNED_SHORT;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = android.opengl.GLES20.GL_UNSIGNED_SHORT_4_4_4_4;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = android.opengl.GLES20.GL_UNSIGNED_SHORT_5_5_5_1;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = android.opengl.GLES20.GL_UNSIGNED_SHORT_5_6_5;
    public static final int GL_VALIDATE_STATUS = android.opengl.GLES20.GL_VALIDATE_STATUS;
    public static final int GL_VENDOR = android.opengl.GLES20.GL_VENDOR;
    public static final int GL_VERSION = android.opengl.GLES20.GL_VERSION;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_ENABLED;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_NORMALIZED;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_POINTER;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_SIZE;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_STRIDE;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = android.opengl.GLES20.GL_VERTEX_ATTRIB_ARRAY_TYPE;
    public static final int GL_VERTEX_SHADER = android.opengl.GLES20.GL_VERTEX_SHADER;
    public static final int GL_VIEWPORT = android.opengl.GLES20.GL_VIEWPORT;
    public static final int GL_ZERO = android.opengl.GLES20.GL_ZERO;

}
