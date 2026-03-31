// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.photopicker;

public final class EmbeddedPhotoPickerFeatureInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbeddedPhotoPickerFeatureInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo wrap(android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo(real, (__DcgwBridgeToken) null);
    }

    public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo getReal() {
        return (android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real;
    }

    public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).describeContents();
    }

    public long getAccentColor() {
        return ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).getAccentColor();
    }

    public int getMaxSelectionLimit() {
        return ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).getMaxSelectionLimit();
    }

    public int getThemeNightMode() {
        return ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).getThemeNightMode();
    }

    public boolean isOrderedSelection() {
        return ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).isOrderedSelection();
    }

    public java.lang.String toString() {
        return ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder wrap(android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder getReal() {
            return (android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder) real;
        }

        public android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo build() {
            return com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.wrap(((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setAccentColor(long arg0) {
            return com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder.wrap(((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder) real).setAccentColor(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setMaxSelectionLimit(int arg0) {
            return com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder.wrap(((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder) real).setMaxSelectionLimit(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setOrderedSelection(boolean arg0) {
            return com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder.wrap(((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder) real).setOrderedSelection(arg0));
        }

        public com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder setThemeNightMode(int arg0) {
            return com.micklab.dcg.wrapper.android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder.wrap(((android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo.Builder) real).setThemeNightMode(arg0));
        }

    }
}
