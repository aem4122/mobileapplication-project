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

public class Northtemple extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("วัดพระธาตุหริภุญไชย ","วัดพระธาตุหริภุญไชย จ.ลำพูน ่",R.drawable.nt1));
        datas.add(new Data("วัดจามเทวี ","วัดจามเทวี จ.ลำพูน ",R.drawable.nt2));
        datas.add(new Data("วัดพระพุทธบาทห้วยต้ม","วัดพระพุทธบาทห้วยต้ม จ.ลำพูน",R.drawable.nt3));
        datas.add(new Data("วัดพระธาตุลำปางหลวง ","วัดพระธาตุลำปางหลวง จ.ลำปาง",R.drawable.nt4));
        datas.add(new Data("วัดพระแก้วดอนแต้วสุชาดาราม","วัดพระแก้วดอนแต้วสุชาดาราม จ.ลำปาง่",R.drawable.nt5));
        datas.add(new Data("วัดพระธาตุช่อแฮ","วัดพระธาตุช่อแฮ จ.แพร่ ",R.drawable.nt6));
        datas.add(new Data("วัดจอมสวรรค์ "," วัดจอมสวรรค์ จ.แพร่ ",R.drawable.nt7));
        datas.add(new Data("วัดพระธาตุแช่แห้ง","วัดพระธาตุแช่แห้ง จ.น่าน ",R.drawable.nt8));
        datas.add(new Data("วัดพระศรีรัตนมหาธาตุวรมหาวิหาร พิษณุโลก ","วัดพระศรีรัตนมหาธาตุวรมหาวิหาร พิษณุโลก ",R.drawable.nt9));
        datas.add(new Data("วัดพระธาตุเขาน้อย","วัดพระธาตุเขาน้อย จ.น่าน ",R.drawable.nt10));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view163547.html"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thamnaai.com/index.php?lay=show&ac=article&Id=538788699&Ntype=1"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://travel.kapook.com/view166344.html"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.kapook.com/view31763.html"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://review.tourismthailand.org/watphrakaewdontao/"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/north/phrae/pratadchohea.html"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chiangmainews.co.th/page/archives/560275"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/north/nan/watphrathatchaehaeng.html"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/province/north/phitsanulok/watphasrimahathat.html"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/76_province/north/nan/prathatkaonoi.html"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
