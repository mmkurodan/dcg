// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class PictureInPictureParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PictureInPictureParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.PictureInPictureParams wrap(android.app.PictureInPictureParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.PictureInPictureParams(real, (__DcgwBridgeToken) null);
    }

    public android.app.PictureInPictureParams getReal() {
        return (android.app.PictureInPictureParams) real;
    }

    public android.app.PictureInPictureParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.PictureInPictureParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.PictureInPictureParams) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Rational getAspectRatio() {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(((android.app.PictureInPictureParams) real).getAspectRatio());
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction getCloseAction() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(((android.app.PictureInPictureParams) real).getCloseAction());
    }

    public com.micklab.dcg.wrapper.android.util.Rational getExpandedAspectRatio() {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(((android.app.PictureInPictureParams) real).getExpandedAspectRatio());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getSourceRectHint() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.app.PictureInPictureParams) real).getSourceRectHint());
    }

    public java.lang.CharSequence getSubtitle() {
        return ((android.app.PictureInPictureParams) real).getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return ((android.app.PictureInPictureParams) real).getTitle();
    }

    public int hashCode() {
        return ((android.app.PictureInPictureParams) real).hashCode();
    }

    public boolean isAutoEnterEnabled() {
        return ((android.app.PictureInPictureParams) real).isAutoEnterEnabled();
    }

    public boolean isSeamlessResizeEnabled() {
        return ((android.app.PictureInPictureParams) real).isSeamlessResizeEnabled();
    }

    public java.lang.String toString() {
        return ((android.app.PictureInPictureParams) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.PictureInPictureParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder wrap(android.app.PictureInPictureParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.PictureInPictureParams.Builder getReal() {
            return (android.app.PictureInPictureParams.Builder) real;
        }

        public android.app.PictureInPictureParams.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.PictureInPictureParams.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
            this(new android.app.PictureInPictureParams.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams build() {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.wrap(((android.app.PictureInPictureParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setAspectRatio(com.micklab.dcg.wrapper.android.util.Rational arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setAspectRatio(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setAutoEnterEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setAutoEnterEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setCloseAction(com.micklab.dcg.wrapper.android.app.RemoteAction arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setCloseAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setExpandedAspectRatio(com.micklab.dcg.wrapper.android.util.Rational arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setExpandedAspectRatio(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setSeamlessResizeEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setSeamlessResizeEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setSourceRectHint(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setSourceRectHint(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(((android.app.PictureInPictureParams.Builder) real).setTitle(arg0));
        }

    }
}
