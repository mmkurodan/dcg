// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewStructure {
    private final android.view.ViewStructure real;

    public ViewStructure(android.view.ViewStructure real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewStructure wrap(android.view.ViewStructure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStructure(real);
    }

    public android.view.ViewStructure unwrap() {
        return real;
    }

    public int addChildCount(int arg0) {
        return real.addChildCount(arg0);
    }

    public void asyncCommit() {
        real.asyncCommit();
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure asyncNewChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(real.asyncNewChild(arg0));
    }

    public void clearCredentialManagerRequest() {
        real.clearCredentialManagerRequest();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillId getAutofillId() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillId.wrap(real.getAutofillId());
    }

    public int getChildCount() {
        return real.getChildCount();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.CharSequence getHint() {
        return real.getHint();
    }

    public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest getPendingCredentialRequest() {
        return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.wrap(real.getPendingCredentialRequest());
    }

    public java.lang.CharSequence getText() {
        return real.getText();
    }

    public int getTextSelectionEnd() {
        return real.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return real.getTextSelectionStart();
    }

    public boolean hasExtras() {
        return real.hasExtras();
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure newChild(int arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.wrap(real.newChild(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder newHtmlInfoBuilder(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder.wrap(real.newHtmlInfoBuilder(arg0));
    }

    public void setAccessibilityFocused(boolean arg0) {
        real.setAccessibilityFocused(arg0);
    }

    public void setActivated(boolean arg0) {
        real.setActivated(arg0);
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

    public void setAutofillHints(java.lang.String[] arg0) {
        real.setAutofillHints(arg0);
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0) {
        real.setAutofillId(arg0 == null ? null : arg0.unwrap());
    }

    public void setAutofillId(com.micklab.dcg.wrapper.android.view.autofill.AutofillId arg0, int arg1) {
        real.setAutofillId(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setAutofillOptions(java.lang.CharSequence[] arg0) {
        real.setAutofillOptions(arg0);
    }

    public void setAutofillType(int arg0) {
        real.setAutofillType(arg0);
    }

    public void setAutofillValue(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.setAutofillValue(arg0 == null ? null : arg0.unwrap());
    }

    public void setCheckable(boolean arg0) {
        real.setCheckable(arg0);
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setChildCount(int arg0) {
        real.setChildCount(arg0);
    }

    public void setClassName(java.lang.String arg0) {
        real.setClassName(arg0);
    }

    public void setClickable(boolean arg0) {
        real.setClickable(arg0);
    }

    public void setContentDescription(java.lang.CharSequence arg0) {
        real.setContentDescription(arg0);
    }

    public void setContextClickable(boolean arg0) {
        real.setContextClickable(arg0);
    }

    public void setDataIsSensitive(boolean arg0) {
        real.setDataIsSensitive(arg0);
    }

    public void setDimens(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.setDimens(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void setElevation(float arg0) {
        real.setElevation(arg0);
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setFocusable(boolean arg0) {
        real.setFocusable(arg0);
    }

    public void setFocused(boolean arg0) {
        real.setFocused(arg0);
    }

    public void setHint(java.lang.CharSequence arg0) {
        real.setHint(arg0);
    }

    public void setHintIdEntry(java.lang.String arg0) {
        real.setHintIdEntry(arg0);
    }

    public void setHtmlInfo(com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo arg0) {
        real.setHtmlInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setId(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        real.setId(arg0, arg1, arg2, arg3);
    }

    public void setImportantForAutofill(int arg0) {
        real.setImportantForAutofill(arg0);
    }

    public void setInputType(int arg0) {
        real.setInputType(arg0);
    }

    public void setLocaleList(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        real.setLocaleList(arg0 == null ? null : arg0.unwrap());
    }

    public void setLongClickable(boolean arg0) {
        real.setLongClickable(arg0);
    }

    public void setMaxTextEms(int arg0) {
        real.setMaxTextEms(arg0);
    }

    public void setMaxTextLength(int arg0) {
        real.setMaxTextLength(arg0);
    }

    public void setMinTextEms(int arg0) {
        real.setMinTextEms(arg0);
    }

    public void setOpaque(boolean arg0) {
        real.setOpaque(arg0);
    }

    public void setReceiveContentMimeTypes(java.lang.String[] arg0) {
        real.setReceiveContentMimeTypes(arg0);
    }

    public void setSelected(boolean arg0) {
        real.setSelected(arg0);
    }

    public void setText(java.lang.CharSequence arg0) {
        real.setText(arg0);
    }

    public void setText(java.lang.CharSequence arg0, int arg1, int arg2) {
        real.setText(arg0, arg1, arg2);
    }

    public void setTextIdEntry(java.lang.String arg0) {
        real.setTextIdEntry(arg0);
    }

    public void setTextLines(int[] arg0, int[] arg1) {
        real.setTextLines(arg0, arg1);
    }

    public void setTextStyle(float arg0, int arg1, int arg2, int arg3) {
        real.setTextStyle(arg0, arg1, arg2, arg3);
    }

    public void setTransformation(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.setTransformation(arg0 == null ? null : arg0.unwrap());
    }

    public void setVisibility(int arg0) {
        real.setVisibility(arg0);
    }

    public void setWebDomain(java.lang.String arg0) {
        real.setWebDomain(arg0);
    }

    public static final class HtmlInfo {
        private final android.view.ViewStructure.HtmlInfo real;

        public HtmlInfo(android.view.ViewStructure.HtmlInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo wrap(android.view.ViewStructure.HtmlInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo(real);
        }

        public android.view.ViewStructure.HtmlInfo unwrap() {
            return real;
        }

        public java.lang.String getTag() {
            return real.getTag();
        }

        public static final class Builder {
            private final android.view.ViewStructure.HtmlInfo.Builder real;

            public Builder(android.view.ViewStructure.HtmlInfo.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder wrap(android.view.ViewStructure.HtmlInfo.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder(real);
            }

            public android.view.ViewStructure.HtmlInfo.Builder unwrap() {
                return real;
            }

            public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder addAttribute(java.lang.String arg0, java.lang.String arg1) {
                return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.Builder.wrap(real.addAttribute(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo build() {
                return com.micklab.dcg.wrapper.android.view.ViewStructure.HtmlInfo.wrap(real.build());
            }

        }
    }
}
