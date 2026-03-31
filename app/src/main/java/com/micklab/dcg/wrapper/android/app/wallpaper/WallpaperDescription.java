// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.wallpaper;

public final class WallpaperDescription {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WallpaperDescription(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription wrap(android.app.wallpaper.WallpaperDescription real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription(real, (__DcgwBridgeToken) null);
    }

    public android.app.wallpaper.WallpaperDescription getReal() {
        return (android.app.wallpaper.WallpaperDescription) real;
    }

    public android.app.wallpaper.WallpaperDescription unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.wallpaper.WallpaperDescription) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.wallpaper.WallpaperDescription) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.wallpaper.WallpaperDescription) real).getComponent());
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getContent() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.app.wallpaper.WallpaperDescription) real).getContent());
    }

    public java.lang.CharSequence getContextDescription() {
        return ((android.app.wallpaper.WallpaperDescription) real).getContextDescription();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getContextUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.wallpaper.WallpaperDescription) real).getContextUri());
    }

    public java.lang.String getId() {
        return ((android.app.wallpaper.WallpaperDescription) real).getId();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getThumbnail() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.app.wallpaper.WallpaperDescription) real).getThumbnail());
    }

    public java.lang.CharSequence getTitle() {
        return ((android.app.wallpaper.WallpaperDescription) real).getTitle();
    }

    public int hashCode() {
        return ((android.app.wallpaper.WallpaperDescription) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder toBuilder() {
        return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription) real).toBuilder());
    }

    public java.lang.String toString() {
        return ((android.app.wallpaper.WallpaperDescription) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.wallpaper.WallpaperDescription) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder wrap(android.app.wallpaper.WallpaperDescription.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.wallpaper.WallpaperDescription.Builder getReal() {
            return (android.app.wallpaper.WallpaperDescription.Builder) real;
        }

        public android.app.wallpaper.WallpaperDescription.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.wallpaper.WallpaperDescription.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription build() {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder setContent(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).setContent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder setContextDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).setContextDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder setContextUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).setContextUri(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder setThumbnail(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).setThumbnail(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.wallpaper.WallpaperDescription.Builder.wrap(((android.app.wallpaper.WallpaperDescription.Builder) real).setTitle(arg0));
        }

    }
}
