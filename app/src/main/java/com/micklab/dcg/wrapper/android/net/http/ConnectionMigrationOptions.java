// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class ConnectionMigrationOptions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConnectionMigrationOptions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions wrap(android.net.http.ConnectionMigrationOptions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.ConnectionMigrationOptions getReal() {
        return (android.net.http.ConnectionMigrationOptions) real;
    }

    public android.net.http.ConnectionMigrationOptions unwrap() {
        return getReal();
    }

    public int getAllowNonDefaultNetworkUsage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions#getAllowNonDefaultNetworkUsage()");
    }

    public int getDefaultNetworkMigration() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions#getDefaultNetworkMigration()");
    }

    public int getPathDegradationMigration() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions#getPathDegradationMigration()");
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions.Builder wrap(android.net.http.ConnectionMigrationOptions.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.net.http.ConnectionMigrationOptions.Builder getReal() {
            return (android.net.http.ConnectionMigrationOptions.Builder) real;
        }

        public android.net.http.ConnectionMigrationOptions.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions$Builder#android.net.http.ConnectionMigrationOptions$Builder()");
        }

        public com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions build() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions$Builder#build()");
        }

        public com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions.Builder setAllowNonDefaultNetworkUsage(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions$Builder#setAllowNonDefaultNetworkUsage(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions.Builder setDefaultNetworkMigration(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions$Builder#setDefaultNetworkMigration(int)");
        }

        public com.micklab.dcg.wrapper.android.net.http.ConnectionMigrationOptions.Builder setPathDegradationMigration(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.ConnectionMigrationOptions$Builder#setPathDegradationMigration(int)");
        }

    }
}
