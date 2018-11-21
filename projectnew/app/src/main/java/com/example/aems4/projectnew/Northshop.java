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

public class Northshop extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("เซ็นทรัลเฟสติวัลเชียงใหม่ ","เซ็นทรัลเฟสติวัล จ.เชียงใหม่ ่",R.drawable.nm1));
        datas.add(new Data("เซ็นทรัลพลาซา เชียงใหม่ แอร์พอร์ต ","เซ็นทรัลพลาซา เชียงใหม่ แอร์พอร์ต จ.เชียงใหม่",R.drawable.nm2));
        datas.add(new Data("พรอมเมนาดา รีสอร์ท มอลล์ ","พรอมเมนาดา รีสอร์ท มอลล์ จ.เชียงใหม่",R.drawable.nm3));
        datas.add(new Data("เมญ่า เชียงใหม่","เมญ่า เชียงใหม่ จ.เชียงใหม่",R.drawable.nm4));
        datas.add(new Data("อุทยานการค้ากาดสวนแก้ว","อุทยานการค้ากาดสวนแก้ว จ.เชียงใหม่",R.drawable.nm5));
        datas.add(new Data("เซ็นทรัลพลาซา พิษณุโลก ","เซ็นทรัลพลาซา พิษณุโลก ",R.drawable.nm6));
        datas.add(new Data("แฟรี่แลนด์"," แฟรี่แลนด์ นครสวรรค์ ",R.drawable.nm7));
        datas.add(new Data("เซ็นทรัลพลาซ่า เชียงราย  ","เซ็นทรัลพลาซ่า เชียงราย ",R.drawable.nm8));
        datas.add(new Data("โรบินสัน เชียงราย","โรบินสัน จ.เชียงราย ",R.drawable.nm9));
        datas.add(new Data("Seree lampang","Seree lampang จ.ลำปาง",R.drawable.nm10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.topchiangmai.com/shopping/central-festival-chiangmai/\n"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.topchiangmai.com/shopping/%E0%B9%80%E0%B8%8B%E0%B9%87%E0%B8%99%E0%B8%97%E0%B8%A3%E0%B8%B1%E0%B8%A5-%E0%B9%81%E0%B8%AD%E0%B8%A3%E0%B9%8C%E0%B8%9E%E0%B8%AD%E0%B8%A3%E0%B9%8C%E0%B8%95-centralplaza-chiangmai-airport/"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.topchiangmai.com/shopping/promenada-resort-mall/"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.topchiangmai.com/shopping/maya-chiangmai/"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.topchiangmai.com/shopping/%E0%B9%80%E0%B8%8B%E0%B9%87%E0%B8%99%E0%B8%97%E0%B8%A3%E0%B8%B1%E0%B8%A5-%E0%B8%81%E0%B8%B2%E0%B8%94%E0%B8%AA%E0%B8%A7%E0%B8%99%E0%B9%81%E0%B8%81%E0%B9%89%E0%B8%A7-central-kad-suan-kaew/\n"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.painaidii.com/business/137523/central-plaza-phitsanulok-65000/lang/th/"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.painaidii.com/business/134235/fairy-land-department-store-60000/lang/thThe/?page=1&mode=desktop"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g297920-d3671115-Reviews-CentralPlaza_Chiangrai-Chiang_Rai_Chiang_Rai_Province.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://store.robinson.co.th/store-chiangrai.html\n"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.foursquare.com/v/%E0%B8%AB%E0%B8%B2%E0%B8%87%E0%B9%80%E0%B8%AA%E0%B8%A3%E0%B8%AA%E0%B8%A3%E0%B8%A3%E0%B8%9E%E0%B8%AA%E0%B8%99%E0%B8%84%E0%B8%B2-seri-department-store/4bab6055f964a52090a43ae3"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
