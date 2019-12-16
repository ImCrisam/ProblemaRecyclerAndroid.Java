package com.example.adaptadoresrecy.Modelos.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Switch;

import androidx.annotation.StyleRes;

public class SwitchWidgetModel extends WidgetModel implements ItemWidget {

    private Switch aSwitch;
    private Context ctx;


    public SwitchWidgetModel(String titulo, int tipoWiget, boolean isCheck, Context context) {
        super(titulo, tipoWiget, context);
        this.ctx = context;
        aSwitch = new Switch(context);
        aSwitch.setChecked(isCheck);
    }

    public SwitchWidgetModel(String titulo, int tipo, Context context) {
        super(titulo, tipo, context);
        aSwitch = new Switch(context);
    }


    public void setChecked(String oneOrZero) {
        oldValue = oneOrZero;
        if (oneOrZero.equals("1")) {
            aSwitch.setChecked(true);
        } else {
            aSwitch.setChecked(false);
        }
    }


    public void setDiseño(int i) {
        switch (i) {
            case 0:
                aSwitch.setLayoutParams(lp);
                aSwitch.setPadding(0, 0, 16, 0);
                aSwitch.setSwitchMinWidth(96);
//                aSwitch.setThumbDrawable(context.getDrawable(R.drawable.fondo_switch));
//                aSwitch.setSwitchTextAppearance(context, R.style.SwitchTextAppearance);

                break;
            default:
        }
    }

    public void setSwitchTextAppearance(@StyleRes int style) {
        aSwitch.setSwitchTextAppearance(ctx, style);
    }

    public void setShowText(boolean showText) {
        aSwitch.setShowText(showText);
    }

    public void setThumbDrawable(Drawable drawable) {
        aSwitch.setThumbDrawable(drawable);
    }

    @Override
    public Switch getWidget() {
        return aSwitch;
    }

    @Override
    public String getTituloItem() {
        return titulo;
    }

    @Override
    public View getWidgetItem() {
        return aSwitch;
    }

    @Override
    public String getResultado() {
        String result;
        if (aSwitch.isChecked()) {
            result = "1";
        } else {
            result = "0";
        }
        return result;
    }

    @Override
    public boolean isNewValor() {
        boolean result = false;
        if (aSwitch.isChecked() && oldValue.equals("0")) {
            result = true;
        } else if (!aSwitch.isChecked() && oldValue.equals("1")) {
            result = true;
        }
        return result;
    }


}
