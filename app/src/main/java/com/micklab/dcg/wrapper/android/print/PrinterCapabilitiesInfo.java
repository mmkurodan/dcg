// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrinterCapabilitiesInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrinterCapabilitiesInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo wrap(android.print.PrinterCapabilitiesInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrinterCapabilitiesInfo getReal() {
        return (android.print.PrinterCapabilitiesInfo) real;
    }

    public android.print.PrinterCapabilitiesInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrinterCapabilitiesInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrinterCapabilitiesInfo) real).equals(arg0);
    }

    public int getColorModes() {
        return ((android.print.PrinterCapabilitiesInfo) real).getColorModes();
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes getDefaults() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.wrap(((android.print.PrinterCapabilitiesInfo) real).getDefaults());
    }

    public int getDuplexModes() {
        return ((android.print.PrinterCapabilitiesInfo) real).getDuplexModes();
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins getMinMargins() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins.wrap(((android.print.PrinterCapabilitiesInfo) real).getMinMargins());
    }

    public int hashCode() {
        return ((android.print.PrinterCapabilitiesInfo) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.print.PrinterCapabilitiesInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrinterCapabilitiesInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder wrap(android.print.PrinterCapabilitiesInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrinterCapabilitiesInfo.Builder getReal() {
            return (android.print.PrinterCapabilitiesInfo.Builder) real;
        }

        public android.print.PrinterCapabilitiesInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.print.PrinterId arg0) {
            this(new android.print.PrinterCapabilitiesInfo.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder addMediaSize(com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(((android.print.PrinterCapabilitiesInfo.Builder) real).addMediaSize(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder addResolution(com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(((android.print.PrinterCapabilitiesInfo.Builder) real).addResolution(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo build() {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.wrap(((android.print.PrinterCapabilitiesInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder setColorModes(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(((android.print.PrinterCapabilitiesInfo.Builder) real).setColorModes(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder setDuplexModes(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(((android.print.PrinterCapabilitiesInfo.Builder) real).setDuplexModes(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder setMinMargins(com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins arg0) {
            return com.micklab.dcg.wrapper.android.print.PrinterCapabilitiesInfo.Builder.wrap(((android.print.PrinterCapabilitiesInfo.Builder) real).setMinMargins(arg0 == null ? null : arg0.getReal()));
        }

    }
}
