// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RadioGroup {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RadioGroup(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RadioGroup wrap(android.widget.RadioGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioGroup(real, (__DcgwBridgeToken) null);
    }

    public android.widget.RadioGroup getReal() {
        return (android.widget.RadioGroup) real;
    }

    public android.widget.RadioGroup unwrap() {
        return getReal();
    }

    public RadioGroup(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RadioGroup(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RadioGroup(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RadioGroup(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.RadioGroup) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        ((android.widget.RadioGroup) real).autofill(arg0 == null ? null : arg0.getReal());
    }

    public void check(int arg0) {
        ((android.widget.RadioGroup) real).check(arg0);
    }

    public void clearCheck() {
        ((android.widget.RadioGroup) real).clearCheck();
    }

    public com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams.wrap(((android.widget.RadioGroup) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.RadioGroup) real).getAccessibilityClassName();
    }

    public int getAutofillType() {
        return ((android.widget.RadioGroup) real).getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(((android.widget.RadioGroup) real).getAutofillValue());
    }

    public int getCheckedRadioButtonId() {
        return ((android.widget.RadioGroup) real).getCheckedRadioButtonId();
    }

    public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        ((android.widget.RadioGroup) real).onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setOnCheckedChangeListener(com.micklab.dcg.wrapper.android.widget.RadioGroup.OnCheckedChangeListener arg0) {
        ((android.widget.RadioGroup) real).setOnCheckedChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        ((android.widget.RadioGroup) real).setOnHierarchyChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams wrap(android.widget.RadioGroup.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RadioGroup.LayoutParams getReal() {
            return (android.widget.RadioGroup.LayoutParams) real;
        }

        public android.widget.RadioGroup.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.RadioGroup.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.RadioGroup.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.RadioGroup.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.RadioGroup.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.RadioGroup.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

    }
    public static final class OnCheckedChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnCheckedChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RadioGroup.OnCheckedChangeListener wrap(android.widget.RadioGroup.OnCheckedChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioGroup.OnCheckedChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RadioGroup.OnCheckedChangeListener getReal() {
            return (android.widget.RadioGroup.OnCheckedChangeListener) real;
        }

        public android.widget.RadioGroup.OnCheckedChangeListener unwrap() {
            return getReal();
        }

        public void onCheckedChanged(com.micklab.dcg.wrapper.android.widget.RadioGroup arg0, int arg1) {
            ((android.widget.RadioGroup.OnCheckedChangeListener) real).onCheckedChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
