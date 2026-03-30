// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class DropBoxManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DropBoxManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.DropBoxManager wrap(android.os.DropBoxManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.DropBoxManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.DropBoxManager getReal() {
        return (android.os.DropBoxManager) real;
    }

    public android.os.DropBoxManager unwrap() {
        return getReal();
    }

    public void addData(java.lang.String arg0, byte[] arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager#addData(java.lang.String,[B,int)");
    }

    public void addFile(java.lang.String arg0, java.io.File arg1, int arg2) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager#addFile(java.lang.String,java.io.File,int)");
    }

    public void addText(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager#addText(java.lang.String,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.os.DropBoxManager.Entry getNextEntry(java.lang.String arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager#getNextEntry(java.lang.String,long)");
    }

    public boolean isTagEnabled(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager#isTagEnabled(java.lang.String)");
    }


    public static final class Entry {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Entry(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.DropBoxManager.Entry wrap(android.os.DropBoxManager.Entry real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.DropBoxManager.Entry(real, (__DcgwBridgeToken) null);
        }

        public android.os.DropBoxManager.Entry getReal() {
            return (android.os.DropBoxManager.Entry) real;
        }

        public android.os.DropBoxManager.Entry unwrap() {
            return getReal();
        }

        public Entry(java.lang.String arg0, long arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#android.os.DropBoxManager$Entry(java.lang.String,long)");
        }

        public Entry(java.lang.String arg0, long arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#android.os.DropBoxManager$Entry(java.lang.String,long,java.lang.String)");
        }

        public Entry(java.lang.String arg0, long arg1, java.io.File arg2, int arg3) throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#android.os.DropBoxManager$Entry(java.lang.String,long,java.io.File,int)");
        }

        public Entry(java.lang.String arg0, long arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2, int arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#android.os.DropBoxManager$Entry(java.lang.String,long,android.os.ParcelFileDescriptor,int)");
        }

        public Entry(java.lang.String arg0, long arg1, byte[] arg2, int arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#android.os.DropBoxManager$Entry(java.lang.String,long,[B,int)");
        }

        public void close() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#close()");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#describeContents()");
        }

        public int getFlags() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#getFlags()");
        }

        public java.io.InputStream getInputStream() throws java.io.IOException {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#getInputStream()");
        }

        public java.lang.String getTag() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#getTag()");
        }

        public java.lang.String getText(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#getText(int)");
        }

        public long getTimeMillis() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#getTimeMillis()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DropBoxManager$Entry#writeToParcel(android.os.Parcel,int)");
        }


    }
}
