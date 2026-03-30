// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VoiceInteractionSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VoiceInteractionSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession wrap(android.service.voice.VoiceInteractionSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession(real, (__DcgwBridgeToken) null);
    }

    public android.service.voice.VoiceInteractionSession getReal() {
        return (android.service.voice.VoiceInteractionSession) real;
    }

    public android.service.voice.VoiceInteractionSession unwrap() {
        return getReal();
    }

    public VoiceInteractionSession(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.service.voice.VoiceInteractionSession(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public VoiceInteractionSession(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        this(new android.service.voice.VoiceInteractionSession(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void closeSystemDialogs() {
        ((android.service.voice.VoiceInteractionSession) real).closeSystemDialogs();
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        ((android.service.voice.VoiceInteractionSession) real).dump(arg0, arg1, arg2, arg3);
    }

    public void finish() {
        ((android.service.voice.VoiceInteractionSession) real).finish();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.service.voice.VoiceInteractionSession) real).getContext());
    }

    public int getDisabledShowContext() {
        return ((android.service.voice.VoiceInteractionSession) real).getDisabledShowContext();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(((android.service.voice.VoiceInteractionSession) real).getLayoutInflater());
    }

    public int getUserDisabledShowContext() {
        return ((android.service.voice.VoiceInteractionSession) real).getUserDisabledShowContext();
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getWindow() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(((android.service.voice.VoiceInteractionSession) real).getWindow());
    }

    public void hide() {
        ((android.service.voice.VoiceInteractionSession) real).hide();
    }

    public void onAssistStructureFailure(java.lang.Throwable arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onAssistStructureFailure(arg0);
    }

    public void onBackPressed() {
        ((android.service.voice.VoiceInteractionSession) real).onBackPressed();
    }

    public void onCancelRequest(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Request arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onCancelRequest(arg0 == null ? null : arg0.getReal());
    }

    public void onCloseSystemDialogs() {
        ((android.service.voice.VoiceInteractionSession) real).onCloseSystemDialogs();
    }

    public void onComputeInsets(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Insets arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onComputeInsets(arg0 == null ? null : arg0.getReal());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate() {
        ((android.service.voice.VoiceInteractionSession) real).onCreate();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateContentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.service.voice.VoiceInteractionSession) real).onCreateContentView());
    }

    public void onDestroy() {
        ((android.service.voice.VoiceInteractionSession) real).onDestroy();
    }

    public void onDirectActionsInvalidated(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onDirectActionsInvalidated(arg0 == null ? null : arg0.getReal());
    }

    public boolean[] onGetSupportedCommands(java.lang.String[] arg0) {
        return ((android.service.voice.VoiceInteractionSession) real).onGetSupportedCommands(arg0);
    }

    public void onHandleAssist(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AssistState arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onHandleAssist(arg0 == null ? null : arg0.getReal());
    }

    public void onHandleAssist(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.app.assist.AssistStructure arg1, com.micklab.dcg.wrapper.android.app.assist.AssistContent arg2) {
        ((android.service.voice.VoiceInteractionSession) real).onHandleAssist(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onHandleAssistSecondary(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.app.assist.AssistStructure arg1, com.micklab.dcg.wrapper.android.app.assist.AssistContent arg2, int arg3, int arg4) {
        ((android.service.voice.VoiceInteractionSession) real).onHandleAssistSecondary(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4);
    }

    public void onHandleScreenshot(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onHandleScreenshot(arg0 == null ? null : arg0.getReal());
    }

    public void onHide() {
        ((android.service.voice.VoiceInteractionSession) real).onHide();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.service.voice.VoiceInteractionSession) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.service.voice.VoiceInteractionSession) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return ((android.service.voice.VoiceInteractionSession) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.service.voice.VoiceInteractionSession) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onLockscreenShown() {
        ((android.service.voice.VoiceInteractionSession) real).onLockscreenShown();
    }

    public void onLowMemory() {
        ((android.service.voice.VoiceInteractionSession) real).onLowMemory();
    }

    public void onPrepareShow(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        ((android.service.voice.VoiceInteractionSession) real).onPrepareShow(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onRequestAbortVoice(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AbortVoiceRequest arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onRequestAbortVoice(arg0 == null ? null : arg0.getReal());
    }

    public void onRequestCommand(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CommandRequest arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onRequestCommand(arg0 == null ? null : arg0.getReal());
    }

    public void onRequestCompleteVoice(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CompleteVoiceRequest arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onRequestCompleteVoice(arg0 == null ? null : arg0.getReal());
    }

    public void onRequestConfirmation(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ConfirmationRequest arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onRequestConfirmation(arg0 == null ? null : arg0.getReal());
    }

    public void onRequestPickOption(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.PickOptionRequest arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onRequestPickOption(arg0 == null ? null : arg0.getReal());
    }

    public void onShow(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        ((android.service.voice.VoiceInteractionSession) real).onShow(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onTaskFinished(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.service.voice.VoiceInteractionSession) real).onTaskFinished(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onTaskStarted(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.service.voice.VoiceInteractionSession) real).onTaskStarted(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onTrimMemory(int arg0) {
        ((android.service.voice.VoiceInteractionSession) real).onTrimMemory(arg0);
    }

    public void registerVisibleActivityCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback arg1) {
        ((android.service.voice.VoiceInteractionSession) real).registerVisibleActivityCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.service.voice.VoiceInteractionSession) real).setContentView(arg0 == null ? null : arg0.getReal());
    }

    public void setDisabledShowContext(int arg0) {
        ((android.service.voice.VoiceInteractionSession) real).setDisabledShowContext(arg0);
    }

    public void setKeepAwake(boolean arg0) {
        ((android.service.voice.VoiceInteractionSession) real).setKeepAwake(arg0);
    }

    public void setTheme(int arg0) {
        ((android.service.voice.VoiceInteractionSession) real).setTheme(arg0);
    }

    public void setUiEnabled(boolean arg0) {
        ((android.service.voice.VoiceInteractionSession) real).setUiEnabled(arg0);
    }

    public void show(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        ((android.service.voice.VoiceInteractionSession) real).show(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void startAssistantActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.service.voice.VoiceInteractionSession) real).startAssistantActivity(arg0 == null ? null : arg0.getReal());
    }

    public void startAssistantActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.service.voice.VoiceInteractionSession) real).startAssistantActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void startVoiceActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.service.voice.VoiceInteractionSession) real).startVoiceActivity(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterVisibleActivityCallback(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback arg0) {
        ((android.service.voice.VoiceInteractionSession) real).unregisterVisibleActivityCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String KEY_FOREGROUND_ACTIVITIES = android.service.voice.VoiceInteractionSession.KEY_FOREGROUND_ACTIVITIES;
    public static final java.lang.String KEY_SHOW_SESSION_ID = android.service.voice.VoiceInteractionSession.KEY_SHOW_SESSION_ID;
    public static final int SHOW_SOURCE_ACTIVITY = android.service.voice.VoiceInteractionSession.SHOW_SOURCE_ACTIVITY;
    public static final int SHOW_SOURCE_APPLICATION = android.service.voice.VoiceInteractionSession.SHOW_SOURCE_APPLICATION;
    public static final int SHOW_SOURCE_ASSIST_GESTURE = android.service.voice.VoiceInteractionSession.SHOW_SOURCE_ASSIST_GESTURE;
    public static final int SHOW_SOURCE_AUTOMOTIVE_SYSTEM_UI = android.service.voice.VoiceInteractionSession.SHOW_SOURCE_AUTOMOTIVE_SYSTEM_UI;
    public static final int SHOW_SOURCE_NOTIFICATION = android.service.voice.VoiceInteractionSession.SHOW_SOURCE_NOTIFICATION;
    public static final int SHOW_SOURCE_PUSH_TO_TALK = android.service.voice.VoiceInteractionSession.SHOW_SOURCE_PUSH_TO_TALK;
    public static final int SHOW_WITH_ASSIST = android.service.voice.VoiceInteractionSession.SHOW_WITH_ASSIST;
    public static final int SHOW_WITH_SCREENSHOT = android.service.voice.VoiceInteractionSession.SHOW_WITH_SCREENSHOT;

    public static final class AbortVoiceRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AbortVoiceRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AbortVoiceRequest wrap(android.service.voice.VoiceInteractionSession.AbortVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AbortVoiceRequest(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.AbortVoiceRequest getReal() {
            return (android.service.voice.VoiceInteractionSession.AbortVoiceRequest) real;
        }

        public android.service.voice.VoiceInteractionSession.AbortVoiceRequest unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getMessage() {
            return ((android.service.voice.VoiceInteractionSession.AbortVoiceRequest) real).getMessage();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(((android.service.voice.VoiceInteractionSession.AbortVoiceRequest) real).getVoicePrompt());
        }

        public void sendAbortResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.service.voice.VoiceInteractionSession.AbortVoiceRequest) real).sendAbortResult(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class ActivityId {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ActivityId(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId wrap(android.service.voice.VoiceInteractionSession.ActivityId real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.ActivityId getReal() {
            return (android.service.voice.VoiceInteractionSession.ActivityId) real;
        }

        public android.service.voice.VoiceInteractionSession.ActivityId unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.service.voice.VoiceInteractionSession.ActivityId) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.service.voice.VoiceInteractionSession.ActivityId) real).hashCode();
        }

    }
    public static final class AssistState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AssistState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AssistState wrap(android.service.voice.VoiceInteractionSession.AssistState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AssistState(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.AssistState getReal() {
            return (android.service.voice.VoiceInteractionSession.AssistState) real;
        }

        public android.service.voice.VoiceInteractionSession.AssistState unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId getActivityId() {
            return com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId.wrap(((android.service.voice.VoiceInteractionSession.AssistState) real).getActivityId());
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistContent getAssistContent() {
            return com.micklab.dcg.wrapper.android.app.assist.AssistContent.wrap(((android.service.voice.VoiceInteractionSession.AssistState) real).getAssistContent());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getAssistData() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.voice.VoiceInteractionSession.AssistState) real).getAssistData());
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistStructure getAssistStructure() {
            return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.wrap(((android.service.voice.VoiceInteractionSession.AssistState) real).getAssistStructure());
        }

        public int getCount() {
            return ((android.service.voice.VoiceInteractionSession.AssistState) real).getCount();
        }

        public int getIndex() {
            return ((android.service.voice.VoiceInteractionSession.AssistState) real).getIndex();
        }

        public boolean isFocused() {
            return ((android.service.voice.VoiceInteractionSession.AssistState) real).isFocused();
        }

    }
    public static final class CommandRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CommandRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CommandRequest wrap(android.service.voice.VoiceInteractionSession.CommandRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CommandRequest(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.CommandRequest getReal() {
            return (android.service.voice.VoiceInteractionSession.CommandRequest) real;
        }

        public android.service.voice.VoiceInteractionSession.CommandRequest unwrap() {
            return getReal();
        }

        public java.lang.String getCommand() {
            return ((android.service.voice.VoiceInteractionSession.CommandRequest) real).getCommand();
        }

        public void sendIntermediateResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.service.voice.VoiceInteractionSession.CommandRequest) real).sendIntermediateResult(arg0 == null ? null : arg0.getReal());
        }

        public void sendResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.service.voice.VoiceInteractionSession.CommandRequest) real).sendResult(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class CompleteVoiceRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CompleteVoiceRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CompleteVoiceRequest wrap(android.service.voice.VoiceInteractionSession.CompleteVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CompleteVoiceRequest(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.CompleteVoiceRequest getReal() {
            return (android.service.voice.VoiceInteractionSession.CompleteVoiceRequest) real;
        }

        public android.service.voice.VoiceInteractionSession.CompleteVoiceRequest unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getMessage() {
            return ((android.service.voice.VoiceInteractionSession.CompleteVoiceRequest) real).getMessage();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(((android.service.voice.VoiceInteractionSession.CompleteVoiceRequest) real).getVoicePrompt());
        }

        public void sendCompleteResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.service.voice.VoiceInteractionSession.CompleteVoiceRequest) real).sendCompleteResult(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class ConfirmationRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ConfirmationRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ConfirmationRequest wrap(android.service.voice.VoiceInteractionSession.ConfirmationRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ConfirmationRequest(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.ConfirmationRequest getReal() {
            return (android.service.voice.VoiceInteractionSession.ConfirmationRequest) real;
        }

        public android.service.voice.VoiceInteractionSession.ConfirmationRequest unwrap() {
            return getReal();
        }

        public java.lang.CharSequence getPrompt() {
            return ((android.service.voice.VoiceInteractionSession.ConfirmationRequest) real).getPrompt();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(((android.service.voice.VoiceInteractionSession.ConfirmationRequest) real).getVoicePrompt());
        }

        public void sendConfirmationResult(boolean arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.service.voice.VoiceInteractionSession.ConfirmationRequest) real).sendConfirmationResult(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class Insets {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Insets(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Insets wrap(android.service.voice.VoiceInteractionSession.Insets real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Insets(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.Insets getReal() {
            return (android.service.voice.VoiceInteractionSession.Insets) real;
        }

        public android.service.voice.VoiceInteractionSession.Insets unwrap() {
            return getReal();
        }

        public Insets() {
            this(new android.service.voice.VoiceInteractionSession.Insets(), (__DcgwBridgeToken) null);
        }

        public static final int TOUCHABLE_INSETS_CONTENT = android.service.voice.VoiceInteractionSession.Insets.TOUCHABLE_INSETS_CONTENT;
        public static final int TOUCHABLE_INSETS_FRAME = android.service.voice.VoiceInteractionSession.Insets.TOUCHABLE_INSETS_FRAME;
        public static final int TOUCHABLE_INSETS_REGION = android.service.voice.VoiceInteractionSession.Insets.TOUCHABLE_INSETS_REGION;

    }
    public static final class PickOptionRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PickOptionRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.PickOptionRequest wrap(android.service.voice.VoiceInteractionSession.PickOptionRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.PickOptionRequest(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.PickOptionRequest getReal() {
            return (android.service.voice.VoiceInteractionSession.PickOptionRequest) real;
        }

        public android.service.voice.VoiceInteractionSession.PickOptionRequest unwrap() {
            return getReal();
        }

        public android.app.VoiceInteractor.PickOptionRequest.Option[] getOptions() {
            return ((android.service.voice.VoiceInteractionSession.PickOptionRequest) real).getOptions();
        }

        public java.lang.CharSequence getPrompt() {
            return ((android.service.voice.VoiceInteractionSession.PickOptionRequest) real).getPrompt();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(((android.service.voice.VoiceInteractionSession.PickOptionRequest) real).getVoicePrompt());
        }

        public void sendIntermediatePickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.service.voice.VoiceInteractionSession.PickOptionRequest) real).sendIntermediatePickOptionResult(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void sendPickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.service.voice.VoiceInteractionSession.PickOptionRequest) real).sendPickOptionResult(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Request wrap(android.service.voice.VoiceInteractionSession.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Request(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.Request getReal() {
            return (android.service.voice.VoiceInteractionSession.Request) real;
        }

        public android.service.voice.VoiceInteractionSession.Request unwrap() {
            return getReal();
        }

        public void cancel() {
            ((android.service.voice.VoiceInteractionSession.Request) real).cancel();
        }

        public java.lang.String getCallingPackage() {
            return ((android.service.voice.VoiceInteractionSession.Request) real).getCallingPackage();
        }

        public int getCallingUid() {
            return ((android.service.voice.VoiceInteractionSession.Request) real).getCallingUid();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.voice.VoiceInteractionSession.Request) real).getExtras());
        }

        public boolean isActive() {
            return ((android.service.voice.VoiceInteractionSession.Request) real).isActive();
        }

        public java.lang.String toString() {
            return ((android.service.voice.VoiceInteractionSession.Request) real).toString();
        }

    }
    public static final class VisibleActivityCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VisibleActivityCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback wrap(android.service.voice.VoiceInteractionSession.VisibleActivityCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback(real, (__DcgwBridgeToken) null);
        }

        public android.service.voice.VoiceInteractionSession.VisibleActivityCallback getReal() {
            return (android.service.voice.VoiceInteractionSession.VisibleActivityCallback) real;
        }

        public android.service.voice.VoiceInteractionSession.VisibleActivityCallback unwrap() {
            return getReal();
        }

        public void onInvisible(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId arg0) {
            ((android.service.voice.VoiceInteractionSession.VisibleActivityCallback) real).onInvisible(arg0 == null ? null : arg0.getReal());
        }

        public void onVisible(com.micklab.dcg.wrapper.android.service.voice.VisibleActivityInfo arg0) {
            ((android.service.voice.VoiceInteractionSession.VisibleActivityCallback) real).onVisible(arg0 == null ? null : arg0.getReal());
        }

    }
}
