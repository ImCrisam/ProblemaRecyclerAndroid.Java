package com.example.adaptadoresrecy.Actividades;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadoresrecy.Adaptadores.recy.AdaptadorRcy2String;
import com.example.adaptadoresrecy.Adaptadores.recy.AdaptadorRcyContenedor;
import com.example.adaptadoresrecy.BuildConfig;
import com.example.adaptadoresrecy.Modelos.ContenedorRcyModel;
import com.example.adaptadoresrecy.Modelos.DosStringModel;
import com.example.adaptadoresrecy.Modelos.Item;
import com.example.adaptadoresrecy.R;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    private String menu;
    private ContenedorRcyModel contenedorRcyModel;
    private int layout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getActionBar().setIcon(R.drawable.ic_guardar);

        if (getIntent().hasExtra("menu")) {
            menu = getIntent().getStringExtra("menu");
        } else {
            menu = " ";
        }
        switch (menu) {
            default:
                layout = R.layout.item_item_info_;
                break;
            case "1":
                layout = R.layout.item_item_info_confi_;
                findViewById(R.id.imgView).setVisibility(View.GONE);
                TextView textView = findViewById(R.id.tvTitulo);
                textView.setVisibility(View.VISIBLE);

                textView.setText(menu);
                break;

        }
        RecyclerView recyclerView = findViewById(R.id.rcy);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdaptadorRcy2String adaptadorRcyDosString = new AdaptadorRcy2String(layout, this);
        recyclerView.setAdapter(new AdaptadorRcyContenedor(getItems(menu), InfoActivity.this, R.layout.item_info, adaptadorRcyDosString));


    }


    private List<Item> getItems(String menu) {
        List<Item> result = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        String string = " ";
        switch (menu) {
            default:
                TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
                items.add(new DosStringModel("Sport shop"));

                contenedorRcyModel = new ContenedorRcyModel("Informacion del comercio", items);
                result.add(contenedorRcyModel);


                items = new ArrayList<>();
                items.add(new DosStringModel("Operador", telephonyManager.getNetworkOperatorName()));
                items.add(new DosStringModel("Modo Avion", isAirplaneModeOn()));
                items.add(new DosStringModel("Android", Build.VERSION.RELEASE));
                contenedorRcyModel = new ContenedorRcyModel("Dispositivo", items);
                result.add(contenedorRcyModel);

                items = new ArrayList<>();
                items.add(new DosStringModel("Nombre", getString(R.string.app_name)));
                items.add(new DosStringModel("Verion", BuildConfig.VERSION_NAME));
                items.add(new DosStringModel("Tipo de app", BuildConfig.BUILD_TYPE));
                for (String db : getApplicationContext().databaseList()) {
                    string += " " + db;
                }
                items.add(new DosStringModel("Nombre db", string));
                contenedorRcyModel = new ContenedorRcyModel("Info de app", items);
                result.add(contenedorRcyModel);
                break;


        }


        return result;
    }


    private String isAirplaneModeOn() {

        if (Settings.System.getInt(this.getContentResolver(),
                Settings.System.AIRPLANE_MODE_ON, 0) != 0) {
            return "Si";

        } else {
            return "No";

        }
    }
}
