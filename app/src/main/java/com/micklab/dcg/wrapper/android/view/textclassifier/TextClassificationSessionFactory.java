// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationSessionFactory {
    private final android.view.textclassifier.TextClassificationSessionFactory real;

    public TextClassificationSessionFactory(android.view.textclassifier.TextClassificationSessionFactory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionFactory wrap(android.view.textclassifier.TextClassificationSessionFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionFactory(real);
    }

    public android.view.textclassifier.TextClassificationSessionFactory unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier createTextClassificationSession(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(real.createTextClassificationSession(arg0 == null ? null : arg0.unwrap()));
    }

}
