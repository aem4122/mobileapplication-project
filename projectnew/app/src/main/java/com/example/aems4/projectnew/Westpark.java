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

public class Westpark extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("สามพันโบก ","สามพันโบก อุบลราชธานี",R.drawable.ep1));
        datas.add(new Data("หาดชมดาว ","หาดชมดาว อุบลราชธานี ",R.drawable.ep2));
        datas.add(new Data("ทุ่งดอกไม้ป่าดงนาทาม","ทุ่งดอกไม้ป่าดงนาทาม อุบลราชธานี",R.drawable.ep3));
        datas.add(new Data("ผาชนะได ","ผาชนะได อุบลราชธานี ",R.drawable.ep4));
        datas.add(new Data("ปราสาทเมืองต่ำ  ","ปราสาทเมืองต่ำ จังหวัดบุรีรัมย์",R.drawable.ep5));
        datas.add(new Data("น้ำตกแสงจันทร์ย","น้ำตกแสงจันทร์ อุบลราชธานี ",R.drawable.ep6));
        datas.add(new Data("ทะเลบัวแดง","ทะเลบัวแดง อุดรธานี",R.drawable.ep7));
        datas.add(new Data("ภูห้วยอีสัน ","ภูห้วยอีสัน หนองคาย ",R.drawable.ep8));
        datas.add(new Data("ภูป่าเปราะ ","ภูป่าเปราะ  ",R.drawable.ep9));
        datas.add(new Data("ภูลมโล ","ภูลมโล  เลย",R.drawable.ep10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/Northeast/ubonratchathani/samphanboke.html"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/ubonratchathani/hadchomdaw.html"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://paiduaykan.com/province/Northeast/ubonratchathani/dongnatham.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/ubonratchathani/dongnatham.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/Northeast/ubonratchathani/sangjunwaterfall.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/%20http:/www.paiduaykan.com/province/Northeast/udonthani/buadaeng.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/nongkhai/phuhuayesan.html"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.paiduaykan.com/province/Northeast/loie/phupapoh.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.paiduaykan.com/province/Northeast/loie/phulomlo.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.paiduaykan.com/travel/%E0%B9%80%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%A7%E0%B8%99%E0%B8%B2%E0%B9%81%E0%B8%AB%E0%B9%89%E0%B8%A7"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
