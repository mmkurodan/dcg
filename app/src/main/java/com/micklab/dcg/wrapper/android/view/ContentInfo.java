// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ContentInfo {
    private final android.view.ContentInfo real;

    public ContentInfo(android.view.ContentInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ContentInfo wrap(android.view.ContentInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContentInfo(real);
    }

    public android.view.ContentInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.content.ClipData getClip() {
        return com.micklab.dcg.wrapper.android.content.ClipData.wrap(real.getClip());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public int getFlags() {
        return real.getFlags();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getLinkUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getLinkUri());
    }

    public int getSource() {
        return real.getSource();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = android.view.ContentInfo.FLAG_CONVERT_TO_PLAIN_TEXT;
    public static final int SOURCE_APP = android.view.ContentInfo.SOURCE_APP;
    public static final int SOURCE_AUTOFILL = android.view.ContentInfo.SOURCE_AUTOFILL;
    public static final int SOURCE_CLIPBOARD = android.view.ContentInfo.SOURCE_CLIPBOARD;
    public static final int SOURCE_DRAG_AND_DROP = android.view.ContentInfo.SOURCE_DRAG_AND_DROP;
    public static final int SOURCE_INPUT_METHOD = android.view.ContentInfo.SOURCE_INPUT_METHOD;
    public static final int SOURCE_PROCESS_TEXT = android.view.ContentInfo.SOURCE_PROCESS_TEXT;

    public static final class Builder {
        private final android.view.ContentInfo.Builder real;

        public Builder(android.view.ContentInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ContentInfo.Builder wrap(android.view.ContentInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ContentInfo.Builder(real);
        }

        public android.view.ContentInfo.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.view.ContentInfo arg0) {
            this(new android.view.ContentInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.content.ClipData arg0, int arg1) {
            this(new android.view.ContentInfo.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.view.ContentInfo build() {
            return com.micklab.dcg.wrapper.android.view.ContentInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.ContentInfo.Builder setClip(com.micklab.dcg.wrapper.android.content.ClipData arg0) {
            return com.micklab.dcg.wrapper.android.view.ContentInfo.Builder.wrap(real.setClip(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.ContentInfo.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.view.ContentInfo.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.ContentInfo.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.view.ContentInfo.Builder.wrap(real.setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.view.ContentInfo.Builder setLinkUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.view.ContentInfo.Builder.wrap(real.setLinkUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.view.ContentInfo.Builder setSource(int arg0) {
            return com.micklab.dcg.wrapper.android.view.ContentInfo.Builder.wrap(real.setSource(arg0));
        }

    }
}
