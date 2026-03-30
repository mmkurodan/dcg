// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ZoomButtonsController {
    private final android.widget.ZoomButtonsController real;

    public ZoomButtonsController(android.widget.ZoomButtonsController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ZoomButtonsController wrap(android.widget.ZoomButtonsController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomButtonsController(real);
    }

    public android.widget.ZoomButtonsController unwrap() {
        return real;
    }

    public ZoomButtonsController(com.micklab.dcg.wrapper.android.view.View arg0) {
        this(new android.widget.ZoomButtonsController(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewGroup getContainer() {
        return com.micklab.dcg.wrapper.android.view.ViewGroup.wrap(real.getContainer());
    }

    public com.micklab.dcg.wrapper.android.view.View getZoomControls() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getZoomControls());
    }

    public boolean isAutoDismissed() {
        return real.isAutoDismissed();
    }

    public boolean isVisible() {
        return real.isVisible();
    }

    public boolean onTouch(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
        return real.onTouch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setAutoDismissed(boolean arg0) {
        real.setAutoDismissed(arg0);
    }

    public void setFocusable(boolean arg0) {
        real.setFocusable(arg0);
    }

    public void setOnZoomListener(com.micklab.dcg.wrapper.android.widget.ZoomButtonsController.OnZoomListener arg0) {
        real.setOnZoomListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setVisible(boolean arg0) {
        real.setVisible(arg0);
    }

    public void setZoomInEnabled(boolean arg0) {
        real.setZoomInEnabled(arg0);
    }

    public void setZoomOutEnabled(boolean arg0) {
        real.setZoomOutEnabled(arg0);
    }

    public void setZoomSpeed(long arg0) {
        real.setZoomSpeed(arg0);
    }

    public static final class OnZoomListener {
        private final android.widget.ZoomButtonsController.OnZoomListener real;

        public OnZoomListener(android.widget.ZoomButtonsController.OnZoomListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.ZoomButtonsController.OnZoomListener wrap(android.widget.ZoomButtonsController.OnZoomListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomButtonsController.OnZoomListener(real);
        }

        public android.widget.ZoomButtonsController.OnZoomListener unwrap() {
            return real;
        }

        public void onVisibilityChanged(boolean arg0) {
            real.onVisibilityChanged(arg0);
        }

        public void onZoom(boolean arg0) {
            real.onZoom(arg0);
        }

    }
}
