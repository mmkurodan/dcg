// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.photopicker;

public final class EmbeddedPhotoPickerProviderFactory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbeddedPhotoPickerProviderFactory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerProviderFactory wrap(android.widget.photopicker.EmbeddedPhotoPickerProviderFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerProviderFactory(real, (__DcgwBridgeToken) null);
    }

    public android.widget.photopicker.EmbeddedPhotoPickerProviderFactory getReal() {
        return (android.widget.photopicker.EmbeddedPhotoPickerProviderFactory) real;
    }

    public android.widget.photopicker.EmbeddedPhotoPickerProviderFactory unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerProvider create(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerProvider.wrap(android.widget.photopicker.EmbeddedPhotoPickerProviderFactory.create(arg0 == null ? null : arg0.getReal()));
    }

}
