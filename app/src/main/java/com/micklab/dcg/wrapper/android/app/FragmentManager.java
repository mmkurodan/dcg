// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class FragmentManager {
    private final android.app.FragmentManager real;

    public FragmentManager(android.app.FragmentManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.FragmentManager wrap(android.app.FragmentManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager(real);
    }

    public android.app.FragmentManager unwrap() {
        return real;
    }

    public void addOnBackStackChangedListener(com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener arg0) {
        real.addOnBackStackChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentTransaction beginTransaction() {
        return com.micklab.dcg.wrapper.android.app.FragmentTransaction.wrap(real.beginTransaction());
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public static void enableDebugLogging(boolean arg0) {
        android.app.FragmentManager.enableDebugLogging(arg0);
    }

    public boolean executePendingTransactions() {
        return real.executePendingTransactions();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment findFragmentById(int arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.findFragmentById(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.Fragment findFragmentByTag(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.findFragmentByTag(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry getBackStackEntryAt(int arg0) {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry.wrap(real.getBackStackEntryAt(arg0));
    }

    public int getBackStackEntryCount() {
        return real.getBackStackEntryCount();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getFragment(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.getFragment(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getPrimaryNavigationFragment() {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.getPrimaryNavigationFragment());
    }

    public void invalidateOptionsMenu() {
        real.invalidateOptionsMenu();
    }

    public boolean isDestroyed() {
        return real.isDestroyed();
    }

    public boolean isStateSaved() {
        return real.isStateSaved();
    }

    public void popBackStack() {
        real.popBackStack();
    }

    public void popBackStack(java.lang.String arg0, int arg1) {
        real.popBackStack(arg0, arg1);
    }

    public void popBackStack(int arg0, int arg1) {
        real.popBackStack(arg0, arg1);
    }

    public boolean popBackStackImmediate() {
        return real.popBackStackImmediate();
    }

    public boolean popBackStackImmediate(int arg0, int arg1) {
        return real.popBackStackImmediate(arg0, arg1);
    }

    public boolean popBackStackImmediate(java.lang.String arg0, int arg1) {
        return real.popBackStackImmediate(arg0, arg1);
    }

    public void putFragment(com.micklab.dcg.wrapper.android.os.Bundle arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.app.Fragment arg2) {
        real.putFragment(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void registerFragmentLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks arg0, boolean arg1) {
        real.registerFragmentLifecycleCallbacks(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void removeOnBackStackChangedListener(com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener arg0) {
        real.removeOnBackStackChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.Fragment.SavedState saveFragmentInstanceState(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        return com.micklab.dcg.wrapper.android.app.Fragment.SavedState.wrap(real.saveFragmentInstanceState(arg0 == null ? null : arg0.unwrap()));
    }

    public void unregisterFragmentLifecycleCallbacks(com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks arg0) {
        real.unregisterFragmentLifecycleCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public static final int POP_BACK_STACK_INCLUSIVE = android.app.FragmentManager.POP_BACK_STACK_INCLUSIVE;

    public static final class BackStackEntry {
        private final android.app.FragmentManager.BackStackEntry real;

        public BackStackEntry(android.app.FragmentManager.BackStackEntry real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry wrap(android.app.FragmentManager.BackStackEntry real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager.BackStackEntry(real);
        }

        public android.app.FragmentManager.BackStackEntry unwrap() {
            return real;
        }

        public java.lang.CharSequence getBreadCrumbShortTitle() {
            return real.getBreadCrumbShortTitle();
        }

        public int getBreadCrumbShortTitleRes() {
            return real.getBreadCrumbShortTitleRes();
        }

        public java.lang.CharSequence getBreadCrumbTitle() {
            return real.getBreadCrumbTitle();
        }

        public int getBreadCrumbTitleRes() {
            return real.getBreadCrumbTitleRes();
        }

        public int getId() {
            return real.getId();
        }

        public java.lang.String getName() {
            return real.getName();
        }

    }
    public static final class FragmentLifecycleCallbacks {
        private final android.app.FragmentManager.FragmentLifecycleCallbacks real;

        public FragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks wrap(android.app.FragmentManager.FragmentLifecycleCallbacks real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager.FragmentLifecycleCallbacks(real);
        }

        public android.app.FragmentManager.FragmentLifecycleCallbacks unwrap() {
            return real;
        }

        public void onFragmentActivityCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onFragmentActivityCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onFragmentAttached(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.content.Context arg2) {
            real.onFragmentAttached(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onFragmentCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onFragmentCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onFragmentDestroyed(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentDestroyed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onFragmentDetached(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentDetached(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onFragmentPaused(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentPaused(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onFragmentPreAttached(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.content.Context arg2) {
            real.onFragmentPreAttached(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onFragmentPreCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onFragmentPreCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onFragmentResumed(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentResumed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onFragmentSaveInstanceState(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onFragmentSaveInstanceState(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onFragmentStarted(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onFragmentStopped(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentStopped(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onFragmentViewCreated(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1, com.micklab.dcg.wrapper.android.view.View arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
            real.onFragmentViewCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
        }

        public void onFragmentViewDestroyed(com.micklab.dcg.wrapper.android.app.FragmentManager arg0, com.micklab.dcg.wrapper.android.app.Fragment arg1) {
            real.onFragmentViewDestroyed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnBackStackChangedListener {
        private final android.app.FragmentManager.OnBackStackChangedListener real;

        public OnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener wrap(android.app.FragmentManager.OnBackStackChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.FragmentManager.OnBackStackChangedListener(real);
        }

        public android.app.FragmentManager.OnBackStackChangedListener unwrap() {
            return real;
        }

        public void onBackStackChanged() {
            real.onBackStackChanged();
        }

    }
}
