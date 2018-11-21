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

public class Westtemple extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("วัดสิรินธรวรารามภูพร้าว ","วัดสิรินธรวรารามภูพร้าว  อุบลราชธานี",R.drawable.et1));
        datas.add(new Data("วัดป่าภูก้อน","วัดป่าภูก้อน อุดรธานีี ",R.drawable.et2));
        datas.add(new Data("วัดผาตากเสื้อ","วัดผาตากเสื้อ  หนองคาย",R.drawable.et3));
        datas.add(new Data("พระเจดีย์มิ่งมงคล ","พระเจดีย์มิ่งมงคล ร้อยเอ็ด",R.drawable.et4));
        datas.add(new Data("วัดป่ากุง ร้อยเอ็ด   ","พระเจดีย์มหามงคลบัว",R.drawable.et5));
        datas.add(new Data("วัดบูรพาภิราม","วัดบูรพาภิราม์ อุบลราชธานี ",R.drawable.et7));
        datas.add(new Data("พระธาตุนาดูน","พระธาตุนาดูน",R.drawable.et8));
        datas.add(new Data("พระธาตุพนม  ","พระธาตุพนม  นครพนม",R.drawable.et9));
        datas.add(new Data("พระธาตุเรณูนคร  ","พระธาตุเรณูนคร ",R.drawable.et10));
        datas.add(new Data("พระเจดีย์มหามงคลบัว ","พระเจดีย์มหามงคลบัว",R.drawable.et6));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/Northeast/ubonratchathani/watsirintorn.html"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://watpaphukon.org"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/nongkhai/watphataksue.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/Northeast/roiet/prajadeechaimongkol.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/Northeast/roiet/watpakung.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/roiet/watbhurapaphiram.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/mahasarakham/pratadnadune.html"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/nakhonphanom/prathatphanom.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/nakhonphanom/prathatpharenu.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://paiduaykan.com/province/Northeast/roiet/mahamongkolbua.html"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
