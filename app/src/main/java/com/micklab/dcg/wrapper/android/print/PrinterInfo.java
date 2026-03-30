// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrinterInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrinterInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrinterInfo wrap(android.print.PrinterInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterInfo(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrinterInfo getReal() {
        return (android.print.PrinterInfo) real;
    }

    public android.print.PrinterInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrinterInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrinterInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo getCapabilities() {
        return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.wrap(((android.print.PrinterInfo) real).getCapabilities());
    }

    public java.lang.String getDescription() {
        return ((android.print.PrinterInfo) real).getDescription();
    }

    public com.micklab.dcg.wrapper.android.print.PrinterId getId() {
        return com.micklab.dcg.wrapper.android.print.PrinterId.wrap(((android.print.PrinterInfo) real).getId());
    }

    public java.lang.String getName() {
        return ((android.print.PrinterInfo) real).getName();
    }

    public int getStatus() {
        return ((android.print.PrinterInfo) real).getStatus();
    }

    public int hashCode() {
        return ((android.print.PrinterInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.print.PrinterInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrinterInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int STATUS_BUSY = android.print.PrinterInfo.STATUS_BUSY;
    public static final int STATUS_IDLE = android.print.PrinterInfo.STATUS_IDLE;
    public static final int STATUS_UNAVAILABLE = android.print.PrinterInfo.STATUS_UNAVAILABLE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder wrap(android.print.PrinterInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrinterInfo.Builder getReal() {
            return (android.print.PrinterInfo.Builder) real;
        }

        public android.print.PrinterInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrinterInfo arg0) {
            this(new android.print.PrinterInfo.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrinterId arg0, java.lang.String arg1, int arg2) {
            this(new android.print.PrinterInfo.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.wrap(((android.print.PrinterInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setCapabilities(com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setCapabilities(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setHasCustomPrinterIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setHasCustomPrinterIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setIconResourceId(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setIconResourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setInfoIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setInfoIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(((android.print.PrinterInfo.Builder) real).setStatus(arg0));
        }

    }
}
