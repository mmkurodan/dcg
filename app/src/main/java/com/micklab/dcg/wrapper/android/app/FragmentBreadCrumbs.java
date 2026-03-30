// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentBreadCrumbs {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentBreadCrumbs(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs wrap(android.app.FragmentBreadCrumbs real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentBreadCrumbs getReal() {
        return (android.app.FragmentBreadCrumbs) real;
    }

    public android.app.FragmentBreadCrumbs unwrap() {
        return getReal();
    }

    public FragmentBreadCrumbs(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.FragmentBreadCrumbs(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public FragmentBreadCrumbs(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.app.FragmentBreadCrumbs(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public FragmentBreadCrumbs(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.app.FragmentBreadCrumbs(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public void onBackStackChanged() {
        ((android.app.FragmentBreadCrumbs) real).onBackStackChanged();
    }

    public void setActivity(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.FragmentBreadCrumbs) real).setActivity(arg0 == null ? null : arg0.getReal());
    }

    public void setMaxVisible(int arg0) {
        ((android.app.FragmentBreadCrumbs) real).setMaxVisible(arg0);
    }

    public void setOnBreadCrumbClickListener(com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener arg0) {
        ((android.app.FragmentBreadCrumbs) real).setOnBreadCrumbClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setParentTitle(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.view.View.OnClickListener arg2) {
        ((android.app.FragmentBreadCrumbs) real).setParentTitle(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void setTitle(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        ((android.app.FragmentBreadCrumbs) real).setTitle(arg0, arg1);
    }

    public static final class OnBreadCrumbClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnBreadCrumbClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener wrap(android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener getReal() {
            return (android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) real;
        }

        public android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener unwrap() {
            return getReal();
        }

        public boolean onBreadCrumbClick(com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry arg0, int arg1) {
            return ((android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener) real).onBreadCrumbClick(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
