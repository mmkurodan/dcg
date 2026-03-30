// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AutoCompleteTextView {
    private final android.widget.AutoCompleteTextView real;

    public AutoCompleteTextView(android.widget.AutoCompleteTextView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView wrap(android.widget.AutoCompleteTextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView(real);
    }

    public android.widget.AutoCompleteTextView unwrap() {
        return real;
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.unwrap()));
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public AutoCompleteTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3, android.content.res.Resources.Theme arg4) {
        this(new android.widget.AutoCompleteTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public void clearListSelection() {
        real.clearListSelection();
    }

    public void dismissDropDown() {
        real.dismissDropDown();
    }

    public boolean enoughToFilter() {
        return real.enoughToFilter();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.widget.ListAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.widget.ListAdapter.wrap(real.getAdapter());
    }

    public java.lang.CharSequence getCompletionHint() {
        return real.getCompletionHint();
    }

    public int getDropDownAnchor() {
        return real.getDropDownAnchor();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDropDownBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDropDownBackground());
    }

    public int getDropDownHeight() {
        return real.getDropDownHeight();
    }

    public int getDropDownHorizontalOffset() {
        return real.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        return real.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return real.getDropDownWidth();
    }

    public int getInputMethodMode() {
        return real.getInputMethodMode();
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener getItemClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener.wrap(real.getItemClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener getItemSelectedListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener.wrap(real.getItemSelectedListener());
    }

    public int getListSelection() {
        return real.getListSelection();
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener getOnItemClickListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener.wrap(real.getOnItemClickListener());
    }

    public com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        return com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener.wrap(real.getOnItemSelectedListener());
    }

    public int getThreshold() {
        return real.getThreshold();
    }

    public com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator getValidator() {
        return com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator.wrap(real.getValidator());
    }

    public boolean isPerformingCompletion() {
        return real.isPerformingCompletion();
    }

    public boolean isPopupShowing() {
        return real.isPopupShowing();
    }

    public void onCommitCompletion(com.micklab.dcg.wrapper.android.view.inputmethod.CompletionInfo arg0) {
        real.onCommitCompletion(arg0 == null ? null : arg0.unwrap());
    }

    public void onFilterComplete(int arg0) {
        real.onFilterComplete(arg0);
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyPreIme(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyPreIme(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onWindowFocusChanged(boolean arg0) {
        real.onWindowFocusChanged(arg0);
    }

    public void performCompletion() {
        real.performCompletion();
    }

    public void performValidation() {
        real.performValidation();
    }

    public void refreshAutoCompleteResults() {
        real.refreshAutoCompleteResults();
    }

    public void setCompletionHint(java.lang.CharSequence arg0) {
        real.setCompletionHint(arg0);
    }

    public void setDropDownAnchor(int arg0) {
        real.setDropDownAnchor(arg0);
    }

    public void setDropDownBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setDropDownBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setDropDownBackgroundResource(int arg0) {
        real.setDropDownBackgroundResource(arg0);
    }

    public void setDropDownHeight(int arg0) {
        real.setDropDownHeight(arg0);
    }

    public void setDropDownHorizontalOffset(int arg0) {
        real.setDropDownHorizontalOffset(arg0);
    }

    public void setDropDownVerticalOffset(int arg0) {
        real.setDropDownVerticalOffset(arg0);
    }

    public void setDropDownWidth(int arg0) {
        real.setDropDownWidth(arg0);
    }

    public void setInputMethodMode(int arg0) {
        real.setInputMethodMode(arg0);
    }

    public void setListSelection(int arg0) {
        real.setListSelection(arg0);
    }

    public void setOnClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setOnClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDismissListener(com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.OnDismissListener arg0) {
        real.setOnDismissListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemClickListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemClickListener arg0) {
        real.setOnItemClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnItemSelectedListener(com.micklab.dcg.wrapper.android.widget.AdapterView.OnItemSelectedListener arg0) {
        real.setOnItemSelectedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setText(java.lang.CharSequence arg0, boolean arg1) {
        real.setText(arg0, arg1);
    }

    public void setThreshold(int arg0) {
        real.setThreshold(arg0);
    }

    public void setValidator(com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator arg0) {
        real.setValidator(arg0 == null ? null : arg0.unwrap());
    }

    public void showDropDown() {
        real.showDropDown();
    }

    public static final class OnDismissListener {
        private final android.widget.AutoCompleteTextView.OnDismissListener real;

        public OnDismissListener(android.widget.AutoCompleteTextView.OnDismissListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.OnDismissListener wrap(android.widget.AutoCompleteTextView.OnDismissListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.OnDismissListener(real);
        }

        public android.widget.AutoCompleteTextView.OnDismissListener unwrap() {
            return real;
        }

        public void onDismiss() {
            real.onDismiss();
        }

    }
    public static final class Validator {
        private final android.widget.AutoCompleteTextView.Validator real;

        public Validator(android.widget.AutoCompleteTextView.Validator real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator wrap(android.widget.AutoCompleteTextView.Validator real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AutoCompleteTextView.Validator(real);
        }

        public android.widget.AutoCompleteTextView.Validator unwrap() {
            return real;
        }

        public java.lang.CharSequence fixText(java.lang.CharSequence arg0) {
            return real.fixText(arg0);
        }

        public boolean isValid(java.lang.CharSequence arg0) {
            return real.isValid(arg0);
        }

    }
}
