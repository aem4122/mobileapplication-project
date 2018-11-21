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

public class Westother extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("สะพานไม้แกดำ ","สะพานไม้แกดำ มหาสารคาม",R.drawable.eo1));
        datas.add(new Data("ทุ่งดอกกระเจียว ","ทุ่งดอกกระเจียว ชัยภูมิ ",R.drawable.eo2));
        datas.add(new Data("มอหินขาว ","มอหินขาว ชัยภูมิ ",R.drawable.eo3));
        datas.add(new Data("ปราสาทหินพนมรุ้ง  ","ปราสาทหินพนมรุ้ง บุรีรัมย์ ",R.drawable.eo4));
        datas.add(new Data("ปราสาทเมืองต่ำ  ","ปราสาทเมืองต่ำ จังหวัดบุรีรัมย์",R.drawable.eo5));
        datas.add(new Data("สนามไอ-โมบาย","สนามไอ-โมบาย จังหวัดบุรีรัมย์ ",R.drawable.eo6));
        datas.add(new Data("เพลา เพลิน บุรีรัมย์ ","เพลา เพลิน บุรีรัมย์",R.drawable.eo7));
        datas.add(new Data("หาดทรายทองศรีโคตรบูร","หาดทรายทองศรีโคตรบูร ",R.drawable.eo8));
        datas.add(new Data("สะพานมิตรภาพไทย-ลาว ","สะพานมิตรภาพไทย-ลาว 3 นครพนม  ",R.drawable.eo9));
        datas.add(new Data("พิพิธภัณฑ์พญาคันคาก ","พิพิธภัณฑ์พญาคันคาก  ",R.drawable.eo10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/%E0%B8%AA%E0%B8%B0%E0%B8%9E%E0%B8%B2%E0%B8%99%E0%B9%84%E0%B8%A1%E0%B9%89%E0%B9%81%E0%B8%81%E0%B8%94%E0%B8%B3"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/76_province/Northeast/chaiyaphum/hinngam.html"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://paiduaykan.com/76_province/Northeast/chaiyaphum/mohinkhao.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://paiduaykan.com/province/Northeast/buriram/phanomrung.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://paiduaykan.com/province/Northeast/buriram/muangtum.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/buriram/imobile-stadium.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/%E0%B9%80%E0%B8%9E%E0%B8%A5%E0%B8%B2%E0%B9%80%E0%B8%9E%E0%B8%A5%E0%B8%B4%E0%B8%99"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/nakhonphanom/hadsaithong.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.paiduaykan.com/province/Northeast/nakhonphanom/thailaosbridge3.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://paiduaykan.com/province/Northeast/yasothon/phayakunkakmuseum.html"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
