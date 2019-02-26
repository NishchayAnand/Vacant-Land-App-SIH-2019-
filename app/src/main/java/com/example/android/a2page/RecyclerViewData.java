package com.example.android.a2page;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewData {

    private ArrayList<ViewPager_listDatatype> recyclerViewList = new ArrayList<>();

    public RecyclerViewData() {
    }

    public ArrayList<ViewPager_listDatatype> getRecyclerViewList() {

        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.brochure, "Brochure", "description"));
        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.sticker, "Sticker", "description"));
        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.poster, "Poster", "description"));
        recyclerViewList.add(new ViewPager_listDatatype(R.drawable.namecard, "Namecard", "description"));

        return recyclerViewList;
    }
}
