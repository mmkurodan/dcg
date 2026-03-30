// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VoiceInteractionSession {
    private final android.service.voice.VoiceInteractionSession real;

    public VoiceInteractionSession(android.service.voice.VoiceInteractionSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession wrap(android.service.voice.VoiceInteractionSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession(real);
    }

    public android.service.voice.VoiceInteractionSession unwrap() {
        return real;
    }

    public VoiceInteractionSession(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.service.voice.VoiceInteractionSession(arg0 == null ? null : arg0.unwrap()));
    }

    public VoiceInteractionSession(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        this(new android.service.voice.VoiceInteractionSession(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void closeSystemDialogs() {
        real.closeSystemDialogs();
    }

    public void dump(java.lang.String arg0, java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String[] arg3) {
        real.dump(arg0, arg1, arg2, arg3);
    }

    public void finish() {
        real.finish();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public int getDisabledShowContext() {
        return real.getDisabledShowContext();
    }

    public com.micklab.dcg.wrapper.android.view.LayoutInflater getLayoutInflater() {
        return com.micklab.dcg.wrapper.android.view.LayoutInflater.wrap(real.getLayoutInflater());
    }

    public int getUserDisabledShowContext() {
        return real.getUserDisabledShowContext();
    }

    public com.micklab.dcg.wrapper.android.app.Dialog getWindow() {
        return com.micklab.dcg.wrapper.android.app.Dialog.wrap(real.getWindow());
    }

    public void hide() {
        real.hide();
    }

    public void onAssistStructureFailure(java.lang.Throwable arg0) {
        real.onAssistStructureFailure(arg0);
    }

    public void onBackPressed() {
        real.onBackPressed();
    }

    public void onCancelRequest(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Request arg0) {
        real.onCancelRequest(arg0 == null ? null : arg0.unwrap());
    }

    public void onCloseSystemDialogs() {
        real.onCloseSystemDialogs();
    }

    public void onComputeInsets(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Insets arg0) {
        real.onComputeInsets(arg0 == null ? null : arg0.unwrap());
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreate() {
        real.onCreate();
    }

    public com.micklab.dcg.wrapper.android.view.View onCreateContentView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateContentView());
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onDirectActionsInvalidated(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId arg0) {
        real.onDirectActionsInvalidated(arg0 == null ? null : arg0.unwrap());
    }

    public boolean[] onGetSupportedCommands(java.lang.String[] arg0) {
        return real.onGetSupportedCommands(arg0);
    }

    public void onHandleAssist(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AssistState arg0) {
        real.onHandleAssist(arg0 == null ? null : arg0.unwrap());
    }

    public void onHandleAssist(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.app.assist.AssistStructure arg1, com.micklab.dcg.wrapper.android.app.assist.AssistContent arg2) {
        real.onHandleAssist(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onHandleAssistSecondary(com.micklab.dcg.wrapper.android.os.Bundle arg0, com.micklab.dcg.wrapper.android.app.assist.AssistStructure arg1, com.micklab.dcg.wrapper.android.app.assist.AssistContent arg2, int arg3, int arg4) {
        real.onHandleAssistSecondary(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4);
    }

    public void onHandleScreenshot(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        real.onHandleScreenshot(arg0 == null ? null : arg0.unwrap());
    }

    public void onHide() {
        real.onHide();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyLongPress(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
        return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onLockscreenShown() {
        real.onLockscreenShown();
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public void onPrepareShow(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        real.onPrepareShow(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onRequestAbortVoice(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AbortVoiceRequest arg0) {
        real.onRequestAbortVoice(arg0 == null ? null : arg0.unwrap());
    }

    public void onRequestCommand(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CommandRequest arg0) {
        real.onRequestCommand(arg0 == null ? null : arg0.unwrap());
    }

    public void onRequestCompleteVoice(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CompleteVoiceRequest arg0) {
        real.onRequestCompleteVoice(arg0 == null ? null : arg0.unwrap());
    }

    public void onRequestConfirmation(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ConfirmationRequest arg0) {
        real.onRequestConfirmation(arg0 == null ? null : arg0.unwrap());
    }

    public void onRequestPickOption(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.PickOptionRequest arg0) {
        real.onRequestPickOption(arg0 == null ? null : arg0.unwrap());
    }

    public void onShow(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        real.onShow(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onTaskFinished(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.onTaskFinished(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onTaskStarted(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.onTaskStarted(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public void registerVisibleActivityCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback arg1) {
        real.registerVisibleActivityCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setContentView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setContentView(arg0 == null ? null : arg0.unwrap());
    }

    public void setDisabledShowContext(int arg0) {
        real.setDisabledShowContext(arg0);
    }

    public void setKeepAwake(boolean arg0) {
        real.setKeepAwake(arg0);
    }

    public void setTheme(int arg0) {
        real.setTheme(arg0);
    }

    public void setUiEnabled(boolean arg0) {
        real.setUiEnabled(arg0);
    }

    public void show(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        real.show(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void startAssistantActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.startAssistantActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void startAssistantActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startAssistantActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void startVoiceActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.startVoiceActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterVisibleActivityCallback(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback arg0) {
        real.unregisterVisibleActivityCallback(arg0 == null ? null : arg0.unwrap());
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
        private final android.service.voice.VoiceInteractionSession.AbortVoiceRequest real;

        public AbortVoiceRequest(android.service.voice.VoiceInteractionSession.AbortVoiceRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AbortVoiceRequest wrap(android.service.voice.VoiceInteractionSession.AbortVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AbortVoiceRequest(real);
        }

        public android.service.voice.VoiceInteractionSession.AbortVoiceRequest unwrap() {
            return real;
        }

        public java.lang.CharSequence getMessage() {
            return real.getMessage();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(real.getVoicePrompt());
        }

        public void sendAbortResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.sendAbortResult(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class ActivityId {
        private final android.service.voice.VoiceInteractionSession.ActivityId real;

        public ActivityId(android.service.voice.VoiceInteractionSession.ActivityId real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId wrap(android.service.voice.VoiceInteractionSession.ActivityId real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId(real);
        }

        public android.service.voice.VoiceInteractionSession.ActivityId unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
    public static final class AssistState {
        private final android.service.voice.VoiceInteractionSession.AssistState real;

        public AssistState(android.service.voice.VoiceInteractionSession.AssistState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AssistState wrap(android.service.voice.VoiceInteractionSession.AssistState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.AssistState(real);
        }

        public android.service.voice.VoiceInteractionSession.AssistState unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId getActivityId() {
            return com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId.wrap(real.getActivityId());
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistContent getAssistContent() {
            return com.micklab.dcg.wrapper.android.app.assist.AssistContent.wrap(real.getAssistContent());
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getAssistData() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getAssistData());
        }

        public com.micklab.dcg.wrapper.android.app.assist.AssistStructure getAssistStructure() {
            return com.micklab.dcg.wrapper.android.app.assist.AssistStructure.wrap(real.getAssistStructure());
        }

        public int getCount() {
            return real.getCount();
        }

        public int getIndex() {
            return real.getIndex();
        }

        public boolean isFocused() {
            return real.isFocused();
        }

    }
    public static final class CommandRequest {
        private final android.service.voice.VoiceInteractionSession.CommandRequest real;

        public CommandRequest(android.service.voice.VoiceInteractionSession.CommandRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CommandRequest wrap(android.service.voice.VoiceInteractionSession.CommandRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CommandRequest(real);
        }

        public android.service.voice.VoiceInteractionSession.CommandRequest unwrap() {
            return real;
        }

        public java.lang.String getCommand() {
            return real.getCommand();
        }

        public void sendIntermediateResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.sendIntermediateResult(arg0 == null ? null : arg0.unwrap());
        }

        public void sendResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.sendResult(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class CompleteVoiceRequest {
        private final android.service.voice.VoiceInteractionSession.CompleteVoiceRequest real;

        public CompleteVoiceRequest(android.service.voice.VoiceInteractionSession.CompleteVoiceRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CompleteVoiceRequest wrap(android.service.voice.VoiceInteractionSession.CompleteVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.CompleteVoiceRequest(real);
        }

        public android.service.voice.VoiceInteractionSession.CompleteVoiceRequest unwrap() {
            return real;
        }

        public java.lang.CharSequence getMessage() {
            return real.getMessage();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(real.getVoicePrompt());
        }

        public void sendCompleteResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.sendCompleteResult(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class ConfirmationRequest {
        private final android.service.voice.VoiceInteractionSession.ConfirmationRequest real;

        public ConfirmationRequest(android.service.voice.VoiceInteractionSession.ConfirmationRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ConfirmationRequest wrap(android.service.voice.VoiceInteractionSession.ConfirmationRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ConfirmationRequest(real);
        }

        public android.service.voice.VoiceInteractionSession.ConfirmationRequest unwrap() {
            return real;
        }

        public java.lang.CharSequence getPrompt() {
            return real.getPrompt();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(real.getVoicePrompt());
        }

        public void sendConfirmationResult(boolean arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.sendConfirmationResult(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class Insets {
        private final android.service.voice.VoiceInteractionSession.Insets real;

        public Insets(android.service.voice.VoiceInteractionSession.Insets real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Insets wrap(android.service.voice.VoiceInteractionSession.Insets real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Insets(real);
        }

        public android.service.voice.VoiceInteractionSession.Insets unwrap() {
            return real;
        }

        public Insets() {
            this(new android.service.voice.VoiceInteractionSession.Insets());
        }

        public static final int TOUCHABLE_INSETS_CONTENT = android.service.voice.VoiceInteractionSession.Insets.TOUCHABLE_INSETS_CONTENT;
        public static final int TOUCHABLE_INSETS_FRAME = android.service.voice.VoiceInteractionSession.Insets.TOUCHABLE_INSETS_FRAME;
        public static final int TOUCHABLE_INSETS_REGION = android.service.voice.VoiceInteractionSession.Insets.TOUCHABLE_INSETS_REGION;

    }
    public static final class PickOptionRequest {
        private final android.service.voice.VoiceInteractionSession.PickOptionRequest real;

        public PickOptionRequest(android.service.voice.VoiceInteractionSession.PickOptionRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.PickOptionRequest wrap(android.service.voice.VoiceInteractionSession.PickOptionRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.PickOptionRequest(real);
        }

        public android.service.voice.VoiceInteractionSession.PickOptionRequest unwrap() {
            return real;
        }

        public android.app.VoiceInteractor.PickOptionRequest.Option[] getOptions() {
            return real.getOptions();
        }

        public java.lang.CharSequence getPrompt() {
            return real.getPrompt();
        }

        public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt getVoicePrompt() {
            return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt.wrap(real.getVoicePrompt());
        }

        public void sendIntermediatePickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.sendIntermediatePickOptionResult(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void sendPickOptionResult(android.app.VoiceInteractor.PickOptionRequest.Option[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.sendPickOptionResult(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class Request {
        private final android.service.voice.VoiceInteractionSession.Request real;

        public Request(android.service.voice.VoiceInteractionSession.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Request wrap(android.service.voice.VoiceInteractionSession.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.Request(real);
        }

        public android.service.voice.VoiceInteractionSession.Request unwrap() {
            return real;
        }

        public void cancel() {
            real.cancel();
        }

        public java.lang.String getCallingPackage() {
            return real.getCallingPackage();
        }

        public int getCallingUid() {
            return real.getCallingUid();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public boolean isActive() {
            return real.isActive();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class VisibleActivityCallback {
        private final android.service.voice.VoiceInteractionSession.VisibleActivityCallback real;

        public VisibleActivityCallback(android.service.voice.VoiceInteractionSession.VisibleActivityCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback wrap(android.service.voice.VoiceInteractionSession.VisibleActivityCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.VisibleActivityCallback(real);
        }

        public android.service.voice.VoiceInteractionSession.VisibleActivityCallback unwrap() {
            return real;
        }

        public void onInvisible(com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.ActivityId arg0) {
            real.onInvisible(arg0 == null ? null : arg0.unwrap());
        }

        public void onVisible(com.micklab.dcg.wrapper.android.service.voice.VisibleActivityInfo arg0) {
            real.onVisible(arg0 == null ? null : arg0.unwrap());
        }

    }
}
