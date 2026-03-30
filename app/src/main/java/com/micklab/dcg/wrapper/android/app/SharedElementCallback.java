// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class SharedElementCallback {
    private final android.app.SharedElementCallback real;

    public SharedElementCallback(android.app.SharedElementCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.SharedElementCallback wrap(android.app.SharedElementCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.SharedElementCallback(real);
    }

    public android.app.SharedElementCallback unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onCaptureSharedElementSnapshot(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1, com.micklab.dcg.wrapper.android.graphics.RectF arg2) {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onCaptureSharedElementSnapshot(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateSnapshotView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Parcelable arg1) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateSnapshotView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static final class OnSharedElementsReadyListener {
        private final android.app.SharedElementCallback.OnSharedElementsReadyListener real;

        public OnSharedElementsReadyListener(android.app.SharedElementCallback.OnSharedElementsReadyListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.SharedElementCallback.OnSharedElementsReadyListener wrap(android.app.SharedElementCallback.OnSharedElementsReadyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.SharedElementCallback.OnSharedElementsReadyListener(real);
        }

        public android.app.SharedElementCallback.OnSharedElementsReadyListener unwrap() {
            return real;
        }

        public void onSharedElementsReady() {
            real.onSharedElementsReady();
        }

    }
}
