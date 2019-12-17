package com.example.adaptadoresrecy.Adaptadores.recy;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.MyViewHolderRcyWidget;
import com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder.MyViewHolders;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.Modelos.widgets.ItemWidget;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorRcyWidget extends AdaptadorRcyBase implements AdapterRecyItem {

    private ItemWidget item;

    public AdaptadorRcyWidget(int layout) {
        super(layout);
        this.list = new ArrayList<>();
    }

    public AdaptadorRcyWidget(Context ctx, int layout, List<Item> list) {
        super(ctx, layout, list, MyViewHolders.VH_WIDGET);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        item =(ItemWidget) list.get(position);
        MyViewHolderRcyWidget vh = (MyViewHolderRcyWidget) holder;
        if (item.getTituloItem().isEmpty()) {
            vh.textView.setVisibility(View.GONE);

        } else {
            vh.textView.setText(item.getTituloItem());

        }
        vh.linearWidget.addView(item.getWidgetItem());
    }

    @Override
    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx) {
        return new AdaptadorRcyWidget(ctx, layoutView, list );
    }

}
