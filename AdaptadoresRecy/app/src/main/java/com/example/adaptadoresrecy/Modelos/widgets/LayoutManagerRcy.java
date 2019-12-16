package com.example.adaptadoresrecy.Modelos.widgets;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LayoutManagerRcy {

    private final Context ctx;

    int tipo;


    public LayoutManagerRcy(Context ctx, int tipo) {
        this.tipo = tipo;
        this.ctx = ctx;
    }

    public LayoutManagerRcy(Context ctx) {
        this.ctx = ctx;
        this.tipo = 0;
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        switch (tipo) {
            case 1:
                return new LinearLayoutManager(ctx, LinearLayoutManager.HORIZONTAL, false);
            default:
                return new LinearLayoutManager(ctx, LinearLayoutManager.VERTICAL, false);
        }
    }
}
