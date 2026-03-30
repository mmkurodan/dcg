// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationContext {
    private final android.view.textclassifier.TextClassificationContext real;

    public TextClassificationContext(android.view.textclassifier.TextClassificationContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext wrap(android.view.textclassifier.TextClassificationContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext(real);
    }

    public android.view.textclassifier.TextClassificationContext unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getWidgetType() {
        return real.getWidgetType();
    }

    public java.lang.String getWidgetVersion() {
        return real.getWidgetVersion();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.view.textclassifier.TextClassificationContext.Builder real;

        public Builder(android.view.textclassifier.TextClassificationContext.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder wrap(android.view.textclassifier.TextClassificationContext.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder(real);
        }

        public android.view.textclassifier.TextClassificationContext.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.view.textclassifier.TextClassificationContext.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext build() {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder setWidgetVersion(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext.Builder.wrap(real.setWidgetVersion(arg0));
        }

    }
}
