package com.example.practical7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    Button button;
    Button saveButton;
    EditText newText;

    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.txtTitle);
        button = findViewById(R.id.button);
        newText = findViewById(R.id.edtText);
        saveButton = findViewById(R.id.btnSave);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = newText.getText().toString();
                titleText.setText(s);

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveText();
            }
        });
        loadTextAgain();
    }

    public void saveText(){
        SharedPreferences sh = getSharedPreferences("Save Data",MODE_PRIVATE);
        SharedPreferences.Editor e = sh.edit();
        e.putString("text",s);
        e.apply();
        Toast.makeText(this, "Your data is saved!", Toast.LENGTH_SHORT).show();
    }

    public void loadTextAgain(){
        String text;
        SharedPreferences sh = getSharedPreferences("Save Data",MODE_PRIVATE);
        text = sh.getString("text","");
        titleText.setText(text);
    }
}