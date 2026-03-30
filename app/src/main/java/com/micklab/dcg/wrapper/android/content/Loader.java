// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class Loader {
    private final android.content.Loader real;

    public Loader(android.content.Loader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.Loader wrap(android.content.Loader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader(real);
    }

    public android.content.Loader unwrap() {
        return real;
    }

    public Loader(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.Loader(arg0 == null ? null : arg0.unwrap()));
    }

    public void abandon() {
        real.abandon();
    }

    public boolean cancelLoad() {
        return real.cancelLoad();
    }

    public void commitContentChanged() {
        real.commitContentChanged();
    }

    public java.lang.String dataToString(java.lang.Object arg0) {
        return real.dataToString(arg0);
    }

    public void deliverCancellation() {
        real.deliverCancellation();
    }

    public void deliverResult(java.lang.Object arg0) {
        real.deliverResult(arg0);
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public void forceLoad() {
        real.forceLoad();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public int getId() {
        return real.getId();
    }

    public boolean isAbandoned() {
        return real.isAbandoned();
    }

    public boolean isReset() {
        return real.isReset();
    }

    public boolean isStarted() {
        return real.isStarted();
    }

    public void onContentChanged() {
        real.onContentChanged();
    }

    public void reset() {
        real.reset();
    }

    public void rollbackContentChanged() {
        real.rollbackContentChanged();
    }

    public void startLoading() {
        real.startLoading();
    }

    public void stopLoading() {
        real.stopLoading();
    }

    public boolean takeContentChanged() {
        return real.takeContentChanged();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class OnLoadCanceledListener {
        private final android.content.Loader.OnLoadCanceledListener real;

        public OnLoadCanceledListener(android.content.Loader.OnLoadCanceledListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Loader.OnLoadCanceledListener wrap(android.content.Loader.OnLoadCanceledListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader.OnLoadCanceledListener(real);
        }

        public android.content.Loader.OnLoadCanceledListener unwrap() {
            return real;
        }

    }
    public static final class OnLoadCompleteListener {
        private final android.content.Loader.OnLoadCompleteListener real;

        public OnLoadCompleteListener(android.content.Loader.OnLoadCompleteListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Loader.OnLoadCompleteListener wrap(android.content.Loader.OnLoadCompleteListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Loader.OnLoadCompleteListener(real);
        }

        public android.content.Loader.OnLoadCompleteListener unwrap() {
            return real;
        }

    }
}
