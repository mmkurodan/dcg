// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class BlockedNumberContract {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlockedNumberContract(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.BlockedNumberContract wrap(android.provider.BlockedNumberContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.BlockedNumberContract(real, (__DcgwBridgeToken) null);
    }

    public android.provider.BlockedNumberContract getReal() {
        return (android.provider.BlockedNumberContract) real;
    }

    public android.provider.BlockedNumberContract unwrap() {
        return getReal();
    }

    public static boolean canCurrentUserBlockNumbers(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.provider.BlockedNumberContract.canCurrentUserBlockNumbers(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isBlocked(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return android.provider.BlockedNumberContract.isBlocked(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static int unblock(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return android.provider.BlockedNumberContract.unblock(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String AUTHORITY = android.provider.BlockedNumberContract.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri AUTHORITY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.BlockedNumberContract.AUTHORITY_URI);

    public static final class BlockedNumbers {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BlockedNumbers(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.BlockedNumberContract.BlockedNumbers wrap(android.provider.BlockedNumberContract.BlockedNumbers real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.BlockedNumberContract.BlockedNumbers(real, (__DcgwBridgeToken) null);
        }

        public android.provider.BlockedNumberContract.BlockedNumbers getReal() {
            return (android.provider.BlockedNumberContract.BlockedNumbers) real;
        }

        public android.provider.BlockedNumberContract.BlockedNumbers unwrap() {
            return getReal();
        }

        public static final java.lang.String COLUMN_E164_NUMBER = android.provider.BlockedNumberContract.BlockedNumbers.COLUMN_E164_NUMBER;
        public static final java.lang.String COLUMN_ID = android.provider.BlockedNumberContract.BlockedNumbers.COLUMN_ID;
        public static final java.lang.String COLUMN_ORIGINAL_NUMBER = android.provider.BlockedNumberContract.BlockedNumbers.COLUMN_ORIGINAL_NUMBER;
        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.BlockedNumberContract.BlockedNumbers.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.BlockedNumberContract.BlockedNumbers.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.BlockedNumberContract.BlockedNumbers.CONTENT_URI);

    }
}
