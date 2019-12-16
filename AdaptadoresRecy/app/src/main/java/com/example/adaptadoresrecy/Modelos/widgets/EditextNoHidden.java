package com.example.adaptadoresrecy.Modelos.widgets;




public class EditextNoHidden /*extends android.support.v7.widget.AppCompatEditText*/ {

//    private Context ctx;
//    private String tipoMenu;
//
//    private EditextNoHidden(Context context, String tipoMenu) {
//        super(context);
//        this.ctx = context;
//        this.tipoMenu = tipoMenu;
//    }
//
//    public static EditextNoHidden getEditex(Context ctx, int type, String tipoMenu) {
//        EditextNoHidden editextNoHidden;
//
//        switch (type) {
//            case 1:
//                editextNoHidden = new EditextNoHidden(ctx, tipoMenu);
//                editextNoHidden.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
//                editextNoHidden.setBackground(ContextCompat.getDrawable(ctx, R.drawable.fondo_editext));
//                editextNoHidden.requestFocus();
//                editextNoHidden.setCursorVisible(false);
//                editextNoHidden.setTextSize(32);
//                editextNoHidden.setTextIsSelectable(false);
//                editextNoHidden.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
//                editextNoHidden.setPadding(40, 8, 40, 8);
//                return editextNoHidden;
//            default:
//                return new EditextNoHidden(ctx, tipoMenu);
//        }
//    }
//
//    @Override
//    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
//
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//
//            switch (tipoMenu) {
//                case DefinesBANCARD.ITEM_CONFIG:
//                    Intent intent = new Intent();
//                    intent.setClass(ctx, MainActivity.class);
//                    ctx.startActivity(intent);
//
//                    break;
//                default:
//                    InputMethodManager mgr = (InputMethodManager)
//                            getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//                    mgr.hideSoftInputFromWindow(this.getWindowToken(), 0);
//            }
//        }
//        return false;
//    }

}
