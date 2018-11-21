package com.example.aems4.projectnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }
    public void  openMid(View v) {
        Intent itns = new Intent(this,Midlocation.class);
        startActivity(itns);
    }
    public void  openNorth(View v) {
        Intent itns = new Intent(this,Northlocation.class);
        startActivity(itns);
    }
    public void  openSouth(View v) {
        Intent itns = new Intent(this,Southlocation.class);
        startActivity(itns);
    }
    public void  openWest(View v) {
        Intent itns = new Intent(this,Westlocation.class);
        startActivity(itns);
    }
}
