// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SharedElementCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SharedElementCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SharedElementCallback wrap(android.app.SharedElementCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SharedElementCallback(real, (__DcgwBridgeToken) null);
    }

    public android.app.SharedElementCallback getReal() {
        return (android.app.SharedElementCallback) real;
    }

    public android.app.SharedElementCallback unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onCaptureSharedElementSnapshot(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2) {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.app.SharedElementCallback) real).onCaptureSharedElementSnapshot(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateSnapshotView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Parcelable arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.SharedElementCallback) real).onCreateSnapshotView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static final class OnSharedElementsReadyListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSharedElementsReadyListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.SharedElementCallback.OnSharedElementsReadyListener wrap(android.app.SharedElementCallback.OnSharedElementsReadyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.SharedElementCallback.OnSharedElementsReadyListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.SharedElementCallback.OnSharedElementsReadyListener getReal() {
            return (android.app.SharedElementCallback.OnSharedElementsReadyListener) real;
        }

        public android.app.SharedElementCallback.OnSharedElementsReadyListener unwrap() {
            return getReal();
        }

        public void onSharedElementsReady() {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) real).onSharedElementsReady();
        }

    }
}
