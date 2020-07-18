package com.example.portfolio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> items;

    public CustomListAdapter(Context context, ArrayList<Item> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){// convertview : 껍데기?
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false);

        }
        Item currentItem = (Item) getItem(position);

        TextView textViewItemName = (TextView) convertView.findViewById(R.id.name);
        TextView textViewItemDescription = (TextView) convertView.findViewById(R.id.desc);

        textViewItemName.setText(currentItem.getItemName());
        textViewItemDescription.setText(currentItem.getItemDescription());

        return convertView;
    }
}
