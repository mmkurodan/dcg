// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FragmentManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentManager wrap(android.app.FragmentManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.FragmentManager getReal() {
        return (android.app.FragmentManager) real;
    }

    public android.app.FragmentManager unwrap() {
        return getReal();
    }

    public void addOnBackStackChangedListener(com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener arg0) {
        ((android.app.FragmentManager) real).addOnBackStackChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction beginTransaction() {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(((android.app.FragmentManager) real).beginTransaction());
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.FragmentManager) real).dump(arg0, arg1, arg2, arg3);
    }

    public static void enableDebugLogging(boolean arg0) {
        android.app.FragmentManager.enableDebugLogging(arg0);
    }

    public boolean executePendingTransactions() {
        return ((android.app.FragmentManager) real).executePendingTransactions();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment findFragmentById(int arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.FragmentManager) real).findFragmentById(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.Fragment findFragmentByTag(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.FragmentManager) real).findFragmentByTag(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry getBackStackEntryAt(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry.wrap(((android.app.FragmentManager) real).getBackStackEntryAt(arg0));
    }

    public int getBackStackEntryCount() {
        return ((android.app.FragmentManager) real).getBackStackEntryCount();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getFragment(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.FragmentManager) real).getFragment(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getPrimaryNavigationFragment() {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.FragmentManager) real).getPrimaryNavigationFragment());
    }

    public void invalidateOptionsMenu() {
        ((android.app.FragmentManager) real).invalidateOptionsMenu();
    }

    public boolean isDestroyed() {
        return ((android.app.FragmentManager) real).isDestroyed();
    }

    public boolean isStateSaved() {
        return ((android.app.FragmentManager) real).isStateSaved();
    }

    public void popBackStack() {
        ((android.app.FragmentManager) real).popBackStack();
    }

    public void popBackStack(java.lang.String arg0, int arg1) {
        ((android.app.FragmentManager) real).popBackStack(arg0, arg1);
    }

    public void popBackStack(int arg0, int arg1) {
        ((android.app.FragmentManager) real).popBackStack(arg0, arg1);
    }

    public boolean popBackStackImmediate() {
        return ((android.app.FragmentManager) real).popBackStackImmediate();
    }

    public boolean popBackStackImmediate(java.lang.String arg0, int arg1) {
        return ((android.app.FragmentManager) real).popBackStackImmediate(arg0, arg1);
    }

    public boolean popBackStackImmediate(int arg0, int arg1) {
        return ((android.app.FragmentManager) real).popBackStackImmediate(arg0, arg1);
    }

    public void putFragment(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.Fragment arg2) {
        ((android.app.FragmentManager) real).putFragment(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void registerFragmentLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks arg0, boolean arg1) {
        ((android.app.FragmentManager) real).registerFragmentLifecycleCallbacks(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void removeOnBackStackChangedListener(com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener arg0) {
        ((android.app.FragmentManager) real).removeOnBackStackChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.app.Fragment.SavedState saveFragmentInstanceState(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.SavedState.wrap(((android.app.FragmentManager) real).saveFragmentInstanceState(arg0 == null ? null : arg0.getReal()));
    }

    public void unregisterFragmentLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks arg0) {
        ((android.app.FragmentManager) real).unregisterFragmentLifecycleCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public static final int POP_BACK_STACK_INCLUSIVE = android.app.FragmentManager.POP_BACK_STACK_INCLUSIVE;

    public static final class BackStackEntry {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BackStackEntry(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry wrap(android.app.FragmentManager.BackStackEntry real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry(real, (__DcgwBridgeToken) null);
        }

        public android.app.FragmentManager.BackStackEntry getReal() {
            return (android.app.FragmentManager.BackStackEntry) real;
        }

        public android.app.FragmentManager.BackStackEntry unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getBreadCrumbShortTitle() {
            return ((android.app.FragmentManager.BackStackEntry) real).getBreadCrumbShortTitle();
        }

        public int getBreadCrumbShortTitleRes() {
            return ((android.app.FragmentManager.BackStackEntry) real).getBreadCrumbShortTitleRes();
        }

        public java.lang.CharSequence getBreadCrumbTitle() {
            return ((android.app.FragmentManager.BackStackEntry) real).getBreadCrumbTitle();
        }

        public int getBreadCrumbTitleRes() {
            return ((android.app.FragmentManager.BackStackEntry) real).getBreadCrumbTitleRes();
        }

        public int getId() {
            return ((android.app.FragmentManager.BackStackEntry) real).getId();
        }

        public java.lang.String getName() {
            return ((android.app.FragmentManager.BackStackEntry) real).getName();
        }

    }
    public static final class FragmentLifecycleCallbacks {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FragmentLifecycleCallbacks(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks wrap(android.app.FragmentManager.FragmentLifecycleCallbacks real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks(real, (__DcgwBridgeToken) null);
        }

        public android.app.FragmentManager.FragmentLifecycleCallbacks getReal() {
            return (android.app.FragmentManager.FragmentLifecycleCallbacks) real;
        }

        public android.app.FragmentManager.FragmentLifecycleCallbacks unwrap() {
            return getReal();
        }

        public void onFragmentActivityCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentActivityCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onFragmentAttached(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.content.Context arg2) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentAttached(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onFragmentCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onFragmentDestroyed(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentDestroyed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onFragmentDetached(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentDetached(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onFragmentPaused(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentPaused(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onFragmentPreAttached(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.content.Context arg2) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentPreAttached(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onFragmentPreCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentPreCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onFragmentResumed(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentResumed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onFragmentSaveInstanceState(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentSaveInstanceState(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onFragmentStarted(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onFragmentStopped(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentStopped(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onFragmentViewCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentViewCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
        }

        public void onFragmentViewDestroyed(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            ((android.app.FragmentManager.FragmentLifecycleCallbacks) real).onFragmentViewDestroyed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnBackStackChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnBackStackChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener wrap(android.app.FragmentManager.OnBackStackChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.FragmentManager.OnBackStackChangedListener getReal() {
            return (android.app.FragmentManager.OnBackStackChangedListener) real;
        }

        public android.app.FragmentManager.OnBackStackChangedListener unwrap() {
            return getReal();
        }

        public void onBackStackChanged() {
            ((android.app.FragmentManager.OnBackStackChangedListener) real).onBackStackChanged();
        }

    }
}
