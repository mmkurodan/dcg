// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class DownloadManager {
    private final android.app.DownloadManager real;

    public DownloadManager(android.app.DownloadManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.DownloadManager wrap(android.app.DownloadManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.DownloadManager(real);
    }

    public android.app.DownloadManager unwrap() {
        return real;
    }

    public long addCompletedDownload(java.lang.String arg0, java.lang.String arg1, boolean arg2, java.lang.String arg3, java.lang.String arg4, long arg5, boolean arg6) {
        return real.addCompletedDownload(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public long addCompletedDownload(java.lang.String arg0, java.lang.String arg1, boolean arg2, java.lang.String arg3, java.lang.String arg4, long arg5, boolean arg6, com.micklab.dcg.wrapper.android.net.Uri arg7, com.micklab.dcg.wrapper.android.net.Uri arg8) {
        return real.addCompletedDownload(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap(), arg8 == null ? null : arg8.unwrap());
    }

    public long enqueue(com.micklab.dcg.wrapper.android.app.DownloadManager.Request arg0) {
        return real.enqueue(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.Long getMaxBytesOverMobile(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.app.DownloadManager.getMaxBytesOverMobile(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getMimeTypeForDownloadedFile(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.DownloadManager#getMimeTypeForDownloadedFile(long)");
    }

    public static java.lang.Long getRecommendedMaxBytesOverMobile(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.app.DownloadManager.getRecommendedMaxBytesOverMobile(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUriForDownloadedFile(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.DownloadManager#getUriForDownloadedFile(long)");
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openDownloadedFile(long arg0) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.DownloadManager#openDownloadedFile(long)");
    }

    public com.micklab.dcg.wrapper.android.database.Cursor query(com.micklab.dcg.wrapper.android.app.DownloadManager.Query arg0) {
        return com.micklab.dcg.wrapper.android.database.Cursor.wrap(real.query(arg0 == null ? null : arg0.unwrap()));
    }

    public int remove(long... arg0) {
        return real.remove(arg0);
    }

    public static final java.lang.String ACTION_DOWNLOAD_COMPLETE = android.app.DownloadManager.ACTION_DOWNLOAD_COMPLETE;
    public static final java.lang.String ACTION_NOTIFICATION_CLICKED = android.app.DownloadManager.ACTION_NOTIFICATION_CLICKED;
    public static final java.lang.String ACTION_VIEW_DOWNLOADS = android.app.DownloadManager.ACTION_VIEW_DOWNLOADS;
    public static final java.lang.String COLUMN_BYTES_DOWNLOADED_SO_FAR = android.app.DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR;
    public static final java.lang.String COLUMN_DESCRIPTION = android.app.DownloadManager.COLUMN_DESCRIPTION;
    public static final java.lang.String COLUMN_ID = android.app.DownloadManager.COLUMN_ID;
    public static final java.lang.String COLUMN_LAST_MODIFIED_TIMESTAMP = android.app.DownloadManager.COLUMN_LAST_MODIFIED_TIMESTAMP;
    public static final java.lang.String COLUMN_LOCAL_URI = android.app.DownloadManager.COLUMN_LOCAL_URI;
    public static final java.lang.String COLUMN_MEDIAPROVIDER_URI = android.app.DownloadManager.COLUMN_MEDIAPROVIDER_URI;
    public static final java.lang.String COLUMN_MEDIA_TYPE = android.app.DownloadManager.COLUMN_MEDIA_TYPE;
    public static final java.lang.String COLUMN_REASON = android.app.DownloadManager.COLUMN_REASON;
    public static final java.lang.String COLUMN_STATUS = android.app.DownloadManager.COLUMN_STATUS;
    public static final java.lang.String COLUMN_TITLE = android.app.DownloadManager.COLUMN_TITLE;
    public static final java.lang.String COLUMN_TOTAL_SIZE_BYTES = android.app.DownloadManager.COLUMN_TOTAL_SIZE_BYTES;
    public static final java.lang.String COLUMN_URI = android.app.DownloadManager.COLUMN_URI;
    public static final int ERROR_CANNOT_RESUME = android.app.DownloadManager.ERROR_CANNOT_RESUME;
    public static final int ERROR_DEVICE_NOT_FOUND = android.app.DownloadManager.ERROR_DEVICE_NOT_FOUND;
    public static final int ERROR_HTTP_DATA_ERROR = android.app.DownloadManager.ERROR_HTTP_DATA_ERROR;
    public static final int ERROR_INSUFFICIENT_SPACE = android.app.DownloadManager.ERROR_INSUFFICIENT_SPACE;
    public static final int ERROR_TOO_MANY_REDIRECTS = android.app.DownloadManager.ERROR_TOO_MANY_REDIRECTS;
    public static final int ERROR_UNHANDLED_HTTP_CODE = android.app.DownloadManager.ERROR_UNHANDLED_HTTP_CODE;
    public static final int ERROR_UNKNOWN = android.app.DownloadManager.ERROR_UNKNOWN;
    public static final java.lang.String EXTRA_DOWNLOAD_ID = android.app.DownloadManager.EXTRA_DOWNLOAD_ID;
    public static final java.lang.String EXTRA_NOTIFICATION_CLICK_DOWNLOAD_IDS = android.app.DownloadManager.EXTRA_NOTIFICATION_CLICK_DOWNLOAD_IDS;
    public static final java.lang.String INTENT_EXTRAS_SORT_BY_SIZE = android.app.DownloadManager.INTENT_EXTRAS_SORT_BY_SIZE;
    public static final int PAUSED_QUEUED_FOR_WIFI = android.app.DownloadManager.PAUSED_QUEUED_FOR_WIFI;
    public static final int PAUSED_UNKNOWN = android.app.DownloadManager.PAUSED_UNKNOWN;
    public static final int PAUSED_WAITING_TO_RETRY = android.app.DownloadManager.PAUSED_WAITING_TO_RETRY;
    public static final int STATUS_FAILED = android.app.DownloadManager.STATUS_FAILED;
    public static final int STATUS_PAUSED = android.app.DownloadManager.STATUS_PAUSED;
    public static final int STATUS_PENDING = android.app.DownloadManager.STATUS_PENDING;
    public static final int STATUS_RUNNING = android.app.DownloadManager.STATUS_RUNNING;
    public static final int STATUS_SUCCESSFUL = android.app.DownloadManager.STATUS_SUCCESSFUL;

    public static final class Query {
        private final android.app.DownloadManager.Query real;

        public Query(android.app.DownloadManager.Query real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.DownloadManager.Query wrap(android.app.DownloadManager.Query real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.DownloadManager.Query(real);
        }

        public android.app.DownloadManager.Query unwrap() {
            return real;
        }

        public Query() {
            this(new android.app.DownloadManager.Query());
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Query setFilterById(long... arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Query.wrap(real.setFilterById(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Query setFilterByStatus(int arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Query.wrap(real.setFilterByStatus(arg0));
        }

    }
    public static final class Request {
        private final android.app.DownloadManager.Request real;

        public Request(android.app.DownloadManager.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.DownloadManager.Request wrap(android.app.DownloadManager.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.DownloadManager.Request(real);
        }

        public android.app.DownloadManager.Request unwrap() {
            return real;
        }

        public Request(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            this(new android.app.DownloadManager.Request(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request addRequestHeader(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.addRequestHeader(arg0, arg1));
        }

        public void allowScanningByMediaScanner() {
            real.allowScanningByMediaScanner();
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setAllowedNetworkTypes(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.DownloadManager$Request#setAllowedNetworkTypes(int)");
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setAllowedOverMetered(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setAllowedOverMetered(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setAllowedOverRoaming(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setAllowedOverRoaming(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setDestinationInExternalFilesDir(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.lang.String arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.DownloadManager$Request#setDestinationInExternalFilesDir(android.content.Context,java.lang.String,java.lang.String)");
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setDestinationInExternalPublicDir(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setDestinationInExternalPublicDir(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setDestinationUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setDestinationUri(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setNotificationVisibility(int arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setNotificationVisibility(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setRequiresCharging(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setRequiresCharging(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setRequiresDeviceIdle(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setRequiresDeviceIdle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setShowRunningNotification(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setShowRunningNotification(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setTitle(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.app.DownloadManager.Request setVisibleInDownloadsUi(boolean arg0) {
            return com.micklab.dcg.wrapper.android.app.DownloadManager.Request.wrap(real.setVisibleInDownloadsUi(arg0));
        }

        public static final int VISIBILITY_HIDDEN = android.app.DownloadManager.Request.VISIBILITY_HIDDEN;
        public static final int VISIBILITY_VISIBLE = android.app.DownloadManager.Request.VISIBILITY_VISIBLE;
        public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = android.app.DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED;
        public static final int VISIBILITY_VISIBLE_NOTIFY_ONLY_COMPLETION = android.app.DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_ONLY_COMPLETION;

    }
}
