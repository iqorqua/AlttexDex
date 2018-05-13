package com.app.altex.alttexdex.fragments;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.app.altex.alttexdex.R;

import java.util.ArrayList;
import java.util.List;

import ir.apend.slider.model.Slide;
import ir.apend.slider.ui.Slider;

/**
 * A simple {@link Fragment} subclass.
 */
public class RechangeFragment extends Fragment {


    public RechangeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_rechange, container, false);
        // Inflate the layout for this fragment
        Slider slider = result.findViewById(R.id.slider);

        List<Slide> slideList = new ArrayList<>();

//create list of slides
        slideList.add(new Slide(0, getURLForResource(R.drawable.credit) , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide(1,getURLForResource(R.drawable.credit1) , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));
        slideList.add(new Slide(2,getURLForResource(R.drawable.credit2) , getResources().getDimensionPixelSize(R.dimen.slider_image_corner)));

//handle slider click listener
        slider.setItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //do what you want
            }
        });

//add slides to slider
        slider.addSlides(slideList);
        return result;
    }
    public String getURLForResource (int resourceId) {
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }
}
