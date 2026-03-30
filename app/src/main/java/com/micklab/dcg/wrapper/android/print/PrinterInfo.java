// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrinterInfo {
    private final android.print.PrinterInfo real;

    public PrinterInfo(android.print.PrinterInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrinterInfo wrap(android.print.PrinterInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterInfo(real);
    }

    public android.print.PrinterInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo getCapabilities() {
        return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.wrap(real.getCapabilities());
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public com.micklab.dcg.wrapper.android.print.PrinterId getId() {
        return com.micklab.dcg.wrapper.android.print.PrinterId.wrap(real.getId());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getStatus() {
        return real.getStatus();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATUS_BUSY = android.print.PrinterInfo.STATUS_BUSY;
    public static final int STATUS_IDLE = android.print.PrinterInfo.STATUS_IDLE;
    public static final int STATUS_UNAVAILABLE = android.print.PrinterInfo.STATUS_UNAVAILABLE;

    public static final class Builder {
        private final android.print.PrinterInfo.Builder real;

        public Builder(android.print.PrinterInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder wrap(android.print.PrinterInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder(real);
        }

        public android.print.PrinterInfo.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrinterInfo arg0) {
            this(new android.print.PrinterInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrinterId arg0, java.lang.String arg1, int arg2) {
            this(new android.print.PrinterInfo.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setCapabilities(com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setCapabilities(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setDescription(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setHasCustomPrinterIcon(boolean arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setHasCustomPrinterIcon(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setIconResourceId(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setIconResourceId(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setInfoIntent(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setInfoIntent(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setName(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder setStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterInfo.Builder.wrap(real.setStatus(arg0));
        }

    }
}
