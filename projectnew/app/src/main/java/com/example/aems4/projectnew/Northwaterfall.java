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

public class Northwaterfall extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("น้ำตกขุนกรณ์","น้ำตกขุนกรณ์ จ.เชียงราย",R.drawable.nw1));
        datas.add(new Data("น้ำตกหมอกฟ้า "," น้ำตกหมอกฟ้า จ.เชียงใหม่  ",R.drawable.nw2));
        datas.add(new Data("น้ำตกผาดอกเสี้ยว","น้ำตกผาดอกเสี้ยว จ.เชียงใหม่",R.drawable.nw3));
        datas.add(new Data(" น้ำตกสะปัน ","ว น้ำตกสะปัน จ.น่าน",R.drawable.nw4));
        datas.add(new Data("น้ำตกธารสวรรค์ ","น้ำตกธารสวรรค์ จ.พะเยา",R.drawable.nw5));
        datas.add(new Data(" น้ำตกห้วยโรง"," น้ำตกห้วยโรง จ.แพร่ ",R.drawable.nw6));
        datas.add(new Data("น้ำตกผาเสื่อ "," น้ำตกผาเสื่อ จ.แม่ฮ่องสอน",R.drawable.nw7));
        datas.add(new Data(" น้ำตกพาเจริญ"," น้ำตกพาเจริญ จ.ตาก ",R.drawable.nw8));
        datas.add(new Data(" น้ำตกชาติตระการ"," น้ำตกชาติตระการ จ.พิษณุโลก ",R.drawable.nw9));
        datas.add(new Data("น้ำตกคลองลาน ","วน้ำตกคลองลาน จ.กำแพงเพชร ",R.drawable.nw10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chiangraifocus.com/%E0%B9%80%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%A7%E0%B9%80%E0%B8%8A%E0%B8%B5%E0%B8%A2%E0%B8%87%E0%B8%A3%E0%B8%B2%E0%B8%A2/11/%E0%B8%99%E0%B9%89%E0%B8%B3%E0%B8%95%E0%B8%81%E0%B8%82%E0%B8%B8%E0%B8%99%E0%B8%81%E0%B8%A3%E0%B8%93%E0%B9%8C-:-%E0%B8%99%E0%B9%89%E0%B8%B3%E0%B8%95%E0%B8%81%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%AA%E0%B8%B9%E0%B8%87%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%AA%E0%B8%B8%E0%B8%94%E0%B9%83%E0%B8%99%E0%B9%80%E0%B8%8A%E0%B8%B5%E0%B8%A2%E0%B8%87%E0%B8%A3%E0%B8%B2%E0%B8%A2"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view179951.html"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/north/chiangmai/phadokesiew.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.readme.me/p/16038"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("//www.sadoodta.com/attraction/%E0%B9%80%E0%B8%97%E0%B8%B5%E0%B9%88%E0%B8%A2%E0%B8%A7%E0%B8%99%E0%B9%89%E0%B8%B3%E0%B8%95%E0%B8%81%E0%B8%98%E0%B8%B2%E0%B8%A3%E0%B8%AA%E0%B8%A7%E0%B8%A3%E0%B8%A3%E0%B8%84%E0%B9%8C-%E0%B8%88%E0%B8%9E%E0%B8%B0%E0%B9%80%E0%B8%A2%E0%B8%B2"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.phrae.go.th/Tourist/RongkwangHoylong.htm"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xn--72c5aba9c2a3b8a2m8ae.com/%E0%B8%AD%E0%B8%B8%E0%B8%97%E0%B8%A2%E0%B8%B2%E0%B8%99%E0%B9%81%E0%B8%AB%E0%B9%88%E0%B8%87%E0%B8%8A%E0%B8%B2%E0%B8%95%E0%B8%B4%E0%B8%96%E0%B9%89%E0%B8%B3%E0%B8%9B%E0%B8%A5%E0%B8%B2-%E0%B8%99%E0%B9%89%E0%B8%B3%E0%B8%95%E0%B8%81%E0%B8%9C%E0%B8%B2%E0%B9%80%E0%B8%AA%E0%B8%B7%E0%B9%88%E0%B8%AD/"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xn--72c5aba9c2a3b8a2m8ae.com/%E0%B8%AD%E0%B8%B8%E0%B8%97%E0%B8%A2%E0%B8%B2%E0%B8%99%E0%B9%81%E0%B8%AB%E0%B9%88%E0%B8%87%E0%B8%8A%E0%B8%B2%E0%B8%95%E0%B8%B4%E0%B8%99%E0%B9%89%E0%B8%B3%E0%B8%95%E0%B8%81%E0%B8%9E%E0%B8%B2%E0%B9%80%E0%B8%88%E0%B8%A3%E0%B8%B4%E0%B8%8D-%E0%B8%95%E0%B8%B2%E0%B8%81/"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.touronthai.com/article/416"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.mthai.com/blog/87437.html\n"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
