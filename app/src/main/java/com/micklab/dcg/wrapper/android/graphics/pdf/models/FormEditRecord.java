// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class FormEditRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FormEditRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord wrap(android.graphics.pdf.models.FormEditRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.models.FormEditRecord getReal() {
        return (android.graphics.pdf.models.FormEditRecord) real;
    }

    public android.graphics.pdf.models.FormEditRecord unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.graphics.pdf.models.FormEditRecord) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.pdf.models.FormEditRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getClickPoint() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.graphics.pdf.models.FormEditRecord) real).getClickPoint());
    }

    public int getPageNumber() {
        return ((android.graphics.pdf.models.FormEditRecord) real).getPageNumber();
    }

    public int[] getSelectedIndices() {
        return ((android.graphics.pdf.models.FormEditRecord) real).getSelectedIndices();
    }

    public java.lang.String getText() {
        return ((android.graphics.pdf.models.FormEditRecord) real).getText();
    }

    public int getType() {
        return ((android.graphics.pdf.models.FormEditRecord) real).getType();
    }

    public int getWidgetIndex() {
        return ((android.graphics.pdf.models.FormEditRecord) real).getWidgetIndex();
    }

    public int hashCode() {
        return ((android.graphics.pdf.models.FormEditRecord) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.models.FormEditRecord) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int EDIT_TYPE_CLICK = android.graphics.pdf.models.FormEditRecord.EDIT_TYPE_CLICK;
    public static final int EDIT_TYPE_SET_INDICES = android.graphics.pdf.models.FormEditRecord.EDIT_TYPE_SET_INDICES;
    public static final int EDIT_TYPE_SET_TEXT = android.graphics.pdf.models.FormEditRecord.EDIT_TYPE_SET_TEXT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder wrap(android.graphics.pdf.models.FormEditRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.models.FormEditRecord.Builder getReal() {
            return (android.graphics.pdf.models.FormEditRecord.Builder) real;
        }

        public android.graphics.pdf.models.FormEditRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1, int arg2) {
            this(new android.graphics.pdf.models.FormEditRecord.Builder(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.wrap(((android.graphics.pdf.models.FormEditRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder setClickPoint(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder.wrap(((android.graphics.pdf.models.FormEditRecord.Builder) real).setClickPoint(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder setSelectedIndices(int[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder.wrap(((android.graphics.pdf.models.FormEditRecord.Builder) real).setSelectedIndices(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder setText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder.wrap(((android.graphics.pdf.models.FormEditRecord.Builder) real).setText(arg0));
        }

    }
}
