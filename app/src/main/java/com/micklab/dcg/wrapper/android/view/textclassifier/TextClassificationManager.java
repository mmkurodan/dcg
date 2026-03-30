// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationManager {
    private final android.view.textclassifier.TextClassificationManager real;

    public TextClassificationManager(android.view.textclassifier.TextClassificationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationManager wrap(android.view.textclassifier.TextClassificationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationManager(real);
    }

    public android.view.textclassifier.TextClassificationManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier createTextClassificationSession(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(real.createTextClassificationSession(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier getTextClassifier() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(real.getTextClassifier());
    }

    public void setTextClassificationSessionFactory(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionFactory arg0) {
        real.setTextClassificationSessionFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setTextClassifier(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier arg0) {
        real.setTextClassifier(arg0 == null ? null : arg0.unwrap());
    }

}
