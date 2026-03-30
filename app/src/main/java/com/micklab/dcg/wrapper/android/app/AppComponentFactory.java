// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class AppComponentFactory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppComponentFactory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.AppComponentFactory wrap(android.app.AppComponentFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.AppComponentFactory(real, (__DcgwBridgeToken) null);
    }

    public android.app.AppComponentFactory getReal() {
        return (android.app.AppComponentFactory) real;
    }

    public android.app.AppComponentFactory unwrap() {
        return getReal();
    }

    public AppComponentFactory() {
        this(new android.app.AppComponentFactory(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.app.Activity instantiateActivity(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.AppComponentFactory) real).instantiateActivity(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.Application instantiateApplication(java.lang.ClassLoader arg0, java.lang.String arg1) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(((android.app.AppComponentFactory) real).instantiateApplication(arg0, arg1));
    }

    public java.lang.ClassLoader instantiateClassLoader(java.lang.ClassLoader arg0, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.AppComponentFactory#instantiateClassLoader(java.lang.ClassLoader,android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.content.ContentProvider instantiateProvider(java.lang.ClassLoader arg0, java.lang.String arg1) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.content.ContentProvider.wrap(((android.app.AppComponentFactory) real).instantiateProvider(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.content.BroadcastReceiver.wrap(((android.app.AppComponentFactory) real).instantiateReceiver(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.Service instantiateService(java.lang.ClassLoader arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        return com.micklab.dcg.wrapper.android.app.Service.wrap(((android.app.AppComponentFactory) real).instantiateService(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

}
