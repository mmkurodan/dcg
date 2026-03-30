// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class SyncStateContract {
    private final android.provider.SyncStateContract real;

    public SyncStateContract(android.provider.SyncStateContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.SyncStateContract wrap(android.provider.SyncStateContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract(real);
    }

    public android.provider.SyncStateContract unwrap() {
        return real;
    }

    public SyncStateContract() {
        this(new android.provider.SyncStateContract());
    }

    public static final class Columns {
        private final android.provider.SyncStateContract.Columns real;

        public Columns(android.provider.SyncStateContract.Columns real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SyncStateContract.Columns wrap(android.provider.SyncStateContract.Columns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract.Columns(real);
        }

        public android.provider.SyncStateContract.Columns unwrap() {
            return real;
        }

        public static final java.lang.String ACCOUNT_NAME = android.provider.SyncStateContract.Columns.ACCOUNT_NAME;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.SyncStateContract.Columns.ACCOUNT_TYPE;
        public static final java.lang.String DATA = android.provider.SyncStateContract.Columns.DATA;

    }
    public static final class Constants {
        private final android.provider.SyncStateContract.Constants real;

        public Constants(android.provider.SyncStateContract.Constants real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SyncStateContract.Constants wrap(android.provider.SyncStateContract.Constants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract.Constants(real);
        }

        public android.provider.SyncStateContract.Constants unwrap() {
            return real;
        }

        public Constants() {
            this(new android.provider.SyncStateContract.Constants());
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.SyncStateContract.Constants.CONTENT_DIRECTORY;

    }
    public static final class Helpers {
        private final android.provider.SyncStateContract.Helpers real;

        public Helpers(android.provider.SyncStateContract.Helpers real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SyncStateContract.Helpers wrap(android.provider.SyncStateContract.Helpers real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract.Helpers(real);
        }

        public android.provider.SyncStateContract.Helpers unwrap() {
            return real;
        }

        public Helpers() {
            this(new android.provider.SyncStateContract.Helpers());
        }

        public static byte[] get(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.accounts.Account arg2) throws android.os.RemoteException {
            return android.provider.SyncStateContract.Helpers.get(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public static com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.accounts.Account arg2, byte[] arg3) throws android.os.RemoteException {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SyncStateContract.Helpers.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation newSetOperation(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(android.provider.SyncStateContract.Helpers.newSetOperation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation newUpdateOperation(com.micklab.dcg.wrapper.android.net.Uri arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(android.provider.SyncStateContract.Helpers.newUpdateOperation(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public static void set(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.accounts.Account arg2, byte[] arg3) throws android.os.RemoteException {
            android.provider.SyncStateContract.Helpers.set(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
        }

        public static void update(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, byte[] arg2) throws android.os.RemoteException {
            android.provider.SyncStateContract.Helpers.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

    }
}
