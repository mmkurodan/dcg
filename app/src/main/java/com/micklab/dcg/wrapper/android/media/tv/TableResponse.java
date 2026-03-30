// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TableResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TableResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TableResponse wrap(android.media.tv.TableResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TableResponse(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TableResponse getReal() {
        return (android.media.tv.TableResponse) real;
    }

    public android.media.tv.TableResponse unwrap() {
        return getReal();
    }

    public TableResponse(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, int arg4, int arg5) {
        this(new android.media.tv.TableResponse(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.TableResponse) real).describeContents();
    }

    public int getSize() {
        return ((android.media.tv.TableResponse) real).getSize();
    }

    public byte[] getTableByteArray() {
        return ((android.media.tv.TableResponse) real).getTableByteArray();
    }

    public com.micklab.dcg.wrapper.android.os.SharedMemory getTableSharedMemory() {
        return com.micklab.dcg.wrapper.android.os.SharedMemory.wrap(((android.media.tv.TableResponse) real).getTableSharedMemory());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTableUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.media.tv.TableResponse) real).getTableUri());
    }

    public int getVersion() {
        return ((android.media.tv.TableResponse) real).getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TableResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder wrap(android.media.tv.TableResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TableResponse.Builder getReal() {
            return (android.media.tv.TableResponse.Builder) real;
        }

        public android.media.tv.TableResponse.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1, int arg2, int arg3, int arg4) {
            this(new android.media.tv.TableResponse.Builder(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse build() {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.wrap(((android.media.tv.TableResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder setTableByteArray(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder.wrap(((android.media.tv.TableResponse.Builder) real).setTableByteArray(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder setTableSharedMemory(com.micklab.dcg.wrapper.android.os.SharedMemory arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder.wrap(((android.media.tv.TableResponse.Builder) real).setTableSharedMemory(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder setTableUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder.wrap(((android.media.tv.TableResponse.Builder) real).setTableUri(arg0 == null ? null : arg0.getReal()));
        }

    }
}
