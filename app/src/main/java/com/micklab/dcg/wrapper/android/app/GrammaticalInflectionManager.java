// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class GrammaticalInflectionManager {
    private final android.app.GrammaticalInflectionManager real;

    public GrammaticalInflectionManager(android.app.GrammaticalInflectionManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.GrammaticalInflectionManager wrap(android.app.GrammaticalInflectionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.GrammaticalInflectionManager(real);
    }

    public android.app.GrammaticalInflectionManager unwrap() {
        return real;
    }

    public int getApplicationGrammaticalGender() {
        return real.getApplicationGrammaticalGender();
    }

    public int getSystemGrammaticalGender() {
        return real.getSystemGrammaticalGender();
    }

    public void setRequestedApplicationGrammaticalGender(int arg0) {
        real.setRequestedApplicationGrammaticalGender(arg0);
    }

}
