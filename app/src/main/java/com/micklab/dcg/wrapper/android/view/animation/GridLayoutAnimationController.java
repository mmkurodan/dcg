// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class GridLayoutAnimationController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GridLayoutAnimationController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController wrap(android.view.animation.GridLayoutAnimationController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.GridLayoutAnimationController getReal() {
        return (android.view.animation.GridLayoutAnimationController) real;
    }

    public android.view.animation.GridLayoutAnimationController unwrap() {
        return getReal();
    }

    public GridLayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        this(new android.view.animation.GridLayoutAnimationController(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GridLayoutAnimationController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.GridLayoutAnimationController(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GridLayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0, float arg1, float arg2) {
        this(new android.view.animation.GridLayoutAnimationController(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public float getColumnDelay() {
        return ((android.view.animation.GridLayoutAnimationController) real).getColumnDelay();
    }

    public int getDirection() {
        return ((android.view.animation.GridLayoutAnimationController) real).getDirection();
    }

    public int getDirectionPriority() {
        return ((android.view.animation.GridLayoutAnimationController) real).getDirectionPriority();
    }

    public float getRowDelay() {
        return ((android.view.animation.GridLayoutAnimationController) real).getRowDelay();
    }

    public void setColumnDelay(float arg0) {
        ((android.view.animation.GridLayoutAnimationController) real).setColumnDelay(arg0);
    }

    public void setDirection(int arg0) {
        ((android.view.animation.GridLayoutAnimationController) real).setDirection(arg0);
    }

    public void setDirectionPriority(int arg0) {
        ((android.view.animation.GridLayoutAnimationController) real).setDirectionPriority(arg0);
    }

    public void setRowDelay(float arg0) {
        ((android.view.animation.GridLayoutAnimationController) real).setRowDelay(arg0);
    }

    public boolean willOverlap() {
        return ((android.view.animation.GridLayoutAnimationController) real).willOverlap();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimationParameters(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController.AnimationParameters wrap(android.view.animation.GridLayoutAnimationController.AnimationParameters real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.GridLayoutAnimationController.AnimationParameters(real, (__DcgwBridgeToken) null);
        }

        public android.view.animation.GridLayoutAnimationController.AnimationParameters getReal() {
            return (android.view.animation.GridLayoutAnimationController.AnimationParameters) real;
        }

        public android.view.animation.GridLayoutAnimationController.AnimationParameters unwrap() {
            return getReal();
        }

        public AnimationParameters() {
            this(new android.view.animation.GridLayoutAnimationController.AnimationParameters(), (__DcgwBridgeToken) null);
        }


    }
}
