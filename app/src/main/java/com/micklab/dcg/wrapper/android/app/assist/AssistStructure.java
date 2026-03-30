// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.assist;

public final class AssistStructure {
    private final android.app.assist.AssistStructure real;

    public AssistStructure(android.app.assist.AssistStructure real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.assist.AssistStructure wrap(android.app.assist.AssistStructure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistStructure(real);
    }

    public android.app.assist.AssistStructure unwrap() {
        return real;
    }

    public AssistStructure() {
        this(new android.app.assist.AssistStructure());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getAcquisitionEndTime() {
        return real.getAcquisitionEndTime();
    }

    public long getAcquisitionStartTime() {
        return real.getAcquisitionStartTime();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getActivityComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.getActivityComponent());
    }

    public com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode getWindowNodeAt(int arg0) {
        return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode.wrap(real.getWindowNodeAt(arg0));
    }

    public int getWindowNodeCount() {
        return real.getWindowNodeCount();
    }

    public boolean isHomeActivity() {
        return real.isHomeActivity();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class ViewNode {
        private final android.app.assist.AssistStructure.ViewNode real;

        public ViewNode(android.app.assist.AssistStructure.ViewNode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode wrap(android.app.assist.AssistStructure.ViewNode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode(real);
        }

        public android.app.assist.AssistStructure.ViewNode unwrap() {
            return real;
        }

        public float getAlpha() {
            return real.getAlpha();
        }

        public java.lang.String[] getAutofillHints() {
            return real.getAutofillHints();
        }

        public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
            return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getAutofillId());
        }

        public java.lang.CharSequence[] getAutofillOptions() {
            return real.getAutofillOptions();
        }

        public int getAutofillType() {
            return real.getAutofillType();
        }

        public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
            return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode getChildAt(int arg0) {
            return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode.wrap(real.getChildAt(arg0));
        }

        public int getChildCount() {
            return real.getChildCount();
        }

        public java.lang.String getClassName() {
            return real.getClassName();
        }

        public java.lang.CharSequence getContentDescription() {
            return real.getContentDescription();
        }

        public float getElevation() {
            return real.getElevation();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public int getHeight() {
            return real.getHeight();
        }

        public java.lang.String getHint() {
            return real.getHint();
        }

        public java.lang.String getHintIdEntry() {
            return real.getHintIdEntry();
        }

        public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo getHtmlInfo() {
            return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.wrap(real.getHtmlInfo());
        }

        public int getId() {
            return real.getId();
        }

        public java.lang.String getIdEntry() {
            return real.getIdEntry();
        }

        public java.lang.String getIdPackage() {
            return real.getIdPackage();
        }

        public java.lang.String getIdType() {
            return real.getIdType();
        }

        public int getImportantForAutofill() {
            return real.getImportantForAutofill();
        }

        public int getInputType() {
            return real.getInputType();
        }

        public int getLeft() {
            return real.getLeft();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getLocaleList() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getLocaleList());
        }

        public int getMaxTextEms() {
            return real.getMaxTextEms();
        }

        public int getMaxTextLength() {
            return real.getMaxTextLength();
        }

        public int getMinTextEms() {
            return real.getMinTextEms();
        }

        public java.lang.String[] getReceiveContentMimeTypes() {
            return real.getReceiveContentMimeTypes();
        }

        public int getScrollX() {
            return real.getScrollX();
        }

        public int getScrollY() {
            return real.getScrollY();
        }

        public java.lang.CharSequence getText() {
            return real.getText();
        }

        public int getTextBackgroundColor() {
            return real.getTextBackgroundColor();
        }

        public int getTextColor() {
            return real.getTextColor();
        }

        public java.lang.String getTextIdEntry() {
            return real.getTextIdEntry();
        }

        public int[] getTextLineBaselines() {
            return real.getTextLineBaselines();
        }

        public int[] getTextLineCharOffsets() {
            return real.getTextLineCharOffsets();
        }

        public int getTextSelectionEnd() {
            return real.getTextSelectionEnd();
        }

        public int getTextSelectionStart() {
            return real.getTextSelectionStart();
        }

        public float getTextSize() {
            return real.getTextSize();
        }

        public int getTextStyle() {
            return real.getTextStyle();
        }

        public int getTop() {
            return real.getTop();
        }

        public com.micklab.dcg.wrapper.android.graphics.Matrix getTransformation() {
            return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(real.getTransformation());
        }

        public int getVisibility() {
            return real.getVisibility();
        }

        public java.lang.String getWebDomain() {
            return real.getWebDomain();
        }

        public java.lang.String getWebScheme() {
            return real.getWebScheme();
        }

        public int getWidth() {
            return real.getWidth();
        }

        public boolean isAccessibilityFocused() {
            return real.isAccessibilityFocused();
        }

        public boolean isActivated() {
            return real.isActivated();
        }

        public boolean isAssistBlocked() {
            return real.isAssistBlocked();
        }

        public boolean isCheckable() {
            return real.isCheckable();
        }

        public boolean isChecked() {
            return real.isChecked();
        }

        public boolean isClickable() {
            return real.isClickable();
        }

        public boolean isContextClickable() {
            return real.isContextClickable();
        }

        public boolean isEnabled() {
            return real.isEnabled();
        }

        public boolean isFocusable() {
            return real.isFocusable();
        }

        public boolean isFocused() {
            return real.isFocused();
        }

        public boolean isLongClickable() {
            return real.isLongClickable();
        }

        public boolean isOpaque() {
            return real.isOpaque();
        }

        public boolean isSelected() {
            return real.isSelected();
        }

        public static final int TEXT_COLOR_UNDEFINED = android.app.assist.AssistStructure.ViewNode.TEXT_COLOR_UNDEFINED;
        public static final int TEXT_STYLE_BOLD = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_BOLD;
        public static final int TEXT_STYLE_ITALIC = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_ITALIC;
        public static final int TEXT_STYLE_STRIKE_THRU = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_STRIKE_THRU;
        public static final int TEXT_STYLE_UNDERLINE = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_UNDERLINE;

    }
    public static final class WindowNode {
        private final android.app.assist.AssistStructure.WindowNode real;

        public WindowNode(android.app.assist.AssistStructure.WindowNode real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode wrap(android.app.assist.AssistStructure.WindowNode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode(real);
        }

        public android.app.assist.AssistStructure.WindowNode unwrap() {
            return real;
        }

        public int getDisplayId() {
            return real.getDisplayId();
        }

        public int getHeight() {
            return real.getHeight();
        }

        public int getLeft() {
            return real.getLeft();
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode getRootViewNode() {
            return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode.wrap(real.getRootViewNode());
        }

        public java.lang.CharSequence getTitle() {
            return real.getTitle();
        }

        public int getTop() {
            return real.getTop();
        }

        public int getWidth() {
            return real.getWidth();
        }

    }
}
