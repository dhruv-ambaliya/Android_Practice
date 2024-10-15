package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class relativeLoginScreen extends AppCompatActivity {

    EditText edtEmail;
    EditText edtPassword;
    CheckBox checkBox;
    Button button;
    TextView txtEmail;
    TextView txtPass;
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_login_screen);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPass);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);
        txtEmail = findViewById(R.id.txtEmail);
        txtPass = findViewById(R.id.txtPassword);
        details = findViewById(R.id.textView2);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    edtPassword.setInputType(InputType.TYPE_CLASS_TEXT);
                } else {
                    edtPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                // To ensure the cursor is at the end of the text
                edtPassword.setSelection(edtPassword.length());
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtEmail.setText("Email: "+edtEmail.getText().toString());
                txtPass.setText("Password: "+edtPassword.getText().toString());
            }
        });
    }
}