package com.app.altex.alttexdex.customelements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.app.altex.alttexdex.R;

import java.util.ArrayList;

/**
 * Created by igorqua on 13.03.2018.
 */

public class HistoryAdapter extends BaseAdapter {
    ArrayList<HistoryItem> objects;
    Context ctx;
    LayoutInflater lInflater;

    public HistoryAdapter(Context context, ArrayList<HistoryItem> items){
        objects = items;
        ctx = context;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = ((LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_wallet_coin, parent, false);
        }

        HistoryItem wi = getWallettItem(position);
        ((TextView)view.findViewById(R.id.short_name_txt)).setText(wi.name);
        ((TextView)view.findViewById(R.id.value_txt)).setText("$ " + wi.count);
        ((ImageView)view.findViewById(R.id.icon)).setImageResource(wi.icon);
        return view;
    }


    HistoryItem getWallettItem(int position) {
        return ((HistoryItem) getItem(position));
    }
}
