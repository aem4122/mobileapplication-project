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

public class Southtemple extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("วัดพระมหาธาตุ วรมหาวิหาร   ","วัดพระมหาธาตุ วรมหาวิหาร - จ.นครศรีธรรมราช  ",R.drawable.sm1));
        datas.add(new Data("วัดพระบรมธาตุไชยาราชวรวิหาร ","วัดพระบรมธาตุไชยาราชวรวิหาร จ.สุราษฎร์ธานี",R.drawable.sm2));
        datas.add(new Data("วัดราษฎร์บูรณะ (วัดช้างให้)","วัดราษฎร์บูรณะ (วัดช้างให้) จ.ปัตตานี",R.drawable.sm3));
        datas.add(new Data("วัดชลธาราสิงเห","วัดชลธาราสิงเห จ.นราธิวาส",R.drawable.sm4));
        datas.add(new Data("วัดมัชฌิมาวาส ","วัดมัชฌิมาวาส จ.สงขลา ",R.drawable.sm5));
        datas.add(new Data("สวนโมกขพลาราม ","สวนโมกขพลาราม จ.สุราษฎร์ธานี ",R.drawable.sm6));
        datas.add(new Data("เวัดถ้ำขวัญเมือง ","วัดถ้ำขวัญเมือง จ.ชุมพร ",R.drawable.sm7));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/watphramahathat.php"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/watphraboromthatchaiya.php"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/watchanghai.php"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/watchontharasinghe.php\n"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/watmatchimawas.php"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/suanmokkh.php\n"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dhammathai.org/watthai/south/watthamkwanmuang.php"));
                    startActivity(browserIntent);
                }

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
