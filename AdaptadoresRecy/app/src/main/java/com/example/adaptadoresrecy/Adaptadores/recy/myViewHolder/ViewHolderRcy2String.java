package com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.R;

public class ViewHolderRcy2String extends RecyclerView.ViewHolder {

    public TextView textView;
    public TextView textView2;

    public ViewHolderRcy2String(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tvTitulo);
        textView2 = itemView.findViewById(R.id.tvSubTitulo);
    }


}
