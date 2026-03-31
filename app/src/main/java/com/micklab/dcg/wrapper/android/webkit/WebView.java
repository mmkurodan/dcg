// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebView wrap(android.webkit.WebView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebView getReal() {
        return (android.webkit.WebView) real;
    }

    public android.webkit.WebView unwrap() {
        return getReal();
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public WebView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, boolean arg3) {
        this(new android.webkit.WebView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addJavascriptInterface(java.lang.Object arg0, java.lang.String arg1) {
        ((android.webkit.WebView) real).addJavascriptInterface(arg0, arg1);
    }

    public boolean canGoBack() {
        return ((android.webkit.WebView) real).canGoBack();
    }

    public boolean canGoBackOrForward(int arg0) {
        return ((android.webkit.WebView) real).canGoBackOrForward(arg0);
    }

    public boolean canGoForward() {
        return ((android.webkit.WebView) real).canGoForward();
    }

    public boolean canZoomIn() {
        return ((android.webkit.WebView) real).canZoomIn();
    }

    public boolean canZoomOut() {
        return ((android.webkit.WebView) real).canZoomOut();
    }

    public com.micklab.dcg.wrapper.android.graphics.Picture capturePicture() {
        return com.micklab.dcg.wrapper.android.graphics.Picture.wrap(((android.webkit.WebView) real).capturePicture());
    }

    public void clearCache(boolean arg0) {
        ((android.webkit.WebView) real).clearCache(arg0);
    }

    public static void clearClientCertPreferences(java.lang.Runnable arg0) {
        android.webkit.WebView.clearClientCertPreferences(arg0);
    }

    public void clearFormData() {
        ((android.webkit.WebView) real).clearFormData();
    }

    public void clearHistory() {
        ((android.webkit.WebView) real).clearHistory();
    }

    public void clearMatches() {
        ((android.webkit.WebView) real).clearMatches();
    }

    public void clearSslPreferences() {
        ((android.webkit.WebView) real).clearSslPreferences();
    }

    public void clearView() {
        ((android.webkit.WebView) real).clearView();
    }

    public void computeScroll() {
        ((android.webkit.WebView) real).computeScroll();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebBackForwardList copyBackForwardList() {
        return com.micklab.dcg.wrapper.android.webkit.WebBackForwardList.wrap(((android.webkit.WebView) real).copyBackForwardList());
    }

    public com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter createPrintDocumentAdapter() {
        return com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.wrap(((android.webkit.WebView) real).createPrintDocumentAdapter());
    }

    public com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.print.PrintDocumentAdapter.wrap(((android.webkit.WebView) real).createPrintDocumentAdapter(arg0));
    }

    public android.webkit.WebMessagePort[] createWebMessageChannel() {
        return ((android.webkit.WebView) real).createWebMessageChannel();
    }

    public void destroy() {
        ((android.webkit.WebView) real).destroy();
    }

    public static void disableWebView() {
        android.webkit.WebView.disableWebView();
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.webkit.WebView) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public void documentHasImages(com.micklab.dcg.wrapper.android.os.Message arg0) {
        ((android.webkit.WebView) real).documentHasImages(arg0 == null ? null : arg0.getReal());
    }

    public static void enableSlowWholeDocumentDraw() {
        android.webkit.WebView.enableSlowWholeDocumentDraw();
    }

    public static java.lang.String findAddress(java.lang.String arg0) {
        return android.webkit.WebView.findAddress(arg0);
    }

    public int findAll(java.lang.String arg0) {
        return ((android.webkit.WebView) real).findAll(arg0);
    }

    public void findAllAsync(java.lang.String arg0) {
        ((android.webkit.WebView) real).findAllAsync(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.View findFocus() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.webkit.WebView) real).findFocus());
    }

    public void findNext(boolean arg0) {
        ((android.webkit.WebView) real).findNext(arg0);
    }

    public void flingScroll(int arg0, int arg1) {
        ((android.webkit.WebView) real).flingScroll(arg0, arg1);
    }

    public void freeMemory() {
        ((android.webkit.WebView) real).freeMemory();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.webkit.WebView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeProvider.wrap(((android.webkit.WebView) real).getAccessibilityNodeProvider());
    }

    public com.micklab.dcg.wrapper.android.net.http.SslCertificate getCertificate() {
        return com.micklab.dcg.wrapper.android.net.http.SslCertificate.wrap(((android.webkit.WebView) real).getCertificate());
    }

    public int getContentHeight() {
        return ((android.webkit.WebView) real).getContentHeight();
    }

    public static com.micklab.dcg.wrapper.android.content.pm.PackageInfo getCurrentWebViewPackage() {
        return com.micklab.dcg.wrapper.android.content.pm.PackageInfo.wrap(android.webkit.WebView.getCurrentWebViewPackage());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getFavicon() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.webkit.WebView) real).getFavicon());
    }

    public com.micklab.dcg.wrapper.android.os.Handler getHandler() {
        return com.micklab.dcg.wrapper.android.os.Handler.wrap(((android.webkit.WebView) real).getHandler());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult getHitTestResult() {
        return com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult.wrap(((android.webkit.WebView) real).getHitTestResult());
    }

    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1) {
        return ((android.webkit.WebView) real).getHttpAuthUsernamePassword(arg0, arg1);
    }

    public java.lang.String getOriginalUrl() {
        return ((android.webkit.WebView) real).getOriginalUrl();
    }

    public int getProgress() {
        return ((android.webkit.WebView) real).getProgress();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        return ((android.webkit.WebView) real).getRendererPriorityWaivedWhenNotVisible();
    }

    public int getRendererRequestedPriority() {
        return ((android.webkit.WebView) real).getRendererRequestedPriority();
    }

    public static com.micklab.dcg.wrapper.android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(android.webkit.WebView.getSafeBrowsingPrivacyPolicyUrl());
    }

    public float getScale() {
        return ((android.webkit.WebView) real).getScale();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebSettings getSettings() {
        return com.micklab.dcg.wrapper.android.webkit.WebSettings.wrap(((android.webkit.WebView) real).getSettings());
    }

    public com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier getTextClassifier() {
        return com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier.wrap(((android.webkit.WebView) real).getTextClassifier());
    }

    public java.lang.String getTitle() {
        return ((android.webkit.WebView) real).getTitle();
    }

    public java.lang.String getUrl() {
        return ((android.webkit.WebView) real).getUrl();
    }

    public com.micklab.dcg.wrapper.android.webkit.WebChromeClient getWebChromeClient() {
        return com.micklab.dcg.wrapper.android.webkit.WebChromeClient.wrap(((android.webkit.WebView) real).getWebChromeClient());
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebView#getWebViewClassLoader()");
    }

    public com.micklab.dcg.wrapper.android.webkit.WebViewClient getWebViewClient() {
        return com.micklab.dcg.wrapper.android.webkit.WebViewClient.wrap(((android.webkit.WebView) real).getWebViewClient());
    }

    public com.micklab.dcg.wrapper.android.os.Looper getWebViewLooper() {
        return com.micklab.dcg.wrapper.android.os.Looper.wrap(((android.webkit.WebView) real).getWebViewLooper());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess getWebViewRenderProcess() {
        return com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess.wrap(((android.webkit.WebView) real).getWebViewRenderProcess());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient.wrap(((android.webkit.WebView) real).getWebViewRenderProcessClient());
    }

    public void goBack() {
        ((android.webkit.WebView) real).goBack();
    }

    public void goBackOrForward(int arg0) {
        ((android.webkit.WebView) real).goBackOrForward(arg0);
    }

    public void goForward() {
        ((android.webkit.WebView) real).goForward();
    }

    public void invokeZoomPicker() {
        ((android.webkit.WebView) real).invokeZoomPicker();
    }

    public boolean isPrivateBrowsingEnabled() {
        return ((android.webkit.WebView) real).isPrivateBrowsingEnabled();
    }

    public boolean isVisibleToUserForAutofill(int arg0) {
        return ((android.webkit.WebView) real).isVisibleToUserForAutofill(arg0);
    }

    public void loadData(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.webkit.WebView) real).loadData(arg0, arg1, arg2);
    }

    public void loadDataWithBaseURL(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
        ((android.webkit.WebView) real).loadDataWithBaseURL(arg0, arg1, arg2, arg3, arg4);
    }

    public void loadUrl(java.lang.String arg0) {
        ((android.webkit.WebView) real).loadUrl(arg0);
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets onApplyWindowInsets(com.micklab.dcg.wrapper.android.view.WindowInsets arg0) {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.webkit.WebView) real).onApplyWindowInsets(arg0 == null ? null : arg0.getReal()));
    }

    public boolean onCheckIsTextEditor() {
        return ((android.webkit.WebView) real).onCheckIsTextEditor();
    }

    public void onChildViewAdded(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.webkit.WebView) real).onChildViewAdded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onChildViewRemoved(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.webkit.WebView) real).onChildViewRemoved(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection onCreateInputConnection(com.micklab.dcg.wrapper.android.view.inputmethod.EditorInfo arg0) {
        return com.micklab.dcg.wrapper.android.view.inputmethod.InputConnection.wrap(((android.webkit.WebView) real).onCreateInputConnection(arg0 == null ? null : arg0.getReal()));
    }

    public boolean onDragEvent(com.micklab.dcg.wrapper.android.view.DragEvent arg0) {
        return ((android.webkit.WebView) real).onDragEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onFinishTemporaryDetach() {
        ((android.webkit.WebView) real).onFinishTemporaryDetach();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.webkit.WebView) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onGlobalFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.webkit.WebView) real).onGlobalFocusChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean onHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.webkit.WebView) real).onHoverEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.webkit.WebView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.webkit.WebView) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.webkit.WebView) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onPause() {
        ((android.webkit.WebView) real).onPause();
    }

    public void onProvideAutofillVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.webkit.WebView) real).onProvideAutofillVirtualStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onProvideContentCaptureStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0, int arg1) {
        ((android.webkit.WebView) real).onProvideContentCaptureStructure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onProvideVirtualStructure(com.micklab.dcg.wrapper.android.view.ViewStructure arg0) {
        ((android.webkit.WebView) real).onProvideVirtualStructure(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.PointerIcon onResolvePointerIcon(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.PointerIcon.wrap(((android.webkit.WebView) real).onResolvePointerIcon(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void onResume() {
        ((android.webkit.WebView) real).onResume();
    }

    public void onStartTemporaryDetach() {
        ((android.webkit.WebView) real).onStartTemporaryDetach();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.webkit.WebView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.webkit.WebView) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onWindowFocusChanged(boolean arg0) {
        ((android.webkit.WebView) real).onWindowFocusChanged(arg0);
    }

    public boolean overlayHorizontalScrollbar() {
        return ((android.webkit.WebView) real).overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return ((android.webkit.WebView) real).overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean arg0) {
        return ((android.webkit.WebView) real).pageDown(arg0);
    }

    public boolean pageUp(boolean arg0) {
        return ((android.webkit.WebView) real).pageUp(arg0);
    }

    public void pauseTimers() {
        ((android.webkit.WebView) real).pauseTimers();
    }

    public boolean performLongClick() {
        return ((android.webkit.WebView) real).performLongClick();
    }

    public void postUrl(java.lang.String arg0, byte[] arg1) {
        ((android.webkit.WebView) real).postUrl(arg0, arg1);
    }

    public void postVisualStateCallback(long arg0, com.micklab.dcg.wrapper.android.webkit.WebView.VisualStateCallback arg1) {
        ((android.webkit.WebView) real).postVisualStateCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void postWebMessage(com.micklab.dcg.wrapper.android.webkit.WebMessage arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.webkit.WebView) real).postWebMessage(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void reload() {
        ((android.webkit.WebView) real).reload();
    }

    public void removeJavascriptInterface(java.lang.String arg0) {
        ((android.webkit.WebView) real).removeJavascriptInterface(arg0);
    }

    public boolean requestChildRectangleOnScreen(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, boolean arg2) {
        return ((android.webkit.WebView) real).requestChildRectangleOnScreen(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean requestFocus(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.webkit.WebView) real).requestFocus(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void requestFocusNodeHref(com.micklab.dcg.wrapper.android.os.Message arg0) {
        ((android.webkit.WebView) real).requestFocusNodeHref(arg0 == null ? null : arg0.getReal());
    }

    public void requestImageRef(com.micklab.dcg.wrapper.android.os.Message arg0) {
        ((android.webkit.WebView) real).requestImageRef(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.webkit.WebBackForwardList restoreState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebBackForwardList.wrap(((android.webkit.WebView) real).restoreState(arg0 == null ? null : arg0.getReal()));
    }

    public void resumeTimers() {
        ((android.webkit.WebView) real).resumeTimers();
    }

    public void savePassword(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        ((android.webkit.WebView) real).savePassword(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.webkit.WebBackForwardList saveState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.webkit.WebBackForwardList.wrap(((android.webkit.WebView) real).saveState(arg0 == null ? null : arg0.getReal()));
    }

    public void saveWebArchive(java.lang.String arg0) {
        ((android.webkit.WebView) real).saveWebArchive(arg0);
    }

    public void setBackgroundColor(int arg0) {
        ((android.webkit.WebView) real).setBackgroundColor(arg0);
    }

    public void setCertificate(com.micklab.dcg.wrapper.android.net.http.SslCertificate arg0) {
        ((android.webkit.WebView) real).setCertificate(arg0 == null ? null : arg0.getReal());
    }

    public static void setDataDirectorySuffix(java.lang.String arg0) {
        android.webkit.WebView.setDataDirectorySuffix(arg0);
    }

    public void setDownloadListener(com.micklab.dcg.wrapper.android.webkit.DownloadListener arg0) {
        ((android.webkit.WebView) real).setDownloadListener(arg0 == null ? null : arg0.getReal());
    }

    public void setFindListener(com.micklab.dcg.wrapper.android.webkit.WebView.FindListener arg0) {
        ((android.webkit.WebView) real).setFindListener(arg0 == null ? null : arg0.getReal());
    }

    public void setHorizontalScrollbarOverlay(boolean arg0) {
        ((android.webkit.WebView) real).setHorizontalScrollbarOverlay(arg0);
    }

    public void setHttpAuthUsernamePassword(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        ((android.webkit.WebView) real).setHttpAuthUsernamePassword(arg0, arg1, arg2, arg3);
    }

    public void setInitialScale(int arg0) {
        ((android.webkit.WebView) real).setInitialScale(arg0);
    }

    public void setLayerType(int arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.webkit.WebView) real).setLayerType(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setLayoutParams(com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg0) {
        ((android.webkit.WebView) real).setLayoutParams(arg0 == null ? null : arg0.getReal());
    }

    public void setMapTrackballToArrowKeys(boolean arg0) {
        ((android.webkit.WebView) real).setMapTrackballToArrowKeys(arg0);
    }

    public void setNetworkAvailable(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.webkit.WebView#setNetworkAvailable(boolean)");
    }

    public void setOverScrollMode(int arg0) {
        ((android.webkit.WebView) real).setOverScrollMode(arg0);
    }

    public void setPictureListener(com.micklab.dcg.wrapper.android.webkit.WebView.PictureListener arg0) {
        ((android.webkit.WebView) real).setPictureListener(arg0 == null ? null : arg0.getReal());
    }

    public void setRendererPriorityPolicy(int arg0, boolean arg1) {
        ((android.webkit.WebView) real).setRendererPriorityPolicy(arg0, arg1);
    }

    public void setScrollBarStyle(int arg0) {
        ((android.webkit.WebView) real).setScrollBarStyle(arg0);
    }

    public void setTextClassifier(com.micklab.dcg.wrapper.android.view.textclassifier.TextClassifier arg0) {
        ((android.webkit.WebView) real).setTextClassifier(arg0 == null ? null : arg0.getReal());
    }

    public void setVerticalScrollbarOverlay(boolean arg0) {
        ((android.webkit.WebView) real).setVerticalScrollbarOverlay(arg0);
    }

    public void setWebChromeClient(com.micklab.dcg.wrapper.android.webkit.WebChromeClient arg0) {
        ((android.webkit.WebView) real).setWebChromeClient(arg0 == null ? null : arg0.getReal());
    }

    public static void setWebContentsDebuggingEnabled(boolean arg0) {
        android.webkit.WebView.setWebContentsDebuggingEnabled(arg0);
    }

    public void setWebViewClient(com.micklab.dcg.wrapper.android.webkit.WebViewClient arg0) {
        ((android.webkit.WebView) real).setWebViewClient(arg0 == null ? null : arg0.getReal());
    }

    public void setWebViewRenderProcessClient(com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient arg0) {
        ((android.webkit.WebView) real).setWebViewRenderProcessClient(arg0 == null ? null : arg0.getReal());
    }

    public void setWebViewRenderProcessClient(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient arg1) {
        ((android.webkit.WebView) real).setWebViewRenderProcessClient(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean shouldDelayChildPressedState() {
        return ((android.webkit.WebView) real).shouldDelayChildPressedState();
    }

    public boolean showFindDialog(java.lang.String arg0, boolean arg1) {
        return ((android.webkit.WebView) real).showFindDialog(arg0, arg1);
    }

    public void stopLoading() {
        ((android.webkit.WebView) real).stopLoading();
    }

    public void zoomBy(float arg0) {
        ((android.webkit.WebView) real).zoomBy(arg0);
    }

    public boolean zoomIn() {
        return ((android.webkit.WebView) real).zoomIn();
    }

    public boolean zoomOut() {
        return ((android.webkit.WebView) real).zoomOut();
    }

    public static final int RENDERER_PRIORITY_BOUND = android.webkit.WebView.RENDERER_PRIORITY_BOUND;
    public static final int RENDERER_PRIORITY_IMPORTANT = android.webkit.WebView.RENDERER_PRIORITY_IMPORTANT;
    public static final int RENDERER_PRIORITY_WAIVED = android.webkit.WebView.RENDERER_PRIORITY_WAIVED;
    public static final java.lang.String SCHEME_GEO = android.webkit.WebView.SCHEME_GEO;
    public static final java.lang.String SCHEME_MAILTO = android.webkit.WebView.SCHEME_MAILTO;
    public static final java.lang.String SCHEME_TEL = android.webkit.WebView.SCHEME_TEL;

    public static final class FindListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FindListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.FindListener wrap(android.webkit.WebView.FindListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.FindListener(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebView.FindListener getReal() {
            return (android.webkit.WebView.FindListener) real;
        }

        public android.webkit.WebView.FindListener unwrap() {
            return getReal();
        }

        public void onFindResultReceived(int arg0, int arg1, boolean arg2) {
            ((android.webkit.WebView.FindListener) real).onFindResultReceived(arg0, arg1, arg2);
        }

    }
    public static final class HitTestResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HitTestResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult wrap(android.webkit.WebView.HitTestResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.HitTestResult(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebView.HitTestResult getReal() {
            return (android.webkit.WebView.HitTestResult) real;
        }

        public android.webkit.WebView.HitTestResult unwrap() {
            return getReal();
        }

        public java.lang.String getExtra() {
            return ((android.webkit.WebView.HitTestResult) real).getExtra();
        }

        public int getType() {
            return ((android.webkit.WebView.HitTestResult) real).getType();
        }

        public static final int ANCHOR_TYPE = android.webkit.WebView.HitTestResult.ANCHOR_TYPE;
        public static final int EDIT_TEXT_TYPE = android.webkit.WebView.HitTestResult.EDIT_TEXT_TYPE;
        public static final int EMAIL_TYPE = android.webkit.WebView.HitTestResult.EMAIL_TYPE;
        public static final int GEO_TYPE = android.webkit.WebView.HitTestResult.GEO_TYPE;
        public static final int IMAGE_ANCHOR_TYPE = android.webkit.WebView.HitTestResult.IMAGE_ANCHOR_TYPE;
        public static final int IMAGE_TYPE = android.webkit.WebView.HitTestResult.IMAGE_TYPE;
        public static final int PHONE_TYPE = android.webkit.WebView.HitTestResult.PHONE_TYPE;
        public static final int SRC_ANCHOR_TYPE = android.webkit.WebView.HitTestResult.SRC_ANCHOR_TYPE;
        public static final int SRC_IMAGE_ANCHOR_TYPE = android.webkit.WebView.HitTestResult.SRC_IMAGE_ANCHOR_TYPE;
        public static final int UNKNOWN_TYPE = android.webkit.WebView.HitTestResult.UNKNOWN_TYPE;

    }
    public static final class PictureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PictureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.PictureListener wrap(android.webkit.WebView.PictureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.PictureListener(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebView.PictureListener getReal() {
            return (android.webkit.WebView.PictureListener) real;
        }

        public android.webkit.WebView.PictureListener unwrap() {
            return getReal();
        }

        public void onNewPicture(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.graphics.Picture arg1) {
            ((android.webkit.WebView.PictureListener) real).onNewPicture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class VisualStateCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VisualStateCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.VisualStateCallback wrap(android.webkit.WebView.VisualStateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.VisualStateCallback(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebView.VisualStateCallback getReal() {
            return (android.webkit.WebView.VisualStateCallback) real;
        }

        public android.webkit.WebView.VisualStateCallback unwrap() {
            return getReal();
        }

        public void onComplete(long arg0) {
            ((android.webkit.WebView.VisualStateCallback) real).onComplete(arg0);
        }

    }
    public static final class WebViewTransport {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WebViewTransport(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.webkit.WebView.WebViewTransport wrap(android.webkit.WebView.WebViewTransport real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebView.WebViewTransport(real, (__DcgwBridgeToken) null);
        }

        public android.webkit.WebView.WebViewTransport getReal() {
            return (android.webkit.WebView.WebViewTransport) real;
        }

        public android.webkit.WebView.WebViewTransport unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.webkit.WebView getWebView() {
            return com.micklab.dcg.wrapper.android.webkit.WebView.wrap(((android.webkit.WebView.WebViewTransport) real).getWebView());
        }

        public void setWebView(com.micklab.dcg.wrapper.android.webkit.WebView arg0) {
            ((android.webkit.WebView.WebViewTransport) real).setWebView(arg0 == null ? null : arg0.getReal());
        }


    }
}
