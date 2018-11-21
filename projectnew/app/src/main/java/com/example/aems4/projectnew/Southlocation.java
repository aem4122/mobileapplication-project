package com.example.aems4.projectnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Southlocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southlocation);
    }
    public void  openSouthshop(View v) {
        Intent itns = new Intent(this,Southshop.class);
        startActivity(itns);
    }
    public void  openSouthtemple(View v) {
        Intent itns = new Intent(this,Southtemple.class);
        startActivity(itns);
    }
    public void  openSouthmarket(View v) {
        Intent itns = new Intent(this,Southmarket.class);
        startActivity(itns);
    }
    public void  openSouthisland(View v) {
        Intent itns = new Intent(this,Southisland.class);
        startActivity(itns);
    }
    public void  openSouthother(View v) {
        Intent itns = new Intent(this,Southother.class);
        startActivity(itns);
    }
}
