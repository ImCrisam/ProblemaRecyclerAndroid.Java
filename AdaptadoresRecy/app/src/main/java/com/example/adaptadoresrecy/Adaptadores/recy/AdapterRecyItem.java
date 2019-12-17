package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Modelos.Item;

import java.util.List;

public interface AdapterRecyItem {

    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx);


}
