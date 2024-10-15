package com.nwa.practical4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        List<ModelClass> list = new ArrayList<>();

        list.add(new ModelClass("Ram","Rampara gam", R.drawable.user));
        list.add(new ModelClass("Vipendra","Bhavnagar", R.drawable.user));
        list.add(new ModelClass("Yash Chauhan","Surat", R.drawable.user));
        list.add(new ModelClass("Yash Rathod","Gariyadhar",  R.drawable.user));
        list.add(new ModelClass("Hardik","Bhavnagar",  R.drawable.user));
        list.add(new ModelClass("Karan","Ahmedabad",  R.drawable.user));
        list.add(new ModelClass("Sumit","Narigam",  R.drawable.user));
        list.add(new ModelClass("Shivang","Navsari",  R.drawable.user));
        list.add(new ModelClass("Vipul","Kodinar", R.drawable.user));
        list.add(new ModelClass("Tushar","Jesar",  R.drawable.user));

        CustomAdapter customAdapter = new CustomAdapter(list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customAdapter);
    }
}