// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class VoiceInteractor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VoiceInteractor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.VoiceInteractor wrap(android.app.VoiceInteractor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor(real, (__DcgwBridgeToken) null);
    }

    public android.app.VoiceInteractor getReal() {
        return (android.app.VoiceInteractor) real;
    }

    public android.app.VoiceInteractor unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request getActiveRequest(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request.wrap(((android.app.VoiceInteractor) real).getActiveRequest(arg0));
    }

    public android.app.VoiceInteractor.Request[] getActiveRequests() {
        return ((android.app.VoiceInteractor) real).getActiveRequests();
    }

    public java.lang.String getPackageName() {
        return ((android.app.VoiceInteractor) real).getPackageName();
    }

    public boolean isDestroyed() {
        return ((android.app.VoiceInteractor) real).isDestroyed();
    }

    public void notifyDirectActionsChanged() {
        ((android.app.VoiceInteractor) real).notifyDirectActionsChanged();
    }

    public boolean registerOnDestroyedCallback(java.util.concurrent.Executor arg0, java.lang.Runnable arg1) {
        return ((android.app.VoiceInteractor) real).registerOnDestroyedCallback(arg0, arg1);
    }

    public boolean submitRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request arg0) {
        return ((android.app.VoiceInteractor) real).submitRequest(arg0 == null ? null : arg0.getReal());
    }

    public boolean submitRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request arg0, java.lang.String arg1) {
        return ((android.app.VoiceInteractor) real).submitRequest(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean[] supportsCommands(java.lang.String[] arg0) {
        return ((android.app.VoiceInteractor) real).supportsCommands(arg0);
    }

    public boolean unregisterOnDestroyedCallback(java.lang.Runnable arg0) {
        return ((android.app.VoiceInteractor) real).unregisterOnDestroyedCallback(arg0);
    }

    public static final class AbortVoiceRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AbortVoiceRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.AbortVoiceRequest wrap(android.app.VoiceInteractor.AbortVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.AbortVoiceRequest(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.AbortVoiceRequest getReal() {
            return (android.app.VoiceInteractor.AbortVoiceRequest) real;
        }

        public android.app.VoiceInteractor.AbortVoiceRequest unwrap() {
            return getReal();
        }

        public AbortVoiceRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.AbortVoiceRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public void onAbortResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.app.VoiceInteractor.AbortVoiceRequest) real).onAbortResult(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class CommandRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CommandRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.CommandRequest wrap(android.app.VoiceInteractor.CommandRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.CommandRequest(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.CommandRequest getReal() {
            return (android.app.VoiceInteractor.CommandRequest) real;
        }

        public android.app.VoiceInteractor.CommandRequest unwrap() {
            return getReal();
        }

        public CommandRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.CommandRequest(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public void onCommandResult(boolean arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.VoiceInteractor.CommandRequest) real).onCommandResult(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class CompleteVoiceRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CompleteVoiceRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.CompleteVoiceRequest wrap(android.app.VoiceInteractor.CompleteVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.CompleteVoiceRequest(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.CompleteVoiceRequest getReal() {
            return (android.app.VoiceInteractor.CompleteVoiceRequest) real;
        }

        public android.app.VoiceInteractor.CompleteVoiceRequest unwrap() {
            return getReal();
        }

        public CompleteVoiceRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.CompleteVoiceRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public void onCompleteResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.app.VoiceInteractor.CompleteVoiceRequest) real).onCompleteResult(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class ConfirmationRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ConfirmationRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.ConfirmationRequest wrap(android.app.VoiceInteractor.ConfirmationRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.ConfirmationRequest(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.ConfirmationRequest getReal() {
            return (android.app.VoiceInteractor.ConfirmationRequest) real;
        }

        public android.app.VoiceInteractor.ConfirmationRequest unwrap() {
            return getReal();
        }

        public ConfirmationRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.ConfirmationRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public void onConfirmationResult(boolean arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.app.VoiceInteractor.ConfirmationRequest) real).onConfirmationResult(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class PickOptionRequest {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PickOptionRequest(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest wrap(android.app.VoiceInteractor.PickOptionRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.PickOptionRequest getReal() {
            return (android.app.VoiceInteractor.PickOptionRequest) real;
        }

        public android.app.VoiceInteractor.PickOptionRequest unwrap() {
            return getReal();
        }

        public PickOptionRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, android.app.VoiceInteractor.PickOptionRequest.Option[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            this(new android.app.VoiceInteractor.PickOptionRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public void onPickOptionResult(boolean arg0, android.app.VoiceInteractor.PickOptionRequest.Option[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.app.VoiceInteractor.PickOptionRequest) real).onPickOptionResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public static final class Option {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Option(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option wrap(android.app.VoiceInteractor.PickOptionRequest.Option real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option(real, (__DcgwBridgeToken) null);
            }

            public android.app.VoiceInteractor.PickOptionRequest.Option getReal() {
                return (android.app.VoiceInteractor.PickOptionRequest.Option) real;
            }

            public android.app.VoiceInteractor.PickOptionRequest.Option unwrap() {
                return getReal();
            }

            public Option(java.lang.CharSequence arg0, int arg1) {
                this(new android.app.VoiceInteractor.PickOptionRequest.Option(arg0, arg1), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option addSynonym(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option.wrap(((android.app.VoiceInteractor.PickOptionRequest.Option) real).addSynonym(arg0));
            }

            public int countSynonyms() {
                return ((android.app.VoiceInteractor.PickOptionRequest.Option) real).countSynonyms();
            }

            public int describeContents() {
                return ((android.app.VoiceInteractor.PickOptionRequest.Option) real).describeContents();
            }

            public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
                return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.app.VoiceInteractor.PickOptionRequest.Option) real).getExtras());
            }

            public int getIndex() {
                return ((android.app.VoiceInteractor.PickOptionRequest.Option) real).getIndex();
            }

            public java.lang.CharSequence getLabel() {
                return ((android.app.VoiceInteractor.PickOptionRequest.Option) real).getLabel();
            }

            public java.lang.CharSequence getSynonymAt(int arg0) {
                return ((android.app.VoiceInteractor.PickOptionRequest.Option) real).getSynonymAt(arg0);
            }

            public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                ((android.app.VoiceInteractor.PickOptionRequest.Option) real).setExtras(arg0 == null ? null : arg0.getReal());
            }

            public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
                ((android.app.VoiceInteractor.PickOptionRequest.Option) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
            }


        }
    }
    public static final class Prompt {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Prompt(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt wrap(android.app.VoiceInteractor.Prompt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.Prompt getReal() {
            return (android.app.VoiceInteractor.Prompt) real;
        }

        public android.app.VoiceInteractor.Prompt unwrap() {
            return getReal();
        }

        public Prompt(java.lang.CharSequence arg0) {
            this(new android.app.VoiceInteractor.Prompt(arg0), (__DcgwBridgeToken) null);
        }

        public Prompt(java.lang.CharSequence[] arg0, java.lang.CharSequence arg1) {
            this(new android.app.VoiceInteractor.Prompt(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int countVoicePrompts() {
            return ((android.app.VoiceInteractor.Prompt) real).countVoicePrompts();
        }

        public int describeContents() {
            return ((android.app.VoiceInteractor.Prompt) real).describeContents();
        }

        public java.lang.CharSequence getVisualPrompt() {
            return ((android.app.VoiceInteractor.Prompt) real).getVisualPrompt();
        }

        public java.lang.CharSequence getVoicePromptAt(int arg0) {
            return ((android.app.VoiceInteractor.Prompt) real).getVoicePromptAt(arg0);
        }

        public java.lang.String toString() {
            return ((android.app.VoiceInteractor.Prompt) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.app.VoiceInteractor.Prompt) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
    public static final class Request {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Request(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request wrap(android.app.VoiceInteractor.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request(real, (__DcgwBridgeToken) null);
        }

        public android.app.VoiceInteractor.Request getReal() {
            return (android.app.VoiceInteractor.Request) real;
        }

        public android.app.VoiceInteractor.Request unwrap() {
            return getReal();
        }

        public void cancel() {
            ((android.app.VoiceInteractor.Request) real).cancel();
        }

        public com.micklab.dcg.wrapper.android.app.Activity getActivity() {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(((android.app.VoiceInteractor.Request) real).getActivity());
        }

        public com.micklab.dcg.wrapper.android.content.Context getContext() {
            return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.app.VoiceInteractor.Request) real).getContext());
        }

        public java.lang.String getName() {
            return ((android.app.VoiceInteractor.Request) real).getName();
        }

        public void onAttached(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            ((android.app.VoiceInteractor.Request) real).onAttached(arg0 == null ? null : arg0.getReal());
        }

        public void onCancel() {
            ((android.app.VoiceInteractor.Request) real).onCancel();
        }

        public void onDetached() {
            ((android.app.VoiceInteractor.Request) real).onDetached();
        }

        public java.lang.String toString() {
            return ((android.app.VoiceInteractor.Request) real).toString();
        }

    }
}
