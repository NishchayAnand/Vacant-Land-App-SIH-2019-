package com.example.android.a2page;

import java.util.ArrayList;

public class ViewPagerData {

    private  ArrayList<ViewPager_listDatatype> viewpagerList = new ArrayList<>();

    public ViewPagerData(){}

    public  ArrayList<ViewPager_listDatatype> getViewpagerList(){

        viewpagerList.add(new ViewPager_listDatatype(R.drawable.brochure,"Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        viewpagerList.add(new ViewPager_listDatatype(R.drawable.sticker,"Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        viewpagerList.add(new ViewPager_listDatatype(R.drawable.poster,"Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));
        viewpagerList.add(new ViewPager_listDatatype(R.drawable.namecard,"Namecard", "Business cards are cards bearing business information about a company or individual."));

        return viewpagerList;
    }
}
