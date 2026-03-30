// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class RecommendedStreamConfigurationMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecommendedStreamConfigurationMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap wrap(android.hardware.camera2.params.RecommendedStreamConfigurationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.RecommendedStreamConfigurationMap getReal() {
        return (android.hardware.camera2.params.RecommendedStreamConfigurationMap) real;
    }

    public android.hardware.camera2.params.RecommendedStreamConfigurationMap unwrap() {
        return getReal();
    }

    public long getOutputMinFrameDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return ((android.hardware.camera2.params.RecommendedStreamConfigurationMap) real).getOutputMinFrameDuration(arg0, arg1 == null ? null : arg1.getReal());
    }

    public long getOutputStallDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return ((android.hardware.camera2.params.RecommendedStreamConfigurationMap) real).getOutputStallDuration(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int getRecommendedUseCase() {
        return ((android.hardware.camera2.params.RecommendedStreamConfigurationMap) real).getRecommendedUseCase();
    }

    public boolean isOutputSupportedFor(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return ((android.hardware.camera2.params.RecommendedStreamConfigurationMap) real).isOutputSupportedFor(arg0 == null ? null : arg0.getReal());
    }

    public boolean isOutputSupportedFor(int arg0) {
        return ((android.hardware.camera2.params.RecommendedStreamConfigurationMap) real).isOutputSupportedFor(arg0);
    }

    public static final int USECASE_10BIT_OUTPUT = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_10BIT_OUTPUT;
    public static final int USECASE_LOW_LATENCY_SNAPSHOT = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_LOW_LATENCY_SNAPSHOT;
    public static final int USECASE_PREVIEW = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_PREVIEW;
    public static final int USECASE_RAW = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_RAW;
    public static final int USECASE_RECORD = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_RECORD;
    public static final int USECASE_SNAPSHOT = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_SNAPSHOT;
    public static final int USECASE_VIDEO_SNAPSHOT = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_VIDEO_SNAPSHOT;
    public static final int USECASE_ZSL = android.hardware.camera2.params.RecommendedStreamConfigurationMap.USECASE_ZSL;

}
