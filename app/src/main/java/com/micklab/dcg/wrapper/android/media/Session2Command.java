// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Session2Command {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Session2Command(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Session2Command wrap(android.media.Session2Command real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2Command(real, (__DcgwBridgeToken) null);
    }

    public android.media.Session2Command getReal() {
        return (android.media.Session2Command) real;
    }

    public android.media.Session2Command unwrap() {
        return getReal();
    }

    public Session2Command(int arg0) {
        this(new android.media.Session2Command(arg0), (__DcgwBridgeToken) null);
    }

    public Session2Command(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.media.Session2Command(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.Session2Command) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.Session2Command) real).equals(arg0);
    }

    public int getCommandCode() {
        return ((android.media.Session2Command) real).getCommandCode();
    }

    public java.lang.String getCustomAction() {
        return ((android.media.Session2Command) real).getCustomAction();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCustomExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.Session2Command) real).getCustomExtras());
    }

    public int hashCode() {
        return ((android.media.Session2Command) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.Session2Command) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int COMMAND_CODE_CUSTOM = android.media.Session2Command.COMMAND_CODE_CUSTOM;

    public static final class Result {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Result(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Session2Command.Result wrap(android.media.Session2Command.Result real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Session2Command.Result(real, (__DcgwBridgeToken) null);
        }

        public android.media.Session2Command.Result getReal() {
            return (android.media.Session2Command.Result) real;
        }

        public android.media.Session2Command.Result unwrap() {
            return getReal();
        }

        public Result(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.media.Session2Command.Result(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public int getResultCode() {
            return ((android.media.Session2Command.Result) real).getResultCode();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getResultData() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.Session2Command.Result) real).getResultData());
        }

        public static final int RESULT_ERROR_UNKNOWN_ERROR = android.media.Session2Command.Result.RESULT_ERROR_UNKNOWN_ERROR;
        public static final int RESULT_INFO_SKIPPED = android.media.Session2Command.Result.RESULT_INFO_SKIPPED;
        public static final int RESULT_SUCCESS = android.media.Session2Command.Result.RESULT_SUCCESS;

    }
}
