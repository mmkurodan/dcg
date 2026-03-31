// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.photopicker;

public final class EmbeddedPhotoPickerClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbeddedPhotoPickerClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerClient wrap(android.widget.photopicker.EmbeddedPhotoPickerClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerClient(real, (__DcgwBridgeToken) null);
    }

    public android.widget.photopicker.EmbeddedPhotoPickerClient getReal() {
        return (android.widget.photopicker.EmbeddedPhotoPickerClient) real;
    }

    public android.widget.photopicker.EmbeddedPhotoPickerClient unwrap() {
        return getReal();
    }

    public void onSelectionComplete() {
        ((android.widget.photopicker.EmbeddedPhotoPickerClient) real).onSelectionComplete();
    }

    public void onSessionError(java.lang.Throwable arg0) {
        ((android.widget.photopicker.EmbeddedPhotoPickerClient) real).onSessionError(arg0);
    }

    public void onSessionOpened(com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerSession arg0) {
        ((android.widget.photopicker.EmbeddedPhotoPickerClient) real).onSessionOpened(arg0 == null ? null : arg0.getReal());
    }

}
