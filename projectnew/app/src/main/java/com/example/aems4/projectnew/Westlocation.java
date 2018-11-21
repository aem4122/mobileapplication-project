package com.example.aems4.projectnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Westlocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westlocation);
    }
    public void  openWesttemple(View v) {
        Intent itns = new Intent(this,Westtemple.class);
        startActivity(itns);
    }
    public void  openWestpark(View v) {
        Intent itns = new Intent(this,Westpark.class);
        startActivity(itns);
    }
    public void  openWestother(View v) {
        Intent itns = new Intent(this,Westother.class);
        startActivity(itns);
    }

}
