// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class SystemUpdatePolicy {
    private final android.app.admin.SystemUpdatePolicy real;

    public SystemUpdatePolicy(android.app.admin.SystemUpdatePolicy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy wrap(android.app.admin.SystemUpdatePolicy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy(real);
    }

    public android.app.admin.SystemUpdatePolicy unwrap() {
        return real;
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
        return real.describeContents();
    }

    public int getInstallWindowEnd() {
        return real.getInstallWindowEnd();
    }

    public int getInstallWindowStart() {
        return real.getInstallWindowStart();
    }

    public int getPolicyType() {
        return real.getPolicyType();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_INSTALL_AUTOMATIC = android.app.admin.SystemUpdatePolicy.TYPE_INSTALL_AUTOMATIC;
    public static final int TYPE_INSTALL_WINDOWED = android.app.admin.SystemUpdatePolicy.TYPE_INSTALL_WINDOWED;
    public static final int TYPE_POSTPONE = android.app.admin.SystemUpdatePolicy.TYPE_POSTPONE;

    public static final class ValidationFailedException {
        private final android.app.admin.SystemUpdatePolicy.ValidationFailedException real;

        public ValidationFailedException(android.app.admin.SystemUpdatePolicy.ValidationFailedException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.ValidationFailedException wrap(android.app.admin.SystemUpdatePolicy.ValidationFailedException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.ValidationFailedException(real);
        }

        public android.app.admin.SystemUpdatePolicy.ValidationFailedException unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public int getErrorCode() {
            return real.getErrorCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE;
        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG;
        public static final int ERROR_DUPLICATE_OR_OVERLAP = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_DUPLICATE_OR_OVERLAP;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_LONG = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_NEW_FREEZE_PERIOD_TOO_LONG;
        public static final int ERROR_UNKNOWN = android.app.admin.SystemUpdatePolicy.ValidationFailedException.ERROR_UNKNOWN;

    }
}
