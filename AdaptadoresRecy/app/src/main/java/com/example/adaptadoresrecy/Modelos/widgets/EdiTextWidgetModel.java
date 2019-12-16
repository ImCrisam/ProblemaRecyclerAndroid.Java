package com.example.adaptadoresrecy.Modelos.widgets;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;

import com.example.adaptadoresrecy.R;

public class EdiTextWidgetModel extends WidgetModel implements ItemWidget {

    EditText editText;
    Context ctx;
    private boolean enable;

    public EdiTextWidgetModel(String titulo, int tipoWiget, int lengMax, int Type_input, Boolean enabled, Context context) {
        super(titulo, tipoWiget, context);
        this.ctx = context;
        this.enable = enabled;
        editText = new EditText(context);

        if (lengMax != 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(lengMax)});
        }
        editText.setInputType(Type_input);
        editText.setGravity(Gravity.END);
        editText.setEnabled(enabled);
    }

    public EditText getEditText() {
        return editText;
    }

    public void setHint(String string) {
        oldValue = string;
        editText.setHint(string);
    }

    public void setBackground(Drawable background) {
        editText.setBackground(background);
    }

    public void setDiseño(int i) {
        switch (i) {
            case 0:
                editText.setLayoutParams(lp);
                editText.setPadding(32, 24, 32, 0);
                editText.setBackground(ctx.getDrawable(R.drawable.fondo_editext_01));
                if (enable) {
                    editText.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public boolean onLongClick(View view) {
                            editText.setText(" ");
                            return false;
                        }
                    });
                }
                break;

            default:
        }
    }

    public void requestFocus() {
        editText.requestFocus();
    }

    @Override
    public EditText getWidget() {
        return editText;
    }

    @Override
    public String getTituloItem() {
        return titulo;
    }

    @Override
    public View getWidgetItem() {
        return editText;
    }

    @Override
    public String getResultado() {
        if (!editText.getText().toString().isEmpty()) {
            return editText.getText().toString();
        } else {
            return editText.getHint().toString();
        }

    }

    @Override
    public boolean isNewValor() {
        if (!editText.getText().toString().isEmpty()) {

            if (!oldValue.equals(editText.getText())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
