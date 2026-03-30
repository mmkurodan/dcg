// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class SystemUpdatePolicy {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SystemUpdatePolicy(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy wrap(android.app.admin.SystemUpdatePolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy(real, (__DcgwBridgeToken) null);
    }

    public android.app.admin.SystemUpdatePolicy getReal() {
        return (android.app.admin.SystemUpdatePolicy) real;
    }

    public android.app.admin.SystemUpdatePolicy unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy createAutomaticInstallPolicy() {
        return com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.wrap(android.app.admin.SystemUpdatePolicy.createAutomaticInstallPolicy());
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy createPostponeInstallPolicy() {
        return com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.wrap(android.app.admin.SystemUpdatePolicy.createPostponeInstallPolicy());
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy createWindowedInstallPolicy(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.wrap(android.app.admin.SystemUpdatePolicy.createWindowedInstallPolicy(arg0, arg1));
    }

    public int describeContents() {
        return ((android.app.admin.SystemUpdatePolicy) real).describeContents();
    }

    public int getInstallWindowEnd() {
        return ((android.app.admin.SystemUpdatePolicy) real).getInstallWindowEnd();
    }

    public int getInstallWindowStart() {
        return ((android.app.admin.SystemUpdatePolicy) real).getInstallWindowStart();
    }

    public int getPolicyType() {
        return ((android.app.admin.SystemUpdatePolicy) real).getPolicyType();
    }

    public java.lang.String toString() {
        return ((android.app.admin.SystemUpdatePolicy) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.admin.SystemUpdatePolicy) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_INSTALL_AUTOMATIC = android.app.admin.SystemUpdatePolicy.TYPE_INSTALL_AUTOMATIC;
    public static final int TYPE_INSTALL_WINDOWED = android.app.admin.SystemUpdatePolicy.TYPE_INSTALL_WINDOWED;
    public static final int TYPE_POSTPONE = android.app.admin.SystemUpdatePolicy.TYPE_POSTPONE;

    public static final class ValidationFailedException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ValidationFailedException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.ValidationFailedException wrap(android.app.admin.SystemUpdatePolicy.ValidationFailedException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.ValidationFailedException(real, (__DcgwBridgeToken) null);
        }

        public android.app.admin.SystemUpdatePolicy.ValidationFailedException getReal() {
            return (android.app.admin.SystemUpdatePolicy.ValidationFailedException) real;
        }

        public android.app.admin.SystemUpdatePolicy.ValidationFailedException unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.app.admin.SystemUpdatePolicy.ValidationFailedException) real).describeContents();
        }

        public int getErrorCode() {
            return ((android.app.admin.SystemUpdatePolicy.ValidationFailedException) real).getErrorCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.admin.SystemUpdatePolicy.ValidationFailedException) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE;
        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG;
        public static final int ERROR_DUPLICATE_OR_OVERLAP = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_DUPLICATE_OR_OVERLAP;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_LONG = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_NEW_FREEZE_PERIOD_TOO_LONG;
        public static final int ERROR_UNKNOWN = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_UNKNOWN;

    }
}
