// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class GrammaticalInflectionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GrammaticalInflectionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.GrammaticalInflectionManager wrap(android.app.GrammaticalInflectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.GrammaticalInflectionManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.GrammaticalInflectionManager getReal() {
        return (android.app.GrammaticalInflectionManager) real;
    }

    public android.app.GrammaticalInflectionManager unwrap() {
        return getReal();
    }

    public int getApplicationGrammaticalGender() {
        return ((android.app.GrammaticalInflectionManager) real).getApplicationGrammaticalGender();
    }

    public int getSystemGrammaticalGender() {
        return ((android.app.GrammaticalInflectionManager) real).getSystemGrammaticalGender();
    }

    public void setRequestedApplicationGrammaticalGender(int arg0) {
        ((android.app.GrammaticalInflectionManager) real).setRequestedApplicationGrammaticalGender(arg0);
    }

}
