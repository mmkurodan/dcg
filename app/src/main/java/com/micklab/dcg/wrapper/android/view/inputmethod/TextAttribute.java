// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextAttribute {
    private final android.view.inputmethod.TextAttribute real;

    public TextAttribute(android.view.inputmethod.TextAttribute real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute wrap(android.view.inputmethod.TextAttribute real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute(real);
    }

    public android.view.inputmethod.TextAttribute unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getExtras());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.inputmethod.TextAttribute.Builder real;

        public Builder(android.view.inputmethod.TextAttribute.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder wrap(android.view.inputmethod.TextAttribute.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder(real);
        }

        public android.view.inputmethod.TextAttribute.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.view.inputmethod.TextAttribute.Builder());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder setExtras(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
