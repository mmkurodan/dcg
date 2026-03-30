// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.assist;

public final class AssistStructure {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssistStructure(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.assist.AssistStructure wrap(android.app.assist.AssistStructure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistStructure(real, (__DcgwBridgeToken) null);
    }

    public android.app.assist.AssistStructure getReal() {
        return (android.app.assist.AssistStructure) real;
    }

    public android.app.assist.AssistStructure unwrap() {
        return getReal();
    }

    public AssistStructure() {
        this(new android.app.assist.AssistStructure(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.app.assist.AssistStructure) real).describeContents();
    }

    public long getAcquisitionEndTime() {
        return ((android.app.assist.AssistStructure) real).getAcquisitionEndTime();
    }

    public long getAcquisitionStartTime() {
        return ((android.app.assist.AssistStructure) real).getAcquisitionStartTime();
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getActivityComponent() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.app.assist.AssistStructure) real).getActivityComponent());
    }

    public com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode getWindowNodeAt(int arg0) {
        return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode.wrap(((android.app.assist.AssistStructure) real).getWindowNodeAt(arg0));
    }

    public int getWindowNodeCount() {
        return ((android.app.assist.AssistStructure) real).getWindowNodeCount();
    }

    public boolean isHomeActivity() {
        return ((android.app.assist.AssistStructure) real).isHomeActivity();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.assist.AssistStructure) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class ViewNode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ViewNode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode wrap(android.app.assist.AssistStructure.ViewNode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode(real, (__DcgwBridgeToken) null);
        }

        public android.app.assist.AssistStructure.ViewNode getReal() {
            return (android.app.assist.AssistStructure.ViewNode) real;
        }

        public android.app.assist.AssistStructure.ViewNode unwrap() {
            return getReal();
        }

        public float getAlpha() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getAlpha();
        }

        public java.lang.String[] getAutofillHints() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getAutofillHints();
        }

        public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
            return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.app.assist.AssistStructure.ViewNode) real).getAutofillId());
        }

        public java.lang.CharSequence[] getAutofillOptions() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getAutofillOptions();
        }

        public int getAutofillType() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getAutofillType();
        }

        public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
            return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.app.assist.AssistStructure.ViewNode) real).getAutofillValue());
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode getChildAt(int arg0) {
            return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode.wrap(((android.app.assist.AssistStructure.ViewNode) real).getChildAt(arg0));
        }

        public int getChildCount() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getChildCount();
        }

        public java.lang.String getClassName() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getClassName();
        }

        public java.lang.CharSequence getContentDescription() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getContentDescription();
        }

        public float getElevation() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getElevation();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.assist.AssistStructure.ViewNode) real).getExtras());
        }

        public int getHeight() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getHeight();
        }

        public java.lang.String getHint() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getHint();
        }

        public java.lang.String getHintIdEntry() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getHintIdEntry();
        }

        public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo getHtmlInfo() {
            return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.wrap(((android.app.assist.AssistStructure.ViewNode) real).getHtmlInfo());
        }

        public int getId() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getId();
        }

        public java.lang.String getIdEntry() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getIdEntry();
        }

        public java.lang.String getIdPackage() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getIdPackage();
        }

        public java.lang.String getIdType() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getIdType();
        }

        public int getImportantForAutofill() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getImportantForAutofill();
        }

        public int getInputType() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getInputType();
        }

        public int getLeft() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getLeft();
        }

        public com.micklab.dcg.wrapper.android.os.LocaleList getLocaleList() {
            return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.app.assist.AssistStructure.ViewNode) real).getLocaleList());
        }

        public int getMaxTextEms() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getMaxTextEms();
        }

        public int getMaxTextLength() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getMaxTextLength();
        }

        public int getMinTextEms() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getMinTextEms();
        }

        public java.lang.String[] getReceiveContentMimeTypes() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getReceiveContentMimeTypes();
        }

        public int getScrollX() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getScrollX();
        }

        public int getScrollY() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getScrollY();
        }

        public java.lang.CharSequence getText() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getText();
        }

        public int getTextBackgroundColor() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextBackgroundColor();
        }

        public int getTextColor() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextColor();
        }

        public java.lang.String getTextIdEntry() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextIdEntry();
        }

        public int[] getTextLineBaselines() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextLineBaselines();
        }

        public int[] getTextLineCharOffsets() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextLineCharOffsets();
        }

        public int getTextSelectionEnd() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextSelectionEnd();
        }

        public int getTextSelectionStart() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextSelectionStart();
        }

        public float getTextSize() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextSize();
        }

        public int getTextStyle() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTextStyle();
        }

        public int getTop() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getTop();
        }

        public com.micklab.dcg.wrapper.android.graphics.Matrix getTransformation() {
            return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.app.assist.AssistStructure.ViewNode) real).getTransformation());
        }

        public int getVisibility() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getVisibility();
        }

        public java.lang.String getWebDomain() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getWebDomain();
        }

        public java.lang.String getWebScheme() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getWebScheme();
        }

        public int getWidth() {
            return ((android.app.assist.AssistStructure.ViewNode) real).getWidth();
        }

        public boolean isAccessibilityFocused() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isAccessibilityFocused();
        }

        public boolean isActivated() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isActivated();
        }

        public boolean isAssistBlocked() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isAssistBlocked();
        }

        public boolean isCheckable() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isCheckable();
        }

        public boolean isChecked() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isChecked();
        }

        public boolean isClickable() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isClickable();
        }

        public boolean isContextClickable() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isContextClickable();
        }

        public boolean isEnabled() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isEnabled();
        }

        public boolean isFocusable() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isFocusable();
        }

        public boolean isFocused() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isFocused();
        }

        public boolean isLongClickable() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isLongClickable();
        }

        public boolean isOpaque() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isOpaque();
        }

        public boolean isSelected() {
            return ((android.app.assist.AssistStructure.ViewNode) real).isSelected();
        }

        public static final int TEXT_COLOR_UNDEFINED = android.app.assist.AssistStructure.ViewNode.TEXT_COLOR_UNDEFINED;
        public static final int TEXT_STYLE_BOLD = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_BOLD;
        public static final int TEXT_STYLE_ITALIC = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_ITALIC;
        public static final int TEXT_STYLE_STRIKE_THRU = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_STRIKE_THRU;
        public static final int TEXT_STYLE_UNDERLINE = android.app.assist.AssistStructure.ViewNode.TEXT_STYLE_UNDERLINE;

    }
    public static final class WindowNode {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WindowNode(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode wrap(android.app.assist.AssistStructure.WindowNode real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.assist.AssistStructure.WindowNode(real, (__DcgwBridgeToken) null);
        }

        public android.app.assist.AssistStructure.WindowNode getReal() {
            return (android.app.assist.AssistStructure.WindowNode) real;
        }

        public android.app.assist.AssistStructure.WindowNode unwrap() {
            return getReal();
        }

        public int getDisplayId() {
            return ((android.app.assist.AssistStructure.WindowNode) real).getDisplayId();
        }

        public int getHeight() {
            return ((android.app.assist.AssistStructure.WindowNode) real).getHeight();
        }

        public int getLeft() {
            return ((android.app.assist.AssistStructure.WindowNode) real).getLeft();
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode getRootViewNode() {
            return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.ViewNode.wrap(((android.app.assist.AssistStructure.WindowNode) real).getRootViewNode());
        }

        public java.lang.CharSequence getTitle() {
            return ((android.app.assist.AssistStructure.WindowNode) real).getTitle();
        }

        public int getTop() {
            return ((android.app.assist.AssistStructure.WindowNode) real).getTop();
        }

        public int getWidth() {
            return ((android.app.assist.AssistStructure.WindowNode) real).getWidth();
        }

    }
}
