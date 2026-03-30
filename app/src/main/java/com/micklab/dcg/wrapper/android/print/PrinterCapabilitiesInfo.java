// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrinterCapabilitiesInfo {
    private final android.print.PrinterCapabilitiesInfo real;

    public PrinterCapabilitiesInfo(android.print.PrinterCapabilitiesInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo wrap(android.print.PrinterCapabilitiesInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo(real);
    }

    public android.print.PrinterCapabilitiesInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getColorModes() {
        return real.getColorModes();
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes getDefaults() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.wrap(real.getDefaults());
    }

    public int getDuplexModes() {
        return real.getDuplexModes();
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins getMinMargins() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins.wrap(real.getMinMargins());
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


    public static final class Builder {
        private final android.print.PrinterCapabilitiesInfo.Builder real;

        public Builder(android.print.PrinterCapabilitiesInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder wrap(android.print.PrinterCapabilitiesInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder(real);
        }

        public android.print.PrinterCapabilitiesInfo.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrinterId arg0) {
            this(new android.print.PrinterCapabilitiesInfo.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder addMediaSize(com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(real.addMediaSize(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder addResolution(com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(real.addResolution(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder setColorModes(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(real.setColorModes(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder setDuplexModes(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(real.setDuplexModes(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder setMinMargins(com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(real.setMinMargins(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
