// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Interpolator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Interpolator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Interpolator wrap(android.graphics.Interpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Interpolator(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Interpolator getReal() {
        return (android.graphics.Interpolator) real;
    }

    public android.graphics.Interpolator unwrap() {
        return getReal();
    }

    public Interpolator(int arg0) {
        this(new android.graphics.Interpolator(arg0), (__DcgwBridgeToken) null);
    }

    public Interpolator(int arg0, int arg1) {
        this(new android.graphics.Interpolator(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int getKeyFrameCount() {
        return ((android.graphics.Interpolator) real).getKeyFrameCount();
    }

    public int getValueCount() {
        return ((android.graphics.Interpolator) real).getValueCount();
    }

    public void reset(int arg0) {
        ((android.graphics.Interpolator) real).reset(arg0);
    }

    public void reset(int arg0, int arg1) {
        ((android.graphics.Interpolator) real).reset(arg0, arg1);
    }

    public void setKeyFrame(int arg0, int arg1, float[] arg2) {
        ((android.graphics.Interpolator) real).setKeyFrame(arg0, arg1, arg2);
    }

    public void setKeyFrame(int arg0, int arg1, float[] arg2, float[] arg3) {
        ((android.graphics.Interpolator) real).setKeyFrame(arg0, arg1, arg2, arg3);
    }

    public void setRepeatMirror(float arg0, boolean arg1) {
        ((android.graphics.Interpolator) real).setRepeatMirror(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Interpolator.Result timeToValues(float[] arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(((android.graphics.Interpolator) real).timeToValues(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Interpolator.Result timeToValues(int arg0, float[] arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(((android.graphics.Interpolator) real).timeToValues(arg0, arg1));
    }

    public static final class Result {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Result(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Interpolator.Result wrap(android.graphics.Interpolator.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Interpolator.Result(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Interpolator.Result getReal() {
            return (android.graphics.Interpolator.Result) real;
        }

        public android.graphics.Interpolator.Result unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Interpolator.Result valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(android.graphics.Interpolator.Result.valueOf(arg0));
        }

        public static android.graphics.Interpolator.Result[] values() {
            return android.graphics.Interpolator.Result.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Interpolator.Result FREEZE_END = com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(android.graphics.Interpolator.Result.FREEZE_END);
        public static final com.micklab.dcg.wrapper.android.graphics.Interpolator.Result FREEZE_START = com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(android.graphics.Interpolator.Result.FREEZE_START);
        public static final com.micklab.dcg.wrapper.android.graphics.Interpolator.Result NORMAL = com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(android.graphics.Interpolator.Result.NORMAL);

    }
}
