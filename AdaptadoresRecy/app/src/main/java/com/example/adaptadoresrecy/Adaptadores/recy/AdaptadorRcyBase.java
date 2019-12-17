package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.MyViewHolderInstance;
import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.MyViewHolders;
import com.example.adaptadoresrecy.Modelos.Item;

import java.util.List;

public abstract class AdaptadorRcyBase extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected Context ctx;
    protected int layoutView;
    protected List<Item> list;
    protected MyViewHolders tipo;

    public AdaptadorRcyBase(int layoutView) {
        this.layoutView = layoutView;
    }

    public AdaptadorRcyBase(Context ctx, int layoutView, List<Item> list, MyViewHolders tipo) {
        this.ctx = ctx;
        this.layoutView = layoutView;
        this.list = list;
        this.tipo = tipo;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layoutView, parent, false);

        return MyViewHolderInstance.getInstance(v, ctx, tipo);
    }

    @Override
    public abstract void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position);

    @Override
    public int getItemCount() {
        return list.size();
    }


}
