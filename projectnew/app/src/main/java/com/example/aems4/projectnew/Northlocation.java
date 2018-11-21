package com.example.aems4.projectnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Northlocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northlocation);
    }
    public void  openNorthshop(View v) {
        Intent itns = new Intent(this,Northshop.class);
        startActivity(itns);
    }
    public void  openNorthpark(View v) {
        Intent itns = new Intent(this,Northpark.class);
        startActivity(itns);
    }
    public void  openNorthtemple(View v) {
        Intent itns = new Intent(this,Northtemple.class);
        startActivity(itns);
    }
    public void  openNorthwaterfall(View v) {
        Intent itns = new Intent(this,Northwaterfall.class);
        startActivity(itns);
    }
}
