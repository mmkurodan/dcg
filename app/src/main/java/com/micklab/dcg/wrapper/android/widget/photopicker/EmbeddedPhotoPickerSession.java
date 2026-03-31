// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.photopicker;

public final class EmbeddedPhotoPickerSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbeddedPhotoPickerSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerSession wrap(android.widget.photopicker.EmbeddedPhotoPickerSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerSession(real, (__DcgwBridgeToken) null);
    }

    public android.widget.photopicker.EmbeddedPhotoPickerSession getReal() {
        return (android.widget.photopicker.EmbeddedPhotoPickerSession) real;
    }

    public android.widget.photopicker.EmbeddedPhotoPickerSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.widget.photopicker.EmbeddedPhotoPickerSession) real).close();
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControlViewHost.SurfacePackage.wrap(((android.widget.photopicker.EmbeddedPhotoPickerSession) real).getSurfacePackage());
    }

    public void notifyConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.widget.photopicker.EmbeddedPhotoPickerSession) real).notifyConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void notifyPhotoPickerExpanded(boolean arg0) {
        ((android.widget.photopicker.EmbeddedPhotoPickerSession) real).notifyPhotoPickerExpanded(arg0);
    }

    public void notifyResized(int arg0, int arg1) {
        ((android.widget.photopicker.EmbeddedPhotoPickerSession) real).notifyResized(arg0, arg1);
    }

    public void notifyVisibilityChanged(boolean arg0) {
        ((android.widget.photopicker.EmbeddedPhotoPickerSession) real).notifyVisibilityChanged(arg0);
    }

}
