// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Fragment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Fragment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Fragment wrap(android.app.Fragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Fragment(real, (__DcgwBridgeToken) null);
    }

    public android.app.Fragment getReal() {
        return (android.app.Fragment) real;
    }

    public android.app.Fragment unwrap() {
        return getReal();
    }

    public Fragment() {
        this(new android.app.Fragment(), (__DcgwBridgeToken) null);
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.app.Fragment) real).dump(arg0, arg1, arg2, arg3);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.app.Fragment) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.Activity getActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.Fragment) real).getActivity());
    }

    public boolean getAllowEnterTransitionOverlap() {
        return ((android.app.Fragment) real).getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return ((android.app.Fragment) real).getAllowReturnTransitionOverlap();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getArguments() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.Fragment) real).getArguments());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getChildFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(((android.app.Fragment) real).getChildFragmentManager());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.Fragment) real).getContext());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.app.Fragment) real).getEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.app.Fragment) real).getExitTransition());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(((android.app.Fragment) real).getFragmentManager());
    }

    public java.lang.Object getHost() {
        return ((android.app.Fragment) real).getHost();
    }

    public int getId() {
        return ((android.app.Fragment) real).getId();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.app.Fragment) real).getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.app.LoaderManager getLoaderManager() {
        return com.micklab.dcg.wrapper.android.app.LoaderManager.wrap(((android.app.Fragment) real).getLoaderManager());
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getParentFragment() {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.Fragment) real).getParentFragment());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReenterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.app.Fragment) real).getReenterTransition());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.app.Fragment) real).getResources());
    }

    public boolean getRetainInstance() {
        return ((android.app.Fragment) real).getRetainInstance();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.app.Fragment) real).getReturnTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.app.Fragment) real).getSharedElementEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.app.Fragment) real).getSharedElementReturnTransition());
    }

    public java.lang.String getString(int arg0) {
        return ((android.app.Fragment) real).getString(arg0);
    }

    public java.lang.String getString(int arg0, java.lang.Object... arg1) {
        return ((android.app.Fragment) real).getString(arg0, arg1);
    }

    public java.lang.String getTag() {
        return ((android.app.Fragment) real).getTag();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getTargetFragment() {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(((android.app.Fragment) real).getTargetFragment());
    }

    public int getTargetRequestCode() {
        return ((android.app.Fragment) real).getTargetRequestCode();
    }

    public java.lang.CharSequence getText(int arg0) {
        return ((android.app.Fragment) real).getText(arg0);
    }

    public boolean getUserVisibleHint() {
        return ((android.app.Fragment) real).getUserVisibleHint();
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Fragment) real).getView());
    }

    public int hashCode() {
        return ((android.app.Fragment) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.app.Fragment instantiate(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(android.app.Fragment.instantiate(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.app.Fragment instantiate(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(android.app.Fragment.instantiate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public boolean isAdded() {
        return ((android.app.Fragment) real).isAdded();
    }

    public boolean isDetached() {
        return ((android.app.Fragment) real).isDetached();
    }

    public boolean isHidden() {
        return ((android.app.Fragment) real).isHidden();
    }

    public boolean isInLayout() {
        return ((android.app.Fragment) real).isInLayout();
    }

    public boolean isRemoving() {
        return ((android.app.Fragment) real).isRemoving();
    }

    public boolean isResumed() {
        return ((android.app.Fragment) real).isResumed();
    }

    public boolean isStateSaved() {
        return ((android.app.Fragment) real).isStateSaved();
    }

    public boolean isVisible() {
        return ((android.app.Fragment) real).isVisible();
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Fragment) real).onActivityCreated(arg0 == null ? null : arg0.getReal());
    }

    public void onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        ((android.app.Fragment) real).onActivityResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onAttach(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        ((android.app.Fragment) real).onAttach(arg0 == null ? null : arg0.getReal());
    }

    public void onAttach(com.micklab.dcg.wrapper.android.content.Context arg0) {
        ((android.app.Fragment) real).onAttach(arg0 == null ? null : arg0.getReal());
    }

    public void onAttachFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        ((android.app.Fragment) real).onAttachFragment(arg0 == null ? null : arg0.getReal());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.app.Fragment) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public boolean onContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.Fragment) real).onContextItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Fragment) real).onCreate(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onCreateAnimator(int arg0, boolean arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.app.Fragment) real).onCreateAnimator(arg0, arg1, arg2));
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        ((android.app.Fragment) real).onCreateContextMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0, com.micklab.dcg.wrapper.android.view.MenuInflater arg1) {
        ((android.app.Fragment) real).onCreateOptionsMenu(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.app.Fragment) real).onCreateView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public void onDestroy() {
        ((android.app.Fragment) real).onDestroy();
    }

    public void onDestroyOptionsMenu() {
        ((android.app.Fragment) real).onDestroyOptionsMenu();
    }

    public void onDestroyView() {
        ((android.app.Fragment) real).onDestroyView();
    }

    public void onDetach() {
        ((android.app.Fragment) real).onDetach();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater onGetLayoutInflater(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.app.Fragment) real).onGetLayoutInflater(arg0 == null ? null : arg0.getReal()));
    }

    public void onHiddenChanged(boolean arg0) {
        ((android.app.Fragment) real).onHiddenChanged(arg0);
    }

    public void onInflate(com.micklab.dcg.wrapper.android.util.AttributeSet arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Fragment) real).onInflate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onInflate(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.app.Fragment) real).onInflate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onInflate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.app.Fragment) real).onInflate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onLowMemory() {
        ((android.app.Fragment) real).onLowMemory();
    }

    public void onMultiWindowModeChanged(boolean arg0) {
        ((android.app.Fragment) real).onMultiWindowModeChanged(arg0);
    }

    public void onMultiWindowModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        ((android.app.Fragment) real).onMultiWindowModeChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return ((android.app.Fragment) real).onOptionsItemSelected(arg0 == null ? null : arg0.getReal());
    }

    public void onOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.Fragment) real).onOptionsMenuClosed(arg0 == null ? null : arg0.getReal());
    }

    public void onPause() {
        ((android.app.Fragment) real).onPause();
    }

    public void onPictureInPictureModeChanged(boolean arg0) {
        ((android.app.Fragment) real).onPictureInPictureModeChanged(arg0);
    }

    public void onPictureInPictureModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        ((android.app.Fragment) real).onPictureInPictureModeChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        ((android.app.Fragment) real).onPrepareOptionsMenu(arg0 == null ? null : arg0.getReal());
    }

    public void onRequestPermissionsResult(int arg0, java.lang.String[] arg1, int[] arg2) {
        ((android.app.Fragment) real).onRequestPermissionsResult(arg0, arg1, arg2);
    }

    public void onResume() {
        ((android.app.Fragment) real).onResume();
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Fragment) real).onSaveInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onStart() {
        ((android.app.Fragment) real).onStart();
    }

    public void onStop() {
        ((android.app.Fragment) real).onStop();
    }

    public void onTrimMemory(int arg0) {
        ((android.app.Fragment) real).onTrimMemory(arg0);
    }

    public void onViewCreated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Fragment) real).onViewCreated(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onViewStateRestored(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Fragment) real).onViewStateRestored(arg0 == null ? null : arg0.getReal());
    }

    public void postponeEnterTransition() {
        ((android.app.Fragment) real).postponeEnterTransition();
    }

    public void registerForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Fragment) real).registerForContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public void requestPermissions(java.lang.String[] arg0, int arg1) {
        ((android.app.Fragment) real).requestPermissions(arg0, arg1);
    }

    public void setAllowEnterTransitionOverlap(boolean arg0) {
        ((android.app.Fragment) real).setAllowEnterTransitionOverlap(arg0);
    }

    public void setAllowReturnTransitionOverlap(boolean arg0) {
        ((android.app.Fragment) real).setAllowReturnTransitionOverlap(arg0);
    }

    public void setArguments(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.app.Fragment) real).setArguments(arg0 == null ? null : arg0.getReal());
    }

    public void setEnterSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        ((android.app.Fragment) real).setEnterSharedElementCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.app.Fragment) real).setEnterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setExitSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        ((android.app.Fragment) real).setExitSharedElementCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.app.Fragment) real).setExitTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setHasOptionsMenu(boolean arg0) {
        ((android.app.Fragment) real).setHasOptionsMenu(arg0);
    }

    public void setInitialSavedState(com.micklab.dcg.wrapper.android.app.Fragment.SavedState arg0) {
        ((android.app.Fragment) real).setInitialSavedState(arg0 == null ? null : arg0.getReal());
    }

    public void setMenuVisibility(boolean arg0) {
        ((android.app.Fragment) real).setMenuVisibility(arg0);
    }

    public void setReenterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.app.Fragment) real).setReenterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setRetainInstance(boolean arg0) {
        ((android.app.Fragment) real).setRetainInstance(arg0);
    }

    public void setReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.app.Fragment) real).setReturnTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.app.Fragment) real).setSharedElementEnterTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedElementReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.app.Fragment) real).setSharedElementReturnTransition(arg0 == null ? null : arg0.getReal());
    }

    public void setTargetFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, int arg1) {
        ((android.app.Fragment) real).setTargetFragment(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setUserVisibleHint(boolean arg0) {
        ((android.app.Fragment) real).setUserVisibleHint(arg0);
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String arg0) {
        return ((android.app.Fragment) real).shouldShowRequestPermissionRationale(arg0);
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.app.Fragment) real).startActivity(arg0 == null ? null : arg0.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.app.Fragment) real).startActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.app.Fragment) real).startActivityForResult(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.app.Fragment) real).startActivityForResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void startIntentSenderForResult(com.micklab.dcg.wrapper.android.content.IntentSender arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) throws android.content.IntentSender.SendIntentException {
        ((android.app.Fragment) real).startIntentSenderForResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void startPostponedEnterTransition() {
        ((android.app.Fragment) real).startPostponedEnterTransition();
    }

    public java.lang.String toString() {
        return ((android.app.Fragment) real).toString();
    }

    public void unregisterForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.app.Fragment) real).unregisterForContextMenu(arg0 == null ? null : arg0.getReal());
    }

    public static final class InstantiationException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InstantiationException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Fragment.InstantiationException wrap(android.app.Fragment.InstantiationException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Fragment.InstantiationException(real, (__DcgwBridgeToken) null);
        }

        public android.app.Fragment.InstantiationException getReal() {
            return (android.app.Fragment.InstantiationException) real;
        }

        public android.app.Fragment.InstantiationException unwrap() {
            return getReal();
        }

        public InstantiationException(java.lang.String arg0, java.lang.Exception arg1) {
            this(new android.app.Fragment.InstantiationException(arg0, arg1), (__DcgwBridgeToken) null);
        }

    }
    public static final class SavedState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SavedState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Fragment.SavedState wrap(android.app.Fragment.SavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Fragment.SavedState(real, (__DcgwBridgeToken) null);
        }

        public android.app.Fragment.SavedState getReal() {
            return (android.app.Fragment.SavedState) real;
        }

        public android.app.Fragment.SavedState unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.app.Fragment.SavedState) real).describeContents();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.Fragment.SavedState) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
