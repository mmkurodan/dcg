// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class FormEditRecord {
    private final android.graphics.pdf.models.FormEditRecord real;

    public FormEditRecord(android.graphics.pdf.models.FormEditRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord wrap(android.graphics.pdf.models.FormEditRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord(real);
    }

    public android.graphics.pdf.models.FormEditRecord unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getClickPoint() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getClickPoint());
    }

    public int getPageNumber() {
        return real.getPageNumber();
    }

    public int[] getSelectedIndices() {
        return real.getSelectedIndices();
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public int getType() {
        return real.getType();
    }

    public int getWidgetIndex() {
        return real.getWidgetIndex();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int EDIT_TYPE_CLICK = android.graphics.pdf.models.FormEditRecord.EDIT_TYPE_CLICK;
    public static final int EDIT_TYPE_SET_INDICES = android.graphics.pdf.models.FormEditRecord.EDIT_TYPE_SET_INDICES;
    public static final int EDIT_TYPE_SET_TEXT = android.graphics.pdf.models.FormEditRecord.EDIT_TYPE_SET_TEXT;

    public static final class Builder {
        private final android.graphics.pdf.models.FormEditRecord.Builder real;

        public Builder(android.graphics.pdf.models.FormEditRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder wrap(android.graphics.pdf.models.FormEditRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder(real);
        }

        public android.graphics.pdf.models.FormEditRecord.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1, int arg2) {
            this(new android.graphics.pdf.models.FormEditRecord.Builder(arg0, arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder setClickPoint(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder.wrap(real.setClickPoint(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder setSelectedIndices(int[] arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder.wrap(real.setSelectedIndices(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder setText(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormEditRecord.Builder.wrap(real.setText(arg0));
        }

    }
}
