// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.blob;

public final class BlobStoreManager {
    private final android.app.blob.BlobStoreManager real;

    public BlobStoreManager(android.app.blob.BlobStoreManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager wrap(android.app.blob.BlobStoreManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager(real);
    }

    public android.app.blob.BlobStoreManager unwrap() {
        return real;
    }

    public void abandonSession(long arg0) throws java.io.IOException {
        real.abandonSession(arg0);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, java.lang.CharSequence arg1) throws java.io.IOException {
        real.acquireLease(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, int arg1) throws java.io.IOException {
        real.acquireLease(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, java.lang.CharSequence arg1, long arg2) throws java.io.IOException {
        real.acquireLease(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void acquireLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0, int arg1, long arg2) throws java.io.IOException {
        real.acquireLease(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public long createSession(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0) throws java.io.IOException {
        return real.createSession(arg0 == null ? null : arg0.unwrap());
    }

    public long getRemainingLeaseQuotaBytes() {
        return real.getRemainingLeaseQuotaBytes();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openBlob(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.openBlob(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session openSession(long arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session.wrap(real.openSession(arg0));
    }

    public void releaseLease(com.micklab.dcg.wrapper.android.app.blob.BlobHandle arg0) throws java.io.IOException {
        real.releaseLease(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Session {
        private final android.app.blob.BlobStoreManager.Session real;

        public Session(android.app.blob.BlobStoreManager.Session real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session wrap(android.app.blob.BlobStoreManager.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.blob.BlobStoreManager.Session(real);
        }

        public android.app.blob.BlobStoreManager.Session unwrap() {
            return real;
        }

        public void abandon() throws java.io.IOException {
            real.abandon();
        }

        public void allowPackageAccess(java.lang.String arg0, byte[] arg1) throws java.io.IOException {
            real.allowPackageAccess(arg0, arg1);
        }

        public void allowPublicAccess() throws java.io.IOException {
            real.allowPublicAccess();
        }

        public void allowSameSignatureAccess() throws java.io.IOException {
            real.allowSameSignatureAccess();
        }

        public void close() throws java.io.IOException {
            real.close();
        }

        public long getSize() throws java.io.IOException {
            return real.getSize();
        }

        public boolean isPackageAccessAllowed(java.lang.String arg0, byte[] arg1) throws java.io.IOException {
            return real.isPackageAccessAllowed(arg0, arg1);
        }

        public boolean isPublicAccessAllowed() throws java.io.IOException {
            return real.isPublicAccessAllowed();
        }

        public boolean isSameSignatureAccessAllowed() throws java.io.IOException {
            return real.isSameSignatureAccessAllowed();
        }

        public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openRead() throws java.io.IOException {
            return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.openRead());
        }

        public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openWrite(long arg0, long arg1) throws java.io.IOException {
            return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.openWrite(arg0, arg1));
        }

    }
}
