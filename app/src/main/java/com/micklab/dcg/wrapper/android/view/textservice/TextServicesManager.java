// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class TextServicesManager {
    private final android.view.textservice.TextServicesManager real;

    public TextServicesManager(android.view.textservice.TextServicesManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.TextServicesManager wrap(android.view.textservice.TextServicesManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.TextServicesManager(real);
    }

    public android.view.textservice.TextServicesManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo getCurrentSpellCheckerInfo() {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo.wrap(real.getCurrentSpellCheckerInfo());
    }

    public boolean isSpellCheckerEnabled() {
        return real.isSpellCheckerEnabled();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession newSpellCheckerSession(com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener arg2) {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.wrap(real.newSpellCheckerSession(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession newSpellCheckerSession(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.util.Locale arg1, com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.wrap(real.newSpellCheckerSession(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

}
