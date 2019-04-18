package com.example.gpi.gridview_listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by GPI on 2/16/2018.
 */

public class My_custom_adapter_class extends BaseAdapter {
    public Integer[] image_array ={R.drawable.abc,R.drawable.facebook,R.drawable.logo};

    private Context mContext; /// this is private class we have to make it public

    public My_custom_adapter_class(Context c){
        mContext =c;
    }

    @Override
    public int getCount() {
        return image_array.length;
        //return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView;

        if (view==null){
            imageView  = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(100,100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(image_array[position]);
        return imageView;
    }
}
