package com.micklab.dcg.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.micklab.dcg.R;
import com.micklab.dcg.model.SourceSnippet;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SnippetListAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private final List<SourceSnippet> items = new ArrayList<>();
    private String selectedId;

    public SnippetListAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setItems(List<SourceSnippet> snippets) {
        items.clear();
        if (snippets != null) {
            items.addAll(snippets);
        }
        notifyDataSetChanged();
    }

    public void setSelectedId(String selectedId) {
        this.selectedId = selectedId;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public SourceSnippet getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_snippet, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        SourceSnippet snippet = getItem(position);
        holder.titleView.setText(snippet.getTitle());
        String updatedText = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)
                .format(new Date(snippet.getUpdatedAt()));
        holder.metaView.setText(snippet.getLanguage().getDisplayName() + " • " + snippet.getFileName() + " • " + updatedText);

        boolean selected = snippet.getId() != null && snippet.getId().equals(selectedId);
        holder.root.setBackgroundResource(selected ? R.drawable.panel_selected_background : R.drawable.panel_background);
        if (selected) {
            holder.titleView.setTextColor(ContextCompat.getColor(parent.getContext(), R.color.accent));
        } else {
            holder.titleView.setTextColor(ContextCompat.getColor(parent.getContext(), R.color.textPrimary));
        }
        return convertView;
    }

    private static final class ViewHolder {
        private final LinearLayout root;
        private final TextView titleView;
        private final TextView metaView;

        private ViewHolder(View view) {
            root = view.findViewById(R.id.snippetItemRoot);
            titleView = view.findViewById(R.id.snippetTitleView);
            metaView = view.findViewById(R.id.snippetMetaView);
        }
    }
}
