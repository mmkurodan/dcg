// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class Loader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Loader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.Loader wrap(android.content.Loader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader(real, (__DcgwBridgeToken) null);
    }

    public android.content.Loader getReal() {
        return (android.content.Loader) real;
    }

    public android.content.Loader unwrap() {
        return getReal();
    }

    public Loader(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.Loader(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void abandon() {
        ((android.content.Loader) real).abandon();
    }

    public boolean cancelLoad() {
        return ((android.content.Loader) real).cancelLoad();
    }

    public void commitContentChanged() {
        ((android.content.Loader) real).commitContentChanged();
    }

    public java.lang.String dataToString(java.lang.Object arg0) {
        return ((android.content.Loader) real).dataToString(arg0);
    }

    public void deliverCancellation() {
        ((android.content.Loader) real).deliverCancellation();
    }

    public void deliverResult(java.lang.Object arg0) {
        ((android.content.Loader) real).deliverResult(arg0);
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.content.Loader) real).dump(arg0, arg1, arg2, arg3);
    }

    public void forceLoad() {
        ((android.content.Loader) real).forceLoad();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Loader) real).getContext());
    }

    public int getId() {
        return ((android.content.Loader) real).getId();
    }

    public boolean isAbandoned() {
        return ((android.content.Loader) real).isAbandoned();
    }

    public boolean isReset() {
        return ((android.content.Loader) real).isReset();
    }

    public boolean isStarted() {
        return ((android.content.Loader) real).isStarted();
    }

    public void onContentChanged() {
        ((android.content.Loader) real).onContentChanged();
    }

    public void reset() {
        ((android.content.Loader) real).reset();
    }

    public void rollbackContentChanged() {
        ((android.content.Loader) real).rollbackContentChanged();
    }

    public void startLoading() {
        ((android.content.Loader) real).startLoading();
    }

    public void stopLoading() {
        ((android.content.Loader) real).stopLoading();
    }

    public boolean takeContentChanged() {
        return ((android.content.Loader) real).takeContentChanged();
    }

    public java.lang.String toString() {
        return ((android.content.Loader) real).toString();
    }

    public static final class ForceLoadContentObserver {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ForceLoadContentObserver(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Loader.ForceLoadContentObserver wrap(android.content.Loader.ForceLoadContentObserver real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader.ForceLoadContentObserver(real, (__DcgwBridgeToken) null);
        }

        public android.content.Loader.ForceLoadContentObserver getReal() {
            return (android.content.Loader.ForceLoadContentObserver) real;
        }

        public android.content.Loader.ForceLoadContentObserver unwrap() {
            return getReal();
        }

        public boolean deliverSelfNotifications() {
            return ((android.content.Loader.ForceLoadContentObserver) real).deliverSelfNotifications();
        }

        public void onChange(boolean arg0) {
            ((android.content.Loader.ForceLoadContentObserver) real).onChange(arg0);
        }


    }
    public static final class OnLoadCanceledListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnLoadCanceledListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Loader.OnLoadCanceledListener wrap(android.content.Loader.OnLoadCanceledListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader.OnLoadCanceledListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.Loader.OnLoadCanceledListener getReal() {
            return (android.content.Loader.OnLoadCanceledListener) real;
        }

        public android.content.Loader.OnLoadCanceledListener unwrap() {
            return getReal();
        }

    }
    public static final class OnLoadCompleteListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnLoadCompleteListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Loader.OnLoadCompleteListener wrap(android.content.Loader.OnLoadCompleteListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader.OnLoadCompleteListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.Loader.OnLoadCompleteListener getReal() {
            return (android.content.Loader.OnLoadCompleteListener) real;
        }

        public android.content.Loader.OnLoadCompleteListener unwrap() {
            return getReal();
        }

    }
}
