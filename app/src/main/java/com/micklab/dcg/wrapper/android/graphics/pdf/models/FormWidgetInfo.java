// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.pdf.models;

public final class FormWidgetInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FormWidgetInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo wrap(android.graphics.pdf.models.FormWidgetInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.pdf.models.FormWidgetInfo getReal() {
        return (android.graphics.pdf.models.FormWidgetInfo) real;
    }

    public android.graphics.pdf.models.FormWidgetInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).equals(arg0);
    }

    public java.lang.String getAccessibilityLabel() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).getAccessibilityLabel();
    }

    public float getFontSize() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).getFontSize();
    }

    public int getMaxLength() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).getMaxLength();
    }

    public java.lang.String getTextValue() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).getTextValue();
    }

    public int getWidgetIndex() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).getWidgetIndex();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getWidgetRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.pdf.models.FormWidgetInfo) real).getWidgetRect());
    }

    public int getWidgetType() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).getWidgetType();
    }

    public int hashCode() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).hashCode();
    }

    public boolean isEditableText() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).isEditableText();
    }

    public boolean isMultiLineText() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).isMultiLineText();
    }

    public boolean isMultiSelect() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).isMultiSelect();
    }

    public boolean isReadOnly() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).isReadOnly();
    }

    public java.lang.String toString() {
        return ((android.graphics.pdf.models.FormWidgetInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.pdf.models.FormWidgetInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder wrap(android.graphics.pdf.models.FormWidgetInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.pdf.models.FormWidgetInfo.Builder getReal() {
            return (android.graphics.pdf.models.FormWidgetInfo.Builder) real;
        }

        public android.graphics.pdf.models.FormWidgetInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, java.lang.String arg3, java.lang.String arg4) {
            this(new android.graphics.pdf.models.FormWidgetInfo.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo build() {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setEditableText(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).setEditableText(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setFontSize(float arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).setFontSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setMaxLength(int arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).setMaxLength(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setMultiLineText(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).setMultiLineText(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setMultiSelect(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).setMultiSelect(arg0));
        }

        public com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder setReadOnly(boolean arg0) {
            return com.micklab.dcg.wrapper.android.graphics.pdf.models.FormWidgetInfo.Builder.wrap(((android.graphics.pdf.models.FormWidgetInfo.Builder) real).setReadOnly(arg0));
        }

    }
}
