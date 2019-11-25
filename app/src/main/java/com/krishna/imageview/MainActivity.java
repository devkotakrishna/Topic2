package com.krishna.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rdorose, rdotulip, rdojasmine;
    ImageView imgHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdojasmine = findViewById(R.id.rdojasmine);
        rdorose = findViewById(R.id.rdorose);
        rdotulip = findViewById(R.id.rdotulip);

        imgHero = findViewById(R.id.imgHero);

        rdotulip.setOnClickListener(this);
        rdorose.setOnClickListener(this);
        rdojasmine.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.rdorose:
                imgHero.setImageResource(R.drawable.rose);
                break;

            case R.id.rdotulip:
                imgHero.setImageResource(R.drawable.tulip);
                break;

            case R.id.rdojasmine:
                imgHero.setImageResource(R.drawable.jasmine);
                break;
        }
    }
}
