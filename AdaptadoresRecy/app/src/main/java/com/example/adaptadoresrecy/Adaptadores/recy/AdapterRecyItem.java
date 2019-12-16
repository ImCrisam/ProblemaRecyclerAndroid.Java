package com.example.adaptadoresrecy.Adaptadores.recy;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Modelos.Item;

import java.util.List;

public interface AdapterRecyItem {

    public RecyclerView.Adapter newAdapter(List<Item> list, Context ctx);
}
