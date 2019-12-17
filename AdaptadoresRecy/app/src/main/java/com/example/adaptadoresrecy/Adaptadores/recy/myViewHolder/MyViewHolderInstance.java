package com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public abstract class MyViewHolderInstance {

    public static RecyclerView.ViewHolder getInstance(View v, Context ctx, MyViewHolders tipo) {
        switch (tipo) {
            case VH_2STRING:
                return new ViewHolderRcy2String(v);

            case VH_CONTENEDOR:
                return new ViewHolderRcyContenedor(v, ctx);
            case VH_WIDGET:
                return new MyViewHolderRcyWidget(v);

            default:
                return new ViewHolderRcy2String(v);
        }
    }
}
