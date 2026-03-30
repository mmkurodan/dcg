// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchSuggestionSpec {
    private final android.app.appsearch.SearchSuggestionSpec real;

    public SearchSuggestionSpec(android.app.appsearch.SearchSuggestionSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec wrap(android.app.appsearch.SearchSuggestionSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec(real);
    }

    public android.app.appsearch.SearchSuggestionSpec unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getMaximumResultCount() {
        return real.getMaximumResultCount();
    }

    public int getRankingStrategy() {
        return real.getRankingStrategy();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT = android.app.appsearch.SearchSuggestionSpec.SUGGESTION_RANKING_STRATEGY_DOCUMENT_COUNT;
    public static final int SUGGESTION_RANKING_STRATEGY_NONE = android.app.appsearch.SearchSuggestionSpec.SUGGESTION_RANKING_STRATEGY_NONE;
    public static final int SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY = android.app.appsearch.SearchSuggestionSpec.SUGGESTION_RANKING_STRATEGY_TERM_FREQUENCY;

    public static final class Builder {
        private final android.app.appsearch.SearchSuggestionSpec.Builder real;

        public Builder(android.app.appsearch.SearchSuggestionSpec.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder wrap(android.app.appsearch.SearchSuggestionSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder(real);
        }

        public android.app.appsearch.SearchSuggestionSpec.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.app.appsearch.SearchSuggestionSpec.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addFilterDocumentIds(java.lang.String arg0, java.lang.String... arg1) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(real.addFilterDocumentIds(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addFilterNamespaces(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(real.addFilterNamespaces(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder addFilterSchemas(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(real.addFilterSchemas(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder setRankingStrategy(int arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionSpec.Builder.wrap(real.setRankingStrategy(arg0));
        }

    }
}
