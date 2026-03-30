// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class TableRow {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TableRow(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.TableRow wrap(android.widget.TableRow real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableRow(real, (__DcgwBridgeToken) null);
    }

    public android.widget.TableRow getReal() {
        return (android.widget.TableRow) real;
    }

    public android.widget.TableRow unwrap() {
        return getReal();
    }

    public TableRow(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.TableRow(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TableRow(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.TableRow(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams.wrap(((android.widget.TableRow) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.TableRow) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getVirtualChildAt(int arg0) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.TableRow) real).getVirtualChildAt(arg0));
    }

    public int getVirtualChildCount() {
        return ((android.widget.TableRow) real).getVirtualChildCount();
    }

    public void setOnHierarchyChangeListener(com.micklab.dcg.wrapper.android.view.ViewGroup.OnHierarchyChangeListener arg0) {
        ((android.widget.TableRow) real).setOnHierarchyChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams wrap(android.widget.TableRow.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.TableRow.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.TableRow.LayoutParams getReal() {
            return (android.widget.TableRow.LayoutParams) real;
        }

        public android.widget.TableRow.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams() {
            this(new android.widget.TableRow.LayoutParams(), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0) {
            this(new android.widget.TableRow.LayoutParams(arg0), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.TableRow.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.TableRow.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.TableRow.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.widget.TableRow.LayoutParams(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public LayoutParams(int arg0, int arg1, float arg2) {
            this(new android.widget.TableRow.LayoutParams(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }


    }
}
