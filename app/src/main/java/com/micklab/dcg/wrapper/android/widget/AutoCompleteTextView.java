// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AutoCompleteTextView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutoCompleteTextView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView wrap(android.widget.AutoCompleteTextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.AutoCompleteTextView getReal() {
        return (android.widget.AutoCompleteTextView) real;
    }

    public android.widget.AutoCompleteTextView unwrap() {
        return getReal();
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg4) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal()), (__DcgwBridgeToken) null);
    }

    public void clearListSelection() {
        ((android.widget.AutoCompleteTextView) real).clearListSelection();
    }

    public void dismissDropDown() {
        ((android.widget.AutoCompleteTextView) real).dismissDropDown();
    }

    public boolean enoughToFilter() {
        return ((android.widget.AutoCompleteTextView) real).enoughToFilter();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.AutoCompleteTextView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(((android.widget.AutoCompleteTextView) real).getAdapter());
    }

    public java.lang.CharSequence getCompletionHint() {
        return ((android.widget.AutoCompleteTextView) real).getCompletionHint();
    }

    public int getDropDownAnchor() {
        return ((android.widget.AutoCompleteTextView) real).getDropDownAnchor();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDropDownBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.AutoCompleteTextView) real).getDropDownBackground());
    }

    public int getDropDownHeight() {
        return ((android.widget.AutoCompleteTextView) real).getDropDownHeight();
    }

    public int getDropDownHorizontalOffset() {
        return ((android.widget.AutoCompleteTextView) real).getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        return ((android.widget.AutoCompleteTextView) real).getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return ((android.widget.AutoCompleteTextView) real).getDropDownWidth();
    }

    public int getInputMethodMode() {
        return ((android.widget.AutoCompleteTextView) real).getInputMethodMode();
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener getItemClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener.wrap(((android.widget.AutoCompleteTextView) real).getItemClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener getItemSelectedListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener.wrap(((android.widget.AutoCompleteTextView) real).getItemSelectedListener());
    }

    public int getListSelection() {
        return ((android.widget.AutoCompleteTextView) real).getListSelection();
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener getOnItemClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener.wrap(((android.widget.AutoCompleteTextView) real).getOnItemClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener.wrap(((android.widget.AutoCompleteTextView) real).getOnItemSelectedListener());
    }

    public int getThreshold() {
        return ((android.widget.AutoCompleteTextView) real).getThreshold();
    }

    public com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator getValidator() {
        return com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator.wrap(((android.widget.AutoCompleteTextView) real).getValidator());
    }

    public boolean isPerformingCompletion() {
        return ((android.widget.AutoCompleteTextView) real).isPerformingCompletion();
    }

    public boolean isPopupShowing() {
        return ((android.widget.AutoCompleteTextView) real).isPopupShowing();
    }

    public void onCommitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        ((android.widget.AutoCompleteTextView) real).onCommitCompletion(arg0 == null ? null : arg0.getReal());
    }

    public void onFilterComplete(int arg0) {
        ((android.widget.AutoCompleteTextView) real).onFilterComplete(arg0);
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.AutoCompleteTextView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.AutoCompleteTextView) real).onKeyPreIme(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.AutoCompleteTextView) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.widget.AutoCompleteTextView) real).onWindowFocusChanged(arg0);
    }

    public void performCompletion() {
        ((android.widget.AutoCompleteTextView) real).performCompletion();
    }

    public void performValidation() {
        ((android.widget.AutoCompleteTextView) real).performValidation();
    }

    public void refreshAutoCompleteResults() {
        ((android.widget.AutoCompleteTextView) real).refreshAutoCompleteResults();
    }

    public void setCompletionHint(java.lang.CharSequence arg0) {
        ((android.widget.AutoCompleteTextView) real).setCompletionHint(arg0);
    }

    public void setDropDownAnchor(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownAnchor(arg0);
    }

    public void setDropDownBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setDropDownBackgroundResource(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownBackgroundResource(arg0);
    }

    public void setDropDownHeight(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownHeight(arg0);
    }

    public void setDropDownHorizontalOffset(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownHorizontalOffset(arg0);
    }

    public void setDropDownVerticalOffset(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownVerticalOffset(arg0);
    }

    public void setDropDownWidth(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setDropDownWidth(arg0);
    }

    public void setInputMethodMode(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setInputMethodMode(arg0);
    }

    public void setListSelection(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setListSelection(arg0);
    }

    public void setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.widget.AutoCompleteTextView) real).setOnClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.OnDismissListener arg0) {
        ((android.widget.AutoCompleteTextView) real).setOnDismissListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        ((android.widget.AutoCompleteTextView) real).setOnItemClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
        ((android.widget.AutoCompleteTextView) real).setOnItemSelectedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setText(java.lang.CharSequence arg0, boolean arg1) {
        ((android.widget.AutoCompleteTextView) real).setText(arg0, arg1);
    }

    public void setThreshold(int arg0) {
        ((android.widget.AutoCompleteTextView) real).setThreshold(arg0);
    }

    public void setValidator(com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator arg0) {
        ((android.widget.AutoCompleteTextView) real).setValidator(arg0 == null ? null : arg0.getReal());
    }

    public void showDropDown() {
        ((android.widget.AutoCompleteTextView) real).showDropDown();
    }

    public static final class OnDismissListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDismissListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.OnDismissListener wrap(android.widget.AutoCompleteTextView.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.OnDismissListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AutoCompleteTextView.OnDismissListener getReal() {
            return (android.widget.AutoCompleteTextView.OnDismissListener) real;
        }

        public android.widget.AutoCompleteTextView.OnDismissListener unwrap() {
            return getReal();
        }

        public void onDismiss() {
            ((android.widget.AutoCompleteTextView.OnDismissListener) real).onDismiss();
        }

    }
    public static final class Validator {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Validator(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator wrap(android.widget.AutoCompleteTextView.Validator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator(real, (__DcgwBridgeToken) null);
        }

        public android.widget.AutoCompleteTextView.Validator getReal() {
            return (android.widget.AutoCompleteTextView.Validator) real;
        }

        public android.widget.AutoCompleteTextView.Validator unwrap() {
            return getReal();
        }

        public java.lang.CharSequence fixText(java.lang.CharSequence arg0) {
            return ((android.widget.AutoCompleteTextView.Validator) real).fixText(arg0);
        }

        public boolean isValid(java.lang.CharSequence arg0) {
            return ((android.widget.AutoCompleteTextView.Validator) real).isValid(arg0);
        }

    }
}
