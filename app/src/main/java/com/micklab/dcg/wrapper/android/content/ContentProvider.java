// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProvider {
    private final android.content.ContentProvider real;

    public ContentProvider(android.content.ContentProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProvider wrap(android.content.ContentProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProvider(real);
    }

    public android.content.ContentProvider unwrap() {
        return real;
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        real.attachInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int bulkInsert(com.micklab.dcg.wrapper.android.net.Uri arg0, android.content.ContentValues[] arg1) {
        return real.bulkInsert(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.call(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.call(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.canonicalize(arg0 == null ? null : arg0.unwrap()));
    }

    public android.content.ContentProvider.CallingIdentity clearCallingIdentity() {
        return real.clearCallingIdentity();
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.delete(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return real.delete(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void dump(java.io.FileDescriptor arg0, java.io.PrintWriter arg1, java.lang.String[] arg2) {
        real.dump(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getCallingAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(real.getCallingAttributionSource());
    }

    public java.lang.String getCallingAttributionTag() {
        return real.getCallingAttributionTag();
    }

    public java.lang.String getCallingPackage() {
        return real.getCallingPackage();
    }

    public java.lang.String getCallingPackageUnchecked() {
        return real.getCallingPackageUnchecked();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public android.content.pm.PathPermission[] getPathPermissions() {
        return real.getPathPermissions();
    }

    public java.lang.String getReadPermission() {
        return real.getReadPermission();
    }

    public java.lang.String[] getStreamTypes(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return real.getStreamTypes(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getType(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getTypeAnonymous(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return real.getTypeAnonymous(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getWritePermission() {
        return real.getWritePermission();
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void onCallingPackageChanged() {
        real.onCallingPackageChanged();
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onCreate() {
        return real.onCreate();
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
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
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public boolean refresh(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) {
        return real.refresh(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.Context requireContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.requireContext());
    }

    public void restoreCallingIdentity(android.content.ContentProvider.CallingIdentity arg0) {
        real.restoreCallingIdentity(arg0);
    }

    public void shutdown() {
        real.shutdown();
    }

    public com.micklab.dcg.wrapper.android.net.Uri uncanonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.uncanonicalize(arg0 == null ? null : arg0.unwrap()));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return real.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public static final class PipeDataWriter {
        private final android.content.ContentProvider.PipeDataWriter real;

        public PipeDataWriter(android.content.ContentProvider.PipeDataWriter real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProvider.PipeDataWriter wrap(android.content.ContentProvider.PipeDataWriter real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProvider.PipeDataWriter(real);
        }

        public android.content.ContentProvider.PipeDataWriter unwrap() {
            return real;
        }

        public void writeDataToPipe(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3, java.lang.Object arg4) {
            real.writeDataToPipe(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4);
        }

    }
}
