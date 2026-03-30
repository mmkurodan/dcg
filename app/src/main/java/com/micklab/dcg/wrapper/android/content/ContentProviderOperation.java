// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProviderOperation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContentProviderOperation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation wrap(android.content.ContentProviderOperation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderOperation(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContentProviderOperation getReal() {
        return (android.content.ContentProviderOperation) real;
    }

    public android.content.ContentProviderOperation unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.content.ContentProviderResult apply(com.micklab.dcg.wrapper.android.content.ContentProvider arg0, android.content.ContentProviderResult[] arg1, int arg2) throws android.content.OperationApplicationException {
        return com.micklab.dcg.wrapper.android.content.ContentProviderResult.wrap(((android.content.ContentProviderOperation) real).apply(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public int describeContents() {
        return ((android.content.ContentProviderOperation) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.content.ContentProviderOperation) real).getUri());
    }

    public boolean isAssertQuery() {
        return ((android.content.ContentProviderOperation) real).isAssertQuery();
    }

    public boolean isCall() {
        return ((android.content.ContentProviderOperation) real).isCall();
    }

    public boolean isDelete() {
        return ((android.content.ContentProviderOperation) real).isDelete();
    }

    public boolean isExceptionAllowed() {
        return ((android.content.ContentProviderOperation) real).isExceptionAllowed();
    }

    public boolean isInsert() {
        return ((android.content.ContentProviderOperation) real).isInsert();
    }

    public boolean isReadOperation() {
        return ((android.content.ContentProviderOperation) real).isReadOperation();
    }

    public boolean isUpdate() {
        return ((android.content.ContentProviderOperation) real).isUpdate();
    }

    public boolean isWriteOperation() {
        return ((android.content.ContentProviderOperation) real).isWriteOperation();
    }

    public boolean isYieldAllowed() {
        return ((android.content.ContentProviderOperation) real).isYieldAllowed();
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newAssertQuery(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newAssertQuery(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newCall(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newCall(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newDelete(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newDelete(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newInsert(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newInsert(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newUpdate(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newUpdate(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle resolveExtrasBackReferences(android.content.ContentProviderResult[] arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.content.ContentProviderOperation) real).resolveExtrasBackReferences(arg0, arg1));
    }

    public java.lang.String[] resolveSelectionArgsBackReferences(android.content.ContentProviderResult[] arg0, int arg1) {
        return ((android.content.ContentProviderOperation) real).resolveSelectionArgsBackReferences(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues resolveValueBackReferences(android.content.ContentProviderResult[] arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(((android.content.ContentProviderOperation) real).resolveValueBackReferences(arg0, arg1));
    }

    public java.lang.String toString() {
        return ((android.content.ContentProviderOperation) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.ContentProviderOperation) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder wrap(android.content.ContentProviderOperation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.content.ContentProviderOperation.Builder getReal() {
            return (android.content.ContentProviderOperation.Builder) real;
        }

        public android.content.ContentProviderOperation.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation build() {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(((android.content.ContentProviderOperation.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExceptionAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withExceptionAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExpectedCount(int arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withExpectedCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtra(java.lang.String arg0, java.lang.Object arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withExtra(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtraBackReference(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withExtraBackReference(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtraBackReference(java.lang.String arg0, int arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withExtraBackReference(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withSelection(java.lang.String arg0, java.lang.String[] arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withSelection(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withSelectionBackReference(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withSelectionBackReference(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withSelectionBackReference(int arg0, int arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withSelectionBackReference(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValue(java.lang.String arg0, java.lang.Object arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withValue(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withValueBackReference(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String arg0, int arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withValueBackReference(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValueBackReferences(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withValueBackReferences(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValues(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withValues(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withYieldAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(((android.content.ContentProviderOperation.Builder) real).withYieldAllowed(arg0));
        }

    }
}
