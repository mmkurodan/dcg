// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class AnimatorInflater {
    private final android.animation.AnimatorInflater real;

    public AnimatorInflater(android.animation.AnimatorInflater real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.AnimatorInflater wrap(android.animation.AnimatorInflater real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.AnimatorInflater(real);
    }

    public android.animation.AnimatorInflater unwrap() {
        return real;
    }

    public AnimatorInflater() {
        this(new android.animation.AnimatorInflater());
    }

    public static com.micklab.dcg.wrapper.android.animation.Animator loadAnimator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(android.animation.AnimatorInflater.loadAnimator(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.animation.StateListAnimator loadStateListAnimator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.animation.StateListAnimator.wrap(android.animation.AnimatorInflater.loadStateListAnimator(arg0 == null ? null : arg0.unwrap(), arg1));
    }

}
