// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.chooser;

public final class ChooserAction {
    private final android.service.chooser.ChooserAction real;

    public ChooserAction(android.service.chooser.ChooserAction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.chooser.ChooserAction wrap(android.service.chooser.ChooserAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserAction(real);
    }

    public android.service.chooser.ChooserAction unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getAction() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getAction());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Icon getIcon() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Icon.wrap(real.getIcon());
    }

    public java.lang.CharSequence getLabel() {
        return real.getLabel();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.service.chooser.ChooserAction.Builder real;

        public Builder(android.service.chooser.ChooserAction.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.chooser.ChooserAction.Builder wrap(android.service.chooser.ChooserAction.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.chooser.ChooserAction.Builder(real);
        }

        public android.service.chooser.ChooserAction.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.app.PendingIntent arg2) {
            this(new android.service.chooser.ChooserAction.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.chooser.ChooserAction build() {
            return com.micklab.dcg.wrapper.android.service.chooser.ChooserAction.wrap(real.build());
        }

    }
}
