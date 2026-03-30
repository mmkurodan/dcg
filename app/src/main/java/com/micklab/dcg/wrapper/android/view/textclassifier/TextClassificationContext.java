// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClassificationContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext wrap(android.view.textclassifier.TextClassificationContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextClassificationContext getReal() {
        return (android.view.textclassifier.TextClassificationContext) real;
    }

    public android.view.textclassifier.TextClassificationContext unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.view.textclassifier.TextClassificationContext) real).describeContents();
    }

    public java.lang.String getPackageName() {
        return ((android.view.textclassifier.TextClassificationContext) real).getPackageName();
    }

    public java.lang.String getWidgetType() {
        return ((android.view.textclassifier.TextClassificationContext) real).getWidgetType();
    }

    public java.lang.String getWidgetVersion() {
        return ((android.view.textclassifier.TextClassificationContext) real).getWidgetVersion();
    }

    public java.lang.String toString() {
        return ((android.view.textclassifier.TextClassificationContext) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.textclassifier.TextClassificationContext) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder wrap(android.view.textclassifier.TextClassificationContext.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.view.textclassifier.TextClassificationContext.Builder getReal() {
            return (android.view.textclassifier.TextClassificationContext.Builder) real;
        }

        public android.view.textclassifier.TextClassificationContext.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.view.textclassifier.TextClassificationContext.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.wrap(((android.view.textclassifier.TextClassificationContext.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder setWidgetVersion(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder.wrap(((android.view.textclassifier.TextClassificationContext.Builder) real).setWidgetVersion(arg0));
        }

    }
}
