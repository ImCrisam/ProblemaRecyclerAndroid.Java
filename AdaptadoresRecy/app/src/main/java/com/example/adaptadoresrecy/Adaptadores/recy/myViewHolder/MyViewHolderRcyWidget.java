package com.example.adaptadoresrecy.Adaptadores.recy.myViewHolder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.R;

public class MyViewHolderRcyWidget extends RecyclerView.ViewHolder {

    public TextView textView;
    public LinearLayout linearWidget;

    public MyViewHolderRcyWidget(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        linearWidget = itemView.findViewById(R.id.linearWidget);
    }
}

