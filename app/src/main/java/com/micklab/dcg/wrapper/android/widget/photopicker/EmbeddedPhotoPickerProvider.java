// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.photopicker;

public final class EmbeddedPhotoPickerProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbeddedPhotoPickerProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerProvider wrap(android.widget.photopicker.EmbeddedPhotoPickerProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerProvider(real, (__DcgwBridgeToken) null);
    }

    public android.widget.photopicker.EmbeddedPhotoPickerProvider getReal() {
        return (android.widget.photopicker.EmbeddedPhotoPickerProvider) real;
    }

    public android.widget.photopicker.EmbeddedPhotoPickerProvider unwrap() {
        return getReal();
    }

    public void openSession(com.micklab.dcg.wrapper.android.os.IBinder arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo arg4, java.util.concurrent.Executor arg5, com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerClient arg6) {
        ((android.widget.photopicker.EmbeddedPhotoPickerProvider) real).openSession(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal());
    }

}
