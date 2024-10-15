package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;

import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Registering for Context Menu
        registerForContextMenu((TextView)findViewById(R.id.t1));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.i1) {
            Toast.makeText(this, "Cicked Main Menu", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.i2) {
            Toast.makeText(this, "I am sub-menu 1", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.i3) {
            Toast.makeText(this, "I am sub-menu 2", Toast.LENGTH_SHORT).show();
        }
        return true;
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.i1) {
            Toast.makeText(this, "Clicked Main menu", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.i2) {
            Toast.makeText(this, "I am sub-menu 1", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.i3) {
            Toast.makeText(this, "I am sub-menu 2", Toast.LENGTH_SHORT).show();
        }
        return true;

    }

    public void pop(View v){
        PopupMenu popup = new PopupMenu(this,v);
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_file,popup.getMenu());
        popup.show();

    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.i1) {
            Toast.makeText(this, "Clicked Main menu", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.i2) {
            Toast.makeText(this, "I am sub-menu 1", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.i3) {
            Toast.makeText(this, "I am sub-menu 2", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}