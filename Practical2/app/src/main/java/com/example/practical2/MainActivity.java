package com.example.practical2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    EditText url;
    EditText num;
    Button openUrl;
    Button dial;
    Button second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openUrl = findViewById(R.id.btnUrl);
        dial = findViewById(R.id.btnDial);
        second = findViewById(R.id.btnSecond);

        url = findViewById(R.id.url);
        num = findViewById(R.id.num);
        title = findViewById(R.id.title);


        openUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url.getText().toString()));
                startActivity(intent);
            }
        });

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+num.getText().toString()));
                startActivity(intent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,123);
            }
        });

//        Intent intent = getIntent();
//        title.setText(intent.getStringExtra("title"));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 123){
            if(resultCode == Activity.RESULT_OK){
                String da = data.getStringExtra("title");
                title.setText(da);
            }

        }
    }

}