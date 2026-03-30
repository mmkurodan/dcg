// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textclassifier;

public final class TextClassificationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextClassificationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationManager wrap(android.view.textclassifier.TextClassificationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.textclassifier.TextClassificationManager getReal() {
        return (android.view.textclassifier.TextClassificationManager) real;
    }

    public android.view.textclassifier.TextClassificationManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier createTextClassificationSession(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationContext arg0) {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(((android.view.textclassifier.TextClassificationManager) real).createTextClassificationSession(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier getTextClassifier() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(((android.view.textclassifier.TextClassificationManager) real).getTextClassifier());
    }

    public void setTextClassificationSessionFactory(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassificationSessionFactory arg0) {
        ((android.view.textclassifier.TextClassificationManager) real).setTextClassificationSessionFactory(arg0 == null ? null : arg0.getReal());
    }

    public void setTextClassifier(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier arg0) {
        ((android.view.textclassifier.TextClassificationManager) real).setTextClassifier(arg0 == null ? null : arg0.getReal());
    }

}
