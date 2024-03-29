package com.example.adaptadoresrecy.Modelos.widgets;


import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.example.adaptadoresrecy.Modelos.Item;

public abstract class WidgetModel implements Item {

    protected String titulo;

    Context context;
    LinearLayout.LayoutParams lp;
    protected String oldValue;


    public WidgetModel(String titulo,  Context context) {
        this.titulo = titulo;
        this.context = context;
        this.oldValue="";
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract View getWidget();
}
