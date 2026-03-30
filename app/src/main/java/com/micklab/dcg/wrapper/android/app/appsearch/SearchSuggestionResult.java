// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class SearchSuggestionResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SearchSuggestionResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult wrap(android.app.appsearch.SearchSuggestionResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.SearchSuggestionResult getReal() {
        return (android.app.appsearch.SearchSuggestionResult) real;
    }

    public android.app.appsearch.SearchSuggestionResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.appsearch.SearchSuggestionResult) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.appsearch.SearchSuggestionResult) real).equals(arg0);
    }

    public java.lang.String getSuggestedResult() {
        return ((android.app.appsearch.SearchSuggestionResult) real).getSuggestedResult();
    }

    public int hashCode() {
        return ((android.app.appsearch.SearchSuggestionResult) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.appsearch.SearchSuggestionResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder wrap(android.app.appsearch.SearchSuggestionResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.SearchSuggestionResult.Builder getReal() {
            return (android.app.appsearch.SearchSuggestionResult.Builder) real;
        }

        public android.app.appsearch.SearchSuggestionResult.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.app.appsearch.SearchSuggestionResult.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult build() {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.wrap(((android.app.appsearch.SearchSuggestionResult.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder setSuggestedResult(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.appsearch.SearchSuggestionResult.Builder.wrap(((android.app.appsearch.SearchSuggestionResult.Builder) real).setSuggestedResult(arg0));
        }

    }
}
