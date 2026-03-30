// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Session2Command {
    private final android.media.Session2Command real;

    public Session2Command(android.media.Session2Command real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Session2Command wrap(android.media.Session2Command real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2Command(real);
    }

    public android.media.Session2Command unwrap() {
        return real;
    }

    public Session2Command(int arg0) {
        this(new android.media.Session2Command(arg0));
    }

    public Session2Command(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.media.Session2Command(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getCommandCode() {
        return real.getCommandCode();
    }

    public java.lang.String getCustomAction() {
        return real.getCustomAction();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCustomExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getCustomExtras());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int COMMAND_CODE_CUSTOM = android.media.Session2Command.COMMAND_CODE_CUSTOM;

    public static final class Result {
        private final android.media.Session2Command.Result real;

        public Result(android.media.Session2Command.Result real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Session2Command.Result wrap(android.media.Session2Command.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2Command.Result(real);
        }

        public android.media.Session2Command.Result unwrap() {
            return real;
        }

        public Result(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.media.Session2Command.Result(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public int getResultCode() {
            return real.getResultCode();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getResultData() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getResultData());
        }

        public static final int RESULT_ERROR_UNKNOWN_ERROR = android.media.Session2Command.Result.RESULT_ERROR_UNKNOWN_ERROR;
        public static final int RESULT_INFO_SKIPPED = android.media.Session2Command.Result.RESULT_INFO_SKIPPED;
        public static final int RESULT_SUCCESS = android.media.Session2Command.Result.RESULT_SUCCESS;

    }
}
