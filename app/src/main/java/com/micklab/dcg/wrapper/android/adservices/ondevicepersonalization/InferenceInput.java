// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class InferenceInput {
    private final android.adservices.ondevicepersonalization.InferenceInput real;

    public InferenceInput(android.adservices.ondevicepersonalization.InferenceInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput wrap(android.adservices.ondevicepersonalization.InferenceInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput(real);
    }

    public android.adservices.ondevicepersonalization.InferenceInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getBatchSize() {
        return real.getBatchSize();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput getExpectedOutputStructure() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.wrap(real.getExpectedOutputStructure());
    }

    public java.lang.Object[] getInputData() {
        return real.getInputData();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params getParams() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.wrap(real.getParams());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.InferenceInput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.InferenceInput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder wrap(android.adservices.ondevicepersonalization.InferenceInput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.InferenceInput.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params arg0, java.lang.Object[] arg1, com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput arg2) {
            this(new android.adservices.ondevicepersonalization.InferenceInput.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setBatchSize(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(real.setBatchSize(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setExpectedOutputStructure(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(real.setExpectedOutputStructure(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setInputData(java.lang.Object... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(real.setInputData(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder setParams(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Builder.wrap(real.setParams(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class Params {
        private final android.adservices.ondevicepersonalization.InferenceInput.Params real;

        public Params(android.adservices.ondevicepersonalization.InferenceInput.Params real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params wrap(android.adservices.ondevicepersonalization.InferenceInput.Params real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params(real);
        }

        public android.adservices.ondevicepersonalization.InferenceInput.Params unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int getDelegateType() {
            return real.getDelegateType();
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore getKeyValueStore() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore.wrap(real.getKeyValueStore());
        }

        public java.lang.String getModelKey() {
            return real.getModelKey();
        }

        public int getModelType() {
            return real.getModelType();
        }

        public int getRecommendedNumThreads() {
            return real.getRecommendedNumThreads();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public static final int DELEGATE_CPU = android.adservices.ondevicepersonalization.InferenceInput.Params.DELEGATE_CPU;
        public static final int MODEL_TYPE_TENSORFLOW_LITE = android.adservices.ondevicepersonalization.InferenceInput.Params.MODEL_TYPE_TENSORFLOW_LITE;

        public static final class Builder {
            private final android.adservices.ondevicepersonalization.InferenceInput.Params.Builder real;

            public Builder(android.adservices.ondevicepersonalization.InferenceInput.Params.Builder real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder wrap(android.adservices.ondevicepersonalization.InferenceInput.Params.Builder real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder(real);
            }

            public android.adservices.ondevicepersonalization.InferenceInput.Params.Builder unwrap() {
                return real;
            }

            public Builder(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore arg0, java.lang.String arg1) {
                this(new android.adservices.ondevicepersonalization.InferenceInput.Params.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params build() {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.wrap(real.build());
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setDelegateType(int arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(real.setDelegateType(arg0));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setKeyValueStore(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.KeyValueStore arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(real.setKeyValueStore(arg0 == null ? null : arg0.unwrap()));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setModelKey(java.lang.String arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(real.setModelKey(arg0));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setModelType(int arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(real.setModelType(arg0));
            }

            public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder setRecommendedNumThreads(int arg0) {
                return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceInput.Params.Builder.wrap(real.setRecommendedNumThreads(arg0));
            }

        }
    }
}
