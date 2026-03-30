// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.print;

public final class PrintAttributes {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PrintAttributes(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.print.PrintAttributes wrap(android.print.PrintAttributes real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintAttributes(real, (__DcgwBridgeToken) null);
    }

    public android.print.PrintAttributes getReal() {
        return (android.print.PrintAttributes) real;
    }

    public android.print.PrintAttributes unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.print.PrintAttributes) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.print.PrintAttributes) real).equals(arg0);
    }

    public int getColorMode() {
        return ((android.print.PrintAttributes) real).getColorMode();
    }

    public int getDuplexMode() {
        return ((android.print.PrintAttributes) real).getDuplexMode();
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize getMediaSize() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(((android.print.PrintAttributes) real).getMediaSize());
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins getMinMargins() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins.wrap(((android.print.PrintAttributes) real).getMinMargins());
    }

    public com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution getResolution() {
        return com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution.wrap(((android.print.PrintAttributes) real).getResolution());
    }

    public int hashCode() {
        return ((android.print.PrintAttributes) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.print.PrintAttributes) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.print.PrintAttributes) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int COLOR_MODE_COLOR = android.print.PrintAttributes.COLOR_MODE_COLOR;
    public static final int COLOR_MODE_MONOCHROME = android.print.PrintAttributes.COLOR_MODE_MONOCHROME;
    public static final int DUPLEX_MODE_LONG_EDGE = android.print.PrintAttributes.DUPLEX_MODE_LONG_EDGE;
    public static final int DUPLEX_MODE_NONE = android.print.PrintAttributes.DUPLEX_MODE_NONE;
    public static final int DUPLEX_MODE_SHORT_EDGE = android.print.PrintAttributes.DUPLEX_MODE_SHORT_EDGE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder wrap(android.print.PrintAttributes.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintAttributes.Builder getReal() {
            return (android.print.PrintAttributes.Builder) real;
        }

        public android.print.PrintAttributes.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.print.PrintAttributes.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes build() {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.wrap(((android.print.PrintAttributes.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder setColorMode(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder.wrap(((android.print.PrintAttributes.Builder) real).setColorMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder setDuplexMode(int arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder.wrap(((android.print.PrintAttributes.Builder) real).setDuplexMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder setMediaSize(com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder.wrap(((android.print.PrintAttributes.Builder) real).setMediaSize(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder setMinMargins(com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder.wrap(((android.print.PrintAttributes.Builder) real).setMinMargins(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder setResolution(com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution arg0) {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.Builder.wrap(((android.print.PrintAttributes.Builder) real).setResolution(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Margins {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Margins(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins wrap(android.print.PrintAttributes.Margins real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintAttributes.Margins getReal() {
            return (android.print.PrintAttributes.Margins) real;
        }

        public android.print.PrintAttributes.Margins unwrap() {
            return getReal();
        }

        public Margins(int arg0, int arg1, int arg2, int arg3) {
            this(new android.print.PrintAttributes.Margins(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.print.PrintAttributes.Margins) real).equals(arg0);
        }

        public int getBottomMils() {
            return ((android.print.PrintAttributes.Margins) real).getBottomMils();
        }

        public int getLeftMils() {
            return ((android.print.PrintAttributes.Margins) real).getLeftMils();
        }

        public int getRightMils() {
            return ((android.print.PrintAttributes.Margins) real).getRightMils();
        }

        public int getTopMils() {
            return ((android.print.PrintAttributes.Margins) real).getTopMils();
        }

        public int hashCode() {
            return ((android.print.PrintAttributes.Margins) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.print.PrintAttributes.Margins) real).toString();
        }

        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins NO_MARGINS = com.micklab.dcg.wrapper.android.print.PrintAttributes.Margins.wrap(android.print.PrintAttributes.Margins.NO_MARGINS);

    }
    public static final class MediaSize {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaSize(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize wrap(android.print.PrintAttributes.MediaSize real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintAttributes.MediaSize getReal() {
            return (android.print.PrintAttributes.MediaSize) real;
        }

        public android.print.PrintAttributes.MediaSize unwrap() {
            return getReal();
        }

        public MediaSize(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3) {
            this(new android.print.PrintAttributes.MediaSize(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize asLandscape() {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(((android.print.PrintAttributes.MediaSize) real).asLandscape());
        }

        public com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize asPortrait() {
            return com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(((android.print.PrintAttributes.MediaSize) real).asPortrait());
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.print.PrintAttributes.MediaSize) real).equals(arg0);
        }

        public int getHeightMils() {
            return ((android.print.PrintAttributes.MediaSize) real).getHeightMils();
        }

        public java.lang.String getId() {
            return ((android.print.PrintAttributes.MediaSize) real).getId();
        }

        public java.lang.String getLabel(com.micklab.dcg.wrapper.android.content.pm.PackageManager arg0) {
            return ((android.print.PrintAttributes.MediaSize) real).getLabel(arg0 == null ? null : arg0.getReal());
        }

        public int getWidthMils() {
            return ((android.print.PrintAttributes.MediaSize) real).getWidthMils();
        }

        public int hashCode() {
            return ((android.print.PrintAttributes.MediaSize) real).hashCode();
        }

        public boolean isPortrait() {
            return ((android.print.PrintAttributes.MediaSize) real).isPortrait();
        }

        public java.lang.String toString() {
            return ((android.print.PrintAttributes.MediaSize) real).toString();
        }

        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ANSI_C = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ANSI_C);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ANSI_D = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ANSI_D);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ANSI_E = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ANSI_E);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ANSI_F = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ANSI_F);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A0 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A0);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A1 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A1);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A10 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A10);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A3 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A3);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A5 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A5);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A6 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A6);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A7 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A7);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A8 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A8);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_A9 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_A9);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B0 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B0);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B1 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B1);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B10 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B10);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B3 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B3);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B5 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B5);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B6 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B6);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B7 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B7);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B8 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B8);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_B9 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_B9);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C0 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C0);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C1 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C1);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C10 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C10);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C3 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C3);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C5 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C5);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C6 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C6);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C7 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C7);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C8 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C8);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ISO_C9 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ISO_C9);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B0 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B0);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B1 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B1);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B10 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B10);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B3 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B3);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B5 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B5);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B6 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B6);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B7 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B7);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B8 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B8);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_B9 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_B9);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JIS_EXEC = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JIS_EXEC);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_CHOU2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_CHOU2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_CHOU3 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_CHOU3);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_CHOU4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_CHOU4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_HAGAKI = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_HAGAKI);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_KAHU = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_KAHU);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_KAKU2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_KAKU2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_OE_PHOTO_L = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_OE_PHOTO_L);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_OUFUKU = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_OUFUKU);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize JPN_YOU4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.JPN_YOU4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_ARCH_A = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_ARCH_A);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_ARCH_B = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_ARCH_B);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_ARCH_C = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_ARCH_C);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_ARCH_D = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_ARCH_D);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_ARCH_E = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_ARCH_E);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_ARCH_E1 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_ARCH_E1);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_FOOLSCAP = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_FOOLSCAP);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_GOVT_LETTER = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_GOVT_LETTER);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_INDEX_3X5 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_INDEX_3X5);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_INDEX_4X6 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_INDEX_4X6);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_INDEX_5X8 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_INDEX_5X8);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_JUNIOR_LEGAL = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_JUNIOR_LEGAL);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_LEDGER = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_LEDGER);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_LEGAL = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_LEGAL);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_LETTER = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_LETTER);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_MONARCH = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_MONARCH);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_QUARTO = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_QUARTO);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_SUPER_B = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_SUPER_B);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize NA_TABLOID = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.NA_TABLOID);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize OM_DAI_PA_KAI = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.OM_DAI_PA_KAI);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize OM_JUURO_KU_KAI = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.OM_JUURO_KU_KAI);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize OM_PA_KAI = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.OM_PA_KAI);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_1 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_1);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_10 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_10);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_16K = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_16K);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_2 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_2);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_3 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_3);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_4 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_4);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_5 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_5);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_6 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_6);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_7 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_7);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_8 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_8);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize PRC_9 = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.PRC_9);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ROC_16K = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ROC_16K);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize ROC_8K = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.ROC_8K);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize UNKNOWN_LANDSCAPE = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        public static final com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize UNKNOWN_PORTRAIT = com.micklab.dcg.wrapper.android.print.PrintAttributes.MediaSize.wrap(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);

    }
    public static final class Resolution {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Resolution(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution wrap(android.print.PrintAttributes.Resolution real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.print.PrintAttributes.Resolution(real, (__DcgwBridgeToken) null);
        }

        public android.print.PrintAttributes.Resolution getReal() {
            return (android.print.PrintAttributes.Resolution) real;
        }

        public android.print.PrintAttributes.Resolution unwrap() {
            return getReal();
        }

        public Resolution(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3) {
            this(new android.print.PrintAttributes.Resolution(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.print.PrintAttributes.Resolution) real).equals(arg0);
        }

        public int getHorizontalDpi() {
            return ((android.print.PrintAttributes.Resolution) real).getHorizontalDpi();
        }

        public java.lang.String getId() {
            return ((android.print.PrintAttributes.Resolution) real).getId();
        }

        public java.lang.String getLabel() {
            return ((android.print.PrintAttributes.Resolution) real).getLabel();
        }

        public int getVerticalDpi() {
            return ((android.print.PrintAttributes.Resolution) real).getVerticalDpi();
        }

        public int hashCode() {
            return ((android.print.PrintAttributes.Resolution) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.print.PrintAttributes.Resolution) real).toString();
        }

    }
}
