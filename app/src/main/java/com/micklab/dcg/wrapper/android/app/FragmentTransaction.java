// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentTransaction {
    private final android.app.FragmentTransaction real;

    public FragmentTransaction(android.app.FragmentTransaction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentTransaction wrap(android.app.FragmentTransaction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentTransaction(real);
    }

    public android.app.FragmentTransaction unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction add(com.micklab.dcg.wrapper.android.app.Fragment arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.add(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction add(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.add(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction add(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.add(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction addSharedElement(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.addSharedElement(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction addToBackStack(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.addToBackStack(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction attach(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.attach(arg0 == null ? null : arg0.unwrap()));
    }

    public int commit() {
        return real.commit();
    }

    public int commitAllowingStateLoss() {
        return real.commitAllowingStateLoss();
    }

    public void commitNow() {
        real.commitNow();
    }

    public void commitNowAllowingStateLoss() {
        real.commitNowAllowingStateLoss();
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction detach(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.detach(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction disallowAddToBackStack() {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.disallowAddToBackStack());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction hide(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.hide(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean isAddToBackStackAllowed() {
        return real.isAddToBackStackAllowed();
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction remove(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.remove(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction replace(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.replace(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction replace(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.replace(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction runOnCommit(java.lang.Runnable arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.runOnCommit(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbShortTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setBreadCrumbShortTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setBreadCrumbShortTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setBreadCrumbTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setBreadCrumbTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setCustomAnimations(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setCustomAnimations(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setCustomAnimations(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setCustomAnimations(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setPrimaryNavigationFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setPrimaryNavigationFragment(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setReorderingAllowed(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setReorderingAllowed(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setTransition(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setTransition(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setTransitionStyle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.setTransitionStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction show(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.show(arg0 == null ? null : arg0.unwrap()));
    }

    public static final int TRANSIT_ENTER_MASK = android.app.FragmentTransaction.TRANSIT_ENTER_MASK;
    public static final int TRANSIT_EXIT_MASK = android.app.FragmentTransaction.TRANSIT_EXIT_MASK;
    public static final int TRANSIT_FRAGMENT_CLOSE = android.app.FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
    public static final int TRANSIT_FRAGMENT_FADE = android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE;
    public static final int TRANSIT_FRAGMENT_OPEN = android.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
    public static final int TRANSIT_NONE = android.app.FragmentTransaction.TRANSIT_NONE;
    public static final int TRANSIT_UNSET = android.app.FragmentTransaction.TRANSIT_UNSET;

}
