package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.kennyc.bottomsheet.BottomSheetListener;
import com.kennyc.bottomsheet.BottomSheetMenuDialogFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.internal.ListenerClass;

import static android.widget.Toast.LENGTH_LONG;


public class PhoneBook extends AppCompatActivity {
    @BindView(R.id.phone_list) ListView itemListView;
    @BindView(R.id.total)
    TextView totalText;
    @BindView(R.id.filter)
    EditText filterEdit;
//    static int listSize = 0;
    Context context = this;
    static ArrayList<Item_phone> list;
    static ArrayList<Item_phone> list_save;
    static PhoneBookAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_book);
        ButterKnife.bind(this);
        String itemNames[] = getResources().getStringArray(R.array.phone_name);
        String itemNumber[] = getResources().getStringArray(R.array.phone_number);
        list = generateItemList();
        list_save = generateItemList();
        adapter = new PhoneBookAdapter(this, list);
        itemListView.setAdapter(adapter);
        totalText.setText("총 "+list.size()+"개의 연락처");

        filterEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                // 비어있을 때 원래 list를 보여줌
                if((s.toString()).isEmpty()) {
                    list.clear();
                    list.addAll(list_save);
                    adapter.notifyDataSetChanged();
                    return ;
                }

                list.clear();

                for(int i=0;i<list_save.size();i++){

                    if((list_save.get(i).getItemName()).indexOf(s.toString()) != -1){
                        list.add(new Item_phone(list_save.get(i).getItemName(), list_save.get(i).getItemNumber()));
                    }
                    else if((list_save.get(i).getItemNumber()).indexOf(s.toString()) != -1){
                        list.add(new Item_phone(list_save.get(i).getItemName(), list_save.get(i).getItemNumber()));
                    }
                }

                adapter.notifyDataSetChanged();

            }
        });



        itemListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                new BottomSheetMenuDialogFragment.Builder(getApplicationContext())
                        .setSheet(R.menu.bottom_sheet)
                        .setListener(new BottomSheetListener() {
                            @Override
                            public void onSheetShown(BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment, Object o) {

                            }

                            @Override
                            public void onSheetItemSelected(BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment, MenuItem menuItem, Object o) {
                                switch (menuItem.getItemId()){
                                    case R.id.editPhoneItem:
                                        EditDialog editDialog = new EditDialog(context);
                                        editDialog.showDialog((Item_phone)adapter.getItem(position));
                                        break;
                                    case R.id.deletePhoneItem:
                                        DeleteDialog deleteDialog = new DeleteDialog(context);
                                        deleteDialog.showDialog((Item_phone)adapter.getItem(position));
                                        break;
                                    case R.id.insertPhoneItem:
                                        break;

                                }
                            }

                            @Override
                            public void onSheetDismissed(BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment, Object o, int i) {

                            }
                        })
                        .show(getSupportFragmentManager());

                return false;
            }
        });


    }

    private ArrayList<Item_phone> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.phone_name);
        String itemNumber[] = getResources().getStringArray(R.array.phone_number);
        ArrayList<Item_phone> list = new ArrayList<>();
        for(int i=0;i<itemNames.length;i++){
            list.add(new Item_phone(itemNames[i],itemNumber[i]));
        }
        return list;
    }

    static public void removeListItem(Item_phone i){
        list.remove(i);
        list_save.clear();
        list_save.addAll(list);
    };
    static public PhoneBookAdapter getAdapter(){ return adapter; }


}
