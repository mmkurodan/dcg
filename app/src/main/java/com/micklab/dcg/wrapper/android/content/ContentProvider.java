// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProvider wrap(android.content.ContentProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProvider(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentProvider getReal() {
        return (android.content.ContentProvider) real;
    }

    public android.content.ContentProvider unwrap() {
        return getReal();
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        ((android.content.ContentProvider) real).attachInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int bulkInsert(com.micklab.dcg.wrapper.android.net.Uri arg0, android.content.ContentValues[] arg1) {
        return ((android.content.ContentProvider) real).bulkInsert(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentProvider) real).call(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentProvider) real).call(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProvider) real).canonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.ContentProvider.CallingIdentity clearCallingIdentity() {
        return com.micklab.dcg.wrapper.android.content.ContentProvider.CallingIdentity.wrap(((android.content.ContentProvider) real).clearCallingIdentity());
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.content.ContentProvider) real).delete(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return ((android.content.ContentProvider) real).delete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void dump(java.io.FileDescriptor arg0, java.io.PrintWriter arg1, java.lang.String[] arg2) {
        ((android.content.ContentProvider) real).dump(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getCallingAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(((android.content.ContentProvider) real).getCallingAttributionSource());
    }

    public java.lang.String getCallingAttributionTag() {
        return ((android.content.ContentProvider) real).getCallingAttributionTag();
    }

    public java.lang.String getCallingPackage() {
        return ((android.content.ContentProvider) real).getCallingPackage();
    }

    public java.lang.String getCallingPackageUnchecked() {
        return ((android.content.ContentProvider) real).getCallingPackageUnchecked();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContentProvider) real).getContext());
    }

    public android.content.pm.PathPermission[] getPathPermissions() {
        return ((android.content.ContentProvider) real).getPathPermissions();
    }

    public java.lang.String getReadPermission() {
        return ((android.content.ContentProvider) real).getReadPermission();
    }

    public java.lang.String[] getStreamTypes(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return ((android.content.ContentProvider) real).getStreamTypes(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.ContentProvider) real).getType(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getTypeAnonymous(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.content.ContentProvider) real).getTypeAnonymous(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getWritePermission() {
        return ((android.content.ContentProvider) real).getWritePermission();
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProvider) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProvider) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void onCallingPackageChanged() {
        ((android.content.ContentProvider) real).onCallingPackageChanged();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.content.ContentProvider) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public boolean onCreate() {
        return ((android.content.ContentProvider) real).onCreate();
    }

    public void onLowMemory() {
        ((android.content.ContentProvider) real).onLowMemory();
    }

    public void onTrimMemory(int arg0) {
        ((android.content.ContentProvider) real).onTrimMemory(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProvider#openAssetFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProvider#openAssetFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProvider#openFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProvider#openFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProvider#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProvider#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public boolean refresh(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) {
        return ((android.content.ContentProvider) real).refresh(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.Context requireContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContentProvider) real).requireContext());
    }

    public void restoreCallingIdentity(com.micklab.dcg.wrapper.android.content.ContentProvider.CallingIdentity arg0) {
        ((android.content.ContentProvider) real).restoreCallingIdentity(arg0 == null ? null : arg0.getReal());
    }

    public void shutdown() {
        ((android.content.ContentProvider) real).shutdown();
    }

    public com.micklab.dcg.wrapper.android.net.Uri uncanonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProvider) real).uncanonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.content.ContentProvider) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return ((android.content.ContentProvider) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public static final class CallingIdentity {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CallingIdentity(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProvider.CallingIdentity wrap(android.content.ContentProvider.CallingIdentity real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProvider.CallingIdentity(real, (__DcgwBridgeToken) null);
        }

        public android.content.ContentProvider.CallingIdentity getReal() {
            return (android.content.ContentProvider.CallingIdentity) real;
        }

        public android.content.ContentProvider.CallingIdentity unwrap() {
            return getReal();
        }


    }
    public static final class PipeDataWriter {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PipeDataWriter(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProvider.PipeDataWriter wrap(android.content.ContentProvider.PipeDataWriter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProvider.PipeDataWriter(real, (__DcgwBridgeToken) null);
        }

        public android.content.ContentProvider.PipeDataWriter getReal() {
            return (android.content.ContentProvider.PipeDataWriter) real;
        }

        public android.content.ContentProvider.PipeDataWriter unwrap() {
            return getReal();
        }

        public void writeDataToPipe(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, java.lang.Object arg4) {
            ((android.content.ContentProvider.PipeDataWriter) real).writeDataToPipe(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4);
        }

    }
}
