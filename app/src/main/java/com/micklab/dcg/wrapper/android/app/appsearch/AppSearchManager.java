// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchManager {
    private final android.app.appsearch.AppSearchManager real;

    public AppSearchManager(android.app.appsearch.AppSearchManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager wrap(android.app.appsearch.AppSearchManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager(real);
    }

    public android.app.appsearch.AppSearchManager unwrap() {
        return real;
    }

    public static final class SearchContext {
        private final android.app.appsearch.AppSearchManager.SearchContext real;

        public SearchContext(android.app.appsearch.AppSearchManager.SearchContext real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext wrap(android.app.appsearch.AppSearchManager.SearchContext real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext(real);
        }

        public android.app.appsearch.AppSearchManager.SearchContext unwrap() {
            return real;
        }

        public java.lang.String getDatabaseName() {
            return real.getDatabaseName();
        }

        public static final class Builder {
            private final android.app.appsearch.AppSearchManager.SearchContext.Builder real;

            public Builder(android.app.appsearch.AppSearchManager.SearchContext.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext.Builder wrap(android.app.appsearch.AppSearchManager.SearchContext.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext.Builder(real);
            }

            public android.app.appsearch.AppSearchManager.SearchContext.Builder unwrap() {
                return real;
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.appsearch.AppSearchManager.SearchContext.Builder(arg0));
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext build() {
                return com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext.wrap(real.build());
            }

        }
    }
}
