// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class AppSearchManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSearchManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager wrap(android.app.appsearch.AppSearchManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.AppSearchManager getReal() {
        return (android.app.appsearch.AppSearchManager) real;
    }

    public android.app.appsearch.AppSearchManager unwrap() {
        return getReal();
    }

    public static final class SearchContext {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SearchContext(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext wrap(android.app.appsearch.AppSearchManager.SearchContext real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext(real, (__DcgwBridgeToken) null);
        }

        public android.app.appsearch.AppSearchManager.SearchContext getReal() {
            return (android.app.appsearch.AppSearchManager.SearchContext) real;
        }

        public android.app.appsearch.AppSearchManager.SearchContext unwrap() {
            return getReal();
        }

        public java.lang.String getDatabaseName() {
            return ((android.app.appsearch.AppSearchManager.SearchContext) real).getDatabaseName();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext.Builder wrap(android.app.appsearch.AppSearchManager.SearchContext.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.app.appsearch.AppSearchManager.SearchContext.Builder getReal() {
                return (android.app.appsearch.AppSearchManager.SearchContext.Builder) real;
            }

            public android.app.appsearch.AppSearchManager.SearchContext.Builder unwrap() {
                return getReal();
            }

            public Builder(java.lang.String arg0) {
                this(new android.app.appsearch.AppSearchManager.SearchContext.Builder(arg0), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext build() {
                return com.micklab.dcg.wrapper.android.app.appsearch.AppSearchManager.SearchContext.wrap(((android.app.appsearch.AppSearchManager.SearchContext.Builder) real).build());
            }

        }
    }
}
