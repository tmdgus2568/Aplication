package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {
    private ListView itemListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        itemListView = findViewById(R.id.custom_list);
        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());
        itemListView.setAdapter(adapter);
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescriptions[] = getResources().getStringArray(R.array.item_description);
        ArrayList<Item> list = new ArrayList<>();
        for(int i=0;i<itemNames.length;i++){
            list.add(new Item(itemNames[i],itemDescriptions[i]));
        }
        return list;
    }
}
