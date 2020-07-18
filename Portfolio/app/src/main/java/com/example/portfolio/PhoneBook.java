package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhoneBook extends AppCompatActivity {
    @BindView(R.id.phone_list) ListView itemListView;
    @BindView(R.id.total)
    TextView totalText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_book);
        ButterKnife.bind(this);
        PhoneBookAdapter adapter = new PhoneBookAdapter(this, generateItemList());
        itemListView.setAdapter(adapter);
        totalText.setText("총 "+adapter.getCount()+"개의 연락처");

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
}
