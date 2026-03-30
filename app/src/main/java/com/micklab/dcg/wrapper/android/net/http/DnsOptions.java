// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class DnsOptions {
    private final android.net.http.DnsOptions real;

    public DnsOptions(android.net.http.DnsOptions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.DnsOptions wrap(android.net.http.DnsOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.DnsOptions(real);
    }

    public android.net.http.DnsOptions unwrap() {
        return real;
    }

    public int getPersistHostCache() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions#getPersistHostCache()");
    }

    public java.time.Duration getPersistHostCachePeriod() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions#getPersistHostCachePeriod()");
    }

    public int getPreestablishConnectionsToStaleDnsResults() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions#getPreestablishConnectionsToStaleDnsResults()");
    }

    public int getStaleDns() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions#getStaleDns()");
    }

    public com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions getStaleDnsOptions() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions#getStaleDnsOptions()");
    }

    public int getUseHttpStackDnsResolver() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions#getUseHttpStackDnsResolver()");
    }


    public static final class Builder {
        private final android.net.http.DnsOptions.Builder real;

        public Builder(android.net.http.DnsOptions.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder wrap(android.net.http.DnsOptions.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder(real);
        }

        public android.net.http.DnsOptions.Builder unwrap() {
            return real;
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#android.net.http.DnsOptions$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder setPersistHostCache(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#setPersistHostCache(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder setPersistHostCachePeriod(java.time.Duration arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#setPersistHostCachePeriod(java.time.Duration)");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder setPreestablishConnectionsToStaleDnsResults(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#setPreestablishConnectionsToStaleDnsResults(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder setStaleDns(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#setStaleDns(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder setStaleDnsOptions(com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#setStaleDnsOptions(android.net.http.DnsOptions$StaleDnsOptions)");
        }

        public com.micklab.dcg.wrapper.android.net.http.DnsOptions.Builder setUseHttpStackDnsResolver(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$Builder#setUseHttpStackDnsResolver(int)");
        }

    }
    public static final class StaleDnsOptions {
        private final android.net.http.DnsOptions.StaleDnsOptions real;

        public StaleDnsOptions(android.net.http.DnsOptions.StaleDnsOptions real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions wrap(android.net.http.DnsOptions.StaleDnsOptions real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions(real);
        }

        public android.net.http.DnsOptions.StaleDnsOptions unwrap() {
            return real;
        }

        public int getAllowCrossNetworkUsage() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions#getAllowCrossNetworkUsage()");
        }

        public java.time.Duration getFreshLookupTimeout() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions#getFreshLookupTimeout()");
        }

        public java.time.Duration getMaxExpiredDelay() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions#getMaxExpiredDelay()");
        }

        public int getUseStaleOnNameNotResolved() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions#getUseStaleOnNameNotResolved()");
        }

        public static final class Builder {
            private final android.net.http.DnsOptions.StaleDnsOptions.Builder real;

            public Builder(android.net.http.DnsOptions.StaleDnsOptions.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions.Builder wrap(android.net.http.DnsOptions.StaleDnsOptions.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions.Builder(real);
            }

            public android.net.http.DnsOptions.StaleDnsOptions.Builder unwrap() {
                return real;
            }

            public Builder() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions$Builder#android.net.http.DnsOptions$StaleDnsOptions$Builder()");
            }

            public com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions build() {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions$Builder#build()");
            }

            public com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions.Builder setAllowCrossNetworkUsage(int arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions$Builder#setAllowCrossNetworkUsage(int)");
            }

            public com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeout(java.time.Duration arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions$Builder#setFreshLookupTimeout(java.time.Duration)");
            }

            public com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelay(java.time.Duration arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions$Builder#setMaxExpiredDelay(java.time.Duration)");
            }

            public com.micklab.dcg.wrapper.android.net.http.DnsOptions.StaleDnsOptions.Builder setUseStaleOnNameNotResolved(int arg0) {
                throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.DnsOptions$StaleDnsOptions$Builder#setUseStaleOnNameNotResolved(int)");
            }

        }
    }
}
