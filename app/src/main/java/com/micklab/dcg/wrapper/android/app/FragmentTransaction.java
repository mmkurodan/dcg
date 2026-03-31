// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentTransaction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentTransaction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentTransaction wrap(android.app.FragmentTransaction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentTransaction(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentTransaction getReal() {
        return (android.app.FragmentTransaction) real;
    }

    public android.app.FragmentTransaction unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction add(com.micklab.dcg.wrapper.android.app.Fragment arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).add(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction add(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).add(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction add(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).add(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction addSharedElement(com.micklab.dcg.wrapper.android.view.View arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).addSharedElement(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction addToBackStack(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).addToBackStack(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction attach(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).attach(arg0 == null ? null : arg0.getReal()));
    }

    public int commit() {
        return ((android.app.FragmentTransaction) real).commit();
    }

    public int commitAllowingStateLoss() {
        return ((android.app.FragmentTransaction) real).commitAllowingStateLoss();
    }

    public void commitNow() {
        ((android.app.FragmentTransaction) real).commitNow();
    }

    public void commitNowAllowingStateLoss() {
        ((android.app.FragmentTransaction) real).commitNowAllowingStateLoss();
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction detach(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).detach(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction disallowAddToBackStack() {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).disallowAddToBackStack());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction hide(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).hide(arg0 == null ? null : arg0.getReal()));
    }

    public boolean isAddToBackStackAllowed() {
        return ((android.app.FragmentTransaction) real).isAddToBackStackAllowed();
    }

    public boolean isEmpty() {
        return ((android.app.FragmentTransaction) real).isEmpty();
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction remove(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).remove(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction replace(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).replace(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction replace(int arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).replace(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction runOnCommit(java.lang.Runnable arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).runOnCommit(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setBreadCrumbShortTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbShortTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setBreadCrumbShortTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setBreadCrumbTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setBreadCrumbTitle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setBreadCrumbTitle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setCustomAnimations(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setCustomAnimations(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setCustomAnimations(int arg0, int arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setCustomAnimations(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setPrimaryNavigationFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setPrimaryNavigationFragment(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setReorderingAllowed(boolean arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setReorderingAllowed(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setTransition(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setTransition(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction setTransitionStyle(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).setTransitionStyle(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction show(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentTransaction) real).show(arg0 == null ? null : arg0.getReal()));
    }

    public static final int TRANSIT_ENTER_MASK = android.app.FragmentTransaction.TRANSIT_ENTER_MASK;
    public static final int TRANSIT_EXIT_MASK = android.app.FragmentTransaction.TRANSIT_EXIT_MASK;
    public static final int TRANSIT_FRAGMENT_CLOSE = android.app.FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
    public static final int TRANSIT_FRAGMENT_FADE = android.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE;
    public static final int TRANSIT_FRAGMENT_OPEN = android.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
    public static final int TRANSIT_NONE = android.app.FragmentTransaction.TRANSIT_NONE;
    public static final int TRANSIT_UNSET = android.app.FragmentTransaction.TRANSIT_UNSET;

}
