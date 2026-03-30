// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class PictureInPictureParams {
    private final android.app.PictureInPictureParams real;

    public PictureInPictureParams(android.app.PictureInPictureParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.PictureInPictureParams wrap(android.app.PictureInPictureParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.PictureInPictureParams(real);
    }

    public android.app.PictureInPictureParams unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Rational getAspectRatio() {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(real.getAspectRatio());
    }

    public com.micklab.dcg.wrapper.android.app.RemoteAction getCloseAction() {
        return com.micklab.dcg.wrapper.android.app.RemoteAction.wrap(real.getCloseAction());
    }

    public com.micklab.dcg.wrapper.android.util.Rational getExpandedAspectRatio() {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(real.getExpandedAspectRatio());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getSourceRectHint() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getSourceRectHint());
    }

    public java.lang.CharSequence getSubtitle() {
        return real.getSubtitle();
    }

    public java.lang.CharSequence getTitle() {
        return real.getTitle();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAutoEnterEnabled() {
        return real.isAutoEnterEnabled();
    }

    public boolean isSeamlessResizeEnabled() {
        return real.isSeamlessResizeEnabled();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.PictureInPictureParams.Builder real;

        public Builder(android.app.PictureInPictureParams.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder wrap(android.app.PictureInPictureParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder(real);
        }

        public android.app.PictureInPictureParams.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.PictureInPictureParams.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.app.PictureInPictureParams arg0) {
            this(new android.app.PictureInPictureParams.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams build() {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setAspectRatio(com.micklab.dcg.wrapper.android.util.Rational arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setAspectRatio(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setAutoEnterEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setAutoEnterEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setCloseAction(com.micklab.dcg.wrapper.android.app.RemoteAction arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setCloseAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setExpandedAspectRatio(com.micklab.dcg.wrapper.android.util.Rational arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setExpandedAspectRatio(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setSeamlessResizeEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setSeamlessResizeEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setSourceRectHint(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setSourceRectHint(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setSubtitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.PictureInPictureParams.Builder.wrap(real.setTitle(arg0));
        }

    }
}
