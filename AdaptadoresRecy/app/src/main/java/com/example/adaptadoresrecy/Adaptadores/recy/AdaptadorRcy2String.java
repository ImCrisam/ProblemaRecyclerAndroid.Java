package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.MyViewHolders;
import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.ViewHolderRcy2String;
import com.example.adaptadoresrecy.Modelos.DosStringModel;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.R;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorRcy2String extends AdaptadorRcyBase implements AdapterRecyItem {

    private DosStringModel item;


    public AdaptadorRcy2String(Context ctx, int layout) {
        super(ctx, layout, new ArrayList<Item>(), MyViewHolders.VH_2STRING);

    }

    public AdaptadorRcy2String(Context ctx, int layout, List<Item> list) {
        super(ctx, layout, list,  MyViewHolders.VH_2STRING);

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolderRcy2String vh = (ViewHolderRcy2String) holder;
        item =(DosStringModel) list.get(position);
        vh.textView.setText(item.getTitulo());
        vh.textView2.setText(item.getSubTitulo());
    }



    @Override
    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx) {
        return new AdaptadorRcy2String(ctx, layoutView, list);
    }


}
