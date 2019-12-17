package com.example.adaptadoresrecy.Actividades;

import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Adaptadores.recy.AdaptadorRcyContenedor;
import com.example.adaptadoresrecy.Adaptadores.recy.AdaptadorRcyWidget;
import com.example.adaptadoresrecy.Adaptadores.recy.AdapterRecyItem;
import com.example.adaptadoresrecy.Modelos.Contenedor;
import com.example.adaptadoresrecy.Modelos.ContenedorRcyModel;
import com.example.adaptadoresrecy.Modelos.ContenedorRcyWidgetM;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.Modelos.widgets.EdiTextWidgetModel;
import com.example.adaptadoresrecy.Modelos.widgets.ItemWidget;
import com.example.adaptadoresrecy.Modelos.widgets.LayoutManagerRcy;
import com.example.adaptadoresrecy.Modelos.widgets.SwitchWidgetModel;
import com.example.adaptadoresrecy.R;

import java.util.ArrayList;
import java.util.List;


public class ConfiActivity extends AppCompatActivity {
    private AdaptadorRcyContenedor adapter;
    private String menu = "", nombreIp = "";
    private ContenedorRcyModel contenedorRcyModel;
    private ItemWidget itemWidget;
    private RecyclerView recyclerView;

    List<Item> list, list2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutBase = R.layout.activity_configuracion;
        int layoutContenedor = R.layout.contenedor_configuracion;
        int layoutsubContenedor = R.layout.contenedor_configuracion;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getIntent().hasExtra("menu")) {
            menu = getIntent().getStringExtra("menu");
        }

        LayoutManagerRcy layoutManagerRcybase = new LayoutManagerRcy(this);
        LayoutManagerRcy layoutManagerRcyCard = new LayoutManagerRcy(this);
        LayoutManagerRcy layoutManagerRcySubCard = new LayoutManagerRcy(this);

        if (true) {
            list = getItems(menu);

            switch (menu) {
                case "1":
                    layoutManagerRcybase = new LayoutManagerRcy(this);
                    layoutManagerRcyCard = new LayoutManagerRcy(this, 1);
                    layoutManagerRcySubCard = new LayoutManagerRcy(this);
                    break;
                case "f":
                    break;

                case "2":
                    layoutContenedor = R.layout.contenedor_configuracion2;
                    layoutsubContenedor = R.layout.contenedor_configuracion3;
                    layoutBase = R.layout.activity_configuracion_02;
                case "3":
                    layoutManagerRcybase = new LayoutManagerRcy(this, 1);
                    layoutManagerRcyCard = new LayoutManagerRcy(this);
                    layoutManagerRcySubCard = new LayoutManagerRcy(this);
                    break;

                default:

            }

            setContentView(layoutBase);
            recyclerView = findViewById(R.id.recyclerView);


            switch (menu) {

                case "1":
                case "2":
                case "3":
                case "f":
                    AdaptadorRcyWidget item = new AdaptadorRcyWidget(R.layout.itemw_configuracion);
                    AdaptadorRcyContenedor item_contenedor = new AdaptadorRcyContenedor(layoutsubContenedor, item);
                    item_contenedor.setLayoutManager(layoutManagerRcySubCard);
                    adapter = new AdaptadorRcyContenedor(this, layoutContenedor, list, item_contenedor);

                    break;
                default:
                    AdapterRecyItem adaptadorRcyWidget = new AdaptadorRcyWidget(R.layout.itemw_configuracion);
                    adapter = new AdaptadorRcyContenedor(this, R.layout.contenedor_configuracion, list, adaptadorRcyWidget);


                    break;
            }
            adapter.setLayoutManager(layoutManagerRcyCard);
            recyclerView.setLayoutManager(layoutManagerRcybase.getLayoutManager());
            recyclerView.setAdapter(adapter);


        } else {

        }


    }


    private List<Item> getItems(String menu) {

        List<Item> result = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        EdiTextWidgetModel ediText;
        SwitchWidgetModel aSwitch;

        switch (menu) {
            case "1":
            case "f":
            case "2":
            case "3":
                List<Item> itemsContenedores = new ArrayList<>();

                for (int i = 0; i < 3; i++) {


                    ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                    ediText.setHint("256");
                    ediText.setDiseño(0);
                    items.add(ediText);

                    aSwitch = new SwitchWidgetModel("Titulo Widget", false, this);
                    aSwitch.setChecked("0");
                    aSwitch.setDiseño(0);
                    items.add(aSwitch);
                    itemsContenedores.add(new ContenedorRcyWidgetM("Titulo conjunto n" + i, items));
                    items = new ArrayList<>();

                }

                result.add(new ContenedorRcyModel("Titulo n1", itemsContenedores));
                itemsContenedores = new ArrayList<>();


                aSwitch = new SwitchWidgetModel("Titulo Widget", false, this);
                aSwitch.setChecked("0");
                aSwitch.setDiseño(0);
                items.add(aSwitch);
                aSwitch = new SwitchWidgetModel("Titulo Widget", true, this);
                aSwitch.setChecked("0");
                aSwitch.setDiseño(0);
                items.add(aSwitch);
                aSwitch = new SwitchWidgetModel("Titulo Widget", false, this);
                aSwitch.setChecked("0");
                aSwitch.setDiseño(0);
                items.add(aSwitch);

                itemsContenedores.add(new ContenedorRcyWidgetM("Titulo conjunto n1", items));
                items = new ArrayList<>();
                result.add(new ContenedorRcyModel("Titulo n2", itemsContenedores));
                itemsContenedores = new ArrayList<>();

                ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                ediText.setDiseño(0);
                items.add(ediText);
                ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                ediText.setDiseño(0);
                items.add(ediText);
                ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                ediText.setDiseño(0);
                items.add(ediText);

                itemsContenedores.add(new ContenedorRcyWidgetM("Titulo conjunto n1", items));
                items = new ArrayList<>();


                ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                ediText.setDiseño(0);
                items.add(ediText);
                ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                ediText.setDiseño(0);
                items.add(ediText);
                ediText = new EdiTextWidgetModel("Titulo Widget", 0, InputType.TYPE_CLASS_NUMBER, true, this);
                ediText.setDiseño(0);
                items.add(ediText);


                itemsContenedores.add(new ContenedorRcyWidgetM("Titulo conjunto n2", items));

                result.add(new ContenedorRcyModel("Titulo n3", itemsContenedores));
                break;


            default:
        }

        return result;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        ContenedorRcyWidgetM contenedorWidget;
        Contenedor contenedor;
        String[] args;
        String[] rowToModificate;
        boolean cambios = false;
        for (Item contenedores : list) {
            contenedor = (Contenedor) contenedores;
            System.out.println(contenedor.getTitulo());
            for (Item item2 : contenedor.getList()) {
                int i=0;
                contenedorWidget = (ContenedorRcyWidgetM) item2;
                System.out.println(contenedorWidget.getTitulo());
                rowToModificate = contenedorWidget.getRowToModificate();
                args = contenedorWidget.getArgsToModificate();
                if (rowToModificate.length != 0 && args.length == rowToModificate.length) {
                    for (String s : rowToModificate) {
                        System.out.println(s +" : "+ args[i++] );
                    }


                } else {
                    System.out.println("No hay cambios");

                }
            }
        }
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
