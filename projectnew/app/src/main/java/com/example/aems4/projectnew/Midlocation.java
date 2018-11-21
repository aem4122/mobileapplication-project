package com.example.aems4.projectnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Midlocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midlocation);
    }
    public void  openMidshop(View v) {
        Intent itns = new Intent(this,Midshop.class);
        startActivity(itns);
    }
    public void  openMidtemple(View v) {
        Intent itns = new Intent(this,Midtemple.class);
        startActivity(itns);
    }
    public void  openMidmarket(View v) {
        Intent itns = new Intent(this,Midmarket.class);
        startActivity(itns);
    }
    public void  openMidpark(View v) {
        Intent itns = new Intent(this,Midpark.class);
        startActivity(itns);
    }
    public void  openMidother(View v) {
        Intent itns = new Intent(this,Midother.class);
        startActivity(itns);
    }
}
