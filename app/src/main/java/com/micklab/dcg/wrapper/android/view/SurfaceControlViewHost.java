// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceControlViewHost {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceControlViewHost(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost wrap(android.view.SurfaceControlViewHost real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost(real, (__DcgwBridgeToken) null);
    }

    public android.view.SurfaceControlViewHost getReal() {
        return (android.view.SurfaceControlViewHost) real;
    }

    public android.view.SurfaceControlViewHost unwrap() {
        return getReal();
    }

    public SurfaceControlViewHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1, com.micklab.dcg.wrapper.android.os.IBinder arg2) {
        this(new android.view.SurfaceControlViewHost(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public SurfaceControlViewHost(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.Display arg1, com.micklab.dcg.wrapper.android.window.InputTransferToken arg2) {
        this(new android.view.SurfaceControlViewHost(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage.wrap(((android.view.SurfaceControlViewHost) real).getSurfacePackage());
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.SurfaceControlViewHost) real).getView());
    }

    public void relayout(int arg0, int arg1) {
        ((android.view.SurfaceControlViewHost) real).relayout(arg0, arg1);
    }

    public void release() {
        ((android.view.SurfaceControlViewHost) real).release();
    }

    public void setView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2) {
        ((android.view.SurfaceControlViewHost) real).setView(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean transferTouchGestureToHost() {
        return ((android.view.SurfaceControlViewHost) real).transferTouchGestureToHost();
    }

    public static final class SurfacePackage {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SurfacePackage(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage wrap(android.view.SurfaceControlViewHost.SurfacePackage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceControlViewHost.SurfacePackage getReal() {
            return (android.view.SurfaceControlViewHost.SurfacePackage) real;
        }

        public android.view.SurfaceControlViewHost.SurfacePackage unwrap() {
            return getReal();
        }

        public SurfacePackage(com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage arg0) {
            this(new android.view.SurfaceControlViewHost.SurfacePackage(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.view.SurfaceControlViewHost.SurfacePackage) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.window.InputTransferToken getInputTransferToken() {
            return com.micklab.dcg.wrapper.android.window.InputTransferToken.wrap(((android.view.SurfaceControlViewHost.SurfacePackage) real).getInputTransferToken());
        }

        public com.micklab.dcg.wrapper.android.view.SurfaceControl getSurfaceControl() {
            return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(((android.view.SurfaceControlViewHost.SurfacePackage) real).getSurfaceControl());
        }

        public void notifyConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
            ((android.view.SurfaceControlViewHost.SurfacePackage) real).notifyConfigurationChanged(arg0 == null ? null : arg0.getReal());
        }

        public void notifyDetachedFromWindow() {
            ((android.view.SurfaceControlViewHost.SurfacePackage) real).notifyDetachedFromWindow();
        }

        public void release() {
            ((android.view.SurfaceControlViewHost.SurfacePackage) real).release();
        }

        public java.lang.String toString() {
            return ((android.view.SurfaceControlViewHost.SurfacePackage) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.view.SurfaceControlViewHost.SurfacePackage) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
