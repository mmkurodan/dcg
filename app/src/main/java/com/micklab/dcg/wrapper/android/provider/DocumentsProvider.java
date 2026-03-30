// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class DocumentsProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DocumentsProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.DocumentsProvider wrap(android.provider.DocumentsProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.DocumentsProvider(real, (__DcgwBridgeToken) null);
    }

    public android.provider.DocumentsProvider getReal() {
        return (android.provider.DocumentsProvider) real;
    }

    public android.provider.DocumentsProvider unwrap() {
        return getReal();
    }

    public void attachInfo(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.pm.ProviderInfo arg1) {
        ((android.provider.DocumentsProvider) real).attachInfo(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle call(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.provider.DocumentsProvider) real).call(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.net.Uri canonicalize(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.provider.DocumentsProvider) real).canonicalize(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String copyDocument(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return ((android.provider.DocumentsProvider) real).copyDocument(arg0, arg1);
    }

    public java.lang.String createDocument(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return ((android.provider.DocumentsProvider) real).createDocument(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender createWebLinkIntent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(((android.provider.DocumentsProvider) real).createWebLinkIntent(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public int delete(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String[] arg2) {
        return ((android.provider.DocumentsProvider) real).delete(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void deleteDocument(java.lang.String arg0) throws java.io.FileNotFoundException {
        ((android.provider.DocumentsProvider) real).deleteDocument(arg0);
    }

    public void ejectRoot(java.lang.String arg0) {
        ((android.provider.DocumentsProvider) real).ejectRoot(arg0);
    }

    public com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path findDocumentPath(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path.wrap(((android.provider.DocumentsProvider) real).findDocumentPath(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getDocumentMetadata(java.lang.String arg0) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.provider.DocumentsProvider) real).getDocumentMetadata(arg0));
    }

    public java.lang.String[] getDocumentStreamTypes(java.lang.String arg0, java.lang.String arg1) {
        return ((android.provider.DocumentsProvider) real).getDocumentStreamTypes(arg0, arg1);
    }

    public java.lang.String getDocumentType(java.lang.String arg0) throws java.io.FileNotFoundException {
        return ((android.provider.DocumentsProvider) real).getDocumentType(arg0);
    }

    public java.lang.String[] getStreamTypes(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return ((android.provider.DocumentsProvider) real).getStreamTypes(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.String getType(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.provider.DocumentsProvider) real).getType(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getTypeAnonymous(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return ((android.provider.DocumentsProvider) real).getTypeAnonymous(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.net.Uri insert(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.provider.DocumentsProvider) real).insert(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public boolean isChildDocument(java.lang.String arg0, java.lang.String arg1) {
        return ((android.provider.DocumentsProvider) real).isChildDocument(arg0, arg1);
    }

    public java.lang.String moveDocument(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return ((android.provider.DocumentsProvider) real).moveDocument(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openAssetFile(android.net.Uri,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openAssetFile(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.provider.DocumentsProvider#openAssetFile(android.net.Uri,java.lang.String,android.os.CancellationSignal)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openDocument(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.provider.DocumentsProvider) real).openDocument(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor openDocumentThumbnail(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Point arg1, com.micklab.dcg.wrapper.android.os.CancellationSignal arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.provider.DocumentsProvider) real).openDocumentThumbnail(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
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
        return com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor.wrap(((android.provider.DocumentsProvider) real).openTypedDocument(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String[] arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.CancellationSignal arg5) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).query(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryChildDocuments(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).queryChildDocuments(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryChildDocuments(java.lang.String arg0, java.lang.String[] arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).queryChildDocuments(arg0, arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryDocument(java.lang.String arg0, java.lang.String[] arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).queryDocument(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryRecentDocuments(java.lang.String arg0, java.lang.String[] arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).queryRecentDocuments(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryRecentDocuments(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).queryRecentDocuments(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor queryRoots(java.lang.String[] arg0) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).queryRoots(arg0));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor querySearchDocuments(java.lang.String arg0, java.lang.String[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).querySearchDocuments(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.Cursor querySearchDocuments(java.lang.String arg0, java.lang.String arg1, java.lang.String[] arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(((android.provider.DocumentsProvider) real).querySearchDocuments(arg0, arg1, arg2));
    }

    public void removeDocument(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        ((android.provider.DocumentsProvider) real).removeDocument(arg0, arg1);
    }

    public java.lang.String renameDocument(java.lang.String arg0, java.lang.String arg1) throws java.io.FileNotFoundException {
        return ((android.provider.DocumentsProvider) real).renameDocument(arg0, arg1);
    }

    public void revokeDocumentPermission(java.lang.String arg0) {
        ((android.provider.DocumentsProvider) real).revokeDocumentPermission(arg0);
    }

    public int update(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.content.ContentValues arg1, java.lang.String arg2, java.lang.String[] arg3) {
        return ((android.provider.DocumentsProvider) real).update(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

}
