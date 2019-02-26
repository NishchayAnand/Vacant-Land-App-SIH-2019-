package com.example.android.a2page;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private LayoutInflater layoutInflater;
    private Context mContext;

    public ViewPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return (new ViewPagerData()).getViewpagerList().size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.viewpager_item_layout, container, false);

        ImageView image;
        TextView title, desc;

        image = view.findViewById(R.id.viewpagerItem_imageView);
        title = view.findViewById(R.id.viewpager_title);
        desc = view.findViewById(R.id.viewpager_desc);

        image.setImageResource((new ViewPagerData()).getViewpagerList().get(position).getImage());
        title.setText((new ViewPagerData()).getViewpagerList().get(position).getTitle());
        desc.setText((new ViewPagerData()).getViewpagerList().get(position).getDesc());

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
