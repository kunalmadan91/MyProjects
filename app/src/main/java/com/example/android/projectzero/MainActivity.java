package com.example.android.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOneClick(View view) {

        Toast.makeText(getApplicationContext(),"This Button will launch my Sporty Streamer app!",Toast.LENGTH_SHORT).show();

    }

    public void btnTwoClick(View view) {

        Toast.makeText(getApplicationContext(),"This Button will launch my Scores app!",Toast.LENGTH_SHORT).show();

    }

    public void btnThreeClick(View view) {

        Toast.makeText(getApplicationContext(),"This Button will launch my Library app!",Toast.LENGTH_SHORT).show();

    }

    public void btnFourClick(View view) {

        Toast.makeText(getApplicationContext(),"This Button will launch my BuidItBigger app!",Toast.LENGTH_SHORT).show();

    }

    public void btnFiveClick(View view) {

        Toast.makeText(getApplicationContext(),"This Button will launch my XYZ Reader app!",Toast.LENGTH_SHORT).show();

    }

    public void btnSixClick(View view) {

        Toast.makeText(getApplicationContext(),"This Button will launch my Capstone app!",Toast.LENGTH_SHORT).show();

    }

}
