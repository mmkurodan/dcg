// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebStorage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebStorage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebStorage wrap(android.webkit.WebStorage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebStorage(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebStorage getReal() {
        return (android.webkit.WebStorage) real;
    }

    public android.webkit.WebStorage unwrap() {
        return getReal();
    }

    public void deleteAllData() {
        ((android.webkit.WebStorage) real).deleteAllData();
    }

    public void deleteOrigin(java.lang.String arg0) {
        ((android.webkit.WebStorage) real).deleteOrigin(arg0);
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebStorage getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.WebStorage.wrap(android.webkit.WebStorage.getInstance());
    }

    public void setQuotaForOrigin(java.lang.String arg0, long arg1) {
        ((android.webkit.WebStorage) real).setQuotaForOrigin(arg0, arg1);
    }

    public static final class Origin {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Origin(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebStorage.Origin wrap(android.webkit.WebStorage.Origin real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebStorage.Origin(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebStorage.Origin getReal() {
            return (android.webkit.WebStorage.Origin) real;
        }

        public android.webkit.WebStorage.Origin unwrap() {
            return getReal();
        }

        public java.lang.String getOrigin() {
            return ((android.webkit.WebStorage.Origin) real).getOrigin();
        }

        public long getQuota() {
            return ((android.webkit.WebStorage.Origin) real).getQuota();
        }

        public long getUsage() {
            return ((android.webkit.WebStorage.Origin) real).getUsage();
        }

    }
    public static final class QuotaUpdater {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private QuotaUpdater(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebStorage.QuotaUpdater wrap(android.webkit.WebStorage.QuotaUpdater real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebStorage.QuotaUpdater(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebStorage.QuotaUpdater getReal() {
            return (android.webkit.WebStorage.QuotaUpdater) real;
        }

        public android.webkit.WebStorage.QuotaUpdater unwrap() {
            return getReal();
        }

        public void updateQuota(long arg0) {
            ((android.webkit.WebStorage.QuotaUpdater) real).updateQuota(arg0);
        }

    }
}
