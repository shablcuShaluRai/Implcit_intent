package com.shablcu.shalu.intentimplicit;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);


        TextView label=(TextView)findViewById(R.id.cstm_textView1);

        Uri url=getIntent().getData();

        label.setText(url.toString());
    }
}
