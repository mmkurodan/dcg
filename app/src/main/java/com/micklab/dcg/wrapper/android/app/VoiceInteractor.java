// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class VoiceInteractor {
    private final android.app.VoiceInteractor real;

    public VoiceInteractor(android.app.VoiceInteractor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.VoiceInteractor wrap(android.app.VoiceInteractor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor(real);
    }

    public android.app.VoiceInteractor unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request getActiveRequest(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request.wrap(real.getActiveRequest(arg0));
    }

    public android.app.VoiceInteractor.Request[] getActiveRequests() {
        return real.getActiveRequests();
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public boolean isDestroyed() {
        return real.isDestroyed();
    }

    public void notifyDirectActionsChanged() {
        real.notifyDirectActionsChanged();
    }

    public boolean registerOnDestroyedCallback(java.util.concurrent.Executor arg0, java.lang.Runnable arg1) {
        return real.registerOnDestroyedCallback(arg0, arg1);
    }

    public boolean submitRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request arg0) {
        return real.submitRequest(arg0 == null ? null : arg0.unwrap());
    }

    public boolean submitRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request arg0, java.lang.String arg1) {
        return real.submitRequest(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean[] supportsCommands(java.lang.String[] arg0) {
        return real.supportsCommands(arg0);
    }

    public boolean unregisterOnDestroyedCallback(java.lang.Runnable arg0) {
        return real.unregisterOnDestroyedCallback(arg0);
    }

    public static final class AbortVoiceRequest {
        private final android.app.VoiceInteractor.AbortVoiceRequest real;

        public AbortVoiceRequest(android.app.VoiceInteractor.AbortVoiceRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.AbortVoiceRequest wrap(android.app.VoiceInteractor.AbortVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.AbortVoiceRequest(real);
        }

        public android.app.VoiceInteractor.AbortVoiceRequest unwrap() {
            return real;
        }

        public AbortVoiceRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.AbortVoiceRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public void onAbortResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.onAbortResult(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class CommandRequest {
        private final android.app.VoiceInteractor.CommandRequest real;

        public CommandRequest(android.app.VoiceInteractor.CommandRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.CommandRequest wrap(android.app.VoiceInteractor.CommandRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.CommandRequest(real);
        }

        public android.app.VoiceInteractor.CommandRequest unwrap() {
            return real;
        }

        public CommandRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.CommandRequest(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public void onCommandResult(boolean arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onCommandResult(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class CompleteVoiceRequest {
        private final android.app.VoiceInteractor.CompleteVoiceRequest real;

        public CompleteVoiceRequest(android.app.VoiceInteractor.CompleteVoiceRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.CompleteVoiceRequest wrap(android.app.VoiceInteractor.CompleteVoiceRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.CompleteVoiceRequest(real);
        }

        public android.app.VoiceInteractor.CompleteVoiceRequest unwrap() {
            return real;
        }

        public CompleteVoiceRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.CompleteVoiceRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public void onCompleteResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.onCompleteResult(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class ConfirmationRequest {
        private final android.app.VoiceInteractor.ConfirmationRequest real;

        public ConfirmationRequest(android.app.VoiceInteractor.ConfirmationRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.ConfirmationRequest wrap(android.app.VoiceInteractor.ConfirmationRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.ConfirmationRequest(real);
        }

        public android.app.VoiceInteractor.ConfirmationRequest unwrap() {
            return real;
        }

        public ConfirmationRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.app.VoiceInteractor.ConfirmationRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public void onConfirmationResult(boolean arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onConfirmationResult(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class PickOptionRequest {
        private final android.app.VoiceInteractor.PickOptionRequest real;

        public PickOptionRequest(android.app.VoiceInteractor.PickOptionRequest real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest wrap(android.app.VoiceInteractor.PickOptionRequest real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest(real);
        }

        public android.app.VoiceInteractor.PickOptionRequest unwrap() {
            return real;
        }

        public PickOptionRequest(com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt arg0, android.app.VoiceInteractor.PickOptionRequest.Option[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            this(new android.app.VoiceInteractor.PickOptionRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public void onPickOptionResult(boolean arg0, android.app.VoiceInteractor.PickOptionRequest.Option[] arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onPickOptionResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public static final class Option {
            private final android.app.VoiceInteractor.PickOptionRequest.Option real;

            public Option(android.app.VoiceInteractor.PickOptionRequest.Option real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option wrap(android.app.VoiceInteractor.PickOptionRequest.Option real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option(real);
            }

            public android.app.VoiceInteractor.PickOptionRequest.Option unwrap() {
                return real;
            }

            public Option(java.lang.CharSequence arg0, int arg1) {
                this(new android.app.VoiceInteractor.PickOptionRequest.Option(arg0, arg1));
            }

            public com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option addSynonym(java.lang.CharSequence arg0) {
                return com.micklab.dcg.wrapper.android.app.VoiceInteractor.PickOptionRequest.Option.wrap(real.addSynonym(arg0));
            }

            public int countSynonyms() {
                return real.countSynonyms();
            }

            public int describeContents() {
                return real.describeContents();
            }

            public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
                return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
            }

            public int getIndex() {
                return real.getIndex();
            }

            public java.lang.CharSequence getLabel() {
                return real.getLabel();
            }

            public java.lang.CharSequence getSynonymAt(int arg0) {
                return real.getSynonymAt(arg0);
            }

            public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
                real.setExtras(arg0 == null ? null : arg0.unwrap());
            }

            public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
                real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
            }


        }
    }
    public static final class Prompt {
        private final android.app.VoiceInteractor.Prompt real;

        public Prompt(android.app.VoiceInteractor.Prompt real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt wrap(android.app.VoiceInteractor.Prompt real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.Prompt(real);
        }

        public android.app.VoiceInteractor.Prompt unwrap() {
            return real;
        }

        public Prompt(java.lang.CharSequence arg0) {
            this(new android.app.VoiceInteractor.Prompt(arg0));
        }

        public Prompt(java.lang.CharSequence[] arg0, java.lang.CharSequence arg1) {
            this(new android.app.VoiceInteractor.Prompt(arg0, arg1));
        }

        public int countVoicePrompts() {
            return real.countVoicePrompts();
        }

        public int describeContents() {
            return real.describeContents();
        }

        public java.lang.CharSequence getVisualPrompt() {
            return real.getVisualPrompt();
        }

        public java.lang.CharSequence getVoicePromptAt(int arg0) {
            return real.getVoicePromptAt(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
    public static final class Request {
        private final android.app.VoiceInteractor.Request real;

        public Request(android.app.VoiceInteractor.Request real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request wrap(android.app.VoiceInteractor.Request real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.VoiceInteractor.Request(real);
        }

        public android.app.VoiceInteractor.Request unwrap() {
            return real;
        }

        public void cancel() {
            real.cancel();
        }

        public com.micklab.dcg.wrapper.android.app.Activity getActivity() {
            return com.micklab.dcg.wrapper.android.app.Activity.wrap(real.getActivity());
        }

        public com.micklab.dcg.wrapper.android.content.Context getContext() {
            return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
        }

        public java.lang.String getName() {
            return real.getName();
        }

        public void onAttached(com.micklab.dcg.wrapper.android.app.Activity arg0) {
            real.onAttached(arg0 == null ? null : arg0.unwrap());
        }

        public void onCancel() {
            real.onCancel();
        }

        public void onDetached() {
            real.onDetached();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
