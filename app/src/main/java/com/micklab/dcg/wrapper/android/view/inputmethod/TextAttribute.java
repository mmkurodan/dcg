// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.inputmethod;

public final class TextAttribute {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextAttribute(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute wrap(android.view.inputmethod.TextAttribute real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute(real, (__DcgwBridgeToken) null);
    }

    public android.view.inputmethod.TextAttribute getReal() {
        return (android.view.inputmethod.TextAttribute) real;
    }

    public android.view.inputmethod.TextAttribute unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.inputmethod.TextAttribute) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.view.inputmethod.TextAttribute) real).getExtras());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.inputmethod.TextAttribute) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder wrap(android.view.inputmethod.TextAttribute.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.inputmethod.TextAttribute.Builder getReal() {
            return (android.view.inputmethod.TextAttribute.Builder) real;
        }

        public android.view.inputmethod.TextAttribute.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.view.inputmethod.TextAttribute.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute build() {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.wrap(((android.view.inputmethod.TextAttribute.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder setExtras(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.view.inputmethod.TextAttribute.Builder.wrap(((android.view.inputmethod.TextAttribute.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

    }
}
