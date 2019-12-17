package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.MyViewHolders;
import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.ViewHolderRcyContenedor;
import com.example.adaptadoresrecy.Modelos.Contenedor;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.Modelos.widgets.LayoutManagerRcy;

import java.util.List;

public class AdaptadorRcyContenedor extends AdaptadorRcyBase implements AdapterRecyItem {

    private Contenedor item;
    private AdapterRecyItem adapterRecyItem;
    private AdapterRecyItem adapterRecyItem2;
    private LayoutManagerRcy layoutManager;


    public AdaptadorRcyContenedor(int layout, AdapterRecyItem adapterRecyItem2) {
        super(layout);
        this.adapterRecyItem2 = adapterRecyItem2;
    }

    /**
     * @param layout debe tener TextView id = tvTitulo  y RecyclerView id = rcyItem )
     */
    public AdaptadorRcyContenedor(Context ctx, int layout, List<Item> list, AdapterRecyItem adapterRecyItem) {
        super(ctx, layout, list, MyViewHolders.VH_CONTENEDOR);
        this.adapterRecyItem = adapterRecyItem;
        this.layoutManager = new LayoutManagerRcy(ctx);
    }

    public AdaptadorRcyContenedor(Context ctx, int layout, List<Item> list, AdapterRecyItem adapterRecyItem, LayoutManagerRcy layoutManager) {
        super(ctx, layout, list, MyViewHolders.VH_CONTENEDOR);
        this.adapterRecyItem = adapterRecyItem;
        this.layoutManager = layoutManager;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        item = (Contenedor) list.get(i);
        ViewHolderRcyContenedor vh = (ViewHolderRcyContenedor) holder;
        if (item.getTitulo().isEmpty()) {
            vh.tvTitulo.setVisibility(View.GONE);
        }
        vh.tvTitulo.setText(item.getTitulo());
        vh.rcy.setLayoutManager(layoutManager.getLayoutManager());
        vh.rcy.setAdapter(adapterRecyItem.newAdapter(item.getList(), ctx.getApplicationContext()));
    }

    public void setLayoutManager(LayoutManagerRcy layoutManager) {
        this.layoutManager = layoutManager;
    }


    @Override
    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx) {
        return new AdaptadorRcyContenedor(ctx, layoutView, list, adapterRecyItem2, layoutManager);
    }

    public void setAdapterRecyItem2(AdapterRecyItem adapterRecyItem2) {
        this.adapterRecyItem2 = adapterRecyItem2;
    }


}
