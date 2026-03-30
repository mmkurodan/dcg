// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RemoteViewsService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteViewsService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RemoteViewsService wrap(android.widget.RemoteViewsService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViewsService(real, (__DcgwBridgeToken) null);
    }

    public android.widget.RemoteViewsService getReal() {
        return (android.widget.RemoteViewsService) real;
    }

    public android.widget.RemoteViewsService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.widget.RemoteViewsService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory.wrap(((android.widget.RemoteViewsService) real).onGetViewFactory(arg0 == null ? null : arg0.getReal()));
    }

    public static final class RemoteViewsFactory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RemoteViewsFactory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory wrap(android.widget.RemoteViewsService.RemoteViewsFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory(real, (__DcgwBridgeToken) null);
        }

        public android.widget.RemoteViewsService.RemoteViewsFactory getReal() {
            return (android.widget.RemoteViewsService.RemoteViewsFactory) real;
        }

        public android.widget.RemoteViewsService.RemoteViewsFactory unwrap() {
            return getReal();
        }

        public int getCount() {
            return ((android.widget.RemoteViewsService.RemoteViewsFactory) real).getCount();
        }

        public long getItemId(int arg0) {
            return ((android.widget.RemoteViewsService.RemoteViewsFactory) real).getItemId(arg0);
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews getLoadingView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.widget.RemoteViewsService.RemoteViewsFactory) real).getLoadingView());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews getViewAt(int arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(((android.widget.RemoteViewsService.RemoteViewsFactory) real).getViewAt(arg0));
        }

        public int getViewTypeCount() {
            return ((android.widget.RemoteViewsService.RemoteViewsFactory) real).getViewTypeCount();
        }

        public boolean hasStableIds() {
            return ((android.widget.RemoteViewsService.RemoteViewsFactory) real).hasStableIds();
        }

        public void onCreate() {
            ((android.widget.RemoteViewsService.RemoteViewsFactory) real).onCreate();
        }

        public void onDataSetChanged() {
            ((android.widget.RemoteViewsService.RemoteViewsFactory) real).onDataSetChanged();
        }

        public void onDestroy() {
            ((android.widget.RemoteViewsService.RemoteViewsFactory) real).onDestroy();
        }

    }
}
