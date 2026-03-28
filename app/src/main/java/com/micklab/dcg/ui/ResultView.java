package com.micklab.dcg.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.micklab.dcg.R;
import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.ExecutionStatus;

public class ResultView extends LinearLayout {
    private TextView statusView;
    private TextView headlineView;
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
        detailsView = findViewById(R.id.resultDetailsView);
        render(ExecutionResult.idle("Ready", "Create, save, import, export, or run a snippet."));
    }

    public void render(ExecutionResult result) {
        if (result == null) {
            return;
        }
        statusView.setText(result.getStatusLabel());
        headlineView.setText(result.getHeadline());
        StringBuilder body = new StringBuilder();
        if (!TextUtils.isEmpty(result.getSummary())) {
            body.append(result.getSummary());
        }
        if (!TextUtils.isEmpty(result.getDetails())) {
            if (body.length() > 0) {
                body.append("\n\n");
            }
            body.append(result.getDetails());
        }
        if (result.getDurationMs() >= 0L) {
            if (body.length() > 0) {
                body.append("\n\n");
            }
            body.append("Duration: ").append(result.getDurationMs()).append(" ms");
        }
        detailsView.setText(body.toString());
        statusView.setTextColor(colorFor(result.getStatus()));
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
