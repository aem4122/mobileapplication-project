package com.example.aems4.projectnew;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Southother extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("จุดชมวิวเสม็ดนางชี  ","จุดชมวิวเสม็ดนางชี จ.พังงา ",R.drawable.so1));
        datas.add(new Data("เมืองเก่าสงขลา ","เมืองเก่าสงขลา จ.สงขลา",R.drawable.so2));
        datas.add(new Data("เขื่อนรัชชประภา ","เขื่อนรัชชประภา จ.สุราษฎร์ธานี",R.drawable.so3));
        datas.add(new Data("ล่องแก่งหนามมดแดง ","ล่องแก่งหนามมดแดง จ.พัทลุง ",R.drawable.so4));
        datas.add(new Data("ป่าต้นน้ำ บ้านน้ำราด ","ป่าต้นน้ำ บ้านน้ำราด จ.สุราษฎร์ธานี",R.drawable.so5));
        datas.add(new Data("หมู่บ้านคีรีวง ","หมู่บ้านคีรีวง  จ.นครศรีธรรมราช",R.drawable.so6));







        listView =(ListView)findViewById(R.id.list_item);
        //String[] shop = new String[]{"Paragon","Central world"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, shop);
        MyAdapter adapter = new MyAdapter(this,datas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view142701.html"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view177200.html"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view165302.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view148879.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.mthai.com/region/151933.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view190262.html"));
                    startActivity(browserIntent);
                }

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
