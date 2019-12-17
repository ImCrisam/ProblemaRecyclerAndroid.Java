package com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.R;

public class ViewHolderRcyContenedor extends RecyclerView.ViewHolder {
    public TextView tvTitulo;
    public RecyclerView rcy;

    public ViewHolderRcyContenedor(@NonNull View itemView, Context ctx) {
        super(itemView);
        tvTitulo = itemView.findViewById(R.id.tvTitulo);
        rcy = itemView.findViewById(R.id.rcyItem);
        rcy.setLayoutManager(new LinearLayoutManager(ctx));
    }

}
