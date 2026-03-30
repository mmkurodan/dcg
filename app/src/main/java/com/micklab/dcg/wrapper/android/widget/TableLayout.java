// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TableLayout {
    private final android.widget.TableLayout real;

    public TableLayout(android.widget.TableLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TableLayout wrap(android.widget.TableLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableLayout(real);
    }

    public android.widget.TableLayout unwrap() {
        return real;
    }

    public TableLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TableLayout(arg0 == null ? null : arg0.unwrap()));
    }

    public TableLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TableLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.addView(arg0 == null ? null : arg0.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg2) {
        real.addView(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean isColumnCollapsed(int arg0) {
        return real.isColumnCollapsed(arg0);
    }

    public boolean isColumnShrinkable(int arg0) {
        return real.isColumnShrinkable(arg0);
    }

    public boolean isColumnStretchable(int arg0) {
        return real.isColumnStretchable(arg0);
    }

    public boolean isShrinkAllColumns() {
        return real.isShrinkAllColumns();
    }

    public boolean isStretchAllColumns() {
        return real.isStretchAllColumns();
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void setColumnCollapsed(int arg0, boolean arg1) {
        real.setColumnCollapsed(arg0, arg1);
    }

    public void setColumnShrinkable(int arg0, boolean arg1) {
        real.setColumnShrinkable(arg0, arg1);
    }

    public void setColumnStretchable(int arg0, boolean arg1) {
        real.setColumnStretchable(arg0, arg1);
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        real.setOnHierarchyChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setShrinkAllColumns(boolean arg0) {
        real.setShrinkAllColumns(arg0);
    }

    public void setStretchAllColumns(boolean arg0) {
        real.setStretchAllColumns(arg0);
    }

    public static final class LayoutParams {
        private final android.widget.TableLayout.LayoutParams real;

        public LayoutParams(android.widget.TableLayout.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams wrap(android.widget.TableLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableLayout.LayoutParams(real);
        }

        public android.widget.TableLayout.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams() {
            this(new android.widget.TableLayout.LayoutParams());
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.TableLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.TableLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.TableLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.TableLayout.LayoutParams(arg0, arg1));
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.TableLayout.LayoutParams(arg0, arg1, arg2));
        }

    }
}
