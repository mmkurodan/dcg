// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Fragment {
    private final android.app.Fragment real;

    public Fragment(android.app.Fragment real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Fragment wrap(android.app.Fragment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Fragment(real);
    }

    public android.app.Fragment unwrap() {
        return real;
    }

    public Fragment() {
        this(new android.app.Fragment());
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.Activity getActivity() {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getActivity());
    }

    public boolean getAllowEnterTransitionOverlap() {
        return real.getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return real.getAllowReturnTransitionOverlap();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getArguments() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getArguments());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getChildFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(real.getChildFragmentManager());
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getExitTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getExitTransition());
    }

    public com.micklab.dcg.wrapper.android.app.FragmentManager getFragmentManager() {
        return com.micklab.dcg.wrapper.android.app.FragmentManager.wrap(real.getFragmentManager());
    }

    public java.lang.Object getHost() {
        return real.getHost();
    }

    public int getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public com.micklab.dcg.wrapper.android.app.LoaderManager getLoaderManager() {
        return com.micklab.dcg.wrapper.android.app.LoaderManager.wrap(real.getLoaderManager());
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getParentFragment() {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.getParentFragment());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReenterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getReenterTransition());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(real.getResources());
    }

    public boolean getRetainInstance() {
        return real.getRetainInstance();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getReturnTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementEnterTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getSharedElementEnterTransition());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getSharedElementReturnTransition() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getSharedElementReturnTransition());
    }

    public java.lang.String getString(int arg0) {
        return real.getString(arg0);
    }

    public java.lang.String getString(int arg0, java.lang.Object... arg1) {
        return real.getString(arg0, arg1);
    }

    public java.lang.String getTag() {
        return real.getTag();
    }

    public com.micklab.dcg.wrapper.android.app.Fragment getTargetFragment() {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(real.getTargetFragment());
    }

    public int getTargetRequestCode() {
        return real.getTargetRequestCode();
    }

    public java.lang.CharSequence getText(int arg0) {
        return real.getText(arg0);
    }

    public boolean getUserVisibleHint() {
        return real.getUserVisibleHint();
    }

    public com.micklab.dcg.wrapper.android.view.View getView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getView());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static com.micklab.dcg.wrapper.android.app.Fragment instantiate(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(android.app.Fragment.instantiate(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.app.Fragment instantiate(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.app.Fragment.wrap(android.app.Fragment.instantiate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public boolean isAdded() {
        return real.isAdded();
    }

    public boolean isDetached() {
        return real.isDetached();
    }

    public boolean isHidden() {
        return real.isHidden();
    }

    public boolean isInLayout() {
        return real.isInLayout();
    }

    public boolean isRemoving() {
        return real.isRemoving();
    }

    public boolean isResumed() {
        return real.isResumed();
    }

    public boolean isStateSaved() {
        return real.isStateSaved();
    }

    public boolean isVisible() {
        return real.isVisible();
    }

    public void onActivityCreated(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onActivityCreated(arg0 == null ? null : arg0.unwrap());
    }

    public void onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
        real.onActivityResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onAttach(com.micklab.dcg.wrapper.android.app.Activity arg0) {
        real.onAttach(arg0 == null ? null : arg0.unwrap());
    }

    public void onAttach(com.micklab.dcg.wrapper.android.content.Context arg0) {
        real.onAttach(arg0 == null ? null : arg0.unwrap());
    }

    public void onAttachFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0) {
        real.onAttachFragment(arg0 == null ? null : arg0.unwrap());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onContextItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.onContextItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreate(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onCreate(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onCreateAnimator(int arg0, boolean arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onCreateAnimator(arg0, arg1, arg2));
    }

    public void onCreateContextMenu(com.micklab.dcg.wrapper.android.view.ContextMenu arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.view.ContextMenu.ContextMenuInfo arg2) {
        real.onCreateContextMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onCreateOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0, com.micklab.dcg.wrapper.android.view.MenuInflater arg1) {
        real.onCreateOptionsMenu(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateView(com.micklab.dcg.wrapper.android.view.LayoutInflater arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onDestroyOptionsMenu() {
        real.onDestroyOptionsMenu();
    }

    public void onDestroyView() {
        real.onDestroyView();
    }

    public void onDetach() {
        real.onDetach();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater onGetLayoutInflater(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.onGetLayoutInflater(arg0 == null ? null : arg0.unwrap()));
    }

    public void onHiddenChanged(boolean arg0) {
        real.onHiddenChanged(arg0);
    }

    public void onInflate(com.micklab.dcg.wrapper.android.util.AttributeSet arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onInflate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onInflate(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.onInflate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onInflate(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.onInflate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public void onMultiWindowModeChanged(boolean arg0) {
        real.onMultiWindowModeChanged(arg0);
    }

    public void onMultiWindowModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        real.onMultiWindowModeChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onOptionsItemSelected(com.micklab.dcg.wrapper.android.view.MenuItem arg0) {
        return real.onOptionsItemSelected(arg0 == null ? null : arg0.unwrap());
    }

    public void onOptionsMenuClosed(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        real.onOptionsMenuClosed(arg0 == null ? null : arg0.unwrap());
    }

    public void onPause() {
        real.onPause();
    }

    public void onPictureInPictureModeChanged(boolean arg0) {
        real.onPictureInPictureModeChanged(arg0);
    }

    public void onPictureInPictureModeChanged(boolean arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) {
        real.onPictureInPictureModeChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onPrepareOptionsMenu(com.micklab.dcg.wrapper.android.view.Menu arg0) {
        real.onPrepareOptionsMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void onRequestPermissionsResult(int arg0, java.lang.String[] arg1, int[] arg2) {
        real.onRequestPermissionsResult(arg0, arg1, arg2);
    }

    public void onResume() {
        real.onResume();
    }

    public void onSaveInstanceState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onSaveInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public void onStart() {
        real.onStart();
    }

    public void onStop() {
        real.onStop();
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public void onViewCreated(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onViewCreated(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onViewStateRestored(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onViewStateRestored(arg0 == null ? null : arg0.unwrap());
    }

    public void postponeEnterTransition() {
        real.postponeEnterTransition();
    }

    public void registerForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.registerForContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public void requestPermissions(java.lang.String[] arg0, int arg1) {
        real.requestPermissions(arg0, arg1);
    }

    public void setAllowEnterTransitionOverlap(boolean arg0) {
        real.setAllowEnterTransitionOverlap(arg0);
    }

    public void setAllowReturnTransitionOverlap(boolean arg0) {
        real.setAllowReturnTransitionOverlap(arg0);
    }

    public void setArguments(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setArguments(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnterSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        real.setEnterSharedElementCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setEnterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setExitSharedElementCallback(com.micklab.dcg.wrapper.android.app.SharedElementCallback arg0) {
        real.setExitSharedElementCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setExitTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setExitTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setHasOptionsMenu(boolean arg0) {
        real.setHasOptionsMenu(arg0);
    }

    public void setInitialSavedState(com.micklab.dcg.wrapper.android.app.Fragment.SavedState arg0) {
        real.setInitialSavedState(arg0 == null ? null : arg0.unwrap());
    }

    public void setMenuVisibility(boolean arg0) {
        real.setMenuVisibility(arg0);
    }

    public void setReenterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setReenterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setRetainInstance(boolean arg0) {
        real.setRetainInstance(arg0);
    }

    public void setReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setReturnTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementEnterTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setSharedElementEnterTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedElementReturnTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.setSharedElementReturnTransition(arg0 == null ? null : arg0.unwrap());
    }

    public void setTargetFragment(com.micklab.dcg.wrapper.android.app.Fragment arg0, int arg1) {
        real.setTargetFragment(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setUserVisibleHint(boolean arg0) {
        real.setUserVisibleHint(arg0);
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String arg0) {
        return real.shouldShowRequestPermissionRationale(arg0);
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.startActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.startActivityForResult(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void startActivityForResult(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.startActivityForResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void startIntentSenderForResult(com.micklab.dcg.wrapper.android.content.IntentSender arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2, int arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) throws android.content.IntentSender.SendIntentException {
        real.startIntentSenderForResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void startPostponedEnterTransition() {
        real.startPostponedEnterTransition();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void unregisterForContextMenu(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.unregisterForContextMenu(arg0 == null ? null : arg0.unwrap());
    }

    public static final class InstantiationException {
        private final android.app.Fragment.InstantiationException real;

        public InstantiationException(android.app.Fragment.InstantiationException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Fragment.InstantiationException wrap(android.app.Fragment.InstantiationException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Fragment.InstantiationException(real);
        }

        public android.app.Fragment.InstantiationException unwrap() {
            return real;
        }

        public InstantiationException(java.lang.String arg0, java.lang.Exception arg1) {
            this(new android.app.Fragment.InstantiationException(arg0, arg1));
        }

    }
    public static final class SavedState {
        private final android.app.Fragment.SavedState real;

        public SavedState(android.app.Fragment.SavedState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.Fragment.SavedState wrap(android.app.Fragment.SavedState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.Fragment.SavedState(real);
        }

        public android.app.Fragment.SavedState unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
