package com.app.altex.alttexdex.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.app.altex.alttexdex.R;
import com.app.altex.alttexdex.customelements.HistoryAdapter;
import com.app.altex.alttexdex.customelements.HistoryItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View result = inflater.inflate(R.layout.fragment_history, container, false);
        ArrayList<HistoryItem> historyItems = new ArrayList<>();
        historyItems.add(new HistoryItem(R.drawable.bitcoin, "BTC", 780));
        historyItems.add(new HistoryItem(R.drawable.eth, "ETH", 360));
        historyItems.add(new HistoryItem(R.drawable.dash, "DASH", 447.77));
        historyItems.add(new HistoryItem(R.drawable.zec, "ZEC", 300.49));
        historyItems.add(new HistoryItem(R.drawable.monero, "MONERO", 134.36));
        historyItems.add(new HistoryItem(R.drawable.lisk, "LISK", 10.17));
        historyItems.add(new HistoryItem(R.drawable.litecoin, "LITECOIN", 71.68));
        historyItems.add(new HistoryItem(R.drawable.neo, "NEO", 40.72));
        historyItems.add(new HistoryItem(R.drawable.nem, "NEM", 0.212));
        final ListAdapter adapter = new HistoryAdapter(getContext(), historyItems);
        ((ListView)result.findViewById(R.id.historu_item_list)).setAdapter(adapter);
        return result;
    }

}
