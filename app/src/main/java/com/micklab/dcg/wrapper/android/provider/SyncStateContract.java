// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class SyncStateContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncStateContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.SyncStateContract wrap(android.provider.SyncStateContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract(real, (__DcgwBridgeToken) null);
    }

    public android.provider.SyncStateContract getReal() {
        return (android.provider.SyncStateContract) real;
    }

    public android.provider.SyncStateContract unwrap() {
        return getReal();
    }

    public SyncStateContract() {
        this(new android.provider.SyncStateContract(), (__DcgwBridgeToken) null);
    }

    public static final class Columns {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Columns(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SyncStateContract.Columns wrap(android.provider.SyncStateContract.Columns real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract.Columns(real, (__DcgwBridgeToken) null);
        }

        public android.provider.SyncStateContract.Columns getReal() {
            return (android.provider.SyncStateContract.Columns) real;
        }

        public android.provider.SyncStateContract.Columns unwrap() {
            return getReal();
        }

        public static final java.lang.String ACCOUNT_NAME = android.provider.SyncStateContract.Columns.ACCOUNT_NAME;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.SyncStateContract.Columns.ACCOUNT_TYPE;
        public static final java.lang.String DATA = android.provider.SyncStateContract.Columns.DATA;

    }
    public static final class Constants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Constants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SyncStateContract.Constants wrap(android.provider.SyncStateContract.Constants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract.Constants(real, (__DcgwBridgeToken) null);
        }

        public android.provider.SyncStateContract.Constants getReal() {
            return (android.provider.SyncStateContract.Constants) real;
        }

        public android.provider.SyncStateContract.Constants unwrap() {
            return getReal();
        }

        public Constants() {
            this(new android.provider.SyncStateContract.Constants(), (__DcgwBridgeToken) null);
        }

        public static final java.lang.String CONTENT_DIRECTORY = android.provider.SyncStateContract.Constants.CONTENT_DIRECTORY;

    }
    public static final class Helpers {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Helpers(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SyncStateContract.Helpers wrap(android.provider.SyncStateContract.Helpers real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SyncStateContract.Helpers(real, (__DcgwBridgeToken) null);
        }

        public android.provider.SyncStateContract.Helpers getReal() {
            return (android.provider.SyncStateContract.Helpers) real;
        }

        public android.provider.SyncStateContract.Helpers unwrap() {
            return getReal();
        }

        public Helpers() {
            this(new android.provider.SyncStateContract.Helpers(), (__DcgwBridgeToken) null);
        }

        public static byte[] get(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.accounts.Account arg2) throws android.os.RemoteException {
            return android.provider.SyncStateContract.Helpers.get(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public static com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.accounts.Account arg2, byte[] arg3) throws android.os.RemoteException {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SyncStateContract.Helpers.insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3));
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation newSetOperation(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.accounts.Account arg1, byte[] arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(android.provider.SyncStateContract.Helpers.newSetOperation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation newUpdateOperation(com.micklab.dcg.wrapper.android.net.Uri arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(android.provider.SyncStateContract.Helpers.newUpdateOperation(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public static void set(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.accounts.Account arg2, byte[] arg3) throws android.os.RemoteException {
            android.provider.SyncStateContract.Helpers.set(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
        }

        public static void update(com.micklab.dcg.wrapper.android.content.ContentProviderClient arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, byte[] arg2) throws android.os.RemoteException {
            android.provider.SyncStateContract.Helpers.update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

    }
}
