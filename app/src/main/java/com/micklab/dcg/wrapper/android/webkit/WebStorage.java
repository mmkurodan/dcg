// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebStorage {
    private final android.webkit.WebStorage real;

    public WebStorage(android.webkit.WebStorage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebStorage wrap(android.webkit.WebStorage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebStorage(real);
    }

    public android.webkit.WebStorage unwrap() {
        return real;
    }

    public void deleteAllData() {
        real.deleteAllData();
    }

    public void deleteOrigin(java.lang.String arg0) {
        real.deleteOrigin(arg0);
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebStorage getInstance() {
        return com.micklab.dcg.wrapper.android.webkit.WebStorage.wrap(android.webkit.WebStorage.getInstance());
    }

    public void setQuotaForOrigin(java.lang.String arg0, long arg1) {
        real.setQuotaForOrigin(arg0, arg1);
    }

    public static final class Origin {
        private final android.webkit.WebStorage.Origin real;

        public Origin(android.webkit.WebStorage.Origin real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebStorage.Origin wrap(android.webkit.WebStorage.Origin real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebStorage.Origin(real);
        }

        public android.webkit.WebStorage.Origin unwrap() {
            return real;
        }

        public java.lang.String getOrigin() {
            return real.getOrigin();
        }

        public long getQuota() {
            return real.getQuota();
        }

        public long getUsage() {
            return real.getUsage();
        }

    }
    public static final class QuotaUpdater {
        private final android.webkit.WebStorage.QuotaUpdater real;

        public QuotaUpdater(android.webkit.WebStorage.QuotaUpdater real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebStorage.QuotaUpdater wrap(android.webkit.WebStorage.QuotaUpdater real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebStorage.QuotaUpdater(real);
        }

        public android.webkit.WebStorage.QuotaUpdater unwrap() {
            return real;
        }

        public void updateQuota(long arg0) {
            real.updateQuota(arg0);
        }

    }
}
