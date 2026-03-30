// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.textservice;

public final class SpellCheckerService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpellCheckerService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService wrap(android.service.textservice.SpellCheckerService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService(real, (__DcgwBridgeToken) null);
    }

    public android.service.textservice.SpellCheckerService getReal() {
        return (android.service.textservice.SpellCheckerService) real;
    }

    public android.service.textservice.SpellCheckerService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session createSession() {
        return com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session.wrap(((android.service.textservice.SpellCheckerService) real).createSession());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.textservice.SpellCheckerService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.textservice.SpellCheckerService.SERVICE_INTERFACE;

    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session wrap(android.service.textservice.SpellCheckerService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.textservice.SpellCheckerService.Session(real, (__DcgwBridgeToken) null);
        }

        public android.service.textservice.SpellCheckerService.Session getReal() {
            return (android.service.textservice.SpellCheckerService.Session) real;
        }

        public android.service.textservice.SpellCheckerService.Session unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getBundle() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.textservice.SpellCheckerService.Session) real).getBundle());
        }

        public java.lang.String getLocale() {
            return ((android.service.textservice.SpellCheckerService.Session) real).getLocale();
        }

        public int getSupportedAttributes() {
            return ((android.service.textservice.SpellCheckerService.Session) real).getSupportedAttributes();
        }

        public void onCancel() {
            ((android.service.textservice.SpellCheckerService.Session) real).onCancel();
        }

        public void onClose() {
            ((android.service.textservice.SpellCheckerService.Session) real).onClose();
        }

        public void onCreate() {
            ((android.service.textservice.SpellCheckerService.Session) real).onCreate();
        }

        public android.view.textservice.SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] arg0, int arg1) {
            return ((android.service.textservice.SpellCheckerService.Session) real).onGetSentenceSuggestionsMultiple(arg0, arg1);
        }

        public com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo onGetSuggestions(com.micklab.dcg.wrapper.android.view.textservice.TextInfo arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.view.textservice.SuggestionsInfo.wrap(((android.service.textservice.SpellCheckerService.Session) real).onGetSuggestions(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public android.view.textservice.SuggestionsInfo[] onGetSuggestionsMultiple(android.view.textservice.TextInfo[] arg0, int arg1, boolean arg2) {
            return ((android.service.textservice.SpellCheckerService.Session) real).onGetSuggestionsMultiple(arg0, arg1, arg2);
        }

    }
}
