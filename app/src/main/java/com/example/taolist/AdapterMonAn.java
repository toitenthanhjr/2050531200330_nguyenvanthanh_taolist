package com.example.taolist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMonAn extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MonAN> arraylist;

    public AdapterMonAn(Context context, int layout, List<MonAN> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return arraylist.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);
        MonAN monAN = arraylist.get(position);
        //anh xa
        TextView textView1 = convertView.findViewById(R.id.name);
        TextView textView2 =convertView.findViewById(R.id.mota);
        TextView textView3 =convertView.findViewById(R.id.gia);
        ImageView imageV = convertView.findViewById(R.id.imageHinh);

        textView1.setText(monAN.getTenmon());
        textView2.setText(monAN.getMota());
        textView3.setText(monAN.getGia());
        imageV.setImageResource(monAN.getHinh());

        return convertView;
    }
}
