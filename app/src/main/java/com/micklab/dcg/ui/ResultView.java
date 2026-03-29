package com.micklab.dcg.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.micklab.dcg.R;
import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.ExecutionStatus;

public class ResultView extends LinearLayout {
    private TextView statusView;
    private TextView headlineView;
    private TextView summaryView;
    private Button copyLogsButton;
    private TextView stdoutLabelView;
    private TextView stdoutView;
    private TextView returnValueLabelView;
    private TextView returnValueView;
    private TextView errorLabelView;
    private TextView errorView;
    private TextView detailsLabelView;
    private TextView detailsView;

    public ResultView(Context context) {
        super(context);
        init();
    }

    public ResultView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ResultView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOrientation(VERTICAL);
        setGravity(Gravity.START);
        setBackgroundResource(R.drawable.result_background);
        int padding = dp(12);
        setPadding(padding, padding, padding, padding);
        inflate(getContext(), R.layout.view_result, this);
        statusView = findViewById(R.id.resultStatusView);
        headlineView = findViewById(R.id.resultHeadlineView);
        summaryView = findViewById(R.id.resultSummaryView);
        copyLogsButton = findViewById(R.id.resultCopyLogsButton);
        stdoutLabelView = findViewById(R.id.resultStdoutLabelView);
        stdoutView = findViewById(R.id.resultStdoutView);
        returnValueLabelView = findViewById(R.id.resultReturnValueLabelView);
        returnValueView = findViewById(R.id.resultReturnValueView);
        errorLabelView = findViewById(R.id.resultErrorLabelView);
        errorView = findViewById(R.id.resultErrorView);
        detailsLabelView = findViewById(R.id.resultDetailsLabelView);
        detailsView = findViewById(R.id.resultDetailsView);
        render(ExecutionResult.idle("Ready", "Create, save, import, export, or run a snippet."));
    }

    public void render(ExecutionResult result) {
        if (result == null) {
            return;
        }
        statusView.setText(result.getStatusLabel());
        headlineView.setText(result.getHeadline());
        summaryView.setVisibility(TextUtils.isEmpty(result.getSummary()) ? GONE : VISIBLE);
        summaryView.setText(result.getSummary());
        bindSection(stdoutLabelView, stdoutView, result.getStdout(), getResources().getString(R.string.result_stdout_label));
        bindSection(returnValueLabelView, returnValueView, result.getReturnValue());
        bindSection(errorLabelView, errorView, result.getError(), getResources().getString(R.string.result_error_label));
        bindSection(detailsLabelView, detailsView, buildDetails(result));
        bindCopyLogsButton(result);
        statusView.setTextColor(colorFor(result.getStatus()));
    }

    private void bindSection(TextView labelView, TextView valueView, String content) {
        boolean hasContent = !TextUtils.isEmpty(content);
        labelView.setVisibility(hasContent ? VISIBLE : GONE);
        valueView.setVisibility(hasContent ? VISIBLE : GONE);
        valueView.setText(hasContent ? content : "");
        valueView.setOnLongClickListener(null);
        valueView.setLongClickable(false);
    }

    private void bindSection(TextView labelView, TextView valueView, String content, String clipboardLabel) {
        bindSection(labelView, valueView, content);
        if (!TextUtils.isEmpty(content)) {
            valueView.setLongClickable(true);
            valueView.setOnLongClickListener(view -> {
                copyToClipboard(clipboardLabel, content);
                return true;
            });
        }
    }

    private void bindCopyLogsButton(ExecutionResult result) {
        String logs = buildCopyableLogs(result);
        boolean hasLogs = !TextUtils.isEmpty(logs);
        copyLogsButton.setVisibility(hasLogs ? VISIBLE : GONE);
        if (!hasLogs) {
            copyLogsButton.setOnClickListener(null);
            return;
        }
        copyLogsButton.setOnClickListener(view -> copyToClipboard(getResources().getString(R.string.action_copy_logs), logs));
    }

    private String buildCopyableLogs(ExecutionResult result) {
        StringBuilder builder = new StringBuilder();
        appendCopySection(builder, getResources().getString(R.string.result_stdout_label), result.getStdout());
        appendCopySection(builder, getResources().getString(R.string.result_error_label), result.getError());
        appendCopySection(builder, getResources().getString(R.string.result_details_label), buildDetails(result));
        return builder.toString();
    }

    private void appendCopySection(StringBuilder builder, String label, String content) {
        if (TextUtils.isEmpty(content)) {
            return;
        }
        if (builder.length() > 0) {
            builder.append("\n\n");
        }
        builder.append(label).append(":\n").append(content);
    }

    private void copyToClipboard(String label, String content) {
        if (TextUtils.isEmpty(content)) {
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(label, content));
        Toast.makeText(getContext(), getResources().getString(R.string.result_copied_message, label), Toast.LENGTH_SHORT).show();
    }

    private String buildDetails(ExecutionResult result) {
        StringBuilder builder = new StringBuilder();
        if (!TextUtils.isEmpty(result.getDetails())) {
            builder.append(result.getDetails());
        }
        if (result.getDurationMs() >= 0L) {
            if (builder.length() > 0) {
                builder.append("\n\n");
            }
            builder.append("Duration: ").append(result.getDurationMs()).append(" ms");
        }
        return builder.toString();
    }

    private int colorFor(ExecutionStatus status) {
        if (status == ExecutionStatus.SUCCESS) {
            return ContextCompat.getColor(getContext(), R.color.success);
        }
        if (status == ExecutionStatus.COMPILATION_ERROR || status == ExecutionStatus.RUNTIME_ERROR || status == ExecutionStatus.IO_ERROR) {
            return ContextCompat.getColor(getContext(), R.color.error);
        }
        if (status == ExecutionStatus.UNSUPPORTED) {
            return ContextCompat.getColor(getContext(), R.color.warning);
        }
        return ContextCompat.getColor(getContext(), R.color.info);
    }

    private int dp(int value) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(value * density);
    }
}
