package com.app.altex.alttexdex.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.app.altex.alttexdex.R;
import com.wordplat.ikvstockchart.InteractiveKLineLayout;
import com.wordplat.ikvstockchart.InteractiveKLineView;
import com.wordplat.ikvstockchart.KLineHandler;
import com.wordplat.ikvstockchart.drawing.HighlightDrawing;
import com.wordplat.ikvstockchart.drawing.MACDDrawing;
import com.wordplat.ikvstockchart.drawing.StockIndexYLabelDrawing;
import com.wordplat.ikvstockchart.entry.Entry;
import com.wordplat.ikvstockchart.entry.EntrySet;
import com.wordplat.ikvstockchart.entry.StockMACDIndex;
import com.wordplat.ikvstockchart.marker.YAxisTextMarkerView;
import com.wordplat.ikvstockchart.render.KLineRender;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class WalletsFragment extends Fragment {

    KLineRender kLineRender;
    public WalletsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View result = inflater.inflate(R.layout.fragment_wallets, container, false);
        final InteractiveKLineLayout kLineLayout = result.findViewById(R.id.kLineLayout);
        final EntrySet entrySet = new EntrySet();
        Random r = new Random();
        for(int i = 0; i<50; i++){
            entrySet.addEntry(new Entry(r.nextFloat(),r.nextFloat(),r.nextFloat(),r.nextFloat(), 1, "test"));
        }



        kLineLayout.getKLineView().setEntrySet(entrySet);
        kLineLayout.getKLineView().notifyDataSetChanged();
        kLineLayout.getKLineView().setKLineHandler(new KLineHandler() {
            @Override
            public void onLeftRefresh() {
                kLineLayout.getKLineView().refreshComplete();
            }

            @Override
            public void onRightRefresh() {
                kLineLayout.getKLineView().refreshComplete();
            }

            @Override
            public void onSingleTap(MotionEvent e, float x, float y) {

            }

            @Override
            public void onDoubleTap(MotionEvent e, float x, float y) {

            }

            @Override
            public void onHighlight(Entry entry, int entryIndex, float x, float y) {

            }

            @Override
            public void onCancelHighlight() {

            }
        });
        return result;
    }

}
