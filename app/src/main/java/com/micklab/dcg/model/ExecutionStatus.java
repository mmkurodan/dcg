package com.micklab.dcg.model;

public enum ExecutionStatus {
    IDLE("Idle"),
    INFO("Info"),
    SUCCESS("Success"),
    COMPILATION_ERROR("Compile error"),
    RUNTIME_ERROR("Runtime error"),
    IO_ERROR("Storage error"),
    UNSUPPORTED("Not implemented");

    private final String label;

    ExecutionStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
