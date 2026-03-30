// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TableResponse {
    private final android.media.tv.TableResponse real;

    public TableResponse(android.media.tv.TableResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TableResponse wrap(android.media.tv.TableResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TableResponse(real);
    }

    public android.media.tv.TableResponse unwrap() {
        return real;
    }

    public TableResponse(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, int arg4, int arg5) {
        this(new android.media.tv.TableResponse(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getSize() {
        return real.getSize();
    }

    public byte[] getTableByteArray() {
        return real.getTableByteArray();
    }

    public com.micklab.dcg.wrapper.android.os.SharedMemory getTableSharedMemory() {
        return com.micklab.dcg.wrapper.android.os.SharedMemory.wrap(real.getTableSharedMemory());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getTableUri() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getTableUri());
    }

    public int getVersion() {
        return real.getVersion();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.media.tv.TableResponse.Builder real;

        public Builder(android.media.tv.TableResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder wrap(android.media.tv.TableResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder(real);
        }

        public android.media.tv.TableResponse.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1, int arg2, int arg3, int arg4) {
            this(new android.media.tv.TableResponse.Builder(arg0, arg1, arg2, arg3, arg4));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse build() {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder setTableByteArray(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder.wrap(real.setTableByteArray(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder setTableSharedMemory(com.micklab.dcg.wrapper.android.os.SharedMemory arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder.wrap(real.setTableSharedMemory(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder setTableUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TableResponse.Builder.wrap(real.setTableUri(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
