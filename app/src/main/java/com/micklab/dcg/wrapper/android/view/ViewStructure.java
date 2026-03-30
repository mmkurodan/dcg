// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewStructure {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewStructure(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewStructure wrap(android.view.ViewStructure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStructure(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewStructure getReal() {
        return (android.view.ViewStructure) real;
    }

    public android.view.ViewStructure unwrap() {
        return getReal();
    }

    public int addChildCount(int arg0) {
        return ((android.view.ViewStructure) real).addChildCount(arg0);
    }

    public void asyncCommit() {
        ((android.view.ViewStructure) real).asyncCommit();
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure asyncNewChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(((android.view.ViewStructure) real).asyncNewChild(arg0));
    }

    public void clearCredentialManagerRequest() {
        ((android.view.ViewStructure) real).clearCredentialManagerRequest();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(((android.view.ViewStructure) real).getAutofillId());
    }

    public int getChildCount() {
        return ((android.view.ViewStructure) real).getChildCount();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.view.ViewStructure) real).getExtras());
    }

    public java.lang.CharSequence getHint() {
        return ((android.view.ViewStructure) real).getHint();
    }

    public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest getPendingCredentialRequest() {
        return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.wrap(((android.view.ViewStructure) real).getPendingCredentialRequest());
    }

    public java.lang.CharSequence getText() {
        return ((android.view.ViewStructure) real).getText();
    }

    public int getTextSelectionEnd() {
        return ((android.view.ViewStructure) real).getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return ((android.view.ViewStructure) real).getTextSelectionStart();
    }

    public boolean hasExtras() {
        return ((android.view.ViewStructure) real).hasExtras();
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure newChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(((android.view.ViewStructure) real).newChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder.wrap(((android.view.ViewStructure) real).newHtmlInfoBuilder(arg0));
    }

    public void setAccessibilityFocused(boolean arg0) {
        ((android.view.ViewStructure) real).setAccessibilityFocused(arg0);
    }

    public void setActivated(boolean arg0) {
        ((android.view.ViewStructure) real).setActivated(arg0);
    }

    public void setAlpha(float arg0) {
        ((android.view.ViewStructure) real).setAlpha(arg0);
    }

    public void setAutofillHints(java.lang.String[] arg0) {
        ((android.view.ViewStructure) real).setAutofillHints(arg0);
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        ((android.view.ViewStructure) real).setAutofillId(arg0 == null ? null : arg0.getReal());
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, int arg1) {
        ((android.view.ViewStructure) real).setAutofillId(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setAutofillOptions(java.lang.CharSequence[] arg0) {
        ((android.view.ViewStructure) real).setAutofillOptions(arg0);
    }

    public void setAutofillType(int arg0) {
        ((android.view.ViewStructure) real).setAutofillType(arg0);
    }

    public void setAutofillValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.view.ViewStructure) real).setAutofillValue(arg0 == null ? null : arg0.getReal());
    }

    public void setCheckable(boolean arg0) {
        ((android.view.ViewStructure) real).setCheckable(arg0);
    }

    public void setChecked(boolean arg0) {
        ((android.view.ViewStructure) real).setChecked(arg0);
    }

    public void setChildCount(int arg0) {
        ((android.view.ViewStructure) real).setChildCount(arg0);
    }

    public void setClassName(java.lang.String arg0) {
        ((android.view.ViewStructure) real).setClassName(arg0);
    }

    public void setClickable(boolean arg0) {
        ((android.view.ViewStructure) real).setClickable(arg0);
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        ((android.view.ViewStructure) real).setContentDescription(arg0);
    }

    public void setContextClickable(boolean arg0) {
        ((android.view.ViewStructure) real).setContextClickable(arg0);
    }

    public void setDataIsSensitive(boolean arg0) {
        ((android.view.ViewStructure) real).setDataIsSensitive(arg0);
    }

    public void setDimens(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.view.ViewStructure) real).setDimens(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void setElevation(float arg0) {
        ((android.view.ViewStructure) real).setElevation(arg0);
    }

    public void setEnabled(boolean arg0) {
        ((android.view.ViewStructure) real).setEnabled(arg0);
    }

    public void setFocusable(boolean arg0) {
        ((android.view.ViewStructure) real).setFocusable(arg0);
    }

    public void setFocused(boolean arg0) {
        ((android.view.ViewStructure) real).setFocused(arg0);
    }

    public void setHint(java.lang.CharSequence arg0) {
        ((android.view.ViewStructure) real).setHint(arg0);
    }

    public void setHintIdEntry(java.lang.String arg0) {
        ((android.view.ViewStructure) real).setHintIdEntry(arg0);
    }

    public void setHtmlInfo(com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo arg0) {
        ((android.view.ViewStructure) real).setHtmlInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setId(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.view.ViewStructure) real).setId(arg0, arg1, arg2, arg3);
    }

    public void setImportantForAutofill(int arg0) {
        ((android.view.ViewStructure) real).setImportantForAutofill(arg0);
    }

    public void setInputType(int arg0) {
        ((android.view.ViewStructure) real).setInputType(arg0);
    }

    public void setLocaleList(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        ((android.view.ViewStructure) real).setLocaleList(arg0 == null ? null : arg0.getReal());
    }

    public void setLongClickable(boolean arg0) {
        ((android.view.ViewStructure) real).setLongClickable(arg0);
    }

    public void setMaxTextEms(int arg0) {
        ((android.view.ViewStructure) real).setMaxTextEms(arg0);
    }

    public void setMaxTextLength(int arg0) {
        ((android.view.ViewStructure) real).setMaxTextLength(arg0);
    }

    public void setMinTextEms(int arg0) {
        ((android.view.ViewStructure) real).setMinTextEms(arg0);
    }

    public void setOpaque(boolean arg0) {
        ((android.view.ViewStructure) real).setOpaque(arg0);
    }

    public void setReceiveContentMimeTypes(java.lang.String[] arg0) {
        ((android.view.ViewStructure) real).setReceiveContentMimeTypes(arg0);
    }

    public void setSelected(boolean arg0) {
        ((android.view.ViewStructure) real).setSelected(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        ((android.view.ViewStructure) real).setText(arg0);
    }

    public void setText(java.lang.CharSequence arg0, int arg1, int arg2) {
        ((android.view.ViewStructure) real).setText(arg0, arg1, arg2);
    }

    public void setTextIdEntry(java.lang.String arg0) {
        ((android.view.ViewStructure) real).setTextIdEntry(arg0);
    }

    public void setTextLines(int[] arg0, int[] arg1) {
        ((android.view.ViewStructure) real).setTextLines(arg0, arg1);
    }

    public void setTextStyle(float arg0, int arg1, int arg2, int arg3) {
        ((android.view.ViewStructure) real).setTextStyle(arg0, arg1, arg2, arg3);
    }

    public void setTransformation(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        ((android.view.ViewStructure) real).setTransformation(arg0 == null ? null : arg0.getReal());
    }

    public void setVisibility(int arg0) {
        ((android.view.ViewStructure) real).setVisibility(arg0);
    }

    public void setWebDomain(java.lang.String arg0) {
        ((android.view.ViewStructure) real).setWebDomain(arg0);
    }

    public static final class HtmlInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HtmlInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo wrap(android.view.ViewStructure.HtmlInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewStructure.HtmlInfo getReal() {
            return (android.view.ViewStructure.HtmlInfo) real;
        }

        public android.view.ViewStructure.HtmlInfo unwrap() {
            return getReal();
        }

        public java.lang.String getTag() {
            return ((android.view.ViewStructure.HtmlInfo) real).getTag();
        }

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder wrap(android.view.ViewStructure.HtmlInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.view.ViewStructure.HtmlInfo.Builder getReal() {
                return (android.view.ViewStructure.HtmlInfo.Builder) real;
            }

            public android.view.ViewStructure.HtmlInfo.Builder unwrap() {
                return getReal();
            }

            public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder addAttribute(java.lang.String arg0, java.lang.String arg1) {
                return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder.wrap(((android.view.ViewStructure.HtmlInfo.Builder) real).addAttribute(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo build() {
                return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.wrap(((android.view.ViewStructure.HtmlInfo.Builder) real).build());
            }

        }
    }
}
