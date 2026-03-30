// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Interpolator {
    private final android.graphics.Interpolator real;

    public Interpolator(android.graphics.Interpolator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Interpolator wrap(android.graphics.Interpolator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Interpolator(real);
    }

    public android.graphics.Interpolator unwrap() {
        return real;
    }

    public Interpolator(int arg0) {
        this(new android.graphics.Interpolator(arg0));
    }

    public Interpolator(int arg0, int arg1) {
        this(new android.graphics.Interpolator(arg0, arg1));
    }

    public int getKeyFrameCount() {
        return real.getKeyFrameCount();
    }

    public int getValueCount() {
        return real.getValueCount();
    }

    public void reset(int arg0) {
        real.reset(arg0);
    }

    public void reset(int arg0, int arg1) {
        real.reset(arg0, arg1);
    }

    public void setKeyFrame(int arg0, int arg1, float[] arg2) {
        real.setKeyFrame(arg0, arg1, arg2);
    }

    public void setKeyFrame(int arg0, int arg1, float[] arg2, float[] arg3) {
        real.setKeyFrame(arg0, arg1, arg2, arg3);
    }

    public void setRepeatMirror(float arg0, boolean arg1) {
        real.setRepeatMirror(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.graphics.Interpolator.Result timeToValues(float[] arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(real.timeToValues(arg0));
    }

    public com.micklab.dcg.wrapper.android.graphics.Interpolator.Result timeToValues(int arg0, float[] arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Interpolator.Result.wrap(real.timeToValues(arg0, arg1));
    }

    public static final class Result {
        private final android.graphics.Interpolator.Result real;

        public Result(android.graphics.Interpolator.Result real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Interpolator.Result wrap(android.graphics.Interpolator.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Interpolator.Result(real);
        }

        public android.graphics.Interpolator.Result unwrap() {
            return real;
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
