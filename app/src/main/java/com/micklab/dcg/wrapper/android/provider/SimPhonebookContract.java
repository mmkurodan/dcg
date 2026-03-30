// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class SimPhonebookContract {
    private final android.provider.SimPhonebookContract real;

    public SimPhonebookContract(android.provider.SimPhonebookContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.SimPhonebookContract wrap(android.provider.SimPhonebookContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SimPhonebookContract(real);
    }

    public android.provider.SimPhonebookContract unwrap() {
        return real;
    }

    public static final java.lang.String AUTHORITY = android.provider.SimPhonebookContract.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri AUTHORITY_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SimPhonebookContract.AUTHORITY_URI);

    public static final class ElementaryFiles {
        private final android.provider.SimPhonebookContract.ElementaryFiles real;

        public ElementaryFiles(android.provider.SimPhonebookContract.ElementaryFiles real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SimPhonebookContract.ElementaryFiles wrap(android.provider.SimPhonebookContract.ElementaryFiles real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SimPhonebookContract.ElementaryFiles(real);
        }

        public android.provider.SimPhonebookContract.ElementaryFiles unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getItemUri(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SimPhonebookContract.ElementaryFiles.getItemUri(arg0, arg1));
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.SimPhonebookContract.ElementaryFiles.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.SimPhonebookContract.ElementaryFiles.CONTENT_TYPE;
        public static final com.micklab.dcg.wrapper.android.net.Uri CONTENT_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SimPhonebookContract.ElementaryFiles.CONTENT_URI);
        public static final int EF_ADN = android.provider.SimPhonebookContract.ElementaryFiles.EF_ADN;
        public static final int EF_FDN = android.provider.SimPhonebookContract.ElementaryFiles.EF_FDN;
        public static final int EF_SDN = android.provider.SimPhonebookContract.ElementaryFiles.EF_SDN;
        public static final java.lang.String EF_TYPE = android.provider.SimPhonebookContract.ElementaryFiles.EF_TYPE;
        public static final int EF_UNKNOWN = android.provider.SimPhonebookContract.ElementaryFiles.EF_UNKNOWN;
        public static final java.lang.String MAX_RECORDS = android.provider.SimPhonebookContract.ElementaryFiles.MAX_RECORDS;
        public static final java.lang.String NAME_MAX_LENGTH = android.provider.SimPhonebookContract.ElementaryFiles.NAME_MAX_LENGTH;
        public static final java.lang.String PHONE_NUMBER_MAX_LENGTH = android.provider.SimPhonebookContract.ElementaryFiles.PHONE_NUMBER_MAX_LENGTH;
        public static final java.lang.String RECORD_COUNT = android.provider.SimPhonebookContract.ElementaryFiles.RECORD_COUNT;
        public static final java.lang.String SLOT_INDEX = android.provider.SimPhonebookContract.ElementaryFiles.SLOT_INDEX;
        public static final java.lang.String SUBSCRIPTION_ID = android.provider.SimPhonebookContract.ElementaryFiles.SUBSCRIPTION_ID;

    }
    public static final class SimRecords {
        private final android.provider.SimPhonebookContract.SimRecords real;

        public SimRecords(android.provider.SimPhonebookContract.SimRecords real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.provider.SimPhonebookContract.SimRecords wrap(android.provider.SimPhonebookContract.SimRecords real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SimPhonebookContract.SimRecords(real);
        }

        public android.provider.SimPhonebookContract.SimRecords unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getContentUri(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SimPhonebookContract.SimRecords.getContentUri(arg0, arg1));
        }

        public static int getEncodedNameLength(com.micklab.dcg.wrapper.android.content.ContentResolver arg0, java.lang.String arg1) {
            return android.provider.SimPhonebookContract.SimRecords.getEncodedNameLength(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static com.micklab.dcg.wrapper.android.net.Uri getItemUri(int arg0, int arg1, int arg2) {
            return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SimPhonebookContract.SimRecords.getItemUri(arg0, arg1, arg2));
        }

        public static final java.lang.String CONTENT_ITEM_TYPE = android.provider.SimPhonebookContract.SimRecords.CONTENT_ITEM_TYPE;
        public static final java.lang.String CONTENT_TYPE = android.provider.SimPhonebookContract.SimRecords.CONTENT_TYPE;
        public static final int ERROR_NAME_UNSUPPORTED = android.provider.SimPhonebookContract.SimRecords.ERROR_NAME_UNSUPPORTED;
        public static final java.lang.String NAME = android.provider.SimPhonebookContract.SimRecords.NAME;
        public static final java.lang.String PHONE_NUMBER = android.provider.SimPhonebookContract.SimRecords.PHONE_NUMBER;
        public static final java.lang.String RECORD_NUMBER = android.provider.SimPhonebookContract.SimRecords.RECORD_NUMBER;
        public static final java.lang.String SUBSCRIPTION_ID = android.provider.SimPhonebookContract.SimRecords.SUBSCRIPTION_ID;

    }
}
