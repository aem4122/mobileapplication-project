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

public class Midmarket extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("JJ GREEN","JJ GREEN กรุงเทพ",R.drawable.mmkjjgreen));
        datas.add(new Data("เยาวราช","เยาวราช กรุงเทพ",R.drawable.mmkyaoiwarad));
        datas.add(new Data("เอเชียทีค เดอะ ริเวอร์ ฟรอนต์"," เอเชียทีค เดอะ ริเวอร์ ฟรอนต์  กรุงเทพ",R.drawable.mmkasiateek));
        datas.add(new Data("โชคชัย 4"," โชคชัย 4 กรุงเทพ",R.drawable.mmkchokchai4));
        datas.add(new Data("ช่างชุ่ย","ช่างชุ่ย กรุงเทพ",R.drawable.mmkchangcui));
        datas.add(new Data("ตลาดเก้าห้อง","ตลาดเก้าห้อง ย ้อนรอยตำนานเสือแห่งเมืองสุพรรณ",R.drawable.mmk9room));
        datas.add(new Data("ตลาดโก้งโค้ง","ตลาดโก้งโค้ง พระนครศรีอยุธยา",R.drawable.mmkkong));
        datas.add(new Data("ตลาดท่านา","ตลาดท่านา อ.นครชัยศรี จ.นครปฐม",R.drawable.mmktana));
        //datas.add(new Data("","  ",R.drawable.mmk));
        datas.add(new Data("ตลาดน้ำโบราณบางพลี","ตลาดน้ำโบราณบางพลี ตลาดน้ำแห่งเมืองสมุทรปราการ",R.drawable.mmkbangpe));
        datas.add(new Data("ตลาดน้ำไทรน้อย","ตลาดน้ำไทรน้อย วัดไทรใหญ่ จ.นนทบุรี",R.drawable.mmktainoi));
        datas.add(new Data("ตลาดน้ำกรุงเก่า"," ตลาดน้ำกรุงเก่า วัดท่าการ้อง จังหวัดพระนครศรีอยุธยา",R.drawable.mmkkrungold));
        datas.add(new Data("ตลาดน้ำขวัญเรียม","ตลาดน้ำขวัญเรียม กรุงเทพ",R.drawable.mmkkwanriem));
        datas.add(new Data("ตลาดน้ำดอนหวาย","ตลาดน้ำดอนหวาย นครปฐม",R.drawable.mmkdonwai));
        datas.add(new Data("ตลาดน้ำตลิ่งชัน","ตลาดน้ำตลิ่งชัน กรุงเทพ",R.drawable.mmktalingchun));
        datas.add(new Data("ตลาดน้ำลัดคลองมะยม","ตลาดน้ำลัดคลองมะยม กรุงเทพ",R.drawable.mmkludkongmayom));
        datas.add(new Data("ตลาดน้ำอัมพวา","ตลาดน้ำอัมพวา สมุทรสงคราม",R.drawable.mmkaumpawa));
        datas.add(new Data("ตลาดระแหง","ตลาดระแหง ตลาดโบราณร้อยปี อ.ลาดหลุมแก้ว จ.ปทุมธานี",R.drawable.mmkrahang));
        datas.add(new Data("ล้ง 1919","ล้ง 1919 กรุงเทพ",R.drawable.mmklung191));
        datas.add(new Data("ตลาดลาดชะโด","ตลาดลาดชะโด เที่ยวตลาดโบราณ อ.ผักไห่ จ.พระนครศรีอยุธยา",R.drawable.mmkchado));
        datas.add(new Data("ตลาดน้ำวัดสะพาน","ตลาดน้ำวัดสะพาน ตลาดน้ำชานเมือง กรุงเทพมหานคร",R.drawable.mmksapan));






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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wongnai.com/beauty-tips/shopping-guide-jj-green"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view116439.html"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.painaidii.com/business/137981/asiatique-the-riverfront-10120/lang/thTh/"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travelkanuman.com/food/eat24cc4/"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.mthai.com/blog/151456.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดเก้าห้อง-บางปลาม้า-สุพรรณบุรี/"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดโก้งโค้ง-ตลาดโบราณ-พระนครศรีอยุธยา/"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดท่านา-นครชัยศรี-นครปฐม/"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดน้ำโบราณบางพลี-สมุทรปราการ"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดน้ำไทรน้อย-วัดไทรใหญ่-นนทบุรี"));
                    startActivity(browserIntent);
                }

                if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดน้ำกรุงเก่า-วัดท่าการ้อง-อยุธยา/"));
                    startActivity(browserIntent);
                } if(position==11){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view41016.html"));
                    startActivity(browserIntent);
                }
                if(position==12){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/ตลาดน้ำดอนหวาย"));
                    startActivity(browserIntent);
                }
                if(position==13){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://com2ine.com/travel/taling-chan-floating-market-bangkok/"));
                    startActivity(browserIntent);
                } if(position==14){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/central/bangkok/kongladmayom.html"));
                    startActivity(browserIntent);
                }
                if(position==15){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดน้ำอัมพวา-ตลาดน้ำยามเย็น-สมุทรสงคราม/"));
                    startActivity(browserIntent);
                }
                if(position==16){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดระแหง-โบราณร้อยปี-ปทุมธานี/"));
                    startActivity(browserIntent);
                } if(position==17){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.govivigo.com/news-promotions/2221-เปิดแล้ว-ล้ง-1919-LHONG-1919-ที่เที่ยวใหม่-ใจกลางกรุงเทพฯ"));
                    startActivity(browserIntent);
                }
                if(position==18){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดลาดชะโด-ตลาดโบราณ-พระนครศรีอยุธยา/"));
                    startActivity(browserIntent);
                }
                if(position==19){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ตลาดน้ำวัดสะพาน-กรุงเทพมหานคร/"));
                    startActivity(browserIntent);
                }

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
