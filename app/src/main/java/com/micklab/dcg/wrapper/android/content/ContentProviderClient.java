// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProviderClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentProviderClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderClient wrap(android.content.ContentProviderClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderClient(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentProviderClient getReal() {
        return (android.content.ContentProviderClient) real;
    }

    public android.content.ContentProviderClient unwrap() {
        return getReal();
    }

    public int bulkInsert(com.micklab.dcg.wrapper.android.net.Uri arg0, android.content.ContentValues[] arg1) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).bulkInsert(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentProviderClient) real).call(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentProviderClient) real).call(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProviderClient) real).canonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public void close() {
        ((android.content.ContentProviderClient) real).close();
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).delete(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).delete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.ContentProvider getLocalContentProvider() {
        return com.micklab.dcg.wrapper.android.content.ContentProvider.wrap(((android.content.ContentProviderClient) real).getLocalContentProvider());
    }

    public java.lang.String[] getStreamTypes(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).getStreamTypes(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).getType(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProviderClient) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProviderClient) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openAssetFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openAssetFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openTypedAssetFileDescriptor(android.net.Uri,java.lang.String,android.os.Bundle)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException, android.os.RemoteException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContentProviderClient#openTypedAssetFileDescriptor(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentProviderClient) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentProviderClient) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.content.ContentProviderClient) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public boolean refresh(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).refresh(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean release() {
        return ((android.content.ContentProviderClient) real).release();
    }

    public com.micklab.dcg.wrapper.android.net.Uri uncanonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) throws android.os.RemoteException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProviderClient) real).uncanonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) throws android.os.RemoteException {
        return ((android.content.ContentProviderClient) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

}
