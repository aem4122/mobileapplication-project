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

public class Midtemple extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("วัดพระเเก้ว","วัดพระเเก้ว จังหวัดกรุงเทพ",R.drawable.mtkaew));
        datas.add(new Data("วัดระฆัง","ัวัดระฆัง จังหวัดกรุงเทพ",R.drawable.mtbell));
        datas.add(new Data("วัดกัลยาณมิตรวรมหาวิหาร","วัดกัลยาณมิตรวรมหาวิหาร กรุงเทพ",R.drawable.mtkanlaya));
        datas.add(new Data("วัดเขารูปช้าง","วัดเขารูปช้าง พิจิตร",R.drawable.mtkaouchang));
        datas.add(new Data("วัดข่อย","ัวัดข่อย  เพชรบุรี",R.drawable.mtkoi));
        datas.add(new Data("วัดคีรีวงศ์","วัดคีรีวงศ์  นครสวรรค์",R.drawable.mtkirewong));
        datas.add(new Data("วัดถ้ำเสือ","วัดถ้ำเสือ กาญจนบุรี  ",R.drawable.mtmoutentiger));
        datas.add(new Data("วัดถ้ำพุหว้า","วัดถ้ำพุหว้า  กาญจนบุรี",R.drawable.mtthampuwa));
        datas.add(new Data("วัดท่าซุง","วัดท่าซุง อุทัยทานี ",R.drawable.mttasung));
        datas.add(new Data("วัดบวรนิเวศวิหาร","วัดบวรนิเวศวิหาร กรุงเทพ  ",R.drawable.mtbawon));
        datas.add(new Data("วัดบางกุ้ง"," ัดบางกุ้ง สมุทรสงคราม ",R.drawable.mtbangkung));
        datas.add(new Data("วัดพระเชตุพนวิมลมังคลารามราชวรมหาวิหาร","วัดโพธิ กรุงเทพ  ",R.drawable.mtpo));
        datas.add(new Data("วัดม่วง","วัดม่วง  อ่างทอง",R.drawable.mtmung));
        datas.add(new Data("วัดป่าสว่างบุญ","วัดป่าสว่างบุญ  สระบุรี",R.drawable.mtsawangbun));
        datas.add(new Data("วัดพระธาตุผาซ่อนแก้ว"," วัดพระธาตุผาซ่อนแก้ว  เพชรบูรณ์",R.drawable.mtpasonkweaw));
        datas.add(new Data("วัดพิพัฒน์มงคล","วัดพิพัฒน์มงคล  สุโขทัย ",R.drawable.mtpipat));
        datas.add(new Data("วัดมหาธาตุ"," วัดมหาธาตุ อยุธยา",R.drawable.mtmahatad));
        datas.add(new Data("วัดอรุณราชวรารามวรมหาวิหาร","วัดอรุณราชวรารามวรมหาวิหาร กรุงเทพ",R.drawable.mtarun));
       /* datas.add(new Data("","  ",R.drawable.mt));
        datas.add(new Data("","  ",R.drawable.mt));*/







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view1024.html"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/bangkok/watrakhang.php"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thetrippacker.com/th/review/วัดกัลยาณมิตรวรมหาวิหารWatKalayanamitrWoramahawihara/5415"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sbl.co.th/ดูหน้า-22731-วัดเขารูปช้าง.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g297932-d10061016-Reviews-Wat_Koi-Phetchaburi_Phetchaburi_Province.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/north/nakhonsawan/watkiriwong.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/central/kanjanaburi/wathumsua.html"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/central/kanjanaburi/watthampuwa.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/north/uthaithani/watthasung.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("www.dhammathai.org/watthai/bangkok/watbowon.php"));
                    startActivity(browserIntent);
                }
                /*if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.wikipedia.org/wiki/เอ็มโพเรียม"));
                    startActivity(browserIntent);
                }*/
                if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/central/samutsongkhram/prokpoe.html"));
                    startActivity(browserIntent);
                } if(position==11){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/bangkok/watpho.php"));
                    startActivity(browserIntent);
                }
                if(position==12){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.mthai.com/blog/124487.html"));
                    startActivity(browserIntent);
                }
                if(position==13){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/central/saraburi/watpaswangbun.html"));
                    startActivity(browserIntent);
                } if(position==14){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/north/phetchabun/pratadphakaew.html"));
                    startActivity(browserIntent);
                }
                if(position==15){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/north/sukhothai/watpipatmongkol.html"));
                    startActivity(browserIntent);
                }
                if(position==16){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/central/ayutthaya/watpramahathat.html"));
                    startActivity(browserIntent);
                } if(position==17){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/bangkok/watarun.php"));
                    startActivity(browserIntent);
                }
                /*if(position==18){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/the-circle"));
                    startActivity(browserIntent);
                }
                if(position==19){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.2madames.com/the-paseo-park-kanchanapisek-new-japanese-community-mall/"));
                    startActivity(browserIntent);
                }*/

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
