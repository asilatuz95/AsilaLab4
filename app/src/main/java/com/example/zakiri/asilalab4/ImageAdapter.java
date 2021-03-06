package com.example.zakiri.asilalab4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Zakiri on 5/10/2017.
 */

public class ImageAdapter extends BaseAdapter{


        private Context mContext;

        public Integer[] mThumbsId = {
                R.drawable.pic_1,
                R.drawable.pic_2,
                R.drawable.pic_3,
                R.drawable.pic_4,
                R.drawable.pic_5,
                R.drawable.pic_6,
                R.drawable.pic_7,
                R.drawable.pic_8,
                R.drawable.pic_9


        };

        public ImageAdapter(Context c){
            mContext = c;
        };

        @Override
        public int getCount(){
            return mThumbsId.length;
        };

        @Override
        public Object getItem(int position){
            return mThumbsId[position];
        };

        @Override
        public long getItemId(int position){
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbsId[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(250,250));
            return imageView;
        }

}
