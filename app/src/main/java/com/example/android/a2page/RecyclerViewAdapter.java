package com.example.android.a2page;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<ViewPager_listDatatype> recyclerViewList;
    private Context mContext;


    public RecyclerViewAdapter(ArrayList<ViewPager_listDatatype> list, Context context) {
        this.recyclerViewList = list;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.imageView.setImageResource(recyclerViewList.get(position).getImage());
        holder.locationView.setText(recyclerViewList.get(position).getTitle());
        holder.descView.setText(recyclerViewList.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return (new RecyclerViewData()).getRecyclerViewList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView locationView;
        TextView descView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recyclerViewItem_imageView);
            locationView = (TextView) itemView.findViewById(R.id.recyclerView_title);
            descView = (TextView) itemView.findViewById(R.id.recyclerView_desc);
        }
    }
}
