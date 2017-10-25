package com.cwddd.go;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        textView = (TextView) findViewById(R.id.textView);
        if (!TextUtils.isEmpty(getIntent().getStringExtra("joke"))) {
            textView.setText(getIntent().getStringExtra("joke"));
        }
    }
}
