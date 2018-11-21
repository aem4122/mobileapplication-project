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

public class Southshop extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("ห้างโอเชี่ยนช็อปปิ้งมอลล์ ","ห้างโอเชี่ยนช็อปปิ้งมอลล์ จ.ชุมพร ",R.drawable.sm1));
        datas.add(new Data("ไดอาน่า คอมแพล็กซ์","ไดอาน่า คอมแพล็กซ์ จ.สงขลา",R.drawable.sm2));
        datas.add(new Data("เซ็นทรัลเฟสติวัล หาดใหญ่ ","เซ็นทรัลเฟสติวัล หาดใหญ่ จ.สงขลา จ.พังงา ",R.drawable.sm3));
        datas.add(new Data("จังซีลอน ภูเก็ต ","จังซีลอน ภูเก็ต ",R.drawable.sm4));
        datas.add(new Data("เซ็นทรัลเฟสติวัลภูเก็ต ","เซ็นทรัลเฟสติวัลภูเก็ต ",R.drawable.sm5));
        datas.add(new Data("โรบินสัน นครศรีธรรมราช  ","โรบินสัน นครศรีธรรมราช ",R.drawable.sm6));
        datas.add(new Data("เซ็นทรัลพลาซ่า ","เซ็นทรัลพลาซ่า จ.สุราษฎร์ธานี",R.drawable.sm7));
        datas.add(new Data("Vogue Shopping Center ่ ","Vogue Shopping Center จ.กระบี่",R.drawable.sm8));
        datas.add(new Data("ROBINSON,โรบินสัน ","ROBINSON,โรบินสัน จ.ตรัง ",R.drawable.sm9));
        datas.add(new Data("CentralPlaza ","CentralPlaza จ.นครศรีธรรมราช ",R.drawable.sm10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/215671/ocean-shopping-mall/reviews/12163"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g297921-d13368316-Reviews-Diana_Complex_Shopping_Center-Hat_Yai_Songkhla_Province.html\n"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g297921-d7084870-Reviews-CentralFestival_Hatyai-Hat_Yai_Songkhla_Province.html\n"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g297930-d3387563-Reviews-Jungceylon-Paton"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://novotelphuketkaron.com/th/destination/shopping-entertainment/central-festival-phuket"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wongnai.com/places/robinson-ocean-department-store-nakhon-si-thammarat"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.painaidii.com/business/144129/photo/"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wongnai.com/places/vogue-department-store-krabi"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.foursquare.com/v/robinson-lifestyle-center-trang-%E0%B9%82%E0%B8%A3%E0%B8%9A%E0%B8%99%E0%B8%AA%E0%B8%99-%E0%B9%84%E0%B8%A5%E0%B8%9F%E0%B8%AA%E0%B9%84%E0%B8%95%E0%B8%A5-%E0%B9%80%E0%B8%8B%E0%B8%99%E0%B9%80%E0%B8%95%E0%B8%AD%E0%B8%A3-%E0%B8%95%E0%B8%A3%E0%B8%87/4c32c00766e40f472c07c78b"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paapaii.com/travel-centralplazanakhonsithammarat/\n"));
                    startActivity(browserIntent);

                }

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
