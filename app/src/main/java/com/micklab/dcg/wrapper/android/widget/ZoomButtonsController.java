// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ZoomButtonsController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ZoomButtonsController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ZoomButtonsController wrap(android.widget.ZoomButtonsController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomButtonsController(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ZoomButtonsController getReal() {
        return (android.widget.ZoomButtonsController) real;
    }

    public android.widget.ZoomButtonsController unwrap() {
        return getReal();
    }

    public ZoomButtonsController(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.widget.ZoomButtonsController(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup getContainer() {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.wrap(((android.widget.ZoomButtonsController) real).getContainer());
    }

    public com.micklab.dcg.wrapper.android.view.View getZoomControls() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.ZoomButtonsController) real).getZoomControls());
    }

    public boolean isAutoDismissed() {
        return ((android.widget.ZoomButtonsController) real).isAutoDismissed();
    }

    public boolean isVisible() {
        return ((android.widget.ZoomButtonsController) real).isVisible();
    }

    public boolean onTouch(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
        return ((android.widget.ZoomButtonsController) real).onTouch(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setAutoDismissed(boolean arg0) {
        ((android.widget.ZoomButtonsController) real).setAutoDismissed(arg0);
    }

    public void setFocusable(boolean arg0) {
        ((android.widget.ZoomButtonsController) real).setFocusable(arg0);
    }

    public void setOnZoomListener(com.micklab.dcg.wrapper.android.widget.ZoomButtonsController.OnZoomListener arg0) {
        ((android.widget.ZoomButtonsController) real).setOnZoomListener(arg0 == null ? null : arg0.getReal());
    }

    public void setVisible(boolean arg0) {
        ((android.widget.ZoomButtonsController) real).setVisible(arg0);
    }

    public void setZoomInEnabled(boolean arg0) {
        ((android.widget.ZoomButtonsController) real).setZoomInEnabled(arg0);
    }

    public void setZoomOutEnabled(boolean arg0) {
        ((android.widget.ZoomButtonsController) real).setZoomOutEnabled(arg0);
    }

    public void setZoomSpeed(long arg0) {
        ((android.widget.ZoomButtonsController) real).setZoomSpeed(arg0);
    }

    public static final class OnZoomListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnZoomListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ZoomButtonsController.OnZoomListener wrap(android.widget.ZoomButtonsController.OnZoomListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomButtonsController.OnZoomListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.ZoomButtonsController.OnZoomListener getReal() {
            return (android.widget.ZoomButtonsController.OnZoomListener) real;
        }

        public android.widget.ZoomButtonsController.OnZoomListener unwrap() {
            return getReal();
        }

        public void onVisibilityChanged(boolean arg0) {
            ((android.widget.ZoomButtonsController.OnZoomListener) real).onVisibilityChanged(arg0);
        }

        public void onZoom(boolean arg0) {
            ((android.widget.ZoomButtonsController.OnZoomListener) real).onZoom(arg0);
        }

    }
}
