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

public class Southisland extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);

        datas.add(new Data("เกาะหลีเป๊ะ","เกาะหลีเป๊ะ จ.สตูล",R.drawable.si1));
        datas.add(new Data("เกาะนางยวน ","เกาะนางยวน จ.สุราษฎร์ธานี",R.drawable.si2));
        datas.add(new Data("อุทยานแห่งชาติหมู่เกาะสิมิลัน ","อุทยานแห่งชาติหมู่เกาะสิมิลัน จ.พังงา ",R.drawable.si3));
        datas.add(new Data("อุทยานแห่งชาติหมู่เกาะอ่างทอง","อุทยานแห่งชาติหมู่เกาะอ่างทอง จ.สุราษฎร์ธานี",R.drawable.si4));
        datas.add(new Data("หมู่เกาะพีพี","หมู่เกาะพีพี จ.กระบี่",R.drawable.si5));
        datas.add(new Data("เกาะไข่นอก","เกาะไข่นอก จ.พังงา",R.drawable.si6));
        datas.add(new Data("เกาะรอกลอย"," เกาะรอกลอย จ.สตูล ",R.drawable.si7));
        datas.add(new Data("เกาะสมุย ","เกาะสมุย จังหวัดสุราษฎร์ธานี",R.drawable.si8));
        datas.add(new Data("เกาะตาชัย"," เกาะตาชัย จ.พังงา ",R.drawable.si9));
        datas.add(new Data("เกาะกระดาน (อุทยานแห่งชาติหาดเจ้าไหม)","เกาะกระดาน (อุทยานแห่งชาติหาดเจ้าไหม) จ.ตรัง ",R.drawable.si10));
        datas.add(new Data("เกาะราชาใหญ่ ","เกาะราชาใหญ่ จ.ภูเก็ต",R.drawable.si11));
        datas.add(new Data("เกาะเฮ","เกาะเฮ จ.ภูเก็ต",R.drawable.si12));







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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.edtguide.com/travel/75892/koh-li-pe"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/75097/koh-nangyuan-amphoe-phangan\n"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/75653/mookoh-si-mi-lan-national-park"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/328430/mu-ko-ang-thong-national-park1"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/328309/phi-phi-islands1"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/75131/khai-nok-island"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/410545/koh-rokroy"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/327622/koh-samui1"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/75133/ta-chai-island-surin-island-nation-park"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/75839/koh-kradan-amphoe-kan-tang"));
                    startActivity(browserIntent);

                }
                if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/328521/koh-racha-yai-amphoe-thalang"));
                    startActivity(browserIntent);

                }if(position==11){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edtguide.com/travel/75117/hey-island"));
                    startActivity(browserIntent);

                }



            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
