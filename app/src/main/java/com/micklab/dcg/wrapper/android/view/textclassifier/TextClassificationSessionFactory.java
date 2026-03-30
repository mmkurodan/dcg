// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationSessionFactory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClassificationSessionFactory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionFactory wrap(android.view.textclassifier.TextClassificationSessionFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionFactory(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextClassificationSessionFactory getReal() {
        return (android.view.textclassifier.TextClassificationSessionFactory) real;
    }

    public android.view.textclassifier.TextClassificationSessionFactory unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier createTextClassificationSession(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(((android.view.textclassifier.TextClassificationSessionFactory) real).createTextClassificationSession(arg0 == null ? null : arg0.getReal()));
    }

}
