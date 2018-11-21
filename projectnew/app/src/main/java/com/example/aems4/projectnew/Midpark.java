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

public class Midpark extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("เที่ยวเขาค้อ","เที่ยวเขาค้อ แดนแห่งขุนเขาและทะเลหมอก เมืองเพชรบูรณ์",R.drawable.mpkaokor));
        datas.add(new Data("น้ำตกเจ็ดสาวน้อย","น้ำตกเจ็ดสาวน้อย สถานที่ท่องเที่ยวชื่อดังแห่ง อ.มวกเหล็ก จ.สระบุรี",R.drawable.mp7girl));
        datas.add(new Data("ผากล้วยไม้"," ผากล้วยไม้ เหวสุวัต",R.drawable.mpbanana));
        datas.add(new Data("หุบป่าตาด","หุบป่าตาด สำรวจถ้ำป่าดงดิบดึกดําบรรพ์",R.drawable.mptrad));
        datas.add(new Data("วังภูไพร","วังภูไพร ฟาร์มสเตย์ นครราชสีมา ชมวิถีชุมชนปลอดสารพิษ",R.drawable.mppupai));
        datas.add(new Data("อุทยานแห่งชาติน้ำหนาว","อุทยานแห่งชาติน้ำหนาว อำเภอน้ำหนาว จังหวัดเพชรบูรณ์",R.drawable.mpnum));
        datas.add(new Data("อุทยานแห่งชาติไทรโยค","อุทยานแห่งชาติไทรโยค กาญจนบุรี",R.drawable.mptaiyok));
        datas.add(new Data("อุทยานแห่งชาติตาดหมอก","อุทยานแห่งชาติตาดหมอก อ.เมือง เพชรบูรณ์",R.drawable.mptradmok));
        datas.add(new Data("อุทยานแห่งชาติเขาใหญ่","อุทยานแห่งชาติเขาใหญ่ จังหวัดนครราชสีมา",R.drawable.mpbigmountain));
        datas.add(new Data("อุทยานแห่งชาติน้ำตกสามหลั่น","อุทยานแห่งชาติน้ำตกสามหลั่น อำเภอเมือง จังหวัดสระบุรี",R.drawable.mp3run));
        datas.add(new Data("อุทยานแห่งชาติแก่งกระจาน","อุทยานแห่งชาติแก่งกระจาน เพชรบุรี",R.drawable.mpkangkajan));
        datas.add(new Data("อุทยานแห่งชาติเอราวัณ","อุทยานแห่งชาติเอราวัณ กาญจนบุรี",R.drawable.mperawan));
        datas.add(new Data("อุทยานแห่งชาติพุเตย","อุทยานแห่งชาติพุเตย อำเภอด่านช้าง จังหวัดสุพรรณบุรี",R.drawable.mpputei));
       /* datas.add(new Data("","  ",R.drawable.mp));
        datas.add(new Data("","  ",R.drawable.mp));*/







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/เที่ยวเขาค้อ-เพชรบูรณ์/"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/น้ำตกเจ็ดสาวน้อย"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/ผากล้วยไม้-น้ำตกเหวสุวัต-เดินป่า/\n"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/หุบป่าตาด-อุทัยธานี/"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/วังภูไพร-ฟาร์มสเตย์-นครราชสีมา/"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view19660.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานแห่งชาติไทรโยค-กาญจนบุรี/"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานแห่งชาติตาดหมอก-เพชรบูรณ์/"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/Northeast/nakhonratchasima/kaoyai.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานแห่งชาติน้ำตกสามหลั่น-สระบุรี/"));
                    startActivity(browserIntent);
                }

                if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานแห่งชาติแก่งกระจาน-เพชรบุรี/"));
                    startActivity(browserIntent);
                } if(position==11){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานแห่งชาติเอราวัณ-กาญจนบุรี/"));
                    startActivity(browserIntent);
                }
                if(position==12){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ท่องทั่วไทย.com/อุทยานแห่งชาติพุเตย-สุพรรณบุรี/"));
                    startActivity(browserIntent);
                }


            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
