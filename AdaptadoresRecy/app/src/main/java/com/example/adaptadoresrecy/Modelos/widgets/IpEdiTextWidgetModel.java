package com.example.adaptadoresrecy.Modelos.widgets;

import android.content.Context;
import android.view.View;

public class IpEdiTextWidgetModel extends WidgetModel implements ItemWidget {

//    IPEditText ipEditText;
    public IpEdiTextWidgetModel(String titulo,  Context context) {
        super(titulo, context);
//        ipEditText = new IPEditText(context, null);
//        ipEditText.setBackground(R.drawable.fondo_editext, context);
    }

    @Override
    public View getWidget() {
        return null;
    }

    @Override
    public String getTituloItem() {
        return null;
    }

    @Override
    public View getWidgetItem() {
        return null;
    }

    @Override
    public String getResultado() {
        return null;
    }

    @Override
    public boolean isNewValor() {
        return false;
    }
//
//    public IpEdiTextWidgetModel(String titulo, int tipo, boolean isEnabled, Context context) {
//        super(titulo, tipo, context);
//        ipEditText = new IPEditText(context, null);
////        ipEditText.setEnabled(isEnabled);
//        ipEditText.setLiveOrDeath(isEnabled);
//    }
//
//
//    public void setIPHint(String ip) {
//        oldValue = ip;
//        String[] ipValor = ip.replace(".", "-").split("-");
//        if (ipValor.length == 4) {
//            ipEditText.setIpHint(ipValor);
//        }
//    }
//    public void setText(String ip) {
//        oldValue = ip;
//        String[] ipValor = ip.replace(".", "-").split("-");
//        if (ipValor.length == 4) {
//            ipEditText.setIPText(ipValor);
//        }
//    }
//
//    public void setDiseño(int i) {
//        switch (i) {
//            case 0:
//                ipEditText.setLayoutParams(lp);
//                break;
//            case 1:
//                ipEditText.setLayoutParams(lp);
//                ipEditText.setBackground(R.drawable.fondo_editext, context);
//                ipEditText.setOnLongClickListener(new View.OnLongClickListener() {
//                    @Override
//                    public boolean onLongClick(View view) {
//                        ipEditText.setIPText(new String[]{"0","0","0","0"});
//                        return false;
//                    }
//                });
//            default:
//        }
//    }
//    @Override
//    public IPEditText getWidget() {
//        return ipEditText;
//    }
//
//    @Override
//    public String getTituloItem() {
//        return titulo;
//    }
//
//    @Override
//    public View getWidgetItem() {
//        return ipEditText;
//    }
//
//    @Override
//    public String getResultado() {
//        return ipEditText.getIPTextOrHint();
//    }
//
//    @Override
//    public boolean isNewValor() {
//        if (oldValue.equals(ipEditText.getIPTextOrHint())) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//
}
