// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES10 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLES10(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES10 wrap(android.opengl.GLES10 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES10(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLES10 getReal() {
        return (android.opengl.GLES10) real;
    }

    public android.opengl.GLES10 unwrap() {
        return getReal();
    }

    public GLES10() {
        this(new android.opengl.GLES10(), (__DcgwBridgeToken) null);
    }

    public static void glActiveTexture(int arg0) {
        android.opengl.GLES10.glActiveTexture(arg0);
    }

    public static void glAlphaFunc(int arg0, float arg1) {
        android.opengl.GLES10.glAlphaFunc(arg0, arg1);
    }

    public static void glAlphaFuncx(int arg0, int arg1) {
        android.opengl.GLES10.glAlphaFuncx(arg0, arg1);
    }

    public static void glBindTexture(int arg0, int arg1) {
        android.opengl.GLES10.glBindTexture(arg0, arg1);
    }

    public static void glBlendFunc(int arg0, int arg1) {
        android.opengl.GLES10.glBlendFunc(arg0, arg1);
    }

    public static void glClear(int arg0) {
        android.opengl.GLES10.glClear(arg0);
    }

    public static void glClearColor(float arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES10.glClearColor(arg0, arg1, arg2, arg3);
    }

    public static void glClearColorx(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES10.glClearColorx(arg0, arg1, arg2, arg3);
    }

    public static void glClearDepthf(float arg0) {
        android.opengl.GLES10.glClearDepthf(arg0);
    }

    public static void glClearDepthx(int arg0) {
        android.opengl.GLES10.glClearDepthx(arg0);
    }

    public static void glClearStencil(int arg0) {
        android.opengl.GLES10.glClearStencil(arg0);
    }

    public static void glClientActiveTexture(int arg0) {
        android.opengl.GLES10.glClientActiveTexture(arg0);
    }

    public static void glColor4f(float arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES10.glColor4f(arg0, arg1, arg2, arg3);
    }

    public static void glColor4x(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES10.glColor4x(arg0, arg1, arg2, arg3);
    }

    public static void glColorMask(boolean arg0, boolean arg1, boolean arg2, boolean arg3) {
        android.opengl.GLES10.glColorMask(arg0, arg1, arg2, arg3);
    }

    public static void glColorPointer(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES10.glColorPointer(arg0, arg1, arg2, arg3);
    }

    public static void glCompressedTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.nio.Buffer arg7) {
        android.opengl.GLES10.glCompressedTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glCompressedTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES10.glCompressedTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glCopyTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        android.opengl.GLES10.glCopyTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glCopyTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        android.opengl.GLES10.glCopyTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void glCullFace(int arg0) {
        android.opengl.GLES10.glCullFace(arg0);
    }

    public static void glDeleteTextures(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES10.glDeleteTextures(arg0, arg1);
    }

    public static void glDeleteTextures(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES10.glDeleteTextures(arg0, arg1, arg2);
    }

    public static void glDepthFunc(int arg0) {
        android.opengl.GLES10.glDepthFunc(arg0);
    }

    public static void glDepthMask(boolean arg0) {
        android.opengl.GLES10.glDepthMask(arg0);
    }

    public static void glDepthRangef(float arg0, float arg1) {
        android.opengl.GLES10.glDepthRangef(arg0, arg1);
    }

    public static void glDepthRangex(int arg0, int arg1) {
        android.opengl.GLES10.glDepthRangex(arg0, arg1);
    }

    public static void glDisable(int arg0) {
        android.opengl.GLES10.glDisable(arg0);
    }

    public static void glDisableClientState(int arg0) {
        android.opengl.GLES10.glDisableClientState(arg0);
    }

    public static void glDrawArrays(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glDrawArrays(arg0, arg1, arg2);
    }

    public static void glDrawElements(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES10.glDrawElements(arg0, arg1, arg2, arg3);
    }

    public static void glEnable(int arg0) {
        android.opengl.GLES10.glEnable(arg0);
    }

    public static void glEnableClientState(int arg0) {
        android.opengl.GLES10.glEnableClientState(arg0);
    }

    public static void glFinish() {
        android.opengl.GLES10.glFinish();
    }

    public static void glFlush() {
        android.opengl.GLES10.glFlush();
    }

    public static void glFogf(int arg0, float arg1) {
        android.opengl.GLES10.glFogf(arg0, arg1);
    }

    public static void glFogfv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES10.glFogfv(arg0, arg1);
    }

    public static void glFogfv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES10.glFogfv(arg0, arg1, arg2);
    }

    public static void glFogx(int arg0, int arg1) {
        android.opengl.GLES10.glFogx(arg0, arg1);
    }

    public static void glFogxv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES10.glFogxv(arg0, arg1);
    }

    public static void glFogxv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES10.glFogxv(arg0, arg1, arg2);
    }

    public static void glFrontFace(int arg0) {
        android.opengl.GLES10.glFrontFace(arg0);
    }

    public static void glFrustumf(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        android.opengl.GLES10.glFrustumf(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glFrustumx(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES10.glFrustumx(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glGenTextures(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES10.glGenTextures(arg0, arg1);
    }

    public static void glGenTextures(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES10.glGenTextures(arg0, arg1, arg2);
    }

    public static int glGetError() {
        return android.opengl.GLES10.glGetError();
    }

    public static void glGetIntegerv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES10.glGetIntegerv(arg0, arg1);
    }

    public static void glGetIntegerv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES10.glGetIntegerv(arg0, arg1, arg2);
    }

    public static java.lang.String glGetString(int arg0) {
        return android.opengl.GLES10.glGetString(arg0);
    }

    public static void glHint(int arg0, int arg1) {
        android.opengl.GLES10.glHint(arg0, arg1);
    }

    public static void glLightModelf(int arg0, float arg1) {
        android.opengl.GLES10.glLightModelf(arg0, arg1);
    }

    public static void glLightModelfv(int arg0, java.nio.FloatBuffer arg1) {
        android.opengl.GLES10.glLightModelfv(arg0, arg1);
    }

    public static void glLightModelfv(int arg0, float[] arg1, int arg2) {
        android.opengl.GLES10.glLightModelfv(arg0, arg1, arg2);
    }

    public static void glLightModelx(int arg0, int arg1) {
        android.opengl.GLES10.glLightModelx(arg0, arg1);
    }

    public static void glLightModelxv(int arg0, java.nio.IntBuffer arg1) {
        android.opengl.GLES10.glLightModelxv(arg0, arg1);
    }

    public static void glLightModelxv(int arg0, int[] arg1, int arg2) {
        android.opengl.GLES10.glLightModelxv(arg0, arg1, arg2);
    }

    public static void glLightf(int arg0, int arg1, float arg2) {
        android.opengl.GLES10.glLightf(arg0, arg1, arg2);
    }

    public static void glLightfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES10.glLightfv(arg0, arg1, arg2);
    }

    public static void glLightfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES10.glLightfv(arg0, arg1, arg2, arg3);
    }

    public static void glLightx(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glLightx(arg0, arg1, arg2);
    }

    public static void glLightxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES10.glLightxv(arg0, arg1, arg2);
    }

    public static void glLightxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES10.glLightxv(arg0, arg1, arg2, arg3);
    }

    public static void glLineWidth(float arg0) {
        android.opengl.GLES10.glLineWidth(arg0);
    }

    public static void glLineWidthx(int arg0) {
        android.opengl.GLES10.glLineWidthx(arg0);
    }

    public static void glLoadIdentity() {
        android.opengl.GLES10.glLoadIdentity();
    }

    public static void glLoadMatrixf(java.nio.FloatBuffer arg0) {
        android.opengl.GLES10.glLoadMatrixf(arg0);
    }

    public static void glLoadMatrixf(float[] arg0, int arg1) {
        android.opengl.GLES10.glLoadMatrixf(arg0, arg1);
    }

    public static void glLoadMatrixx(java.nio.IntBuffer arg0) {
        android.opengl.GLES10.glLoadMatrixx(arg0);
    }

    public static void glLoadMatrixx(int[] arg0, int arg1) {
        android.opengl.GLES10.glLoadMatrixx(arg0, arg1);
    }

    public static void glLogicOp(int arg0) {
        android.opengl.GLES10.glLogicOp(arg0);
    }

    public static void glMaterialf(int arg0, int arg1, float arg2) {
        android.opengl.GLES10.glMaterialf(arg0, arg1, arg2);
    }

    public static void glMaterialfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES10.glMaterialfv(arg0, arg1, arg2);
    }

    public static void glMaterialfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES10.glMaterialfv(arg0, arg1, arg2, arg3);
    }

    public static void glMaterialx(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glMaterialx(arg0, arg1, arg2);
    }

    public static void glMaterialxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES10.glMaterialxv(arg0, arg1, arg2);
    }

    public static void glMaterialxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES10.glMaterialxv(arg0, arg1, arg2, arg3);
    }

    public static void glMatrixMode(int arg0) {
        android.opengl.GLES10.glMatrixMode(arg0);
    }

    public static void glMultMatrixf(java.nio.FloatBuffer arg0) {
        android.opengl.GLES10.glMultMatrixf(arg0);
    }

    public static void glMultMatrixf(float[] arg0, int arg1) {
        android.opengl.GLES10.glMultMatrixf(arg0, arg1);
    }

    public static void glMultMatrixx(java.nio.IntBuffer arg0) {
        android.opengl.GLES10.glMultMatrixx(arg0);
    }

    public static void glMultMatrixx(int[] arg0, int arg1) {
        android.opengl.GLES10.glMultMatrixx(arg0, arg1);
    }

    public static void glMultiTexCoord4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
        android.opengl.GLES10.glMultiTexCoord4f(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glMultiTexCoord4x(int arg0, int arg1, int arg2, int arg3, int arg4) {
        android.opengl.GLES10.glMultiTexCoord4x(arg0, arg1, arg2, arg3, arg4);
    }

    public static void glNormal3f(float arg0, float arg1, float arg2) {
        android.opengl.GLES10.glNormal3f(arg0, arg1, arg2);
    }

    public static void glNormal3x(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glNormal3x(arg0, arg1, arg2);
    }

    public static void glNormalPointer(int arg0, int arg1, java.nio.Buffer arg2) {
        android.opengl.GLES10.glNormalPointer(arg0, arg1, arg2);
    }

    public static void glOrthof(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        android.opengl.GLES10.glOrthof(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glOrthox(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.GLES10.glOrthox(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void glPixelStorei(int arg0, int arg1) {
        android.opengl.GLES10.glPixelStorei(arg0, arg1);
    }

    public static void glPointSize(float arg0) {
        android.opengl.GLES10.glPointSize(arg0);
    }

    public static void glPointSizex(int arg0) {
        android.opengl.GLES10.glPointSizex(arg0);
    }

    public static void glPolygonOffset(float arg0, float arg1) {
        android.opengl.GLES10.glPolygonOffset(arg0, arg1);
    }

    public static void glPolygonOffsetx(int arg0, int arg1) {
        android.opengl.GLES10.glPolygonOffsetx(arg0, arg1);
    }

    public static void glPopMatrix() {
        android.opengl.GLES10.glPopMatrix();
    }

    public static void glPushMatrix() {
        android.opengl.GLES10.glPushMatrix();
    }

    public static void glReadPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, java.nio.Buffer arg6) {
        android.opengl.GLES10.glReadPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void glRotatef(float arg0, float arg1, float arg2, float arg3) {
        android.opengl.GLES10.glRotatef(arg0, arg1, arg2, arg3);
    }

    public static void glRotatex(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES10.glRotatex(arg0, arg1, arg2, arg3);
    }

    public static void glSampleCoverage(float arg0, boolean arg1) {
        android.opengl.GLES10.glSampleCoverage(arg0, arg1);
    }

    public static void glSampleCoveragex(int arg0, boolean arg1) {
        android.opengl.GLES10.glSampleCoveragex(arg0, arg1);
    }

    public static void glScalef(float arg0, float arg1, float arg2) {
        android.opengl.GLES10.glScalef(arg0, arg1, arg2);
    }

    public static void glScalex(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glScalex(arg0, arg1, arg2);
    }

    public static void glScissor(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES10.glScissor(arg0, arg1, arg2, arg3);
    }

    public static void glShadeModel(int arg0) {
        android.opengl.GLES10.glShadeModel(arg0);
    }

    public static void glStencilFunc(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glStencilFunc(arg0, arg1, arg2);
    }

    public static void glStencilMask(int arg0) {
        android.opengl.GLES10.glStencilMask(arg0);
    }

    public static void glStencilOp(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glStencilOp(arg0, arg1, arg2);
    }

    public static void glTexCoordPointer(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES10.glTexCoordPointer(arg0, arg1, arg2, arg3);
    }

    public static void glTexEnvf(int arg0, int arg1, float arg2) {
        android.opengl.GLES10.glTexEnvf(arg0, arg1, arg2);
    }

    public static void glTexEnvfv(int arg0, int arg1, java.nio.FloatBuffer arg2) {
        android.opengl.GLES10.glTexEnvfv(arg0, arg1, arg2);
    }

    public static void glTexEnvfv(int arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.GLES10.glTexEnvfv(arg0, arg1, arg2, arg3);
    }

    public static void glTexEnvx(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glTexEnvx(arg0, arg1, arg2);
    }

    public static void glTexEnvxv(int arg0, int arg1, java.nio.IntBuffer arg2) {
        android.opengl.GLES10.glTexEnvxv(arg0, arg1, arg2);
    }

    public static void glTexEnvxv(int arg0, int arg1, int[] arg2, int arg3) {
        android.opengl.GLES10.glTexEnvxv(arg0, arg1, arg2, arg3);
    }

    public static void glTexImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES10.glTexImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glTexParameterf(int arg0, int arg1, float arg2) {
        android.opengl.GLES10.glTexParameterf(arg0, arg1, arg2);
    }

    public static void glTexParameterx(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glTexParameterx(arg0, arg1, arg2);
    }

    public static void glTexSubImage2D(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, java.nio.Buffer arg8) {
        android.opengl.GLES10.glTexSubImage2D(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static void glTranslatef(float arg0, float arg1, float arg2) {
        android.opengl.GLES10.glTranslatef(arg0, arg1, arg2);
    }

    public static void glTranslatex(int arg0, int arg1, int arg2) {
        android.opengl.GLES10.glTranslatex(arg0, arg1, arg2);
    }

    public static void glVertexPointer(int arg0, int arg1, int arg2, java.nio.Buffer arg3) {
        android.opengl.GLES10.glVertexPointer(arg0, arg1, arg2, arg3);
    }

    public static void glViewport(int arg0, int arg1, int arg2, int arg3) {
        android.opengl.GLES10.glViewport(arg0, arg1, arg2, arg3);
    }

    public static final int GL_ADD = android.opengl.GLES10.GL_ADD;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = android.opengl.GLES10.GL_ALIASED_LINE_WIDTH_RANGE;
    public static final int GL_ALIASED_POINT_SIZE_RANGE = android.opengl.GLES10.GL_ALIASED_POINT_SIZE_RANGE;
    public static final int GL_ALPHA = android.opengl.GLES10.GL_ALPHA;
    public static final int GL_ALPHA_BITS = android.opengl.GLES10.GL_ALPHA_BITS;
    public static final int GL_ALPHA_TEST = android.opengl.GLES10.GL_ALPHA_TEST;
    public static final int GL_ALWAYS = android.opengl.GLES10.GL_ALWAYS;
    public static final int GL_AMBIENT = android.opengl.GLES10.GL_AMBIENT;
    public static final int GL_AMBIENT_AND_DIFFUSE = android.opengl.GLES10.GL_AMBIENT_AND_DIFFUSE;
    public static final int GL_AND = android.opengl.GLES10.GL_AND;
    public static final int GL_AND_INVERTED = android.opengl.GLES10.GL_AND_INVERTED;
    public static final int GL_AND_REVERSE = android.opengl.GLES10.GL_AND_REVERSE;
    public static final int GL_BACK = android.opengl.GLES10.GL_BACK;
    public static final int GL_BLEND = android.opengl.GLES10.GL_BLEND;
    public static final int GL_BLUE_BITS = android.opengl.GLES10.GL_BLUE_BITS;
    public static final int GL_BYTE = android.opengl.GLES10.GL_BYTE;
    public static final int GL_CCW = android.opengl.GLES10.GL_CCW;
    public static final int GL_CLAMP_TO_EDGE = android.opengl.GLES10.GL_CLAMP_TO_EDGE;
    public static final int GL_CLEAR = android.opengl.GLES10.GL_CLEAR;
    public static final int GL_COLOR_ARRAY = android.opengl.GLES10.GL_COLOR_ARRAY;
    public static final int GL_COLOR_BUFFER_BIT = android.opengl.GLES10.GL_COLOR_BUFFER_BIT;
    public static final int GL_COLOR_LOGIC_OP = android.opengl.GLES10.GL_COLOR_LOGIC_OP;
    public static final int GL_COLOR_MATERIAL = android.opengl.GLES10.GL_COLOR_MATERIAL;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = android.opengl.GLES10.GL_COMPRESSED_TEXTURE_FORMATS;
    public static final int GL_CONSTANT_ATTENUATION = android.opengl.GLES10.GL_CONSTANT_ATTENUATION;
    public static final int GL_COPY = android.opengl.GLES10.GL_COPY;
    public static final int GL_COPY_INVERTED = android.opengl.GLES10.GL_COPY_INVERTED;
    public static final int GL_CULL_FACE = android.opengl.GLES10.GL_CULL_FACE;
    public static final int GL_CW = android.opengl.GLES10.GL_CW;
    public static final int GL_DECAL = android.opengl.GLES10.GL_DECAL;
    public static final int GL_DECR = android.opengl.GLES10.GL_DECR;
    public static final int GL_DEPTH_BITS = android.opengl.GLES10.GL_DEPTH_BITS;
    public static final int GL_DEPTH_BUFFER_BIT = android.opengl.GLES10.GL_DEPTH_BUFFER_BIT;
    public static final int GL_DEPTH_TEST = android.opengl.GLES10.GL_DEPTH_TEST;
    public static final int GL_DIFFUSE = android.opengl.GLES10.GL_DIFFUSE;
    public static final int GL_DITHER = android.opengl.GLES10.GL_DITHER;
    public static final int GL_DONT_CARE = android.opengl.GLES10.GL_DONT_CARE;
    public static final int GL_DST_ALPHA = android.opengl.GLES10.GL_DST_ALPHA;
    public static final int GL_DST_COLOR = android.opengl.GLES10.GL_DST_COLOR;
    public static final int GL_EMISSION = android.opengl.GLES10.GL_EMISSION;
    public static final int GL_EQUAL = android.opengl.GLES10.GL_EQUAL;
    public static final int GL_EQUIV = android.opengl.GLES10.GL_EQUIV;
    public static final int GL_EXP = android.opengl.GLES10.GL_EXP;
    public static final int GL_EXP2 = android.opengl.GLES10.GL_EXP2;
    public static final int GL_EXTENSIONS = android.opengl.GLES10.GL_EXTENSIONS;
    public static final int GL_FALSE = android.opengl.GLES10.GL_FALSE;
    public static final int GL_FASTEST = android.opengl.GLES10.GL_FASTEST;
    public static final int GL_FIXED = android.opengl.GLES10.GL_FIXED;
    public static final int GL_FLAT = android.opengl.GLES10.GL_FLAT;
    public static final int GL_FLOAT = android.opengl.GLES10.GL_FLOAT;
    public static final int GL_FOG = android.opengl.GLES10.GL_FOG;
    public static final int GL_FOG_COLOR = android.opengl.GLES10.GL_FOG_COLOR;
    public static final int GL_FOG_DENSITY = android.opengl.GLES10.GL_FOG_DENSITY;
    public static final int GL_FOG_END = android.opengl.GLES10.GL_FOG_END;
    public static final int GL_FOG_HINT = android.opengl.GLES10.GL_FOG_HINT;
    public static final int GL_FOG_MODE = android.opengl.GLES10.GL_FOG_MODE;
    public static final int GL_FOG_START = android.opengl.GLES10.GL_FOG_START;
    public static final int GL_FRONT = android.opengl.GLES10.GL_FRONT;
    public static final int GL_FRONT_AND_BACK = android.opengl.GLES10.GL_FRONT_AND_BACK;
    public static final int GL_GEQUAL = android.opengl.GLES10.GL_GEQUAL;
    public static final int GL_GREATER = android.opengl.GLES10.GL_GREATER;
    public static final int GL_GREEN_BITS = android.opengl.GLES10.GL_GREEN_BITS;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES = android.opengl.GLES10.GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE_OES = android.opengl.GLES10.GL_IMPLEMENTATION_COLOR_READ_TYPE_OES;
    public static final int GL_INCR = android.opengl.GLES10.GL_INCR;
    public static final int GL_INVALID_ENUM = android.opengl.GLES10.GL_INVALID_ENUM;
    public static final int GL_INVALID_OPERATION = android.opengl.GLES10.GL_INVALID_OPERATION;
    public static final int GL_INVALID_VALUE = android.opengl.GLES10.GL_INVALID_VALUE;
    public static final int GL_INVERT = android.opengl.GLES10.GL_INVERT;
    public static final int GL_KEEP = android.opengl.GLES10.GL_KEEP;
    public static final int GL_LEQUAL = android.opengl.GLES10.GL_LEQUAL;
    public static final int GL_LESS = android.opengl.GLES10.GL_LESS;
    public static final int GL_LIGHT0 = android.opengl.GLES10.GL_LIGHT0;
    public static final int GL_LIGHT1 = android.opengl.GLES10.GL_LIGHT1;
    public static final int GL_LIGHT2 = android.opengl.GLES10.GL_LIGHT2;
    public static final int GL_LIGHT3 = android.opengl.GLES10.GL_LIGHT3;
    public static final int GL_LIGHT4 = android.opengl.GLES10.GL_LIGHT4;
    public static final int GL_LIGHT5 = android.opengl.GLES10.GL_LIGHT5;
    public static final int GL_LIGHT6 = android.opengl.GLES10.GL_LIGHT6;
    public static final int GL_LIGHT7 = android.opengl.GLES10.GL_LIGHT7;
    public static final int GL_LIGHTING = android.opengl.GLES10.GL_LIGHTING;
    public static final int GL_LIGHT_MODEL_AMBIENT = android.opengl.GLES10.GL_LIGHT_MODEL_AMBIENT;
    public static final int GL_LIGHT_MODEL_TWO_SIDE = android.opengl.GLES10.GL_LIGHT_MODEL_TWO_SIDE;
    public static final int GL_LINEAR = android.opengl.GLES10.GL_LINEAR;
    public static final int GL_LINEAR_ATTENUATION = android.opengl.GLES10.GL_LINEAR_ATTENUATION;
    public static final int GL_LINEAR_MIPMAP_LINEAR = android.opengl.GLES10.GL_LINEAR_MIPMAP_LINEAR;
    public static final int GL_LINEAR_MIPMAP_NEAREST = android.opengl.GLES10.GL_LINEAR_MIPMAP_NEAREST;
    public static final int GL_LINES = android.opengl.GLES10.GL_LINES;
    public static final int GL_LINE_LOOP = android.opengl.GLES10.GL_LINE_LOOP;
    public static final int GL_LINE_SMOOTH = android.opengl.GLES10.GL_LINE_SMOOTH;
    public static final int GL_LINE_SMOOTH_HINT = android.opengl.GLES10.GL_LINE_SMOOTH_HINT;
    public static final int GL_LINE_STRIP = android.opengl.GLES10.GL_LINE_STRIP;
    public static final int GL_LUMINANCE = android.opengl.GLES10.GL_LUMINANCE;
    public static final int GL_LUMINANCE_ALPHA = android.opengl.GLES10.GL_LUMINANCE_ALPHA;
    public static final int GL_MAX_ELEMENTS_INDICES = android.opengl.GLES10.GL_MAX_ELEMENTS_INDICES;
    public static final int GL_MAX_ELEMENTS_VERTICES = android.opengl.GLES10.GL_MAX_ELEMENTS_VERTICES;
    public static final int GL_MAX_LIGHTS = android.opengl.GLES10.GL_MAX_LIGHTS;
    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = android.opengl.GLES10.GL_MAX_MODELVIEW_STACK_DEPTH;
    public static final int GL_MAX_PROJECTION_STACK_DEPTH = android.opengl.GLES10.GL_MAX_PROJECTION_STACK_DEPTH;
    public static final int GL_MAX_TEXTURE_SIZE = android.opengl.GLES10.GL_MAX_TEXTURE_SIZE;
    public static final int GL_MAX_TEXTURE_STACK_DEPTH = android.opengl.GLES10.GL_MAX_TEXTURE_STACK_DEPTH;
    public static final int GL_MAX_TEXTURE_UNITS = android.opengl.GLES10.GL_MAX_TEXTURE_UNITS;
    public static final int GL_MAX_VIEWPORT_DIMS = android.opengl.GLES10.GL_MAX_VIEWPORT_DIMS;
    public static final int GL_MODELVIEW = android.opengl.GLES10.GL_MODELVIEW;
    public static final int GL_MODULATE = android.opengl.GLES10.GL_MODULATE;
    public static final int GL_MULTISAMPLE = android.opengl.GLES10.GL_MULTISAMPLE;
    public static final int GL_NAND = android.opengl.GLES10.GL_NAND;
    public static final int GL_NEAREST = android.opengl.GLES10.GL_NEAREST;
    public static final int GL_NEAREST_MIPMAP_LINEAR = android.opengl.GLES10.GL_NEAREST_MIPMAP_LINEAR;
    public static final int GL_NEAREST_MIPMAP_NEAREST = android.opengl.GLES10.GL_NEAREST_MIPMAP_NEAREST;
    public static final int GL_NEVER = android.opengl.GLES10.GL_NEVER;
    public static final int GL_NICEST = android.opengl.GLES10.GL_NICEST;
    public static final int GL_NOOP = android.opengl.GLES10.GL_NOOP;
    public static final int GL_NOR = android.opengl.GLES10.GL_NOR;
    public static final int GL_NORMALIZE = android.opengl.GLES10.GL_NORMALIZE;
    public static final int GL_NORMAL_ARRAY = android.opengl.GLES10.GL_NORMAL_ARRAY;
    public static final int GL_NOTEQUAL = android.opengl.GLES10.GL_NOTEQUAL;
    public static final int GL_NO_ERROR = android.opengl.GLES10.GL_NO_ERROR;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = android.opengl.GLES10.GL_NUM_COMPRESSED_TEXTURE_FORMATS;
    public static final int GL_ONE = android.opengl.GLES10.GL_ONE;
    public static final int GL_ONE_MINUS_DST_ALPHA = android.opengl.GLES10.GL_ONE_MINUS_DST_ALPHA;
    public static final int GL_ONE_MINUS_DST_COLOR = android.opengl.GLES10.GL_ONE_MINUS_DST_COLOR;
    public static final int GL_ONE_MINUS_SRC_ALPHA = android.opengl.GLES10.GL_ONE_MINUS_SRC_ALPHA;
    public static final int GL_ONE_MINUS_SRC_COLOR = android.opengl.GLES10.GL_ONE_MINUS_SRC_COLOR;
    public static final int GL_OR = android.opengl.GLES10.GL_OR;
    public static final int GL_OR_INVERTED = android.opengl.GLES10.GL_OR_INVERTED;
    public static final int GL_OR_REVERSE = android.opengl.GLES10.GL_OR_REVERSE;
    public static final int GL_OUT_OF_MEMORY = android.opengl.GLES10.GL_OUT_OF_MEMORY;
    public static final int GL_PACK_ALIGNMENT = android.opengl.GLES10.GL_PACK_ALIGNMENT;
    public static final int GL_PALETTE4_R5_G6_B5_OES = android.opengl.GLES10.GL_PALETTE4_R5_G6_B5_OES;
    public static final int GL_PALETTE4_RGB5_A1_OES = android.opengl.GLES10.GL_PALETTE4_RGB5_A1_OES;
    public static final int GL_PALETTE4_RGB8_OES = android.opengl.GLES10.GL_PALETTE4_RGB8_OES;
    public static final int GL_PALETTE4_RGBA4_OES = android.opengl.GLES10.GL_PALETTE4_RGBA4_OES;
    public static final int GL_PALETTE4_RGBA8_OES = android.opengl.GLES10.GL_PALETTE4_RGBA8_OES;
    public static final int GL_PALETTE8_R5_G6_B5_OES = android.opengl.GLES10.GL_PALETTE8_R5_G6_B5_OES;
    public static final int GL_PALETTE8_RGB5_A1_OES = android.opengl.GLES10.GL_PALETTE8_RGB5_A1_OES;
    public static final int GL_PALETTE8_RGB8_OES = android.opengl.GLES10.GL_PALETTE8_RGB8_OES;
    public static final int GL_PALETTE8_RGBA4_OES = android.opengl.GLES10.GL_PALETTE8_RGBA4_OES;
    public static final int GL_PALETTE8_RGBA8_OES = android.opengl.GLES10.GL_PALETTE8_RGBA8_OES;
    public static final int GL_PERSPECTIVE_CORRECTION_HINT = android.opengl.GLES10.GL_PERSPECTIVE_CORRECTION_HINT;
    public static final int GL_POINTS = android.opengl.GLES10.GL_POINTS;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = android.opengl.GLES10.GL_POINT_FADE_THRESHOLD_SIZE;
    public static final int GL_POINT_SIZE = android.opengl.GLES10.GL_POINT_SIZE;
    public static final int GL_POINT_SMOOTH = android.opengl.GLES10.GL_POINT_SMOOTH;
    public static final int GL_POINT_SMOOTH_HINT = android.opengl.GLES10.GL_POINT_SMOOTH_HINT;
    public static final int GL_POLYGON_OFFSET_FILL = android.opengl.GLES10.GL_POLYGON_OFFSET_FILL;
    public static final int GL_POLYGON_SMOOTH_HINT = android.opengl.GLES10.GL_POLYGON_SMOOTH_HINT;
    public static final int GL_POSITION = android.opengl.GLES10.GL_POSITION;
    public static final int GL_PROJECTION = android.opengl.GLES10.GL_PROJECTION;
    public static final int GL_QUADRATIC_ATTENUATION = android.opengl.GLES10.GL_QUADRATIC_ATTENUATION;
    public static final int GL_RED_BITS = android.opengl.GLES10.GL_RED_BITS;
    public static final int GL_RENDERER = android.opengl.GLES10.GL_RENDERER;
    public static final int GL_REPEAT = android.opengl.GLES10.GL_REPEAT;
    public static final int GL_REPLACE = android.opengl.GLES10.GL_REPLACE;
    public static final int GL_RESCALE_NORMAL = android.opengl.GLES10.GL_RESCALE_NORMAL;
    public static final int GL_RGB = android.opengl.GLES10.GL_RGB;
    public static final int GL_RGBA = android.opengl.GLES10.GL_RGBA;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = android.opengl.GLES10.GL_SAMPLE_ALPHA_TO_COVERAGE;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = android.opengl.GLES10.GL_SAMPLE_ALPHA_TO_ONE;
    public static final int GL_SAMPLE_COVERAGE = android.opengl.GLES10.GL_SAMPLE_COVERAGE;
    public static final int GL_SCISSOR_TEST = android.opengl.GLES10.GL_SCISSOR_TEST;
    public static final int GL_SET = android.opengl.GLES10.GL_SET;
    public static final int GL_SHININESS = android.opengl.GLES10.GL_SHININESS;
    public static final int GL_SHORT = android.opengl.GLES10.GL_SHORT;
    public static final int GL_SMOOTH = android.opengl.GLES10.GL_SMOOTH;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = android.opengl.GLES10.GL_SMOOTH_LINE_WIDTH_RANGE;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = android.opengl.GLES10.GL_SMOOTH_POINT_SIZE_RANGE;
    public static final int GL_SPECULAR = android.opengl.GLES10.GL_SPECULAR;
    public static final int GL_SPOT_CUTOFF = android.opengl.GLES10.GL_SPOT_CUTOFF;
    public static final int GL_SPOT_DIRECTION = android.opengl.GLES10.GL_SPOT_DIRECTION;
    public static final int GL_SPOT_EXPONENT = android.opengl.GLES10.GL_SPOT_EXPONENT;
    public static final int GL_SRC_ALPHA = android.opengl.GLES10.GL_SRC_ALPHA;
    public static final int GL_SRC_ALPHA_SATURATE = android.opengl.GLES10.GL_SRC_ALPHA_SATURATE;
    public static final int GL_SRC_COLOR = android.opengl.GLES10.GL_SRC_COLOR;
    public static final int GL_STACK_OVERFLOW = android.opengl.GLES10.GL_STACK_OVERFLOW;
    public static final int GL_STACK_UNDERFLOW = android.opengl.GLES10.GL_STACK_UNDERFLOW;
    public static final int GL_STENCIL_BITS = android.opengl.GLES10.GL_STENCIL_BITS;
    public static final int GL_STENCIL_BUFFER_BIT = android.opengl.GLES10.GL_STENCIL_BUFFER_BIT;
    public static final int GL_STENCIL_TEST = android.opengl.GLES10.GL_STENCIL_TEST;
    public static final int GL_SUBPIXEL_BITS = android.opengl.GLES10.GL_SUBPIXEL_BITS;
    public static final int GL_TEXTURE = android.opengl.GLES10.GL_TEXTURE;
    public static final int GL_TEXTURE0 = android.opengl.GLES10.GL_TEXTURE0;
    public static final int GL_TEXTURE1 = android.opengl.GLES10.GL_TEXTURE1;
    public static final int GL_TEXTURE10 = android.opengl.GLES10.GL_TEXTURE10;
    public static final int GL_TEXTURE11 = android.opengl.GLES10.GL_TEXTURE11;
    public static final int GL_TEXTURE12 = android.opengl.GLES10.GL_TEXTURE12;
    public static final int GL_TEXTURE13 = android.opengl.GLES10.GL_TEXTURE13;
    public static final int GL_TEXTURE14 = android.opengl.GLES10.GL_TEXTURE14;
    public static final int GL_TEXTURE15 = android.opengl.GLES10.GL_TEXTURE15;
    public static final int GL_TEXTURE16 = android.opengl.GLES10.GL_TEXTURE16;
    public static final int GL_TEXTURE17 = android.opengl.GLES10.GL_TEXTURE17;
    public static final int GL_TEXTURE18 = android.opengl.GLES10.GL_TEXTURE18;
    public static final int GL_TEXTURE19 = android.opengl.GLES10.GL_TEXTURE19;
    public static final int GL_TEXTURE2 = android.opengl.GLES10.GL_TEXTURE2;
    public static final int GL_TEXTURE20 = android.opengl.GLES10.GL_TEXTURE20;
    public static final int GL_TEXTURE21 = android.opengl.GLES10.GL_TEXTURE21;
    public static final int GL_TEXTURE22 = android.opengl.GLES10.GL_TEXTURE22;
    public static final int GL_TEXTURE23 = android.opengl.GLES10.GL_TEXTURE23;
    public static final int GL_TEXTURE24 = android.opengl.GLES10.GL_TEXTURE24;
    public static final int GL_TEXTURE25 = android.opengl.GLES10.GL_TEXTURE25;
    public static final int GL_TEXTURE26 = android.opengl.GLES10.GL_TEXTURE26;
    public static final int GL_TEXTURE27 = android.opengl.GLES10.GL_TEXTURE27;
    public static final int GL_TEXTURE28 = android.opengl.GLES10.GL_TEXTURE28;
    public static final int GL_TEXTURE29 = android.opengl.GLES10.GL_TEXTURE29;
    public static final int GL_TEXTURE3 = android.opengl.GLES10.GL_TEXTURE3;
    public static final int GL_TEXTURE30 = android.opengl.GLES10.GL_TEXTURE30;
    public static final int GL_TEXTURE31 = android.opengl.GLES10.GL_TEXTURE31;
    public static final int GL_TEXTURE4 = android.opengl.GLES10.GL_TEXTURE4;
    public static final int GL_TEXTURE5 = android.opengl.GLES10.GL_TEXTURE5;
    public static final int GL_TEXTURE6 = android.opengl.GLES10.GL_TEXTURE6;
    public static final int GL_TEXTURE7 = android.opengl.GLES10.GL_TEXTURE7;
    public static final int GL_TEXTURE8 = android.opengl.GLES10.GL_TEXTURE8;
    public static final int GL_TEXTURE9 = android.opengl.GLES10.GL_TEXTURE9;
    public static final int GL_TEXTURE_2D = android.opengl.GLES10.GL_TEXTURE_2D;
    public static final int GL_TEXTURE_COORD_ARRAY = android.opengl.GLES10.GL_TEXTURE_COORD_ARRAY;
    public static final int GL_TEXTURE_ENV = android.opengl.GLES10.GL_TEXTURE_ENV;
    public static final int GL_TEXTURE_ENV_COLOR = android.opengl.GLES10.GL_TEXTURE_ENV_COLOR;
    public static final int GL_TEXTURE_ENV_MODE = android.opengl.GLES10.GL_TEXTURE_ENV_MODE;
    public static final int GL_TEXTURE_MAG_FILTER = android.opengl.GLES10.GL_TEXTURE_MAG_FILTER;
    public static final int GL_TEXTURE_MIN_FILTER = android.opengl.GLES10.GL_TEXTURE_MIN_FILTER;
    public static final int GL_TEXTURE_WRAP_S = android.opengl.GLES10.GL_TEXTURE_WRAP_S;
    public static final int GL_TEXTURE_WRAP_T = android.opengl.GLES10.GL_TEXTURE_WRAP_T;
    public static final int GL_TRIANGLES = android.opengl.GLES10.GL_TRIANGLES;
    public static final int GL_TRIANGLE_FAN = android.opengl.GLES10.GL_TRIANGLE_FAN;
    public static final int GL_TRIANGLE_STRIP = android.opengl.GLES10.GL_TRIANGLE_STRIP;
    public static final int GL_TRUE = android.opengl.GLES10.GL_TRUE;
    public static final int GL_UNPACK_ALIGNMENT = android.opengl.GLES10.GL_UNPACK_ALIGNMENT;
    public static final int GL_UNSIGNED_BYTE = android.opengl.GLES10.GL_UNSIGNED_BYTE;
    public static final int GL_UNSIGNED_SHORT = android.opengl.GLES10.GL_UNSIGNED_SHORT;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = android.opengl.GLES10.GL_UNSIGNED_SHORT_4_4_4_4;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = android.opengl.GLES10.GL_UNSIGNED_SHORT_5_5_5_1;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = android.opengl.GLES10.GL_UNSIGNED_SHORT_5_6_5;
    public static final int GL_VENDOR = android.opengl.GLES10.GL_VENDOR;
    public static final int GL_VERSION = android.opengl.GLES10.GL_VERSION;
    public static final int GL_VERTEX_ARRAY = android.opengl.GLES10.GL_VERTEX_ARRAY;
    public static final int GL_XOR = android.opengl.GLES10.GL_XOR;
    public static final int GL_ZERO = android.opengl.GLES10.GL_ZERO;

}
