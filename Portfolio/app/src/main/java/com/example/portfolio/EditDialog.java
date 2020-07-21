package com.example.portfolio;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class EditDialog {
    Button btn_OK;
    Button btn_cancel;
    EditText edit_new_name;
    EditText edit_new_number;

    private Context context;

    public EditDialog(Context context){
        this.context = context;
    }

    public void showDialog(Item_phone i){
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.edit_dialog);
        dialog.show();

        btn_OK = (Button) dialog.findViewById(R.id.edit_OK);
        btn_cancel = (Button) dialog.findViewById(R.id.edit_cancel);
        edit_new_name = (EditText) dialog.findViewById(R.id.new_name);
        edit_new_number = (EditText) dialog.findViewById(R.id.new_number);
        edit_new_name.setText(i.getItemName());
        edit_new_number.setText(i.getItemNumber());


        btn_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.setItemName(edit_new_name.getText().toString());
                i.setItemNumber(edit_new_number.getText().toString());
                dialog.dismiss();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });






    }
}
