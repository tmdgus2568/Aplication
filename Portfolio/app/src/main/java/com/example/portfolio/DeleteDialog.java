package com.example.portfolio;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.ArrayList;

public class DeleteDialog {

    Button btn_OK;
    Button btn_cancel;

    private Context context;

    public DeleteDialog(Context context) { this.context = context; }

    public void showDialog( Item_phone i){
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.delete_dialog);
        dialog.show();

        btn_OK = dialog.findViewById(R.id.delete_OK);
        btn_cancel = dialog.findViewById(R.id.delete_cancel);


        btn_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PhoneBook.removeListItem(i);
                PhoneBook.getAdapter().notifyDataSetChanged();

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
