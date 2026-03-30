// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RatingBar {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RatingBar(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RatingBar wrap(android.widget.RatingBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RatingBar(real, (__DcgwBridgeToken) null);
    }

    public android.widget.RatingBar getReal() {
        return (android.widget.RatingBar) real;
    }

    public android.widget.RatingBar unwrap() {
        return getReal();
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.RatingBar) real).getAccessibilityClassName();
    }

    public int getNumStars() {
        return ((android.widget.RatingBar) real).getNumStars();
    }

    public com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener getOnRatingBarChangeListener() {
        return com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener.wrap(((android.widget.RatingBar) real).getOnRatingBarChangeListener());
    }

    public float getRating() {
        return ((android.widget.RatingBar) real).getRating();
    }

    public float getStepSize() {
        return ((android.widget.RatingBar) real).getStepSize();
    }

    public boolean isIndicator() {
        return ((android.widget.RatingBar) real).isIndicator();
    }

    public void setIsIndicator(boolean arg0) {
        ((android.widget.RatingBar) real).setIsIndicator(arg0);
    }

    public void setMax(int arg0) {
        ((android.widget.RatingBar) real).setMax(arg0);
    }

    public void setNumStars(int arg0) {
        ((android.widget.RatingBar) real).setNumStars(arg0);
    }

    public void setOnRatingBarChangeListener(com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener arg0) {
        ((android.widget.RatingBar) real).setOnRatingBarChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRating(float arg0) {
        ((android.widget.RatingBar) real).setRating(arg0);
    }

    public void setStepSize(float arg0) {
        ((android.widget.RatingBar) real).setStepSize(arg0);
    }

    public static final class OnRatingBarChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnRatingBarChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener wrap(android.widget.RatingBar.OnRatingBarChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RatingBar.OnRatingBarChangeListener getReal() {
            return (android.widget.RatingBar.OnRatingBarChangeListener) real;
        }

        public android.widget.RatingBar.OnRatingBarChangeListener unwrap() {
            return getReal();
        }

        public void onRatingChanged(com.micklab.dcg.wrapper.android.widget.RatingBar arg0, float arg1, boolean arg2) {
            ((android.widget.RatingBar.OnRatingBarChangeListener) real).onRatingChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
