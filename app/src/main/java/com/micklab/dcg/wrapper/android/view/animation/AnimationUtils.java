// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnimationUtils {
    private final android.view.animation.AnimationUtils real;

    public AnimationUtils(android.view.animation.AnimationUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnimationUtils wrap(android.view.animation.AnimationUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnimationUtils(real);
    }

    public android.view.animation.AnimationUtils unwrap() {
        return real;
    }

    public AnimationUtils() {
        this(new android.view.animation.AnimationUtils());
    }

    public static long currentAnimationTimeMillis() {
        return android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Animation loadAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(android.view.animation.AnimationUtils.loadAnimation(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Interpolator loadInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(android.view.animation.AnimationUtils.loadInterpolator(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController loadLayoutAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.wrap(android.view.animation.AnimationUtils.loadLayoutAnimation(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Animation makeInAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(android.view.animation.AnimationUtils.makeInAnimation(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Animation makeInChildBottomAnimation(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(android.view.animation.AnimationUtils.makeInChildBottomAnimation(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Animation makeOutAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(android.view.animation.AnimationUtils.makeOutAnimation(arg0 == null ? null : arg0.unwrap(), arg1));
    }

}
