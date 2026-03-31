package com.micklab.dcg.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutionResult {
    private final ExecutionStatus status;
    private final String headline;
    private final String summary;
    private final String stdout;
    private final String returnValue;
    private final String error;
    private final String details;
    private final long durationMs;
    private final List<ExecutionOutputItem> outputItems;
    private final String outputModelJson;

    public ExecutionResult(ExecutionStatus status, String headline, String summary, String stdout, String returnValue, String error, String details, long durationMs) {
        this(status, headline, summary, stdout, returnValue, error, details, durationMs, Collections.emptyList(), "");
    }

    public ExecutionResult(
            ExecutionStatus status,
            String headline,
            String summary,
            String stdout,
            String returnValue,
            String error,
            String details,
            long durationMs,
            List<ExecutionOutputItem> outputItems,
            String outputModelJson) {
        this.status = status;
        this.headline = headline == null ? "" : headline;
        this.summary = summary == null ? "" : summary;
        this.stdout = stdout == null ? "" : stdout;
        this.returnValue = returnValue == null ? "" : returnValue;
        this.error = error == null ? "" : error;
        this.details = details == null ? "" : details;
        this.durationMs = durationMs;
        this.outputItems = outputItems == null
                ? Collections.emptyList()
                : Collections.unmodifiableList(new ArrayList<>(outputItems));
        this.outputModelJson = outputModelJson == null ? "" : outputModelJson;
    }

    public static ExecutionResult idle(String headline, String summary) {
        return new ExecutionResult(ExecutionStatus.IDLE, headline, summary, "", "", "", "", -1L);
    }

    public static ExecutionResult info(String headline, String summary, String details) {
        return new ExecutionResult(ExecutionStatus.INFO, headline, summary, "", "", "", details, -1L);
    }

    public static ExecutionResult success(String headline, String summary, String stdout, String returnValue, String error, String details, long durationMs) {
        return new ExecutionResult(ExecutionStatus.SUCCESS, headline, summary, stdout, returnValue, error, details, durationMs);
    }

    public static ExecutionResult compilationError(String headline, String summary, String error, String details, long durationMs) {
        return new ExecutionResult(ExecutionStatus.COMPILATION_ERROR, headline, summary, "", "", error, details, durationMs);
    }

    public static ExecutionResult runtimeError(String headline, String summary, String stdout, String error, String details, long durationMs) {
        return new ExecutionResult(ExecutionStatus.RUNTIME_ERROR, headline, summary, stdout, "", error, details, durationMs);
    }

    public static ExecutionResult ioError(String headline, String summary, String details) {
        return new ExecutionResult(ExecutionStatus.IO_ERROR, headline, summary, "", "", "", details, -1L);
    }

    public static ExecutionResult unsupported(String headline, String summary, String details) {
        return new ExecutionResult(ExecutionStatus.UNSUPPORTED, headline, summary, "", "", "", details, -1L);
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

    public String getStdout() {
        return stdout;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public String getError() {
        return error;
    }

    public String getDetails() {
        return details;
    }

    public long getDurationMs() {
        return durationMs;
    }

    public List<ExecutionOutputItem> getOutputItems() {
        return outputItems;
    }

    public String getOutputModelJson() {
        return outputModelJson;
    }

    public ExecutionResult withOutputItems(List<ExecutionOutputItem> outputItems) {
        return new ExecutionResult(
                status,
                headline,
                summary,
                stdout,
                returnValue,
                error,
                details,
                durationMs,
                outputItems,
                outputModelJson);
    }

    public ExecutionResult withOutputModelJson(String outputModelJson) {
        return new ExecutionResult(
                status,
                headline,
                summary,
                stdout,
                returnValue,
                error,
                details,
                durationMs,
                outputItems,
                outputModelJson);
    }
}
