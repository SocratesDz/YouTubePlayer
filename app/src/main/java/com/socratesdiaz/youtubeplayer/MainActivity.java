package com.socratesdiaz.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSingle;
    private Button btnStandalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingle = (Button) findViewById(R.id.btnPlaySingle);
        btnStandalone = (Button) findViewById(R.id.btnStandalone);
        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btnPlaySingle:
                intent = new Intent(MainActivity.this, YoutubeActivity.class);
                break;
            case R.id.btnStandalone:
                intent = new Intent(MainActivity.this, StandaloneActivity.class);
                break;
            default:
                break;
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}
