// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RadioGroup {
    private final android.widget.RadioGroup real;

    public RadioGroup(android.widget.RadioGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RadioGroup wrap(android.widget.RadioGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioGroup(real);
    }

    public android.widget.RadioGroup unwrap() {
        return real;
    }

    public RadioGroup(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.RadioGroup(arg0 == null ? null : arg0.unwrap()));
    }

    public RadioGroup(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.RadioGroup(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void autofill(com.micklab.dcg.wrapper.android.view.autofill.AutofillValue arg0) {
        real.autofill(arg0 == null ? null : arg0.unwrap());
    }

    public void check(int arg0) {
        real.check(arg0);
    }

    public void clearCheck() {
        real.clearCheck();
    }

    public com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getAutofillType() {
        return real.getAutofillType();
    }

    public com.micklab.dcg.wrapper.android.view.autofill.AutofillValue getAutofillValue() {
        return com.micklab.dcg.wrapper.android.view.autofill.AutofillValue.wrap(real.getAutofillValue());
    }

    public int getCheckedRadioButtonId() {
        return real.getCheckedRadioButtonId();
    }

    public void onInitializeAccessibilityNodeInfo(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        real.onInitializeAccessibilityNodeInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnCheckedChangeListener(com.micklab.dcg.wrapper.android.widget.RadioGroup.OnCheckedChangeListener arg0) {
        real.setOnCheckedChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        real.setOnHierarchyChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class LayoutParams {
        private final android.widget.RadioGroup.LayoutParams real;

        public LayoutParams(android.widget.RadioGroup.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams wrap(android.widget.RadioGroup.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioGroup.LayoutParams(real);
        }

        public android.widget.RadioGroup.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.RadioGroup.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.RadioGroup.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.RadioGroup.LayoutParams(arg0, arg1));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.RadioGroup.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.RadioGroup.LayoutParams(arg0, arg1, arg2));
        }

    }
    public static final class OnCheckedChangeListener {
        private final android.widget.RadioGroup.OnCheckedChangeListener real;

        public OnCheckedChangeListener(android.widget.RadioGroup.OnCheckedChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RadioGroup.OnCheckedChangeListener wrap(android.widget.RadioGroup.OnCheckedChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RadioGroup.OnCheckedChangeListener(real);
        }

        public android.widget.RadioGroup.OnCheckedChangeListener unwrap() {
            return real;
        }

        public void onCheckedChanged(com.micklab.dcg.wrapper.android.widget.RadioGroup arg0, int arg1) {
            real.onCheckedChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
