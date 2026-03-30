// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class GridLayoutAnimationController {
    private final android.view.animation.GridLayoutAnimationController real;

    public GridLayoutAnimationController(android.view.animation.GridLayoutAnimationController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController wrap(android.view.animation.GridLayoutAnimationController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController(real);
    }

    public android.view.animation.GridLayoutAnimationController unwrap() {
        return real;
    }

    public GridLayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        this(new android.view.animation.GridLayoutAnimationController(arg0 == null ? null : arg0.unwrap()));
    }

    public GridLayoutAnimationController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.GridLayoutAnimationController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GridLayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0, float arg1, float arg2) {
        this(new android.view.animation.GridLayoutAnimationController(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public float getColumnDelay() {
        return real.getColumnDelay();
    }

    public int getDirection() {
        return real.getDirection();
    }

    public int getDirectionPriority() {
        return real.getDirectionPriority();
    }

    public float getRowDelay() {
        return real.getRowDelay();
    }

    public void setColumnDelay(float arg0) {
        real.setColumnDelay(arg0);
    }

    public void setDirection(int arg0) {
        real.setDirection(arg0);
    }

    public void setDirectionPriority(int arg0) {
        real.setDirectionPriority(arg0);
    }

    public void setRowDelay(float arg0) {
        real.setRowDelay(arg0);
    }

    public boolean willOverlap() {
        return real.willOverlap();
    }

    public static final int DIRECTION_BOTTOM_TO_TOP = android.view.animation.GridLayoutAnimationController.DIRECTION_BOTTOM_TO_TOP;
    public static final int DIRECTION_HORIZONTAL_MASK = android.view.animation.GridLayoutAnimationController.DIRECTION_HORIZONTAL_MASK;
    public static final int DIRECTION_LEFT_TO_RIGHT = android.view.animation.GridLayoutAnimationController.DIRECTION_LEFT_TO_RIGHT;
    public static final int DIRECTION_RIGHT_TO_LEFT = android.view.animation.GridLayoutAnimationController.DIRECTION_RIGHT_TO_LEFT;
    public static final int DIRECTION_TOP_TO_BOTTOM = android.view.animation.GridLayoutAnimationController.DIRECTION_TOP_TO_BOTTOM;
    public static final int DIRECTION_VERTICAL_MASK = android.view.animation.GridLayoutAnimationController.DIRECTION_VERTICAL_MASK;
    public static final int PRIORITY_COLUMN = android.view.animation.GridLayoutAnimationController.PRIORITY_COLUMN;
    public static final int PRIORITY_NONE = android.view.animation.GridLayoutAnimationController.PRIORITY_NONE;
    public static final int PRIORITY_ROW = android.view.animation.GridLayoutAnimationController.PRIORITY_ROW;

    public static final class AnimationParameters {
        private final android.view.animation.GridLayoutAnimationController.AnimationParameters real;

        public AnimationParameters(android.view.animation.GridLayoutAnimationController.AnimationParameters real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController.AnimationParameters wrap(android.view.animation.GridLayoutAnimationController.AnimationParameters real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController.AnimationParameters(real);
        }

        public android.view.animation.GridLayoutAnimationController.AnimationParameters unwrap() {
            return real;
        }

        public AnimationParameters() {
            this(new android.view.animation.GridLayoutAnimationController.AnimationParameters());
        }


    }
}
