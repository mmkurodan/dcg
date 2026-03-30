// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.blob;

public final class BlobStoreManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlobStoreManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager wrap(android.app.blob.BlobStoreManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.blob.BlobStoreManager getReal() {
        return (android.app.blob.BlobStoreManager) real;
    }

    public android.app.blob.BlobStoreManager unwrap() {
        return getReal();
    }

    public void abandonSession(long arg0) throws java.io.IOException {
        ((android.app.blob.BlobStoreManager) real).abandonSession(arg0);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, java.lang.CharSequence arg1) throws java.io.IOException {
        ((android.app.blob.BlobStoreManager) real).acquireLease(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, int arg1) throws java.io.IOException {
        ((android.app.blob.BlobStoreManager) real).acquireLease(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, java.lang.CharSequence arg1, long arg2) throws java.io.IOException {
        ((android.app.blob.BlobStoreManager) real).acquireLease(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, int arg1, long arg2) throws java.io.IOException {
        ((android.app.blob.BlobStoreManager) real).acquireLease(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public long createSession(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0) throws java.io.IOException {
        return ((android.app.blob.BlobStoreManager) real).createSession(arg0 == null ? null : arg0.getReal());
    }

    public long getRemainingLeaseQuotaBytes() {
        return ((android.app.blob.BlobStoreManager) real).getRemainingLeaseQuotaBytes();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openBlob(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.app.blob.BlobStoreManager) real).openBlob(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session openSession(long arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session.wrap(((android.app.blob.BlobStoreManager) real).openSession(arg0));
    }

    public void releaseLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0) throws java.io.IOException {
        ((android.app.blob.BlobStoreManager) real).releaseLease(arg0 == null ? null : arg0.getReal());
    }

    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session wrap(android.app.blob.BlobStoreManager.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session(real, (__DcgwBridgeToken) null);
        }

        public android.app.blob.BlobStoreManager.Session getReal() {
            return (android.app.blob.BlobStoreManager.Session) real;
        }

        public android.app.blob.BlobStoreManager.Session unwrap() {
            return getReal();
        }

        public void abandon() throws java.io.IOException {
            ((android.app.blob.BlobStoreManager.Session) real).abandon();
        }

        public void allowPackageAccess(java.lang.String arg0, byte[] arg1) throws java.io.IOException {
            ((android.app.blob.BlobStoreManager.Session) real).allowPackageAccess(arg0, arg1);
        }

        public void allowPublicAccess() throws java.io.IOException {
            ((android.app.blob.BlobStoreManager.Session) real).allowPublicAccess();
        }

        public void allowSameSignatureAccess() throws java.io.IOException {
            ((android.app.blob.BlobStoreManager.Session) real).allowSameSignatureAccess();
        }

        public void close() throws java.io.IOException {
            ((android.app.blob.BlobStoreManager.Session) real).close();
        }

        public long getSize() throws java.io.IOException {
            return ((android.app.blob.BlobStoreManager.Session) real).getSize();
        }

        public boolean isPackageAccessAllowed(java.lang.String arg0, byte[] arg1) throws java.io.IOException {
            return ((android.app.blob.BlobStoreManager.Session) real).isPackageAccessAllowed(arg0, arg1);
        }

        public boolean isPublicAccessAllowed() throws java.io.IOException {
            return ((android.app.blob.BlobStoreManager.Session) real).isPublicAccessAllowed();
        }

        public boolean isSameSignatureAccessAllowed() throws java.io.IOException {
            return ((android.app.blob.BlobStoreManager.Session) real).isSameSignatureAccessAllowed();
        }

        public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openRead() throws java.io.IOException {
            return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.app.blob.BlobStoreManager.Session) real).openRead());
        }

        public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openWrite(long arg0, long arg1) throws java.io.IOException {
            return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.app.blob.BlobStoreManager.Session) real).openWrite(arg0, arg1));
        }

    }
}
