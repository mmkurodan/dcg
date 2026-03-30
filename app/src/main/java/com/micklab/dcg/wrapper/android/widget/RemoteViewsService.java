// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class RemoteViewsService {
    private final android.widget.RemoteViewsService real;

    public RemoteViewsService(android.widget.RemoteViewsService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.RemoteViewsService wrap(android.widget.RemoteViewsService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViewsService(real);
    }

    public android.widget.RemoteViewsService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory.wrap(real.onGetViewFactory(arg0 == null ? null : arg0.unwrap()));
    }

    public static final class RemoteViewsFactory {
        private final android.widget.RemoteViewsService.RemoteViewsFactory real;

        public RemoteViewsFactory(android.widget.RemoteViewsService.RemoteViewsFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory wrap(android.widget.RemoteViewsService.RemoteViewsFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.RemoteViewsService.RemoteViewsFactory(real);
        }

        public android.widget.RemoteViewsService.RemoteViewsFactory unwrap() {
            return real;
        }

        public int getCount() {
            return real.getCount();
        }

        public long getItemId(int arg0) {
            return real.getItemId(arg0);
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews getLoadingView() {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.getLoadingView());
        }

        public com.micklab.dcg.wrapper.android.widget.RemoteViews getViewAt(int arg0) {
            return com.micklab.dcg.wrapper.android.widget.RemoteViews.wrap(real.getViewAt(arg0));
        }

        public int getViewTypeCount() {
            return real.getViewTypeCount();
        }

        public boolean hasStableIds() {
            return real.hasStableIds();
        }

        public void onCreate() {
            real.onCreate();
        }

        public void onDataSetChanged() {
            real.onDataSetChanged();
        }

        public void onDestroy() {
            real.onDestroy();
        }

    }
}
