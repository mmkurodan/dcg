// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class TextServicesManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextServicesManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.TextServicesManager wrap(android.view.textservice.TextServicesManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.TextServicesManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.textservice.TextServicesManager getReal() {
        return (android.view.textservice.TextServicesManager) real;
    }

    public android.view.textservice.TextServicesManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo getCurrentSpellCheckerInfo() {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo.wrap(((android.view.textservice.TextServicesManager) real).getCurrentSpellCheckerInfo());
    }

    public boolean isSpellCheckerEnabled() {
        return ((android.view.textservice.TextServicesManager) real).isSpellCheckerEnabled();
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession newSpellCheckerSession(com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener arg2) {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.wrap(((android.view.textservice.TextServicesManager) real).newSpellCheckerSession(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession newSpellCheckerSession(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.util.Locale arg1, com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.wrap(((android.view.textservice.TextServicesManager) real).newSpellCheckerSession(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

}
