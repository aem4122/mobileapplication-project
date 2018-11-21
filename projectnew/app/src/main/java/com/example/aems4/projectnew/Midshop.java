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

public class Midshop extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midshop);
        datas.add(new Data("Central world","central world จังหวัดกรุงเทพ",R.drawable.cworld));
        datas.add(new Data("Siam paragon","ัSiam paragon จังหวัดกรุงเทพ",R.drawable.paragon));
        datas.add(new Data("MBK","MBK Center จังหวัดกรุงเทพ",R.drawable.mbk));
        datas.add(new Data("Central bangna","central bangna จังหวัดกรุงเทพ",R.drawable.centralbangna));
        datas.add(new Data("Central Chidlom","ัCentral chidlom จังหวัดกรุงเทพ",R.drawable.centralchitrom));
        datas.add(new Data("Central Pharam2","Central pharam 2 จังหวัดกรุงเทพ",R.drawable.centralpharam2));
        datas.add(new Data("Central phinklao","central phinkao จังหวัดกรุงเทพ",R.drawable.centralpinklao));
      datas.add(new Data("Central saraya","ัCentral saraya จังหวัด นครปฐม",R.drawable.centralsaraya));
       datas.add(new Data("Central chaeng wattana","Central chaeng wattana จังหวัดกรุงเทพ",R.drawable.cwattana));
        datas.add(new Data("Central westgate","central westgate จังหวัดกรุงเทพ",R.drawable.cwg));
        //datas.add(new Data("The emporium","The emporium จังหวัด กรุงเทพ",R.drawable.emporium));
        datas.add(new Data("Future park","Future park จังหวัดกรุงเทพ",R.drawable.futureparkrungsit));
       datas.add(new Data("Mega bangna","Mega bangna จังหวัดกรุงเทพ",R.drawable.megabangna));
        datas.add(new Data("Platinum fashion mall","ัPlatinum fashion mall จังหวัดกรุงเทพ",R.drawable.plattinumfashionmall));
        datas.add(new Data("Seacon bangkae","Seacon bangkae จังหวัดกรุงเทพ",R.drawable.seaconbangkae));
        datas.add(new Data("Seaconsquare","Seaconsquare จังหวัดกรุงเทพ",R.drawable.seaconsquare));
        datas.add(new Data("Siam center","ัSiam center จังหวัดกรุงเทพ",R.drawable.siamcenter));
        datas.add(new Data("Silom complex","Silom complex จังหวัดกรุงเทพ",R.drawable.silomcomplex));
        datas.add(new Data("terminal21","terminal21 จังหวัดกรุงเทพ",R.drawable.terminal21));
        datas.add(new Data("the circle","ัthe circle จังหวัดกรุงเทพ",R.drawable.thecircle));
        datas.add(new Data("the pasio","the pasio จังหวัดกรุงเทพ",R.drawable.thepasio));



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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.painaidii.com/business/50816/siam-paragon-10400/lang/th/"));
                    startActivity(browserIntent);
                }
                if(position==1){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g293916-d549670-Reviews-CentralWorld-Bangkok.html"));
                    startActivity(browserIntent);
                }
                if(position==2){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pprincess.com/th/tourist-attractions/mbk-shopping-center"));
                    startActivity(browserIntent);
                }
                if(position==3){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.central.co.th/store/directory/central-bangna/index.aspx"));
                    startActivity(browserIntent);
                }
                if(position==4){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.tripadvisor.com/Attraction_Review-g293916-d456548-Reviews-Central_Chidlom-Bangkok.html"));
                    startActivity(browserIntent);
                }
                if(position==5){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.central.co.th/store/locations/central-rama2/index.aspx"));
                    startActivity(browserIntent);
                } if(position==6){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.com/Attraction_Review-g293916-d546030-Reviews-Central_Pinklao_Shopping_Complex-Bangkok.html"));
                    startActivity(browserIntent);
                }
                if(position==7){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.guchill.com/เปิดแล้ว-เซ็นทรัลศาลายา/"));
                    startActivity(browserIntent);
                }
                if(position==8){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.central.co.th/store/locations/central-chaegwattana/index.aspx"));
                    startActivity(browserIntent);
                } if(position==9){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://yusabuy.com/2015/09/01/รีวิว-central-plaza-westgate-เซ็นทรัล-เวสต์เ/"));
                    startActivity(browserIntent);
                }
                /*if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.wikipedia.org/wiki/เอ็มโพเรียม"));
                    startActivity(browserIntent);
                }*/
                if(position==10){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.wikipedia.org/wiki/ฟิวเจอร์พาร์ค_รังสิต"));
                    startActivity(browserIntent);
                } if(position==11){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bangkok.com/magazine/mega-bangna.htm"));
                    startActivity(browserIntent);
                }
                if(position==12){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.com/Attraction_Review-g293916-d1156821-Reviews-Platinum_Fashion_Mall-Bangkok.html"));
                    startActivity(browserIntent);
                }
                if(position==13){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://th.wikipedia.org/wiki/ซีคอนบางแค"));
                    startActivity(browserIntent);
                } if(position==14){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.seaconsquare.com"));
                    startActivity(browserIntent);
                }
                if(position==15){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bangkok.com/shopping-mall/siam-center.htm"));
                    startActivity(browserIntent);
                }
                if(position==16){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bangkok.com/magazine/silom-complex.htm"));
                    startActivity(browserIntent);
                } if(position==17){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bangkok.com/shopping-mall/terminal21.htm"));
                    startActivity(browserIntent);
                }
                if(position==18){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paiduaykan.com/travel/the-circle"));
                    startActivity(browserIntent);
                }
                if(position==19){
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.2madames.com/the-paseo-park-kanchanapisek-new-japanese-community-mall/"));
                    startActivity(browserIntent);
                }

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
