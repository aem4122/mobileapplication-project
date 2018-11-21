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

public class Southmarket extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("แทมมารีน มาร์เก็ต ","แทมมารีน มาร์เก็ต  จ.ประจวบคีรีขันธ์ ",R.drawable.smk1));
        datas.add(new Data("ตลาดนัดทินเลไนท์มาเก็ต ","ตลาดนัดทินเลไนท์มาเก็ต จ.ภูเก็ต ",R.drawable.smk2));
        datas.add(new Data("หลาดกู","หลาดกู จ.ภูเก็ต ",R.drawable.smk3));
        datas.add(new Data("ตลาดคนเดิน จ.ตรัง","ตลาดคนเดิน จ.ตรัง ",R.drawable.smk4));
        datas.add(new Data("ตลาดไอสไตล์ จ.สงขลา","ตลาดไอสไตล์ จ.สงขลา",R.drawable.smk5));
        datas.add(new Data("ตลาดนัดชิลล์วา","ตลาดนัดชิลล์วา จ.ภูเก็ต",R.drawable.smk6));
        datas.add(new Data("ตลาดนัดฟันฟรายเดย์ อเวนิว"," ตลาดนัดฟันฟรายเดย์ อเวนิว จ.ภูเก็ต ",R.drawable.smk7));




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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/21570"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/21549\n"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/21311\n"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/21306\n"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/21266"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/20947"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xn--22cap5dwcq3d9ac1l0f.com/archives/19896"));
                    startActivity(browserIntent);
                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
