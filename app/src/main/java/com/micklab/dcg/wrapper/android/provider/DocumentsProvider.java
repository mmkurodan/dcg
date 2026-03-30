// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class DocumentsProvider {
    private final android.provider.DocumentsProvider real;

    public DocumentsProvider(android.provider.DocumentsProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.DocumentsProvider wrap(android.provider.DocumentsProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.DocumentsProvider(real);
    }

    public android.provider.DocumentsProvider unwrap() {
        return real;
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        real.attachInfo(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.call(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.canonicalize(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String copyDocument(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return real.copyDocument(arg0, arg1);
    }

    public java.lang.String createDocument(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return real.createDocument(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender createWebLinkIntent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(real.createWebLinkIntent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return real.delete(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void deleteDocument(java.lang.String arg0) throws java.io.FileNotFoundException {
        real.deleteDocument(arg0);
    }

    public void ejectRoot(java.lang.String arg0) {
        real.ejectRoot(arg0);
    }

    public com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path findDocumentPath(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path.wrap(real.findDocumentPath(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getDocumentMetadata(java.lang.String arg0) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getDocumentMetadata(arg0));
    }

    public java.lang.String[] getDocumentStreamTypes(java.lang.String arg0, java.lang.String arg1) {
        return real.getDocumentStreamTypes(arg0, arg1);
    }

    public java.lang.String getDocumentType(java.lang.String arg0) throws java.io.FileNotFoundException {
        return real.getDocumentType(arg0);
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

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.insert(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public boolean isChildDocument(java.lang.String arg0, java.lang.String arg1) {
        return real.isChildDocument(arg0, arg1);
    }

    public java.lang.String moveDocument(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return real.moveDocument(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openAssetFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openAssetFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openDocument(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.openDocument(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openDocumentThumbnail(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(real.openDocumentThumbnail(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openTypedAssetFile(android.net.Uri,java.lang.String,android.os.Bundle,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openTypedDocument(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(real.openTypedDocument(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
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

    public com.micklab.dcg.wrapper.android.database.Cursor queryChildDocuments(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.queryChildDocuments(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryChildDocuments(java.lang.String arg0, java.lang.String[] arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.queryChildDocuments(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryDocument(java.lang.String arg0, java.lang.String[] arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.queryDocument(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryRecentDocuments(java.lang.String arg0, java.lang.String[] arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.queryRecentDocuments(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryRecentDocuments(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.queryRecentDocuments(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryRoots(java.lang.String[] arg0) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.queryRoots(arg0));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor querySearchDocuments(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.querySearchDocuments(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor querySearchDocuments(java.lang.String arg0, java.lang.String arg1, java.lang.String[] arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.querySearchDocuments(arg0, arg1, arg2));
    }

    public void removeDocument(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        real.removeDocument(arg0, arg1);
    }

    public java.lang.String renameDocument(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return real.renameDocument(arg0, arg1);
    }

    public void revokeDocumentPermission(java.lang.String arg0) {
        real.revokeDocumentPermission(arg0);
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return real.update(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

}
