// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class RecommendedStreamConfigurationMap {
    private final android.hardware.camera2.params.RecommendedStreamConfigurationMap real;

    public RecommendedStreamConfigurationMap(android.hardware.camera2.params.RecommendedStreamConfigurationMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap wrap(android.hardware.camera2.params.RecommendedStreamConfigurationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.RecommendedStreamConfigurationMap(real);
    }

    public android.hardware.camera2.params.RecommendedStreamConfigurationMap unwrap() {
        return real;
    }

    public long getOutputMinFrameDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return real.getOutputMinFrameDuration(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public long getOutputStallDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return real.getOutputStallDuration(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int getRecommendedUseCase() {
        return real.getRecommendedUseCase();
    }

    public boolean isOutputSupportedFor(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return real.isOutputSupportedFor(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isOutputSupportedFor(int arg0) {
        return real.isOutputSupportedFor(arg0);
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
