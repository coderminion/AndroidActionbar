package com.coderminion.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_items);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_menuitems, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Toast.makeText(getApplicationContext(),"Import",Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        if (id == R.id.nav_gallery){
            Toast.makeText(getApplicationContext(),"Gallery",Toast.LENGTH_SHORT).show();
            return true;
        }

        else
        if (id == R.id.nav_slideshow){
            Toast.makeText(getApplicationContext(),"Slide Show",Toast.LENGTH_SHORT).show();
            return true;
        }
        else
        if (id == R.id.nav_manage){
            Toast.makeText(getApplicationContext(),"Tools",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
