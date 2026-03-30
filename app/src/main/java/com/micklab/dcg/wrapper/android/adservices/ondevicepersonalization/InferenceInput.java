// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class InferenceInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InferenceInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput wrap(android.adservices.ondevicepersonalization.InferenceInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.InferenceInput getReal() {
        return (android.adservices.ondevicepersonalization.InferenceInput) real;
    }

    public android.adservices.ondevicepersonalization.InferenceInput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.InferenceInput) real).equals(arg0);
    }

    public int getBatchSize() {
        return ((android.adservices.ondevicepersonalization.InferenceInput) real).getBatchSize();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput getExpectedOutputStructure() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.wrap(((android.adservices.ondevicepersonalization.InferenceInput) real).getExpectedOutputStructure());
    }

    public java.lang.Object[] getInputData() {
        return ((android.adservices.ondevicepersonalization.InferenceInput) real).getInputData();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params getParams() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.wrap(((android.adservices.ondevicepersonalization.InferenceInput) real).getParams());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.InferenceInput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder wrap(android.adservices.ondevicepersonalization.InferenceInput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.InferenceInput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.InferenceInput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.InferenceInput.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params arg0, java.lang.Object[] arg1, com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput arg2) {
            this(new android.adservices.ondevicepersonalization.InferenceInput.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setBatchSize(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Builder) real).setBatchSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setExpectedOutputStructure(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Builder) real).setExpectedOutputStructure(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setInputData(java.lang.Object... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Builder) real).setInputData(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setParams(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Builder) real).setParams(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class Params {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Params(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params wrap(android.adservices.ondevicepersonalization.InferenceInput.Params real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.InferenceInput.Params getReal() {
            return (android.adservices.ondevicepersonalization.InferenceInput.Params) real;
        }

        public android.adservices.ondevicepersonalization.InferenceInput.Params unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.adservices.ondevicepersonalization.InferenceInput.Params) real).equals(arg0);
        }

        public int getDelegateType() {
            return ((android.adservices.ondevicepersonalization.InferenceInput.Params) real).getDelegateType();
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore getKeyValueStore() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params) real).getKeyValueStore());
        }

        public java.lang.String getModelKey() {
            return ((android.adservices.ondevicepersonalization.InferenceInput.Params) real).getModelKey();
        }

        public int getModelType() {
            return ((android.adservices.ondevicepersonalization.InferenceInput.Params) real).getModelType();
        }

        public int getRecommendedNumThreads() {
            return ((android.adservices.ondevicepersonalization.InferenceInput.Params) real).getRecommendedNumThreads();
        }

        public int hashCode() {
            return ((android.adservices.ondevicepersonalization.InferenceInput.Params) real).hashCode();
        }

        public static final int DELEGATE_CPU = android.adservices.ondevicepersonalization.InferenceInput.Params.DELEGATE_CPU;
        public static final int MODEL_TYPE_TENSORFLOW_LITE = android.adservices.ondevicepersonalization.InferenceInput.Params.MODEL_TYPE_TENSORFLOW_LITE;

        public static final class Builder {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private Builder(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder wrap(android.adservices.ondevicepersonalization.InferenceInput.Params.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder(real, (__DcgwBridgeToken) null);
            }

            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder getReal() {
                return (android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real;
            }

            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder unwrap() {
                return getReal();
            }

            public Builder(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore arg0, java.lang.String arg1) {
                this(new android.adservices.ondevicepersonalization.InferenceInput.Params.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params build() {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real).build());
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setDelegateType(int arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real).setDelegateType(arg0));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setKeyValueStore(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real).setKeyValueStore(arg0 == null ? null : arg0.getReal()));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setModelKey(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real).setModelKey(arg0));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setModelType(int arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real).setModelType(arg0));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setRecommendedNumThreads(int arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceInput.Params.Builder) real).setRecommendedNumThreads(arg0));
            }

        }
    }
}
