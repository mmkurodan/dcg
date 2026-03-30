// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class GridLayout {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GridLayout(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout wrap(android.widget.GridLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout(real, (__DcgwBridgeToken) null);
    }

    public android.widget.GridLayout getReal() {
        return (android.widget.GridLayout) real;
    }

    public android.widget.GridLayout unwrap() {
        return getReal();
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams.wrap(((android.widget.GridLayout) real).generateLayoutParams(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.GridLayout) real).getAccessibilityClassName();
    }

    public int getAlignmentMode() {
        return ((android.widget.GridLayout) real).getAlignmentMode();
    }

    public int getColumnCount() {
        return ((android.widget.GridLayout) real).getColumnCount();
    }

    public int getOrientation() {
        return ((android.widget.GridLayout) real).getOrientation();
    }

    public int getRowCount() {
        return ((android.widget.GridLayout) real).getRowCount();
    }

    public boolean getUseDefaultMargins() {
        return ((android.widget.GridLayout) real).getUseDefaultMargins();
    }

    public boolean isColumnOrderPreserved() {
        return ((android.widget.GridLayout) real).isColumnOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return ((android.widget.GridLayout) real).isRowOrderPreserved();
    }

    public void onViewAdded(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.GridLayout) real).onViewAdded(arg0 == null ? null : arg0.getReal());
    }

    public void onViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.GridLayout) real).onViewRemoved(arg0 == null ? null : arg0.getReal());
    }

    public void requestLayout() {
        ((android.widget.GridLayout) real).requestLayout();
    }

    public void setAlignmentMode(int arg0) {
        ((android.widget.GridLayout) real).setAlignmentMode(arg0);
    }

    public void setColumnCount(int arg0) {
        ((android.widget.GridLayout) real).setColumnCount(arg0);
    }

    public void setColumnOrderPreserved(boolean arg0) {
        ((android.widget.GridLayout) real).setColumnOrderPreserved(arg0);
    }

    public void setOrientation(int arg0) {
        ((android.widget.GridLayout) real).setOrientation(arg0);
    }

    public void setRowCount(int arg0) {
        ((android.widget.GridLayout) real).setRowCount(arg0);
    }

    public void setRowOrderPreserved(boolean arg0) {
        ((android.widget.GridLayout) real).setRowOrderPreserved(arg0);
    }

    public void setUseDefaultMargins(boolean arg0) {
        ((android.widget.GridLayout) real).setUseDefaultMargins(arg0);
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg1) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, float arg1) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg2) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public static final int ALIGN_BOUNDS = android.widget.GridLayout.ALIGN_BOUNDS;
    public static final int ALIGN_MARGINS = android.widget.GridLayout.ALIGN_MARGINS;
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment BASELINE = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.BASELINE);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment BOTTOM = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.BOTTOM);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment CENTER = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.CENTER);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment END = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.END);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment FILL = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.FILL);
    public static final int HORIZONTAL = android.widget.GridLayout.HORIZONTAL;
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment LEFT = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.LEFT);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment RIGHT = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.RIGHT);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment START = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.START);
    public static final com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment TOP = com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment.wrap(android.widget.GridLayout.TOP);
    public static final int UNDEFINED = android.widget.GridLayout.UNDEFINED;
    public static final int VERTICAL = android.widget.GridLayout.VERTICAL;

    public static final class Alignment {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Alignment(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment wrap(android.widget.GridLayout.Alignment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment(real, (__DcgwBridgeToken) null);
        }

        public android.widget.GridLayout.Alignment getReal() {
            return (android.widget.GridLayout.Alignment) real;
        }

        public android.widget.GridLayout.Alignment unwrap() {
            return getReal();
        }

    }
    public static final class LayoutParams {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private LayoutParams(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams wrap(android.widget.GridLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams(real, (__DcgwBridgeToken) null);
        }

        public android.widget.GridLayout.LayoutParams getReal() {
            return (android.widget.GridLayout.LayoutParams) real;
        }

        public android.widget.GridLayout.LayoutParams unwrap() {
            return getReal();
        }

        public LayoutParams() {
            this(new android.widget.GridLayout.LayoutParams(), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams arg0) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.GridLayout.Spec arg0, com.micklab.dcg.wrapper.android.widget.GridLayout.Spec arg1) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.widget.GridLayout.LayoutParams) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.widget.GridLayout.LayoutParams) real).hashCode();
        }

        public void setGravity(int arg0) {
            ((android.widget.GridLayout.LayoutParams) real).setGravity(arg0);
        }


    }
    public static final class Spec {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Spec(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec wrap(android.widget.GridLayout.Spec real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout.Spec(real, (__DcgwBridgeToken) null);
        }

        public android.widget.GridLayout.Spec getReal() {
            return (android.widget.GridLayout.Spec) real;
        }

        public android.widget.GridLayout.Spec unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.widget.GridLayout.Spec) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.widget.GridLayout.Spec) real).hashCode();
        }

    }
}
