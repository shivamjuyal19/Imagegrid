package com.example.pc77.imagegrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter{
    int images[];
    Context context;
    LayoutInflater in;
    public CustomAdapter(Context applicationContext, int[] images) {
        this.context=applicationContext;
        this.images=images;
        in=LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup){
        view=in.inflate(R.layout.gridlayout,null);
        ImageView icon= view.findViewById(R.id.imageView);
        icon.setImageResource(images[i]);
        return view;
    }
}
