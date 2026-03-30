// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.textservice;

public final class SpellCheckerService {
    private final android.service.textservice.SpellCheckerService real;

    public SpellCheckerService(android.service.textservice.SpellCheckerService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService wrap(android.service.textservice.SpellCheckerService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService(real);
    }

    public android.service.textservice.SpellCheckerService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session createSession() {
        return com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session.wrap(real.createSession());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.textservice.SpellCheckerService.SERVICE_INTERFACE;

    public static final class Session {
        private final android.service.textservice.SpellCheckerService.Session real;

        public Session(android.service.textservice.SpellCheckerService.Session real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session wrap(android.service.textservice.SpellCheckerService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session(real);
        }

        public android.service.textservice.SpellCheckerService.Session unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getBundle() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getBundle());
        }

        public java.lang.String getLocale() {
            return real.getLocale();
        }

        public int getSupportedAttributes() {
            return real.getSupportedAttributes();
        }

        public void onCancel() {
            real.onCancel();
        }

        public void onClose() {
            real.onClose();
        }

        public void onCreate() {
            real.onCreate();
        }

        public android.view.textservice.SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] arg0, int arg1) {
            return real.onGetSentenceSuggestionsMultiple(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo onGetSuggestions(com.micklab.dcg.wrapper.android.view.textservice.TextInfo arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo.wrap(real.onGetSuggestions(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public android.view.textservice.SuggestionsInfo[] onGetSuggestionsMultiple(android.view.textservice.TextInfo[] arg0, int arg1, boolean arg2) {
            return real.onGetSuggestionsMultiple(arg0, arg1, arg2);
        }

    }
}
