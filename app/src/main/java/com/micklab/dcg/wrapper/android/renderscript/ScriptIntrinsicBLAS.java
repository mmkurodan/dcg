// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicBLAS {
    private final android.renderscript.ScriptIntrinsicBLAS real;

    public ScriptIntrinsicBLAS(android.renderscript.ScriptIntrinsicBLAS real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS wrap(android.renderscript.ScriptIntrinsicBLAS real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS(real);
    }

    public android.renderscript.ScriptIntrinsicBLAS unwrap() {
        return real;
    }

    public void BNNM(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, int arg6) {
        real.BNNM(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6);
    }

    public void CGBMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Float2 arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, com.micklab.dcg.wrapper.android.renderscript.Float2 arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        real.CGBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6, arg7 == null ? null : arg7.unwrap(), arg8 == null ? null : arg8.unwrap(), arg9);
    }

    public void CGEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CGEMM(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void CGEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.CGEMV(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void CGERC(com.micklab.dcg.wrapper.android.renderscript.Float2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.CGERC(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void CGERU(com.micklab.dcg.wrapper.android.renderscript.Float2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.CGERU(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void CHBMV(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Float2 arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        real.CHBMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap(), arg7 == null ? null : arg7.unwrap(), arg8);
    }

    public void CHEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CHEMM(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void CHEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.CHEMV(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void CHER(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.CHER(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void CHER2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CHER2(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void CHER2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CHER2K(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void CHERK(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.CHERK(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void CHPMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.CHPMV(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void CHPR(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.CHPR(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void CHPR2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Float2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CHPR2(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void CSYMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CSYMM(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void CSYR2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Float2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CSYR2K(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void CSYRK(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Float2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Float2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.CSYRK(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public void CTBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.CTBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void CTBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.CTBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void CTPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.CTPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void CTPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.CTPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void CTRMM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Float2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CTRMM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void CTRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.CTRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void CTRSM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Float2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.CTRSM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void CTRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.CTRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void DGBMV(int arg0, int arg1, int arg2, double arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, double arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        real.DGBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6, arg7, arg8 == null ? null : arg8.unwrap(), arg9);
    }

    public void DGEMM(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DGEMM(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void DGEMV(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.DGEMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void DGER(double arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.DGER(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void DSBMV(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, double arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        real.DSBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap(), arg8);
    }

    public void DSPMV(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.DSPMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void DSPR(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.DSPR(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void DSPR2(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DSPR2(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void DSYMM(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DSYMM(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void DSYMV(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.DSYMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void DSYR(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.DSYR(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void DSYR2(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DSYR2(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void DSYR2K(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DSYR2K(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void DSYRK(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.DSYRK(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void DTBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.DTBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void DTBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.DTBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void DTPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.DTPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void DTPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.DTPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void DTRMM(int arg0, int arg1, int arg2, int arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DTRMM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void DTRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.DTRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void DTRSM(int arg0, int arg1, int arg2, int arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.DTRSM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void DTRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.DTRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void SGBMV(int arg0, int arg1, int arg2, float arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, float arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        real.SGBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6, arg7, arg8 == null ? null : arg8.unwrap(), arg9);
    }

    public void SGEMM(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.SGEMM(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void SGEMV(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.SGEMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void SGER(float arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.SGER(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void SSBMV(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, float arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        real.SSBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap(), arg8);
    }

    public void SSPMV(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.SSPMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void SSPR(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.SSPR(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void SSPR2(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.SSPR2(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void SSYMM(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.SSYMM(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void SSYMV(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.SSYMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void SSYR(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.SSYR(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void SSYR2(int arg0, float arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.SSYR2(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void SSYR2K(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, float arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.SSYR2K(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void SSYRK(int arg0, int arg1, float arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.SSYRK(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void STBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.STBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void STBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.STBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void STPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.STPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void STPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.STPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void STRMM(int arg0, int arg1, int arg2, int arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.STRMM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void STRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.STRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void STRSM(int arg0, int arg1, int arg2, int arg3, float arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.STRSM(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void STRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.STRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void ZGBMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Double2 arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6, com.micklab.dcg.wrapper.android.renderscript.Double2 arg7, com.micklab.dcg.wrapper.android.renderscript.Allocation arg8, int arg9) {
        real.ZGBMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6, arg7 == null ? null : arg7.unwrap(), arg8 == null ? null : arg8.unwrap(), arg9);
    }

    public void ZGEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZGEMM(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void ZGEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.ZGEMV(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void ZGERC(com.micklab.dcg.wrapper.android.renderscript.Double2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.ZGERC(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void ZGERU(com.micklab.dcg.wrapper.android.renderscript.Double2 arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.ZGERU(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void ZHBMV(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Double2 arg6, com.micklab.dcg.wrapper.android.renderscript.Allocation arg7, int arg8) {
        real.ZHBMV(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap(), arg7 == null ? null : arg7.unwrap(), arg8);
    }

    public void ZHEMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZHEMM(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void ZHEMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.ZHEMV(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void ZHER(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.ZHER(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void ZHER2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZHER2(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void ZHER2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, double arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZHER2K(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void ZHERK(int arg0, int arg1, double arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, double arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.ZHERK(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void ZHPMV(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, int arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6, int arg7) {
        real.ZHPMV(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7);
    }

    public void ZHPR(int arg0, double arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4) {
        real.ZHPR(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public void ZHPR2(int arg0, com.micklab.dcg.wrapper.android.renderscript.Double2 arg1, com.micklab.dcg.wrapper.android.renderscript.Allocation arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZHPR2(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void ZSYMM(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZSYMM(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void ZSYR2K(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Double2 arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZSYR2K(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void ZSYRK(int arg0, int arg1, com.micklab.dcg.wrapper.android.renderscript.Double2 arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Double2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5) {
        real.ZSYRK(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public void ZTBMV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.ZTBMV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void ZTBSV(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, int arg6) {
        real.ZTBSV(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6);
    }

    public void ZTPMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.ZTPMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void ZTPSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.ZTPSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void ZTRMM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Double2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZTRMM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void ZTRMV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.ZTRMV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public void ZTRSM(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.renderscript.Double2 arg4, com.micklab.dcg.wrapper.android.renderscript.Allocation arg5, com.micklab.dcg.wrapper.android.renderscript.Allocation arg6) {
        real.ZTRSM(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void ZTRSV(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.renderscript.Allocation arg3, com.micklab.dcg.wrapper.android.renderscript.Allocation arg4, int arg5) {
        real.ZTRSV(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5);
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBLAS.wrap(android.renderscript.ScriptIntrinsicBLAS.create(arg0 == null ? null : arg0.unwrap()));
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
