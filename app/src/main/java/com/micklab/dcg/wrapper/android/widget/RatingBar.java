// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RatingBar {
    private final android.widget.RatingBar real;

    public RatingBar(android.widget.RatingBar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RatingBar wrap(android.widget.RatingBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RatingBar(real);
    }

    public android.widget.RatingBar unwrap() {
        return real;
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.unwrap()));
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public RatingBar(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.RatingBar(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getNumStars() {
        return real.getNumStars();
    }

    public com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener getOnRatingBarChangeListener() {
        return com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener.wrap(real.getOnRatingBarChangeListener());
    }

    public float getRating() {
        return real.getRating();
    }

    public float getStepSize() {
        return real.getStepSize();
    }

    public boolean isIndicator() {
        return real.isIndicator();
    }

    public void setIsIndicator(boolean arg0) {
        real.setIsIndicator(arg0);
    }

    public void setMax(int arg0) {
        real.setMax(arg0);
    }

    public void setNumStars(int arg0) {
        real.setNumStars(arg0);
    }

    public void setOnRatingBarChangeListener(com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener arg0) {
        real.setOnRatingBarChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setRating(float arg0) {
        real.setRating(arg0);
    }

    public void setStepSize(float arg0) {
        real.setStepSize(arg0);
    }

    public static final class OnRatingBarChangeListener {
        private final android.widget.RatingBar.OnRatingBarChangeListener real;

        public OnRatingBarChangeListener(android.widget.RatingBar.OnRatingBarChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener wrap(android.widget.RatingBar.OnRatingBarChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RatingBar.OnRatingBarChangeListener(real);
        }

        public android.widget.RatingBar.OnRatingBarChangeListener unwrap() {
            return real;
        }

        public void onRatingChanged(com.micklab.dcg.wrapper.android.widget.RatingBar arg0, float arg1, boolean arg2) {
            real.onRatingChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
