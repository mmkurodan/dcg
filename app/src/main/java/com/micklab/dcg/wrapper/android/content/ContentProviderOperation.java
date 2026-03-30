// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContentProviderOperation {
    private final android.content.ContentProviderOperation real;

    public ContentProviderOperation(android.content.ContentProviderOperation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation wrap(android.content.ContentProviderOperation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderOperation(real);
    }

    public android.content.ContentProviderOperation unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.content.ContentProviderResult apply(com.micklab.dcg.wrapper.android.content.ContentProvider arg0, android.content.ContentProviderResult[] arg1, int arg2) throws android.content.OperationApplicationException {
        return com.micklab.dcg.wrapper.android.content.ContentProviderResult.wrap(real.apply(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUri());
    }

    public boolean isAssertQuery() {
        return real.isAssertQuery();
    }

    public boolean isCall() {
        return real.isCall();
    }

    public boolean isDelete() {
        return real.isDelete();
    }

    public boolean isExceptionAllowed() {
        return real.isExceptionAllowed();
    }

    public boolean isInsert() {
        return real.isInsert();
    }

    public boolean isReadOperation() {
        return real.isReadOperation();
    }

    public boolean isUpdate() {
        return real.isUpdate();
    }

    public boolean isWriteOperation() {
        return real.isWriteOperation();
    }

    public boolean isYieldAllowed() {
        return real.isYieldAllowed();
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newAssertQuery(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newAssertQuery(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newCall(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newCall(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newDelete(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newDelete(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newInsert(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newInsert(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder newUpdate(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(android.content.ContentProviderOperation.newUpdate(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle resolveExtrasBackReferences(android.content.ContentProviderResult[] arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.resolveExtrasBackReferences(arg0, arg1));
    }

    public java.lang.String[] resolveSelectionArgsBackReferences(android.content.ContentProviderResult[] arg0, int arg1) {
        return real.resolveSelectionArgsBackReferences(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.ContentValues resolveValueBackReferences(android.content.ContentProviderResult[] arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.ContentValues.wrap(real.resolveValueBackReferences(arg0, arg1));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.content.ContentProviderOperation.Builder real;

        public Builder(android.content.ContentProviderOperation.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder wrap(android.content.ContentProviderOperation.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder(real);
        }

        public android.content.ContentProviderOperation.Builder unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation build() {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExceptionAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withExceptionAllowed(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExpectedCount(int arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withExpectedCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtra(java.lang.String arg0, java.lang.Object arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withExtra(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtraBackReference(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withExtraBackReference(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtraBackReference(java.lang.String arg0, int arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withExtraBackReference(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withSelection(java.lang.String arg0, java.lang.String[] arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withSelection(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withSelectionBackReference(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withSelectionBackReference(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withSelectionBackReference(int arg0, int arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withSelectionBackReference(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValue(java.lang.String arg0, java.lang.Object arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withValue(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withValueBackReference(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValueBackReference(java.lang.String arg0, int arg1, java.lang.String arg2) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withValueBackReference(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValueBackReferences(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withValueBackReferences(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withValues(com.micklab.dcg.wrapper.android.content.ContentValues arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withValues(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder withYieldAllowed(boolean arg0) {
            return com.micklab.dcg.wrapper.android.content.ContentProviderOperation.Builder.wrap(real.withYieldAllowed(arg0));
        }

    }
}
