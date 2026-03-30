// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicBLAS {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicBLAS(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS wrap(android.renderscript.ScriptIntrinsicBLAS real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicBLAS getReal() {
        return (android.renderscript.ScriptIntrinsicBLAS) real;
    }

    public android.renderscript.ScriptIntrinsicBLAS unwrap() {
        return getReal();
    }

    public void BNNM(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).BNNM(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6);
    }

    public void CGBMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Float2 arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, com.micklab.dcg.wrapper.android.renderscript.Float2 arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CGBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6, arg7 == null ? null : arg7.getReal(), arg8 == null ? null : arg8.getReal(), arg9);
    }

    public void CGEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CGEMM(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void CGEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CGEMV(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void CGERC(com.micklab.dcg.wrapper.android.renderscript.Float2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CGERC(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void CGERU(com.micklab.dcg.wrapper.android.renderscript.Float2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CGERU(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void CHBMV(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Float2 arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHBMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal(), arg7 == null ? null : arg7.getReal(), arg8);
    }

    public void CHEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHEMM(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void CHEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHEMV(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void CHER(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHER(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void CHER2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHER2(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void CHER2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHER2K(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void CHERK(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHERK(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void CHPMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHPMV(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void CHPR(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHPR(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void CHPR2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CHPR2(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void CSYMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CSYMM(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void CSYR2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CSYR2K(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void CSYRK(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Float2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CSYRK(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal());
    }

    public void CTBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void CTBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void CTPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void CTPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void CTRMM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Float2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTRMM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void CTRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void CTRSM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Float2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTRSM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void CTRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).CTRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void DGBMV(int arg0, int arg1, int arg2, double arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, double arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DGBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6, arg7, arg8 == null ? null : arg8.getReal(), arg9);
    }

    public void DGEMM(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DGEMM(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void DGEMV(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DGEMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void DGER(double arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DGER(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void DSBMV(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, double arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal(), arg8);
    }

    public void DSPMV(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSPMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void DSPR(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSPR(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void DSPR2(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSPR2(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void DSYMM(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSYMM(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void DSYMV(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSYMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void DSYR(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSYR(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void DSYR2(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSYR2(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void DSYR2K(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSYR2K(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void DSYRK(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DSYRK(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void DTBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void DTBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void DTPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void DTPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void DTRMM(int arg0, int arg1, int arg2, int arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTRMM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void DTRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void DTRSM(int arg0, int arg1, int arg2, int arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTRSM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void DTRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).DTRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void SGBMV(int arg0, int arg1, int arg2, float arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, float arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SGBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6, arg7, arg8 == null ? null : arg8.getReal(), arg9);
    }

    public void SGEMM(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SGEMM(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void SGEMV(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SGEMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void SGER(float arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SGER(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void SSBMV(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, float arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal(), arg8);
    }

    public void SSPMV(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSPMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void SSPR(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSPR(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void SSPR2(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSPR2(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void SSYMM(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSYMM(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void SSYMV(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSYMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void SSYR(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSYR(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void SSYR2(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSYR2(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void SSYR2K(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSYR2K(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void SSYRK(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).SSYRK(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void STBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void STBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void STPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void STPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void STRMM(int arg0, int arg1, int arg2, int arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STRMM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void STRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void STRSM(int arg0, int arg1, int arg2, int arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STRSM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void STRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).STRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void ZGBMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Double2 arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, com.micklab.dcg.wrapper.android.renderscript.Double2 arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZGBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6, arg7 == null ? null : arg7.getReal(), arg8 == null ? null : arg8.getReal(), arg9);
    }

    public void ZGEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZGEMM(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void ZGEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZGEMV(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void ZGERC(com.micklab.dcg.wrapper.android.renderscript.Double2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZGERC(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void ZGERU(com.micklab.dcg.wrapper.android.renderscript.Double2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZGERU(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void ZHBMV(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Double2 arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHBMV(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal(), arg7 == null ? null : arg7.getReal(), arg8);
    }

    public void ZHEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHEMM(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void ZHEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHEMV(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void ZHER(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHER(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void ZHER2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHER2(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void ZHER2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHER2K(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void ZHERK(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHERK(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal());
    }

    public void ZHPMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHPMV(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7);
    }

    public void ZHPR(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHPR(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public void ZHPR2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZHPR2(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

    public void ZSYMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZSYMM(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void ZSYR2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZSYR2K(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void ZSYRK(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Double2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZSYRK(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal());
    }

    public void ZTBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void ZTBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6);
    }

    public void ZTPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void ZTPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void ZTRMM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Double2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTRMM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void ZTRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public void ZTRSM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Double2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTRSM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void ZTRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        ((android.renderscript.ScriptIntrinsicBLAS) real).ZTRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS.wrap(android.renderscript.ScriptIntrinsicBLAS.create(arg0 == null ? null : arg0.getReal()));
    }

    public static final int CONJ_TRANSPOSE = android.renderscript.ScriptIntrinsicBLAS.CONJ_TRANSPOSE;
    public static final int LEFT = android.renderscript.ScriptIntrinsicBLAS.LEFT;
    public static final int LOWER = android.renderscript.ScriptIntrinsicBLAS.LOWER;
    public static final int NON_UNIT = android.renderscript.ScriptIntrinsicBLAS.NON_UNIT;
    public static final int NO_TRANSPOSE = android.renderscript.ScriptIntrinsicBLAS.NO_TRANSPOSE;
    public static final int RIGHT = android.renderscript.ScriptIntrinsicBLAS.RIGHT;
    public static final int TRANSPOSE = android.renderscript.ScriptIntrinsicBLAS.TRANSPOSE;
    public static final int UNIT = android.renderscript.ScriptIntrinsicBLAS.UNIT;
    public static final int UPPER = android.renderscript.ScriptIntrinsicBLAS.UPPER;

}
