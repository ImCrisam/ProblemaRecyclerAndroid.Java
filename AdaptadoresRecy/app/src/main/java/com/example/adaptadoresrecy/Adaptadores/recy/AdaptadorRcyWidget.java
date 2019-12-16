package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.Modelos.widgets.ItemWidget;
import com.example.adaptadoresrecy.R;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorRcyWidget extends RecyclerView.Adapter<AdaptadorRcyWidget.ViewHolder> implements AdapterRecyItem {

    private List<Item> list;
    private ItemWidget item;
    private Context ctx;
    private int layout;

    public AdaptadorRcyWidget(int layout) {
        this.list = new ArrayList<>();
        this.ctx = null;
        this.layout = layout;
    }

    public AdaptadorRcyWidget(List<Item> list, Context ctx, int layout) {
        this.list = list;
        this.ctx = ctx;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout, null, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        item =(ItemWidget) list.get(position);
        if (item.getTituloItem().isEmpty()) {
            holder.textView.setVisibility(View.GONE);

        } else {
            holder.textView.setText(item.getTituloItem());

        }
        holder.linearWidget.addView(item.getWidgetItem());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx) {
        return new AdaptadorRcyWidget(list, ctx, layout);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout linearWidget;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            linearWidget = itemView.findViewById(R.id.linearWidget);
        }
    }
}
