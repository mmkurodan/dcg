// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class DocumentsContract {
    private final android.provider.DocumentsContract real;

    public DocumentsContract(android.provider.DocumentsContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.DocumentsContract wrap(android.provider.DocumentsContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.DocumentsContract(real);
    }

    public android.provider.DocumentsContract unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChildDocumentsUri(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildChildDocumentsUri(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildChildDocumentsUriUsingTree(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildDocumentUri(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildDocumentUri(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildDocumentUriUsingTree(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildDocumentUriUsingTree(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildRecentDocumentsUri(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildRecentDocumentsUri(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildRootUri(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildRootUri(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildRootsUri(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildRootsUri(arg0));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildSearchDocumentsUri(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildSearchDocumentsUri(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri buildTreeDocumentUri(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.buildTreeDocumentUri(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri copyDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.copyDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.net.Uri createDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.createDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.content.IntentSender createWebLinkIntent(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.content.IntentSender.wrap(android.provider.DocumentsContract.createWebLinkIntent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static boolean deleteDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.FileNotFoundException {
        return android.provider.DocumentsContract.deleteDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static void ejectRoot(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        android.provider.DocumentsContract.ejectRoot(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path findDocumentPath(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path.wrap(android.provider.DocumentsContract.findDocumentPath(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static java.lang.String getDocumentId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.DocumentsContract.getDocumentId(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.os.Bundle getDocumentMetadata(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(android.provider.DocumentsContract.getDocumentMetadata(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap getDocumentThumbnail(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.provider.DocumentsContract.getDocumentThumbnail(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public static java.lang.String getRootId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.DocumentsContract.getRootId(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getSearchDocumentsQuery(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.DocumentsContract.getSearchDocumentsQuery(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getTreeDocumentId(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.DocumentsContract.getTreeDocumentId(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean isChildDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) throws java.io.FileNotFoundException {
        return android.provider.DocumentsContract.isChildDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static boolean isDocumentUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return android.provider.DocumentsContract.isDocumentUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean isRootUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return android.provider.DocumentsContract.isRootUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean isRootsUri(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        return android.provider.DocumentsContract.isRootsUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean isTreeUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return android.provider.DocumentsContract.isTreeUri(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri moveDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.net.Uri arg3) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.moveDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public static boolean removeDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) throws java.io.FileNotFoundException {
        return android.provider.DocumentsContract.removeDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.net.Uri renameDocument(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) throws java.io.FileNotFoundException {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.DocumentsContract.renameDocument(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static final java.lang.String ACTION_DOCUMENT_SETTINGS = android.provider.DocumentsContract.ACTION_DOCUMENT_SETTINGS;
    public static final java.lang.String EXTRA_ERROR = android.provider.DocumentsContract.EXTRA_ERROR;
    public static final java.lang.String EXTRA_EXCLUDE_SELF = android.provider.DocumentsContract.EXTRA_EXCLUDE_SELF;
    public static final java.lang.String EXTRA_INFO = android.provider.DocumentsContract.EXTRA_INFO;
    public static final java.lang.String EXTRA_INITIAL_URI = android.provider.DocumentsContract.EXTRA_INITIAL_URI;
    public static final java.lang.String EXTRA_LOADING = android.provider.DocumentsContract.EXTRA_LOADING;
    public static final java.lang.String EXTRA_ORIENTATION = android.provider.DocumentsContract.EXTRA_ORIENTATION;
    public static final java.lang.String EXTRA_PROMPT = android.provider.DocumentsContract.EXTRA_PROMPT;
    public static final java.lang.String METADATA_EXIF = android.provider.DocumentsContract.METADATA_EXIF;
    public static final java.lang.String METADATA_TREE_COUNT = android.provider.DocumentsContract.METADATA_TREE_COUNT;
    public static final java.lang.String METADATA_TREE_SIZE = android.provider.DocumentsContract.METADATA_TREE_SIZE;
    public static final java.lang.String METADATA_TYPES = android.provider.DocumentsContract.METADATA_TYPES;
    public static final java.lang.String PROVIDER_INTERFACE = android.provider.DocumentsContract.PROVIDER_INTERFACE;
    public static final java.lang.String QUERY_ARG_DISPLAY_NAME = android.provider.DocumentsContract.QUERY_ARG_DISPLAY_NAME;
    public static final java.lang.String QUERY_ARG_EXCLUDE_MEDIA = android.provider.DocumentsContract.QUERY_ARG_EXCLUDE_MEDIA;
    public static final java.lang.String QUERY_ARG_LAST_MODIFIED_AFTER = android.provider.DocumentsContract.QUERY_ARG_LAST_MODIFIED_AFTER;
    public static final java.lang.String QUERY_ARG_MIME_TYPES = android.provider.DocumentsContract.QUERY_ARG_MIME_TYPES;

    public static final class Document {
        private final android.provider.DocumentsContract.Document real;

        public Document(android.provider.DocumentsContract.Document real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.DocumentsContract.Document wrap(android.provider.DocumentsContract.Document real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.DocumentsContract.Document(real);
        }

        public android.provider.DocumentsContract.Document unwrap() {
            return real;
        }

        public static final java.lang.String COLUMN_DISPLAY_NAME = android.provider.DocumentsContract.Document.COLUMN_DISPLAY_NAME;
        public static final java.lang.String COLUMN_DOCUMENT_ID = android.provider.DocumentsContract.Document.COLUMN_DOCUMENT_ID;
        public static final java.lang.String COLUMN_FLAGS = android.provider.DocumentsContract.Document.COLUMN_FLAGS;
        public static final java.lang.String COLUMN_ICON = android.provider.DocumentsContract.Document.COLUMN_ICON;
        public static final java.lang.String COLUMN_LAST_MODIFIED = android.provider.DocumentsContract.Document.COLUMN_LAST_MODIFIED;
        public static final java.lang.String COLUMN_MIME_TYPE = android.provider.DocumentsContract.Document.COLUMN_MIME_TYPE;
        public static final java.lang.String COLUMN_SIZE = android.provider.DocumentsContract.Document.COLUMN_SIZE;
        public static final java.lang.String COLUMN_SUMMARY = android.provider.DocumentsContract.Document.COLUMN_SUMMARY;
        public static final int FLAG_DIR_BLOCKS_OPEN_DOCUMENT_TREE = android.provider.DocumentsContract.Document.FLAG_DIR_BLOCKS_OPEN_DOCUMENT_TREE;
        public static final int FLAG_DIR_PREFERS_GRID = android.provider.DocumentsContract.Document.FLAG_DIR_PREFERS_GRID;
        public static final int FLAG_DIR_PREFERS_LAST_MODIFIED = android.provider.DocumentsContract.Document.FLAG_DIR_PREFERS_LAST_MODIFIED;
        public static final int FLAG_DIR_SUPPORTS_CREATE = android.provider.DocumentsContract.Document.FLAG_DIR_SUPPORTS_CREATE;
        public static final int FLAG_PARTIAL = android.provider.DocumentsContract.Document.FLAG_PARTIAL;
        public static final int FLAG_SUPPORTS_COPY = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_COPY;
        public static final int FLAG_SUPPORTS_DELETE = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_DELETE;
        public static final int FLAG_SUPPORTS_METADATA = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_METADATA;
        public static final int FLAG_SUPPORTS_MOVE = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_MOVE;
        public static final int FLAG_SUPPORTS_REMOVE = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_REMOVE;
        public static final int FLAG_SUPPORTS_RENAME = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_RENAME;
        public static final int FLAG_SUPPORTS_SETTINGS = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_SETTINGS;
        public static final int FLAG_SUPPORTS_THUMBNAIL = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_THUMBNAIL;
        public static final int FLAG_SUPPORTS_WRITE = android.provider.DocumentsContract.Document.FLAG_SUPPORTS_WRITE;
        public static final int FLAG_VIRTUAL_DOCUMENT = android.provider.DocumentsContract.Document.FLAG_VIRTUAL_DOCUMENT;
        public static final int FLAG_WEB_LINKABLE = android.provider.DocumentsContract.Document.FLAG_WEB_LINKABLE;
        public static final java.lang.String MIME_TYPE_DIR = android.provider.DocumentsContract.Document.MIME_TYPE_DIR;

    }
    public static final class Path {
        private final android.provider.DocumentsContract.Path real;

        public Path(android.provider.DocumentsContract.Path real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path wrap(android.provider.DocumentsContract.Path real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.DocumentsContract.Path(real);
        }

        public android.provider.DocumentsContract.Path unwrap() {
            return real;
        }

        public Path(java.lang.String arg0, java.util.List arg1) {
            this(new android.provider.DocumentsContract.Path(arg0, arg1));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getRootId() {
            return real.getRootId();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class Root {
        private final android.provider.DocumentsContract.Root real;

        public Root(android.provider.DocumentsContract.Root real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.DocumentsContract.Root wrap(android.provider.DocumentsContract.Root real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.DocumentsContract.Root(real);
        }

        public android.provider.DocumentsContract.Root unwrap() {
            return real;
        }

        public static final java.lang.String COLUMN_AVAILABLE_BYTES = android.provider.DocumentsContract.Root.COLUMN_AVAILABLE_BYTES;
        public static final java.lang.String COLUMN_CAPACITY_BYTES = android.provider.DocumentsContract.Root.COLUMN_CAPACITY_BYTES;
        public static final java.lang.String COLUMN_DOCUMENT_ID = android.provider.DocumentsContract.Root.COLUMN_DOCUMENT_ID;
        public static final java.lang.String COLUMN_FLAGS = android.provider.DocumentsContract.Root.COLUMN_FLAGS;
        public static final java.lang.String COLUMN_ICON = android.provider.DocumentsContract.Root.COLUMN_ICON;
        public static final java.lang.String COLUMN_MIME_TYPES = android.provider.DocumentsContract.Root.COLUMN_MIME_TYPES;
        public static final java.lang.String COLUMN_QUERY_ARGS = android.provider.DocumentsContract.Root.COLUMN_QUERY_ARGS;
        public static final java.lang.String COLUMN_ROOT_ID = android.provider.DocumentsContract.Root.COLUMN_ROOT_ID;
        public static final java.lang.String COLUMN_SUMMARY = android.provider.DocumentsContract.Root.COLUMN_SUMMARY;
        public static final java.lang.String COLUMN_TITLE = android.provider.DocumentsContract.Root.COLUMN_TITLE;
        public static final int FLAG_EMPTY = android.provider.DocumentsContract.Root.FLAG_EMPTY;
        public static final int FLAG_LOCAL_ONLY = android.provider.DocumentsContract.Root.FLAG_LOCAL_ONLY;
        public static final int FLAG_SUPPORTS_CREATE = android.provider.DocumentsContract.Root.FLAG_SUPPORTS_CREATE;
        public static final int FLAG_SUPPORTS_EJECT = android.provider.DocumentsContract.Root.FLAG_SUPPORTS_EJECT;
        public static final int FLAG_SUPPORTS_IS_CHILD = android.provider.DocumentsContract.Root.FLAG_SUPPORTS_IS_CHILD;
        public static final int FLAG_SUPPORTS_RECENTS = android.provider.DocumentsContract.Root.FLAG_SUPPORTS_RECENTS;
        public static final int FLAG_SUPPORTS_SEARCH = android.provider.DocumentsContract.Root.FLAG_SUPPORTS_SEARCH;
        public static final java.lang.String MIME_TYPE_ITEM = android.provider.DocumentsContract.Root.MIME_TYPE_ITEM;

    }
}
