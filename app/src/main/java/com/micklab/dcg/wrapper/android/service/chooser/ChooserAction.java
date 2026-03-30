// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChooserAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserAction wrap(android.service.chooser.ChooserAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.chooser.ChooserAction getReal() {
        return (android.service.chooser.ChooserAction) real;
    }

    public android.service.chooser.ChooserAction unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.chooser.ChooserAction) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getAction() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.service.chooser.ChooserAction) real).getAction());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(((android.service.chooser.ChooserAction) real).getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return ((android.service.chooser.ChooserAction) real).getLabel();
    }

    public java.lang.String toString() {
        return ((android.service.chooser.ChooserAction) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.chooser.ChooserAction) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.chooser.ChooserAction.Builder wrap(android.service.chooser.ChooserAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserAction.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.chooser.ChooserAction.Builder getReal() {
            return (android.service.chooser.ChooserAction.Builder) real;
        }

        public android.service.chooser.ChooserAction.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            this(new android.service.chooser.ChooserAction.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.chooser.ChooserAction build() {
            return com.micklab.dcg.wrapper.android.service.chooser.ChooserAction.wrap(((android.service.chooser.ChooserAction.Builder) real).build());
        }

    }
}
