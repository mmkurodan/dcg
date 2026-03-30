// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TableRow {
    private final android.widget.TableRow real;

    public TableRow(android.widget.TableRow real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TableRow wrap(android.widget.TableRow real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableRow(real);
    }

    public android.widget.TableRow unwrap() {
        return real;
    }

    public TableRow(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TableRow(arg0 == null ? null : arg0.unwrap()));
    }

    public TableRow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TableRow(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getVirtualChildAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getVirtualChildAt(arg0));
    }

    public int getVirtualChildCount() {
        return real.getVirtualChildCount();
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        real.setOnHierarchyChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class LayoutParams {
        private final android.widget.TableRow.LayoutParams real;

        public LayoutParams(android.widget.TableRow.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams wrap(android.widget.TableRow.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams(real);
        }

        public android.widget.TableRow.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams() {
            this(new android.widget.TableRow.LayoutParams());
        }

        public LayoutParams(int arg0) {
            this(new android.widget.TableRow.LayoutParams(arg0));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.TableRow.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.TableRow.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.TableRow.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.TableRow.LayoutParams(arg0, arg1));
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.TableRow.LayoutParams(arg0, arg1, arg2));
        }


    }
}
