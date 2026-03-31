// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.uwb;

public final class UwbComplexChannel {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UwbComplexChannel(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel wrap(android.ranging.uwb.UwbComplexChannel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.uwb.UwbComplexChannel getReal() {
        return (android.ranging.uwb.UwbComplexChannel) real;
    }

    public android.ranging.uwb.UwbComplexChannel unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.uwb.UwbComplexChannel) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.uwb.UwbComplexChannel) real).equals(arg0);
    }

    public int getChannel() {
        return ((android.ranging.uwb.UwbComplexChannel) real).getChannel();
    }

    public int getPreambleIndex() {
        return ((android.ranging.uwb.UwbComplexChannel) real).getPreambleIndex();
    }

    public int hashCode() {
        return ((android.ranging.uwb.UwbComplexChannel) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.ranging.uwb.UwbComplexChannel) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.uwb.UwbComplexChannel) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int UWB_CHANNEL_10 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_10;
    public static final int UWB_CHANNEL_12 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_12;
    public static final int UWB_CHANNEL_13 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_13;
    public static final int UWB_CHANNEL_14 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_14;
    public static final int UWB_CHANNEL_5 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_5;
    public static final int UWB_CHANNEL_6 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_6;
    public static final int UWB_CHANNEL_8 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_8;
    public static final int UWB_CHANNEL_9 = android.ranging.uwb.UwbComplexChannel.UWB_CHANNEL_9;
    public static final int UWB_PREAMBLE_CODE_INDEX_10 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_10;
    public static final int UWB_PREAMBLE_CODE_INDEX_11 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_11;
    public static final int UWB_PREAMBLE_CODE_INDEX_12 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_12;
    public static final int UWB_PREAMBLE_CODE_INDEX_25 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_25;
    public static final int UWB_PREAMBLE_CODE_INDEX_26 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_26;
    public static final int UWB_PREAMBLE_CODE_INDEX_27 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_27;
    public static final int UWB_PREAMBLE_CODE_INDEX_28 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_28;
    public static final int UWB_PREAMBLE_CODE_INDEX_29 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_29;
    public static final int UWB_PREAMBLE_CODE_INDEX_30 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_30;
    public static final int UWB_PREAMBLE_CODE_INDEX_31 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_31;
    public static final int UWB_PREAMBLE_CODE_INDEX_32 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_32;
    public static final int UWB_PREAMBLE_CODE_INDEX_9 = android.ranging.uwb.UwbComplexChannel.UWB_PREAMBLE_CODE_INDEX_9;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.Builder wrap(android.ranging.uwb.UwbComplexChannel.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.uwb.UwbComplexChannel.Builder getReal() {
            return (android.ranging.uwb.UwbComplexChannel.Builder) real;
        }

        public android.ranging.uwb.UwbComplexChannel.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.uwb.UwbComplexChannel.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel build() {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.wrap(((android.ranging.uwb.UwbComplexChannel.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.Builder setChannel(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.Builder.wrap(((android.ranging.uwb.UwbComplexChannel.Builder) real).setChannel(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.Builder setPreambleIndex(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.Builder.wrap(((android.ranging.uwb.UwbComplexChannel.Builder) real).setPreambleIndex(arg0));
        }

    }
}
