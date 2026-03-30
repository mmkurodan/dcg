// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchSuggestionResult {
    private final android.app.appsearch.SearchSuggestionResult real;

    public SearchSuggestionResult(android.app.appsearch.SearchSuggestionResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult wrap(android.app.appsearch.SearchSuggestionResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult(real);
    }

    public android.app.appsearch.SearchSuggestionResult unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getSuggestedResult() {
        return real.getSuggestedResult();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.app.appsearch.SearchSuggestionResult.Builder real;

        public Builder(android.app.appsearch.SearchSuggestionResult.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder wrap(android.app.appsearch.SearchSuggestionResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder(real);
        }

        public android.app.appsearch.SearchSuggestionResult.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.app.appsearch.SearchSuggestionResult.Builder());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder setSuggestedResult(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder.wrap(real.setSuggestedResult(arg0));
        }

    }
}
