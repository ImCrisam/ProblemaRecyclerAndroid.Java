package com.example.adaptadoresrecy.Modelos.widgets;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class BtnWidgetModel extends WidgetModel implements ItemWidget {

    private Button button;

    public BtnWidgetModel(String titulo, int tipo, Context context) {
        super("", tipo, context);
        button = new Button(context);
        button.setText(titulo);
    }

    public BtnWidgetModel(String titulo, int tipo, final Context context, final Class clase) {
        super("", tipo, context);
        button = new Button(context);
        button.setText(titulo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(getIntentModel(clase, ""));
            }
        });

    }

    public BtnWidgetModel(String titulo, int tipo, final Context context, final Class clase, final String menu) {
        super("", tipo, context);
        button = new Button(context);
        button.setText(titulo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(getIntentModel(clase, menu));
            }
        });
    }

    @Override
    public String getTituloItem() {
        return titulo;
    }

    @Override
    public View getWidgetItem() {
        return button;
    }

    @Override
    public String getResultado() {
        return null;
    }

    @Override
    public boolean isNewValor() {
        return false;
    }

    @Override
    public View getWidget() {
        return button;
    }

    private Intent getIntentModel(Class clase, String menu) {
        Intent intent = new Intent();
        intent.setClass(context, clase);
        intent.putExtra("menu", menu);
        return intent;
    }
}
