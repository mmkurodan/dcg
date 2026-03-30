// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeLogsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse wrap(android.health.connect.changelog.ChangeLogsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.changelog.ChangeLogsResponse getReal() {
        return (android.health.connect.changelog.ChangeLogsResponse) real;
    }

    public android.health.connect.changelog.ChangeLogsResponse unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.health.connect.changelog.ChangeLogsResponse) real).describeContents();
    }

    public java.lang.String getNextChangesToken() {
        return ((android.health.connect.changelog.ChangeLogsResponse) real).getNextChangesToken();
    }

    public boolean hasMorePages() {
        return ((android.health.connect.changelog.ChangeLogsResponse) real).hasMorePages();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.health.connect.changelog.ChangeLogsResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class DeletedLog {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DeletedLog(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse.DeletedLog wrap(android.health.connect.changelog.ChangeLogsResponse.DeletedLog real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse.DeletedLog(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.changelog.ChangeLogsResponse.DeletedLog getReal() {
            return (android.health.connect.changelog.ChangeLogsResponse.DeletedLog) real;
        }

        public android.health.connect.changelog.ChangeLogsResponse.DeletedLog unwrap() {
            return getReal();
        }

        public DeletedLog(java.lang.String arg0, long arg1) {
            this(new android.health.connect.changelog.ChangeLogsResponse.DeletedLog(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public java.lang.String getDeletedRecordId() {
            return ((android.health.connect.changelog.ChangeLogsResponse.DeletedLog) real).getDeletedRecordId();
        }

        public java.time.Instant getDeletedTime() {
            return ((android.health.connect.changelog.ChangeLogsResponse.DeletedLog) real).getDeletedTime();
        }

    }
}
