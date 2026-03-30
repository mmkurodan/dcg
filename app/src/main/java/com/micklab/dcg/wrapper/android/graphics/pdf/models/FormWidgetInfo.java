// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class FormWidgetInfo {
    private final android.graphics.pdf.models.FormWidgetInfo real;

    public FormWidgetInfo(android.graphics.pdf.models.FormWidgetInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo wrap(android.graphics.pdf.models.FormWidgetInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo(real);
    }

    public android.graphics.pdf.models.FormWidgetInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAccessibilityLabel() {
        return real.getAccessibilityLabel();
    }

    public float getFontSize() {
        return real.getFontSize();
    }

    public int getMaxLength() {
        return real.getMaxLength();
    }

    public java.lang.String getTextValue() {
        return real.getTextValue();
    }

    public int getWidgetIndex() {
        return real.getWidgetIndex();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getWidgetRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getWidgetRect());
    }

    public int getWidgetType() {
        return real.getWidgetType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isEditableText() {
        return real.isEditableText();
    }

    public boolean isMultiLineText() {
        return real.isMultiLineText();
    }

    public boolean isMultiSelect() {
        return real.isMultiSelect();
    }

    public boolean isReadOnly() {
        return real.isReadOnly();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int WIDGET_TYPE_CHECKBOX = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_CHECKBOX;
    public static final int WIDGET_TYPE_COMBOBOX = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_COMBOBOX;
    public static final int WIDGET_TYPE_LISTBOX = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_LISTBOX;
    public static final int WIDGET_TYPE_PUSHBUTTON = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_PUSHBUTTON;
    public static final int WIDGET_TYPE_RADIOBUTTON = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_RADIOBUTTON;
    public static final int WIDGET_TYPE_SIGNATURE = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_SIGNATURE;
    public static final int WIDGET_TYPE_TEXTFIELD = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_TEXTFIELD;
    public static final int WIDGET_TYPE_UNKNOWN = android.graphics.pdf.models.FormWidgetInfo.WIDGET_TYPE_UNKNOWN;

    public static final class Builder {
        private final android.graphics.pdf.models.FormWidgetInfo.Builder real;

        public Builder(android.graphics.pdf.models.FormWidgetInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder wrap(android.graphics.pdf.models.FormWidgetInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder(real);
        }

        public android.graphics.pdf.models.FormWidgetInfo.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, java.lang.String arg3, java.lang.String arg4) {
            this(new android.graphics.pdf.models.FormWidgetInfo.Builder(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setEditableText(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(real.setEditableText(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setFontSize(float arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(real.setFontSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setMaxLength(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(real.setMaxLength(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setMultiLineText(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(real.setMultiLineText(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setMultiSelect(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(real.setMultiSelect(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setReadOnly(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(real.setReadOnly(arg0));
        }

    }
}
