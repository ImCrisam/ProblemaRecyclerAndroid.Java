package com.example.adaptadoresrecy.Actividades;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Adaptadores.recy.AdaptadorRcyWidget;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.Modelos.widgets.BtnWidgetModel;
import com.example.adaptadoresrecy.Modelos.widgets.LayoutManagerRcy;
import com.example.adaptadoresrecy.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recy = findViewById(R.id.rcy);
        recy.setLayoutManager(new LayoutManagerRcy(this).getLayoutManager());
        AdaptadorRcyWidget adaptadorRcyWidget = new AdaptadorRcyWidget(this, R.layout.itemw_configuracion, getItem());
        recy.setAdapter(adaptadorRcyWidget);
    }

    private List<Item> getItem() {
        List<Item> result = new ArrayList<>();
        result.add(new BtnWidgetModel("Normal", this, InfoActivity.class));
        result.add(new BtnWidgetModel("Funciona", this, ConfiActivity.class, "f"));
        result.add(new BtnWidgetModel("No funciona Modo01", this, ConfiActivity.class, "1"));
        result.add(new BtnWidgetModel("No funciona Modo02", this, ConfiActivity.class, "2"));
        result.add(new BtnWidgetModel("No funciona Modo03", this, ConfiActivity.class, "3"));
        return result;
    }
}
