package com.example.portfolio;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class InsertDialog {
    Button btn_OK;
    Button btn_cancel;
    EditText insert_new_name;
    EditText insert_new_number;

    private Context context;

    public InsertDialog(Context context){ this.context = context; }

    public void showDialog(){
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.insert_dialog);
        dialog.show();

        btn_OK = (Button) dialog.findViewById(R.id.insert_OK);
        btn_cancel = (Button) dialog.findViewById(R.id.insert_cancel);
        insert_new_name = (EditText) dialog.findViewById(R.id.new_name);
        insert_new_number = (EditText) dialog.findViewById(R.id.new_number);

        btn_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (insert_new_name.getText().toString().isEmpty() || insert_new_number.getText().toString().isEmpty()){
                    dialog.dismiss();
                    return;
                }
                PhoneBook.addListItem(new Item_phone(insert_new_name.getText().toString(), insert_new_number.getText().toString()));
                PhoneBook.getAdapter().notifyDataSetChanged();
                PhoneBook.totalSetText();
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
