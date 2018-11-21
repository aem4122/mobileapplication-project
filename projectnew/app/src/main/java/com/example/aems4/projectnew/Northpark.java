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

public class Northpark extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("ดอยอินทนนท์","ดอยอินทนนท์, เชียงใหม่",R.drawable.np1));
        datas.add(new Data("ดอยอ่างขาง","ดอยอ่างขาง, เชียงใหม่",R.drawable.np2));
        datas.add(new Data("อุทยานแห่งชาติห้วยน้ำดัง","อุทยานแห่งชาติห้วยน้ำดัง, เชียงใหม่",R.drawable.np3));
        datas.add(new Data("ภูชี้ฟ้า","ภูชี้ฟ้า, เชียงราย",R.drawable.np4));
        datas.add(new Data("พระตำหนักดอยตุงและสวนแม่ฟ้าหลวง",".พระตำหนักดอยตุงและสวนแม่ฟ้าหลวง เชียงใหม่",R.drawable.np5));
        datas.add(new Data("อุทยานแห่งชาติศรีน่าน"," อุทยานแห่งชาติศรีน่าน",R.drawable.np6));
        datas.add(new Data("อุทยานแห่งชาติขุนสถาน"," อุทยานแห่งชาติขุนสถาน ",R.drawable.np7));
        datas.add(new Data("ปางอุ๋ง","ปางอุ๋ง, แม่ฮ่องสอน",R.drawable.np8));
        datas.add(new Data("ดอยแม่อูคอ"," ดอยแม่อูคอ, แม่ฮ่องสอน  ",R.drawable.np9));
        datas.add(new Data("ดอยผาตั้ง, เชียงราย","ดอยผาตั้ง, เชียงราย",R.drawable.np10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.sanook.com/travel/1401037/"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/%E0%B9%80%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%A7%E0%B8%94%E0%B8%AD%E0%B8%A2%E0%B8%AD%E0%B9%88%E0%B8%B2%E0%B8%87%E0%B8%82%E0%B8%B2%E0%B8%87\n"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://travel.mthai.com/blog/39683.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view675.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.mthai.com/region/north/102171.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view74599.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.mthai.com/blog/86320.html"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view183797.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view182047.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://travel.mthai.com/blog/42750.html"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
