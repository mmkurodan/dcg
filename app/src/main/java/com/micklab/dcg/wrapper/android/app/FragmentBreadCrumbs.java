// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentBreadCrumbs {
    private final android.app.FragmentBreadCrumbs real;

    public FragmentBreadCrumbs(android.app.FragmentBreadCrumbs real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs wrap(android.app.FragmentBreadCrumbs real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs(real);
    }

    public android.app.FragmentBreadCrumbs unwrap() {
        return real;
    }

    public FragmentBreadCrumbs(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.FragmentBreadCrumbs(arg0 == null ? null : arg0.unwrap()));
    }

    public FragmentBreadCrumbs(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.app.FragmentBreadCrumbs(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public FragmentBreadCrumbs(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.app.FragmentBreadCrumbs(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void onBackStackChanged() {
        real.onBackStackChanged();
    }

    public void setActivity(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.setActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void setMaxVisible(int arg0) {
        real.setMaxVisible(arg0);
    }

    public void setOnBreadCrumbClickListener(com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener arg0) {
        real.setOnBreadCrumbClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setParentTitle(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.view.View.OnClickListener arg2) {
        real.setParentTitle(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setTitle(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        real.setTitle(arg0, arg1);
    }

    public static final class OnBreadCrumbClickListener {
        private final android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener real;

        public OnBreadCrumbClickListener(android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener wrap(android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener(real);
        }

        public android.app.FragmentBreadCrumbs.OnBreadCrumbClickListener unwrap() {
            return real;
        }

        public boolean onBreadCrumbClick(com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry arg0, int arg1) {
            return real.onBreadCrumbClick(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
