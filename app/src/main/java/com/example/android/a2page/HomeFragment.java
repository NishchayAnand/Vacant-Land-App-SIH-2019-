package com.example.android.a2page;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext());

        ViewPager viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        ArrayList<ViewPager_listDatatype> recyclerViewList = new ArrayList<>();

        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.brochure, "Brochure", "description"));
        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.sticker, "Sticker", "description"));
        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.poster, "Poster", "description"));
        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.namecard, "Namecard", "description"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(recyclerViewList,getContext());
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }
}
