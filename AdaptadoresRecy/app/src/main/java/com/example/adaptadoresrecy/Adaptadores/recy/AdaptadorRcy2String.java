package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Modelos.DosStringModel;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.R;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorRcy2String extends RecyclerView.Adapter<AdaptadorRcy2String.ViewHolder> implements AdapterRecyItem {

    private List<Item> list;
    private DosStringModel item;
    private Context ctx;
    private int layout;

    public AdaptadorRcy2String(int layout, Context ctx) {
        this.list = new ArrayList<>();
        this.ctx = ctx;
        this.layout = layout;
    }

    public AdaptadorRcy2String(List<Item> list, Context ctx, int layout) {
        this.list = list;
        this.ctx = ctx;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        item =(DosStringModel) list.get(position);
        holder.textView.setText(item.getTitulo());
        holder.textView2.setText(item.getSubTitulo());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx) {
        return new AdaptadorRcy2String(list, ctx, layout);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tvTitulo);
            textView2 = itemView.findViewById(R.id.tvSubTitulo);
        }
    }
}
