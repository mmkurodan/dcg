// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TableLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TableLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TableLayout wrap(android.widget.TableLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableLayout(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TableLayout getReal() {
        return (android.widget.TableLayout) real;
    }

    public android.widget.TableLayout unwrap() {
        return getReal();
    }

    public TableLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TableLayout(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TableLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TableLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.TableLayout) real).addView(arg0 == null ? null : arg0.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.widget.TableLayout) real).addView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.widget.TableLayout) real).addView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        ((android.widget.TableLayout) real).addView(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams.wrap(((android.widget.TableLayout) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TableLayout) real).getAccessibilityClassName();
    }

    public boolean isColumnCollapsed(int arg0) {
        return ((android.widget.TableLayout) real).isColumnCollapsed(arg0);
    }

    public boolean isColumnShrinkable(int arg0) {
        return ((android.widget.TableLayout) real).isColumnShrinkable(arg0);
    }

    public boolean isColumnStretchable(int arg0) {
        return ((android.widget.TableLayout) real).isColumnStretchable(arg0);
    }

    public boolean isShrinkAllColumns() {
        return ((android.widget.TableLayout) real).isShrinkAllColumns();
    }

    public boolean isStretchAllColumns() {
        return ((android.widget.TableLayout) real).isStretchAllColumns();
    }

    public void requestLayout() {
        ((android.widget.TableLayout) real).requestLayout();
    }

    public void setColumnCollapsed(int arg0, boolean arg1) {
        ((android.widget.TableLayout) real).setColumnCollapsed(arg0, arg1);
    }

    public void setColumnShrinkable(int arg0, boolean arg1) {
        ((android.widget.TableLayout) real).setColumnShrinkable(arg0, arg1);
    }

    public void setColumnStretchable(int arg0, boolean arg1) {
        ((android.widget.TableLayout) real).setColumnStretchable(arg0, arg1);
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        ((android.widget.TableLayout) real).setOnHierarchyChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setShrinkAllColumns(boolean arg0) {
        ((android.widget.TableLayout) real).setShrinkAllColumns(arg0);
    }

    public void setStretchAllColumns(boolean arg0) {
        ((android.widget.TableLayout) real).setStretchAllColumns(arg0);
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams wrap(android.widget.TableLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TableLayout.LayoutParams getReal() {
            return (android.widget.TableLayout.LayoutParams) real;
        }

        public android.widget.TableLayout.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams() {
            this(new android.widget.TableLayout.LayoutParams(), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.TableLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.TableLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.TableLayout.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.TableLayout.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.TableLayout.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

    }
}
