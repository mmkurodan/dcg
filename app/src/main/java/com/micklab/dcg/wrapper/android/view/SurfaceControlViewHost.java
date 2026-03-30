// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceControlViewHost {
    private final android.view.SurfaceControlViewHost real;

    public SurfaceControlViewHost(android.view.SurfaceControlViewHost real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost wrap(android.view.SurfaceControlViewHost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost(real);
    }

    public android.view.SurfaceControlViewHost unwrap() {
        return real;
    }

    public SurfaceControlViewHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1, com.micklab.dcg.wrapper.android.os.IBinder arg2) {
        this(new android.view.SurfaceControlViewHost(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public SurfaceControlViewHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1, com.micklab.dcg.wrapper.android.window.InputTransferToken arg2) {
        this(new android.view.SurfaceControlViewHost(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage.wrap(real.getSurfacePackage());
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView());
    }

    public void relayout(int arg0, int arg1) {
        real.relayout(arg0, arg1);
    }

    public void release() {
        real.release();
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        real.setView(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean transferTouchGestureToHost() {
        return real.transferTouchGestureToHost();
    }

    public static final class SurfacePackage {
        private final android.view.SurfaceControlViewHost.SurfacePackage real;

        public SurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage wrap(android.view.SurfaceControlViewHost.SurfacePackage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage(real);
        }

        public android.view.SurfaceControlViewHost.SurfacePackage unwrap() {
            return real;
        }

        public SurfacePackage(com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage arg0) {
            this(new android.view.SurfaceControlViewHost.SurfacePackage(arg0 == null ? null : arg0.unwrap()));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.window.InputTransferToken getInputTransferToken() {
            return com.micklab.dcg.wrapper.android.window.InputTransferToken.wrap(real.getInputTransferToken());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl getSurfaceControl() {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(real.getSurfaceControl());
        }

        public void notifyConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
            real.notifyConfigurationChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyDetachedFromWindow() {
            real.notifyDetachedFromWindow();
        }

        public void release() {
            real.release();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
