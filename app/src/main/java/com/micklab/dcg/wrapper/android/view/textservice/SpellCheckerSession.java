// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.textservice;

public final class SpellCheckerSession {
    private final android.view.textservice.SpellCheckerSession real;

    public SpellCheckerSession(android.view.textservice.SpellCheckerSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession wrap(android.view.textservice.SpellCheckerSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession(real);
    }

    public android.view.textservice.SpellCheckerSession unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public void close() {
        real.close();
    }

    public void getSentenceSuggestions(android.view.textservice.TextInfo[] arg0, int arg1) {
        real.getSentenceSuggestions(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo getSpellChecker() {
        return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerInfo.wrap(real.getSpellChecker());
    }

    public void getSuggestions(com.micklab.dcg.wrapper.android.view.textservice.TextInfo arg0, int arg1) {
        real.getSuggestions(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void getSuggestions(android.view.textservice.TextInfo[] arg0, int arg1, boolean arg2) {
        real.getSuggestions(arg0, arg1, arg2);
    }

    public boolean isSessionDisconnected() {
        return real.isSessionDisconnected();
    }

    public static final java.lang.String SERVICE_META_DATA = android.view.textservice.SpellCheckerSession.SERVICE_META_DATA;

    public static final class SpellCheckerSessionListener {
        private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener real;

        public SpellCheckerSessionListener(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener wrap(android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener(real);
        }

        public android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener unwrap() {
            return real;
        }

        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] arg0) {
            real.onGetSentenceSuggestions(arg0);
        }

        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] arg0) {
            real.onGetSuggestions(arg0);
        }

    }
    public static final class SpellCheckerSessionParams {
        private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams real;

        public SpellCheckerSessionParams(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams wrap(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams(real);
        }

        public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public java.util.Locale getLocale() {
            return real.getLocale();
        }

        public int getSupportedAttributes() {
            return real.getSupportedAttributes();
        }

        public boolean shouldReferToSpellCheckerLanguageSettings() {
            return real.shouldReferToSpellCheckerLanguageSettings();
        }

        public static final class Builder {
            private final android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder real;

            public Builder(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder wrap(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder(real);
            }

            public android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder unwrap() {
                return real;
            }

            public Builder() {
                this(new android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder());
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams build() {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setLocale(java.util.Locale arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(real.setLocale(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setShouldReferToSpellCheckerLanguageSettings(boolean arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(real.setShouldReferToSpellCheckerLanguageSettings(arg0));
            }

            public com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder setSupportedAttributes(int arg0) {
                return com.micklab.dcg.wrapper.android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams.Builder.wrap(real.setSupportedAttributes(arg0));
            }

        }
    }
}
