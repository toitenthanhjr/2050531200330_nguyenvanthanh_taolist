package com.example.taolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAN> arrayList;
        AdapterMonAn adapter;

        listView=findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAN("Nguyễn Văn Thanh","cơm chiên",R.drawable.comchien,"3$"));
        arrayList.add(new MonAN("2050531200330","pizza",R.drawable.pizza,"9$"));
        arrayList.add(new MonAN("bánh mì","hamburger ",R.drawable.banhmi,"5$"));
        arrayList.add(new MonAN("bánh lọc","bánh bột lọc",R.drawable.banhloc,"4$"));
        arrayList.add(new MonAN("mì xào","mì tôm xào",R.drawable.mixao,"6$"));

        adapter = new AdapterMonAn(MainActivity.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,comchien.class);
                    startActivity(intent);
                }

            }
        });


    }
}