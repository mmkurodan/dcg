// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class GridLayout {
    private final android.widget.GridLayout real;

    public GridLayout(android.widget.GridLayout real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout wrap(android.widget.GridLayout real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout(real);
    }

    public android.widget.GridLayout unwrap() {
        return real;
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.unwrap()));
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public GridLayout(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.GridLayout(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams generateLayoutParams(com.micklab.dcg.wrapper.android.util.AttributeSet arg0) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams.wrap(real.generateLayoutParams(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getAlignmentMode() {
        return real.getAlignmentMode();
    }

    public int getColumnCount() {
        return real.getColumnCount();
    }

    public int getOrientation() {
        return real.getOrientation();
    }

    public int getRowCount() {
        return real.getRowCount();
    }

    public boolean getUseDefaultMargins() {
        return real.getUseDefaultMargins();
    }

    public boolean isColumnOrderPreserved() {
        return real.isColumnOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return real.isRowOrderPreserved();
    }

    public void onViewAdded(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onViewAdded(arg0 == null ? null : arg0.unwrap());
    }

    public void onViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.onViewRemoved(arg0 == null ? null : arg0.unwrap());
    }

    public void requestLayout() {
        real.requestLayout();
    }

    public void setAlignmentMode(int arg0) {
        real.setAlignmentMode(arg0);
    }

    public void setColumnCount(int arg0) {
        real.setColumnCount(arg0);
    }

    public void setColumnOrderPreserved(boolean arg0) {
        real.setColumnOrderPreserved(arg0);
    }

    public void setOrientation(int arg0) {
        real.setOrientation(arg0);
    }

    public void setRowCount(int arg0) {
        real.setRowCount(arg0);
    }

    public void setRowOrderPreserved(boolean arg0) {
        real.setRowOrderPreserved(arg0);
    }

    public void setUseDefaultMargins(boolean arg0) {
        real.setUseDefaultMargins(arg0);
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg1) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, float arg1) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg2) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec spec(int arg0, int arg1, com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.widget.GridLayout.Spec.wrap(android.widget.GridLayout.spec(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
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
        private final android.widget.GridLayout.Alignment real;

        public Alignment(android.widget.GridLayout.Alignment real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment wrap(android.widget.GridLayout.Alignment real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout.Alignment(real);
        }

        public android.widget.GridLayout.Alignment unwrap() {
            return real;
        }

    }
    public static final class LayoutParams {
        private final android.widget.GridLayout.LayoutParams real;

        public LayoutParams(android.widget.GridLayout.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams wrap(android.widget.GridLayout.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams(real);
        }

        public android.widget.GridLayout.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams() {
            this(new android.widget.GridLayout.LayoutParams());
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.GridLayout.LayoutParams arg0) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.MarginLayoutParams arg0) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.widget.GridLayout.Spec arg0, com.micklab.dcg.wrapper.android.widget.GridLayout.Spec arg1) {
            this(new android.widget.GridLayout.LayoutParams(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void setGravity(int arg0) {
            real.setGravity(arg0);
        }


    }
    public static final class Spec {
        private final android.widget.GridLayout.Spec real;

        public Spec(android.widget.GridLayout.Spec real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.GridLayout.Spec wrap(android.widget.GridLayout.Spec real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.GridLayout.Spec(real);
        }

        public android.widget.GridLayout.Spec unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
