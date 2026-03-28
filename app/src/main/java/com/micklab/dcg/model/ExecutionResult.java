package com.micklab.dcg.model;

public class ExecutionResult {
    private final ExecutionStatus status;
    private final String headline;
    private final String summary;
    private final String details;
    private final long durationMs;

    public ExecutionResult(ExecutionStatus status, String headline, String summary, String details, long durationMs) {
        this.status = status;
        this.headline = headline == null ? "" : headline;
        this.summary = summary == null ? "" : summary;
        this.details = details == null ? "" : details;
        this.durationMs = durationMs;
    }

    public static ExecutionResult idle(String headline, String summary) {
        return new ExecutionResult(ExecutionStatus.IDLE, headline, summary, "", -1L);
    }

    public static ExecutionResult info(String headline, String summary, String details) {
        return new ExecutionResult(ExecutionStatus.INFO, headline, summary, details, -1L);
    }

    public static ExecutionResult success(String headline, String summary, String details, long durationMs) {
        return new ExecutionResult(ExecutionStatus.SUCCESS, headline, summary, details, durationMs);
    }

    public static ExecutionResult compilationError(String headline, String summary, String details, long durationMs) {
        return new ExecutionResult(ExecutionStatus.COMPILATION_ERROR, headline, summary, details, durationMs);
    }

    public static ExecutionResult runtimeError(String headline, String summary, String details, long durationMs) {
        return new ExecutionResult(ExecutionStatus.RUNTIME_ERROR, headline, summary, details, durationMs);
    }

    public static ExecutionResult ioError(String headline, String summary, String details) {
        return new ExecutionResult(ExecutionStatus.IO_ERROR, headline, summary, details, -1L);
    }

    public static ExecutionResult unsupported(String headline, String summary, String details) {
        return new ExecutionResult(ExecutionStatus.UNSUPPORTED, headline, summary, details, -1L);
    }

    public ExecutionStatus getStatus() {
        return status;
    }

    public String getStatusLabel() {
        return status.getLabel();
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary() {
        return summary;
    }

    public String getDetails() {
        return details;
    }

    public long getDurationMs() {
        return durationMs;
    }
}
