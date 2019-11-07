package com.example.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;

    int[] images;

    String[] countrynames;

    private LayoutInflater inflater;


    CustomAdapter(Context context, int[] images, String[] countrynames){

        this.context = context;

        this.countrynames = countrynames;

        this.images = images;


    }


    @Override
    public int getCount() {
        return countrynames.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.samplelayout, viewGroup, false);
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewId);

        TextView textView = (TextView) view.findViewById(R.id.textViewid);

        imageView.setImageResource(images[i]);
        textView.setText(countrynames[i]);



        return view;
    }
}
