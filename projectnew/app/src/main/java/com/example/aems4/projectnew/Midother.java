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

public class Midother extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("อุทยานหุ่นขี้ผึ้งสยาม","อุทยานหุ่นขี้ผึ้งสยาม ราชบุรี",R.drawable.mokeebee));
        datas.add(new Data("ย่านตลาดน้อย ชุมชนเก่ากุฎีจีน","ย่านตลาดน้อย ชุมชนเก่ากุฎีจีน กรุงเทพ",R.drawable.mosantacluz));
        datas.add(new Data("รีสอร์ท บางพลัด กรุงเทพ","รีสอร์ท บางพลัด กรุงเทพฯ ย้อนยุคสู่อดีตที่เรียบง่าย",R.drawable.mobangplad));
        datas.add(new Data("ตลาดพลู","ตลาดพลู กรุงเทพ",R.drawable.motaladpu));
        datas.add(new Data("พิพิธภัณฑสถานแห่งชาติพระนคร","พิพิธภัณฑสถานแห่งชาติพระนคร กรุงเทพ",R.drawable.mopipisatan));
        datas.add(new Data("พิพิธภัณฑ์บ้านไทย จิม ทอมป์สัน","พิพิธภัณฑ์บ้านไทย จิม ทอมป์สัน กรุงเทพ",R.drawable.mojimtomson));
        datas.add(new Data("ท่ามหาราช คอมมูนิตี้","ท่ามหาราช คอมมูนิตี้ กรุงเทพ",R.drawable.motamaharad));
        datas.add(new Data("ท้องฟ้าจำลอง","ท้องฟ้าจำลอง  กรุงเทพ",R.drawable.motongfajumlong));
        datas.add(new Data("บ้านศิลปิน","บ้านศิลปิน คลองบางหลวง กรุงเทพ",R.drawable.mobansinlapin));
        datas.add(new Data("วังหลัง","ตลาดนัดวังหลัง กรุงเทพ",R.drawable.mowanglang));






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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานหุ่นขี้ผึ้งสยาม/"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://travel.trueid.net/detail/7xnBxlJbJJz"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/รีสอร์ท-บางพลัด-กรุงเทพ/"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.letseatthailand.com/ร้านดังตลาดพลู/"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.virtualmuseum.finearts.go.th/bangkoknationalmuseums/index.php/th/"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://thai.tourismthailand.org/Accessibility/สถานที่ท่องเที่ยว/พิพิธภัณฑ์บ้านจิม-ทอมป์สัน--2136"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view114655.html"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view14011.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/central/bangkok/klongbangluang.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.painaidii.com/business/134067/wang-lang-market-10700/lang/th/"));
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
