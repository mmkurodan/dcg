// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.changelog;

public final class ChangeLogsResponse {
    private final android.health.connect.changelog.ChangeLogsResponse real;

    public ChangeLogsResponse(android.health.connect.changelog.ChangeLogsResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse wrap(android.health.connect.changelog.ChangeLogsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse(real);
    }

    public android.health.connect.changelog.ChangeLogsResponse unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getNextChangesToken() {
        return real.getNextChangesToken();
    }

    public boolean hasMorePages() {
        return real.hasMorePages();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class DeletedLog {
        private final android.health.connect.changelog.ChangeLogsResponse.DeletedLog real;

        public DeletedLog(android.health.connect.changelog.ChangeLogsResponse.DeletedLog real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse.DeletedLog wrap(android.health.connect.changelog.ChangeLogsResponse.DeletedLog real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.changelog.ChangeLogsResponse.DeletedLog(real);
        }

        public android.health.connect.changelog.ChangeLogsResponse.DeletedLog unwrap() {
            return real;
        }

        public DeletedLog(java.lang.String arg0, long arg1) {
            this(new android.health.connect.changelog.ChangeLogsResponse.DeletedLog(arg0, arg1));
        }

        public java.lang.String getDeletedRecordId() {
            return real.getDeletedRecordId();
        }

        public java.time.Instant getDeletedTime() {
            return real.getDeletedTime();
        }

    }
}
